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
    builder = InvestmentsPortfolioInstrumentInterestRate.Builder.class
)
public final class InvestmentsPortfolioInstrumentInterestRate {
  private final String type;

  private final double value;

  private final Optional<String> index;

  private int _cachedHashCode;

  InvestmentsPortfolioInstrumentInterestRate(String type, double value, Optional<String> index) {
    this.type = type;
    this.value = value;
    this.index = index;
  }

  /**
   * @return How often the interest rate is calculated on the instrument.
   */
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  /**
   * @return The interest rate for the instrument, in percent.
   * <p>ℹ️  <strong>Note:</strong> If the <code>interest_rate.index</code> is present, this value is a percentage of the index. For example, if <code>interest_rate.index</code> = <code>CDI</code> and <code>interest_rate.value</code> = <code>90</code>, then the total interest rate applied is 90% of the CDI.</p>
   */
  @JsonProperty("value")
  public double getValue() {
    return value;
  }

  /**
   * @return If applicable, the index type that the <code>interest_rates.value</code> is calculated against.
   */
  @JsonProperty("index")
  public Optional<String> getIndex() {
    return index;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof InvestmentsPortfolioInstrumentInterestRate && equalTo((InvestmentsPortfolioInstrumentInterestRate) other);
  }

  private boolean equalTo(InvestmentsPortfolioInstrumentInterestRate other) {
    return type.equals(other.type) && value == other.value && index.equals(other.index);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.type, this.value, this.index);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "InvestmentsPortfolioInstrumentInterestRate{" + "type: " + type + ", value: " + value + ", index: " + index + "}";
  }

  public static TypeStage builder() {
    return new Builder();
  }

  public interface TypeStage {
    ValueStage type(String type);

    Builder from(InvestmentsPortfolioInstrumentInterestRate other);
  }

  public interface ValueStage {
    _FinalStage value(double value);
  }

  public interface _FinalStage {
    InvestmentsPortfolioInstrumentInterestRate build();

    _FinalStage index(Optional<String> index);

    _FinalStage index(String index);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements TypeStage, ValueStage, _FinalStage {
    private String type;

    private double value;

    private Optional<String> index = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(InvestmentsPortfolioInstrumentInterestRate other) {
      type(other.getType());
      value(other.getValue());
      index(other.getIndex());
      return this;
    }

    /**
     * <p>How often the interest rate is calculated on the instrument.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("type")
    public ValueStage type(String type) {
      this.type = type;
      return this;
    }

    /**
     * <p>The interest rate for the instrument, in percent.</p>
     * <p>ℹ️  <strong>Note:</strong> If the <code>interest_rate.index</code> is present, this value is a percentage of the index. For example, if <code>interest_rate.index</code> = <code>CDI</code> and <code>interest_rate.value</code> = <code>90</code>, then the total interest rate applied is 90% of the CDI.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("value")
    public _FinalStage value(double value) {
      this.value = value;
      return this;
    }

    /**
     * <p>If applicable, the index type that the <code>interest_rates.value</code> is calculated against.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage index(String index) {
      this.index = Optional.of(index);
      return this;
    }

    @Override
    @JsonSetter(
        value = "index",
        nulls = Nulls.SKIP
    )
    public _FinalStage index(Optional<String> index) {
      this.index = index;
      return this;
    }

    @Override
    public InvestmentsPortfolioInstrumentInterestRate build() {
      return new InvestmentsPortfolioInstrumentInterestRate(type, value, index);
    }
  }
}
