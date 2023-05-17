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
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = RiskInsightsBalanceMetrics.Builder.class
)
public final class RiskInsightsBalanceMetrics {
  private final Optional<Double> minBalance1W;

  private final Optional<Double> minBalance1M;

  private final Optional<Double> minBalance3M;

  private final Optional<Double> maxBalance1W;

  private final Optional<Double> maxBalance1M;

  private final Optional<Double> maxBalance3M;

  private final Optional<Double> closingBalance;

  private final Optional<Integer> daysBalanceBelow01W;

  private final Optional<Integer> daysBalanceBelow01M;

  private final Optional<Integer> daysBalanceBelow03M;

  private final Optional<Integer> daysBalanceBelowX1W;

  private final Optional<Integer> daysBalanceBelowX1M;

  private final Optional<Integer> daysBalanceBelowX3M;

  private final double balanceThresholdX;

  private int _cachedHashCode;

  RiskInsightsBalanceMetrics(Optional<Double> minBalance1W, Optional<Double> minBalance1M,
      Optional<Double> minBalance3M, Optional<Double> maxBalance1W, Optional<Double> maxBalance1M,
      Optional<Double> maxBalance3M, Optional<Double> closingBalance,
      Optional<Integer> daysBalanceBelow01W, Optional<Integer> daysBalanceBelow01M,
      Optional<Integer> daysBalanceBelow03M, Optional<Integer> daysBalanceBelowX1W,
      Optional<Integer> daysBalanceBelowX1M, Optional<Integer> daysBalanceBelowX3M,
      double balanceThresholdX) {
    this.minBalance1W = minBalance1W;
    this.minBalance1M = minBalance1M;
    this.minBalance3M = minBalance3M;
    this.maxBalance1W = maxBalance1W;
    this.maxBalance1M = maxBalance1M;
    this.maxBalance3M = maxBalance3M;
    this.closingBalance = closingBalance;
    this.daysBalanceBelow01W = daysBalanceBelow01W;
    this.daysBalanceBelow01M = daysBalanceBelow01M;
    this.daysBalanceBelow03M = daysBalanceBelow03M;
    this.daysBalanceBelowX1W = daysBalanceBelowX1W;
    this.daysBalanceBelowX1M = daysBalanceBelowX1M;
    this.daysBalanceBelowX3M = daysBalanceBelowX3M;
    this.balanceThresholdX = balanceThresholdX;
  }

  /**
   * @return The minimum balance in the period (one week).
   */
  @JsonProperty("min_balance_1w")
  public Optional<Double> getMinBalance1W() {
    return minBalance1W;
  }

  /**
   * @return The minimum balance in the period (one month).
   */
  @JsonProperty("min_balance_1m")
  public Optional<Double> getMinBalance1M() {
    return minBalance1M;
  }

  /**
   * @return The minimum balance in the period (three months).
   */
  @JsonProperty("min_balance_3m")
  public Optional<Double> getMinBalance3M() {
    return minBalance3M;
  }

  /**
   * @return The maximum balance in the period (one week).
   */
  @JsonProperty("max_balance_1w")
  public Optional<Double> getMaxBalance1W() {
    return maxBalance1W;
  }

  /**
   * @return The maximum balance in the period (one month).
   */
  @JsonProperty("max_balance_1m")
  public Optional<Double> getMaxBalance1M() {
    return maxBalance1M;
  }

  /**
   * @return The maximum balance in the period (three months).
   */
  @JsonProperty("max_balance_3m")
  public Optional<Double> getMaxBalance3M() {
    return maxBalance3M;
  }

  /**
   * @return The balance of all the accounts at the <code>collected_at</code> time.
   */
  @JsonProperty("closing_balance")
  public Optional<Double> getClosingBalance() {
    return closingBalance;
  }

  /**
   * @return The number of days that the total balance of the account is less than or equal to 0 in the last week.
   */
  @JsonProperty("days_balance_below_0_1w")
  public Optional<Integer> getDaysBalanceBelow01W() {
    return daysBalanceBelow01W;
  }

