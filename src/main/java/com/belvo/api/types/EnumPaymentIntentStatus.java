package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum EnumPaymentIntentStatus {
  REQUIRES_PAYMENT_METHOD("REQUIRES_PAYMENT_METHOD"),

  REQUIRES_ACTION("REQUIRES_ACTION"),

  SUCCEEDED("SUCCEEDED"),

  PROCESSING("PROCESSING"),

  FAILED("FAILED");

  private final String value;

  EnumPaymentIntentStatus(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
