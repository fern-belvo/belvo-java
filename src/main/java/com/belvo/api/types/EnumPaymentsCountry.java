package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum EnumPaymentsCountry {
  BRA("BRA"),

  COL("COL");

  private final String value;

  EnumPaymentsCountry(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
