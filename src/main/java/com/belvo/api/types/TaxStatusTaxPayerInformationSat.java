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
    builder = TaxStatusTaxPayerInformationSat.Builder.class
)
public final class TaxStatusTaxPayerInformationSat {
  private final Optional<String> rfc;

  private final Optional<String> curp;

  private final Optional<String> name;

  private final Optional<String> firstLastName;

  private final Optional<String> secondLastName;

  private final Optional<String> startOperationsDate;

  private final Optional<String> statusPadron;

  private final Optional<String> lastStatusChangeDate;

  private final Optional<String> commercialName;

  private final Optional<String> socialName;

  private final Optional<String> email;

  private final Optional<String> phone;

  private int _cachedHashCode;

  TaxStatusTaxPayerInformationSat(Optional<String> rfc, Optional<String> curp,
      Optional<String> name, Optional<String> firstLastName, Optional<String> secondLastName,
      Optional<String> startOperationsDate, Optional<String> statusPadron,
      Optional<String> lastStatusChangeDate, Optional<String> commercialName,
      Optional<String> socialName, Optional<String> email, Optional<String> phone) {
    this.rfc = rfc;
    this.curp = curp;
    this.name = name;
    this.firstLastName = firstLastName;
    this.secondLastName = secondLastName;
    this.startOperationsDate = startOperationsDate;
    this.statusPadron = statusPadron;
    this.lastStatusChangeDate = lastStatusChangeDate;
    this.commercialName = commercialName;
    this.socialName = socialName;
    this.email = email;
    this.phone = phone;
  }

  /**
   * @return The tax payers's identification number (For Mexico, this is the RFC).
   */
  @JsonProperty("rfc")
  public Optional<String> getRfc() {
    return rfc;
  }

  /**
   * @return The tax payers's <em>Clave Única de Registro de Población</em> (CURP) number.
   */
  @JsonProperty("curp")
  public Optional<String> getCurp() {
    return curp;
  }

  /**
   * @return The tax payers's first name.
   */
  @JsonProperty("name")
  public Optional<String> getName() {
    return name;
  }

  /**
   * @return The tax payers's first last name.
   */
  @JsonProperty("first_last_name")
  public Optional<String> getFirstLastName() {
    return firstLastName;
  }

  /**
   * @return The tax payers's second last name.
   */
  @JsonProperty("second_last_name")
  public Optional<String> getSecondLastName() {
    return secondLastName;
  }

  /**
   * @return Date when the tax payer commenced taxable commercial activities.
   */
  @JsonProperty("start_operations_date")
  public Optional<String> getStartOperationsDate() {
    return startOperationsDate;
  }

  /**
   * @return Status of the taxpayer in the Federal Register of Taxpayers (RFC). Can be <code>ACTIVO</code> or <code>INACTIVO</code>.
   */
  @JsonProperty("status_padron")
  public Optional<String> getStatusPadron() {
    return statusPadron;
  }

  /**
   * @return Date when <code>status_padron</code> was most recently updated.
   */
  @JsonProperty("last_status_change_date")
  public Optional<String> getLastStatusChangeDate() {
    return lastStatusChangeDate;
  }

  /**
   * @return The name of the business designated for consumers and the general public.
   * <p><strong>Note</strong>: Only applicable for businesses.</p>
   */
  @JsonProperty("commercial_name")
  public Optional<String> getCommercialName() {
    return commercialName;
  }

  /**
   * @return The unique and exclusive name within the national territory that companies receive for legal or administrative purposes.
   * <strong>Note</strong>: Only applicable for businesses.
   */
  @JsonProperty("social_name")
  public Optional<String> getSocialName() {
    return socialName;
  }

  /**
   * @return Contact email address for the tax payer.
   */
  @JsonProperty("email")
  public Optional<String> getEmail() {
    return email;
  }

  /**
   * @return Contact phone number for the tax payer.
   */
  @JsonProperty("phone")
  public Optional<String> getPhone() {
    return phone;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof TaxStatusTaxPayerInformationSat && equalTo((TaxStatusTaxPayerInformationSat) other);
  }

  private boolean equalTo(TaxStatusTaxPayerInformationSat other) {
    return rfc.equals(other.rfc) && curp.equals(other.curp) && name.equals(other.name) && firstLastName.equals(other.firstLastName) && secondLastName.equals(other.secondLastName) && startOperationsDate.equals(other.startOperationsDate) && statusPadron.equals(other.statusPadron) && lastStatusChangeDate.equals(other.lastStatusChangeDate) && commercialName.equals(other.commercialName) && socialName.equals(other.socialName) && email.equals(other.email) && phone.equals(other.phone);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.rfc, this.curp, this.name, this.firstLastName, this.secondLastName, this.startOperationsDate, this.statusPadron, this.lastStatusChangeDate, this.commercialName, this.socialName, this.email, this.phone);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "TaxStatusTaxPayerInformationSat{" + "rfc: " + rfc + ", curp: " + curp + ", name: " + name + ", firstLastName: " + firstLastName + ", secondLastName: " + secondLastName + ", startOperationsDate: " + startOperationsDate + ", statusPadron: " + statusPadron + ", lastStatusChangeDate: " + lastStatusChangeDate + ", commercialName: " + commercialName + ", socialName: " + socialName + ", email: " + email + ", phone: " + phone + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> rfc = Optional.empty();

