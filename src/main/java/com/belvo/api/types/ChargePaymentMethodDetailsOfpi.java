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
    builder = ChargePaymentMethodDetailsOfpi.Builder.class
)
public final class ChargePaymentMethodDetailsOfpi {
  private final Optional<ChargePaymentMethodDetailsOfpiContent> openFinance;

  private int _cachedHashCode;

  ChargePaymentMethodDetailsOfpi(Optional<ChargePaymentMethodDetailsOfpiContent> openFinance) {
    this.openFinance = openFinance;
  }

  @JsonProperty("open_finance")
  public Optional<ChargePaymentMethodDetailsOfpiContent> getOpenFinance() {
    return openFinance;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof ChargePaymentMethodDetailsOfpi && equalTo((ChargePaymentMethodDetailsOfpi) other);
  }

  private boolean equalTo(ChargePaymentMethodDetailsOfpi other) {
    return openFinance.equals(other.openFinance);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.openFinance);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "ChargePaymentMethodDetailsOfpi{" + "openFinance: " + openFinance + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<ChargePaymentMethodDetailsOfpiContent> openFinance = Optional.empty();

    private Builder() {
    }

    public Builder from(ChargePaymentMethodDetailsOfpi other) {
      openFinance(other.getOpenFinance());
      return this;
    }

    @JsonSetter(
        value = "open_finance",
        nulls = Nulls.SKIP
    )
    public Builder openFinance(Optional<ChargePaymentMethodDetailsOfpiContent> openFinance) {
      this.openFinance = openFinance;
      return this;
    }

    public Builder openFinance(ChargePaymentMethodDetailsOfpiContent openFinance) {
      this.openFinance = Optional.of(openFinance);
      return this;
    }

    public ChargePaymentMethodDetailsOfpi build() {
      return new ChargePaymentMethodDetailsOfpi(openFinance);
    }
  }
}
