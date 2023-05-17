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
    builder = AnnualCostsAndDeductionsStatementBusiness.Builder.class
)
public final class AnnualCostsAndDeductionsStatementBusiness {
  private final double costs;

  private final double administrationExpenses;

  private final double distributionAndSalesExpenses;

  private final double financialExpenses;

  private final double totalCostsAndDeductibleExpenses;

  private int _cachedHashCode;

  AnnualCostsAndDeductionsStatementBusiness(double costs, double administrationExpenses,
      double distributionAndSalesExpenses, double financialExpenses,
      double totalCostsAndDeductibleExpenses) {
    this.costs = costs;
    this.administrationExpenses = administrationExpenses;
    this.distributionAndSalesExpenses = distributionAndSalesExpenses;
    this.financialExpenses = financialExpenses;
    this.totalCostsAndDeductibleExpenses = totalCostsAndDeductibleExpenses;
  }

  /**
   * @return Total costs for the company to operate.
   */
  @JsonProperty("costs")
  public double getCosts() {
    return costs;
  }

  /**
   * @return Total costs of the company related to training, company offsites, or similar.
   */
  @JsonProperty("administration_expenses")
  public double getAdministrationExpenses() {
    return administrationExpenses;
  }

  /**
   * @return Total costs the company incurred in order to distribute or sell their product.
   */
  @JsonProperty("distribution_and_sales_expenses")
  public double getDistributionAndSalesExpenses() {
    return distributionAndSalesExpenses;
  }

  /**
   * @return Total value of any fees incurred by the company to operate (such as bank fees).
   */
  @JsonProperty("financial_expenses")
  public double getFinancialExpenses() {
    return financialExpenses;
  }

  /**
   * @return Total value of all costs and dedictible expenses.
   */
  @JsonProperty("total_costs_and_deductible_expenses")
  public double getTotalCostsAndDeductibleExpenses() {
    return totalCostsAndDeductibleExpenses;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AnnualCostsAndDeductionsStatementBusiness && equalTo((AnnualCostsAndDeductionsStatementBusiness) other);
  }

  private boolean equalTo(AnnualCostsAndDeductionsStatementBusiness other) {
    return costs == other.costs && administrationExpenses == other.administrationExpenses && distributionAndSalesExpenses == other.distributionAndSalesExpenses && financialExpenses == other.financialExpenses && totalCostsAndDeductibleExpenses == other.totalCostsAndDeductibleExpenses;
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.costs, this.administrationExpenses, this.distributionAndSalesExpenses, this.financialExpenses, this.totalCostsAndDeductibleExpenses);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AnnualCostsAndDeductionsStatementBusiness{" + "costs: " + costs + ", administrationExpenses: " + administrationExpenses + ", distributionAndSalesExpenses: " + distributionAndSalesExpenses + ", financialExpenses: " + financialExpenses + ", totalCostsAndDeductibleExpenses: " + totalCostsAndDeductibleExpenses + "}";
  }

  public static CostsStage builder() {
    return new Builder();
  }

  public interface CostsStage {
    AdministrationExpensesStage costs(double costs);

    Builder from(AnnualCostsAndDeductionsStatementBusiness other);
  }

  public interface AdministrationExpensesStage {
    DistributionAndSalesExpensesStage administrationExpenses(double administrationExpenses);
  }

  public interface DistributionAndSalesExpensesStage {
    FinancialExpensesStage distributionAndSalesExpenses(double distributionAndSalesExpenses);
  }

  public interface FinancialExpensesStage {
    TotalCostsAndDeductibleExpensesStage financialExpenses(double financialExpenses);
  }

  public interface TotalCostsAndDeductibleExpensesStage {
    _FinalStage totalCostsAndDeductibleExpenses(double totalCostsAndDeductibleExpenses);
  }

  public interface _FinalStage {
    AnnualCostsAndDeductionsStatementBusiness build();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements CostsStage, AdministrationExpensesStage, DistributionAndSalesExpensesStage, FinancialExpensesStage, TotalCostsAndDeductibleExpensesStage, _FinalStage {
    private double costs;

    private double administrationExpenses;

    private double distributionAndSalesExpenses;

    private double financialExpenses;

    private double totalCostsAndDeductibleExpenses;

    private Builder() {
    }

    @Override
    public Builder from(AnnualCostsAndDeductionsStatementBusiness other) {
      costs(other.getCosts());
      administrationExpenses(other.getAdministrationExpenses());
      distributionAndSalesExpenses(other.getDistributionAndSalesExpenses());
      financialExpenses(other.getFinancialExpenses());
      totalCostsAndDeductibleExpenses(other.getTotalCostsAndDeductibleExpenses());
      return this;
    }

    /**
     * <p>Total costs for the company to operate.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("costs")
    public AdministrationExpensesStage costs(double costs) {
      this.costs = costs;
      return this;
    }

    /**
     * <p>Total costs of the company related to training, company offsites, or similar.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("administration_expenses")
    public DistributionAndSalesExpensesStage administrationExpenses(double administrationExpenses) {
      this.administrationExpenses = administrationExpenses;
      return this;
    }

    /**
     * <p>Total costs the company incurred in order to distribute or sell their product.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("distribution_and_sales_expenses")
    public FinancialExpensesStage distributionAndSalesExpenses(
        double distributionAndSalesExpenses) {
      this.distributionAndSalesExpenses = distributionAndSalesExpenses;
      return this;
    }

    /**
     * <p>Total value of any fees incurred by the company to operate (such as bank fees).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("financial_expenses")
    public TotalCostsAndDeductibleExpensesStage financialExpenses(double financialExpenses) {
      this.financialExpenses = financialExpenses;
      return this;
    }

    /**
     * <p>Total value of all costs and dedictible expenses.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("total_costs_and_deductible_expenses")
    public _FinalStage totalCostsAndDeductibleExpenses(double totalCostsAndDeductibleExpenses) {
      this.totalCostsAndDeductibleExpenses = totalCostsAndDeductibleExpenses;
      return this;
    }

    @Override
    public AnnualCostsAndDeductionsStatementBusiness build() {
      return new AnnualCostsAndDeductionsStatementBusiness(costs, administrationExpenses, distributionAndSalesExpenses, financialExpenses, totalCostsAndDeductibleExpenses);
    }
  }
}
