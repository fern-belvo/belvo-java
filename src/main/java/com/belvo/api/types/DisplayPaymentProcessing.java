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
    builder = DisplayPaymentProcessing.Builder.class
)
public final class DisplayPaymentProcessing {
  private final Optional<PaymentInstitution> payerInstitution;

  private int _cachedHashCode;

  DisplayPaymentProcessing(Optional<PaymentInstitution> payerInstitution) {
    this.payerInstitution = payerInstitution;
  }

  @JsonProperty("payer_institution")
  public Optional<PaymentInstitution> getPayerInstitution() {
    return payerInstitution;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof DisplayPaymentProcessing && equalTo((DisplayPaymentProcessing) other);
  }

  private boolean equalTo(DisplayPaymentProcessing other) {
    return payerInstitution.equals(other.payerInstitution);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.payerInstitution);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "DisplayPaymentProcessing{" + "payerInstitution: " + payerInstitution + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<PaymentInstitution> payerInstitution = Optional.empty();

    private Builder() {
    }

    public Builder from(DisplayPaymentProcessing other) {
      payerInstitution(other.getPayerInstitution());
      return this;
    }

    @JsonSetter(
        value = "payer_institution",
        nulls = Nulls.SKIP
    )
    public Builder payerInstitution(Optional<PaymentInstitution> payerInstitution) {
      this.payerInstitution = payerInstitution;
      return this;
    }

    public Builder payerInstitution(PaymentInstitution payerInstitution) {
      this.payerInstitution = Optional.of(payerInstitution);
      return this;
    }

    public DisplayPaymentProcessing build() {
      return new DisplayPaymentProcessing(payerInstitution);
    }
  }
}
