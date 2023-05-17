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
    builder = ChargePaymentMethodDetailsPseContent.Builder.class
)
public final class ChargePaymentMethodDetailsPseContent {
  private final Optional<String> payerInstitution;

  private final Optional<String> payerBankAccount;

  private int _cachedHashCode;

  ChargePaymentMethodDetailsPseContent(Optional<String> payerInstitution,
      Optional<String> payerBankAccount) {
    this.payerInstitution = payerInstitution;
    this.payerBankAccount = payerBankAccount;
  }

  /**
   * @return Unique identifier for the payer’s institution.
   */
  @JsonProperty("payer_institution")
  public Optional<String> getPayerInstitution() {
    return payerInstitution;
  }

  /**
   * @return Belvo's unique ID used to identify the customer’s bank account.
   */
  @JsonProperty("payer_bank_account")
  public Optional<String> getPayerBankAccount() {
    return payerBankAccount;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof ChargePaymentMethodDetailsPseContent && equalTo((ChargePaymentMethodDetailsPseContent) other);
  }

  private boolean equalTo(ChargePaymentMethodDetailsPseContent other) {
    return payerInstitution.equals(other.payerInstitution) && payerBankAccount.equals(other.payerBankAccount);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.payerInstitution, this.payerBankAccount);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "ChargePaymentMethodDetailsPseContent{" + "payerInstitution: " + payerInstitution + ", payerBankAccount: " + payerBankAccount + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> payerInstitution = Optional.empty();

    private Optional<String> payerBankAccount = Optional.empty();

    private Builder() {
    }

    public Builder from(ChargePaymentMethodDetailsPseContent other) {
      payerInstitution(other.getPayerInstitution());
      payerBankAccount(other.getPayerBankAccount());
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
        value = "payer_bank_account",
        nulls = Nulls.SKIP
    )
    public Builder payerBankAccount(Optional<String> payerBankAccount) {
      this.payerBankAccount = payerBankAccount;
      return this;
    }

    public Builder payerBankAccount(String payerBankAccount) {
      this.payerBankAccount = Optional.of(payerBankAccount);
      return this;
    }

    public ChargePaymentMethodDetailsPseContent build() {
      return new ChargePaymentMethodDetailsPseContent(payerInstitution, payerBankAccount);
    }
  }
}
