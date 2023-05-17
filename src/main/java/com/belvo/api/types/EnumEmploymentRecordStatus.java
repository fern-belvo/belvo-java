package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum EnumEmploymentRecordStatus {
  EMPLOYED("EMPLOYED"),

  UNEMPLOYED("UNEMPLOYED");

  private final String value;

  EnumEmploymentRecordStatus(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
