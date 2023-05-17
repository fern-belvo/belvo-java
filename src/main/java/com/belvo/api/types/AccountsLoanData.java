package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = AccountsLoanData.Builder.class
)
public final class AccountsLoanData {
  private final String collectedAt;

  private final Optional<Double> contractAmount;

  private final Optional<Double> principal;

  private final Optional<String> loanType;

  private final Optional<String> paymentDay;

  private final Optional<Double> outstandingPrincipal;

  private final Optional<Double> outstandingBalance;

  private final Optional<Double> monthlyPayment;

  private final Optional<List<AccountsLoanDataInterestRate>> interestRates;

  private final Optional<List<AccountsLoanDataFees>> fees;

  private final Optional<Integer> numberOfInstallmentsTotal;

  private final Optional<Integer> numberOfInstallmentsOutstanding;

  private final Optional<String> contractStartDate;

  private final Optional<String> contractEndDate;

  private final Optional<String> contractNumber;

  private final Optional<Double> creditLimit;

  private final Optional<Double> lastPeriodBalance;

  private final Optional<Double> interestRate;

  private final Optional<String> limitDay;

  private final Optional<String> cuttingDay;

  private final Optional<String> cuttingDate;

  private final Optional<String> lastPaymentDate;

  private final Optional<Double> noInterestPayment;

  private int _cachedHashCode;

  AccountsLoanData(String collectedAt, Optional<Double> contractAmount, Optional<Double> principal,
      Optional<String> loanType, Optional<String> paymentDay, Optional<Double> outstandingPrincipal,
      Optional<Double> outstandingBalance, Optional<Double> monthlyPayment,
      Optional<List<AccountsLoanDataInterestRate>> interestRates,
      Optional<List<AccountsLoanDataFees>> fees, Optional<Integer> numberOfInstallmentsTotal,
      Optional<Integer> numberOfInstallmentsOutstanding, Optional<String> contractStartDate,
      Optional<String> contractEndDate, Optional<String> contractNumber,
      Optional<Double> creditLimit, Optional<Double> lastPeriodBalance,
      Optional<Double> interestRate, Optional<String> limitDay, Optional<String> cuttingDay,
      Optional<String> cuttingDate, Optional<String> lastPaymentDate,
      Optional<Double> noInterestPayment) {
    this.collectedAt = collectedAt;
    this.contractAmount = contractAmount;
    this.principal = principal;
    this.loanType = loanType;
    this.paymentDay = paymentDay;
    this.outstandingPrincipal = outstandingPrincipal;
    this.outstandingBalance = outstandingBalance;
    this.monthlyPayment = monthlyPayment;
    this.interestRates = interestRates;
    this.fees = fees;
    this.numberOfInstallmentsTotal = numberOfInstallmentsTotal;
    this.numberOfInstallmentsOutstanding = numberOfInstallmentsOutstanding;
    this.contractStartDate = contractStartDate;
    this.contractEndDate = contractEndDate;
    this.contractNumber = contractNumber;
    this.creditLimit = creditLimit;
    this.lastPeriodBalance = lastPeriodBalance;
    this.interestRate = interestRate;
    this.limitDay = limitDay;
    this.cuttingDay = cuttingDay;
    this.cuttingDate = cuttingDate;
    this.lastPaymentDate = lastPaymentDate;
    this.noInterestPayment = noInterestPayment;
  }

  /**
   * @return The ISO-8601 timestamp when the data point was collected.
   */
  @JsonProperty("collected_at")
  public String getCollectedAt() {
    return collectedAt;
  }

  /**
   * @return The initial total loan amount, calculated by the institution, when the contract was signed. This amount includes the principal + interest + taxes + fees.
   */
  @JsonProperty("contract_amount")
  public Optional<Double> getContractAmount() {
    return contractAmount;
  }

  /**
   * @return Total amount of the loan (the amount the user receives).
   */
  @JsonProperty("principal")
  public Optional<Double> getPrincipal() {
    return principal;
  }

  /**
   * @return The type of the loan, according to the institution.
   */
  @JsonProperty("loan_type")
  public Optional<String> getLoanType() {
    return loanType;
  }

