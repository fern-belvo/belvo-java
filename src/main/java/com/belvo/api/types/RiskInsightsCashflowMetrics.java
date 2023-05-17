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
    builder = RiskInsightsCashflowMetrics.Builder.class
)
public final class RiskInsightsCashflowMetrics {
  private final Optional<Double> sumPositive1W;

  private final Optional<Double> sumPositive1M;

  private final Optional<Double> sumPositive3M;

  private final Optional<Double> sumNegative1W;

  private final Optional<Double> sumNegative1M;

  private final Optional<Double> sumNegative3M;

  private final Optional<Double> positiveToNegativeRatio1W;

  private final Optional<Double> positiveToNegativeRatio1M;

  private final Optional<Double> positiveToNegativeRatio3M;

  private int _cachedHashCode;

  RiskInsightsCashflowMetrics(Optional<Double> sumPositive1W, Optional<Double> sumPositive1M,
      Optional<Double> sumPositive3M, Optional<Double> sumNegative1W,
      Optional<Double> sumNegative1M, Optional<Double> sumNegative3M,
      Optional<Double> positiveToNegativeRatio1W, Optional<Double> positiveToNegativeRatio1M,
      Optional<Double> positiveToNegativeRatio3M) {
    this.sumPositive1W = sumPositive1W;
    this.sumPositive1M = sumPositive1M;
    this.sumPositive3M = sumPositive3M;
    this.sumNegative1W = sumNegative1W;
    this.sumNegative1M = sumNegative1M;
    this.sumNegative3M = sumNegative3M;
    this.positiveToNegativeRatio1W = positiveToNegativeRatio1W;
    this.positiveToNegativeRatio1M = positiveToNegativeRatio1M;
    this.positiveToNegativeRatio3M = positiveToNegativeRatio3M;
  }

  /**
   * @return Sum total of all transactions leading to a positive cashflow in the last week (counted from the time of the request).
   */
  @JsonProperty("sum_positive_1w")
  public Optional<Double> getSumPositive1W() {
    return sumPositive1W;
  }

  /**
   * @return Sum total of all transactions leading to a positive cashflow in the last month (counted from the time of the request).
   */
  @JsonProperty("sum_positive_1m")
  public Optional<Double> getSumPositive1M() {
    return sumPositive1M;
  }

  /**
   * @return Sum total of all transactions leading to a positive cashflow in the last three months (counted from the time of the request).
   */
  @JsonProperty("sum_positive_3m")
  public Optional<Double> getSumPositive3M() {
    return sumPositive3M;
  }

  /**
   * @return Sum total of all transactions leading to a negative cashflow in the last week (counted from the time of the request).
   */
  @JsonProperty("sum_negative_1w")
  public Optional<Double> getSumNegative1W() {
    return sumNegative1W;
  }

  /**
   * @return Sum total of all transactions leading to a negative cashflow in the last month (counted from the time of the request).
   */
  @JsonProperty("sum_negative_1m")
  public Optional<Double> getSumNegative1M() {
    return sumNegative1M;
  }

  /**
   * @return Sum total of all transactions leading to a negative cashflow in the last three months (counted from the time of the request).
   */
  @JsonProperty("sum_negative_3m")
  public Optional<Double> getSumNegative3M() {
    return sumNegative3M;
  }

  /**
   * @return The ratio between sum_positive / sum_negative  in the last week (counted from the time of the request).
   * <p>ℹ️ If the ratio is greater than <code>1</code>, it means that the user has more income than outgoing, indicating that they spend less than they earn.</p>
   * <p><strong>Note</strong>: In the case that there have been no outgoing transactions, the value will be <code>null</code>.</p>
   */
  @JsonProperty("positive_to_negative_ratio_1w")
  public Optional<Double> getPositiveToNegativeRatio1W() {
    return positiveToNegativeRatio1W;
  }

