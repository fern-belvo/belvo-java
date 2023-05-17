package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = RiskInsightsLoansMetrics.Builder.class
)
public final class RiskInsightsLoansMetrics {
  private final int numAccounts;

  private final Optional<Double> sumLoansPrincipal;

  private final Optional<Double> sumLoansOutstandingPrincipal;

  private final Optional<Double> sumLoansMonthlyPayment;

  private int _cachedHashCode;

  RiskInsightsLoansMetrics(int numAccounts, Optional<Double> sumLoansPrincipal,
      Optional<Double> sumLoansOutstandingPrincipal, Optional<Double> sumLoansMonthlyPayment) {
    this.numAccounts = numAccounts;
    this.sumLoansPrincipal = sumLoansPrincipal;
    this.sumLoansOutstandingPrincipal = sumLoansOutstandingPrincipal;
    this.sumLoansMonthlyPayment = sumLoansMonthlyPayment;
  }

  /**
   * @return Number of loan accounts associated with the link.
   */
  @JsonProperty("num_accounts")
  public int getNumAccounts() {
    return numAccounts;
  }

  /**
   * @return Sum total of the principal for all of the link's loan accounts.
   */
  @JsonProperty("sum_loans_principal")
  public Optional<Double> getSumLoansPrincipal() {
    return sumLoansPrincipal;
  }

  /**
   * @return Sum total of the outstanding principal for all the link's loan accounts.
   */
  @JsonProperty("sum_loans_outstanding_principal")
  public Optional<Double> getSumLoansOutstandingPrincipal() {
    return sumLoansOutstandingPrincipal;
  }

  /**
   * @return Sum total of the monthly payments for all the link's loan accounts.
   */
  @JsonProperty("sum_loans_monthly_payment")
  public Optional<Double> getSumLoansMonthlyPayment() {
    return sumLoansMonthlyPayment;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof RiskInsightsLoansMetrics && equalTo((RiskInsightsLoansMetrics) other);
  }

  private boolean equalTo(RiskInsightsLoansMetrics other) {
    return numAccounts == other.numAccounts && sumLoansPrincipal.equals(other.sumLoansPrincipal) && sumLoansOutstandingPrincipal.equals(other.sumLoansOutstandingPrincipal) && sumLoansMonthlyPayment.equals(other.sumLoansMonthlyPayment);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.numAccounts, this.sumLoansPrincipal, this.sumLoansOutstandingPrincipal, this.sumLoansMonthlyPayment);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "RiskInsightsLoansMetrics{" + "numAccounts: " + numAccounts + ", sumLoansPrincipal: " + sumLoansPrincipal + ", sumLoansOutstandingPrincipal: " + sumLoansOutstandingPrincipal + ", sumLoansMonthlyPayment: " + sumLoansMonthlyPayment + "}";
  }

  public static NumAccountsStage builder() {
    return new Builder();
  }

  public interface NumAccountsStage {
    _FinalStage numAccounts(int numAccounts);

    Builder from(RiskInsightsLoansMetrics other);
  }

  public interface _FinalStage {
    RiskInsightsLoansMetrics build();

    _FinalStage sumLoansPrincipal(Optional<Double> sumLoansPrincipal);

    _FinalStage sumLoansPrincipal(Double sumLoansPrincipal);

    _FinalStage sumLoansOutstandingPrincipal(Optional<Double> sumLoansOutstandingPrincipal);

    _FinalStage sumLoansOutstandingPrincipal(Double sumLoansOutstandingPrincipal);

    _FinalStage sumLoansMonthlyPayment(Optional<Double> sumLoansMonthlyPayment);

    _FinalStage sumLoansMonthlyPayment(Double sumLoansMonthlyPayment);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements NumAccountsStage, _FinalStage {
    private int numAccounts;

    private Optional<Double> sumLoansMonthlyPayment = Optional.empty();

    private Optional<Double> sumLoansOutstandingPrincipal = Optional.empty();

    private Optional<Double> sumLoansPrincipal = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(RiskInsightsLoansMetrics other) {
      numAccounts(other.getNumAccounts());
      sumLoansPrincipal(other.getSumLoansPrincipal());
      sumLoansOutstandingPrincipal(other.getSumLoansOutstandingPrincipal());
      sumLoansMonthlyPayment(other.getSumLoansMonthlyPayment());
      return this;
    }

    /**
     * <p>Number of loan accounts associated with the link.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("num_accounts")
    public _FinalStage numAccounts(int numAccounts) {
      this.numAccounts = numAccounts;
      return this;
    }

    /**
     * <p>Sum total of the monthly payments for all the link's loan accounts.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage sumLoansMonthlyPayment(Double sumLoansMonthlyPayment) {
      this.sumLoansMonthlyPayment = Optional.of(sumLoansMonthlyPayment);
      return this;
    }

    @Override
    @JsonSetter(
        value = "sum_loans_monthly_payment",
        nulls = Nulls.SKIP
    )
    public _FinalStage sumLoansMonthlyPayment(Optional<Double> sumLoansMonthlyPayment) {
      this.sumLoansMonthlyPayment = sumLoansMonthlyPayment;
      return this;
    }

    /**
     * <p>Sum total of the outstanding principal for all the link's loan accounts.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage sumLoansOutstandingPrincipal(Double sumLoansOutstandingPrincipal) {
      this.sumLoansOutstandingPrincipal = Optional.of(sumLoansOutstandingPrincipal);
      return this;
    }

    @Override
    @JsonSetter(
        value = "sum_loans_outstanding_principal",
        nulls = Nulls.SKIP
    )
    public _FinalStage sumLoansOutstandingPrincipal(Optional<Double> sumLoansOutstandingPrincipal) {
      this.sumLoansOutstandingPrincipal = sumLoansOutstandingPrincipal;
      return this;
    }

    /**
     * <p>Sum total of the principal for all of the link's loan accounts.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage sumLoansPrincipal(Double sumLoansPrincipal) {
      this.sumLoansPrincipal = Optional.of(sumLoansPrincipal);
      return this;
    }

    @Override
    @JsonSetter(
        value = "sum_loans_principal",
        nulls = Nulls.SKIP
    )
    public _FinalStage sumLoansPrincipal(Optional<Double> sumLoansPrincipal) {
      this.sumLoansPrincipal = sumLoansPrincipal;
      return this;
    }

    @Override
    public RiskInsightsLoansMetrics build() {
      return new RiskInsightsLoansMetrics(numAccounts, sumLoansPrincipal, sumLoansOutstandingPrincipal, sumLoansMonthlyPayment);
    }
  }
}
