package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum ChargeStatus {
  PENDING("PENDING"),

  SUCCEEDED("SUCCEEDED"),

  FAILED("FAILED");

  private final String value;

  ChargeStatus(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
