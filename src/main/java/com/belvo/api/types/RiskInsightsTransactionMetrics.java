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
    builder = RiskInsightsTransactionMetrics.Builder.class
)
public final class RiskInsightsTransactionMetrics {
  private final int numTransactions1W;

  private final int numTransactions1M;

  private final int numTransactions3M;

  private final int numIncomingTransactions1W;

  private final int numIncomingTransactions1M;

  private final int numIncomingTransactions3M;

  private final int numOutgoingTransactions1W;

  private final int numOutgoingTransactions1M;

  private final int numOutgoingTransactions3M;

  private final Optional<Double> sumIncomingAmount1W;

  private final Optional<Double> sumIncomingAmount1M;

  private final Optional<Double> sumIncomingAmount3M;

  private final Optional<Double> sumOutgoingAmount1W;

  private final Optional<Double> sumOutgoingAmount1M;

  private final Optional<Double> sumOutgoingAmount3M;

  private final Optional<Double> maxIncomingAmount1W;

  private final Optional<Double> maxIncomingAmount1M;

  private final Optional<Double> maxIncomingAmount3M;

  private final Optional<Double> maxOutgoingAmount1W;

  private final Optional<Double> maxOutgoingAmount1M;

  private final Optional<Double> maxOutgoingAmount3M;

  private final Optional<Double> meanIncomingAmount1W;

  private final Optional<Double> meanIncomingAmount1M;

  private final Optional<Double> meanIncomingAmount3M;

  private final Optional<Double> meanOutgoingAmount1W;

  private final Optional<Double> meanOutgoingAmount1M;

  private final Optional<Double> meanOutgoingAmount3M;

  private int _cachedHashCode;

  RiskInsightsTransactionMetrics(int numTransactions1W, int numTransactions1M,
      int numTransactions3M, int numIncomingTransactions1W, int numIncomingTransactions1M,
      int numIncomingTransactions3M, int numOutgoingTransactions1W, int numOutgoingTransactions1M,
      int numOutgoingTransactions3M, Optional<Double> sumIncomingAmount1W,
      Optional<Double> sumIncomingAmount1M, Optional<Double> sumIncomingAmount3M,
      Optional<Double> sumOutgoingAmount1W, Optional<Double> sumOutgoingAmount1M,
      Optional<Double> sumOutgoingAmount3M, Optional<Double> maxIncomingAmount1W,
      Optional<Double> maxIncomingAmount1M, Optional<Double> maxIncomingAmount3M,
      Optional<Double> maxOutgoingAmount1W, Optional<Double> maxOutgoingAmount1M,
      Optional<Double> maxOutgoingAmount3M, Optional<Double> meanIncomingAmount1W,
      Optional<Double> meanIncomingAmount1M, Optional<Double> meanIncomingAmount3M,
      Optional<Double> meanOutgoingAmount1W, Optional<Double> meanOutgoingAmount1M,
      Optional<Double> meanOutgoingAmount3M) {
    this.numTransactions1W = numTransactions1W;
    this.numTransactions1M = numTransactions1M;
    this.numTransactions3M = numTransactions3M;
    this.numIncomingTransactions1W = numIncomingTransactions1W;
    this.numIncomingTransactions1M = numIncomingTransactions1M;
    this.numIncomingTransactions3M = numIncomingTransactions3M;
    this.numOutgoingTransactions1W = numOutgoingTransactions1W;
    this.numOutgoingTransactions1M = numOutgoingTransactions1M;
    this.numOutgoingTransactions3M = numOutgoingTransactions3M;
    this.sumIncomingAmount1W = sumIncomingAmount1W;
    this.sumIncomingAmount1M = sumIncomingAmount1M;
    this.sumIncomingAmount3M = sumIncomingAmount3M;
    this.sumOutgoingAmount1W = sumOutgoingAmount1W;
    this.sumOutgoingAmount1M = sumOutgoingAmount1M;
    this.sumOutgoingAmount3M = sumOutgoingAmount3M;
    this.maxIncomingAmount1W = maxIncomingAmount1W;
    this.maxIncomingAmount1M = maxIncomingAmount1M;
    this.maxIncomingAmount3M = maxIncomingAmount3M;
    this.maxOutgoingAmount1W = maxOutgoingAmount1W;
    this.maxOutgoingAmount1M = maxOutgoingAmount1M;
    this.maxOutgoingAmount3M = maxOutgoingAmount3M;
    this.meanIncomingAmount1W = meanIncomingAmount1W;
    this.meanIncomingAmount1M = meanIncomingAmount1M;
    this.meanIncomingAmount3M = meanIncomingAmount3M;
    this.meanOutgoingAmount1W = meanOutgoingAmount1W;
    this.meanOutgoingAmount1M = meanOutgoingAmount1M;
    this.meanOutgoingAmount3M = meanOutgoingAmount3M;
  }

  /**
   * @return The total number of transactions analyzed to determine the risk insights for the last week (incoming and outgoing).
   */
  @JsonProperty("num_transactions_1w")
  public int getNumTransactions1W() {
    return numTransactions1W;
  }

  /**
   * @return The total number of transactions analyzed to determine the risk insights for the last month (incoming and outgoing).
   */
  @JsonProperty("num_transactions_1m")
  public int getNumTransactions1M() {
    return numTransactions1M;
  }

  /**
   * @return The total number of transactions analyzed to determine the risk insights for the last three months (incoming and outgoing).
   */
  @JsonProperty("num_transactions_3m")
  public int getNumTransactions3M() {
    return numTransactions3M;
  }

