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
    builder = InvestmentsPortfolioInstrumentFees.Builder.class
)
public final class InvestmentsPortfolioInstrumentFees {
  private final String type;

  private final double value;

  private int _cachedHashCode;

  InvestmentsPortfolioInstrumentFees(String type, double value) {
    this.type = type;
    this.value = value;
  }

  /**
   * @return The fee type incurred when making the purchase of the instrument.
   */
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  /**
   * @return The value of <code>fees.type</code>. The currency of the fee is the same as the currency of the instrument.
   */
  @JsonProperty("value")
  public double getValue() {
    return value;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof InvestmentsPortfolioInstrumentFees && equalTo((InvestmentsPortfolioInstrumentFees) other);
  }

  private boolean equalTo(InvestmentsPortfolioInstrumentFees other) {
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
    return "InvestmentsPortfolioInstrumentFees{" + "type: " + type + ", value: " + value + "}";
  }

  public static TypeStage builder() {
    return new Builder();
  }

  public interface TypeStage {
    ValueStage type(String type);

    Builder from(InvestmentsPortfolioInstrumentFees other);
  }

  public interface ValueStage {
    _FinalStage value(double value);
  }

  public interface _FinalStage {
    InvestmentsPortfolioInstrumentFees build();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements TypeStage, ValueStage, _FinalStage {
    private String type;

    private double value;

    private Builder() {
    }

    @Override
    public Builder from(InvestmentsPortfolioInstrumentFees other) {
      type(other.getType());
      value(other.getValue());
      return this;
    }

    /**
     * <p>The fee type incurred when making the purchase of the instrument.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("type")
    public ValueStage type(String type) {
      this.type = type;
      return this;
    }

    /**
     * <p>The value of <code>fees.type</code>. The currency of the fee is the same as the currency of the instrument.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("value")
    public _FinalStage value(double value) {
      this.value = value;
      return this;
    }

    @Override
    public InvestmentsPortfolioInstrumentFees build() {
      return new InvestmentsPortfolioInstrumentFees(type, value);
    }
  }
}
