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
    builder = IncomeStreamsBody.Builder.class
)
public final class IncomeStreamsBody {
  private final String accountId;

  private final EnumIncomeStreamType incomeType;

  private final EnumIncomeStreamFrequency frequency;

  private final double monthlyAverage;

  private final double averageIncomeAmount;

  private final double lastIncomeAmount;

  private final String currency;

  private final Object lastIncomeDescription;

  private final String lastIncomeDate;

  private final Optional<Double> stability;

  private final Optional<Double> regularity;

  private final Optional<Double> trend;

  private final int lookbackPeriods;

  private final int fullPeriods;

  private final int periodsWithIncome;

  private final int numberOfIncomes;

  private final EnumIncomeStreamConfidence confidence;

  private int _cachedHashCode;

  IncomeStreamsBody(String accountId, EnumIncomeStreamType incomeType,
      EnumIncomeStreamFrequency frequency, double monthlyAverage, double averageIncomeAmount,
      double lastIncomeAmount, String currency, Object lastIncomeDescription, String lastIncomeDate,
      Optional<Double> stability, Optional<Double> regularity, Optional<Double> trend,
      int lookbackPeriods, int fullPeriods, int periodsWithIncome, int numberOfIncomes,
      EnumIncomeStreamConfidence confidence) {
    this.accountId = accountId;
    this.incomeType = incomeType;
    this.frequency = frequency;
    this.monthlyAverage = monthlyAverage;
    this.averageIncomeAmount = averageIncomeAmount;
    this.lastIncomeAmount = lastIncomeAmount;
    this.currency = currency;
    this.lastIncomeDescription = lastIncomeDescription;
    this.lastIncomeDate = lastIncomeDate;
    this.stability = stability;
    this.regularity = regularity;
    this.trend = trend;
    this.lookbackPeriods = lookbackPeriods;
    this.fullPeriods = fullPeriods;
    this.periodsWithIncome = periodsWithIncome;
    this.numberOfIncomes = numberOfIncomes;
    this.confidence = confidence;
  }

  /**
   * @return Unique ID for the bank account to be verified for income streams.
   */
  @JsonProperty("account_id")
  public String getAccountId() {
    return accountId;
  }

  @JsonProperty("income_type")
  public EnumIncomeStreamType getIncomeType() {
    return incomeType;
  }

  @JsonProperty("frequency")
  public EnumIncomeStreamFrequency getFrequency() {
    return frequency;
  }

  /**
   * @return The average amount of income received from the source over <code>lookback_periods</code>.
   */
  @JsonProperty("monthly_average")
  public double getMonthlyAverage() {
    return monthlyAverage;
  }

  /**
   * @return The average income transaction amount from the source.
   */
  @JsonProperty("average_income_amount")
  public double getAverageIncomeAmount() {
    return averageIncomeAmount;
  }

  /**
   * @return The amount of the most recent income received from the source.
   */
  @JsonProperty("last_income_amount")
  public double getLastIncomeAmount() {
    return lastIncomeAmount;
  }