  /**
   * @return The day of the month by which the owner needs to pay the loan (<code>YYYY-MM-DD</code>).
   */
  @JsonProperty("payment_day")
  public Optional<String> getPaymentDay() {
    return paymentDay;
  }

  /**
   * @return Outstanding loan amount, that is, how much remains to pay on the principal (not including interest).
   */
  @JsonProperty("outstanding_principal")
  public Optional<Double> getOutstandingPrincipal() {
    return outstandingPrincipal;
  }

  /**
   * @return The amount remaining to pay in total, including interest.
   */
  @JsonProperty("outstanding_balance")
  public Optional<Double> getOutstandingBalance() {
    return outstandingBalance;
  }

  /**
   * @return The recurrent monthly payment, if applicable.
   */
  @JsonProperty("monthly_payment")
  public Optional<Double> getMonthlyPayment() {
    return monthlyPayment;
  }

  /**
   * @return Breakdown of the interest applied to the loan.
   */
  @JsonProperty("interest_rates")
  public Optional<List<AccountsLoanDataInterestRate>> getInterestRates() {
    return interestRates;
  }

  /**
   * @return Breakdown of the fees applied to the loan.
   */
  @JsonProperty("fees")
  public Optional<List<AccountsLoanDataFees>> getFees() {
    return fees;
  }

  /**
   * @return The total number of installments required to pay the loan.
   */
  @JsonProperty("number_of_installments_total")
  public Optional<Integer> getNumberOfInstallmentsTotal() {
    return numberOfInstallmentsTotal;
  }

  /**
   * @return The number of installments left to pay.
   */
  @JsonProperty("number_of_installments_outstanding")
  public Optional<Integer> getNumberOfInstallmentsOutstanding() {
    return numberOfInstallmentsOutstanding;
  }

  /**
   * @return The date when the loan contract was signed (<code>YYYY-MM-DD</code>).
   */
  @JsonProperty("contract_start_date")
  public Optional<String> getContractStartDate() {
    return contractStartDate;
  }

  /**
   * @return The date when the loan is expected to be completed.
   */
  @JsonProperty("contract_end_date")
  public Optional<String> getContractEndDate() {
    return contractEndDate;
  }

  /**
   * @return The contract number of the loan, as given by the institution.
   */
  @JsonProperty("contract_number")
  public Optional<String> getContractNumber() {
    return contractNumber;
  }

  /**
   * @return This field has been deprecated.
   * <p>Please see <code>principal</code> instead.</p>
   */
  @JsonProperty("credit_limit")
  public Optional<Double> getCreditLimit() {
    return creditLimit;
  }

  /**
   * @return This field has been deprecated.
   * <p>Please see <code>outstanding_balance</code> instead.</p>
   */
  @JsonProperty("last_period_balance")
  public Optional<Double> getLastPeriodBalance() {
    return lastPeriodBalance;
  }

  /**
   * @return This field has been deprecated.
   * <p>Please see the <code>interest_rates</code> object instead.</p>
   */
  @JsonProperty("interest_rate")
  public Optional<Double> getInterestRate() {
    return interestRate;
  }

  /**
   * @return This field has been deprecated.
   * <p>Please see <code>payment_day</code> instead.</p>
   */
  @JsonProperty("limit_day")
  public Optional<String> getLimitDay() {
    return limitDay;
  }

  /**
   * @return This field has been deprecated.
   * <p>The closing day of the month for the loan.</p>
   */
  @JsonProperty("cutting_day")
  public Optional<String> getCuttingDay() {
    return cuttingDay;
  }

  /**
   * @return This field has been deprecated.
   * <p>The closing date of the loan period.</p>
   */
  @JsonProperty("cutting_date")
  public Optional<String> getCuttingDate() {
    return cuttingDate;
  }

  /**
   * @return This field has been deprecated.
   * <p>The date when the last loan payment was made.</p>
   */
  @JsonProperty("last_payment_date")
  public Optional<String> getLastPaymentDate() {
    return lastPaymentDate;
  }

