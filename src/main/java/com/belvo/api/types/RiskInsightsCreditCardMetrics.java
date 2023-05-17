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
    builder = RiskInsightsCreditCardMetrics.Builder.class
)
public final class RiskInsightsCreditCardMetrics {
  private final int numAccounts;

  private final Optional<Double> sumCreditLimit;

  private final Optional<Double> sumCreditUsed;

  private int _cachedHashCode;

  RiskInsightsCreditCardMetrics(int numAccounts, Optional<Double> sumCreditLimit,
      Optional<Double> sumCreditUsed) {
    this.numAccounts = numAccounts;
    this.sumCreditLimit = sumCreditLimit;
    this.sumCreditUsed = sumCreditUsed;
  }

  /**
   * @return Number of credit cards accounts associated to the link.
   */
  @JsonProperty("num_accounts")
  public int getNumAccounts() {
    return numAccounts;
  }

  /**
   * @return Sum total of all credit cards' limits.
   */
  @JsonProperty("sum_credit_limit")
  public Optional<Double> getSumCreditLimit() {
    return sumCreditLimit;
  }

  /**
   * @return Sum total of all credit used.
   */
  @JsonProperty("sum_credit_used")
  public Optional<Double> getSumCreditUsed() {
    return sumCreditUsed;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof RiskInsightsCreditCardMetrics && equalTo((RiskInsightsCreditCardMetrics) other);
  }

  private boolean equalTo(RiskInsightsCreditCardMetrics other) {
    return numAccounts == other.numAccounts && sumCreditLimit.equals(other.sumCreditLimit) && sumCreditUsed.equals(other.sumCreditUsed);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.numAccounts, this.sumCreditLimit, this.sumCreditUsed);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "RiskInsightsCreditCardMetrics{" + "numAccounts: " + numAccounts + ", sumCreditLimit: " + sumCreditLimit + ", sumCreditUsed: " + sumCreditUsed + "}";
  }

  public static NumAccountsStage builder() {
    return new Builder();
  }

  public interface NumAccountsStage {
    _FinalStage numAccounts(int numAccounts);

    Builder from(RiskInsightsCreditCardMetrics other);
  }

  public interface _FinalStage {
    RiskInsightsCreditCardMetrics build();

    _FinalStage sumCreditLimit(Optional<Double> sumCreditLimit);

    _FinalStage sumCreditLimit(Double sumCreditLimit);

    _FinalStage sumCreditUsed(Optional<Double> sumCreditUsed);

    _FinalStage sumCreditUsed(Double sumCreditUsed);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements NumAccountsStage, _FinalStage {
    private int numAccounts;

    private Optional<Double> sumCreditUsed = Optional.empty();

    private Optional<Double> sumCreditLimit = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(RiskInsightsCreditCardMetrics other) {
      numAccounts(other.getNumAccounts());
      sumCreditLimit(other.getSumCreditLimit());
      sumCreditUsed(other.getSumCreditUsed());
      return this;
    }

    /**
     * <p>Number of credit cards accounts associated to the link.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("num_accounts")
    public _FinalStage numAccounts(int numAccounts) {
      this.numAccounts = numAccounts;
      return this;
    }

    /**
     * <p>Sum total of all credit used.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage sumCreditUsed(Double sumCreditUsed) {
      this.sumCreditUsed = Optional.of(sumCreditUsed);
      return this;
    }

    @Override
    @JsonSetter(
        value = "sum_credit_used",
        nulls = Nulls.SKIP
    )
    public _FinalStage sumCreditUsed(Optional<Double> sumCreditUsed) {
      this.sumCreditUsed = sumCreditUsed;
      return this;
    }

    /**
     * <p>Sum total of all credit cards' limits.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage sumCreditLimit(Double sumCreditLimit) {
      this.sumCreditLimit = Optional.of(sumCreditLimit);
      return this;
    }

    @Override
    @JsonSetter(
        value = "sum_credit_limit",
        nulls = Nulls.SKIP
    )
    public _FinalStage sumCreditLimit(Optional<Double> sumCreditLimit) {
      this.sumCreditLimit = sumCreditLimit;
      return this;
    }

    @Override
    public RiskInsightsCreditCardMetrics build() {
      return new RiskInsightsCreditCardMetrics(numAccounts, sumCreditLimit, sumCreditUsed);
    }
  }
}
