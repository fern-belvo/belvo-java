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
    builder = PaymentMethodInformationOfpi.Builder.class
)
public final class PaymentMethodInformationOfpi {
  private final Optional<PaymentMethodInformationBodyOfpi> openFinance;

  private int _cachedHashCode;

  PaymentMethodInformationOfpi(Optional<PaymentMethodInformationBodyOfpi> openFinance) {
    this.openFinance = openFinance;
  }

  @JsonProperty("open_finance")
  public Optional<PaymentMethodInformationBodyOfpi> getOpenFinance() {
    return openFinance;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof PaymentMethodInformationOfpi && equalTo((PaymentMethodInformationOfpi) other);
  }

  private boolean equalTo(PaymentMethodInformationOfpi other) {
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
    return "PaymentMethodInformationOfpi{" + "openFinance: " + openFinance + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<PaymentMethodInformationBodyOfpi> openFinance = Optional.empty();

    private Builder() {
    }

    public Builder from(PaymentMethodInformationOfpi other) {
      openFinance(other.getOpenFinance());
      return this;
    }

    @JsonSetter(
        value = "open_finance",
        nulls = Nulls.SKIP
    )
    public Builder openFinance(Optional<PaymentMethodInformationBodyOfpi> openFinance) {
      this.openFinance = openFinance;
      return this;
    }

    public Builder openFinance(PaymentMethodInformationBodyOfpi openFinance) {
      this.openFinance = Optional.of(openFinance);
      return this;
    }

    public PaymentMethodInformationOfpi build() {
      return new PaymentMethodInformationOfpi(openFinance);
    }
  }
}
