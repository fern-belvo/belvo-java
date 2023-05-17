package com.belvo.api.types;

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
    builder = NextStepDisplayPaymentProcessing.Builder.class
)
public final class NextStepDisplayPaymentProcessing {
  private final Optional<NextStepDisplayPaymentProcessingType> type;

  private final Optional<DisplayPaymentProcessing> openFinanceDisplayPaymentProcessing;

  private final Optional<Boolean> readyToConfirm;

  private int _cachedHashCode;

  NextStepDisplayPaymentProcessing(Optional<NextStepDisplayPaymentProcessingType> type,
      Optional<DisplayPaymentProcessing> openFinanceDisplayPaymentProcessing,
      Optional<Boolean> readyToConfirm) {
    this.type = type;
    this.openFinanceDisplayPaymentProcessing = openFinanceDisplayPaymentProcessing;
    this.readyToConfirm = readyToConfirm;
  }

  /**
   * @return The type of <code>next_step</code> you need to follow.
   */
  @JsonProperty("type")
  public Optional<NextStepDisplayPaymentProcessingType> getType() {
    return type;
  }

  @JsonProperty("open_finance_display_payment_processing")
  public Optional<DisplayPaymentProcessing> getOpenFinanceDisplayPaymentProcessing() {
    return openFinanceDisplayPaymentProcessing;
  }

  /**
   * @return Boolean that indicates whether the payment intent is ready to be confirmed.
   * <p><strong>Note:</strong> When set to <code>true</code>, you need to confirm the payment by making a PATCH request sending through <code>confirm: true</code>.</p>
   */
  @JsonProperty("ready_to_confirm")
  public Optional<Boolean> getReadyToConfirm() {
    return readyToConfirm;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof NextStepDisplayPaymentProcessing && equalTo((NextStepDisplayPaymentProcessing) other);
  }

  private boolean equalTo(NextStepDisplayPaymentProcessing other) {
    return type.equals(other.type) && openFinanceDisplayPaymentProcessing.equals(other.openFinanceDisplayPaymentProcessing) && readyToConfirm.equals(other.readyToConfirm);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.type, this.openFinanceDisplayPaymentProcessing, this.readyToConfirm);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "NextStepDisplayPaymentProcessing{" + "type: " + type + ", openFinanceDisplayPaymentProcessing: " + openFinanceDisplayPaymentProcessing + ", readyToConfirm: " + readyToConfirm + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<NextStepDisplayPaymentProcessingType> type = Optional.empty();

    private Optional<DisplayPaymentProcessing> openFinanceDisplayPaymentProcessing = Optional.empty();

    private Optional<Boolean> readyToConfirm = Optional.empty();

    private Builder() {
    }

    public Builder from(NextStepDisplayPaymentProcessing other) {
      type(other.getType());
      openFinanceDisplayPaymentProcessing(other.getOpenFinanceDisplayPaymentProcessing());
      readyToConfirm(other.getReadyToConfirm());
      return this;
    }

    @JsonSetter(
        value = "type",
        nulls = Nulls.SKIP
    )
    public Builder type(Optional<NextStepDisplayPaymentProcessingType> type) {
      this.type = type;
      return this;
    }

    public Builder type(NextStepDisplayPaymentProcessingType type) {
      this.type = Optional.of(type);
      return this;
    }

    @JsonSetter(
        value = "open_finance_display_payment_processing",
        nulls = Nulls.SKIP
    )
    public Builder openFinanceDisplayPaymentProcessing(
        Optional<DisplayPaymentProcessing> openFinanceDisplayPaymentProcessing) {
      this.openFinanceDisplayPaymentProcessing = openFinanceDisplayPaymentProcessing;
      return this;
    }

    public Builder openFinanceDisplayPaymentProcessing(
        DisplayPaymentProcessing openFinanceDisplayPaymentProcessing) {
      this.openFinanceDisplayPaymentProcessing = Optional.of(openFinanceDisplayPaymentProcessing);
      return this;
    }

    @JsonSetter(
        value = "ready_to_confirm",
        nulls = Nulls.SKIP
    )
    public Builder readyToConfirm(Optional<Boolean> readyToConfirm) {
      this.readyToConfirm = readyToConfirm;
      return this;
    }

    public Builder readyToConfirm(Boolean readyToConfirm) {
      this.readyToConfirm = Optional.of(readyToConfirm);
      return this;
    }

    public NextStepDisplayPaymentProcessing build() {
      return new NextStepDisplayPaymentProcessing(type, openFinanceDisplayPaymentProcessing, readyToConfirm);
    }
  }
}
