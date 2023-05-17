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
    builder = NextStepDisplayPaymentSucceeded.Builder.class
)
public final class NextStepDisplayPaymentSucceeded {
  private final Optional<NextStepDisplayPaymentSucceededType> type;

  private final Optional<DisplayPaymentSucceeded> openFinanceDisplayPaymentSucceeded;

  private final Optional<Boolean> readyToConfirm;

  private int _cachedHashCode;

  NextStepDisplayPaymentSucceeded(Optional<NextStepDisplayPaymentSucceededType> type,
      Optional<DisplayPaymentSucceeded> openFinanceDisplayPaymentSucceeded,
      Optional<Boolean> readyToConfirm) {
    this.type = type;
    this.openFinanceDisplayPaymentSucceeded = openFinanceDisplayPaymentSucceeded;
    this.readyToConfirm = readyToConfirm;
  }

  /**
   * @return The type of <code>next_step</code> you need to follow.
   */
  @JsonProperty("type")
  public Optional<NextStepDisplayPaymentSucceededType> getType() {
    return type;
  }

  @JsonProperty("open_finance_display_payment_succeeded")
  public Optional<DisplayPaymentSucceeded> getOpenFinanceDisplayPaymentSucceeded() {
    return openFinanceDisplayPaymentSucceeded;
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
    return other instanceof NextStepDisplayPaymentSucceeded && equalTo((NextStepDisplayPaymentSucceeded) other);
  }

  private boolean equalTo(NextStepDisplayPaymentSucceeded other) {
    return type.equals(other.type) && openFinanceDisplayPaymentSucceeded.equals(other.openFinanceDisplayPaymentSucceeded) && readyToConfirm.equals(other.readyToConfirm);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.type, this.openFinanceDisplayPaymentSucceeded, this.readyToConfirm);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "NextStepDisplayPaymentSucceeded{" + "type: " + type + ", openFinanceDisplayPaymentSucceeded: " + openFinanceDisplayPaymentSucceeded + ", readyToConfirm: " + readyToConfirm + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<NextStepDisplayPaymentSucceededType> type = Optional.empty();

    private Optional<DisplayPaymentSucceeded> openFinanceDisplayPaymentSucceeded = Optional.empty();

    private Optional<Boolean> readyToConfirm = Optional.empty();

    private Builder() {
    }

    public Builder from(NextStepDisplayPaymentSucceeded other) {
      type(other.getType());
      openFinanceDisplayPaymentSucceeded(other.getOpenFinanceDisplayPaymentSucceeded());
      readyToConfirm(other.getReadyToConfirm());
      return this;
    }

    @JsonSetter(
        value = "type",
        nulls = Nulls.SKIP
    )
    public Builder type(Optional<NextStepDisplayPaymentSucceededType> type) {
      this.type = type;
      return this;
    }

    public Builder type(NextStepDisplayPaymentSucceededType type) {
      this.type = Optional.of(type);
      return this;
    }

    @JsonSetter(
        value = "open_finance_display_payment_succeeded",
        nulls = Nulls.SKIP
    )
    public Builder openFinanceDisplayPaymentSucceeded(
        Optional<DisplayPaymentSucceeded> openFinanceDisplayPaymentSucceeded) {
      this.openFinanceDisplayPaymentSucceeded = openFinanceDisplayPaymentSucceeded;
      return this;
    }

    public Builder openFinanceDisplayPaymentSucceeded(
        DisplayPaymentSucceeded openFinanceDisplayPaymentSucceeded) {
      this.openFinanceDisplayPaymentSucceeded = Optional.of(openFinanceDisplayPaymentSucceeded);
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

    public NextStepDisplayPaymentSucceeded build() {
      return new NextStepDisplayPaymentSucceeded(type, openFinanceDisplayPaymentSucceeded, readyToConfirm);
    }
  }
}
