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
    builder = PaymentMethodDetailsOfpi.Builder.class
)
public final class PaymentMethodDetailsOfpi {
  private final PaymentLinksPaymentMethodDetailsBodyOfpi openFinance;

  private int _cachedHashCode;

  PaymentMethodDetailsOfpi(PaymentLinksPaymentMethodDetailsBodyOfpi openFinance) {
    this.openFinance = openFinance;
  }

  @JsonProperty("open_finance")
  public PaymentLinksPaymentMethodDetailsBodyOfpi getOpenFinance() {
    return openFinance;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof PaymentMethodDetailsOfpi && equalTo((PaymentMethodDetailsOfpi) other);
  }

  private boolean equalTo(PaymentMethodDetailsOfpi other) {
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
    return "PaymentMethodDetailsOfpi{" + "openFinance: " + openFinance + "}";
  }

  public static OpenFinanceStage builder() {
    return new Builder();
  }

  public interface OpenFinanceStage {
    _FinalStage openFinance(PaymentLinksPaymentMethodDetailsBodyOfpi openFinance);

    Builder from(PaymentMethodDetailsOfpi other);
  }

  public interface _FinalStage {
    PaymentMethodDetailsOfpi build();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements OpenFinanceStage, _FinalStage {
    private PaymentLinksPaymentMethodDetailsBodyOfpi openFinance;

    private Builder() {
    }

    @Override
    public Builder from(PaymentMethodDetailsOfpi other) {
      openFinance(other.getOpenFinance());
      return this;
    }

    @Override
    @JsonSetter("open_finance")
    public _FinalStage openFinance(PaymentLinksPaymentMethodDetailsBodyOfpi openFinance) {
      this.openFinance = openFinance;
      return this;
    }

    @Override
    public PaymentMethodDetailsOfpi build() {
      return new PaymentMethodDetailsOfpi(openFinance);
    }
  }
}
