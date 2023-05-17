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

  private final EnumLoanDataInterestRateType type;

  private final Optional<Double> value;

  private int _cachedHashCode;

  AccountsLoanDataInterestRate(Optional<String> name, EnumLoanDataInterestRateType type,
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
  public EnumLoanDataInterestRateType getType() {
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

  public static TypeStage builder() {
    return new Builder();
  }

  public interface TypeStage {
    _FinalStage type(EnumLoanDataInterestRateType type);

    Builder from(AccountsLoanDataInterestRate other);
  }

  public interface _FinalStage {
    AccountsLoanDataInterestRate build();

    _FinalStage name(Optional<String> name);

    _FinalStage name(String name);

    _FinalStage value(Optional<Double> value);

    _FinalStage value(Double value);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements TypeStage, _FinalStage {
    private EnumLoanDataInterestRateType type;

    private Optional<Double> value = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(AccountsLoanDataInterestRate other) {
      name(other.getName());
      type(other.getType());
      value(other.getValue());
      return this;
    }

    @Override
    @JsonSetter("type")
    public _FinalStage type(EnumLoanDataInterestRateType type) {
      this.type = type;
      return this;
    }

    /**
     * <p>The interest rate (in percent or currency value).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage value(Double value) {
      this.value = Optional.of(value);
      return this;
    }

    @Override
    @JsonSetter(
        value = "value",
        nulls = Nulls.SKIP
    )
    public _FinalStage value(Optional<Double> value) {
      this.value = value;
      return this;
    }

    /**
     * <p>The name of the type of interest rate applied to the loan.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage name(String name) {
      this.name = Optional.of(name);
      return this;
    }

    @Override
    @JsonSetter(
        value = "name",
        nulls = Nulls.SKIP
    )
    public _FinalStage name(Optional<String> name) {
      this.name = name;
      return this;
    }

    @Override
    public AccountsLoanDataInterestRate build() {
      return new AccountsLoanDataInterestRate(name, type, value);
    }
  }
}
