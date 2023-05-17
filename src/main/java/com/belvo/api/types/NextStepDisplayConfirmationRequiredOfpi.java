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
    builder = NextStepDisplayConfirmationRequiredOfpi.Builder.class
)
public final class NextStepDisplayConfirmationRequiredOfpi {
  private final Optional<NextStepDisplayConfirmationRequiredOfpiType> type;

  private final Optional<DisplayConfirmationRequiredOfpi> openFinanceDisplayConfirmationRequired;

  private final Optional<Boolean> readyToConfirm;

  private int _cachedHashCode;

  NextStepDisplayConfirmationRequiredOfpi(
      Optional<NextStepDisplayConfirmationRequiredOfpiType> type,
      Optional<DisplayConfirmationRequiredOfpi> openFinanceDisplayConfirmationRequired,
      Optional<Boolean> readyToConfirm) {
    this.type = type;
    this.openFinanceDisplayConfirmationRequired = openFinanceDisplayConfirmationRequired;
    this.readyToConfirm = readyToConfirm;
  }

  /**
   * @return The type of <code>next_step</code> you need to follow.
   */
  @JsonProperty("type")
  public Optional<NextStepDisplayConfirmationRequiredOfpiType> getType() {
    return type;
  }

  @JsonProperty("open_finance_display_confirmation_required")
  public Optional<DisplayConfirmationRequiredOfpi> getOpenFinanceDisplayConfirmationRequired() {
    return openFinanceDisplayConfirmationRequired;
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
    return other instanceof NextStepDisplayConfirmationRequiredOfpi && equalTo((NextStepDisplayConfirmationRequiredOfpi) other);
  }

  private boolean equalTo(NextStepDisplayConfirmationRequiredOfpi other) {
    return type.equals(other.type) && openFinanceDisplayConfirmationRequired.equals(other.openFinanceDisplayConfirmationRequired) && readyToConfirm.equals(other.readyToConfirm);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.type, this.openFinanceDisplayConfirmationRequired, this.readyToConfirm);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "NextStepDisplayConfirmationRequiredOfpi{" + "type: " + type + ", openFinanceDisplayConfirmationRequired: " + openFinanceDisplayConfirmationRequired + ", readyToConfirm: " + readyToConfirm + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<NextStepDisplayConfirmationRequiredOfpiType> type = Optional.empty();

    private Optional<DisplayConfirmationRequiredOfpi> openFinanceDisplayConfirmationRequired = Optional.empty();

    private Optional<Boolean> readyToConfirm = Optional.empty();

    private Builder() {
    }

    public Builder from(NextStepDisplayConfirmationRequiredOfpi other) {
      type(other.getType());
      openFinanceDisplayConfirmationRequired(other.getOpenFinanceDisplayConfirmationRequired());
      readyToConfirm(other.getReadyToConfirm());
      return this;
    }

    @JsonSetter(
        value = "type",
        nulls = Nulls.SKIP
    )
    public Builder type(Optional<NextStepDisplayConfirmationRequiredOfpiType> type) {
      this.type = type;
      return this;
    }

    public Builder type(NextStepDisplayConfirmationRequiredOfpiType type) {
      this.type = Optional.of(type);
      return this;
    }

    @JsonSetter(
        value = "open_finance_display_confirmation_required",
        nulls = Nulls.SKIP
    )
    public Builder openFinanceDisplayConfirmationRequired(
        Optional<DisplayConfirmationRequiredOfpi> openFinanceDisplayConfirmationRequired) {
      this.openFinanceDisplayConfirmationRequired = openFinanceDisplayConfirmationRequired;
      return this;
    }

    public Builder openFinanceDisplayConfirmationRequired(
        DisplayConfirmationRequiredOfpi openFinanceDisplayConfirmationRequired) {
      this.openFinanceDisplayConfirmationRequired = Optional.of(openFinanceDisplayConfirmationRequired);
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

    public NextStepDisplayConfirmationRequiredOfpi build() {
      return new NextStepDisplayConfirmationRequiredOfpi(type, openFinanceDisplayConfirmationRequired, readyToConfirm);
    }
  }
}
