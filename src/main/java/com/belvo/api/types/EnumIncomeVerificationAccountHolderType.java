package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum EnumIncomeVerificationAccountHolderType {
  INDIVIDUAL("INDIVIDUAL");

  private final String value;

  EnumIncomeVerificationAccountHolderType(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
