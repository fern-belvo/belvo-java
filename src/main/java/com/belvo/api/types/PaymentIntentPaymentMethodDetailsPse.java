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
    builder = PaymentIntentPaymentMethodDetailsPse.Builder.class
)
public final class PaymentIntentPaymentMethodDetailsPse {
  private final Optional<PaymentIntentPaymentMethodDetailsBodyPse> pse;

  private int _cachedHashCode;

  PaymentIntentPaymentMethodDetailsPse(Optional<PaymentIntentPaymentMethodDetailsBodyPse> pse) {
    this.pse = pse;
  }

  @JsonProperty("pse")
  public Optional<PaymentIntentPaymentMethodDetailsBodyPse> getPse() {
    return pse;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof PaymentIntentPaymentMethodDetailsPse && equalTo((PaymentIntentPaymentMethodDetailsPse) other);
  }

  private boolean equalTo(PaymentIntentPaymentMethodDetailsPse other) {
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
    return "PaymentIntentPaymentMethodDetailsPse{" + "pse: " + pse + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<PaymentIntentPaymentMethodDetailsBodyPse> pse = Optional.empty();

    private Builder() {
    }

    public Builder from(PaymentIntentPaymentMethodDetailsPse other) {
      pse(other.getPse());
      return this;
    }

    @JsonSetter(
        value = "pse",
        nulls = Nulls.SKIP
    )
    public Builder pse(Optional<PaymentIntentPaymentMethodDetailsBodyPse> pse) {
      this.pse = pse;
      return this;
    }

    public Builder pse(PaymentIntentPaymentMethodDetailsBodyPse pse) {
      this.pse = Optional.of(pse);
      return this;
    }

    public PaymentIntentPaymentMethodDetailsPse build() {
      return new PaymentIntentPaymentMethodDetailsPse(pse);
    }
  }
}
