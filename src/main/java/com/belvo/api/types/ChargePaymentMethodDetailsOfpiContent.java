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
    builder = ChargePaymentMethodDetailsOfpiContent.Builder.class
)
public final class ChargePaymentMethodDetailsOfpiContent {
  private final Optional<String> payerInstitution;

  private final Optional<String> beneficiaryBankAccount;

  private int _cachedHashCode;

  ChargePaymentMethodDetailsOfpiContent(Optional<String> payerInstitution,
      Optional<String> beneficiaryBankAccount) {
    this.payerInstitution = payerInstitution;
    this.beneficiaryBankAccount = beneficiaryBankAccount;
  }

  /**
   * @return Unique identifier for the payer’s institution.
   */
  @JsonProperty("payer_institution")
  public Optional<String> getPayerInstitution() {
    return payerInstitution;
  }

  /**
   * @return Belvo's unique ID used to identify the beneficiary's bank account.
   */
  @JsonProperty("beneficiary_bank_account")
  public Optional<String> getBeneficiaryBankAccount() {
    return beneficiaryBankAccount;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof ChargePaymentMethodDetailsOfpiContent && equalTo((ChargePaymentMethodDetailsOfpiContent) other);
  }

  private boolean equalTo(ChargePaymentMethodDetailsOfpiContent other) {
    return payerInstitution.equals(other.payerInstitution) && beneficiaryBankAccount.equals(other.beneficiaryBankAccount);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.payerInstitution, this.beneficiaryBankAccount);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "ChargePaymentMethodDetailsOfpiContent{" + "payerInstitution: " + payerInstitution + ", beneficiaryBankAccount: " + beneficiaryBankAccount + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> payerInstitution = Optional.empty();

    private Optional<String> beneficiaryBankAccount = Optional.empty();

    private Builder() {
    }

    public Builder from(ChargePaymentMethodDetailsOfpiContent other) {
      payerInstitution(other.getPayerInstitution());
      beneficiaryBankAccount(other.getBeneficiaryBankAccount());
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

    @JsonSetter(
        value = "beneficiary_bank_account",
        nulls = Nulls.SKIP
    )
    public Builder beneficiaryBankAccount(Optional<String> beneficiaryBankAccount) {
      this.beneficiaryBankAccount = beneficiaryBankAccount;
      return this;
    }

    public Builder beneficiaryBankAccount(String beneficiaryBankAccount) {
      this.beneficiaryBankAccount = Optional.of(beneficiaryBankAccount);
      return this;
    }

    public ChargePaymentMethodDetailsOfpiContent build() {
      return new ChargePaymentMethodDetailsOfpiContent(payerInstitution, beneficiaryBankAccount);
    }
  }
}
