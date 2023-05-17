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
    builder = TaxAssessmentBusiness.Builder.class
)
public final class TaxAssessmentBusiness {
  private final double netIncomeTaxable;

  private final double fortuitousProfitTax;

  private final double totalTaxOnTaxableNetIncome;

  private final double netIncomeTax;

  private final double totalTaxDue;

  private final double totalWithholdingsForTheTaxableYearToBeDeclared;

  private final double totalBalancePayable;

  private final double totalBalanceInFavor;

  private final double totalPayment;

  private int _cachedHashCode;

  TaxAssessmentBusiness(double netIncomeTaxable, double fortuitousProfitTax,
      double totalTaxOnTaxableNetIncome, double netIncomeTax, double totalTaxDue,
      double totalWithholdingsForTheTaxableYearToBeDeclared, double totalBalancePayable,
      double totalBalanceInFavor, double totalPayment) {
    this.netIncomeTaxable = netIncomeTaxable;
    this.fortuitousProfitTax = fortuitousProfitTax;
    this.totalTaxOnTaxableNetIncome = totalTaxOnTaxableNetIncome;
    this.netIncomeTax = netIncomeTax;
    this.totalTaxDue = totalTaxDue;
    this.totalWithholdingsForTheTaxableYearToBeDeclared = totalWithholdingsForTheTaxableYearToBeDeclared;
    this.totalBalancePayable = totalBalancePayable;
    this.totalBalanceInFavor = totalBalanceInFavor;
    this.totalPayment = totalPayment;
  }

  /**
   * @return The net income on which tax can be applied.
   */
  @JsonProperty("net_income_taxable")
  public double getNetIncomeTaxable() {
    return netIncomeTaxable;
  }

  /**
   * @return The tax applied on your unexpected income (such as lottery wins or house sales).
   */
  @JsonProperty("fortuitous_profit_tax")
  public double getFortuitousProfitTax() {
    return fortuitousProfitTax;
  }

  /**
   * @return The calculated total tax that can be applied on the tax payer's taxable income (total income - exemptions - deductions).
   */
  @JsonProperty("total_tax_on_taxable_net_income")
  public double getTotalTaxOnTaxableNetIncome() {
    return totalTaxOnTaxableNetIncome;
  }

  /**
   * @return After additional deductions that you can apply, this will be the net income tax. If no further deduction are identified, this value will be the same as <code>total_tax_on_taxable_net_income</code>.
   */
  @JsonProperty("net_income_tax")
  public double getNetIncomeTax() {
    return netIncomeTax;
  }

  /**
   * @return After further deductions, this is the final calculated tax that the taxpayer is required to pay.
   */
  @JsonProperty("total_tax_due")
  public double getTotalTaxDue() {
    return totalTaxDue;
  }

  /**
   * @return How much the tax payer has already paid througout the fiscal year.
   */
  @JsonProperty("total_withholdings_for_the_taxable_year_to_be_declared")
  public double getTotalWithholdingsForTheTaxableYearToBeDeclared() {
    return totalWithholdingsForTheTaxableYearToBeDeclared;
  }

  /**
   * @return How much the tax payer is required to pay.
   */
  @JsonProperty("total_balance_payable")
  public double getTotalBalancePayable() {
    return totalBalancePayable;
  }

  /**
   * @return How much the tax payer is expected to receive.
   */
  @JsonProperty("total_balance_in_favor")
  public double getTotalBalanceInFavor() {
    return totalBalanceInFavor;
  }

  /**
   * @return The total the tax payer is required to pay, taking into account deductions and fiscal credits.
   */
  @JsonProperty("total_payment")
  public double getTotalPayment() {
    return totalPayment;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof TaxAssessmentBusiness && equalTo((TaxAssessmentBusiness) other);
  }

