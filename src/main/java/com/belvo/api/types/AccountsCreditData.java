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
    builder = AccountsCreditData.Builder.class
)
public final class AccountsCreditData {
  private final Optional<Double> creditLimit;

  private final Optional<String> collectedAt;

  private final Optional<String> cuttingDate;

  private final Optional<String> nextPaymentDate;

  private final Optional<Double> minimumPayment;

  private final Optional<Double> noInterestPayment;

  private final Optional<Double> interestRate;

  private final Optional<String> endDate;

  private final Optional<Double> monthlyPayment;

  private final Optional<String> lastPaymentDate;

  private int _cachedHashCode;

  AccountsCreditData(Optional<Double> creditLimit, Optional<String> collectedAt,
      Optional<String> cuttingDate, Optional<String> nextPaymentDate,
      Optional<Double> minimumPayment, Optional<Double> noInterestPayment,
      Optional<Double> interestRate, Optional<String> endDate, Optional<Double> monthlyPayment,
      Optional<String> lastPaymentDate) {
    this.creditLimit = creditLimit;
    this.collectedAt = collectedAt;
    this.cuttingDate = cuttingDate;
    this.nextPaymentDate = nextPaymentDate;
    this.minimumPayment = minimumPayment;
    this.noInterestPayment = noInterestPayment;
    this.interestRate = interestRate;
    this.endDate = endDate;
    this.monthlyPayment = monthlyPayment;
    this.lastPaymentDate = lastPaymentDate;
  }

  /**
   * @return The maximum amount of credit the owner can receive.
   */
  @JsonProperty("credit_limit")
  public Optional<Double> getCreditLimit() {
    return creditLimit;
  }

  /**
   * @return The ISO-8601 timestamp when the data point was collected.
   */
  @JsonProperty("collected_at")
  public Optional<String> getCollectedAt() {
    return collectedAt;
  }

  /**
   * @return The closing date of the credit period.
   */
  @JsonProperty("cutting_date")
  public Optional<String> getCuttingDate() {
    return cuttingDate;
  }

  /**
   * @return The due date for the next payment (<code>YYYY-MM-DD</code>).
   */
  @JsonProperty("next_payment_date")
  public Optional<String> getNextPaymentDate() {
    return nextPaymentDate;
  }

  /**
   * @return The minimum amount to be paid on the <code>next_payment_date</code>.
   */
  @JsonProperty("minimum_payment")
  public Optional<Double> getMinimumPayment() {
    return minimumPayment;
  }

  /**
   * @return The minimum amount required to pay to avoid generating interest.
   */
  @JsonProperty("no_interest_payment")
  public Optional<Double> getNoInterestPayment() {
    return noInterestPayment;
  }

  /**
   * @return The annualized interest rate of the credit.
   */
  @JsonProperty("interest_rate")
  public Optional<Double> getInterestRate() {
    return interestRate;
  }

  /**
   * @return <em>This field has been deprecated.</em>
   */
  @JsonProperty("end_date")
  public Optional<String> getEndDate() {
    return endDate;
  }

  /**
   * @return <em>This field has been deprecated.</em>
   * <p><em>The recurrent monthly payment, if applicable.</em></p>
   */
  @JsonProperty("monthly_payment")
  public Optional<Double> getMonthlyPayment() {
    return monthlyPayment;
  }

  /**
   * @return <em>This field has been deprecated.</em>
   * <p><em>The date when the last credit payment was made.</em></p>
   */
  @JsonProperty("last_payment_date")
  public Optional<String> getLastPaymentDate() {
    return lastPaymentDate;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AccountsCreditData && equalTo((AccountsCreditData) other);
  }