  /**
   * @return The total number of inflow transactions for the last week.
   * <p>ℹ️ <strong>Note</strong>: If there are no transactions between the request date and the last seven or thirty days, the value is <code>0</code>.</p>
   * <p>If the account has not been open long enough to have the transaction data for a given period, we return <code>null</code>. For example, if the account has only been open for five days, we return values for <code>_1w</code> and <code>_1m</code>, however, the value for <code>_3m</code> will be <code>null</code>.</p>
   */
  @JsonProperty("num_incoming_transactions_1w")
  public int getNumIncomingTransactions1W() {
    return numIncomingTransactions1W;
  }

  /**
   * @return The total number of inflow transactions for the last month.
   * <p>ℹ️ <strong>Note</strong>: If there are no transactions between the request date and the last seven or thirty days, the value is <code>0</code>.</p>
   * <p>If the account has not been open long enough to have the transaction data for a given period, we return <code>null</code>. For example, if the account has only been open for five days, we return values for <code>_1w</code> and <code>_1m</code>, however, the value for <code>_3m</code> will be <code>null</code>.</p>
   */
  @JsonProperty("num_incoming_transactions_1m")
  public int getNumIncomingTransactions1M() {
    return numIncomingTransactions1M;
  }

  /**
   * @return The total number of inflow transactions for the last three months.
   * <p>ℹ️ <strong>Note</strong>: If there are no transactions between the request date and the last seven or thirty days, the value is <code>0</code>.</p>
   * <p>If the account has not been open long enough to have the transaction data for a given period, we return <code>null</code>. For example, if the account has only been open for five days, we return values for <code>_1w</code> and <code>_1m</code>, however, the value for <code>_3m</code> will be <code>null</code>.</p>
   */
  @JsonProperty("num_incoming_transactions_3m")
  public int getNumIncomingTransactions3M() {
    return numIncomingTransactions3M;
  }

  /**
   * @return To total number of outflow transactions in the last week.
   * <p>ℹ️ <strong>Note</strong>: If there are no transactions between the request date and the last seven or thirty days, the value is <code>0</code>.</p>
   * <p>If the account has not been open long enough to have the transaction data for a given period, we return <code>null</code>. For example, if the account has only been open for five days, we return values for <code>_1w</code> and <code>_1m</code>, however, the value for <code>_3m</code> will be <code>null</code>.</p>
   */
  @JsonProperty("num_outgoing_transactions_1w")
  public int getNumOutgoingTransactions1W() {
    return numOutgoingTransactions1W;
  }

  /**
   * @return To total number of outflow transactions in the last month.
   * <p>ℹ️ <strong>Note</strong>: If there are no transactions between the request date and the last seven or thirty days, the value is <code>0</code>.</p>
   * <p>If the account has not been open long enough to have the transaction data for a given period, we return <code>null</code>. For example, if the account has only been open for five days, we return values for <code>_1w</code> and <code>_1m</code>, however, the value for <code>_3m</code> will be <code>null</code>.</p>
   */
  @JsonProperty("num_outgoing_transactions_1m")
  public int getNumOutgoingTransactions1M() {
    return numOutgoingTransactions1M;
  }

  /**
   * @return To total number of outflow transactions in the last three months.
   * <p>ℹ️ <strong>Note</strong>: If there are no transactions between the request date and the last seven or thirty days, the value is <code>0</code>.</p>
   * <p>If the account has not been open long enough to have the transaction data for a given period, we return <code>null</code>. For example, if the account has only been open for five days, we return values for <code>_1w</code> and <code>_1m</code>, however, the value for <code>_3m</code> will be <code>null</code>.</p>
   */
  @JsonProperty("num_outgoing_transactions_3m")
  public int getNumOutgoingTransactions3M() {
    return numOutgoingTransactions3M;
  }

  /**
   * @return The total sum of all inflow transactions for the last week.
   */
  @JsonProperty("sum_incoming_amount_1w")
  public Optional<Double> getSumIncomingAmount1W() {
    return sumIncomingAmount1W;
  }

  /**
   * @return The total sum of all inflow transactions for the last month.
   */
  @JsonProperty("sum_incoming_amount_1m")
  public Optional<Double> getSumIncomingAmount1M() {
    return sumIncomingAmount1M;
  }

  /**
   * @return The total sum of all inflow transactions for the last three months.
   */
  @JsonProperty("sum_incoming_amount_3m")
  public Optional<Double> getSumIncomingAmount3M() {
    return sumIncomingAmount3M;
  }

  /**
   * @return The total sum of all outflow transactions for the last week.
   */
  @JsonProperty("sum_outgoing_amount_1w")
  public Optional<Double> getSumOutgoingAmount1W() {
    return sumOutgoingAmount1W;
  }

  /**
   * @return The total sum of all outflow transactions for the last month.
   */
  @JsonProperty("sum_outgoing_amount_1m")
  public Optional<Double> getSumOutgoingAmount1M() {
    return sumOutgoingAmount1M;
  }

  /**
   * @return The total sum of all outflow transactions for the last three months.
   */
  @JsonProperty("sum_outgoing_amount_3m")
  public Optional<Double> getSumOutgoingAmount3M() {
    return sumOutgoingAmount3M;
  }

  /**
   * @return The highest value inflow transaction in the last week.
   */
  @JsonProperty("max_incoming_amount_1w")
  public Optional<Double> getMaxIncomingAmount1W() {
    return maxIncomingAmount1W;
  }

