package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum EnumBankAccountPixAccountTypeOfpi {
  CHECKINGS("CHECKINGS"),

  SAVINGS("SAVINGS"),

  SALARY("SALARY");

  private final String value;

  EnumBankAccountPixAccountTypeOfpi(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
