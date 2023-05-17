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
    builder = AnnualTotalsIndividual.Builder.class
)
public final class AnnualTotalsIndividual {
  private final double totalExemptIncome;

  private final double totalApplicableDeductions;

  private final double totalExemptionsAndDeductions;

  private final double totalOrdinaryNetIncome;

  private int _cachedHashCode;

  AnnualTotalsIndividual(double totalExemptIncome, double totalApplicableDeductions,
      double totalExemptionsAndDeductions, double totalOrdinaryNetIncome) {
    this.totalExemptIncome = totalExemptIncome;
    this.totalApplicableDeductions = totalApplicableDeductions;
    this.totalExemptionsAndDeductions = totalExemptionsAndDeductions;
    this.totalOrdinaryNetIncome = totalOrdinaryNetIncome;
  }

  /**
   * @return Total income that is not taxable, according to the institution.
   */
  @JsonProperty("total_exempt_income")
  public double getTotalExemptIncome() {
    return totalExemptIncome;
  }

  /**
   * @return Total deductions that the taxpayer can apply to their income, according to the institution.
   */
  @JsonProperty("total_applicable_deductions")
  public double getTotalApplicableDeductions() {
    return totalApplicableDeductions;
  }

  /**
   * @return Sum total of all exempt and deductions that can be applied to the taxpayer's income.
   */
  @JsonProperty("total_exemptions_and_deductions")
  public double getTotalExemptionsAndDeductions() {
    return totalExemptionsAndDeductions;
  }

  /**
   * @return Sum total of the taxpayer's income (gross income - exemptions - deductions).
   */
  @JsonProperty("total_ordinary_net_income")
  public double getTotalOrdinaryNetIncome() {
    return totalOrdinaryNetIncome;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AnnualTotalsIndividual && equalTo((AnnualTotalsIndividual) other);
  }

  private boolean equalTo(AnnualTotalsIndividual other) {
    return totalExemptIncome == other.totalExemptIncome && totalApplicableDeductions == other.totalApplicableDeductions && totalExemptionsAndDeductions == other.totalExemptionsAndDeductions && totalOrdinaryNetIncome == other.totalOrdinaryNetIncome;
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.totalExemptIncome, this.totalApplicableDeductions, this.totalExemptionsAndDeductions, this.totalOrdinaryNetIncome);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AnnualTotalsIndividual{" + "totalExemptIncome: " + totalExemptIncome + ", totalApplicableDeductions: " + totalApplicableDeductions + ", totalExemptionsAndDeductions: " + totalExemptionsAndDeductions + ", totalOrdinaryNetIncome: " + totalOrdinaryNetIncome + "}";
  }

  public static TotalExemptIncomeStage builder() {
    return new Builder();
  }

  public interface TotalExemptIncomeStage {
    TotalApplicableDeductionsStage totalExemptIncome(double totalExemptIncome);

    Builder from(AnnualTotalsIndividual other);
  }

  public interface TotalApplicableDeductionsStage {
    TotalExemptionsAndDeductionsStage totalApplicableDeductions(double totalApplicableDeductions);
  }

  public interface TotalExemptionsAndDeductionsStage {
    TotalOrdinaryNetIncomeStage totalExemptionsAndDeductions(double totalExemptionsAndDeductions);
  }

  public interface TotalOrdinaryNetIncomeStage {
    _FinalStage totalOrdinaryNetIncome(double totalOrdinaryNetIncome);
  }

  public interface _FinalStage {
    AnnualTotalsIndividual build();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements TotalExemptIncomeStage, TotalApplicableDeductionsStage, TotalExemptionsAndDeductionsStage, TotalOrdinaryNetIncomeStage, _FinalStage {
    private double totalExemptIncome;

    private double totalApplicableDeductions;

    private double totalExemptionsAndDeductions;

    private double totalOrdinaryNetIncome;

    private Builder() {
    }

    @Override
    public Builder from(AnnualTotalsIndividual other) {
      totalExemptIncome(other.getTotalExemptIncome());
      totalApplicableDeductions(other.getTotalApplicableDeductions());
      totalExemptionsAndDeductions(other.getTotalExemptionsAndDeductions());
      totalOrdinaryNetIncome(other.getTotalOrdinaryNetIncome());
      return this;
    }

    /**
     * <p>Total income that is not taxable, according to the institution.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("total_exempt_income")
    public TotalApplicableDeductionsStage totalExemptIncome(double totalExemptIncome) {
      this.totalExemptIncome = totalExemptIncome;
      return this;
    }

    /**
     * <p>Total deductions that the taxpayer can apply to their income, according to the institution.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("total_applicable_deductions")
    public TotalExemptionsAndDeductionsStage totalApplicableDeductions(
        double totalApplicableDeductions) {
      this.totalApplicableDeductions = totalApplicableDeductions;
      return this;
    }

    /**
     * <p>Sum total of all exempt and deductions that can be applied to the taxpayer's income.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("total_exemptions_and_deductions")
    public TotalOrdinaryNetIncomeStage totalExemptionsAndDeductions(
        double totalExemptionsAndDeductions) {
      this.totalExemptionsAndDeductions = totalExemptionsAndDeductions;
      return this;
    }

    /**
     * <p>Sum total of the taxpayer's income (gross income - exemptions - deductions).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("total_ordinary_net_income")
    public _FinalStage totalOrdinaryNetIncome(double totalOrdinaryNetIncome) {
      this.totalOrdinaryNetIncome = totalOrdinaryNetIncome;
      return this;
    }

    @Override
    public AnnualTotalsIndividual build() {
      return new AnnualTotalsIndividual(totalExemptIncome, totalApplicableDeductions, totalExemptionsAndDeductions, totalOrdinaryNetIncome);
    }
  }
}
