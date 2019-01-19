package com.onkar.angelbroking.dto;

import com.onkar.angelbroking.helper.Enums.CardType;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 
 * Dto to represent users data
 * 
 * @author Onkar Saravade
 *
 */
public class UserDto implements Serializable {

  private static final long serialVersionUID = 6352283278289363880L;

  private String username;

  private CardType cardType;

  private BigDecimal limit;

  public CardType getCardType() {
    return cardType;
  }

  public BigDecimal getLimit() {
    return limit;
  }

  public String getUsername() {
    return username;
  }

  public void setCardType(final CardType cardType) {
    this.cardType = cardType;
  }

  public void setLimit(final BigDecimal limit) {
    this.limit = limit;
  }

  public void setUsername(final String username) {
    this.username = username;
  }

}
