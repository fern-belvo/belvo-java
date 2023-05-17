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
    builder = DisplayConfirmationRequiredOfpi.Builder.class
)
public final class DisplayConfirmationRequiredOfpi {
  private final Optional<BeneficiaryBankAccountOfpi> beneficiaryBankAccount;

  private final Optional<String> payerName;

  private final Optional<String> payerIdentifier;

  private final Optional<PaymentInstitution> payerInstitution;

  private int _cachedHashCode;

  DisplayConfirmationRequiredOfpi(Optional<BeneficiaryBankAccountOfpi> beneficiaryBankAccount,
      Optional<String> payerName, Optional<String> payerIdentifier,
      Optional<PaymentInstitution> payerInstitution) {
    this.beneficiaryBankAccount = beneficiaryBankAccount;
    this.payerName = payerName;
    this.payerIdentifier = payerIdentifier;
    this.payerInstitution = payerInstitution;
  }

  @JsonProperty("beneficiary_bank_account")
  public Optional<BeneficiaryBankAccountOfpi> getBeneficiaryBankAccount() {
    return beneficiaryBankAccount;
  }

  /**
   * @return The name of the payer.
   */
  @JsonProperty("payer_name")
  public Optional<String> getPayerName() {
    return payerName;
  }

  /**
   * @return The payer's ID.
   */
  @JsonProperty("payer_identifier")
  public Optional<String> getPayerIdentifier() {
    return payerIdentifier;
  }

  @JsonProperty("payer_institution")
  public Optional<PaymentInstitution> getPayerInstitution() {
    return payerInstitution;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof DisplayConfirmationRequiredOfpi && equalTo((DisplayConfirmationRequiredOfpi) other);
  }

  private boolean equalTo(DisplayConfirmationRequiredOfpi other) {
    return beneficiaryBankAccount.equals(other.beneficiaryBankAccount) && payerName.equals(other.payerName) && payerIdentifier.equals(other.payerIdentifier) && payerInstitution.equals(other.payerInstitution);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.beneficiaryBankAccount, this.payerName, this.payerIdentifier, this.payerInstitution);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "DisplayConfirmationRequiredOfpi{" + "beneficiaryBankAccount: " + beneficiaryBankAccount + ", payerName: " + payerName + ", payerIdentifier: " + payerIdentifier + ", payerInstitution: " + payerInstitution + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<BeneficiaryBankAccountOfpi> beneficiaryBankAccount = Optional.empty();

    private Optional<String> payerName = Optional.empty();

    private Optional<String> payerIdentifier = Optional.empty();

    private Optional<PaymentInstitution> payerInstitution = Optional.empty();

    private Builder() {
    }

    public Builder from(DisplayConfirmationRequiredOfpi other) {
      beneficiaryBankAccount(other.getBeneficiaryBankAccount());
      payerName(other.getPayerName());
      payerIdentifier(other.getPayerIdentifier());
      payerInstitution(other.getPayerInstitution());
      return this;
    }

    @JsonSetter(
        value = "beneficiary_bank_account",
        nulls = Nulls.SKIP
    )
    public Builder beneficiaryBankAccount(
        Optional<BeneficiaryBankAccountOfpi> beneficiaryBankAccount) {
      this.beneficiaryBankAccount = beneficiaryBankAccount;
      return this;
    }

    public Builder beneficiaryBankAccount(BeneficiaryBankAccountOfpi beneficiaryBankAccount) {
      this.beneficiaryBankAccount = Optional.of(beneficiaryBankAccount);
      return this;
    }

    @JsonSetter(
        value = "payer_name",
        nulls = Nulls.SKIP
    )
    public Builder payerName(Optional<String> payerName) {
      this.payerName = payerName;
      return this;
    }

    public Builder payerName(String payerName) {
      this.payerName = Optional.of(payerName);
      return this;
    }

    @JsonSetter(
        value = "payer_identifier",
        nulls = Nulls.SKIP
    )
    public Builder payerIdentifier(Optional<String> payerIdentifier) {
      this.payerIdentifier = payerIdentifier;
      return this;
    }

    public Builder payerIdentifier(String payerIdentifier) {
      this.payerIdentifier = Optional.of(payerIdentifier);
      return this;
    }

    @JsonSetter(
        value = "payer_institution",
        nulls = Nulls.SKIP
    )
    public Builder payerInstitution(Optional<PaymentInstitution> payerInstitution) {
      this.payerInstitution = payerInstitution;
      return this;
    }

    public Builder payerInstitution(PaymentInstitution payerInstitution) {
      this.payerInstitution = Optional.of(payerInstitution);
      return this;
    }

    public DisplayConfirmationRequiredOfpi build() {
      return new DisplayConfirmationRequiredOfpi(beneficiaryBankAccount, payerName, payerIdentifier, payerInstitution);
    }
  }
}
