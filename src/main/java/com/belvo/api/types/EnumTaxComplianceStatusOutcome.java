package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum EnumTaxComplianceStatusOutcome {
  POSITIVE("POSITIVE"),

  NEGATIVE("NEGATIVE"),

  NO_OBLIGATIONS("NO_OBLIGATIONS");

  private final String value;

  EnumTaxComplianceStatusOutcome(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