    private Optional<String> curp = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Optional<String> firstLastName = Optional.empty();

    private Optional<String> secondLastName = Optional.empty();

    private Optional<String> startOperationsDate = Optional.empty();

    private Optional<String> statusPadron = Optional.empty();

    private Optional<String> lastStatusChangeDate = Optional.empty();

    private Optional<String> commercialName = Optional.empty();

    private Optional<String> socialName = Optional.empty();

    private Optional<String> email = Optional.empty();

    private Optional<String> phone = Optional.empty();

    private Builder() {
    }

    public Builder from(TaxStatusTaxPayerInformationSat other) {
      rfc(other.getRfc());
      curp(other.getCurp());
      name(other.getName());
      firstLastName(other.getFirstLastName());
      secondLastName(other.getSecondLastName());
      startOperationsDate(other.getStartOperationsDate());
      statusPadron(other.getStatusPadron());
      lastStatusChangeDate(other.getLastStatusChangeDate());
      commercialName(other.getCommercialName());
      socialName(other.getSocialName());
      email(other.getEmail());
      phone(other.getPhone());
      return this;
    }

    @JsonSetter(
        value = "rfc",
        nulls = Nulls.SKIP
    )
    public Builder rfc(Optional<String> rfc) {
      this.rfc = rfc;
      return this;
    }

    public Builder rfc(String rfc) {
      this.rfc = Optional.of(rfc);
      return this;
    }

    @JsonSetter(
        value = "curp",
        nulls = Nulls.SKIP
    )
    public Builder curp(Optional<String> curp) {
      this.curp = curp;
      return this;
    }

    public Builder curp(String curp) {
      this.curp = Optional.of(curp);
      return this;
    }

    @JsonSetter(
        value = "name",
        nulls = Nulls.SKIP
    )
    public Builder name(Optional<String> name) {
      this.name = name;
      return this;
    }

    public Builder name(String name) {
      this.name = Optional.of(name);
      return this;
    }

    @JsonSetter(
        value = "first_last_name",
        nulls = Nulls.SKIP
    )
    public Builder firstLastName(Optional<String> firstLastName) {
      this.firstLastName = firstLastName;
      return this;
    }

    public Builder firstLastName(String firstLastName) {
      this.firstLastName = Optional.of(firstLastName);
      return this;
    }

    @JsonSetter(
        value = "second_last_name",
        nulls = Nulls.SKIP
    )
    public Builder secondLastName(Optional<String> secondLastName) {
      this.secondLastName = secondLastName;
      return this;
    }

    public Builder secondLastName(String secondLastName) {
      this.secondLastName = Optional.of(secondLastName);
      return this;
    }

    @JsonSetter(
        value = "start_operations_date",
        nulls = Nulls.SKIP
    )
    public Builder startOperationsDate(Optional<String> startOperationsDate) {
      this.startOperationsDate = startOperationsDate;
      return this;
    }

    public Builder startOperationsDate(String startOperationsDate) {
      this.startOperationsDate = Optional.of(startOperationsDate);
      return this;
    }

    @JsonSetter(
        value = "status_padron",
        nulls = Nulls.SKIP
    )
    public Builder statusPadron(Optional<String> statusPadron) {
      this.statusPadron = statusPadron;
      return this;
    }

    public Builder statusPadron(String statusPadron) {
      this.statusPadron = Optional.of(statusPadron);
      return this;
    }

    @JsonSetter(
        value = "last_status_change_date",
        nulls = Nulls.SKIP
    )
    public Builder lastStatusChangeDate(Optional<String> lastStatusChangeDate) {
      this.lastStatusChangeDate = lastStatusChangeDate;
      return this;
    }

    public Builder lastStatusChangeDate(String lastStatusChangeDate) {
      this.lastStatusChangeDate = Optional.of(lastStatusChangeDate);
      return this;
    }

    @JsonSetter(
        value = "commercial_name",
        nulls = Nulls.SKIP
    )
    public Builder commercialName(Optional<String> commercialName) {
      this.commercialName = commercialName;
      return this;
    }

    public Builder commercialName(String commercialName) {
      this.commercialName = Optional.of(commercialName);
      return this;
    }

    @JsonSetter(
        value = "social_name",
        nulls = Nulls.SKIP
    )
    public Builder socialName(Optional<String> socialName) {
      this.socialName = socialName;
      return this;
    }

    public Builder socialName(String socialName) {
      this.socialName = Optional.of(socialName);
      return this;
    }

    @JsonSetter(
        value = "email",
        nulls = Nulls.SKIP
    )
    public Builder email(Optional<String> email) {
      this.email = email;
      return this;
    }

    public Builder email(String email) {
      this.email = Optional.of(email);
      return this;
    }

    @JsonSetter(
        value = "phone",
        nulls = Nulls.SKIP
    )
    public Builder phone(Optional<String> phone) {
      this.phone = phone;
      return this;
    }

    public Builder phone(String phone) {
      this.phone = Optional.of(phone);
      return this;
    }

    public TaxStatusTaxPayerInformationSat build() {
      return new TaxStatusTaxPayerInformationSat(rfc, curp, name, firstLastName, secondLastName, startOperationsDate, statusPadron, lastStatusChangeDate, commercialName, socialName, email, phone);
    }
  }
}
