package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = EmploymentRecordFile.Builder.class
)
public final class EmploymentRecordFile {
  private final Optional<String> type;

  private final Optional<String> value;

  private int _cachedHashCode;

  EmploymentRecordFile(Optional<String> type, Optional<String> value) {
    this.type = type;
    this.value = value;
  }

  /**
   * @return The title of the document.
   */
  @JsonProperty("type")
  public Optional<String> getType() {
    return type;
  }

  /**
   * @return The PDF binary of the file (as a string).
   */
  @JsonProperty("value")
  public Optional<String> getValue() {
    return value;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof EmploymentRecordFile && equalTo((EmploymentRecordFile) other);
  }

  private boolean equalTo(EmploymentRecordFile other) {
    return type.equals(other.type) && value.equals(other.value);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.type, this.value);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "EmploymentRecordFile{" + "type: " + type + ", value: " + value + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> type = Optional.empty();

    private Optional<String> value = Optional.empty();

    private Builder() {
    }

    public Builder from(EmploymentRecordFile other) {
      type(other.getType());
      value(other.getValue());
      return this;
    }

    @JsonSetter(
        value = "type",
        nulls = Nulls.SKIP
    )
    public Builder type(Optional<String> type) {
      this.type = type;
      return this;
    }

    public Builder type(String type) {
      this.type = Optional.of(type);
      return this;
    }

    @JsonSetter(
        value = "value",
        nulls = Nulls.SKIP
    )
    public Builder value(Optional<String> value) {
      this.value = value;
      return this;
    }

    public Builder value(String value) {
      this.value = Optional.of(value);
      return this;
    }

    public EmploymentRecordFile build() {
      return new EmploymentRecordFile(type, value);
    }
  }
}
