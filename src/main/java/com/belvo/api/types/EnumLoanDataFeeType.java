package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum EnumLoanDataFeeType {
  OPERATION_FEE("OPERATION_FEE"),

  INSURANCE_FEE("INSURANCE_FEE"),

  OTHERS("OTHERS");

  private final String value;

  EnumLoanDataFeeType(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