  private boolean equalTo(AccountsCreditData other) {
    return creditLimit.equals(other.creditLimit) && collectedAt.equals(other.collectedAt) && cuttingDate.equals(other.cuttingDate) && nextPaymentDate.equals(other.nextPaymentDate) && minimumPayment.equals(other.minimumPayment) && noInterestPayment.equals(other.noInterestPayment) && interestRate.equals(other.interestRate) && endDate.equals(other.endDate) && monthlyPayment.equals(other.monthlyPayment) && lastPaymentDate.equals(other.lastPaymentDate);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.creditLimit, this.collectedAt, this.cuttingDate, this.nextPaymentDate, this.minimumPayment, this.noInterestPayment, this.interestRate, this.endDate, this.monthlyPayment, this.lastPaymentDate);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AccountsCreditData{" + "creditLimit: " + creditLimit + ", collectedAt: " + collectedAt + ", cuttingDate: " + cuttingDate + ", nextPaymentDate: " + nextPaymentDate + ", minimumPayment: " + minimumPayment + ", noInterestPayment: " + noInterestPayment + ", interestRate: " + interestRate + ", endDate: " + endDate + ", monthlyPayment: " + monthlyPayment + ", lastPaymentDate: " + lastPaymentDate + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<Double> creditLimit = Optional.empty();

    private Optional<String> collectedAt = Optional.empty();

    private Optional<String> cuttingDate = Optional.empty();

    private Optional<String> nextPaymentDate = Optional.empty();

    private Optional<Double> minimumPayment = Optional.empty();

    private Optional<Double> noInterestPayment = Optional.empty();

    private Optional<Double> interestRate = Optional.empty();

    private Optional<String> endDate = Optional.empty();

    private Optional<Double> monthlyPayment = Optional.empty();

    private Optional<String> lastPaymentDate = Optional.empty();

    private Builder() {
    }

    public Builder from(AccountsCreditData other) {
      creditLimit(other.getCreditLimit());
      collectedAt(other.getCollectedAt());
      cuttingDate(other.getCuttingDate());
      nextPaymentDate(other.getNextPaymentDate());
      minimumPayment(other.getMinimumPayment());
      noInterestPayment(other.getNoInterestPayment());
      interestRate(other.getInterestRate());
      endDate(other.getEndDate());
      monthlyPayment(other.getMonthlyPayment());
      lastPaymentDate(other.getLastPaymentDate());
      return this;
    }

    @JsonSetter(
        value = "credit_limit",
        nulls = Nulls.SKIP
    )
    public Builder creditLimit(Optional<Double> creditLimit) {
      this.creditLimit = creditLimit;
      return this;
    }

    public Builder creditLimit(Double creditLimit) {
      this.creditLimit = Optional.of(creditLimit);
      return this;
    }

    @JsonSetter(
        value = "collected_at",
        nulls = Nulls.SKIP
    )
    public Builder collectedAt(Optional<String> collectedAt) {
      this.collectedAt = collectedAt;
      return this;
    }

    public Builder collectedAt(String collectedAt) {
      this.collectedAt = Optional.of(collectedAt);
      return this;
    }

    @JsonSetter(
        value = "cutting_date",
        nulls = Nulls.SKIP
    )
    public Builder cuttingDate(Optional<String> cuttingDate) {
      this.cuttingDate = cuttingDate;
      return this;
    }

    public Builder cuttingDate(String cuttingDate) {
      this.cuttingDate = Optional.of(cuttingDate);
      return this;
    }

    @JsonSetter(
        value = "next_payment_date",
        nulls = Nulls.SKIP
    )
    public Builder nextPaymentDate(Optional<String> nextPaymentDate) {
      this.nextPaymentDate = nextPaymentDate;
      return this;
    }

    public Builder nextPaymentDate(String nextPaymentDate) {
      this.nextPaymentDate = Optional.of(nextPaymentDate);
      return this;
    }

    @JsonSetter(
        value = "minimum_payment",
        nulls = Nulls.SKIP
    )
    public Builder minimumPayment(Optional<Double> minimumPayment) {
      this.minimumPayment = minimumPayment;
      return this;
    }

    public Builder minimumPayment(Double minimumPayment) {
      this.minimumPayment = Optional.of(minimumPayment);
      return this;
    }

    @JsonSetter(
        value = "no_interest_payment",
        nulls = Nulls.SKIP
    )
    public Builder noInterestPayment(Optional<Double> noInterestPayment) {
      this.noInterestPayment = noInterestPayment;
      return this;
    }

    public Builder noInterestPayment(Double noInterestPayment) {
      this.noInterestPayment = Optional.of(noInterestPayment);
      return this;
    }

    @JsonSetter(
        value = "interest_rate",
        nulls = Nulls.SKIP
    )
    public Builder interestRate(Optional<Double> interestRate) {
      this.interestRate = interestRate;
      return this;
    }

    public Builder interestRate(Double interestRate) {
      this.interestRate = Optional.of(interestRate);
      return this;
    }

    @JsonSetter(
        value = "end_date",
        nulls = Nulls.SKIP
    )
    public Builder endDate(Optional<String> endDate) {
      this.endDate = endDate;
      return this;
    }

    public Builder endDate(String endDate) {
      this.endDate = Optional.of(endDate);
      return this;
    }

    @JsonSetter(
        value = "monthly_payment",
        nulls = Nulls.SKIP
    )
    public Builder monthlyPayment(Optional<Double> monthlyPayment) {
      this.monthlyPayment = monthlyPayment;
      return this;
    }

    public Builder monthlyPayment(Double monthlyPayment) {
      this.monthlyPayment = Optional.of(monthlyPayment);
      return this;
    }

    @JsonSetter(
        value = "last_payment_date",
        nulls = Nulls.SKIP
    )
    public Builder lastPaymentDate(Optional<String> lastPaymentDate) {
      this.lastPaymentDate = lastPaymentDate;
      return this;
    }

    public Builder lastPaymentDate(String lastPaymentDate) {
      this.lastPaymentDate = Optional.of(lastPaymentDate);
      return this;
    }

    public AccountsCreditData build() {
      return new AccountsCreditData(creditLimit, collectedAt, cuttingDate, nextPaymentDate, minimumPayment, noInterestPayment, interestRate, endDate, monthlyPayment, lastPaymentDate);
    }
  }
}
