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
    builder = InvoiceWarningsSat.Builder.class
)
public final class InvoiceWarningsSat {
  private final Optional<String> code;

  private final Optional<String> message;

  private int _cachedHashCode;

  InvoiceWarningsSat(Optional<String> code, Optional<String> message) {
    this.code = code;
    this.message = message;
  }

  /**
   * @return The warning code.
   */
  @JsonProperty("code")
  public Optional<String> getCode() {
    return code;
  }

  /**
   * @return The description of the warning.
   */
  @JsonProperty("message")
  public Optional<String> getMessage() {
    return message;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof InvoiceWarningsSat && equalTo((InvoiceWarningsSat) other);
  }

  private boolean equalTo(InvoiceWarningsSat other) {
    return code.equals(other.code) && message.equals(other.message);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.code, this.message);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "InvoiceWarningsSat{" + "code: " + code + ", message: " + message + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> code = Optional.empty();

    private Optional<String> message = Optional.empty();

    private Builder() {
    }

    public Builder from(InvoiceWarningsSat other) {
      code(other.getCode());
      message(other.getMessage());
      return this;
    }

    @JsonSetter(
        value = "code",
        nulls = Nulls.SKIP
    )
    public Builder code(Optional<String> code) {
      this.code = code;
      return this;
    }

    public Builder code(String code) {
      this.code = Optional.of(code);
      return this;
    }

    @JsonSetter(
        value = "message",
        nulls = Nulls.SKIP
    )
    public Builder message(Optional<String> message) {
      this.message = message;
      return this;
    }

    public Builder message(String message) {
      this.message = Optional.of(message);
      return this;
    }

    public InvoiceWarningsSat build() {
      return new InvoiceWarningsSat(code, message);
    }
  }
}