  /**
   * @return The ratio between sum_positive / sum_negative  in the last month (counted from the time of the request).
   * <p>ℹ️ If the ratio is greater than <code>1</code>, it means that the user has more income than outgoing, indicating that they spend less than they earn.</p>
   */
  @JsonProperty("positive_to_negative_ratio_1m")
  public Optional<Double> getPositiveToNegativeRatio1M() {
    return positiveToNegativeRatio1M;
  }

  /**
   * @return The ratio between sum_positive / sum_negative  in the last three months (counted from the time of the request).
   * <p>ℹ️ If the ratio is greater than <code>1</code>, it means that the user has more income than outgoing, indicating that they spend less than they earn.</p>
   */
  @JsonProperty("positive_to_negative_ratio_3m")
  public Optional<Double> getPositiveToNegativeRatio3M() {
    return positiveToNegativeRatio3M;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof RiskInsightsCashflowMetrics && equalTo((RiskInsightsCashflowMetrics) other);
  }

  private boolean equalTo(RiskInsightsCashflowMetrics other) {
    return sumPositive1W.equals(other.sumPositive1W) && sumPositive1M.equals(other.sumPositive1M) && sumPositive3M.equals(other.sumPositive3M) && sumNegative1W.equals(other.sumNegative1W) && sumNegative1M.equals(other.sumNegative1M) && sumNegative3M.equals(other.sumNegative3M) && positiveToNegativeRatio1W.equals(other.positiveToNegativeRatio1W) && positiveToNegativeRatio1M.equals(other.positiveToNegativeRatio1M) && positiveToNegativeRatio3M.equals(other.positiveToNegativeRatio3M);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.sumPositive1W, this.sumPositive1M, this.sumPositive3M, this.sumNegative1W, this.sumNegative1M, this.sumNegative3M, this.positiveToNegativeRatio1W, this.positiveToNegativeRatio1M, this.positiveToNegativeRatio3M);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "RiskInsightsCashflowMetrics{" + "sumPositive1W: " + sumPositive1W + ", sumPositive1M: " + sumPositive1M + ", sumPositive3M: " + sumPositive3M + ", sumNegative1W: " + sumNegative1W + ", sumNegative1M: " + sumNegative1M + ", sumNegative3M: " + sumNegative3M + ", positiveToNegativeRatio1W: " + positiveToNegativeRatio1W + ", positiveToNegativeRatio1M: " + positiveToNegativeRatio1M + ", positiveToNegativeRatio3M: " + positiveToNegativeRatio3M + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<Double> sumPositive1W = Optional.empty();

    private Optional<Double> sumPositive1M = Optional.empty();

    private Optional<Double> sumPositive3M = Optional.empty();

    private Optional<Double> sumNegative1W = Optional.empty();

    private Optional<Double> sumNegative1M = Optional.empty();

    private Optional<Double> sumNegative3M = Optional.empty();

    private Optional<Double> positiveToNegativeRatio1W = Optional.empty();

    private Optional<Double> positiveToNegativeRatio1M = Optional.empty();

    private Optional<Double> positiveToNegativeRatio3M = Optional.empty();

    private Builder() {
    }

    public Builder from(RiskInsightsCashflowMetrics other) {
      sumPositive1W(other.getSumPositive1W());
      sumPositive1M(other.getSumPositive1M());
      sumPositive3M(other.getSumPositive3M());
      sumNegative1W(other.getSumNegative1W());
      sumNegative1M(other.getSumNegative1M());
      sumNegative3M(other.getSumNegative3M());
      positiveToNegativeRatio1W(other.getPositiveToNegativeRatio1W());
      positiveToNegativeRatio1M(other.getPositiveToNegativeRatio1M());
      positiveToNegativeRatio3M(other.getPositiveToNegativeRatio3M());
      return this;
    }

    @JsonSetter(
        value = "sum_positive_1w",
        nulls = Nulls.SKIP
    )
    public Builder sumPositive1W(Optional<Double> sumPositive1W) {
      this.sumPositive1W = sumPositive1W;
      return this;
    }

    public Builder sumPositive1W(Double sumPositive1W) {
      this.sumPositive1W = Optional.of(sumPositive1W);
      return this;
    }