  /**
   * @return This field has been deprecated.
   * <p>The minimum amount required to pay to avoid generating interest.</p>
   */
  @JsonProperty("no_interest_payment")
  public Optional<Double> getNoInterestPayment() {
    return noInterestPayment;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AccountsLoanData && equalTo((AccountsLoanData) other);
  }

  private boolean equalTo(AccountsLoanData other) {
    return collectedAt.equals(other.collectedAt) && contractAmount.equals(other.contractAmount) && principal.equals(other.principal) && loanType.equals(other.loanType) && paymentDay.equals(other.paymentDay) && outstandingPrincipal.equals(other.outstandingPrincipal) && outstandingBalance.equals(other.outstandingBalance) && monthlyPayment.equals(other.monthlyPayment) && interestRates.equals(other.interestRates) && fees.equals(other.fees) && numberOfInstallmentsTotal.equals(other.numberOfInstallmentsTotal) && numberOfInstallmentsOutstanding.equals(other.numberOfInstallmentsOutstanding) && contractStartDate.equals(other.contractStartDate) && contractEndDate.equals(other.contractEndDate) && contractNumber.equals(other.contractNumber) && creditLimit.equals(other.creditLimit) && lastPeriodBalance.equals(other.lastPeriodBalance) && interestRate.equals(other.interestRate) && limitDay.equals(other.limitDay) && cuttingDay.equals(other.cuttingDay) && cuttingDate.equals(other.cuttingDate) && lastPaymentDate.equals(other.lastPaymentDate) && noInterestPayment.equals(other.noInterestPayment);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.collectedAt, this.contractAmount, this.principal, this.loanType, this.paymentDay, this.outstandingPrincipal, this.outstandingBalance, this.monthlyPayment, this.interestRates, this.fees, this.numberOfInstallmentsTotal, this.numberOfInstallmentsOutstanding, this.contractStartDate, this.contractEndDate, this.contractNumber, this.creditLimit, this.lastPeriodBalance, this.interestRate, this.limitDay, this.cuttingDay, this.cuttingDate, this.lastPaymentDate, this.noInterestPayment);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AccountsLoanData{" + "collectedAt: " + collectedAt + ", contractAmount: " + contractAmount + ", principal: " + principal + ", loanType: " + loanType + ", paymentDay: " + paymentDay + ", outstandingPrincipal: " + outstandingPrincipal + ", outstandingBalance: " + outstandingBalance + ", monthlyPayment: " + monthlyPayment + ", interestRates: " + interestRates + ", fees: " + fees + ", numberOfInstallmentsTotal: " + numberOfInstallmentsTotal + ", numberOfInstallmentsOutstanding: " + numberOfInstallmentsOutstanding + ", contractStartDate: " + contractStartDate + ", contractEndDate: " + contractEndDate + ", contractNumber: " + contractNumber + ", creditLimit: " + creditLimit + ", lastPeriodBalance: " + lastPeriodBalance + ", interestRate: " + interestRate + ", limitDay: " + limitDay + ", cuttingDay: " + cuttingDay + ", cuttingDate: " + cuttingDate + ", lastPaymentDate: " + lastPaymentDate + ", noInterestPayment: " + noInterestPayment + "}";
  }

  public static CollectedAtStage builder() {
    return new Builder();
  }

  public interface CollectedAtStage {
    _FinalStage collectedAt(String collectedAt);

    Builder from(AccountsLoanData other);
  }

  public interface _FinalStage {
    AccountsLoanData build();

    _FinalStage contractAmount(Optional<Double> contractAmount);

    _FinalStage contractAmount(Double contractAmount);

    _FinalStage principal(Optional<Double> principal);

    _FinalStage principal(Double principal);

    _FinalStage loanType(Optional<String> loanType);

    _FinalStage loanType(String loanType);

    _FinalStage paymentDay(Optional<String> paymentDay);

    _FinalStage paymentDay(String paymentDay);

    _FinalStage outstandingPrincipal(Optional<Double> outstandingPrincipal);

    _FinalStage outstandingPrincipal(Double outstandingPrincipal);

    _FinalStage outstandingBalance(Optional<Double> outstandingBalance);

    _FinalStage outstandingBalance(Double outstandingBalance);

    _FinalStage monthlyPayment(Optional<Double> monthlyPayment);

    _FinalStage monthlyPayment(Double monthlyPayment);

    _FinalStage interestRates(Optional<List<AccountsLoanDataInterestRate>> interestRates);

    _FinalStage interestRates(List<AccountsLoanDataInterestRate> interestRates);

    _FinalStage fees(Optional<List<AccountsLoanDataFees>> fees);

    _FinalStage fees(List<AccountsLoanDataFees> fees);

    _FinalStage numberOfInstallmentsTotal(Optional<Integer> numberOfInstallmentsTotal);

    _FinalStage numberOfInstallmentsTotal(Integer numberOfInstallmentsTotal);

    _FinalStage numberOfInstallmentsOutstanding(Optional<Integer> numberOfInstallmentsOutstanding);

    _FinalStage numberOfInstallmentsOutstanding(Integer numberOfInstallmentsOutstanding);

    _FinalStage contractStartDate(Optional<String> contractStartDate);

    _FinalStage contractStartDate(String contractStartDate);

    _FinalStage contractEndDate(Optional<String> contractEndDate);

    _FinalStage contractEndDate(String contractEndDate);

    _FinalStage contractNumber(Optional<String> contractNumber);

    _FinalStage contractNumber(String contractNumber);

    _FinalStage creditLimit(Optional<Double> creditLimit);

    _FinalStage creditLimit(Double creditLimit);

    _FinalStage lastPeriodBalance(Optional<Double> lastPeriodBalance);

    _FinalStage lastPeriodBalance(Double lastPeriodBalance);

    _FinalStage interestRate(Optional<Double> interestRate);

    _FinalStage interestRate(Double interestRate);

    _FinalStage limitDay(Optional<String> limitDay);

    _FinalStage limitDay(String limitDay);

    _FinalStage cuttingDay(Optional<String> cuttingDay);

    _FinalStage cuttingDay(String cuttingDay);

    _FinalStage cuttingDate(Optional<String> cuttingDate);

    _FinalStage cuttingDate(String cuttingDate);

    _FinalStage lastPaymentDate(Optional<String> lastPaymentDate);

    _FinalStage lastPaymentDate(String lastPaymentDate);

    _FinalStage noInterestPayment(Optional<Double> noInterestPayment);

    _FinalStage noInterestPayment(Double noInterestPayment);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements CollectedAtStage, _FinalStage {
    private String collectedAt;

    private Optional<Double> noInterestPayment = Optional.empty();

    private Optional<String> lastPaymentDate = Optional.empty();

    private Optional<String> cuttingDate = Optional.empty();

    private Optional<String> cuttingDay = Optional.empty();

    private Optional<String> limitDay = Optional.empty();

    private Optional<Double> interestRate = Optional.empty();

    private Optional<Double> lastPeriodBalance = Optional.empty();

    private Optional<Double> creditLimit = Optional.empty();

    private Optional<String> contractNumber = Optional.empty();

    private Optional<String> contractEndDate = Optional.empty();

    private Optional<String> contractStartDate = Optional.empty();

    private Optional<Integer> numberOfInstallmentsOutstanding = Optional.empty();

    private Optional<Integer> numberOfInstallmentsTotal = Optional.empty();

    private Optional<List<AccountsLoanDataFees>> fees = Optional.empty();

    private Optional<List<AccountsLoanDataInterestRate>> interestRates = Optional.empty();

    private Optional<Double> monthlyPayment = Optional.empty();

    private Optional<Double> outstandingBalance = Optional.empty();

    private Optional<Double> outstandingPrincipal = Optional.empty();

    private Optional<String> paymentDay = Optional.empty();

    private Optional<String> loanType = Optional.empty();

    private Optional<Double> principal = Optional.empty();

    private Optional<Double> contractAmount = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(AccountsLoanData other) {
      collectedAt(other.getCollectedAt());
      contractAmount(other.getContractAmount());
      principal(other.getPrincipal());
      loanType(other.getLoanType());
      paymentDay(other.getPaymentDay());
      outstandingPrincipal(other.getOutstandingPrincipal());
      outstandingBalance(other.getOutstandingBalance());
      monthlyPayment(other.getMonthlyPayment());
      interestRates(other.getInterestRates());
      fees(other.getFees());
      numberOfInstallmentsTotal(other.getNumberOfInstallmentsTotal());
      numberOfInstallmentsOutstanding(other.getNumberOfInstallmentsOutstanding());
      contractStartDate(other.getContractStartDate());
      contractEndDate(other.getContractEndDate());
      contractNumber(other.getContractNumber());
      creditLimit(other.getCreditLimit());
      lastPeriodBalance(other.getLastPeriodBalance());
      interestRate(other.getInterestRate());
      limitDay(other.getLimitDay());
      cuttingDay(other.getCuttingDay());
      cuttingDate(other.getCuttingDate());
      lastPaymentDate(other.getLastPaymentDate());
      noInterestPayment(other.getNoInterestPayment());
      return this;
    }

    /**
     * <p>The ISO-8601 timestamp when the data point was collected.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("collected_at")
    public _FinalStage collectedAt(String collectedAt) {
      this.collectedAt = collectedAt;
      return this;
    }

    /**
     * <p>This field has been deprecated.</p>
     * <p>The minimum amount required to pay to avoid generating interest.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage noInterestPayment(Double noInterestPayment) {
      this.noInterestPayment = Optional.of(noInterestPayment);
      return this;
    }

    @Override
    @JsonSetter(
        value = "no_interest_payment",
        nulls = Nulls.SKIP
    )
    public _FinalStage noInterestPayment(Optional<Double> noInterestPayment) {
      this.noInterestPayment = noInterestPayment;
      return this;
    }

    /**
     * <p>This field has been deprecated.</p>
     * <p>The date when the last loan payment was made.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage lastPaymentDate(String lastPaymentDate) {
      this.lastPaymentDate = Optional.of(lastPaymentDate);
      return this;
    }

    @Override
    @JsonSetter(
        value = "last_payment_date",
        nulls = Nulls.SKIP
    )
    public _FinalStage lastPaymentDate(Optional<String> lastPaymentDate) {
      this.lastPaymentDate = lastPaymentDate;
      return this;
    }

    /**
     * <p>This field has been deprecated.</p>
     * <p>The closing date of the loan period.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage cuttingDate(String cuttingDate) {
      this.cuttingDate = Optional.of(cuttingDate);
      return this;
    }

    @Override
    @JsonSetter(
        value = "cutting_date",
        nulls = Nulls.SKIP
    )
    public _FinalStage cuttingDate(Optional<String> cuttingDate) {
      this.cuttingDate = cuttingDate;
      return this;
    }

    /**
     * <p>This field has been deprecated.</p>
     * <p>The closing day of the month for the loan.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage cuttingDay(String cuttingDay) {
      this.cuttingDay = Optional.of(cuttingDay);
      return this;
    }

    @Override
    @JsonSetter(
        value = "cutting_day",
        nulls = Nulls.SKIP
    )
    public _FinalStage cuttingDay(Optional<String> cuttingDay) {
      this.cuttingDay = cuttingDay;
      return this;
    }

    /**
     * <p>This field has been deprecated.</p>
     * <p>Please see <code>payment_day</code> instead.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage limitDay(String limitDay) {
      this.limitDay = Optional.of(limitDay);
      return this;
    }

    @Override
    @JsonSetter(
        value = "limit_day",
        nulls = Nulls.SKIP
    )
    public _FinalStage limitDay(Optional<String> limitDay) {
      this.limitDay = limitDay;
      return this;
    }

    /**
     * <p>This field has been deprecated.</p>
     * <p>Please see the <code>interest_rates</code> object instead.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage interestRate(Double interestRate) {
      this.interestRate = Optional.of(interestRate);
      return this;
    }

    @Override
    @JsonSetter(
        value = "interest_rate",
        nulls = Nulls.SKIP
    )
    public _FinalStage interestRate(Optional<Double> interestRate) {
      this.interestRate = interestRate;
      return this;
    }

    /**
     * <p>This field has been deprecated.</p>
     * <p>Please see <code>outstanding_balance</code> instead.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage lastPeriodBalance(Double lastPeriodBalance) {
      this.lastPeriodBalance = Optional.of(lastPeriodBalance);
      return this;
    }

    @Override
    @JsonSetter(
        value = "last_period_balance",
        nulls = Nulls.SKIP
    )
    public _FinalStage lastPeriodBalance(Optional<Double> lastPeriodBalance) {
      this.lastPeriodBalance = lastPeriodBalance;
      return this;
    }

    /**
     * <p>This field has been deprecated.</p>
     * <p>Please see <code>principal</code> instead.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage creditLimit(Double creditLimit) {
      this.creditLimit = Optional.of(creditLimit);
      return this;
    }

    @Override
    @JsonSetter(
        value = "credit_limit",
        nulls = Nulls.SKIP
    )
    public _FinalStage creditLimit(Optional<Double> creditLimit) {
      this.creditLimit = creditLimit;
      return this;
    }

    /**
     * <p>The contract number of the loan, as given by the institution.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage contractNumber(String contractNumber) {
      this.contractNumber = Optional.of(contractNumber);
      return this;
    }

    @Override
    @JsonSetter(
        value = "contract_number",
        nulls = Nulls.SKIP
    )
    public _FinalStage contractNumber(Optional<String> contractNumber) {
      this.contractNumber = contractNumber;
      return this;
    }

    /**
     * <p>The date when the loan is expected to be completed.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage contractEndDate(String contractEndDate) {
      this.contractEndDate = Optional.of(contractEndDate);
      return this;
    }

    @Override
    @JsonSetter(
        value = "contract_end_date",
        nulls = Nulls.SKIP
    )
    public _FinalStage contractEndDate(Optional<String> contractEndDate) {
      this.contractEndDate = contractEndDate;
      return this;
    }

    /**
     * <p>The date when the loan contract was signed (<code>YYYY-MM-DD</code>).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage contractStartDate(String contractStartDate) {
      this.contractStartDate = Optional.of(contractStartDate);
      return this;
    }

    @Override
    @JsonSetter(
        value = "contract_start_date",
        nulls = Nulls.SKIP
    )
    public _FinalStage contractStartDate(Optional<String> contractStartDate) {
      this.contractStartDate = contractStartDate;
      return this;
    }

    /**
     * <p>The number of installments left to pay.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage numberOfInstallmentsOutstanding(Integer numberOfInstallmentsOutstanding) {
      this.numberOfInstallmentsOutstanding = Optional.of(numberOfInstallmentsOutstanding);
      return this;
    }

    @Override
    @JsonSetter(
        value = "number_of_installments_outstanding",
        nulls = Nulls.SKIP
    )
    public _FinalStage numberOfInstallmentsOutstanding(
        Optional<Integer> numberOfInstallmentsOutstanding) {
      this.numberOfInstallmentsOutstanding = numberOfInstallmentsOutstanding;
      return this;
    }

    /**
     * <p>The total number of installments required to pay the loan.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage numberOfInstallmentsTotal(Integer numberOfInstallmentsTotal) {
      this.numberOfInstallmentsTotal = Optional.of(numberOfInstallmentsTotal);
      return this;
    }

    @Override
    @JsonSetter(
        value = "number_of_installments_total",
        nulls = Nulls.SKIP
    )
    public _FinalStage numberOfInstallmentsTotal(Optional<Integer> numberOfInstallmentsTotal) {
      this.numberOfInstallmentsTotal = numberOfInstallmentsTotal;
      return this;
    }

    /**
     * <p>Breakdown of the fees applied to the loan.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage fees(List<AccountsLoanDataFees> fees) {
      this.fees = Optional.of(fees);
      return this;
    }

    @Override
    @JsonSetter(
        value = "fees",
        nulls = Nulls.SKIP
    )
    public _FinalStage fees(Optional<List<AccountsLoanDataFees>> fees) {
      this.fees = fees;
      return this;
    }

    /**
     * <p>Breakdown of the interest applied to the loan.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage interestRates(List<AccountsLoanDataInterestRate> interestRates) {
      this.interestRates = Optional.of(interestRates);
      return this;
    }

    @Override
    @JsonSetter(
        value = "interest_rates",
        nulls = Nulls.SKIP
    )
    public _FinalStage interestRates(Optional<List<AccountsLoanDataInterestRate>> interestRates) {
      this.interestRates = interestRates;
      return this;
    }

    /**
     * <p>The recurrent monthly payment, if applicable.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage monthlyPayment(Double monthlyPayment) {
      this.monthlyPayment = Optional.of(monthlyPayment);
      return this;
    }

    @Override
    @JsonSetter(
        value = "monthly_payment",
        nulls = Nulls.SKIP
    )
    public _FinalStage monthlyPayment(Optional<Double> monthlyPayment) {
      this.monthlyPayment = monthlyPayment;
      return this;
    }

    /**
     * <p>The amount remaining to pay in total, including interest.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage outstandingBalance(Double outstandingBalance) {
      this.outstandingBalance = Optional.of(outstandingBalance);
      return this;
    }

    @Override
    @JsonSetter(
        value = "outstanding_balance",
        nulls = Nulls.SKIP
    )
    public _FinalStage outstandingBalance(Optional<Double> outstandingBalance) {
      this.outstandingBalance = outstandingBalance;
      return this;
    }

    /**
     * <p>Outstanding loan amount, that is, how much remains to pay on the principal (not including interest).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage outstandingPrincipal(Double outstandingPrincipal) {
      this.outstandingPrincipal = Optional.of(outstandingPrincipal);
      return this;
    }

    @Override
    @JsonSetter(
        value = "outstanding_principal",
        nulls = Nulls.SKIP
    )
    public _FinalStage outstandingPrincipal(Optional<Double> outstandingPrincipal) {
      this.outstandingPrincipal = outstandingPrincipal;
      return this;
    }

    /**
     * <p>The day of the month by which the owner needs to pay the loan (<code>YYYY-MM-DD</code>).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage paymentDay(String paymentDay) {
      this.paymentDay = Optional.of(paymentDay);
      return this;
    }

    @Override
    @JsonSetter(
        value = "payment_day",
        nulls = Nulls.SKIP
    )
    public _FinalStage paymentDay(Optional<String> paymentDay) {
      this.paymentDay = paymentDay;
      return this;
    }

    /**
     * <p>The type of the loan, according to the institution.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage loanType(String loanType) {
      this.loanType = Optional.of(loanType);
      return this;
    }

    @Override
    @JsonSetter(
        value = "loan_type",
        nulls = Nulls.SKIP
    )
    public _FinalStage loanType(Optional<String> loanType) {
      this.loanType = loanType;
      return this;
    }

    /**
     * <p>Total amount of the loan (the amount the user receives).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage principal(Double principal) {
      this.principal = Optional.of(principal);
      return this;
    }

    @Override
    @JsonSetter(
        value = "principal",
        nulls = Nulls.SKIP
    )
    public _FinalStage principal(Optional<Double> principal) {
      this.principal = principal;
      return this;
    }

    /**
     * <p>The initial total loan amount, calculated by the institution, when the contract was signed. This amount includes the principal + interest + taxes + fees.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage contractAmount(Double contractAmount) {
      this.contractAmount = Optional.of(contractAmount);
      return this;
    }

    @Override
    @JsonSetter(
        value = "contract_amount",
        nulls = Nulls.SKIP
    )
    public _FinalStage contractAmount(Optional<Double> contractAmount) {
      this.contractAmount = contractAmount;
      return this;
    }

    @Override
    public AccountsLoanData build() {
      return new AccountsLoanData(collectedAt, contractAmount, principal, loanType, paymentDay, outstandingPrincipal, outstandingBalance, monthlyPayment, interestRates, fees, numberOfInstallmentsTotal, numberOfInstallmentsOutstanding, contractStartDate, contractEndDate, contractNumber, creditLimit, lastPeriodBalance, interestRate, limitDay, cuttingDay, cuttingDate, lastPaymentDate, noInterestPayment);
    }
  }
}
