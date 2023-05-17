package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum EnumReceivableTransactionStatus {
  APPROVED("APPROVED"),

  CANCELLED("CANCELLED"),

  REVERTED("REVERTED"),

  UNCATEGORIZED("UNCATEGORIZED");

  private final String value;

  EnumReceivableTransactionStatus(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
