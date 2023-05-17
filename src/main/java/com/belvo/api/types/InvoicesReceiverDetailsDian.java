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
    builder = InvoicesReceiverDetailsDian.Builder.class
)
public final class InvoicesReceiverDetailsDian {
  private final Optional<String> collectedAt;

  private final Optional<String> taxPayerType;

  private final Optional<String> regimen;

  private final Optional<String> taxScheme;

  private final Optional<String> country;

  private final Optional<String> address;

  private final Optional<String> phoneNumber;

  private final Optional<String> email;

  private int _cachedHashCode;

  InvoicesReceiverDetailsDian(Optional<String> collectedAt, Optional<String> taxPayerType,
      Optional<String> regimen, Optional<String> taxScheme, Optional<String> country,
      Optional<String> address, Optional<String> phoneNumber, Optional<String> email) {
    this.collectedAt = collectedAt;
    this.taxPayerType = taxPayerType;
    this.regimen = regimen;
    this.taxScheme = taxScheme;
    this.country = country;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.email = email;
  }

  /**
   * @return The ISO-8601 timestamp when the data point was collected.
   */
  @JsonProperty("collected_at")
  public Optional<String> getCollectedAt() {
    return collectedAt;
  }

  /**
   * @return Indicates if the receiver is a business or an individual. Can be either:
   * <ul>
   * <li><code>Persona Jurídica</code></li>
   * <li><code>Persona Natural</code></li>
   * </ul>
   */
  @JsonProperty("tax_payer_type")
  public Optional<String> getTaxPayerType() {
    return taxPayerType;
  }

  /**
   * @return The receiver's regimen type.
   * <p>For detailed information regarding DIAN's regimens, please see their <a href="https://www.dian.gov.co/impuestos/factura-electronica/Documents/Anexo_tecnico_factura_electronica_vr_1_7_2020.pdf">official PDF</a>.</p>
   */
  @JsonProperty("regimen")
  public Optional<String> getRegimen() {
    return regimen;
  }

  /**
   * @return The receiver's fiscal responsibilities.
   * <p>For detailed information regarding DIAN's tax schemes, please see their <a href="https://www.dian.gov.co/impuestos/factura-electronica/Documents/Anexo_tecnico_factura_electronica_vr_1_7_2020.pdf">official PDF</a>.</p>
   */
  @JsonProperty("tax_scheme")
  public Optional<String> getTaxScheme() {
    return taxScheme;
  }

  /**
   * @return The country where the receiver pays their taxes.
   */
  @JsonProperty("country")
  public Optional<String> getCountry() {
    return country;
  }

  /**
   * @return The receiver's address.
   */
  @JsonProperty("address")
  public Optional<String> getAddress() {
    return address;
  }

  /**
   * @return The receiver's phone number.
   */
  @JsonProperty("phone_number")
  public Optional<String> getPhoneNumber() {
    return phoneNumber;
  }

  /**
   * @return The receiver's email address.
   */
  @JsonProperty("email")
  public Optional<String> getEmail() {
    return email;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof InvoicesReceiverDetailsDian && equalTo((InvoicesReceiverDetailsDian) other);
  }

  private boolean equalTo(InvoicesReceiverDetailsDian other) {
    return collectedAt.equals(other.collectedAt) && taxPayerType.equals(other.taxPayerType) && regimen.equals(other.regimen) && taxScheme.equals(other.taxScheme) && country.equals(other.country) && address.equals(other.address) && phoneNumber.equals(other.phoneNumber) && email.equals(other.email);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.collectedAt, this.taxPayerType, this.regimen, this.taxScheme, this.country, this.address, this.phoneNumber, this.email);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "InvoicesReceiverDetailsDian{" + "collectedAt: " + collectedAt + ", taxPayerType: " + taxPayerType + ", regimen: " + regimen + ", taxScheme: " + taxScheme + ", country: " + country + ", address: " + address + ", phoneNumber: " + phoneNumber + ", email: " + email + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> collectedAt = Optional.empty();

    private Optional<String> taxPayerType = Optional.empty();

    private Optional<String> regimen = Optional.empty();

    private Optional<String> taxScheme = Optional.empty();

    private Optional<String> country = Optional.empty();

    private Optional<String> address = Optional.empty();

    private Optional<String> phoneNumber = Optional.empty();

    private Optional<String> email = Optional.empty();

    private Builder() {
    }

    public Builder from(InvoicesReceiverDetailsDian other) {
      collectedAt(other.getCollectedAt());
      taxPayerType(other.getTaxPayerType());
      regimen(other.getRegimen());
      taxScheme(other.getTaxScheme());
      country(other.getCountry());
      address(other.getAddress());
      phoneNumber(other.getPhoneNumber());
      email(other.getEmail());
      return this;
    }

    @JsonSetter(
        value = "collected_at",
        nulls = Nulls.SKIP
    )
    public Builder collectedAt(Optional<String> collectedAt) {
      this.collectedAt = collectedAt;
      return this;
    }

    public Builder collectedAt(String collectedAt) {
      this.collectedAt = Optional.of(collectedAt);
      return this;
    }

    @JsonSetter(
        value = "tax_payer_type",
        nulls = Nulls.SKIP
    )
    public Builder taxPayerType(Optional<String> taxPayerType) {
      this.taxPayerType = taxPayerType;
      return this;
    }

    public Builder taxPayerType(String taxPayerType) {
      this.taxPayerType = Optional.of(taxPayerType);
      return this;
    }

    @JsonSetter(
        value = "regimen",
        nulls = Nulls.SKIP
    )
    public Builder regimen(Optional<String> regimen) {
      this.regimen = regimen;
      return this;
    }

    public Builder regimen(String regimen) {
      this.regimen = Optional.of(regimen);
      return this;
    }

    @JsonSetter(
        value = "tax_scheme",
        nulls = Nulls.SKIP
    )
    public Builder taxScheme(Optional<String> taxScheme) {
      this.taxScheme = taxScheme;
      return this;
    }

    public Builder taxScheme(String taxScheme) {
      this.taxScheme = Optional.of(taxScheme);
      return this;
    }

    @JsonSetter(
        value = "country",
        nulls = Nulls.SKIP
    )
    public Builder country(Optional<String> country) {
      this.country = country;
      return this;
    }

    public Builder country(String country) {
      this.country = Optional.of(country);
      return this;
    }

    @JsonSetter(
        value = "address",
        nulls = Nulls.SKIP
    )
    public Builder address(Optional<String> address) {
      this.address = address;
      return this;
    }

    public Builder address(String address) {
      this.address = Optional.of(address);
      return this;
    }

    @JsonSetter(
        value = "phone_number",
        nulls = Nulls.SKIP
    )
    public Builder phoneNumber(Optional<String> phoneNumber) {
      this.phoneNumber = phoneNumber;
      return this;
    }

    public Builder phoneNumber(String phoneNumber) {
      this.phoneNumber = Optional.of(phoneNumber);
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

    public InvoicesReceiverDetailsDian build() {
      return new InvoicesReceiverDetailsDian(collectedAt, taxPayerType, regimen, taxScheme, country, address, phoneNumber, email);
    }
  }
}
