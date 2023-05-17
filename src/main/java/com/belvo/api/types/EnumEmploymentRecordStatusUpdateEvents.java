package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum EnumEmploymentRecordStatusUpdateEvents {
  DISMISSED_RESIGNED("DISMISSED_RESIGNED"),

  SALARY_MODIFICATION("SALARY_MODIFICATION"),

  HIRED("HIRED"),

  VOLUNTARY_CONTRIBUTION("VOLUNTARY_CONTRIBUTION"),

  ABSENCE("ABSENCE"),

  SICK_LEAVE("SICK_LEAVE");

  private final String value;

  EnumEmploymentRecordStatusUpdateEvents(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
