package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum EnumTaxRetentionPaymentStatus {
  PAID("PAID"),

  PROVISIONED("PROVISIONED");

  private final String value;

  EnumTaxRetentionPaymentStatus(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
