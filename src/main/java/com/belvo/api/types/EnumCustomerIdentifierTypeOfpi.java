package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum EnumCustomerIdentifierTypeOfpi {
  CPF("CPF"),

  CNPJ("CNPJ");

  private final String value;

  EnumCustomerIdentifierTypeOfpi(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