  /**
   * @return The highest value inflow transaction in the last month.
   */
  @JsonProperty("max_incoming_amount_1m")
  public Optional<Double> getMaxIncomingAmount1M() {
    return maxIncomingAmount1M;
  }

  /**
   * @return The highest value inflow transaction in the last three months.
   */
  @JsonProperty("max_incoming_amount_3m")
  public Optional<Double> getMaxIncomingAmount3M() {
    return maxIncomingAmount3M;
  }

  /**
   * @return The highest value outflow transaction in the last week.
   */
  @JsonProperty("max_outgoing_amount_1w")
  public Optional<Double> getMaxOutgoingAmount1W() {
    return maxOutgoingAmount1W;
  }

  /**
   * @return The highest value outflow transaction in the last month.
   */
  @JsonProperty("max_outgoing_amount_1m")
  public Optional<Double> getMaxOutgoingAmount1M() {
    return maxOutgoingAmount1M;
  }

  /**
   * @return The highest value outflow transaction in the last three months.
   */
  @JsonProperty("max_outgoing_amount_3m")
  public Optional<Double> getMaxOutgoingAmount3M() {
    return maxOutgoingAmount3M;
  }

  /**
   * @return The mean incoming value of all transactions in the last week.
   */
  @JsonProperty("mean_incoming_amount_1w")
  public Optional<Double> getMeanIncomingAmount1W() {
    return meanIncomingAmount1W;
  }

  /**
   * @return The mean incoming value of all transactions in the last month.
   */
  @JsonProperty("mean_incoming_amount_1m")
  public Optional<Double> getMeanIncomingAmount1M() {
    return meanIncomingAmount1M;
  }

  /**
   * @return The mean incoming value of all transactions in the last three months.
   */
  @JsonProperty("mean_incoming_amount_3m")
  public Optional<Double> getMeanIncomingAmount3M() {
    return meanIncomingAmount3M;
  }

  /**
   * @return The mean outgoing value of all transaction in the last week.
   */
  @JsonProperty("mean_outgoing_amount_1w")
  public Optional<Double> getMeanOutgoingAmount1W() {
    return meanOutgoingAmount1W;
  }

  /**
   * @return The mean outgoing value of all transaction in the last month.
   */
  @JsonProperty("mean_outgoing_amount_1m")
  public Optional<Double> getMeanOutgoingAmount1M() {
    return meanOutgoingAmount1M;
  }

  /**
   * @return The mean outgoing value of all transaction in the last three months.
   */
  @JsonProperty("mean_outgoing_amount_3m")
  public Optional<Double> getMeanOutgoingAmount3M() {
    return meanOutgoingAmount3M;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof RiskInsightsTransactionMetrics && equalTo((RiskInsightsTransactionMetrics) other);
  }

