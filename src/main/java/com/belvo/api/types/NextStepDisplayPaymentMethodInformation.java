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
    builder = NextStepDisplayPaymentMethodInformation.Builder.class
)
public final class NextStepDisplayPaymentMethodInformation {
  private final Optional<NextStepDisplayPaymentMethodInformationType> type;

  private final Optional<DisplayPaymentMethodInformationContentOfpi> openFinanceDisplayPaymentMethodInformation;

  private final Optional<Boolean> readyToConfirm;

  private int _cachedHashCode;

  NextStepDisplayPaymentMethodInformation(
      Optional<NextStepDisplayPaymentMethodInformationType> type,
      Optional<DisplayPaymentMethodInformationContentOfpi> openFinanceDisplayPaymentMethodInformation,
      Optional<Boolean> readyToConfirm) {
    this.type = type;
    this.openFinanceDisplayPaymentMethodInformation = openFinanceDisplayPaymentMethodInformation;
    this.readyToConfirm = readyToConfirm;
  }

  /**
   * @return The type of <code>next_step</code> you need to follow.
   */
  @JsonProperty("type")
  public Optional<NextStepDisplayPaymentMethodInformationType> getType() {
    return type;
  }

  @JsonProperty("open_finance_display_payment_method_information")
  public Optional<DisplayPaymentMethodInformationContentOfpi> getOpenFinanceDisplayPaymentMethodInformation(
      ) {
    return openFinanceDisplayPaymentMethodInformation;
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
    return other instanceof NextStepDisplayPaymentMethodInformation && equalTo((NextStepDisplayPaymentMethodInformation) other);
  }

  private boolean equalTo(NextStepDisplayPaymentMethodInformation other) {
    return type.equals(other.type) && openFinanceDisplayPaymentMethodInformation.equals(other.openFinanceDisplayPaymentMethodInformation) && readyToConfirm.equals(other.readyToConfirm);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.type, this.openFinanceDisplayPaymentMethodInformation, this.readyToConfirm);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "NextStepDisplayPaymentMethodInformation{" + "type: " + type + ", openFinanceDisplayPaymentMethodInformation: " + openFinanceDisplayPaymentMethodInformation + ", readyToConfirm: " + readyToConfirm + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<NextStepDisplayPaymentMethodInformationType> type = Optional.empty();

    private Optional<DisplayPaymentMethodInformationContentOfpi> openFinanceDisplayPaymentMethodInformation = Optional.empty();

    private Optional<Boolean> readyToConfirm = Optional.empty();

    private Builder() {
    }

    public Builder from(NextStepDisplayPaymentMethodInformation other) {
      type(other.getType());
      openFinanceDisplayPaymentMethodInformation(other.getOpenFinanceDisplayPaymentMethodInformation());
      readyToConfirm(other.getReadyToConfirm());
      return this;
    }

    @JsonSetter(
        value = "type",
        nulls = Nulls.SKIP
    )
    public Builder type(Optional<NextStepDisplayPaymentMethodInformationType> type) {
      this.type = type;
      return this;
    }

    public Builder type(NextStepDisplayPaymentMethodInformationType type) {
      this.type = Optional.of(type);
      return this;
    }

    @JsonSetter(
        value = "open_finance_display_payment_method_information",
        nulls = Nulls.SKIP
    )
    public Builder openFinanceDisplayPaymentMethodInformation(
        Optional<DisplayPaymentMethodInformationContentOfpi> openFinanceDisplayPaymentMethodInformation) {
      this.openFinanceDisplayPaymentMethodInformation = openFinanceDisplayPaymentMethodInformation;
      return this;
    }

    public Builder openFinanceDisplayPaymentMethodInformation(
        DisplayPaymentMethodInformationContentOfpi openFinanceDisplayPaymentMethodInformation) {
      this.openFinanceDisplayPaymentMethodInformation = Optional.of(openFinanceDisplayPaymentMethodInformation);
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

    public NextStepDisplayPaymentMethodInformation build() {
      return new NextStepDisplayPaymentMethodInformation(type, openFinanceDisplayPaymentMethodInformation, readyToConfirm);
    }
  }
}
