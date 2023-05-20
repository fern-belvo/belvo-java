package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = AccountsLoanDataInterestRate.Builder.class
)
public final class AccountsLoanDataInterestRate {
  private final Optional<String> name;

  private final Optional<EnumLoanDataInterestRateType> type;

  private final Optional<Double> value;

  private int _cachedHashCode;

  AccountsLoanDataInterestRate(Optional<String> name, Optional<EnumLoanDataInterestRateType> type,
      Optional<Double> value) {
    this.name = name;
    this.type = type;
    this.value = value;
  }

  /**
   * @return The name of the type of interest rate applied to the loan.
   */
  @JsonProperty("name")
  public Optional<String> getName() {
    return name;
  }

  @JsonProperty("type")
  public Optional<EnumLoanDataInterestRateType> getType() {
    return type;
  }

  /**
   * @return The interest rate (in percent or currency value).
   */
  @JsonProperty("value")
  public Optional<Double> getValue() {
    return value;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AccountsLoanDataInterestRate && equalTo((AccountsLoanDataInterestRate) other);
  }

  private boolean equalTo(AccountsLoanDataInterestRate other) {
    return name.equals(other.name) && type.equals(other.type) && value.equals(other.value);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.name, this.type, this.value);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AccountsLoanDataInterestRate{" + "name: " + name + ", type: " + type + ", value: " + value + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> name = Optional.empty();

    private Optional<EnumLoanDataInterestRateType> type = Optional.empty();

    private Optional<Double> value = Optional.empty();

    private Builder() {
    }

    public Builder from(AccountsLoanDataInterestRate other) {
      name(other.getName());
      type(other.getType());
      value(other.getValue());
      return this;
    }

    @JsonSetter(
        value = "name",
        nulls = Nulls.SKIP
    )
    public Builder name(Optional<String> name) {
      this.name = name;
      return this;
    }

    public Builder name(String name) {
      this.name = Optional.of(name);
      return this;
    }

    @JsonSetter(
        value = "type",
        nulls = Nulls.SKIP
    )
    public Builder type(Optional<EnumLoanDataInterestRateType> type) {
      this.type = type;
      return this;
    }

    public Builder type(EnumLoanDataInterestRateType type) {
      this.type = Optional.of(type);
      return this;
    }

    @JsonSetter(
        value = "value",
        nulls = Nulls.SKIP
    )
    public Builder value(Optional<Double> value) {
      this.value = value;
      return this;
    }

    public Builder value(Double value) {
      this.value = Optional.of(value);
      return this;
    }

    public AccountsLoanDataInterestRate build() {
      return new AccountsLoanDataInterestRate(name, type, value);
    }
  }
}
