package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = BankAccountInformationContentPse.Builder.class
)
public final class BankAccountInformationContentPse {
  private final Optional<String> payerInstitution;

  private int _cachedHashCode;

  BankAccountInformationContentPse(Optional<String> payerInstitution) {
    this.payerInstitution = payerInstitution;
  }

  /**
   * @return Belvo's unique identifier for the payer’s institution.
   */
  @JsonProperty("payer_institution")
  public Optional<String> getPayerInstitution() {
    return payerInstitution;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof BankAccountInformationContentPse && equalTo((BankAccountInformationContentPse) other);
  }

  private boolean equalTo(BankAccountInformationContentPse other) {
    return payerInstitution.equals(other.payerInstitution);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.payerInstitution);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "BankAccountInformationContentPse{" + "payerInstitution: " + payerInstitution + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> payerInstitution = Optional.empty();

    private Builder() {
    }

    public Builder from(BankAccountInformationContentPse other) {
      payerInstitution(other.getPayerInstitution());
      return this;
    }

    @JsonSetter(
        value = "payer_institution",
        nulls = Nulls.SKIP
    )
    public Builder payerInstitution(Optional<String> payerInstitution) {
      this.payerInstitution = payerInstitution;
      return this;
    }

    public Builder payerInstitution(String payerInstitution) {
      this.payerInstitution = Optional.of(payerInstitution);
      return this;
    }

    public BankAccountInformationContentPse build() {
      return new BankAccountInformationContentPse(payerInstitution);
    }
  }
}
