package com.onkar.angelbroking.service;

import com.onkar.angelbroking.dto.MonthSpendingDto;
import com.onkar.angelbroking.dto.TransactionDetailsDto;
import com.onkar.angelbroking.dto.UserDto;
import com.onkar.angelbroking.entity.Transaction;
import com.onkar.angelbroking.entity.User;
import com.onkar.angelbroking.exception.RestApiException;
import com.onkar.angelbroking.helper.Enums.SpendType;
import com.onkar.angelbroking.repository.TransactionRepository;
import com.onkar.angelbroking.repository.UserRepository;

import java.math.BigDecimal;
import java.time.YearMonth;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

/**
 * Service which has business logic for Transaction related APIS
 * 
 * @author Onkar Saravade
 *
 */
@Service
public class TransactionService {

  private final UserRepository userRepository;
  private final TransactionRepository transactionRepository;

  public TransactionService(final UserRepository userRepository,
      final TransactionRepository transactionRepository) {
    this.userRepository = userRepository;
    this.transactionRepository = transactionRepository;
  }

  private UserDto buildUserDto(final User user) {
    final UserDto userDto = new UserDto();
    userDto.setUsername(user.getUsername());
    userDto.setCardType(user.getCard().getType());
    userDto.setLimit(user.getCard().getCreditLimit());
    return userDto;
  }

  public TransactionDetailsDto getTransactionDetails(final String username) {
    final User user = userRepository.findByUsername(username);
    if (user == null) {
      throw new RestApiException("User not found.", HttpStatus.BAD_REQUEST);
    }
    final ZonedDateTime fromDate =
        ZonedDateTime.now().withDayOfMonth(1).withHour(0).withMinute(0).withSecond(
            0).withNano(0).minusMonths(3);
    final List<Transaction> transactions =
        transactionRepository.findByUserAndCreatedGreaterThanEqual(user,
            fromDate);
    final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM");
    final Map<YearMonth, MonthSpendingDto> history = new HashMap<>();
    for (final Transaction transaction : transactions) {
      final ZonedDateTime created = transaction.getCreated();
      final YearMonth yearMonth = YearMonth.from(created);
      MonthSpendingDto monthSpendingDto = history.get(yearMonth);
      if (monthSpendingDto == null) {
        monthSpendingDto = new MonthSpendingDto();
        monthSpendingDto.setMonth(formatter.format(yearMonth));
        monthSpendingDto.setYear(yearMonth.getYear());
        monthSpendingDto.setTotalSpent(BigDecimal.ZERO);
        monthSpendingDto.setSpentOn(new HashMap<>());
        if (yearMonth.equals(YearMonth.now())) {
          monthSpendingDto.setCurrentMonth(true);
        }
      }
      BigDecimal totalSpent = monthSpendingDto.getTotalSpent();
      totalSpent = totalSpent.add(transaction.getAmount());
      monthSpendingDto.setTotalSpent(totalSpent);
      final Map<SpendType, BigDecimal> spentOn = monthSpendingDto.getSpentOn();
      BigDecimal amount = spentOn.get(transaction.getSpendType());
      if (amount == null) {
        amount = transaction.getAmount();
      } else {
        amount = amount.add(transaction.getAmount());
      }
      spentOn.put(transaction.getSpendType(), amount);
      monthSpendingDto.setSpentOn(spentOn);
      history.put(yearMonth, monthSpendingDto);
    }

    return new TransactionDetailsDto(buildUserDto(user),
        history.values().stream().collect(Collectors.toList()));

  }
}
