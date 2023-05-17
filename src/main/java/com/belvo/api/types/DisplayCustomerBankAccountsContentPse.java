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
    builder = DisplayCustomerBankAccountsContentPse.Builder.class
)
public final class DisplayCustomerBankAccountsContentPse {
  private final Optional<List<PaymentMethodInfoCustomerBankAccountsPse>> customerBankAccounts;

  private final Optional<BeneficiaryBankAccountPse> beneficiaryBankAccount;

  private int _cachedHashCode;

  DisplayCustomerBankAccountsContentPse(
      Optional<List<PaymentMethodInfoCustomerBankAccountsPse>> customerBankAccounts,
      Optional<BeneficiaryBankAccountPse> beneficiaryBankAccount) {
    this.customerBankAccounts = customerBankAccounts;
    this.beneficiaryBankAccount = beneficiaryBankAccount;
  }

  /**
   * @return Array of customer bank account objects.
   */
  @JsonProperty("customer_bank_accounts")
  public Optional<List<PaymentMethodInfoCustomerBankAccountsPse>> getCustomerBankAccounts() {
    return customerBankAccounts;
  }

  @JsonProperty("beneficiary_bank_account")
  public Optional<BeneficiaryBankAccountPse> getBeneficiaryBankAccount() {
    return beneficiaryBankAccount;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof DisplayCustomerBankAccountsContentPse && equalTo((DisplayCustomerBankAccountsContentPse) other);
  }

  private boolean equalTo(DisplayCustomerBankAccountsContentPse other) {
    return customerBankAccounts.equals(other.customerBankAccounts) && beneficiaryBankAccount.equals(other.beneficiaryBankAccount);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.customerBankAccounts, this.beneficiaryBankAccount);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "DisplayCustomerBankAccountsContentPse{" + "customerBankAccounts: " + customerBankAccounts + ", beneficiaryBankAccount: " + beneficiaryBankAccount + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<List<PaymentMethodInfoCustomerBankAccountsPse>> customerBankAccounts = Optional.empty();

    private Optional<BeneficiaryBankAccountPse> beneficiaryBankAccount = Optional.empty();

    private Builder() {
    }

    public Builder from(DisplayCustomerBankAccountsContentPse other) {
      customerBankAccounts(other.getCustomerBankAccounts());
      beneficiaryBankAccount(other.getBeneficiaryBankAccount());
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
        value = "beneficiary_bank_account",
        nulls = Nulls.SKIP
    )
    public Builder beneficiaryBankAccount(
        Optional<BeneficiaryBankAccountPse> beneficiaryBankAccount) {
      this.beneficiaryBankAccount = beneficiaryBankAccount;
      return this;
    }

    public Builder beneficiaryBankAccount(BeneficiaryBankAccountPse beneficiaryBankAccount) {
      this.beneficiaryBankAccount = Optional.of(beneficiaryBankAccount);
      return this;
    }

    public DisplayCustomerBankAccountsContentPse build() {
      return new DisplayCustomerBankAccountsContentPse(customerBankAccounts, beneficiaryBankAccount);
    }
  }
}
