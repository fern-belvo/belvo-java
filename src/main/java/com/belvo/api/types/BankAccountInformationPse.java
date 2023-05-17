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
    builder = BankAccountInformationPse.Builder.class
)
public final class BankAccountInformationPse {
  private final Optional<BankAccountInformationContentPse> bankAccountInformation;

  private int _cachedHashCode;

  BankAccountInformationPse(Optional<BankAccountInformationContentPse> bankAccountInformation) {
    this.bankAccountInformation = bankAccountInformation;
  }

  @JsonProperty("bank_account_information")
  public Optional<BankAccountInformationContentPse> getBankAccountInformation() {
    return bankAccountInformation;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof BankAccountInformationPse && equalTo((BankAccountInformationPse) other);
  }

  private boolean equalTo(BankAccountInformationPse other) {
    return bankAccountInformation.equals(other.bankAccountInformation);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.bankAccountInformation);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "BankAccountInformationPse{" + "bankAccountInformation: " + bankAccountInformation + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<BankAccountInformationContentPse> bankAccountInformation = Optional.empty();

    private Builder() {
    }

    public Builder from(BankAccountInformationPse other) {
      bankAccountInformation(other.getBankAccountInformation());
      return this;
    }

    @JsonSetter(
        value = "bank_account_information",
        nulls = Nulls.SKIP
    )
    public Builder bankAccountInformation(
        Optional<BankAccountInformationContentPse> bankAccountInformation) {
      this.bankAccountInformation = bankAccountInformation;
      return this;
    }

    public Builder bankAccountInformation(BankAccountInformationContentPse bankAccountInformation) {
      this.bankAccountInformation = Optional.of(bankAccountInformation);
      return this;
    }

    public BankAccountInformationPse build() {
      return new BankAccountInformationPse(bankAccountInformation);
    }
  }
}
