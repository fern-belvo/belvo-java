package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum EnumInstitutionIntegrationType {
  CREDENTIALS("credentials"),

  OPENBANKING("openbanking");

  private final String value;

  EnumInstitutionIntegrationType(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
