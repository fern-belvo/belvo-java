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
    builder = PaymentIntentsPaymentMethodDetailsPse.Builder.class
)
public final class PaymentIntentsPaymentMethodDetailsPse {
  private final PaymentIntentsPaymentMethodDetailsBodyPse pse;

  private int _cachedHashCode;

  PaymentIntentsPaymentMethodDetailsPse(PaymentIntentsPaymentMethodDetailsBodyPse pse) {
    this.pse = pse;
  }

  @JsonProperty("pse")
  public PaymentIntentsPaymentMethodDetailsBodyPse getPse() {
    return pse;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof PaymentIntentsPaymentMethodDetailsPse && equalTo((PaymentIntentsPaymentMethodDetailsPse) other);
  }

  private boolean equalTo(PaymentIntentsPaymentMethodDetailsPse other) {
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
    return "PaymentIntentsPaymentMethodDetailsPse{" + "pse: " + pse + "}";
  }

  public static PseStage builder() {
    return new Builder();
  }

  public interface PseStage {
    _FinalStage pse(PaymentIntentsPaymentMethodDetailsBodyPse pse);

    Builder from(PaymentIntentsPaymentMethodDetailsPse other);
  }

  public interface _FinalStage {
    PaymentIntentsPaymentMethodDetailsPse build();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements PseStage, _FinalStage {
    private PaymentIntentsPaymentMethodDetailsBodyPse pse;

    private Builder() {
    }

    @Override
    public Builder from(PaymentIntentsPaymentMethodDetailsPse other) {
      pse(other.getPse());
      return this;
    }

    @Override
    @JsonSetter("pse")
    public _FinalStage pse(PaymentIntentsPaymentMethodDetailsBodyPse pse) {
      this.pse = pse;
      return this;
    }

    @Override
    public PaymentIntentsPaymentMethodDetailsPse build() {
      return new PaymentIntentsPaymentMethodDetailsPse(pse);
    }
  }
}
