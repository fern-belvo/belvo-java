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
    builder = TaxAssessmentIndividual.Builder.class
)
public final class TaxAssessmentIndividual {
  private final double fortuitousProfitTax;

  private final double totalTaxOnTaxableNetIncome;

  private final double netIncomeTax;

  private final double totalTaxDue;

  private final double previousYearBalance;

  private final double totalWithheldTax;

  private final double balancePayable;

  private final double balanceRefundable;

  private final double totalPayment;

  private int _cachedHashCode;

  TaxAssessmentIndividual(double fortuitousProfitTax, double totalTaxOnTaxableNetIncome,
      double netIncomeTax, double totalTaxDue, double previousYearBalance, double totalWithheldTax,
      double balancePayable, double balanceRefundable, double totalPayment) {
    this.fortuitousProfitTax = fortuitousProfitTax;
    this.totalTaxOnTaxableNetIncome = totalTaxOnTaxableNetIncome;
    this.netIncomeTax = netIncomeTax;
    this.totalTaxDue = totalTaxDue;
    this.previousYearBalance = previousYearBalance;
    this.totalWithheldTax = totalWithheldTax;
    this.balancePayable = balancePayable;
    this.balanceRefundable = balanceRefundable;
    this.totalPayment = totalPayment;
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
   * @return After additional deductions that you can apply, this will be the net income tax. If not further deduction are identified, this value will be the same as <code>total_tax_on_taxable_net_income</code>.
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
   * @return Only applicable for DIAN.
   * <p>The amount the tax payer has as a &quot;credit&quot; fromt he previous year (this is equal to the <code>balance_refundable</code>) of the previous year.</p>
   */
  @JsonProperty("previous_year_balance")
  public double getPreviousYearBalance() {
    return previousYearBalance;
  }

  /**
   * @return The total tax already withheld in the current fiscal year.
   */
  @JsonProperty("total_withheld_tax")
  public double getTotalWithheldTax() {
    return totalWithheldTax;
  }

  /**
   * @return How much the tax payer is required to pay.
   */
  @JsonProperty("balance_payable")
  public double getBalancePayable() {
    return balancePayable;
  }

  /**
   * @return How much the tax payer is expected to receive. For DIAN, this will count as credit for the next fiscal year (see <code>previous_year_balance</code>).
   */
  @JsonProperty("balance_refundable")
  public double getBalanceRefundable() {
    return balanceRefundable;
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
    return other instanceof TaxAssessmentIndividual && equalTo((TaxAssessmentIndividual) other);
  }

  private boolean equalTo(TaxAssessmentIndividual other) {
    return fortuitousProfitTax == other.fortuitousProfitTax && totalTaxOnTaxableNetIncome == other.totalTaxOnTaxableNetIncome && netIncomeTax == other.netIncomeTax && totalTaxDue == other.totalTaxDue && previousYearBalance == other.previousYearBalance && totalWithheldTax == other.totalWithheldTax && balancePayable == other.balancePayable && balanceRefundable == other.balanceRefundable && totalPayment == other.totalPayment;
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.fortuitousProfitTax, this.totalTaxOnTaxableNetIncome, this.netIncomeTax, this.totalTaxDue, this.previousYearBalance, this.totalWithheldTax, this.balancePayable, this.balanceRefundable, this.totalPayment);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "TaxAssessmentIndividual{" + "fortuitousProfitTax: " + fortuitousProfitTax + ", totalTaxOnTaxableNetIncome: " + totalTaxOnTaxableNetIncome + ", netIncomeTax: " + netIncomeTax + ", totalTaxDue: " + totalTaxDue + ", previousYearBalance: " + previousYearBalance + ", totalWithheldTax: " + totalWithheldTax + ", balancePayable: " + balancePayable + ", balanceRefundable: " + balanceRefundable + ", totalPayment: " + totalPayment + "}";
  }

  public static FortuitousProfitTaxStage builder() {
    return new Builder();
  }

  public interface FortuitousProfitTaxStage {
    TotalTaxOnTaxableNetIncomeStage fortuitousProfitTax(double fortuitousProfitTax);

    Builder from(TaxAssessmentIndividual other);
  }

