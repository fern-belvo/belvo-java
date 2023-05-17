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
    builder = NextStepDisplayPaymentMethodInformationPse.Builder.class
)
public final class NextStepDisplayPaymentMethodInformationPse {
  private final Optional<NextStepDisplayPaymentMethodInformationPseType> type;

  private final Optional<DisplayPaymentMethodInformationContentPse> pseDisplayPaymentMethodInformation;

  private final Optional<Boolean> readyToConfirm;

  private int _cachedHashCode;

  NextStepDisplayPaymentMethodInformationPse(
      Optional<NextStepDisplayPaymentMethodInformationPseType> type,
      Optional<DisplayPaymentMethodInformationContentPse> pseDisplayPaymentMethodInformation,
      Optional<Boolean> readyToConfirm) {
    this.type = type;
    this.pseDisplayPaymentMethodInformation = pseDisplayPaymentMethodInformation;
    this.readyToConfirm = readyToConfirm;
  }

  /**
   * @return The type of <code>next_step</code> you need to follow.
   */
  @JsonProperty("type")
  public Optional<NextStepDisplayPaymentMethodInformationPseType> getType() {
    return type;
  }

  @JsonProperty("pse_display_payment_method_information")
  public Optional<DisplayPaymentMethodInformationContentPse> getPseDisplayPaymentMethodInformation(
      ) {
    return pseDisplayPaymentMethodInformation;
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
    return other instanceof NextStepDisplayPaymentMethodInformationPse && equalTo((NextStepDisplayPaymentMethodInformationPse) other);
  }

  private boolean equalTo(NextStepDisplayPaymentMethodInformationPse other) {
    return type.equals(other.type) && pseDisplayPaymentMethodInformation.equals(other.pseDisplayPaymentMethodInformation) && readyToConfirm.equals(other.readyToConfirm);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.type, this.pseDisplayPaymentMethodInformation, this.readyToConfirm);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "NextStepDisplayPaymentMethodInformationPse{" + "type: " + type + ", pseDisplayPaymentMethodInformation: " + pseDisplayPaymentMethodInformation + ", readyToConfirm: " + readyToConfirm + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<NextStepDisplayPaymentMethodInformationPseType> type = Optional.empty();

    private Optional<DisplayPaymentMethodInformationContentPse> pseDisplayPaymentMethodInformation = Optional.empty();

    private Optional<Boolean> readyToConfirm = Optional.empty();

    private Builder() {
    }

    public Builder from(NextStepDisplayPaymentMethodInformationPse other) {
      type(other.getType());
      pseDisplayPaymentMethodInformation(other.getPseDisplayPaymentMethodInformation());
      readyToConfirm(other.getReadyToConfirm());
      return this;
    }

    @JsonSetter(
        value = "type",
        nulls = Nulls.SKIP
    )
    public Builder type(Optional<NextStepDisplayPaymentMethodInformationPseType> type) {
      this.type = type;
      return this;
    }

    public Builder type(NextStepDisplayPaymentMethodInformationPseType type) {
      this.type = Optional.of(type);
      return this;
    }

    @JsonSetter(
        value = "pse_display_payment_method_information",
        nulls = Nulls.SKIP
    )
    public Builder pseDisplayPaymentMethodInformation(
        Optional<DisplayPaymentMethodInformationContentPse> pseDisplayPaymentMethodInformation) {
      this.pseDisplayPaymentMethodInformation = pseDisplayPaymentMethodInformation;
      return this;
    }

    public Builder pseDisplayPaymentMethodInformation(
        DisplayPaymentMethodInformationContentPse pseDisplayPaymentMethodInformation) {
      this.pseDisplayPaymentMethodInformation = Optional.of(pseDisplayPaymentMethodInformation);
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

    public NextStepDisplayPaymentMethodInformationPse build() {
      return new NextStepDisplayPaymentMethodInformationPse(type, pseDisplayPaymentMethodInformation, readyToConfirm);
    }
  }
}