  private boolean equalTo(RiskInsightsTransactionMetrics other) {
    return numTransactions1W == other.numTransactions1W && numTransactions1M == other.numTransactions1M && numTransactions3M == other.numTransactions3M && numIncomingTransactions1W == other.numIncomingTransactions1W && numIncomingTransactions1M == other.numIncomingTransactions1M && numIncomingTransactions3M == other.numIncomingTransactions3M && numOutgoingTransactions1W == other.numOutgoingTransactions1W && numOutgoingTransactions1M == other.numOutgoingTransactions1M && numOutgoingTransactions3M == other.numOutgoingTransactions3M && sumIncomingAmount1W.equals(other.sumIncomingAmount1W) && sumIncomingAmount1M.equals(other.sumIncomingAmount1M) && sumIncomingAmount3M.equals(other.sumIncomingAmount3M) && sumOutgoingAmount1W.equals(other.sumOutgoingAmount1W) && sumOutgoingAmount1M.equals(other.sumOutgoingAmount1M) && sumOutgoingAmount3M.equals(other.sumOutgoingAmount3M) && maxIncomingAmount1W.equals(other.maxIncomingAmount1W) && maxIncomingAmount1M.equals(other.maxIncomingAmount1M) && maxIncomingAmount3M.equals(other.maxIncomingAmount3M) && maxOutgoingAmount1W.equals(other.maxOutgoingAmount1W) && maxOutgoingAmount1M.equals(other.maxOutgoingAmount1M) && maxOutgoingAmount3M.equals(other.maxOutgoingAmount3M) && meanIncomingAmount1W.equals(other.meanIncomingAmount1W) && meanIncomingAmount1M.equals(other.meanIncomingAmount1M) && meanIncomingAmount3M.equals(other.meanIncomingAmount3M) && meanOutgoingAmount1W.equals(other.meanOutgoingAmount1W) && meanOutgoingAmount1M.equals(other.meanOutgoingAmount1M) && meanOutgoingAmount3M.equals(other.meanOutgoingAmount3M);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.numTransactions1W, this.numTransactions1M, this.numTransactions3M, this.numIncomingTransactions1W, this.numIncomingTransactions1M, this.numIncomingTransactions3M, this.numOutgoingTransactions1W, this.numOutgoingTransactions1M, this.numOutgoingTransactions3M, this.sumIncomingAmount1W, this.sumIncomingAmount1M, this.sumIncomingAmount3M, this.sumOutgoingAmount1W, this.sumOutgoingAmount1M, this.sumOutgoingAmount3M, this.maxIncomingAmount1W, this.maxIncomingAmount1M, this.maxIncomingAmount3M, this.maxOutgoingAmount1W, this.maxOutgoingAmount1M, this.maxOutgoingAmount3M, this.meanIncomingAmount1W, this.meanIncomingAmount1M, this.meanIncomingAmount3M, this.meanOutgoingAmount1W, this.meanOutgoingAmount1M, this.meanOutgoingAmount3M);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "RiskInsightsTransactionMetrics{" + "numTransactions1W: " + numTransactions1W + ", numTransactions1M: " + numTransactions1M + ", numTransactions3M: " + numTransactions3M + ", numIncomingTransactions1W: " + numIncomingTransactions1W + ", numIncomingTransactions1M: " + numIncomingTransactions1M + ", numIncomingTransactions3M: " + numIncomingTransactions3M + ", numOutgoingTransactions1W: " + numOutgoingTransactions1W + ", numOutgoingTransactions1M: " + numOutgoingTransactions1M + ", numOutgoingTransactions3M: " + numOutgoingTransactions3M + ", sumIncomingAmount1W: " + sumIncomingAmount1W + ", sumIncomingAmount1M: " + sumIncomingAmount1M + ", sumIncomingAmount3M: " + sumIncomingAmount3M + ", sumOutgoingAmount1W: " + sumOutgoingAmount1W + ", sumOutgoingAmount1M: " + sumOutgoingAmount1M + ", sumOutgoingAmount3M: " + sumOutgoingAmount3M + ", maxIncomingAmount1W: " + maxIncomingAmount1W + ", maxIncomingAmount1M: " + maxIncomingAmount1M + ", maxIncomingAmount3M: " + maxIncomingAmount3M + ", maxOutgoingAmount1W: " + maxOutgoingAmount1W + ", maxOutgoingAmount1M: " + maxOutgoingAmount1M + ", maxOutgoingAmount3M: " + maxOutgoingAmount3M + ", meanIncomingAmount1W: " + meanIncomingAmount1W + ", meanIncomingAmount1M: " + meanIncomingAmount1M + ", meanIncomingAmount3M: " + meanIncomingAmount3M + ", meanOutgoingAmount1W: " + meanOutgoingAmount1W + ", meanOutgoingAmount1M: " + meanOutgoingAmount1M + ", meanOutgoingAmount3M: " + meanOutgoingAmount3M + "}";
  }

  public static NumTransactions1WStage builder() {
    return new Builder();
  }

  public interface NumTransactions1WStage {
    NumTransactions1MStage numTransactions1W(int numTransactions1W);

    Builder from(RiskInsightsTransactionMetrics other);
  }

  public interface NumTransactions1MStage {
    NumTransactions3MStage numTransactions1M(int numTransactions1M);
  }

  public interface NumTransactions3MStage {
    NumIncomingTransactions1WStage numTransactions3M(int numTransactions3M);
  }

  public interface NumIncomingTransactions1WStage {
    NumIncomingTransactions1MStage numIncomingTransactions1W(int numIncomingTransactions1W);
  }

  public interface NumIncomingTransactions1MStage {
    NumIncomingTransactions3MStage numIncomingTransactions1M(int numIncomingTransactions1M);
  }

  public interface NumIncomingTransactions3MStage {
    NumOutgoingTransactions1WStage numIncomingTransactions3M(int numIncomingTransactions3M);
  }

  public interface NumOutgoingTransactions1WStage {
    NumOutgoingTransactions1MStage numOutgoingTransactions1W(int numOutgoingTransactions1W);
  }

  public interface NumOutgoingTransactions1MStage {
    NumOutgoingTransactions3MStage numOutgoingTransactions1M(int numOutgoingTransactions1M);
  }

  public interface NumOutgoingTransactions3MStage {
    _FinalStage numOutgoingTransactions3M(int numOutgoingTransactions3M);
  }

  public interface _FinalStage {
    RiskInsightsTransactionMetrics build();

    _FinalStage sumIncomingAmount1W(Optional<Double> sumIncomingAmount1W);

    _FinalStage sumIncomingAmount1W(Double sumIncomingAmount1W);

    _FinalStage sumIncomingAmount1M(Optional<Double> sumIncomingAmount1M);

    _FinalStage sumIncomingAmount1M(Double sumIncomingAmount1M);

    _FinalStage sumIncomingAmount3M(Optional<Double> sumIncomingAmount3M);

    _FinalStage sumIncomingAmount3M(Double sumIncomingAmount3M);

    _FinalStage sumOutgoingAmount1W(Optional<Double> sumOutgoingAmount1W);

    _FinalStage sumOutgoingAmount1W(Double sumOutgoingAmount1W);

    _FinalStage sumOutgoingAmount1M(Optional<Double> sumOutgoingAmount1M);

    _FinalStage sumOutgoingAmount1M(Double sumOutgoingAmount1M);

    _FinalStage sumOutgoingAmount3M(Optional<Double> sumOutgoingAmount3M);

    _FinalStage sumOutgoingAmount3M(Double sumOutgoingAmount3M);

    _FinalStage maxIncomingAmount1W(Optional<Double> maxIncomingAmount1W);

    _FinalStage maxIncomingAmount1W(Double maxIncomingAmount1W);

    _FinalStage maxIncomingAmount1M(Optional<Double> maxIncomingAmount1M);

    _FinalStage maxIncomingAmount1M(Double maxIncomingAmount1M);

    _FinalStage maxIncomingAmount3M(Optional<Double> maxIncomingAmount3M);

    _FinalStage maxIncomingAmount3M(Double maxIncomingAmount3M);

    _FinalStage maxOutgoingAmount1W(Optional<Double> maxOutgoingAmount1W);

    _FinalStage maxOutgoingAmount1W(Double maxOutgoingAmount1W);

    _FinalStage maxOutgoingAmount1M(Optional<Double> maxOutgoingAmount1M);

    _FinalStage maxOutgoingAmount1M(Double maxOutgoingAmount1M);

    _FinalStage maxOutgoingAmount3M(Optional<Double> maxOutgoingAmount3M);

    _FinalStage maxOutgoingAmount3M(Double maxOutgoingAmount3M);

    _FinalStage meanIncomingAmount1W(Optional<Double> meanIncomingAmount1W);

    _FinalStage meanIncomingAmount1W(Double meanIncomingAmount1W);

    _FinalStage meanIncomingAmount1M(Optional<Double> meanIncomingAmount1M);

    _FinalStage meanIncomingAmount1M(Double meanIncomingAmount1M);

    _FinalStage meanIncomingAmount3M(Optional<Double> meanIncomingAmount3M);

    _FinalStage meanIncomingAmount3M(Double meanIncomingAmount3M);

    _FinalStage meanOutgoingAmount1W(Optional<Double> meanOutgoingAmount1W);

    _FinalStage meanOutgoingAmount1W(Double meanOutgoingAmount1W);

    _FinalStage meanOutgoingAmount1M(Optional<Double> meanOutgoingAmount1M);

    _FinalStage meanOutgoingAmount1M(Double meanOutgoingAmount1M);

    _FinalStage meanOutgoingAmount3M(Optional<Double> meanOutgoingAmount3M);

    _FinalStage meanOutgoingAmount3M(Double meanOutgoingAmount3M);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements NumTransactions1WStage, NumTransactions1MStage, NumTransactions3MStage, NumIncomingTransactions1WStage, NumIncomingTransactions1MStage, NumIncomingTransactions3MStage, NumOutgoingTransactions1WStage, NumOutgoingTransactions1MStage, NumOutgoingTransactions3MStage, _FinalStage {
    private int numTransactions1W;

    private int numTransactions1M;

    private int numTransactions3M;

    private int numIncomingTransactions1W;

    private int numIncomingTransactions1M;

    private int numIncomingTransactions3M;

    private int numOutgoingTransactions1W;

    private int numOutgoingTransactions1M;

    private int numOutgoingTransactions3M;

    private Optional<Double> meanOutgoingAmount3M = Optional.empty();

    private Optional<Double> meanOutgoingAmount1M = Optional.empty();

    private Optional<Double> meanOutgoingAmount1W = Optional.empty();

    private Optional<Double> meanIncomingAmount3M = Optional.empty();

    private Optional<Double> meanIncomingAmount1M = Optional.empty();

    private Optional<Double> meanIncomingAmount1W = Optional.empty();

    private Optional<Double> maxOutgoingAmount3M = Optional.empty();

    private Optional<Double> maxOutgoingAmount1M = Optional.empty();

    private Optional<Double> maxOutgoingAmount1W = Optional.empty();

    private Optional<Double> maxIncomingAmount3M = Optional.empty();

    private Optional<Double> maxIncomingAmount1M = Optional.empty();

    private Optional<Double> maxIncomingAmount1W = Optional.empty();

    private Optional<Double> sumOutgoingAmount3M = Optional.empty();

    private Optional<Double> sumOutgoingAmount1M = Optional.empty();

    private Optional<Double> sumOutgoingAmount1W = Optional.empty();

    private Optional<Double> sumIncomingAmount3M = Optional.empty();

    private Optional<Double> sumIncomingAmount1M = Optional.empty();

    private Optional<Double> sumIncomingAmount1W = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(RiskInsightsTransactionMetrics other) {
      numTransactions1W(other.getNumTransactions1W());
      numTransactions1M(other.getNumTransactions1M());
      numTransactions3M(other.getNumTransactions3M());
      numIncomingTransactions1W(other.getNumIncomingTransactions1W());
      numIncomingTransactions1M(other.getNumIncomingTransactions1M());
      numIncomingTransactions3M(other.getNumIncomingTransactions3M());
      numOutgoingTransactions1W(other.getNumOutgoingTransactions1W());
      numOutgoingTransactions1M(other.getNumOutgoingTransactions1M());
      numOutgoingTransactions3M(other.getNumOutgoingTransactions3M());
      sumIncomingAmount1W(other.getSumIncomingAmount1W());
      sumIncomingAmount1M(other.getSumIncomingAmount1M());
      sumIncomingAmount3M(other.getSumIncomingAmount3M());
      sumOutgoingAmount1W(other.getSumOutgoingAmount1W());
      sumOutgoingAmount1M(other.getSumOutgoingAmount1M());
      sumOutgoingAmount3M(other.getSumOutgoingAmount3M());
      maxIncomingAmount1W(other.getMaxIncomingAmount1W());
      maxIncomingAmount1M(other.getMaxIncomingAmount1M());
      maxIncomingAmount3M(other.getMaxIncomingAmount3M());
      maxOutgoingAmount1W(other.getMaxOutgoingAmount1W());
      maxOutgoingAmount1M(other.getMaxOutgoingAmount1M());
      maxOutgoingAmount3M(other.getMaxOutgoingAmount3M());
      meanIncomingAmount1W(other.getMeanIncomingAmount1W());
      meanIncomingAmount1M(other.getMeanIncomingAmount1M());
      meanIncomingAmount3M(other.getMeanIncomingAmount3M());
      meanOutgoingAmount1W(other.getMeanOutgoingAmount1W());
      meanOutgoingAmount1M(other.getMeanOutgoingAmount1M());
      meanOutgoingAmount3M(other.getMeanOutgoingAmount3M());
      return this;
    }

    /**
     * <p>The total number of transactions analyzed to determine the risk insights for the last week (incoming and outgoing).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("num_transactions_1w")
    public NumTransactions1MStage numTransactions1W(int numTransactions1W) {
      this.numTransactions1W = numTransactions1W;
      return this;
    }

    /**
     * <p>The total number of transactions analyzed to determine the risk insights for the last month (incoming and outgoing).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("num_transactions_1m")
    public NumTransactions3MStage numTransactions1M(int numTransactions1M) {
      this.numTransactions1M = numTransactions1M;
      return this;
    }

    /**
     * <p>The total number of transactions analyzed to determine the risk insights for the last three months (incoming and outgoing).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("num_transactions_3m")
    public NumIncomingTransactions1WStage numTransactions3M(int numTransactions3M) {
      this.numTransactions3M = numTransactions3M;
      return this;
    }

    /**
     * <p>The total number of inflow transactions for the last week.</p>
     * <p>ℹ️ <strong>Note</strong>: If there are no transactions between the request date and the last seven or thirty days, the value is <code>0</code>.</p>
     * <p>If the account has not been open long enough to have the transaction data for a given period, we return <code>null</code>. For example, if the account has only been open for five days, we return values for <code>_1w</code> and <code>_1m</code>, however, the value for <code>_3m</code> will be <code>null</code>.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("num_incoming_transactions_1w")
    public NumIncomingTransactions1MStage numIncomingTransactions1W(int numIncomingTransactions1W) {
      this.numIncomingTransactions1W = numIncomingTransactions1W;
      return this;
    }

    /**
     * <p>The total number of inflow transactions for the last month.</p>
     * <p>ℹ️ <strong>Note</strong>: If there are no transactions between the request date and the last seven or thirty days, the value is <code>0</code>.</p>
     * <p>If the account has not been open long enough to have the transaction data for a given period, we return <code>null</code>. For example, if the account has only been open for five days, we return values for <code>_1w</code> and <code>_1m</code>, however, the value for <code>_3m</code> will be <code>null</code>.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("num_incoming_transactions_1m")
    public NumIncomingTransactions3MStage numIncomingTransactions1M(int numIncomingTransactions1M) {
      this.numIncomingTransactions1M = numIncomingTransactions1M;
      return this;
    }

    /**
     * <p>The total number of inflow transactions for the last three months.</p>
     * <p>ℹ️ <strong>Note</strong>: If there are no transactions between the request date and the last seven or thirty days, the value is <code>0</code>.</p>
     * <p>If the account has not been open long enough to have the transaction data for a given period, we return <code>null</code>. For example, if the account has only been open for five days, we return values for <code>_1w</code> and <code>_1m</code>, however, the value for <code>_3m</code> will be <code>null</code>.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("num_incoming_transactions_3m")
    public NumOutgoingTransactions1WStage numIncomingTransactions3M(int numIncomingTransactions3M) {
      this.numIncomingTransactions3M = numIncomingTransactions3M;
      return this;
    }

    /**
     * <p>To total number of outflow transactions in the last week.</p>
     * <p>ℹ️ <strong>Note</strong>: If there are no transactions between the request date and the last seven or thirty days, the value is <code>0</code>.</p>
     * <p>If the account has not been open long enough to have the transaction data for a given period, we return <code>null</code>. For example, if the account has only been open for five days, we return values for <code>_1w</code> and <code>_1m</code>, however, the value for <code>_3m</code> will be <code>null</code>.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("num_outgoing_transactions_1w")
    public NumOutgoingTransactions1MStage numOutgoingTransactions1W(int numOutgoingTransactions1W) {
      this.numOutgoingTransactions1W = numOutgoingTransactions1W;
      return this;
    }

    /**
     * <p>To total number of outflow transactions in the last month.</p>
     * <p>ℹ️ <strong>Note</strong>: If there are no transactions between the request date and the last seven or thirty days, the value is <code>0</code>.</p>
     * <p>If the account has not been open long enough to have the transaction data for a given period, we return <code>null</code>. For example, if the account has only been open for five days, we return values for <code>_1w</code> and <code>_1m</code>, however, the value for <code>_3m</code> will be <code>null</code>.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("num_outgoing_transactions_1m")
    public NumOutgoingTransactions3MStage numOutgoingTransactions1M(int numOutgoingTransactions1M) {
      this.numOutgoingTransactions1M = numOutgoingTransactions1M;
      return this;
    }

    /**
     * <p>To total number of outflow transactions in the last three months.</p>
     * <p>ℹ️ <strong>Note</strong>: If there are no transactions between the request date and the last seven or thirty days, the value is <code>0</code>.</p>
     * <p>If the account has not been open long enough to have the transaction data for a given period, we return <code>null</code>. For example, if the account has only been open for five days, we return values for <code>_1w</code> and <code>_1m</code>, however, the value for <code>_3m</code> will be <code>null</code>.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("num_outgoing_transactions_3m")
    public _FinalStage numOutgoingTransactions3M(int numOutgoingTransactions3M) {
      this.numOutgoingTransactions3M = numOutgoingTransactions3M;
      return this;
    }

    /**
     * <p>The mean outgoing value of all transaction in the last three months.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage meanOutgoingAmount3M(Double meanOutgoingAmount3M) {
      this.meanOutgoingAmount3M = Optional.of(meanOutgoingAmount3M);
      return this;
    }

    @Override
    @JsonSetter(
        value = "mean_outgoing_amount_3m",
        nulls = Nulls.SKIP
    )
    public _FinalStage meanOutgoingAmount3M(Optional<Double> meanOutgoingAmount3M) {
      this.meanOutgoingAmount3M = meanOutgoingAmount3M;
      return this;
    }

    /**
     * <p>The mean outgoing value of all transaction in the last month.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage meanOutgoingAmount1M(Double meanOutgoingAmount1M) {
      this.meanOutgoingAmount1M = Optional.of(meanOutgoingAmount1M);
      return this;
    }

    @Override
    @JsonSetter(
        value = "mean_outgoing_amount_1m",
        nulls = Nulls.SKIP
    )
    public _FinalStage meanOutgoingAmount1M(Optional<Double> meanOutgoingAmount1M) {
      this.meanOutgoingAmount1M = meanOutgoingAmount1M;
      return this;
    }

    /**
     * <p>The mean outgoing value of all transaction in the last week.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage meanOutgoingAmount1W(Double meanOutgoingAmount1W) {
      this.meanOutgoingAmount1W = Optional.of(meanOutgoingAmount1W);
      return this;
    }

    @Override
    @JsonSetter(
        value = "mean_outgoing_amount_1w",
        nulls = Nulls.SKIP
    )
    public _FinalStage meanOutgoingAmount1W(Optional<Double> meanOutgoingAmount1W) {
      this.meanOutgoingAmount1W = meanOutgoingAmount1W;
      return this;
    }

    /**
     * <p>The mean incoming value of all transactions in the last three months.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage meanIncomingAmount3M(Double meanIncomingAmount3M) {
      this.meanIncomingAmount3M = Optional.of(meanIncomingAmount3M);
      return this;
    }

    @Override
    @JsonSetter(
        value = "mean_incoming_amount_3m",
        nulls = Nulls.SKIP
    )
    public _FinalStage meanIncomingAmount3M(Optional<Double> meanIncomingAmount3M) {
      this.meanIncomingAmount3M = meanIncomingAmount3M;
      return this;
    }

    /**
     * <p>The mean incoming value of all transactions in the last month.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage meanIncomingAmount1M(Double meanIncomingAmount1M) {
      this.meanIncomingAmount1M = Optional.of(meanIncomingAmount1M);
      return this;
    }

    @Override
    @JsonSetter(
        value = "mean_incoming_amount_1m",
        nulls = Nulls.SKIP
    )
    public _FinalStage meanIncomingAmount1M(Optional<Double> meanIncomingAmount1M) {
      this.meanIncomingAmount1M = meanIncomingAmount1M;
      return this;
    }

    /**
     * <p>The mean incoming value of all transactions in the last week.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage meanIncomingAmount1W(Double meanIncomingAmount1W) {
      this.meanIncomingAmount1W = Optional.of(meanIncomingAmount1W);
      return this;
    }

    @Override
    @JsonSetter(
        value = "mean_incoming_amount_1w",
        nulls = Nulls.SKIP
    )
    public _FinalStage meanIncomingAmount1W(Optional<Double> meanIncomingAmount1W) {
      this.meanIncomingAmount1W = meanIncomingAmount1W;
      return this;
    }

    /**
     * <p>The highest value outflow transaction in the last three months.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage maxOutgoingAmount3M(Double maxOutgoingAmount3M) {
      this.maxOutgoingAmount3M = Optional.of(maxOutgoingAmount3M);
      return this;
    }

    @Override
    @JsonSetter(
        value = "max_outgoing_amount_3m",
        nulls = Nulls.SKIP
    )
    public _FinalStage maxOutgoingAmount3M(Optional<Double> maxOutgoingAmount3M) {
      this.maxOutgoingAmount3M = maxOutgoingAmount3M;
      return this;
    }

    /**
     * <p>The highest value outflow transaction in the last month.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage maxOutgoingAmount1M(Double maxOutgoingAmount1M) {
      this.maxOutgoingAmount1M = Optional.of(maxOutgoingAmount1M);
      return this;
    }

    @Override
    @JsonSetter(
        value = "max_outgoing_amount_1m",
        nulls = Nulls.SKIP
    )
    public _FinalStage maxOutgoingAmount1M(Optional<Double> maxOutgoingAmount1M) {
      this.maxOutgoingAmount1M = maxOutgoingAmount1M;
      return this;
    }

    /**
     * <p>The highest value outflow transaction in the last week.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage maxOutgoingAmount1W(Double maxOutgoingAmount1W) {
      this.maxOutgoingAmount1W = Optional.of(maxOutgoingAmount1W);
      return this;
    }

    @Override
    @JsonSetter(
        value = "max_outgoing_amount_1w",
        nulls = Nulls.SKIP
    )
    public _FinalStage maxOutgoingAmount1W(Optional<Double> maxOutgoingAmount1W) {
      this.maxOutgoingAmount1W = maxOutgoingAmount1W;
      return this;
    }

    /**
     * <p>The highest value inflow transaction in the last three months.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage maxIncomingAmount3M(Double maxIncomingAmount3M) {
      this.maxIncomingAmount3M = Optional.of(maxIncomingAmount3M);
      return this;
    }

    @Override
    @JsonSetter(
        value = "max_incoming_amount_3m",
        nulls = Nulls.SKIP
    )
    public _FinalStage maxIncomingAmount3M(Optional<Double> maxIncomingAmount3M) {
      this.maxIncomingAmount3M = maxIncomingAmount3M;
      return this;
    }

    /**
     * <p>The highest value inflow transaction in the last month.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage maxIncomingAmount1M(Double maxIncomingAmount1M) {
      this.maxIncomingAmount1M = Optional.of(maxIncomingAmount1M);
      return this;
    }

    @Override
    @JsonSetter(
        value = "max_incoming_amount_1m",
        nulls = Nulls.SKIP
    )
    public _FinalStage maxIncomingAmount1M(Optional<Double> maxIncomingAmount1M) {
      this.maxIncomingAmount1M = maxIncomingAmount1M;
      return this;
    }

    /**
     * <p>The highest value inflow transaction in the last week.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage maxIncomingAmount1W(Double maxIncomingAmount1W) {
      this.maxIncomingAmount1W = Optional.of(maxIncomingAmount1W);
      return this;
    }

    @Override
    @JsonSetter(
        value = "max_incoming_amount_1w",
        nulls = Nulls.SKIP
    )
    public _FinalStage maxIncomingAmount1W(Optional<Double> maxIncomingAmount1W) {
      this.maxIncomingAmount1W = maxIncomingAmount1W;
      return this;
    }

    /**
     * <p>The total sum of all outflow transactions for the last three months.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage sumOutgoingAmount3M(Double sumOutgoingAmount3M) {
      this.sumOutgoingAmount3M = Optional.of(sumOutgoingAmount3M);
      return this;
    }

    @Override
    @JsonSetter(
        value = "sum_outgoing_amount_3m",
        nulls = Nulls.SKIP
    )
    public _FinalStage sumOutgoingAmount3M(Optional<Double> sumOutgoingAmount3M) {
      this.sumOutgoingAmount3M = sumOutgoingAmount3M;
      return this;
    }

    /**
     * <p>The total sum of all outflow transactions for the last month.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage sumOutgoingAmount1M(Double sumOutgoingAmount1M) {
      this.sumOutgoingAmount1M = Optional.of(sumOutgoingAmount1M);
      return this;
    }

    @Override
    @JsonSetter(
        value = "sum_outgoing_amount_1m",
        nulls = Nulls.SKIP
    )
    public _FinalStage sumOutgoingAmount1M(Optional<Double> sumOutgoingAmount1M) {
      this.sumOutgoingAmount1M = sumOutgoingAmount1M;
      return this;
    }

    /**
     * <p>The total sum of all outflow transactions for the last week.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage sumOutgoingAmount1W(Double sumOutgoingAmount1W) {
      this.sumOutgoingAmount1W = Optional.of(sumOutgoingAmount1W);
      return this;
    }

    @Override
    @JsonSetter(
        value = "sum_outgoing_amount_1w",
        nulls = Nulls.SKIP
    )
    public _FinalStage sumOutgoingAmount1W(Optional<Double> sumOutgoingAmount1W) {
      this.sumOutgoingAmount1W = sumOutgoingAmount1W;
      return this;
    }

    /**
     * <p>The total sum of all inflow transactions for the last three months.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage sumIncomingAmount3M(Double sumIncomingAmount3M) {
      this.sumIncomingAmount3M = Optional.of(sumIncomingAmount3M);
      return this;
    }

    @Override
    @JsonSetter(
        value = "sum_incoming_amount_3m",
        nulls = Nulls.SKIP
    )
    public _FinalStage sumIncomingAmount3M(Optional<Double> sumIncomingAmount3M) {
      this.sumIncomingAmount3M = sumIncomingAmount3M;
      return this;
    }

    /**
     * <p>The total sum of all inflow transactions for the last month.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage sumIncomingAmount1M(Double sumIncomingAmount1M) {
      this.sumIncomingAmount1M = Optional.of(sumIncomingAmount1M);
      return this;
    }

    @Override
    @JsonSetter(
        value = "sum_incoming_amount_1m",
        nulls = Nulls.SKIP
    )
    public _FinalStage sumIncomingAmount1M(Optional<Double> sumIncomingAmount1M) {
      this.sumIncomingAmount1M = sumIncomingAmount1M;
      return this;
    }

    /**
     * <p>The total sum of all inflow transactions for the last week.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage sumIncomingAmount1W(Double sumIncomingAmount1W) {
      this.sumIncomingAmount1W = Optional.of(sumIncomingAmount1W);
      return this;
    }

    @Override
    @JsonSetter(
        value = "sum_incoming_amount_1w",
        nulls = Nulls.SKIP
    )
    public _FinalStage sumIncomingAmount1W(Optional<Double> sumIncomingAmount1W) {
      this.sumIncomingAmount1W = sumIncomingAmount1W;
      return this;
    }

    @Override
    public RiskInsightsTransactionMetrics build() {
      return new RiskInsightsTransactionMetrics(numTransactions1W, numTransactions1M, numTransactions3M, numIncomingTransactions1W, numIncomingTransactions1M, numIncomingTransactions3M, numOutgoingTransactions1W, numOutgoingTransactions1M, numOutgoingTransactions3M, sumIncomingAmount1W, sumIncomingAmount1M, sumIncomingAmount3M, sumOutgoingAmount1W, sumOutgoingAmount1M, sumOutgoingAmount3M, maxIncomingAmount1W, maxIncomingAmount1M, maxIncomingAmount3M, maxOutgoingAmount1W, maxOutgoingAmount1M, maxOutgoingAmount3M, meanIncomingAmount1W, meanIncomingAmount1M, meanIncomingAmount3M, meanOutgoingAmount1W, meanOutgoingAmount1M, meanOutgoingAmount3M);
    }
  }
}
