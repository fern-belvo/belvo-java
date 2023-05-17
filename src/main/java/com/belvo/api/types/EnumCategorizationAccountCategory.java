package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum EnumCategorizationAccountCategory {
  CHECKING_ACCOUNT("CHECKING_ACCOUNT"),

  CREDIT_CARD("CREDIT_CARD"),

  LOAN_ACCOUNT("LOAN_ACCOUNT"),

  SAVINGS_ACCOUNT("SAVINGS_ACCOUNT");

  private final String value;

  EnumCategorizationAccountCategory(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
