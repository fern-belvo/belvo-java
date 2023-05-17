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
    builder = PaymentMethodInformationDetailsPse.Builder.class
)
public final class PaymentMethodInformationDetailsPse {
  private final Optional<EnumPaymentsCountry> country;

  private final Optional<String> accountType;

  private int _cachedHashCode;

  PaymentMethodInformationDetailsPse(Optional<EnumPaymentsCountry> country,
      Optional<String> accountType) {
    this.country = country;
    this.accountType = accountType;
  }

  @JsonProperty("country")
  public Optional<EnumPaymentsCountry> getCountry() {
    return country;
  }

  /**
   * @return The type of bank account. For example, <code>Ahorros</code> or <code>Corriente</code>.
   */
  @JsonProperty("account_type")
  public Optional<String> getAccountType() {
    return accountType;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof PaymentMethodInformationDetailsPse && equalTo((PaymentMethodInformationDetailsPse) other);
  }

  private boolean equalTo(PaymentMethodInformationDetailsPse other) {
    return country.equals(other.country) && accountType.equals(other.accountType);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.country, this.accountType);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "PaymentMethodInformationDetailsPse{" + "country: " + country + ", accountType: " + accountType + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<EnumPaymentsCountry> country = Optional.empty();

    private Optional<String> accountType = Optional.empty();

    private Builder() {
    }

    public Builder from(PaymentMethodInformationDetailsPse other) {
      country(other.getCountry());
      accountType(other.getAccountType());
      return this;
    }

    @JsonSetter(
        value = "country",
        nulls = Nulls.SKIP
    )
    public Builder country(Optional<EnumPaymentsCountry> country) {
      this.country = country;
      return this;
    }

    public Builder country(EnumPaymentsCountry country) {
      this.country = Optional.of(country);
      return this;
    }

    @JsonSetter(
        value = "account_type",
        nulls = Nulls.SKIP
    )
    public Builder accountType(Optional<String> accountType) {
      this.accountType = accountType;
      return this;
    }

    public Builder accountType(String accountType) {
      this.accountType = Optional.of(accountType);
      return this;
    }

    public PaymentMethodInformationDetailsPse build() {
      return new PaymentMethodInformationDetailsPse(country, accountType);
    }
  }
}
