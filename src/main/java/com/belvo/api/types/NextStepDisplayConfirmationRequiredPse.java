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
    builder = NextStepDisplayConfirmationRequiredPse.Builder.class
)
public final class NextStepDisplayConfirmationRequiredPse {
  private final Optional<NextStepDisplayConfirmationRequiredPseType> type;

  private final Optional<DisplayConfirmationRequiredContentPse> pseDisplayConfirmationRequired;

  private final Optional<Boolean> readyToConfirm;

  private int _cachedHashCode;

  NextStepDisplayConfirmationRequiredPse(Optional<NextStepDisplayConfirmationRequiredPseType> type,
      Optional<DisplayConfirmationRequiredContentPse> pseDisplayConfirmationRequired,
      Optional<Boolean> readyToConfirm) {
    this.type = type;
    this.pseDisplayConfirmationRequired = pseDisplayConfirmationRequired;
    this.readyToConfirm = readyToConfirm;
  }

  /**
   * @return The type of <code>next_step</code> you need to follow.
   */
  @JsonProperty("type")
  public Optional<NextStepDisplayConfirmationRequiredPseType> getType() {
    return type;
  }

  @JsonProperty("pse_display_confirmation_required")
  public Optional<DisplayConfirmationRequiredContentPse> getPseDisplayConfirmationRequired() {
    return pseDisplayConfirmationRequired;
  }

  /**
   * @return Boolean that indicates whether the payment intent is ready to be confirmed.
   * <p><strong>Note:</strong> When the value is <code>true</code>, you'll need to make a PATCH request sending through <code>confirm: true</code> to confirm the payment.</p>
   */
  @JsonProperty("ready_to_confirm")
  public Optional<Boolean> getReadyToConfirm() {
    return readyToConfirm;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof NextStepDisplayConfirmationRequiredPse && equalTo((NextStepDisplayConfirmationRequiredPse) other);
  }

  private boolean equalTo(NextStepDisplayConfirmationRequiredPse other) {
    return type.equals(other.type) && pseDisplayConfirmationRequired.equals(other.pseDisplayConfirmationRequired) && readyToConfirm.equals(other.readyToConfirm);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.type, this.pseDisplayConfirmationRequired, this.readyToConfirm);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "NextStepDisplayConfirmationRequiredPse{" + "type: " + type + ", pseDisplayConfirmationRequired: " + pseDisplayConfirmationRequired + ", readyToConfirm: " + readyToConfirm + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<NextStepDisplayConfirmationRequiredPseType> type = Optional.empty();

    private Optional<DisplayConfirmationRequiredContentPse> pseDisplayConfirmationRequired = Optional.empty();

    private Optional<Boolean> readyToConfirm = Optional.empty();

    private Builder() {
    }

    public Builder from(NextStepDisplayConfirmationRequiredPse other) {
      type(other.getType());
      pseDisplayConfirmationRequired(other.getPseDisplayConfirmationRequired());
      readyToConfirm(other.getReadyToConfirm());
      return this;
    }

    @JsonSetter(
        value = "type",
        nulls = Nulls.SKIP
    )
    public Builder type(Optional<NextStepDisplayConfirmationRequiredPseType> type) {
      this.type = type;
      return this;
    }

    public Builder type(NextStepDisplayConfirmationRequiredPseType type) {
      this.type = Optional.of(type);
      return this;
    }

    @JsonSetter(
        value = "pse_display_confirmation_required",
        nulls = Nulls.SKIP
    )
    public Builder pseDisplayConfirmationRequired(
        Optional<DisplayConfirmationRequiredContentPse> pseDisplayConfirmationRequired) {
      this.pseDisplayConfirmationRequired = pseDisplayConfirmationRequired;
      return this;
    }

    public Builder pseDisplayConfirmationRequired(
        DisplayConfirmationRequiredContentPse pseDisplayConfirmationRequired) {
      this.pseDisplayConfirmationRequired = Optional.of(pseDisplayConfirmationRequired);
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

    public NextStepDisplayConfirmationRequiredPse build() {
      return new NextStepDisplayConfirmationRequiredPse(type, pseDisplayConfirmationRequired, readyToConfirm);
    }
  }
}
