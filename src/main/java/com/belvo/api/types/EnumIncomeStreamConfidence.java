package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum EnumIncomeStreamConfidence {
  HIGH("HIGH"),

  MEDIUM("MEDIUM"),

  LOW("LOW");

  private final String value;

  EnumIncomeStreamConfidence(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