  /**
   * @return The number of days that the total balance of the account is less than or equal to 0 in the last month.
   */
  @JsonProperty("days_balance_below_0_1m")
  public Optional<Integer> getDaysBalanceBelow01M() {
    return daysBalanceBelow01M;
  }

  /**
   * @return The number of days that the total balance of the account is less than or equal to 0 in the last three months.
   */
  @JsonProperty("days_balance_below_0_3m")
  public Optional<Integer> getDaysBalanceBelow03M() {
    return daysBalanceBelow03M;
  }

  /**
   * @return The number of days that the total balance of the account is less than or equal to the amount specified in <code>balance_threshold_x</code> in the last week.
   */
  @JsonProperty("days_balance_below_x_1w")
  public Optional<Integer> getDaysBalanceBelowX1W() {
    return daysBalanceBelowX1W;
  }

  /**
   * @return The number of days that the total balance of the account is less than or equal to the amount specified in <code>balance_threshold_x</code> in the last month.
   */
  @JsonProperty("days_balance_below_x_1m")
  public Optional<Integer> getDaysBalanceBelowX1M() {
    return daysBalanceBelowX1M;
  }

  /**
   * @return The number of days that the total balance of the account is less than or equal to the amount specified in <code>balance_threshold_x</code> in the last three months.
   */
  @JsonProperty("days_balance_below_x_3m")
  public Optional<Integer> getDaysBalanceBelowX3M() {
    return daysBalanceBelowX3M;
  }

  /**
   * @return The threshold used to compute <code>days_balance_below_x_period</code>. Please note, this is value is country specific (both in terms of the amount and the currency).
   */
  @JsonProperty("balance_threshold_x")
  public double getBalanceThresholdX() {
    return balanceThresholdX;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof RiskInsightsBalanceMetrics && equalTo((RiskInsightsBalanceMetrics) other);
  }

