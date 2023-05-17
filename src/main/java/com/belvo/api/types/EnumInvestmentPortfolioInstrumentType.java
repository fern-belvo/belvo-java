package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum EnumInvestmentPortfolioInstrumentType {
  BOND("BOND"),

  DEPOSIT("DEPOSIT"),

  ETF("ETF"),

  FUND("FUND"),

  OTHER("OTHER"),

  PENSION("PENSION"),

  STOCK("STOCK");

  private final String value;

  EnumInvestmentPortfolioInstrumentType(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
