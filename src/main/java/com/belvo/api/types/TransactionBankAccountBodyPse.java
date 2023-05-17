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
    builder = TransactionBankAccountBodyPse.Builder.class
)
public final class TransactionBankAccountBodyPse {
  private final Optional<String> bankAccount;

  private int _cachedHashCode;

  TransactionBankAccountBodyPse(Optional<String> bankAccount) {
    this.bankAccount = bankAccount;
  }

  /**
   * @return Belvo's unique identifier for the payer’s bank account.
   */
  @JsonProperty("bank_account")
  public Optional<String> getBankAccount() {
    return bankAccount;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof TransactionBankAccountBodyPse && equalTo((TransactionBankAccountBodyPse) other);
  }

  private boolean equalTo(TransactionBankAccountBodyPse other) {
    return bankAccount.equals(other.bankAccount);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.bankAccount);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "TransactionBankAccountBodyPse{" + "bankAccount: " + bankAccount + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> bankAccount = Optional.empty();

    private Builder() {
    }

    public Builder from(TransactionBankAccountBodyPse other) {
      bankAccount(other.getBankAccount());
      return this;
    }

    @JsonSetter(
        value = "bank_account",
        nulls = Nulls.SKIP
    )
    public Builder bankAccount(Optional<String> bankAccount) {
      this.bankAccount = bankAccount;
      return this;
    }

    public Builder bankAccount(String bankAccount) {
      this.bankAccount = Optional.of(bankAccount);
      return this;
    }

    public TransactionBankAccountBodyPse build() {
      return new TransactionBankAccountBodyPse(bankAccount);
    }
  }
}
