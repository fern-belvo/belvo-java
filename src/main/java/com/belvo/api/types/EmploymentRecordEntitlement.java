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
    builder = EmploymentRecordEntitlement.Builder.class
)
public final class EmploymentRecordEntitlement {
  private final Optional<Boolean> entitledToHealthInsurance;

  private final Optional<Boolean> entitledToCompanyBenefits;

  private final Optional<String> validUntil;

  private final Optional<EnumEmploymentRecordStatus> status;

  private int _cachedHashCode;

  EmploymentRecordEntitlement(Optional<Boolean> entitledToHealthInsurance,
      Optional<Boolean> entitledToCompanyBenefits, Optional<String> validUntil,
      Optional<EnumEmploymentRecordStatus> status) {
    this.entitledToHealthInsurance = entitledToHealthInsurance;
    this.entitledToCompanyBenefits = entitledToCompanyBenefits;
    this.validUntil = validUntil;
    this.status = status;
  }

  /**
   * @return Indicated whether or not the individual is entitled to health insurance.
   */
  @JsonProperty("entitled_to_health_insurance")
  public Optional<Boolean> getEntitledToHealthInsurance() {
    return entitledToHealthInsurance;
  }

  /**
   * @return Indicates whether or not the individual is entitled to company benefits.
   */
  @JsonProperty("entitled_to_company_benefits")
  public Optional<Boolean> getEntitledToCompanyBenefits() {
    return entitledToCompanyBenefits;
  }

  /**
   * @return Date until when the individual is covered by health insurance and/or company benefits. If <code>null</code> the employee is currently working and no end date is required.
   */
  @JsonProperty("valid_until")
  public Optional<String> getValidUntil() {
    return validUntil;
  }

  @JsonProperty("status")
  public Optional<EnumEmploymentRecordStatus> getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof EmploymentRecordEntitlement && equalTo((EmploymentRecordEntitlement) other);
  }

  private boolean equalTo(EmploymentRecordEntitlement other) {
    return entitledToHealthInsurance.equals(other.entitledToHealthInsurance) && entitledToCompanyBenefits.equals(other.entitledToCompanyBenefits) && validUntil.equals(other.validUntil) && status.equals(other.status);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.entitledToHealthInsurance, this.entitledToCompanyBenefits, this.validUntil, this.status);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "EmploymentRecordEntitlement{" + "entitledToHealthInsurance: " + entitledToHealthInsurance + ", entitledToCompanyBenefits: " + entitledToCompanyBenefits + ", validUntil: " + validUntil + ", status: " + status + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<Boolean> entitledToHealthInsurance = Optional.empty();

    private Optional<Boolean> entitledToCompanyBenefits = Optional.empty();

    private Optional<String> validUntil = Optional.empty();

    private Optional<EnumEmploymentRecordStatus> status = Optional.empty();

    private Builder() {
    }

    public Builder from(EmploymentRecordEntitlement other) {
      entitledToHealthInsurance(other.getEntitledToHealthInsurance());
      entitledToCompanyBenefits(other.getEntitledToCompanyBenefits());
      validUntil(other.getValidUntil());
      status(other.getStatus());
      return this;
    }

    @JsonSetter(
        value = "entitled_to_health_insurance",
        nulls = Nulls.SKIP
    )
    public Builder entitledToHealthInsurance(Optional<Boolean> entitledToHealthInsurance) {
      this.entitledToHealthInsurance = entitledToHealthInsurance;
      return this;
    }

    public Builder entitledToHealthInsurance(Boolean entitledToHealthInsurance) {
      this.entitledToHealthInsurance = Optional.of(entitledToHealthInsurance);
      return this;
    }

    @JsonSetter(
        value = "entitled_to_company_benefits",
        nulls = Nulls.SKIP
    )
    public Builder entitledToCompanyBenefits(Optional<Boolean> entitledToCompanyBenefits) {
      this.entitledToCompanyBenefits = entitledToCompanyBenefits;
      return this;
    }

    public Builder entitledToCompanyBenefits(Boolean entitledToCompanyBenefits) {
      this.entitledToCompanyBenefits = Optional.of(entitledToCompanyBenefits);
      return this;
    }

    @JsonSetter(
        value = "valid_until",
        nulls = Nulls.SKIP
    )
    public Builder validUntil(Optional<String> validUntil) {
      this.validUntil = validUntil;
      return this;
    }

    public Builder validUntil(String validUntil) {
      this.validUntil = Optional.of(validUntil);
      return this;
    }

    @JsonSetter(
        value = "status",
        nulls = Nulls.SKIP
    )
    public Builder status(Optional<EnumEmploymentRecordStatus> status) {
      this.status = status;
      return this;
    }

    public Builder status(EnumEmploymentRecordStatus status) {
      this.status = Optional.of(status);
      return this;
    }

    public EmploymentRecordEntitlement build() {
      return new EmploymentRecordEntitlement(entitledToHealthInsurance, entitledToCompanyBenefits, validUntil, status);
    }
  }
}
