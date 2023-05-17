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
    builder = CustomerPse.Builder.class
)
public final class CustomerPse {
  private final String id;

  private final String createdAt;

  private final String createdBy;

  private final EnumCustomerType customerType;

  private final String name;

  private final EnumPaymentsCountry country;

  private final String email;

  private final String identifier;

  private final EnumCustomerIdentifierTypePse identifierType;

  private final Optional<String> address;

  private final Optional<String> phone;

  private int _cachedHashCode;

  CustomerPse(String id, String createdAt, String createdBy, EnumCustomerType customerType,
      String name, EnumPaymentsCountry country, String email, String identifier,
      EnumCustomerIdentifierTypePse identifierType, Optional<String> address,
      Optional<String> phone) {
    this.id = id;
    this.createdAt = createdAt;
    this.createdBy = createdBy;
    this.customerType = customerType;
    this.name = name;
    this.country = country;
    this.email = email;
    this.identifier = identifier;
    this.identifierType = identifierType;
    this.address = address;
    this.phone = phone;
  }

  /**
   * @return Belvo's unique ID for the current customer.
   */
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * @return The ISO-8601 timestamp of when the data point was last updated in Belvo's database.
   */
  @JsonProperty("created_at")
  public String getCreatedAt() {
    return createdAt;
  }

  /**
   * @return Belvo's unique ID for the user that created the customer.
   */
  @JsonProperty("created_by")
  public String getCreatedBy() {
    return createdBy;
  }

  @JsonProperty("customer_type")
  public EnumCustomerType getCustomerType() {
    return customerType;
  }

  /**
   * @return The full name of the customer.
   */
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("country")
  public EnumPaymentsCountry getCountry() {
    return country;
  }

  /**
   * @return The customer's email address.
   */
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  /**
   * @return The document number of the customer's ID.
   */
  @JsonProperty("identifier")
  public String getIdentifier() {
    return identifier;
  }

  @JsonProperty("identifier_type")
  public EnumCustomerIdentifierTypePse getIdentifierType() {
    return identifierType;
  }

  /**
   * @return The customers physical address.
   * <p><strong>Note:</strong> Apart from the first two and last two characters, all the rest of the characters are masked.</p>
   */
  @JsonProperty("address")
  public Optional<String> getAddress() {
    return address;
  }

  /**
   * @return The customer's phone number.
   * <p><strong>Note:</strong> Apart from the first two and last two characters, all the rest of the characters are masked.</p>
   */
  @JsonProperty("phone")
  public Optional<String> getPhone() {
    return phone;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof CustomerPse && equalTo((CustomerPse) other);
  }