  public interface TotalTaxOnTaxableNetIncomeStage {
    NetIncomeTaxStage totalTaxOnTaxableNetIncome(double totalTaxOnTaxableNetIncome);
  }

  public interface NetIncomeTaxStage {
    TotalTaxDueStage netIncomeTax(double netIncomeTax);
  }

  public interface TotalTaxDueStage {
    PreviousYearBalanceStage totalTaxDue(double totalTaxDue);
  }

  public interface PreviousYearBalanceStage {
    TotalWithheldTaxStage previousYearBalance(double previousYearBalance);
  }

  public interface TotalWithheldTaxStage {
    BalancePayableStage totalWithheldTax(double totalWithheldTax);
  }

  public interface BalancePayableStage {
    BalanceRefundableStage balancePayable(double balancePayable);
  }

  public interface BalanceRefundableStage {
    TotalPaymentStage balanceRefundable(double balanceRefundable);
  }

  public interface TotalPaymentStage {
    _FinalStage totalPayment(double totalPayment);
  }

  public interface _FinalStage {
    TaxAssessmentIndividual build();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements FortuitousProfitTaxStage, TotalTaxOnTaxableNetIncomeStage, NetIncomeTaxStage, TotalTaxDueStage, PreviousYearBalanceStage, TotalWithheldTaxStage, BalancePayableStage, BalanceRefundableStage, TotalPaymentStage, _FinalStage {
    private double fortuitousProfitTax;

    private double totalTaxOnTaxableNetIncome;

    private double netIncomeTax;

    private double totalTaxDue;

    private double previousYearBalance;

    private double totalWithheldTax;

    private double balancePayable;

    private double balanceRefundable;

    private double totalPayment;

    private Builder() {
    }

    @Override
    public Builder from(TaxAssessmentIndividual other) {
      fortuitousProfitTax(other.getFortuitousProfitTax());
      totalTaxOnTaxableNetIncome(other.getTotalTaxOnTaxableNetIncome());
      netIncomeTax(other.getNetIncomeTax());
      totalTaxDue(other.getTotalTaxDue());
      previousYearBalance(other.getPreviousYearBalance());
      totalWithheldTax(other.getTotalWithheldTax());
      balancePayable(other.getBalancePayable());
      balanceRefundable(other.getBalanceRefundable());
      totalPayment(other.getTotalPayment());
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
     * <p>After additional deductions that you can apply, this will be the net income tax. If not further deduction are identified, this value will be the same as <code>total_tax_on_taxable_net_income</code>.</p>
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
    public PreviousYearBalanceStage totalTaxDue(double totalTaxDue) {
      this.totalTaxDue = totalTaxDue;
      return this;
    }

    /**
     * <p>Only applicable for DIAN.</p>
     * <p>The amount the tax payer has as a &quot;credit&quot; fromt he previous year (this is equal to the <code>balance_refundable</code>) of the previous year.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("previous_year_balance")
    public TotalWithheldTaxStage previousYearBalance(double previousYearBalance) {
      this.previousYearBalance = previousYearBalance;
      return this;
    }

    /**
     * <p>The total tax already withheld in the current fiscal year.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("total_withheld_tax")
    public BalancePayableStage totalWithheldTax(double totalWithheldTax) {
      this.totalWithheldTax = totalWithheldTax;
      return this;
    }

    /**
     * <p>How much the tax payer is required to pay.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("balance_payable")
    public BalanceRefundableStage balancePayable(double balancePayable) {
      this.balancePayable = balancePayable;
      return this;
    }

    /**
     * <p>How much the tax payer is expected to receive. For DIAN, this will count as credit for the next fiscal year (see <code>previous_year_balance</code>).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("balance_refundable")
    public TotalPaymentStage balanceRefundable(double balanceRefundable) {
      this.balanceRefundable = balanceRefundable;
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
    public TaxAssessmentIndividual build() {
      return new TaxAssessmentIndividual(fortuitousProfitTax, totalTaxOnTaxableNetIncome, netIncomeTax, totalTaxDue, previousYearBalance, totalWithheldTax, balancePayable, balanceRefundable, totalPayment);
    }
  }
}