  private boolean equalTo(TaxAssessmentBusiness other) {
    return netIncomeTaxable == other.netIncomeTaxable && fortuitousProfitTax == other.fortuitousProfitTax && totalTaxOnTaxableNetIncome == other.totalTaxOnTaxableNetIncome && netIncomeTax == other.netIncomeTax && totalTaxDue == other.totalTaxDue && totalWithholdingsForTheTaxableYearToBeDeclared == other.totalWithholdingsForTheTaxableYearToBeDeclared && totalBalancePayable == other.totalBalancePayable && totalBalanceInFavor == other.totalBalanceInFavor && totalPayment == other.totalPayment;
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.netIncomeTaxable, this.fortuitousProfitTax, this.totalTaxOnTaxableNetIncome, this.netIncomeTax, this.totalTaxDue, this.totalWithholdingsForTheTaxableYearToBeDeclared, this.totalBalancePayable, this.totalBalanceInFavor, this.totalPayment);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "TaxAssessmentBusiness{" + "netIncomeTaxable: " + netIncomeTaxable + ", fortuitousProfitTax: " + fortuitousProfitTax + ", totalTaxOnTaxableNetIncome: " + totalTaxOnTaxableNetIncome + ", netIncomeTax: " + netIncomeTax + ", totalTaxDue: " + totalTaxDue + ", totalWithholdingsForTheTaxableYearToBeDeclared: " + totalWithholdingsForTheTaxableYearToBeDeclared + ", totalBalancePayable: " + totalBalancePayable + ", totalBalanceInFavor: " + totalBalanceInFavor + ", totalPayment: " + totalPayment + "}";
  }

  public static NetIncomeTaxableStage builder() {
    return new Builder();
  }

  public interface NetIncomeTaxableStage {
    FortuitousProfitTaxStage netIncomeTaxable(double netIncomeTaxable);

    Builder from(TaxAssessmentBusiness other);
  }

  public interface FortuitousProfitTaxStage {
    TotalTaxOnTaxableNetIncomeStage fortuitousProfitTax(double fortuitousProfitTax);
  }

  public interface TotalTaxOnTaxableNetIncomeStage {
    NetIncomeTaxStage totalTaxOnTaxableNetIncome(double totalTaxOnTaxableNetIncome);
  }

  public interface NetIncomeTaxStage {
    TotalTaxDueStage netIncomeTax(double netIncomeTax);
  }

  public interface TotalTaxDueStage {
    TotalWithholdingsForTheTaxableYearToBeDeclaredStage totalTaxDue(double totalTaxDue);
  }

  public interface TotalWithholdingsForTheTaxableYearToBeDeclaredStage {
    TotalBalancePayableStage totalWithholdingsForTheTaxableYearToBeDeclared(
        double totalWithholdingsForTheTaxableYearToBeDeclared);
  }

  public interface TotalBalancePayableStage {
    TotalBalanceInFavorStage totalBalancePayable(double totalBalancePayable);
  }

  public interface TotalBalanceInFavorStage {
    TotalPaymentStage totalBalanceInFavor(double totalBalanceInFavor);
  }

  public interface TotalPaymentStage {
    _FinalStage totalPayment(double totalPayment);
  }

  public interface _FinalStage {
    TaxAssessmentBusiness build();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements NetIncomeTaxableStage, FortuitousProfitTaxStage, TotalTaxOnTaxableNetIncomeStage, NetIncomeTaxStage, TotalTaxDueStage, TotalWithholdingsForTheTaxableYearToBeDeclaredStage, TotalBalancePayableStage, TotalBalanceInFavorStage, TotalPaymentStage, _FinalStage {
    private double netIncomeTaxable;

    private double fortuitousProfitTax;

    private double totalTaxOnTaxableNetIncome;

    private double netIncomeTax;

    private double totalTaxDue;

    private double totalWithholdingsForTheTaxableYearToBeDeclared;

    private double totalBalancePayable;

    private double totalBalanceInFavor;

    private double totalPayment;

    private Builder() {
    }

    @Override
    public Builder from(TaxAssessmentBusiness other) {
      netIncomeTaxable(other.getNetIncomeTaxable());
      fortuitousProfitTax(other.getFortuitousProfitTax());
      totalTaxOnTaxableNetIncome(other.getTotalTaxOnTaxableNetIncome());
      netIncomeTax(other.getNetIncomeTax());
      totalTaxDue(other.getTotalTaxDue());
      totalWithholdingsForTheTaxableYearToBeDeclared(other.getTotalWithholdingsForTheTaxableYearToBeDeclared());
      totalBalancePayable(other.getTotalBalancePayable());
      totalBalanceInFavor(other.getTotalBalanceInFavor());
      totalPayment(other.getTotalPayment());
      return this;
    }

    /**
     * <p>The net income on which tax can be applied.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("net_income_taxable")
    public FortuitousProfitTaxStage netIncomeTaxable(double netIncomeTaxable) {
      this.netIncomeTaxable = netIncomeTaxable;
      return this;
    }

    /**
     * <p>The tax applied on your unexpected income (such as lottery wins or house sales).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("fortuitous_profit_tax")
    public TotalTaxOnTaxableNetIncomeStage fortuitousProfitTax(double fortuitousProfitTax) {
      this.fortuitousProfitTax = fortuitousProfitTax;
      return this;
    }

    /**
     * <p>The calculated total tax that can be applied on the tax payer's taxable income (total income - exemptions - deductions).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("total_tax_on_taxable_net_income")
    public NetIncomeTaxStage totalTaxOnTaxableNetIncome(double totalTaxOnTaxableNetIncome) {
      this.totalTaxOnTaxableNetIncome = totalTaxOnTaxableNetIncome;
      return this;
    }

    /**
     * <p>After additional deductions that you can apply, this will be the net income tax. If no further deduction are identified, this value will be the same as <code>total_tax_on_taxable_net_income</code>.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("net_income_tax")
    public TotalTaxDueStage netIncomeTax(double netIncomeTax) {
      this.netIncomeTax = netIncomeTax;
      return this;
    }

    /**
     * <p>After further deductions, this is the final calculated tax that the taxpayer is required to pay.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("total_tax_due")
    public TotalWithholdingsForTheTaxableYearToBeDeclaredStage totalTaxDue(double totalTaxDue) {
      this.totalTaxDue = totalTaxDue;
      return this;
    }

    /**
     * <p>How much the tax payer has already paid througout the fiscal year.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("total_withholdings_for_the_taxable_year_to_be_declared")
    public TotalBalancePayableStage totalWithholdingsForTheTaxableYearToBeDeclared(
        double totalWithholdingsForTheTaxableYearToBeDeclared) {
      this.totalWithholdingsForTheTaxableYearToBeDeclared = totalWithholdingsForTheTaxableYearToBeDeclared;
      return this;
    }

    /**
     * <p>How much the tax payer is required to pay.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("total_balance_payable")
    public TotalBalanceInFavorStage totalBalancePayable(double totalBalancePayable) {
      this.totalBalancePayable = totalBalancePayable;
      return this;
    }

    /**
     * <p>How much the tax payer is expected to receive.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("total_balance_in_favor")
    public TotalPaymentStage totalBalanceInFavor(double totalBalanceInFavor) {
      this.totalBalanceInFavor = totalBalanceInFavor;
      return this;
    }

    /**
     * <p>The total the tax payer is required to pay, taking into account deductions and fiscal credits.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("total_payment")
    public _FinalStage totalPayment(double totalPayment) {
      this.totalPayment = totalPayment;
      return this;
    }

    @Override
    public TaxAssessmentBusiness build() {
      return new TaxAssessmentBusiness(netIncomeTaxable, fortuitousProfitTax, totalTaxOnTaxableNetIncome, netIncomeTax, totalTaxDue, totalWithholdingsForTheTaxableYearToBeDeclared, totalBalancePayable, totalBalanceInFavor, totalPayment);
    }
  }
}