  /**
   * @return The three-letter currency code of the income. For example:
   * <p>• 🇧🇷 BRL (Brazilian Real)
   * • 🇨🇴 COP (Colombian Peso)
   * • 🇲🇽 MXN (Mexican Peso)</p>
   */
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }

  @JsonProperty("last_income_description")
  public Object getLastIncomeDescription() {
    return lastIncomeDescription;
  }

  /**
   * @return The date when the most recent income from the stream was received, in <code>YYYY-MM-DD</code> format.
   */
  @JsonProperty("last_income_date")
  public String getLastIncomeDate() {
    return lastIncomeDate;
  }

  /**
   * @return The stability of the income based on its amount, with a range from 0 to 1, where 1 represents perfect stability.
   * <p><strong>Note:</strong> For transactions with <code>frequency</code>=<code>SINGLE</code>, this value returns <code>null</code>.</p>
   */
  @JsonProperty("stability")
  public Optional<Double> getStability() {
    return stability;
  }

  /**
   * @return The regularity of the income basde in its frequency, with a range from 0 to 1, where 1 represents perfect regularity.
   * <p><strong>Note:</strong> For transactions with <code>frequency</code>=<code>SINGLE</code>, this value returns <code>null</code>.</p>
   */
  @JsonProperty("regularity")
  public Optional<Double> getRegularity() {
    return regularity;
  }

  /**
   * @return The income trend during a period of time calculated between last income and first income received, where:
   * <ul>
   * <li>a negative float means that the income trend is decreasing during the time period.</li>
   * <li>a positive float means that the income trend is increasing during the time period.</li>
   * </ul>
   * <p><strong>Note:</strong> For transactions with <code>frequency</code>=<code>SINGLE</code>, this value returns <code>null</code>.</p>
   */
  @JsonProperty("trend")
  public Optional<Double> getTrend() {
    return trend;
  }

  /**
   * @return Number of period units (based on <em>rolling months</em>) used to generate insights and calculations.
   * <p><strong>Note:</strong> A <em>rolling month</em> is a period of 30 days. For example, 2023-01-15 to 2023-02-2023.</p>
   */
  @JsonProperty("lookback_periods")
  public int getLookbackPeriods() {
    return lookbackPeriods;
  }

  /**
   * @return Number of period units (based on <em>rolling months</em>) with data to perform calculations.
   * <p><strong>Note:</strong> A <em>rolling month</em> is a period of 30 days. For example, 2023-01-15 to 2023-02-2023.</p>
   */
  @JsonProperty("full_periods")
  public int getFullPeriods() {
    return fullPeriods;
  }

  /**
   * @return Number of period units (based on <em>rolling months</em>) with at least one income available.
   * <p><strong>Note:</strong> A <em>rolling month</em> is a period of 30 days. For example, 2023-01-15 to 2023-02-2023.</p>
   */
  @JsonProperty("periods_with_income")
  public int getPeriodsWithIncome() {
    return periodsWithIncome;
  }

  /**
   * @return Number of income transactions over the <code>lookback_periods</code>.
   */
  @JsonProperty("number_of_incomes")
  public int getNumberOfIncomes() {
    return numberOfIncomes;
  }

  @JsonProperty("confidence")
  public EnumIncomeStreamConfidence getConfidence() {
    return confidence;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof IncomeStreamsBody && equalTo((IncomeStreamsBody) other);
  }

  private boolean equalTo(IncomeStreamsBody other) {
    return accountId.equals(other.accountId) && incomeType.equals(other.incomeType) && frequency.equals(other.frequency) && monthlyAverage == other.monthlyAverage && averageIncomeAmount == other.averageIncomeAmount && lastIncomeAmount == other.lastIncomeAmount && currency.equals(other.currency) && lastIncomeDescription.equals(other.lastIncomeDescription) && lastIncomeDate.equals(other.lastIncomeDate) && stability.equals(other.stability) && regularity.equals(other.regularity) && trend.equals(other.trend) && lookbackPeriods == other.lookbackPeriods && fullPeriods == other.fullPeriods && periodsWithIncome == other.periodsWithIncome && numberOfIncomes == other.numberOfIncomes && confidence.equals(other.confidence);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.accountId, this.incomeType, this.frequency, this.monthlyAverage, this.averageIncomeAmount, this.lastIncomeAmount, this.currency, this.lastIncomeDescription, this.lastIncomeDate, this.stability, this.regularity, this.trend, this.lookbackPeriods, this.fullPeriods, this.periodsWithIncome, this.numberOfIncomes, this.confidence);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "IncomeStreamsBody{" + "accountId: " + accountId + ", incomeType: " + incomeType + ", frequency: " + frequency + ", monthlyAverage: " + monthlyAverage + ", averageIncomeAmount: " + averageIncomeAmount + ", lastIncomeAmount: " + lastIncomeAmount + ", currency: " + currency + ", lastIncomeDescription: " + lastIncomeDescription + ", lastIncomeDate: " + lastIncomeDate + ", stability: " + stability + ", regularity: " + regularity + ", trend: " + trend + ", lookbackPeriods: " + lookbackPeriods + ", fullPeriods: " + fullPeriods + ", periodsWithIncome: " + periodsWithIncome + ", numberOfIncomes: " + numberOfIncomes + ", confidence: " + confidence + "}";
  }

  public static AccountIdStage builder() {
    return new Builder();
  }

  public interface AccountIdStage {
    IncomeTypeStage accountId(String accountId);

    Builder from(IncomeStreamsBody other);
  }

  public interface IncomeTypeStage {
    FrequencyStage incomeType(EnumIncomeStreamType incomeType);
  }

  public interface FrequencyStage {
    MonthlyAverageStage frequency(EnumIncomeStreamFrequency frequency);
  }

  public interface MonthlyAverageStage {
    AverageIncomeAmountStage monthlyAverage(double monthlyAverage);
  }

  public interface AverageIncomeAmountStage {
    LastIncomeAmountStage averageIncomeAmount(double averageIncomeAmount);
  }

  public interface LastIncomeAmountStage {
    CurrencyStage lastIncomeAmount(double lastIncomeAmount);
  }

  public interface CurrencyStage {
    LastIncomeDescriptionStage currency(String currency);
  }

  public interface LastIncomeDescriptionStage {
    LastIncomeDateStage lastIncomeDescription(Object lastIncomeDescription);
  }

  public interface LastIncomeDateStage {
    LookbackPeriodsStage lastIncomeDate(String lastIncomeDate);
  }

  public interface LookbackPeriodsStage {
    FullPeriodsStage lookbackPeriods(int lookbackPeriods);
  }

  public interface FullPeriodsStage {
    PeriodsWithIncomeStage fullPeriods(int fullPeriods);
  }

  public interface PeriodsWithIncomeStage {
    NumberOfIncomesStage periodsWithIncome(int periodsWithIncome);
  }

  public interface NumberOfIncomesStage {
    ConfidenceStage numberOfIncomes(int numberOfIncomes);
  }

  public interface ConfidenceStage {
    _FinalStage confidence(EnumIncomeStreamConfidence confidence);
  }

  public interface _FinalStage {
    IncomeStreamsBody build();

    _FinalStage stability(Optional<Double> stability);

    _FinalStage stability(Double stability);

    _FinalStage regularity(Optional<Double> regularity);

    _FinalStage regularity(Double regularity);

    _FinalStage trend(Optional<Double> trend);

    _FinalStage trend(Double trend);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements AccountIdStage, IncomeTypeStage, FrequencyStage, MonthlyAverageStage, AverageIncomeAmountStage, LastIncomeAmountStage, CurrencyStage, LastIncomeDescriptionStage, LastIncomeDateStage, LookbackPeriodsStage, FullPeriodsStage, PeriodsWithIncomeStage, NumberOfIncomesStage, ConfidenceStage, _FinalStage {
    private String accountId;

    private EnumIncomeStreamType incomeType;

    private EnumIncomeStreamFrequency frequency;

    private double monthlyAverage;

    private double averageIncomeAmount;

    private double lastIncomeAmount;

    private String currency;

    private Object lastIncomeDescription;

    private String lastIncomeDate;

    private int lookbackPeriods;

    private int fullPeriods;

    private int periodsWithIncome;

    private int numberOfIncomes;

    private EnumIncomeStreamConfidence confidence;

    private Optional<Double> trend = Optional.empty();

    private Optional<Double> regularity = Optional.empty();

    private Optional<Double> stability = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(IncomeStreamsBody other) {
      accountId(other.getAccountId());
      incomeType(other.getIncomeType());
      frequency(other.getFrequency());
      monthlyAverage(other.getMonthlyAverage());
      averageIncomeAmount(other.getAverageIncomeAmount());
      lastIncomeAmount(other.getLastIncomeAmount());
      currency(other.getCurrency());
      lastIncomeDescription(other.getLastIncomeDescription());
      lastIncomeDate(other.getLastIncomeDate());
      stability(other.getStability());
      regularity(other.getRegularity());
      trend(other.getTrend());
      lookbackPeriods(other.getLookbackPeriods());
      fullPeriods(other.getFullPeriods());
      periodsWithIncome(other.getPeriodsWithIncome());
      numberOfIncomes(other.getNumberOfIncomes());
      confidence(other.getConfidence());
      return this;
    }

    /**
     * <p>Unique ID for the bank account to be verified for income streams.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("account_id")
    public IncomeTypeStage accountId(String accountId) {
      this.accountId = accountId;
      return this;
    }

    @Override
    @JsonSetter("income_type")
    public FrequencyStage incomeType(EnumIncomeStreamType incomeType) {
      this.incomeType = incomeType;
      return this;
    }

    @Override
    @JsonSetter("frequency")
    public MonthlyAverageStage frequency(EnumIncomeStreamFrequency frequency) {
      this.frequency = frequency;
      return this;
    }

    /**
     * <p>The average amount of income received from the source over <code>lookback_periods</code>.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("monthly_average")
    public AverageIncomeAmountStage monthlyAverage(double monthlyAverage) {
      this.monthlyAverage = monthlyAverage;
      return this;
    }

    /**
     * <p>The average income transaction amount from the source.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("average_income_amount")
    public LastIncomeAmountStage averageIncomeAmount(double averageIncomeAmount) {
      this.averageIncomeAmount = averageIncomeAmount;
      return this;
    }

    /**
     * <p>The amount of the most recent income received from the source.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("last_income_amount")
    public CurrencyStage lastIncomeAmount(double lastIncomeAmount) {
      this.lastIncomeAmount = lastIncomeAmount;
      return this;
    }

    /**
     * <p>The three-letter currency code of the income. For example:</p>
     * <p>• 🇧🇷 BRL (Brazilian Real)
     * • 🇨🇴 COP (Colombian Peso)
     * • 🇲🇽 MXN (Mexican Peso)</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("currency")
    public LastIncomeDescriptionStage currency(String currency) {
      this.currency = currency;
      return this;
    }

    @Override
    @JsonSetter("last_income_description")
    public LastIncomeDateStage lastIncomeDescription(Object lastIncomeDescription) {
      this.lastIncomeDescription = lastIncomeDescription;
      return this;
    }

    /**
     * <p>The date when the most recent income from the stream was received, in <code>YYYY-MM-DD</code> format.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("last_income_date")
    public LookbackPeriodsStage lastIncomeDate(String lastIncomeDate) {
      this.lastIncomeDate = lastIncomeDate;
      return this;
    }

    /**
     * <p>Number of period units (based on <em>rolling months</em>) used to generate insights and calculations.</p>
     * <p><strong>Note:</strong> A <em>rolling month</em> is a period of 30 days. For example, 2023-01-15 to 2023-02-2023.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("lookback_periods")
    public FullPeriodsStage lookbackPeriods(int lookbackPeriods) {
      this.lookbackPeriods = lookbackPeriods;
      return this;
    }

    /**
     * <p>Number of period units (based on <em>rolling months</em>) with data to perform calculations.</p>
     * <p><strong>Note:</strong> A <em>rolling month</em> is a period of 30 days. For example, 2023-01-15 to 2023-02-2023.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("full_periods")
    public PeriodsWithIncomeStage fullPeriods(int fullPeriods) {
      this.fullPeriods = fullPeriods;
      return this;
    }

    /**
     * <p>Number of period units (based on <em>rolling months</em>) with at least one income available.</p>
     * <p><strong>Note:</strong> A <em>rolling month</em> is a period of 30 days. For example, 2023-01-15 to 2023-02-2023.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("periods_with_income")
    public NumberOfIncomesStage periodsWithIncome(int periodsWithIncome) {
      this.periodsWithIncome = periodsWithIncome;
      return this;
    }

    /**
     * <p>Number of income transactions over the <code>lookback_periods</code>.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("number_of_incomes")
    public ConfidenceStage numberOfIncomes(int numberOfIncomes) {
      this.numberOfIncomes = numberOfIncomes;
      return this;
    }

    @Override
    @JsonSetter("confidence")
    public _FinalStage confidence(EnumIncomeStreamConfidence confidence) {
      this.confidence = confidence;
      return this;
    }

    /**
     * <p>The income trend during a period of time calculated between last income and first income received, where:</p>
     * <ul>
     * <li>a negative float means that the income trend is decreasing during the time period.</li>
     * <li>a positive float means that the income trend is increasing during the time period.</li>
     * </ul>
     * <p><strong>Note:</strong> For transactions with <code>frequency</code>=<code>SINGLE</code>, this value returns <code>null</code>.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage trend(Double trend) {
      this.trend = Optional.of(trend);
      return this;
    }

    @Override
    @JsonSetter(
        value = "trend",
        nulls = Nulls.SKIP
    )
    public _FinalStage trend(Optional<Double> trend) {
      this.trend = trend;
      return this;
    }

    /**
     * <p>The regularity of the income basde in its frequency, with a range from 0 to 1, where 1 represents perfect regularity.</p>
     * <p><strong>Note:</strong> For transactions with <code>frequency</code>=<code>SINGLE</code>, this value returns <code>null</code>.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage regularity(Double regularity) {
      this.regularity = Optional.of(regularity);
      return this;
    }

    @Override
    @JsonSetter(
        value = "regularity",
        nulls = Nulls.SKIP
    )
    public _FinalStage regularity(Optional<Double> regularity) {
      this.regularity = regularity;
      return this;
    }

    /**
     * <p>The stability of the income based on its amount, with a range from 0 to 1, where 1 represents perfect stability.</p>
     * <p><strong>Note:</strong> For transactions with <code>frequency</code>=<code>SINGLE</code>, this value returns <code>null</code>.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage stability(Double stability) {
      this.stability = Optional.of(stability);
      return this;
    }

    @Override
    @JsonSetter(
        value = "stability",
        nulls = Nulls.SKIP
    )
    public _FinalStage stability(Optional<Double> stability) {
      this.stability = stability;
      return this;
    }

    @Override
    public IncomeStreamsBody build() {
      return new IncomeStreamsBody(accountId, incomeType, frequency, monthlyAverage, averageIncomeAmount, lastIncomeAmount, currency, lastIncomeDescription, lastIncomeDate, stability, regularity, trend, lookbackPeriods, fullPeriods, periodsWithIncome, numberOfIncomes, confidence);
    }
  }
}
