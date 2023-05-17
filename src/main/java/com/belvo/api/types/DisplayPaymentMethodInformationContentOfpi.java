package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = DisplayPaymentMethodInformationContentOfpi.Builder.class
)
public final class DisplayPaymentMethodInformationContentOfpi {
  private final Optional<List<PaymentInstitution>> institutions;

  private int _cachedHashCode;

  DisplayPaymentMethodInformationContentOfpi(Optional<List<PaymentInstitution>> institutions) {
    this.institutions = institutions;
  }

  /**
   * @return An array of institution objects.
   */
  @JsonProperty("institutions")
  public Optional<List<PaymentInstitution>> getInstitutions() {
    return institutions;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof DisplayPaymentMethodInformationContentOfpi && equalTo((DisplayPaymentMethodInformationContentOfpi) other);
  }

  private boolean equalTo(DisplayPaymentMethodInformationContentOfpi other) {
    return institutions.equals(other.institutions);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.institutions);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "DisplayPaymentMethodInformationContentOfpi{" + "institutions: " + institutions + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<List<PaymentInstitution>> institutions = Optional.empty();

    private Builder() {
    }

    public Builder from(DisplayPaymentMethodInformationContentOfpi other) {
      institutions(other.getInstitutions());
      return this;
    }

    @JsonSetter(
        value = "institutions",
        nulls = Nulls.SKIP
    )
    public Builder institutions(Optional<List<PaymentInstitution>> institutions) {
      this.institutions = institutions;
      return this;
    }

    public Builder institutions(List<PaymentInstitution> institutions) {
      this.institutions = Optional.of(institutions);
      return this;
    }

    public DisplayPaymentMethodInformationContentOfpi build() {
      return new DisplayPaymentMethodInformationContentOfpi(institutions);
    }
  }
}
