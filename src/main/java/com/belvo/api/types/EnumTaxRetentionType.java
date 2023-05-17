package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum EnumTaxRetentionType {
  OUTFLOW("OUTFLOW"),

  INFLOW("INFLOW");

  private final String value;

  EnumTaxRetentionType(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
