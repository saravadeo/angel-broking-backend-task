package com.onkar.angelbroking.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Dto which represent users overall transction details, with last 3 months
 * history
 * 
 * @author Onkar Saravade
 *
 */
public class TransactionDetailsDto implements Serializable {

  private static final long serialVersionUID = 1L;

  private UserDto userDto;

  private List<MonthSpendingDto> history;

  public TransactionDetailsDto(final UserDto userDto,
      final List<MonthSpendingDto> history) {
    super();
    this.userDto = userDto;
    this.history = history;
  }

  public List<MonthSpendingDto> getHistory() {
    return history;
  }

  public UserDto getUserDto() {
    return userDto;
  }

  public void setHistory(final List<MonthSpendingDto> history) {
    this.history = history;
  }

  public void setUserDto(final UserDto userDto) {
    this.userDto = userDto;
  }

}
