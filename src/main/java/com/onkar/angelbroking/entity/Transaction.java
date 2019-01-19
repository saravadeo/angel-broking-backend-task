package com.onkar.angelbroking.entity;

import com.onkar.angelbroking.helper.Enums.SpendType;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

/**
 * Entity to store users transaction, which transation for respective spending
 * type and amount
 * 
 * @author Onkar Saravade
 *
 */
@Entity
public class Transaction extends AbstractBaseEntity {

  private static final long serialVersionUID = 6964882304373317414L;

  private BigDecimal amount;

  @Enumerated(EnumType.STRING)
  private SpendType spendType;

  @ManyToOne
  private User user;

  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (!super.equals(obj))
      return false;
    if (getClass() != obj.getClass())
      return false;
    final Transaction other = (Transaction) obj;
    if (amount == null) {
      if (other.amount != null)
        return false;
    } else if (!amount.equals(other.amount))
      return false;
    if (spendType != other.spendType)
      return false;
    return true;
  }

  public BigDecimal getAmount() {
    return amount;
  }

  public SpendType getSpendType() {
    return spendType;
  }

  public User getUser() {
    return user;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((amount == null) ? 0 : amount.hashCode());
    result = prime * result + ((spendType == null) ? 0 : spendType.hashCode());
    return result;
  }

  public void setAmount(final BigDecimal amount) {
    this.amount = amount;
  }

  public void setSpendType(final SpendType spendType) {
    this.spendType = spendType;
  }

  public void setUser(final User user) {
    this.user = user;
  }

}
