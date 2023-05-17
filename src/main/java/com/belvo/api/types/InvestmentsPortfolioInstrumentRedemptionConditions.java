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
    builder = InvestmentsPortfolioInstrumentRedemptionConditions.Builder.class
)
public final class InvestmentsPortfolioInstrumentRedemptionConditions {
  private final String type;

  private final String value;

  private int _cachedHashCode;

  InvestmentsPortfolioInstrumentRedemptionConditions(String type, String value) {
    this.type = type;
    this.value = value;
  }

  /**
   * @return The name of the redemption condition.
   */
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  /**
   * @return The value of <code>redemption_conditions.type</code>.
   */
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof InvestmentsPortfolioInstrumentRedemptionConditions && equalTo((InvestmentsPortfolioInstrumentRedemptionConditions) other);
  }

  private boolean equalTo(InvestmentsPortfolioInstrumentRedemptionConditions other) {
    return type.equals(other.type) && value.equals(other.value);
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
    return "InvestmentsPortfolioInstrumentRedemptionConditions{" + "type: " + type + ", value: " + value + "}";
  }

  public static TypeStage builder() {
    return new Builder();
  }

  public interface TypeStage {
    ValueStage type(String type);

    Builder from(InvestmentsPortfolioInstrumentRedemptionConditions other);
  }

  public interface ValueStage {
    _FinalStage value(String value);
  }

  public interface _FinalStage {
    InvestmentsPortfolioInstrumentRedemptionConditions build();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements TypeStage, ValueStage, _FinalStage {
    private String type;

    private String value;

    private Builder() {
    }

    @Override
    public Builder from(InvestmentsPortfolioInstrumentRedemptionConditions other) {
      type(other.getType());
      value(other.getValue());
      return this;
    }

    /**
     * <p>The name of the redemption condition.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("type")
    public ValueStage type(String type) {
      this.type = type;
      return this;
    }

    /**
     * <p>The value of <code>redemption_conditions.type</code>.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("value")
    public _FinalStage value(String value) {
      this.value = value;
      return this;
    }

    @Override
    public InvestmentsPortfolioInstrumentRedemptionConditions build() {
      return new InvestmentsPortfolioInstrumentRedemptionConditions(type, value);
    }
  }
}
