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
    builder = ChargePaymentMethodDetailsPse.Builder.class
)
public final class ChargePaymentMethodDetailsPse {
  private final Optional<ChargePaymentMethodDetailsPseContent> pse;

  private int _cachedHashCode;

  ChargePaymentMethodDetailsPse(Optional<ChargePaymentMethodDetailsPseContent> pse) {
    this.pse = pse;
  }

  @JsonProperty("pse")
  public Optional<ChargePaymentMethodDetailsPseContent> getPse() {
    return pse;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof ChargePaymentMethodDetailsPse && equalTo((ChargePaymentMethodDetailsPse) other);
  }

  private boolean equalTo(ChargePaymentMethodDetailsPse other) {
    return pse.equals(other.pse);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.pse);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "ChargePaymentMethodDetailsPse{" + "pse: " + pse + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<ChargePaymentMethodDetailsPseContent> pse = Optional.empty();

    private Builder() {
    }

    public Builder from(ChargePaymentMethodDetailsPse other) {
      pse(other.getPse());
      return this;
    }

    @JsonSetter(
        value = "pse",
        nulls = Nulls.SKIP
    )
    public Builder pse(Optional<ChargePaymentMethodDetailsPseContent> pse) {
      this.pse = pse;
      return this;
    }

    public Builder pse(ChargePaymentMethodDetailsPseContent pse) {
      this.pse = Optional.of(pse);
      return this;
    }

    public ChargePaymentMethodDetailsPse build() {
      return new ChargePaymentMethodDetailsPse(pse);
    }
  }
}
