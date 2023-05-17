package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum EnumIncomeVerificationAccountCategory {
  CHECKING_ACCOUNT("CHECKING_ACCOUNT"),

  SAVINGS_ACCOUNT("SAVINGS_ACCOUNT");

  private final String value;

  EnumIncomeVerificationAccountCategory(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
