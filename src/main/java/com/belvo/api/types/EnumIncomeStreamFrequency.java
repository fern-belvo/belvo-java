package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum EnumIncomeStreamFrequency {
  MONTHLY("MONTHLY"),

  FORTNIGHTLY("FORTNIGHTLY"),

  WEEKLY("WEEKLY"),

  IRREGULAR("IRREGULAR"),

  SINGLE("SINGLE");

  private final String value;

  EnumIncomeStreamFrequency(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
