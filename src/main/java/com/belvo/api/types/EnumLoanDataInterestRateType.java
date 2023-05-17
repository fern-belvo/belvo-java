package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum EnumLoanDataInterestRateType {
  MONTHLY("MONTHLY"),

  YEARLY("YEARLY");

  private final String value;

  EnumLoanDataInterestRateType(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
