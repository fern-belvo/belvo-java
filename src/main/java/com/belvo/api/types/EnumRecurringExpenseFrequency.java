package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum EnumRecurringExpenseFrequency {
  MONTHLY("MONTHLY");

  private final String value;

  EnumRecurringExpenseFrequency(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
