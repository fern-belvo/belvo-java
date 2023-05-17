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
    builder = AccountsLoanDataFees.Builder.class
)
public final class AccountsLoanDataFees {
  private final EnumLoanDataFeeType type;

  private final double value;

  private int _cachedHashCode;

  AccountsLoanDataFees(EnumLoanDataFeeType type, double value) {
    this.type = type;
    this.value = value;
  }

  @JsonProperty("type")
  public EnumLoanDataFeeType getType() {
    return type;
  }

  /**
   * @return The total value of the fee. Same currency of the Loan.
   */
  @JsonProperty("value")
  public double getValue() {
    return value;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AccountsLoanDataFees && equalTo((AccountsLoanDataFees) other);
  }

  private boolean equalTo(AccountsLoanDataFees other) {
    return type.equals(other.type) && value == other.value;
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.type, this.value);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AccountsLoanDataFees{" + "type: " + type + ", value: " + value + "}";
  }

  public static TypeStage builder() {
    return new Builder();
  }

  public interface TypeStage {
    ValueStage type(EnumLoanDataFeeType type);

    Builder from(AccountsLoanDataFees other);
  }

  public interface ValueStage {
    _FinalStage value(double value);
  }

  public interface _FinalStage {
    AccountsLoanDataFees build();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements TypeStage, ValueStage, _FinalStage {
    private EnumLoanDataFeeType type;

    private double value;

    private Builder() {
    }

    @Override
    public Builder from(AccountsLoanDataFees other) {
      type(other.getType());
      value(other.getValue());
      return this;
    }

    @Override
    @JsonSetter("type")
    public ValueStage type(EnumLoanDataFeeType type) {
      this.type = type;
      return this;
    }

    /**
     * <p>The total value of the fee. Same currency of the Loan.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("value")
    public _FinalStage value(double value) {
      this.value = value;
      return this;
    }

    @Override
    public AccountsLoanDataFees build() {
      return new AccountsLoanDataFees(type, value);
    }
  }
}
