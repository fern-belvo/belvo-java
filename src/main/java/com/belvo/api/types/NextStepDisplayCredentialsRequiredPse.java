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
    builder = NextStepDisplayCredentialsRequiredPse.Builder.class
)
public final class NextStepDisplayCredentialsRequiredPse {
  private final Optional<NextStepDisplayCredentialsRequiredPseType> type;

  private final Optional<DisplayCredentialsRequiredContentPse> pseDisplayCredentialsRequired;

  private final Optional<Boolean> readyToConfirm;

  private int _cachedHashCode;

  NextStepDisplayCredentialsRequiredPse(Optional<NextStepDisplayCredentialsRequiredPseType> type,
      Optional<DisplayCredentialsRequiredContentPse> pseDisplayCredentialsRequired,
      Optional<Boolean> readyToConfirm) {
    this.type = type;
    this.pseDisplayCredentialsRequired = pseDisplayCredentialsRequired;
    this.readyToConfirm = readyToConfirm;
  }

  /**
   * @return The type of <code>next_step</code> you need to follow.
   */
  @JsonProperty("type")
  public Optional<NextStepDisplayCredentialsRequiredPseType> getType() {
    return type;
  }

  @JsonProperty("pse_display_credentials_required")
  public Optional<DisplayCredentialsRequiredContentPse> getPseDisplayCredentialsRequired() {
    return pseDisplayCredentialsRequired;
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
    return other instanceof NextStepDisplayCredentialsRequiredPse && equalTo((NextStepDisplayCredentialsRequiredPse) other);
  }

  private boolean equalTo(NextStepDisplayCredentialsRequiredPse other) {
    return type.equals(other.type) && pseDisplayCredentialsRequired.equals(other.pseDisplayCredentialsRequired) && readyToConfirm.equals(other.readyToConfirm);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.type, this.pseDisplayCredentialsRequired, this.readyToConfirm);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "NextStepDisplayCredentialsRequiredPse{" + "type: " + type + ", pseDisplayCredentialsRequired: " + pseDisplayCredentialsRequired + ", readyToConfirm: " + readyToConfirm + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<NextStepDisplayCredentialsRequiredPseType> type = Optional.empty();

    private Optional<DisplayCredentialsRequiredContentPse> pseDisplayCredentialsRequired = Optional.empty();

    private Optional<Boolean> readyToConfirm = Optional.empty();

    private Builder() {
    }

    public Builder from(NextStepDisplayCredentialsRequiredPse other) {
      type(other.getType());
      pseDisplayCredentialsRequired(other.getPseDisplayCredentialsRequired());
      readyToConfirm(other.getReadyToConfirm());
      return this;
    }

    @JsonSetter(
        value = "type",
        nulls = Nulls.SKIP
    )
    public Builder type(Optional<NextStepDisplayCredentialsRequiredPseType> type) {
      this.type = type;
      return this;
    }

    public Builder type(NextStepDisplayCredentialsRequiredPseType type) {
      this.type = Optional.of(type);
      return this;
    }

    @JsonSetter(
        value = "pse_display_credentials_required",
        nulls = Nulls.SKIP
    )
    public Builder pseDisplayCredentialsRequired(
        Optional<DisplayCredentialsRequiredContentPse> pseDisplayCredentialsRequired) {
      this.pseDisplayCredentialsRequired = pseDisplayCredentialsRequired;
      return this;
    }

    public Builder pseDisplayCredentialsRequired(
        DisplayCredentialsRequiredContentPse pseDisplayCredentialsRequired) {
      this.pseDisplayCredentialsRequired = Optional.of(pseDisplayCredentialsRequired);
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

    public NextStepDisplayCredentialsRequiredPse build() {
      return new NextStepDisplayCredentialsRequiredPse(type, pseDisplayCredentialsRequired, readyToConfirm);
    }
  }
}
