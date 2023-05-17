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
    builder = DisplayPaymentMethodInformationContentPse.Builder.class
)
public final class DisplayPaymentMethodInformationContentPse {
  private final Optional<List<PaymentMethodInfoCustomerBankAccountsPse>> customerBankAccounts;

  private final Optional<List<PaymentInstitution>> institutions;

  private int _cachedHashCode;

  DisplayPaymentMethodInformationContentPse(
      Optional<List<PaymentMethodInfoCustomerBankAccountsPse>> customerBankAccounts,
      Optional<List<PaymentInstitution>> institutions) {
    this.customerBankAccounts = customerBankAccounts;
    this.institutions = institutions;
  }

  /**
   * @return Array of bank account objects.
   * <p><strong>Note</strong>: If there are no customer accounts saved in the Belvo database, we return an empty array.</p>
   */
  @JsonProperty("customer_bank_accounts")
  public Optional<List<PaymentMethodInfoCustomerBankAccountsPse>> getCustomerBankAccounts() {
    return customerBankAccounts;
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
    return other instanceof DisplayPaymentMethodInformationContentPse && equalTo((DisplayPaymentMethodInformationContentPse) other);
  }

  private boolean equalTo(DisplayPaymentMethodInformationContentPse other) {
    return customerBankAccounts.equals(other.customerBankAccounts) && institutions.equals(other.institutions);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.customerBankAccounts, this.institutions);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "DisplayPaymentMethodInformationContentPse{" + "customerBankAccounts: " + customerBankAccounts + ", institutions: " + institutions + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<List<PaymentMethodInfoCustomerBankAccountsPse>> customerBankAccounts = Optional.empty();

    private Optional<List<PaymentInstitution>> institutions = Optional.empty();

    private Builder() {
    }

    public Builder from(DisplayPaymentMethodInformationContentPse other) {
      customerBankAccounts(other.getCustomerBankAccounts());
      institutions(other.getInstitutions());
      return this;
    }

    @JsonSetter(
        value = "customer_bank_accounts",
        nulls = Nulls.SKIP
    )
    public Builder customerBankAccounts(
        Optional<List<PaymentMethodInfoCustomerBankAccountsPse>> customerBankAccounts) {
      this.customerBankAccounts = customerBankAccounts;
      return this;
    }

    public Builder customerBankAccounts(
        List<PaymentMethodInfoCustomerBankAccountsPse> customerBankAccounts) {
      this.customerBankAccounts = Optional.of(customerBankAccounts);
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

    public DisplayPaymentMethodInformationContentPse build() {
      return new DisplayPaymentMethodInformationContentPse(customerBankAccounts, institutions);
    }
  }
}
