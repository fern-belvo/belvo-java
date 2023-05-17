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
    builder = ProvidersPse.Builder.class
)
public final class ProvidersPse {
  private final Optional<PaymentsWay> paymentsWay;

  private int _cachedHashCode;

  ProvidersPse(Optional<PaymentsWay> paymentsWay) {
    this.paymentsWay = paymentsWay;
  }

  @JsonProperty("payments_way")
  public Optional<PaymentsWay> getPaymentsWay() {
    return paymentsWay;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof ProvidersPse && equalTo((ProvidersPse) other);
  }

  private boolean equalTo(ProvidersPse other) {
    return paymentsWay.equals(other.paymentsWay);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.paymentsWay);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "ProvidersPse{" + "paymentsWay: " + paymentsWay + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<PaymentsWay> paymentsWay = Optional.empty();

    private Builder() {
    }

    public Builder from(ProvidersPse other) {
      paymentsWay(other.getPaymentsWay());
      return this;
    }

    @JsonSetter(
        value = "payments_way",
        nulls = Nulls.SKIP
    )
    public Builder paymentsWay(Optional<PaymentsWay> paymentsWay) {
      this.paymentsWay = paymentsWay;
      return this;
    }

    public Builder paymentsWay(PaymentsWay paymentsWay) {
      this.paymentsWay = Optional.of(paymentsWay);
      return this;
    }

    public ProvidersPse build() {
      return new ProvidersPse(paymentsWay);
    }
  }
}
