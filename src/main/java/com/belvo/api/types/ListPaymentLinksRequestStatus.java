package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum ListPaymentLinksRequestStatus {
  ACTIVE("ACTIVE"),

  INACTIVE("INACTIVE");

  private final String value;

  ListPaymentLinksRequestStatus(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
