package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum EnumPaymentIntentHolderTypePse {
  INDIVIDUAL("INDIVIDUAL"),

  BUSINESS("BUSINESS");

  private final String value;

  EnumPaymentIntentHolderTypePse(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
