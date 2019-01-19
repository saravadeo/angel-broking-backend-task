package com.onkar.angelbroking.entity;

import com.onkar.angelbroking.helper.Enums.CardType;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 * Entity which represent card, respective propeties of card like credit, debit,
 * limit on transction amount etc.
 * 
 * @author Onkar Saravade
 *
 */
@Entity
public class Card extends AbstractBaseEntity {

  private static final long serialVersionUID = -8349028442658467967L;

  @Enumerated(EnumType.STRING)
  private CardType type;

  private String bankName;

  private BigDecimal creditLimit;

  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (!super.equals(obj))
      return false;
    if (getClass() != obj.getClass())
      return false;
    final Card other = (Card) obj;
    if (bankName == null) {
      if (other.bankName != null)
        return false;
    } else if (!bankName.equals(other.bankName))
      return false;
    if (creditLimit == null) {
      if (other.creditLimit != null)
        return false;
    } else if (!creditLimit.equals(other.creditLimit))
      return false;
    if (type != other.type)
      return false;
    return true;
  }

  public String getBankName() {
    return bankName;
  }

  public BigDecimal getCreditLimit() {
    return creditLimit;
  }

  public CardType getType() {
    return type;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((bankName == null) ? 0 : bankName.hashCode());
    result =
        prime * result + ((creditLimit == null) ? 0 : creditLimit.hashCode());
    result = prime * result + ((type == null) ? 0 : type.hashCode());
    return result;
  }

  public void setBankName(final String bankName) {
    this.bankName = bankName;
  }

  public void setCreditLimit(final BigDecimal creditLimit) {
    this.creditLimit = creditLimit;
  }

  public void setType(final CardType type) {
    this.type = type;
  }

}
