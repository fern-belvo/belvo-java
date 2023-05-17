package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum EnumCustomerIdentifierTypePse {
  CC("CC"),

  PP("PP"),

  CE("CE"),

  TI("TI"),

  NIT("NIT");

  private final String value;

  EnumCustomerIdentifierTypePse(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
