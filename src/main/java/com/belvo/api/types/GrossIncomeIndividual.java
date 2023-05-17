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
    builder = GrossIncomeIndividual.Builder.class
)
public final class GrossIncomeIndividual {
  private final double earnedIncome;

  private final double feeBasedIncome;

  private final double capitalIncome;

  private final double nonLaborIncome;

  private int _cachedHashCode;

  GrossIncomeIndividual(double earnedIncome, double feeBasedIncome, double capitalIncome,
      double nonLaborIncome) {
    this.earnedIncome = earnedIncome;
    this.feeBasedIncome = feeBasedIncome;
    this.capitalIncome = capitalIncome;
    this.nonLaborIncome = nonLaborIncome;
  }

  /**
   * @return Income received from employment.
   */
  @JsonProperty("earned_income")
  public double getEarnedIncome() {
    return earnedIncome;
  }

  /**
   * @return Income received from emitted invoices (for example, income that independent contractors or freelancers receive).
   */
  @JsonProperty("fee_based_income")
  public double getFeeBasedIncome() {
    return feeBasedIncome;
  }

  /**
   * @return Income received from an investment (such as dividends or from renting a property).
   */
  @JsonProperty("capital_income")
  public double getCapitalIncome() {
    return capitalIncome;
  }

  /**
   * @return Income that cannot be classified into the other three fields (such as income from cryptocurrencies or regular transfers from parents).
   */
  @JsonProperty("non_labor_income")
  public double getNonLaborIncome() {
    return nonLaborIncome;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof GrossIncomeIndividual && equalTo((GrossIncomeIndividual) other);
  }

  private boolean equalTo(GrossIncomeIndividual other) {
    return earnedIncome == other.earnedIncome && feeBasedIncome == other.feeBasedIncome && capitalIncome == other.capitalIncome && nonLaborIncome == other.nonLaborIncome;
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.earnedIncome, this.feeBasedIncome, this.capitalIncome, this.nonLaborIncome);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "GrossIncomeIndividual{" + "earnedIncome: " + earnedIncome + ", feeBasedIncome: " + feeBasedIncome + ", capitalIncome: " + capitalIncome + ", nonLaborIncome: " + nonLaborIncome + "}";
  }

  public static EarnedIncomeStage builder() {
    return new Builder();
  }

  public interface EarnedIncomeStage {
    FeeBasedIncomeStage earnedIncome(double earnedIncome);

    Builder from(GrossIncomeIndividual other);
  }

  public interface FeeBasedIncomeStage {
    CapitalIncomeStage feeBasedIncome(double feeBasedIncome);
  }

  public interface CapitalIncomeStage {
    NonLaborIncomeStage capitalIncome(double capitalIncome);
  }

  public interface NonLaborIncomeStage {
    _FinalStage nonLaborIncome(double nonLaborIncome);
  }

  public interface _FinalStage {
    GrossIncomeIndividual build();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements EarnedIncomeStage, FeeBasedIncomeStage, CapitalIncomeStage, NonLaborIncomeStage, _FinalStage {
    private double earnedIncome;

    private double feeBasedIncome;

    private double capitalIncome;

    private double nonLaborIncome;

    private Builder() {
    }

    @Override
    public Builder from(GrossIncomeIndividual other) {
      earnedIncome(other.getEarnedIncome());
      feeBasedIncome(other.getFeeBasedIncome());
      capitalIncome(other.getCapitalIncome());
      nonLaborIncome(other.getNonLaborIncome());
      return this;
    }

    /**
     * <p>Income received from employment.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("earned_income")
    public FeeBasedIncomeStage earnedIncome(double earnedIncome) {
      this.earnedIncome = earnedIncome;
      return this;
    }

    /**
     * <p>Income received from emitted invoices (for example, income that independent contractors or freelancers receive).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("fee_based_income")
    public CapitalIncomeStage feeBasedIncome(double feeBasedIncome) {
      this.feeBasedIncome = feeBasedIncome;
      return this;
    }

    /**
     * <p>Income received from an investment (such as dividends or from renting a property).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("capital_income")
    public NonLaborIncomeStage capitalIncome(double capitalIncome) {
      this.capitalIncome = capitalIncome;
      return this;
    }

    /**
     * <p>Income that cannot be classified into the other three fields (such as income from cryptocurrencies or regular transfers from parents).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("non_labor_income")
    public _FinalStage nonLaborIncome(double nonLaborIncome) {
      this.nonLaborIncome = nonLaborIncome;
      return this;
    }

    @Override
    public GrossIncomeIndividual build() {
      return new GrossIncomeIndividual(earnedIncome, feeBasedIncome, capitalIncome, nonLaborIncome);
    }
  }
}
