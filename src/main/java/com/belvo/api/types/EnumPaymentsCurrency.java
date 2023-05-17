package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum EnumPaymentsCurrency {
  BRL("BRL"),

  COP("COP");

  private final String value;

  EnumPaymentsCurrency(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
