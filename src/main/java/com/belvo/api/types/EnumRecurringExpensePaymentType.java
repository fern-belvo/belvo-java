package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum EnumRecurringExpensePaymentType {
  SUBSCRIPTION("SUBSCRIPTION"),

  REGULAR("REGULAR");

  private final String value;

  EnumRecurringExpensePaymentType(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
