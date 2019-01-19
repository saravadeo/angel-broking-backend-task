package com.onkar.angelbroking.controller;

import com.onkar.angelbroking.dto.TransactionDetailsDto;
import com.onkar.angelbroking.exception.RestApiException;
import com.onkar.angelbroking.service.TransactionService;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * APIs defined for transaction related business operation
 * 
 * @author Onkar Saravade
 *
 */
@RestController
@RequestMapping("/transaction")
public class TransactionController {

  private final TransactionService transactionService;

  public TransactionController(final TransactionService transactionService) {
    this.transactionService = transactionService;
  }

  @GetMapping("/details")
  public TransactionDetailsDto getTransactionDetails(
      @RequestParam("username") final String username) {

    if (username == null) {
      throw new RestApiException("Username should not be null",
          HttpStatus.BAD_REQUEST);
    }
    return transactionService.getTransactionDetails(username);
  }

}
