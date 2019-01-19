package com.onkar.angelbroking.dto;

import com.onkar.angelbroking.helper.Enums.SpendType;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * Dto to show users monthly report
 * 
 * @author Onkar Saravade
 *
 */
public class MonthSpendingDto implements Serializable {

  private static final long serialVersionUID = 1350661983642321956L;

  private String month;

  private int year;

  private BigDecimal totalSpent;

  private Map<SpendType, BigDecimal> spentOn = new HashMap<>();

  private boolean isCurrentMonth;

  public String getMonth() {
    return month;
  }

  public Map<SpendType, BigDecimal> getSpentOn() {
    return spentOn;
  }

  public BigDecimal getTotalSpent() {
    return totalSpent;
  }

  public int getYear() {
    return year;
  }

  public boolean isCurrentMonth() {
    return isCurrentMonth;
  }

  public void setCurrentMonth(final boolean isCurrentMonth) {
    this.isCurrentMonth = isCurrentMonth;
  }

  public void setMonth(final String month) {
    this.month = month;
  }

  public void setSpentOn(final Map<SpendType, BigDecimal> spentOn) {
    this.spentOn = spentOn;
  }

  public void setTotalSpent(final BigDecimal totalSpent) {
    this.totalSpent = totalSpent;
  }

  public void setYear(final int year) {
    this.year = year;
  }
  
}