  private boolean equalTo(RiskInsightsBalanceMetrics other) {
    return minBalance1W.equals(other.minBalance1W) && minBalance1M.equals(other.minBalance1M) && minBalance3M.equals(other.minBalance3M) && maxBalance1W.equals(other.maxBalance1W) && maxBalance1M.equals(other.maxBalance1M) && maxBalance3M.equals(other.maxBalance3M) && closingBalance.equals(other.closingBalance) && daysBalanceBelow01W.equals(other.daysBalanceBelow01W) && daysBalanceBelow01M.equals(other.daysBalanceBelow01M) && daysBalanceBelow03M.equals(other.daysBalanceBelow03M) && daysBalanceBelowX1W.equals(other.daysBalanceBelowX1W) && daysBalanceBelowX1M.equals(other.daysBalanceBelowX1M) && daysBalanceBelowX3M.equals(other.daysBalanceBelowX3M) && balanceThresholdX == other.balanceThresholdX;
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.minBalance1W, this.minBalance1M, this.minBalance3M, this.maxBalance1W, this.maxBalance1M, this.maxBalance3M, this.closingBalance, this.daysBalanceBelow01W, this.daysBalanceBelow01M, this.daysBalanceBelow03M, this.daysBalanceBelowX1W, this.daysBalanceBelowX1M, this.daysBalanceBelowX3M, this.balanceThresholdX);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "RiskInsightsBalanceMetrics{" + "minBalance1W: " + minBalance1W + ", minBalance1M: " + minBalance1M + ", minBalance3M: " + minBalance3M + ", maxBalance1W: " + maxBalance1W + ", maxBalance1M: " + maxBalance1M + ", maxBalance3M: " + maxBalance3M + ", closingBalance: " + closingBalance + ", daysBalanceBelow01W: " + daysBalanceBelow01W + ", daysBalanceBelow01M: " + daysBalanceBelow01M + ", daysBalanceBelow03M: " + daysBalanceBelow03M + ", daysBalanceBelowX1W: " + daysBalanceBelowX1W + ", daysBalanceBelowX1M: " + daysBalanceBelowX1M + ", daysBalanceBelowX3M: " + daysBalanceBelowX3M + ", balanceThresholdX: " + balanceThresholdX + "}";
  }

  public static BalanceThresholdXStage builder() {
    return new Builder();
  }

  public interface BalanceThresholdXStage {
    _FinalStage balanceThresholdX(double balanceThresholdX);

    Builder from(RiskInsightsBalanceMetrics other);
  }

  public interface _FinalStage {
    RiskInsightsBalanceMetrics build();

    _FinalStage minBalance1W(Optional<Double> minBalance1W);

    _FinalStage minBalance1W(Double minBalance1W);

    _FinalStage minBalance1M(Optional<Double> minBalance1M);

    _FinalStage minBalance1M(Double minBalance1M);

    _FinalStage minBalance3M(Optional<Double> minBalance3M);

    _FinalStage minBalance3M(Double minBalance3M);

    _FinalStage maxBalance1W(Optional<Double> maxBalance1W);

    _FinalStage maxBalance1W(Double maxBalance1W);

    _FinalStage maxBalance1M(Optional<Double> maxBalance1M);

    _FinalStage maxBalance1M(Double maxBalance1M);

    _FinalStage maxBalance3M(Optional<Double> maxBalance3M);

    _FinalStage maxBalance3M(Double maxBalance3M);

    _FinalStage closingBalance(Optional<Double> closingBalance);

    _FinalStage closingBalance(Double closingBalance);

    _FinalStage daysBalanceBelow01W(Optional<Integer> daysBalanceBelow01W);

    _FinalStage daysBalanceBelow01W(Integer daysBalanceBelow01W);

    _FinalStage daysBalanceBelow01M(Optional<Integer> daysBalanceBelow01M);

    _FinalStage daysBalanceBelow01M(Integer daysBalanceBelow01M);

    _FinalStage daysBalanceBelow03M(Optional<Integer> daysBalanceBelow03M);

    _FinalStage daysBalanceBelow03M(Integer daysBalanceBelow03M);

    _FinalStage daysBalanceBelowX1W(Optional<Integer> daysBalanceBelowX1W);

    _FinalStage daysBalanceBelowX1W(Integer daysBalanceBelowX1W);

    _FinalStage daysBalanceBelowX1M(Optional<Integer> daysBalanceBelowX1M);

    _FinalStage daysBalanceBelowX1M(Integer daysBalanceBelowX1M);

    _FinalStage daysBalanceBelowX3M(Optional<Integer> daysBalanceBelowX3M);

    _FinalStage daysBalanceBelowX3M(Integer daysBalanceBelowX3M);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements BalanceThresholdXStage, _FinalStage {
    private double balanceThresholdX;

    private Optional<Integer> daysBalanceBelowX3M = Optional.empty();

    private Optional<Integer> daysBalanceBelowX1M = Optional.empty();

    private Optional<Integer> daysBalanceBelowX1W = Optional.empty();

    private Optional<Integer> daysBalanceBelow03M = Optional.empty();

    private Optional<Integer> daysBalanceBelow01M = Optional.empty();

    private Optional<Integer> daysBalanceBelow01W = Optional.empty();

    private Optional<Double> closingBalance = Optional.empty();

    private Optional<Double> maxBalance3M = Optional.empty();

    private Optional<Double> maxBalance1M = Optional.empty();

    private Optional<Double> maxBalance1W = Optional.empty();

    private Optional<Double> minBalance3M = Optional.empty();

    private Optional<Double> minBalance1M = Optional.empty();

    private Optional<Double> minBalance1W = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(RiskInsightsBalanceMetrics other) {
      minBalance1W(other.getMinBalance1W());
      minBalance1M(other.getMinBalance1M());
      minBalance3M(other.getMinBalance3M());
      maxBalance1W(other.getMaxBalance1W());
      maxBalance1M(other.getMaxBalance1M());
      maxBalance3M(other.getMaxBalance3M());
      closingBalance(other.getClosingBalance());
      daysBalanceBelow01W(other.getDaysBalanceBelow01W());
      daysBalanceBelow01M(other.getDaysBalanceBelow01M());
      daysBalanceBelow03M(other.getDaysBalanceBelow03M());
      daysBalanceBelowX1W(other.getDaysBalanceBelowX1W());
      daysBalanceBelowX1M(other.getDaysBalanceBelowX1M());
      daysBalanceBelowX3M(other.getDaysBalanceBelowX3M());
      balanceThresholdX(other.getBalanceThresholdX());
      return this;
    }

    /**
     * <p>The threshold used to compute <code>days_balance_below_x_period</code>. Please note, this is value is country specific (both in terms of the amount and the currency).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("balance_threshold_x")
    public _FinalStage balanceThresholdX(double balanceThresholdX) {
      this.balanceThresholdX = balanceThresholdX;
      return this;
    }

    /**
     * <p>The number of days that the total balance of the account is less than or equal to the amount specified in <code>balance_threshold_x</code> in the last three months.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage daysBalanceBelowX3M(Integer daysBalanceBelowX3M) {
      this.daysBalanceBelowX3M = Optional.of(daysBalanceBelowX3M);
      return this;
    }

    @Override
    @JsonSetter(
        value = "days_balance_below_x_3m",
        nulls = Nulls.SKIP
    )
    public _FinalStage daysBalanceBelowX3M(Optional<Integer> daysBalanceBelowX3M) {
      this.daysBalanceBelowX3M = daysBalanceBelowX3M;
      return this;
    }

    /**
     * <p>The number of days that the total balance of the account is less than or equal to the amount specified in <code>balance_threshold_x</code> in the last month.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage daysBalanceBelowX1M(Integer daysBalanceBelowX1M) {
      this.daysBalanceBelowX1M = Optional.of(daysBalanceBelowX1M);
      return this;
    }

    @Override
    @JsonSetter(
        value = "days_balance_below_x_1m",
        nulls = Nulls.SKIP
    )
    public _FinalStage daysBalanceBelowX1M(Optional<Integer> daysBalanceBelowX1M) {
      this.daysBalanceBelowX1M = daysBalanceBelowX1M;
      return this;
    }

    /**
     * <p>The number of days that the total balance of the account is less than or equal to the amount specified in <code>balance_threshold_x</code> in the last week.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage daysBalanceBelowX1W(Integer daysBalanceBelowX1W) {
      this.daysBalanceBelowX1W = Optional.of(daysBalanceBelowX1W);
      return this;
    }

    @Override
    @JsonSetter(
        value = "days_balance_below_x_1w",
        nulls = Nulls.SKIP
    )
    public _FinalStage daysBalanceBelowX1W(Optional<Integer> daysBalanceBelowX1W) {
      this.daysBalanceBelowX1W = daysBalanceBelowX1W;
      return this;
    }

    /**
     * <p>The number of days that the total balance of the account is less than or equal to 0 in the last three months.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage daysBalanceBelow03M(Integer daysBalanceBelow03M) {
      this.daysBalanceBelow03M = Optional.of(daysBalanceBelow03M);
      return this;
    }

    @Override
    @JsonSetter(
        value = "days_balance_below_0_3m",
        nulls = Nulls.SKIP
    )
    public _FinalStage daysBalanceBelow03M(Optional<Integer> daysBalanceBelow03M) {
      this.daysBalanceBelow03M = daysBalanceBelow03M;
      return this;
    }

    /**
     * <p>The number of days that the total balance of the account is less than or equal to 0 in the last month.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage daysBalanceBelow01M(Integer daysBalanceBelow01M) {
      this.daysBalanceBelow01M = Optional.of(daysBalanceBelow01M);
      return this;
    }

    @Override
    @JsonSetter(
        value = "days_balance_below_0_1m",
        nulls = Nulls.SKIP
    )
    public _FinalStage daysBalanceBelow01M(Optional<Integer> daysBalanceBelow01M) {
      this.daysBalanceBelow01M = daysBalanceBelow01M;
      return this;
    }

    /**
     * <p>The number of days that the total balance of the account is less than or equal to 0 in the last week.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage daysBalanceBelow01W(Integer daysBalanceBelow01W) {
      this.daysBalanceBelow01W = Optional.of(daysBalanceBelow01W);
      return this;
    }

    @Override
    @JsonSetter(
        value = "days_balance_below_0_1w",
        nulls = Nulls.SKIP
    )
    public _FinalStage daysBalanceBelow01W(Optional<Integer> daysBalanceBelow01W) {
      this.daysBalanceBelow01W = daysBalanceBelow01W;
      return this;
    }

    /**
     * <p>The balance of all the accounts at the <code>collected_at</code> time.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage closingBalance(Double closingBalance) {
      this.closingBalance = Optional.of(closingBalance);
      return this;
    }

    @Override
    @JsonSetter(
        value = "closing_balance",
        nulls = Nulls.SKIP
    )
    public _FinalStage closingBalance(Optional<Double> closingBalance) {
      this.closingBalance = closingBalance;
      return this;
    }

    /**
     * <p>The maximum balance in the period (three months).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage maxBalance3M(Double maxBalance3M) {
      this.maxBalance3M = Optional.of(maxBalance3M);
      return this;
    }

    @Override
    @JsonSetter(
        value = "max_balance_3m",
        nulls = Nulls.SKIP
    )
    public _FinalStage maxBalance3M(Optional<Double> maxBalance3M) {
      this.maxBalance3M = maxBalance3M;
      return this;
    }

    /**
     * <p>The maximum balance in the period (one month).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage maxBalance1M(Double maxBalance1M) {
      this.maxBalance1M = Optional.of(maxBalance1M);
      return this;
    }

    @Override
    @JsonSetter(
        value = "max_balance_1m",
        nulls = Nulls.SKIP
    )
    public _FinalStage maxBalance1M(Optional<Double> maxBalance1M) {
      this.maxBalance1M = maxBalance1M;
      return this;
    }

    /**
     * <p>The maximum balance in the period (one week).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage maxBalance1W(Double maxBalance1W) {
      this.maxBalance1W = Optional.of(maxBalance1W);
      return this;
    }

    @Override
    @JsonSetter(
        value = "max_balance_1w",
        nulls = Nulls.SKIP
    )
    public _FinalStage maxBalance1W(Optional<Double> maxBalance1W) {
      this.maxBalance1W = maxBalance1W;
      return this;
    }

    /**
     * <p>The minimum balance in the period (three months).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage minBalance3M(Double minBalance3M) {
      this.minBalance3M = Optional.of(minBalance3M);
      return this;
    }

    @Override
    @JsonSetter(
        value = "min_balance_3m",
        nulls = Nulls.SKIP
    )
    public _FinalStage minBalance3M(Optional<Double> minBalance3M) {
      this.minBalance3M = minBalance3M;
      return this;
    }

    /**
     * <p>The minimum balance in the period (one month).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage minBalance1M(Double minBalance1M) {
      this.minBalance1M = Optional.of(minBalance1M);
      return this;
    }

    @Override
    @JsonSetter(
        value = "min_balance_1m",
        nulls = Nulls.SKIP
    )
    public _FinalStage minBalance1M(Optional<Double> minBalance1M) {
      this.minBalance1M = minBalance1M;
      return this;
    }

    /**
     * <p>The minimum balance in the period (one week).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage minBalance1W(Double minBalance1W) {
      this.minBalance1W = Optional.of(minBalance1W);
      return this;
    }

    @Override
    @JsonSetter(
        value = "min_balance_1w",
        nulls = Nulls.SKIP
    )
    public _FinalStage minBalance1W(Optional<Double> minBalance1W) {
      this.minBalance1W = minBalance1W;
      return this;
    }

    @Override
    public RiskInsightsBalanceMetrics build() {
      return new RiskInsightsBalanceMetrics(minBalance1W, minBalance1M, minBalance3M, maxBalance1W, maxBalance1M, maxBalance3M, closingBalance, daysBalanceBelow01W, daysBalanceBelow01M, daysBalanceBelow03M, daysBalanceBelowX1W, daysBalanceBelowX1M, daysBalanceBelowX3M, balanceThresholdX);
    }
  }
}
