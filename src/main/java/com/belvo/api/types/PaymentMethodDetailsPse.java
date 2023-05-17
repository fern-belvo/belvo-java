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
    builder = PaymentMethodDetailsPse.Builder.class
)
public final class PaymentMethodDetailsPse {
  private final PaymentLinksPaymentMethodDetailsBodyPse pse;

  private int _cachedHashCode;

  PaymentMethodDetailsPse(PaymentLinksPaymentMethodDetailsBodyPse pse) {
    this.pse = pse;
  }

  @JsonProperty("pse")
  public PaymentLinksPaymentMethodDetailsBodyPse getPse() {
    return pse;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof PaymentMethodDetailsPse && equalTo((PaymentMethodDetailsPse) other);
  }

  private boolean equalTo(PaymentMethodDetailsPse other) {
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
    return "PaymentMethodDetailsPse{" + "pse: " + pse + "}";
  }

  public static PseStage builder() {
    return new Builder();
  }

  public interface PseStage {
    _FinalStage pse(PaymentLinksPaymentMethodDetailsBodyPse pse);

    Builder from(PaymentMethodDetailsPse other);
  }

  public interface _FinalStage {
    PaymentMethodDetailsPse build();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements PseStage, _FinalStage {
    private PaymentLinksPaymentMethodDetailsBodyPse pse;

    private Builder() {
    }

    @Override
    public Builder from(PaymentMethodDetailsPse other) {
      pse(other.getPse());
      return this;
    }

    @Override
    @JsonSetter("pse")
    public _FinalStage pse(PaymentLinksPaymentMethodDetailsBodyPse pse) {
      this.pse = pse;
      return this;
    }

    @Override
    public PaymentMethodDetailsPse build() {
      return new PaymentMethodDetailsPse(pse);
    }
  }
}
