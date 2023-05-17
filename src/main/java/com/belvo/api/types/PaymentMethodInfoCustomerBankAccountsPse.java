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
    builder = PaymentMethodInfoCustomerBankAccountsPse.Builder.class
)
public final class PaymentMethodInfoCustomerBankAccountsPse {
  private final Optional<String> id;

  private final Optional<String> customer;

  private final Optional<PaymentInstitution> institution;

  private final Optional<String> number;

  private final Optional<HolderBankAccountPse> holder;

  private final Optional<PaymentMethodInformationDetailsPse> details;

  private int _cachedHashCode;

  PaymentMethodInfoCustomerBankAccountsPse(Optional<String> id, Optional<String> customer,
      Optional<PaymentInstitution> institution, Optional<String> number,
      Optional<HolderBankAccountPse> holder, Optional<PaymentMethodInformationDetailsPse> details) {
    this.id = id;
    this.customer = customer;
    this.institution = institution;
    this.number = number;
    this.holder = holder;
    this.details = details;
  }

  /**
   * @return Belvo's unique ID used to identify the customer’s bank account.
   */
  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
  }

  /**
   * @return Belvo's unique ID for the current customer.
   */
  @JsonProperty("customer")
  public Optional<String> getCustomer() {
    return customer;
  }

  @JsonProperty("institution")
  public Optional<PaymentInstitution> getInstitution() {
    return institution;
  }

  /**
   * @return The customer's bank account number. This value is obfuscated.
   */
  @JsonProperty("number")
  public Optional<String> getNumber() {
    return number;
  }

  @JsonProperty("holder")
  public Optional<HolderBankAccountPse> getHolder() {
    return holder;
  }

  @JsonProperty("details")
  public Optional<PaymentMethodInformationDetailsPse> getDetails() {
    return details;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof PaymentMethodInfoCustomerBankAccountsPse && equalTo((PaymentMethodInfoCustomerBankAccountsPse) other);
  }

  private boolean equalTo(PaymentMethodInfoCustomerBankAccountsPse other) {
    return id.equals(other.id) && customer.equals(other.customer) && institution.equals(other.institution) && number.equals(other.number) && holder.equals(other.holder) && details.equals(other.details);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.id, this.customer, this.institution, this.number, this.holder, this.details);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "PaymentMethodInfoCustomerBankAccountsPse{" + "id: " + id + ", customer: " + customer + ", institution: " + institution + ", number: " + number + ", holder: " + holder + ", details: " + details + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> id = Optional.empty();

    private Optional<String> customer = Optional.empty();

    private Optional<PaymentInstitution> institution = Optional.empty();

    private Optional<String> number = Optional.empty();

    private Optional<HolderBankAccountPse> holder = Optional.empty();

    private Optional<PaymentMethodInformationDetailsPse> details = Optional.empty();

    private Builder() {
    }

    public Builder from(PaymentMethodInfoCustomerBankAccountsPse other) {
      id(other.getId());
      customer(other.getCustomer());
      institution(other.getInstitution());
      number(other.getNumber());
      holder(other.getHolder());
      details(other.getDetails());
      return this;
    }

    @JsonSetter(
        value = "id",
        nulls = Nulls.SKIP
    )
    public Builder id(Optional<String> id) {
      this.id = id;
      return this;
    }

    public Builder id(String id) {
      this.id = Optional.of(id);
      return this;
    }

    @JsonSetter(
        value = "customer",
        nulls = Nulls.SKIP
    )
    public Builder customer(Optional<String> customer) {
      this.customer = customer;
      return this;
    }

    public Builder customer(String customer) {
      this.customer = Optional.of(customer);
      return this;
    }

    @JsonSetter(
        value = "institution",
        nulls = Nulls.SKIP
    )
    public Builder institution(Optional<PaymentInstitution> institution) {
      this.institution = institution;
      return this;
    }

    public Builder institution(PaymentInstitution institution) {
      this.institution = Optional.of(institution);
      return this;
    }

    @JsonSetter(
        value = "number",
        nulls = Nulls.SKIP
    )
    public Builder number(Optional<String> number) {
      this.number = number;
      return this;
    }

    public Builder number(String number) {
      this.number = Optional.of(number);
      return this;
    }

    @JsonSetter(
        value = "holder",
        nulls = Nulls.SKIP
    )
    public Builder holder(Optional<HolderBankAccountPse> holder) {
      this.holder = holder;
      return this;
    }

    public Builder holder(HolderBankAccountPse holder) {
      this.holder = Optional.of(holder);
      return this;
    }

    @JsonSetter(
        value = "details",
        nulls = Nulls.SKIP
    )
    public Builder details(Optional<PaymentMethodInformationDetailsPse> details) {
      this.details = details;
      return this;
    }

    public Builder details(PaymentMethodInformationDetailsPse details) {
      this.details = Optional.of(details);
      return this;
    }

    public PaymentMethodInfoCustomerBankAccountsPse build() {
      return new PaymentMethodInfoCustomerBankAccountsPse(id, customer, institution, number, holder, details);
    }
  }
}
