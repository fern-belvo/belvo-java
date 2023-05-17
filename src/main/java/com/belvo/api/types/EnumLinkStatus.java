package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum EnumLinkStatus {
  VALID("valid"),

  INVALID("invalid"),

  UNCONFIRMED("unconfirmed"),

  TOKEN_REQUIRED("token_required");

  private final String value;

  EnumLinkStatus(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
