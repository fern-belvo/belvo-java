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
    builder = NextStepDisplayTokenRequiredPse.Builder.class
)
public final class NextStepDisplayTokenRequiredPse {
  private final Optional<NextStepDisplayTokenRequiredPseType> type;

  private final Optional<DisplayTokenRequiredContentPse> pseDisplayTokenRequired;

  private final Optional<Boolean> readyToConfirm;

  private int _cachedHashCode;

  NextStepDisplayTokenRequiredPse(Optional<NextStepDisplayTokenRequiredPseType> type,
      Optional<DisplayTokenRequiredContentPse> pseDisplayTokenRequired,
      Optional<Boolean> readyToConfirm) {
    this.type = type;
    this.pseDisplayTokenRequired = pseDisplayTokenRequired;
    this.readyToConfirm = readyToConfirm;
  }

  /**
   * @return The type of <code>next_step</code> you need to follow.
   */
  @JsonProperty("type")
  public Optional<NextStepDisplayTokenRequiredPseType> getType() {
    return type;
  }

  @JsonProperty("pse_display_token_required")
  public Optional<DisplayTokenRequiredContentPse> getPseDisplayTokenRequired() {
    return pseDisplayTokenRequired;
  }

  /**
   * @return Boolean that indicates whether the payment intent is ready to be confirmed. This value will return:
   * <ul>
   * <li><code>false</code> when a customer wants to pay for the very first time. This is so because you still need to input information about your customer in the following steps to process a payment successfully.</li>
   * <li><code>true</code> when a customer wants to pay and this is not their first time. This is so because the payment intent has all the information needed about the customer to process a payment.</li>
   * </ul>
   * <p><strong>Note:</strong> When the value is <code>true</code>, you'll need to confirm the payment intent. You can do this by making a PATCH request sending through the parameter <code>confirm: true</code>.</p>
   */
  @JsonProperty("ready_to_confirm")
  public Optional<Boolean> getReadyToConfirm() {
    return readyToConfirm;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof NextStepDisplayTokenRequiredPse && equalTo((NextStepDisplayTokenRequiredPse) other);
  }

  private boolean equalTo(NextStepDisplayTokenRequiredPse other) {
    return type.equals(other.type) && pseDisplayTokenRequired.equals(other.pseDisplayTokenRequired) && readyToConfirm.equals(other.readyToConfirm);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.type, this.pseDisplayTokenRequired, this.readyToConfirm);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "NextStepDisplayTokenRequiredPse{" + "type: " + type + ", pseDisplayTokenRequired: " + pseDisplayTokenRequired + ", readyToConfirm: " + readyToConfirm + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<NextStepDisplayTokenRequiredPseType> type = Optional.empty();

    private Optional<DisplayTokenRequiredContentPse> pseDisplayTokenRequired = Optional.empty();

    private Optional<Boolean> readyToConfirm = Optional.empty();

    private Builder() {
    }

    public Builder from(NextStepDisplayTokenRequiredPse other) {
      type(other.getType());
      pseDisplayTokenRequired(other.getPseDisplayTokenRequired());
      readyToConfirm(other.getReadyToConfirm());
      return this;
    }

    @JsonSetter(
        value = "type",
        nulls = Nulls.SKIP
    )
    public Builder type(Optional<NextStepDisplayTokenRequiredPseType> type) {
      this.type = type;
      return this;
    }

    public Builder type(NextStepDisplayTokenRequiredPseType type) {
      this.type = Optional.of(type);
      return this;
    }

    @JsonSetter(
        value = "pse_display_token_required",
        nulls = Nulls.SKIP
    )
    public Builder pseDisplayTokenRequired(
        Optional<DisplayTokenRequiredContentPse> pseDisplayTokenRequired) {
      this.pseDisplayTokenRequired = pseDisplayTokenRequired;
      return this;
    }

    public Builder pseDisplayTokenRequired(DisplayTokenRequiredContentPse pseDisplayTokenRequired) {
      this.pseDisplayTokenRequired = Optional.of(pseDisplayTokenRequired);
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

    public NextStepDisplayTokenRequiredPse build() {
      return new NextStepDisplayTokenRequiredPse(type, pseDisplayTokenRequired, readyToConfirm);
    }
  }
}
