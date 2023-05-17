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
    builder = NextStepDisplayPaymentFailed.Builder.class
)
public final class NextStepDisplayPaymentFailed {
  private final Optional<NextStepDisplayPaymentFailedType> type;

  private final Optional<DisplayPaymentFailed> openFinanceDisplayPaymentFailed;

  private final Optional<Boolean> readyToConfirm;

  private int _cachedHashCode;

  NextStepDisplayPaymentFailed(Optional<NextStepDisplayPaymentFailedType> type,
      Optional<DisplayPaymentFailed> openFinanceDisplayPaymentFailed,
      Optional<Boolean> readyToConfirm) {
    this.type = type;
    this.openFinanceDisplayPaymentFailed = openFinanceDisplayPaymentFailed;
    this.readyToConfirm = readyToConfirm;
  }

  /**
   * @return The type of <code>next_step</code> you need to follow.
   */
  @JsonProperty("type")
  public Optional<NextStepDisplayPaymentFailedType> getType() {
    return type;
  }

  @JsonProperty("open_finance_display_payment_failed")
  public Optional<DisplayPaymentFailed> getOpenFinanceDisplayPaymentFailed() {
    return openFinanceDisplayPaymentFailed;
  }

  /**
   * @return Boolean that indicates whether the payment intent is ready to be confirmed.
   * <p><strong>Note:</strong> When set to <code>true</code>,you need to confirm the payment by making a PATCH request sending through <code>confirm: true</code>.</p>
   */
  @JsonProperty("ready_to_confirm")
  public Optional<Boolean> getReadyToConfirm() {
    return readyToConfirm;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof NextStepDisplayPaymentFailed && equalTo((NextStepDisplayPaymentFailed) other);
  }

  private boolean equalTo(NextStepDisplayPaymentFailed other) {
    return type.equals(other.type) && openFinanceDisplayPaymentFailed.equals(other.openFinanceDisplayPaymentFailed) && readyToConfirm.equals(other.readyToConfirm);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.type, this.openFinanceDisplayPaymentFailed, this.readyToConfirm);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "NextStepDisplayPaymentFailed{" + "type: " + type + ", openFinanceDisplayPaymentFailed: " + openFinanceDisplayPaymentFailed + ", readyToConfirm: " + readyToConfirm + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<NextStepDisplayPaymentFailedType> type = Optional.empty();

    private Optional<DisplayPaymentFailed> openFinanceDisplayPaymentFailed = Optional.empty();

    private Optional<Boolean> readyToConfirm = Optional.empty();

    private Builder() {
    }

    public Builder from(NextStepDisplayPaymentFailed other) {
      type(other.getType());
      openFinanceDisplayPaymentFailed(other.getOpenFinanceDisplayPaymentFailed());
      readyToConfirm(other.getReadyToConfirm());
      return this;
    }

    @JsonSetter(
        value = "type",
        nulls = Nulls.SKIP
    )
    public Builder type(Optional<NextStepDisplayPaymentFailedType> type) {
      this.type = type;
      return this;
    }

    public Builder type(NextStepDisplayPaymentFailedType type) {
      this.type = Optional.of(type);
      return this;
    }

    @JsonSetter(
        value = "open_finance_display_payment_failed",
        nulls = Nulls.SKIP
    )
    public Builder openFinanceDisplayPaymentFailed(
        Optional<DisplayPaymentFailed> openFinanceDisplayPaymentFailed) {
      this.openFinanceDisplayPaymentFailed = openFinanceDisplayPaymentFailed;
      return this;
    }

    public Builder openFinanceDisplayPaymentFailed(
        DisplayPaymentFailed openFinanceDisplayPaymentFailed) {
      this.openFinanceDisplayPaymentFailed = Optional.of(openFinanceDisplayPaymentFailed);
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

    public NextStepDisplayPaymentFailed build() {
      return new NextStepDisplayPaymentFailed(type, openFinanceDisplayPaymentFailed, readyToConfirm);
    }
  }
}