  private boolean equalTo(CustomerPse other) {
    return id.equals(other.id) && createdAt.equals(other.createdAt) && createdBy.equals(other.createdBy) && customerType.equals(other.customerType) && name.equals(other.name) && country.equals(other.country) && email.equals(other.email) && identifier.equals(other.identifier) && identifierType.equals(other.identifierType) && address.equals(other.address) && phone.equals(other.phone);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.id, this.createdAt, this.createdBy, this.customerType, this.name, this.country, this.email, this.identifier, this.identifierType, this.address, this.phone);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "CustomerPse{" + "id: " + id + ", createdAt: " + createdAt + ", createdBy: " + createdBy + ", customerType: " + customerType + ", name: " + name + ", country: " + country + ", email: " + email + ", identifier: " + identifier + ", identifierType: " + identifierType + ", address: " + address + ", phone: " + phone + "}";
  }

  public static IdStage builder() {
    return new Builder();
  }

  public interface IdStage {
    CreatedAtStage id(String id);

    Builder from(CustomerPse other);
  }

  public interface CreatedAtStage {
    CreatedByStage createdAt(String createdAt);
  }

  public interface CreatedByStage {
    CustomerTypeStage createdBy(String createdBy);
  }

  public interface CustomerTypeStage {
    NameStage customerType(EnumCustomerType customerType);
  }

  public interface NameStage {
    CountryStage name(String name);
  }

  public interface CountryStage {
    EmailStage country(EnumPaymentsCountry country);
  }

  public interface EmailStage {
    IdentifierStage email(String email);
  }

  public interface IdentifierStage {
    IdentifierTypeStage identifier(String identifier);
  }

  public interface IdentifierTypeStage {
    _FinalStage identifierType(EnumCustomerIdentifierTypePse identifierType);
  }

  public interface _FinalStage {
    CustomerPse build();

    _FinalStage address(Optional<String> address);

    _FinalStage address(String address);

    _FinalStage phone(Optional<String> phone);

    _FinalStage phone(String phone);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements IdStage, CreatedAtStage, CreatedByStage, CustomerTypeStage, NameStage, CountryStage, EmailStage, IdentifierStage, IdentifierTypeStage, _FinalStage {
    private String id;

    private String createdAt;

    private String createdBy;

    private EnumCustomerType customerType;

    private String name;

    private EnumPaymentsCountry country;

    private String email;

    private String identifier;

    private EnumCustomerIdentifierTypePse identifierType;

    private Optional<String> phone = Optional.empty();

    private Optional<String> address = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(CustomerPse other) {
      id(other.getId());
      createdAt(other.getCreatedAt());
      createdBy(other.getCreatedBy());
      customerType(other.getCustomerType());
      name(other.getName());
      country(other.getCountry());
      email(other.getEmail());
      identifier(other.getIdentifier());
      identifierType(other.getIdentifierType());
      address(other.getAddress());
      phone(other.getPhone());
      return this;
    }

    /**
     * <p>Belvo's unique ID for the current customer.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("id")
    public CreatedAtStage id(String id) {
      this.id = id;
      return this;
    }

    /**
     * <p>The ISO-8601 timestamp of when the data point was last updated in Belvo's database.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("created_at")
    public CreatedByStage createdAt(String createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * <p>Belvo's unique ID for the user that created the customer.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("created_by")
    public CustomerTypeStage createdBy(String createdBy) {
      this.createdBy = createdBy;
      return this;
    }

    @Override
    @JsonSetter("customer_type")
    public NameStage customerType(EnumCustomerType customerType) {
      this.customerType = customerType;
      return this;
    }

    /**
     * <p>The full name of the customer.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("name")
    public CountryStage name(String name) {
      this.name = name;
      return this;
    }

    @Override
    @JsonSetter("country")
    public EmailStage country(EnumPaymentsCountry country) {
      this.country = country;
      return this;
    }

    /**
     * <p>The customer's email address.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("email")
    public IdentifierStage email(String email) {
      this.email = email;
      return this;
    }

    /**
     * <p>The document number of the customer's ID.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("identifier")
    public IdentifierTypeStage identifier(String identifier) {
      this.identifier = identifier;
      return this;
    }

    @Override
    @JsonSetter("identifier_type")
    public _FinalStage identifierType(EnumCustomerIdentifierTypePse identifierType) {
      this.identifierType = identifierType;
      return this;
    }

    /**
     * <p>The customer's phone number.</p>
     * <p><strong>Note:</strong> Apart from the first two and last two characters, all the rest of the characters are masked.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage phone(String phone) {
      this.phone = Optional.of(phone);
      return this;
    }

    @Override
    @JsonSetter(
        value = "phone",
        nulls = Nulls.SKIP
    )
    public _FinalStage phone(Optional<String> phone) {
      this.phone = phone;
      return this;
    }

    /**
     * <p>The customers physical address.</p>
     * <p><strong>Note:</strong> Apart from the first two and last two characters, all the rest of the characters are masked.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage address(String address) {
      this.address = Optional.of(address);
      return this;
    }

    @Override
    @JsonSetter(
        value = "address",
        nulls = Nulls.SKIP
    )
    public _FinalStage address(Optional<String> address) {
      this.address = address;
      return this;
    }

    @Override
    public CustomerPse build() {
      return new CustomerPse(id, createdAt, createdBy, customerType, name, country, email, identifier, identifierType, address, phone);
    }
  }
}
