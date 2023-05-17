package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum EnumPaymentLinkAllowedPaymentMethod {
  OPEN_FINANCE("open_finance"),

  PSE("pse");

  private final String value;

  EnumPaymentLinkAllowedPaymentMethod(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
