package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

@JsonDeserialize(
    builder = PaymentIntentPaymentMethodDetailsIndividualOfpi.Builder.class
)
public final class PaymentIntentPaymentMethodDetailsIndividualOfpi {
  private final PaymentIntentPaymentMethodDetailsBodyIndividualOfpi openFinance;

  private int _cachedHashCode;

  PaymentIntentPaymentMethodDetailsIndividualOfpi(
      PaymentIntentPaymentMethodDetailsBodyIndividualOfpi openFinance) {
    this.openFinance = openFinance;
  }

  @JsonProperty("open_finance")
  public PaymentIntentPaymentMethodDetailsBodyIndividualOfpi getOpenFinance() {
    return openFinance;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof PaymentIntentPaymentMethodDetailsIndividualOfpi && equalTo((PaymentIntentPaymentMethodDetailsIndividualOfpi) other);
  }

  private boolean equalTo(PaymentIntentPaymentMethodDetailsIndividualOfpi other) {
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
    return "PaymentIntentPaymentMethodDetailsIndividualOfpi{" + "openFinance: " + openFinance + "}";
  }

  public static OpenFinanceStage builder() {
    return new Builder();
  }

  public interface OpenFinanceStage {
    _FinalStage openFinance(PaymentIntentPaymentMethodDetailsBodyIndividualOfpi openFinance);

    Builder from(PaymentIntentPaymentMethodDetailsIndividualOfpi other);
  }

  public interface _FinalStage {
    PaymentIntentPaymentMethodDetailsIndividualOfpi build();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements OpenFinanceStage, _FinalStage {
    private PaymentIntentPaymentMethodDetailsBodyIndividualOfpi openFinance;

    private Builder() {
    }

    @Override
    public Builder from(PaymentIntentPaymentMethodDetailsIndividualOfpi other) {
      openFinance(other.getOpenFinance());
      return this;
    }

    @Override
    @JsonSetter("open_finance")
    public _FinalStage openFinance(
        PaymentIntentPaymentMethodDetailsBodyIndividualOfpi openFinance) {
      this.openFinance = openFinance;
      return this;
    }

    @Override
    public PaymentIntentPaymentMethodDetailsIndividualOfpi build() {
      return new PaymentIntentPaymentMethodDetailsIndividualOfpi(openFinance);
    }
  }
}
