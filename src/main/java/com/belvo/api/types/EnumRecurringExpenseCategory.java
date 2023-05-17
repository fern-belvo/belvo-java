package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum EnumRecurringExpenseCategory {
  BILLS_UTILITIES("Bills & Utilities"),

  CREDITS_LOANS("Credits & Loans"),

  INSURANCE("Insurance"),

  ONLINE_PLATFORMS_LEISURE("Online Platforms & Leisure"),

  TRANSPORT_TRAVEL("Transport & Travel"),

  TAXES("Taxes");

  private final String value;

  EnumRecurringExpenseCategory(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
