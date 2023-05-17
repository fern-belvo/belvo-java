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
    builder = PaymentIntentPaymentMethodDetailsBusinessOfpi.Builder.class
)
public final class PaymentIntentPaymentMethodDetailsBusinessOfpi {
  private final PaymentIntentPaymentMethodDetailsBodyBusinessOfpi openFinance;

  private int _cachedHashCode;

  PaymentIntentPaymentMethodDetailsBusinessOfpi(
      PaymentIntentPaymentMethodDetailsBodyBusinessOfpi openFinance) {
    this.openFinance = openFinance;
  }

  @JsonProperty("open_finance")
  public PaymentIntentPaymentMethodDetailsBodyBusinessOfpi getOpenFinance() {
    return openFinance;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof PaymentIntentPaymentMethodDetailsBusinessOfpi && equalTo((PaymentIntentPaymentMethodDetailsBusinessOfpi) other);
  }

  private boolean equalTo(PaymentIntentPaymentMethodDetailsBusinessOfpi other) {
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
    return "PaymentIntentPaymentMethodDetailsBusinessOfpi{" + "openFinance: " + openFinance + "}";
  }

  public static OpenFinanceStage builder() {
    return new Builder();
  }

  public interface OpenFinanceStage {
    _FinalStage openFinance(PaymentIntentPaymentMethodDetailsBodyBusinessOfpi openFinance);

    Builder from(PaymentIntentPaymentMethodDetailsBusinessOfpi other);
  }

  public interface _FinalStage {
    PaymentIntentPaymentMethodDetailsBusinessOfpi build();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements OpenFinanceStage, _FinalStage {
    private PaymentIntentPaymentMethodDetailsBodyBusinessOfpi openFinance;

    private Builder() {
    }

    @Override
    public Builder from(PaymentIntentPaymentMethodDetailsBusinessOfpi other) {
      openFinance(other.getOpenFinance());
      return this;
    }

    @Override
    @JsonSetter("open_finance")
    public _FinalStage openFinance(PaymentIntentPaymentMethodDetailsBodyBusinessOfpi openFinance) {
      this.openFinance = openFinance;
      return this;
    }

    @Override
    public PaymentIntentPaymentMethodDetailsBusinessOfpi build() {
      return new PaymentIntentPaymentMethodDetailsBusinessOfpi(openFinance);
    }
  }
}
