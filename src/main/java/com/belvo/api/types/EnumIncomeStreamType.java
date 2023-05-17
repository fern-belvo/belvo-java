package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum EnumIncomeStreamType {
  SALARY("SALARY"),

  GOVERNMENT("GOVERNMENT"),

  INTEREST("INTEREST"),

  RENT("RENT"),

  RETIREMENT("RETIREMENT"),

  FREELANCE("FREELANCE"),

  ALTERNATIVE_INCOME("ALTERNATIVE_INCOME"),

  TRANSFER("TRANSFER"),

  DEPOSIT("DEPOSIT"),

  UNKNOWN("UNKNOWN");

  private final String value;

  EnumIncomeStreamType(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
