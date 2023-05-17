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
    builder = AnnualIncomeStatementIndividual.Builder.class
)
public final class AnnualIncomeStatementIndividual {
  private final GrossIncomeIndividual grossIncome;

  private final NonTaxableIncomeIndividual nonTaxableIncome;

  private final NetIncomeIndividual netIncome;

  private final AnnualTotalsIndividual annualTotals;

  private int _cachedHashCode;

  AnnualIncomeStatementIndividual(GrossIncomeIndividual grossIncome,
      NonTaxableIncomeIndividual nonTaxableIncome, NetIncomeIndividual netIncome,
      AnnualTotalsIndividual annualTotals) {
    this.grossIncome = grossIncome;
    this.nonTaxableIncome = nonTaxableIncome;
    this.netIncome = netIncome;
    this.annualTotals = annualTotals;
  }

  @JsonProperty("gross_income")
  public GrossIncomeIndividual getGrossIncome() {
    return grossIncome;
  }

  @JsonProperty("non_taxable_income")
  public NonTaxableIncomeIndividual getNonTaxableIncome() {
    return nonTaxableIncome;
  }

  @JsonProperty("net_income")
  public NetIncomeIndividual getNetIncome() {
    return netIncome;
  }

  @JsonProperty("annual_totals")
  public AnnualTotalsIndividual getAnnualTotals() {
    return annualTotals;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AnnualIncomeStatementIndividual && equalTo((AnnualIncomeStatementIndividual) other);
  }

  private boolean equalTo(AnnualIncomeStatementIndividual other) {
    return grossIncome.equals(other.grossIncome) && nonTaxableIncome.equals(other.nonTaxableIncome) && netIncome.equals(other.netIncome) && annualTotals.equals(other.annualTotals);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.grossIncome, this.nonTaxableIncome, this.netIncome, this.annualTotals);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AnnualIncomeStatementIndividual{" + "grossIncome: " + grossIncome + ", nonTaxableIncome: " + nonTaxableIncome + ", netIncome: " + netIncome + ", annualTotals: " + annualTotals + "}";
  }

  public static GrossIncomeStage builder() {
    return new Builder();
  }

  public interface GrossIncomeStage {
    NonTaxableIncomeStage grossIncome(GrossIncomeIndividual grossIncome);

    Builder from(AnnualIncomeStatementIndividual other);
  }

  public interface NonTaxableIncomeStage {
    NetIncomeStage nonTaxableIncome(NonTaxableIncomeIndividual nonTaxableIncome);
  }

  public interface NetIncomeStage {
    AnnualTotalsStage netIncome(NetIncomeIndividual netIncome);
  }

  public interface AnnualTotalsStage {
    _FinalStage annualTotals(AnnualTotalsIndividual annualTotals);
  }

  public interface _FinalStage {
    AnnualIncomeStatementIndividual build();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements GrossIncomeStage, NonTaxableIncomeStage, NetIncomeStage, AnnualTotalsStage, _FinalStage {
    private GrossIncomeIndividual grossIncome;

    private NonTaxableIncomeIndividual nonTaxableIncome;

    private NetIncomeIndividual netIncome;

    private AnnualTotalsIndividual annualTotals;

    private Builder() {
    }

    @Override
    public Builder from(AnnualIncomeStatementIndividual other) {
      grossIncome(other.getGrossIncome());
      nonTaxableIncome(other.getNonTaxableIncome());
      netIncome(other.getNetIncome());
      annualTotals(other.getAnnualTotals());
      return this;
    }

    @Override
    @JsonSetter("gross_income")
    public NonTaxableIncomeStage grossIncome(GrossIncomeIndividual grossIncome) {
      this.grossIncome = grossIncome;
      return this;
    }

    @Override
    @JsonSetter("non_taxable_income")
    public NetIncomeStage nonTaxableIncome(NonTaxableIncomeIndividual nonTaxableIncome) {
      this.nonTaxableIncome = nonTaxableIncome;
      return this;
    }

    @Override
    @JsonSetter("net_income")
    public AnnualTotalsStage netIncome(NetIncomeIndividual netIncome) {
      this.netIncome = netIncome;
      return this;
    }

    @Override
    @JsonSetter("annual_totals")
    public _FinalStage annualTotals(AnnualTotalsIndividual annualTotals) {
      this.annualTotals = annualTotals;
      return this;
    }

    @Override
    public AnnualIncomeStatementIndividual build() {
      return new AnnualIncomeStatementIndividual(grossIncome, nonTaxableIncome, netIncome, annualTotals);
    }
  }
}
