package com.belvo.api.resources.paymentintents.requests;

import com.belvo.api.types.PatchPaymentIntentsBodyPse;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = PatchPaymentIntentPse.Builder.class
)
public final class PatchPaymentIntentPse {
  private final PatchPaymentIntentsBodyPse paymentMethodDetails;

  private final Optional<Boolean> confirm;

  private int _cachedHashCode;

  PatchPaymentIntentPse(PatchPaymentIntentsBodyPse paymentMethodDetails,
      Optional<Boolean> confirm) {
    this.paymentMethodDetails = paymentMethodDetails;
    this.confirm = confirm;
  }

  @JsonProperty("payment_method_details")
  public PatchPaymentIntentsBodyPse getPaymentMethodDetails() {
    return paymentMethodDetails;
  }

  /**
   * @return Boolean that indicates whether this request confirms the payment intent.
   * <p><strong>Note:</strong> You'll need to send this parameter set to <code>true</code> when the payment intent next_step returns <code>ready_to_confirm: true</code>, meaning the payment intent is ready to be confirmed.</p>
   */
  @JsonProperty("confirm")
  public Optional<Boolean> getConfirm() {
    return confirm;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof PatchPaymentIntentPse && equalTo((PatchPaymentIntentPse) other);
  }

  private boolean equalTo(PatchPaymentIntentPse other) {
    return paymentMethodDetails.equals(other.paymentMethodDetails) && confirm.equals(other.confirm);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.paymentMethodDetails, this.confirm);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "PatchPaymentIntentPse{" + "paymentMethodDetails: " + paymentMethodDetails + ", confirm: " + confirm + "}";
  }

  public static PaymentMethodDetailsStage builder() {
    return new Builder();
  }

  public interface PaymentMethodDetailsStage {
    _FinalStage paymentMethodDetails(PatchPaymentIntentsBodyPse paymentMethodDetails);

    Builder from(PatchPaymentIntentPse other);
  }

  public interface _FinalStage {
    PatchPaymentIntentPse build();

    _FinalStage confirm(Optional<Boolean> confirm);

    _FinalStage confirm(Boolean confirm);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements PaymentMethodDetailsStage, _FinalStage {
    private PatchPaymentIntentsBodyPse paymentMethodDetails;

    private Optional<Boolean> confirm = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(PatchPaymentIntentPse other) {
      paymentMethodDetails(other.getPaymentMethodDetails());
      confirm(other.getConfirm());
      return this;
    }

    @Override
    @JsonSetter("payment_method_details")
    public _FinalStage paymentMethodDetails(PatchPaymentIntentsBodyPse paymentMethodDetails) {
      this.paymentMethodDetails = paymentMethodDetails;
      return this;
    }

    /**
     * <p>Boolean that indicates whether this request confirms the payment intent.</p>
     * <p><strong>Note:</strong> You'll need to send this parameter set to <code>true</code> when the payment intent next_step returns <code>ready_to_confirm: true</code>, meaning the payment intent is ready to be confirmed.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage confirm(Boolean confirm) {
      this.confirm = Optional.of(confirm);
      return this;
    }

    @Override
    @JsonSetter(
        value = "confirm",
        nulls = Nulls.SKIP
    )
    public _FinalStage confirm(Optional<Boolean> confirm) {
      this.confirm = confirm;
      return this;
    }

    @Override
    public PatchPaymentIntentPse build() {
      return new PatchPaymentIntentPse(paymentMethodDetails, confirm);
    }
  }
}