    @JsonSetter(
        value = "sum_positive_1m",
        nulls = Nulls.SKIP
    )
    public Builder sumPositive1M(Optional<Double> sumPositive1M) {
      this.sumPositive1M = sumPositive1M;
      return this;
    }

    public Builder sumPositive1M(Double sumPositive1M) {
      this.sumPositive1M = Optional.of(sumPositive1M);
      return this;
    }

    @JsonSetter(
        value = "sum_positive_3m",
        nulls = Nulls.SKIP
    )
    public Builder sumPositive3M(Optional<Double> sumPositive3M) {
      this.sumPositive3M = sumPositive3M;
      return this;
    }

    public Builder sumPositive3M(Double sumPositive3M) {
      this.sumPositive3M = Optional.of(sumPositive3M);
      return this;
    }

    @JsonSetter(
        value = "sum_negative_1w",
        nulls = Nulls.SKIP
    )
    public Builder sumNegative1W(Optional<Double> sumNegative1W) {
      this.sumNegative1W = sumNegative1W;
      return this;
    }

    public Builder sumNegative1W(Double sumNegative1W) {
      this.sumNegative1W = Optional.of(sumNegative1W);
      return this;
    }

    @JsonSetter(
        value = "sum_negative_1m",
        nulls = Nulls.SKIP
    )
    public Builder sumNegative1M(Optional<Double> sumNegative1M) {
      this.sumNegative1M = sumNegative1M;
      return this;
    }

    public Builder sumNegative1M(Double sumNegative1M) {
      this.sumNegative1M = Optional.of(sumNegative1M);
      return this;
    }

    @JsonSetter(
        value = "sum_negative_3m",
        nulls = Nulls.SKIP
    )
    public Builder sumNegative3M(Optional<Double> sumNegative3M) {
      this.sumNegative3M = sumNegative3M;
      return this;
    }

    public Builder sumNegative3M(Double sumNegative3M) {
      this.sumNegative3M = Optional.of(sumNegative3M);
      return this;
    }

    @JsonSetter(
        value = "positive_to_negative_ratio_1w",
        nulls = Nulls.SKIP
    )
    public Builder positiveToNegativeRatio1W(Optional<Double> positiveToNegativeRatio1W) {
      this.positiveToNegativeRatio1W = positiveToNegativeRatio1W;
      return this;
    }

    public Builder positiveToNegativeRatio1W(Double positiveToNegativeRatio1W) {
      this.positiveToNegativeRatio1W = Optional.of(positiveToNegativeRatio1W);
      return this;
    }

    @JsonSetter(
        value = "positive_to_negative_ratio_1m",
        nulls = Nulls.SKIP
    )
    public Builder positiveToNegativeRatio1M(Optional<Double> positiveToNegativeRatio1M) {
      this.positiveToNegativeRatio1M = positiveToNegativeRatio1M;
      return this;
    }

    public Builder positiveToNegativeRatio1M(Double positiveToNegativeRatio1M) {
      this.positiveToNegativeRatio1M = Optional.of(positiveToNegativeRatio1M);
      return this;
    }

    @JsonSetter(
        value = "positive_to_negative_ratio_3m",
        nulls = Nulls.SKIP
    )
    public Builder positiveToNegativeRatio3M(Optional<Double> positiveToNegativeRatio3M) {
      this.positiveToNegativeRatio3M = positiveToNegativeRatio3M;
      return this;
    }

    public Builder positiveToNegativeRatio3M(Double positiveToNegativeRatio3M) {
      this.positiveToNegativeRatio3M = Optional.of(positiveToNegativeRatio3M);
      return this;
    }

    public RiskInsightsCashflowMetrics build() {
      return new RiskInsightsCashflowMetrics(sumPositive1W, sumPositive1M, sumPositive3M, sumNegative1W, sumNegative1M, sumNegative3M, positiveToNegativeRatio1W, positiveToNegativeRatio1M, positiveToNegativeRatio3M);
    }
  }
}
