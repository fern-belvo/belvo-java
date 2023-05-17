package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

@JsonDeserialize(
    builder = BankAccountDetailsOpenFinance.Builder.class
)
public final class BankAccountDetailsOpenFinance {
  private final EnumPaymentsCountry country;

  private final EnumBankAccountPixAccountTypeOfpi accountType;

  private final String agency;

  private final String number;

  private int _cachedHashCode;

  BankAccountDetailsOpenFinance(EnumPaymentsCountry country,
      EnumBankAccountPixAccountTypeOfpi accountType, String agency, String number) {
    this.country = country;
    this.accountType = accountType;
    this.agency = agency;
    this.number = number;
  }

  @JsonProperty("country")
  public EnumPaymentsCountry getCountry() {
    return country;
  }

  @JsonProperty("account_type")
  public EnumBankAccountPixAccountTypeOfpi getAccountType() {
    return accountType;
  }

  /**
   * @return The agency (branch number) of the institution where the account was created.
   */
  @JsonProperty("agency")
  public String getAgency() {
    return agency;
  }

  /**
   * @return The bank account number.
   */
  @JsonProperty("number")
  public String getNumber() {
    return number;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof BankAccountDetailsOpenFinance && equalTo((BankAccountDetailsOpenFinance) other);
  }

  private boolean equalTo(BankAccountDetailsOpenFinance other) {
    return country.equals(other.country) && accountType.equals(other.accountType) && agency.equals(other.agency) && number.equals(other.number);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.country, this.accountType, this.agency, this.number);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "BankAccountDetailsOpenFinance{" + "country: " + country + ", accountType: " + accountType + ", agency: " + agency + ", number: " + number + "}";
  }

  public static CountryStage builder() {
    return new Builder();
  }

  public interface CountryStage {
    AccountTypeStage country(EnumPaymentsCountry country);

    Builder from(BankAccountDetailsOpenFinance other);
  }

  public interface AccountTypeStage {
    AgencyStage accountType(EnumBankAccountPixAccountTypeOfpi accountType);
  }

  public interface AgencyStage {
    NumberStage agency(String agency);
  }

  public interface NumberStage {
    _FinalStage number(String number);
  }

  public interface _FinalStage {
    BankAccountDetailsOpenFinance build();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements CountryStage, AccountTypeStage, AgencyStage, NumberStage, _FinalStage {
    private EnumPaymentsCountry country;

    private EnumBankAccountPixAccountTypeOfpi accountType;

    private String agency;

    private String number;

    private Builder() {
    }

    @Override
    public Builder from(BankAccountDetailsOpenFinance other) {
      country(other.getCountry());
      accountType(other.getAccountType());
      agency(other.getAgency());
      number(other.getNumber());
      return this;
    }

    @Override
    @JsonSetter("country")
    public AccountTypeStage country(EnumPaymentsCountry country) {
      this.country = country;
      return this;
    }

    @Override
    @JsonSetter("account_type")
    public AgencyStage accountType(EnumBankAccountPixAccountTypeOfpi accountType) {
      this.accountType = accountType;
      return this;
    }

    /**
     * <p>The agency (branch number) of the institution where the account was created.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("agency")
    public NumberStage agency(String agency) {
      this.agency = agency;
      return this;
    }

    /**
     * <p>The bank account number.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("number")
    public _FinalStage number(String number) {
      this.number = number;
      return this;
    }

    @Override
    public BankAccountDetailsOpenFinance build() {
      return new BankAccountDetailsOpenFinance(country, accountType, agency, number);
    }
  }
}
