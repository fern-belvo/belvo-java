package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum EnumCategorizationTransactionType {
  INFLOW("INFLOW"),

  OUTFLOW("OUTFLOW");

  private final String value;

  EnumCategorizationTransactionType(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
