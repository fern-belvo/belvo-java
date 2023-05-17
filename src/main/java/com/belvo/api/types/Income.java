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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = Income.Builder.class
)
public final class Income {
  private final String id;

  private final String link;

  private final String createdAt;

  private final List<IncomeStreamsBody> incomeStreams;

  private final EnumIncomeSourceType incomeSourceType;

  private final Optional<String> firstTransactionDate;

  private final String lastTransactionDate;

  private final int numberOfIncomeStreams;

  private final double monthlyAverage;

  private final double monthlyAverageRegular;

  private final double monthlyAverageIrregular;

  private final double monthlyAverageLowConfidence;

  private final double monthlyAverageMediumConfidence;

  private final double monthlyAverageHighConfidence;

  private final double totalIncomeAmount;

  private final double totalRegularIncomeAmount;

  private final Optional<Double> totalIrregularIncomeAmount;

  private final double totalLowConfidence;

  private final double totalMediumConfidence;

  private final double totalHighConfidence;

  private int _cachedHashCode;

  Income(String id, String link, String createdAt, List<IncomeStreamsBody> incomeStreams,
      EnumIncomeSourceType incomeSourceType, Optional<String> firstTransactionDate,
      String lastTransactionDate, int numberOfIncomeStreams, double monthlyAverage,
      double monthlyAverageRegular, double monthlyAverageIrregular,
      double monthlyAverageLowConfidence, double monthlyAverageMediumConfidence,
      double monthlyAverageHighConfidence, double totalIncomeAmount,
      double totalRegularIncomeAmount, Optional<Double> totalIrregularIncomeAmount,
      double totalLowConfidence, double totalMediumConfidence, double totalHighConfidence) {
    this.id = id;
    this.link = link;
    this.createdAt = createdAt;
    this.incomeStreams = incomeStreams;
    this.incomeSourceType = incomeSourceType;
    this.firstTransactionDate = firstTransactionDate;
    this.lastTransactionDate = lastTransactionDate;
    this.numberOfIncomeStreams = numberOfIncomeStreams;
    this.monthlyAverage = monthlyAverage;
    this.monthlyAverageRegular = monthlyAverageRegular;
    this.monthlyAverageIrregular = monthlyAverageIrregular;
    this.monthlyAverageLowConfidence = monthlyAverageLowConfidence;
    this.monthlyAverageMediumConfidence = monthlyAverageMediumConfidence;
    this.monthlyAverageHighConfidence = monthlyAverageHighConfidence;
    this.totalIncomeAmount = totalIncomeAmount;
    this.totalRegularIncomeAmount = totalRegularIncomeAmount;
    this.totalIrregularIncomeAmount = totalIrregularIncomeAmount;
    this.totalLowConfidence = totalLowConfidence;
    this.totalMediumConfidence = totalMediumConfidence;
    this.totalHighConfidence = totalHighConfidence;
  }

  /**
   * @return Belvo's unique identifier for the current income.
   */
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * @return The <code>link.id</code> the account belongs to.
   */
  @JsonProperty("link")
  public String getLink() {
    return link;
  }

  /**
   * @return The ISO-8601 timestamp of when the data point was created in Belvo's database.
   */
  @JsonProperty("created_at")
  public String getCreatedAt() {
    return createdAt;
  }

  /**
   * @return An array of enriched income stream objects.
   */
  @JsonProperty("income_streams")
  public List<IncomeStreamsBody> getIncomeStreams() {
    return incomeStreams;
  }

  @JsonProperty("income_source_type")
  public EnumIncomeSourceType getIncomeSourceType() {
    return incomeSourceType;
  }

  /**
   * @return The date when the first transaction occurred, in <code>YYYY-MM-DD</code> format.
   */
  @JsonProperty("first_transaction_date")
  public Optional<String> getFirstTransactionDate() {
    return firstTransactionDate;
  }

  /**
   * @return The date when when the last transaction occurred, in <code>YYYY-MM-DD</code> format.
   */
  @JsonProperty("last_transaction_date")
  public String getLastTransactionDate() {
    return lastTransactionDate;
  }

  /**
   * @return Number of total income streams analized.
   */
  @JsonProperty("number_of_income_streams")
  public int getNumberOfIncomeStreams() {
    return numberOfIncomeStreams;
  }

  /**
   * @return Average amount of income received per month across all the accounts for the specific user.
   */
  @JsonProperty("monthly_average")
  public double getMonthlyAverage() {
    return monthlyAverage;
  }

  /**
   * @return Average amount of regular income (with a frequency of <code>MONTHLY</code>, <code>FORTNIGHTLY</code>, or <code>WEEKLY</code>) received per month for the specific user.
   */
  @JsonProperty("monthly_average_regular")
  public double getMonthlyAverageRegular() {
    return monthlyAverageRegular;
  }

  /**
   * @return Average amount of irregular income (with a frequency of <code>SINGLE</code> or <code>IRREGULAR</code>) received per month for the specific user.
   */
  @JsonProperty("monthly_average_irregular")
  public double getMonthlyAverageIrregular() {
    return monthlyAverageIrregular;
  }

  /**
   * @return Average amount of income received per month for the specific user with <code>LOW</code> confidence.
   */
  @JsonProperty("monthly_average_low_confidence")
  public double getMonthlyAverageLowConfidence() {
    return monthlyAverageLowConfidence;
  }

  /**
   * @return Average amount of income received per month for the specific user with <code>MEDIUM</code> confidence.
   */
  @JsonProperty("monthly_average_medium_confidence")
  public double getMonthlyAverageMediumConfidence() {
    return monthlyAverageMediumConfidence;
  }

  /**
   * @return Average amount of income received per month for the specific user with <code>HIGH</code> confidence.
   */
  @JsonProperty("monthly_average_high_confidence")
  public double getMonthlyAverageHighConfidence() {
    return monthlyAverageHighConfidence;
  }

  /**
   * @return Total amount of all income received for the specific user.
   */
  @JsonProperty("total_income_amount")
  public double getTotalIncomeAmount() {
    return totalIncomeAmount;
  }

  /**
   * @return Total amount of regular income (with a frequency of <code>MONTHLY</code>, <code>FORTNIGHTLY</code>, <code>WEEKLY</code>) for the specific user.
   */
  @JsonProperty("total_regular_income_amount")
  public double getTotalRegularIncomeAmount() {
    return totalRegularIncomeAmount;
  }

  /**
   * @return Total amount of irregular income (with a frequency of <code>SINGLE</code> or <code>IRREGULAR</code>) for the specific user.
   */
  @JsonProperty("total_irregular_income_amount")
  public Optional<Double> getTotalIrregularIncomeAmount() {
    return totalIrregularIncomeAmount;
  }

  /**
   * @return Total amount of income for the specific user with <code>LOW</code> confidence.
   */
  @JsonProperty("total_low_confidence")
  public double getTotalLowConfidence() {
    return totalLowConfidence;
  }

  /**
   * @return Total amount of income for the specific user with <code>MEDIUM</code> confidence.
   */
  @JsonProperty("total_medium_confidence")
  public double getTotalMediumConfidence() {
    return totalMediumConfidence;
  }

  /**
   * @return Total amount of income for the specific user with <code>HIGH</code> confidence.
   */
  @JsonProperty("total_high_confidence")
  public double getTotalHighConfidence() {
    return totalHighConfidence;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof Income && equalTo((Income) other);
  }

  private boolean equalTo(Income other) {
    return id.equals(other.id) && link.equals(other.link) && createdAt.equals(other.createdAt) && incomeStreams.equals(other.incomeStreams) && incomeSourceType.equals(other.incomeSourceType) && firstTransactionDate.equals(other.firstTransactionDate) && lastTransactionDate.equals(other.lastTransactionDate) && numberOfIncomeStreams == other.numberOfIncomeStreams && monthlyAverage == other.monthlyAverage && monthlyAverageRegular == other.monthlyAverageRegular && monthlyAverageIrregular == other.monthlyAverageIrregular && monthlyAverageLowConfidence == other.monthlyAverageLowConfidence && monthlyAverageMediumConfidence == other.monthlyAverageMediumConfidence && monthlyAverageHighConfidence == other.monthlyAverageHighConfidence && totalIncomeAmount == other.totalIncomeAmount && totalRegularIncomeAmount == other.totalRegularIncomeAmount && totalIrregularIncomeAmount.equals(other.totalIrregularIncomeAmount) && totalLowConfidence == other.totalLowConfidence && totalMediumConfidence == other.totalMediumConfidence && totalHighConfidence == other.totalHighConfidence;
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.id, this.link, this.createdAt, this.incomeStreams, this.incomeSourceType, this.firstTransactionDate, this.lastTransactionDate, this.numberOfIncomeStreams, this.monthlyAverage, this.monthlyAverageRegular, this.monthlyAverageIrregular, this.monthlyAverageLowConfidence, this.monthlyAverageMediumConfidence, this.monthlyAverageHighConfidence, this.totalIncomeAmount, this.totalRegularIncomeAmount, this.totalIrregularIncomeAmount, this.totalLowConfidence, this.totalMediumConfidence, this.totalHighConfidence);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "Income{" + "id: " + id + ", link: " + link + ", createdAt: " + createdAt + ", incomeStreams: " + incomeStreams + ", incomeSourceType: " + incomeSourceType + ", firstTransactionDate: " + firstTransactionDate + ", lastTransactionDate: " + lastTransactionDate + ", numberOfIncomeStreams: " + numberOfIncomeStreams + ", monthlyAverage: " + monthlyAverage + ", monthlyAverageRegular: " + monthlyAverageRegular + ", monthlyAverageIrregular: " + monthlyAverageIrregular + ", monthlyAverageLowConfidence: " + monthlyAverageLowConfidence + ", monthlyAverageMediumConfidence: " + monthlyAverageMediumConfidence + ", monthlyAverageHighConfidence: " + monthlyAverageHighConfidence + ", totalIncomeAmount: " + totalIncomeAmount + ", totalRegularIncomeAmount: " + totalRegularIncomeAmount + ", totalIrregularIncomeAmount: " + totalIrregularIncomeAmount + ", totalLowConfidence: " + totalLowConfidence + ", totalMediumConfidence: " + totalMediumConfidence + ", totalHighConfidence: " + totalHighConfidence + "}";
  }

  public static IdStage builder() {
    return new Builder();
  }

  public interface IdStage {
    LinkStage id(String id);

    Builder from(Income other);
  }

  public interface LinkStage {
    CreatedAtStage link(String link);
  }

  public interface CreatedAtStage {
    IncomeSourceTypeStage createdAt(String createdAt);
  }

  public interface IncomeSourceTypeStage {
    LastTransactionDateStage incomeSourceType(EnumIncomeSourceType incomeSourceType);
  }

  public interface LastTransactionDateStage {
    NumberOfIncomeStreamsStage lastTransactionDate(String lastTransactionDate);
  }

  public interface NumberOfIncomeStreamsStage {
    MonthlyAverageStage numberOfIncomeStreams(int numberOfIncomeStreams);
  }

  public interface MonthlyAverageStage {
    MonthlyAverageRegularStage monthlyAverage(double monthlyAverage);
  }

  public interface MonthlyAverageRegularStage {
    MonthlyAverageIrregularStage monthlyAverageRegular(double monthlyAverageRegular);
  }

  public interface MonthlyAverageIrregularStage {
    MonthlyAverageLowConfidenceStage monthlyAverageIrregular(double monthlyAverageIrregular);
  }

  public interface MonthlyAverageLowConfidenceStage {
    MonthlyAverageMediumConfidenceStage monthlyAverageLowConfidence(
        double monthlyAverageLowConfidence);
  }

  public interface MonthlyAverageMediumConfidenceStage {
    MonthlyAverageHighConfidenceStage monthlyAverageMediumConfidence(
        double monthlyAverageMediumConfidence);
  }

  public interface MonthlyAverageHighConfidenceStage {
    TotalIncomeAmountStage monthlyAverageHighConfidence(double monthlyAverageHighConfidence);
  }

  public interface TotalIncomeAmountStage {
    TotalRegularIncomeAmountStage totalIncomeAmount(double totalIncomeAmount);
  }

  public interface TotalRegularIncomeAmountStage {
    TotalLowConfidenceStage totalRegularIncomeAmount(double totalRegularIncomeAmount);
  }

  public interface TotalLowConfidenceStage {
    TotalMediumConfidenceStage totalLowConfidence(double totalLowConfidence);
  }

  public interface TotalMediumConfidenceStage {
    TotalHighConfidenceStage totalMediumConfidence(double totalMediumConfidence);
  }

  public interface TotalHighConfidenceStage {
    _FinalStage totalHighConfidence(double totalHighConfidence);
  }

  public interface _FinalStage {
    Income build();

    _FinalStage incomeStreams(List<IncomeStreamsBody> incomeStreams);

    _FinalStage addIncomeStreams(IncomeStreamsBody incomeStreams);

    _FinalStage addAllIncomeStreams(List<IncomeStreamsBody> incomeStreams);

    _FinalStage firstTransactionDate(Optional<String> firstTransactionDate);

    _FinalStage firstTransactionDate(String firstTransactionDate);

    _FinalStage totalIrregularIncomeAmount(Optional<Double> totalIrregularIncomeAmount);

    _FinalStage totalIrregularIncomeAmount(Double totalIrregularIncomeAmount);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements IdStage, LinkStage, CreatedAtStage, IncomeSourceTypeStage, LastTransactionDateStage, NumberOfIncomeStreamsStage, MonthlyAverageStage, MonthlyAverageRegularStage, MonthlyAverageIrregularStage, MonthlyAverageLowConfidenceStage, MonthlyAverageMediumConfidenceStage, MonthlyAverageHighConfidenceStage, TotalIncomeAmountStage, TotalRegularIncomeAmountStage, TotalLowConfidenceStage, TotalMediumConfidenceStage, TotalHighConfidenceStage, _FinalStage {
    private String id;

    private String link;

    private String createdAt;

    private EnumIncomeSourceType incomeSourceType;

    private String lastTransactionDate;

    private int numberOfIncomeStreams;

    private double monthlyAverage;

    private double monthlyAverageRegular;

    private double monthlyAverageIrregular;

    private double monthlyAverageLowConfidence;

    private double monthlyAverageMediumConfidence;

    private double monthlyAverageHighConfidence;

    private double totalIncomeAmount;

    private double totalRegularIncomeAmount;

    private double totalLowConfidence;

    private double totalMediumConfidence;

    private double totalHighConfidence;

    private Optional<Double> totalIrregularIncomeAmount = Optional.empty();

    private Optional<String> firstTransactionDate = Optional.empty();

    private List<IncomeStreamsBody> incomeStreams = new ArrayList<>();

    private Builder() {
    }

    @Override
    public Builder from(Income other) {
      id(other.getId());
      link(other.getLink());
      createdAt(other.getCreatedAt());
      incomeStreams(other.getIncomeStreams());
      incomeSourceType(other.getIncomeSourceType());
      firstTransactionDate(other.getFirstTransactionDate());
      lastTransactionDate(other.getLastTransactionDate());
      numberOfIncomeStreams(other.getNumberOfIncomeStreams());
      monthlyAverage(other.getMonthlyAverage());
      monthlyAverageRegular(other.getMonthlyAverageRegular());
      monthlyAverageIrregular(other.getMonthlyAverageIrregular());
      monthlyAverageLowConfidence(other.getMonthlyAverageLowConfidence());
      monthlyAverageMediumConfidence(other.getMonthlyAverageMediumConfidence());
      monthlyAverageHighConfidence(other.getMonthlyAverageHighConfidence());
      totalIncomeAmount(other.getTotalIncomeAmount());
      totalRegularIncomeAmount(other.getTotalRegularIncomeAmount());
      totalIrregularIncomeAmount(other.getTotalIrregularIncomeAmount());
      totalLowConfidence(other.getTotalLowConfidence());
      totalMediumConfidence(other.getTotalMediumConfidence());
      totalHighConfidence(other.getTotalHighConfidence());
      return this;
    }

    /**
     * <p>Belvo's unique identifier for the current income.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("id")
    public LinkStage id(String id) {
      this.id = id;
      return this;
    }

    /**
     * <p>The <code>link.id</code> the account belongs to.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("link")
    public CreatedAtStage link(String link) {
      this.link = link;
      return this;
    }

    /**
     * <p>The ISO-8601 timestamp of when the data point was created in Belvo's database.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("created_at")
    public IncomeSourceTypeStage createdAt(String createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    @Override
    @JsonSetter("income_source_type")
    public LastTransactionDateStage incomeSourceType(EnumIncomeSourceType incomeSourceType) {
      this.incomeSourceType = incomeSourceType;
      return this;
    }

    /**
     * <p>The date when when the last transaction occurred, in <code>YYYY-MM-DD</code> format.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("last_transaction_date")
    public NumberOfIncomeStreamsStage lastTransactionDate(String lastTransactionDate) {
      this.lastTransactionDate = lastTransactionDate;
      return this;
    }

    /**
     * <p>Number of total income streams analized.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("number_of_income_streams")
    public MonthlyAverageStage numberOfIncomeStreams(int numberOfIncomeStreams) {
      this.numberOfIncomeStreams = numberOfIncomeStreams;
      return this;
    }

    /**
     * <p>Average amount of income received per month across all the accounts for the specific user.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("monthly_average")
    public MonthlyAverageRegularStage monthlyAverage(double monthlyAverage) {
      this.monthlyAverage = monthlyAverage;
      return this;
    }

    /**
     * <p>Average amount of regular income (with a frequency of <code>MONTHLY</code>, <code>FORTNIGHTLY</code>, or <code>WEEKLY</code>) received per month for the specific user.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("monthly_average_regular")
    public MonthlyAverageIrregularStage monthlyAverageRegular(double monthlyAverageRegular) {
      this.monthlyAverageRegular = monthlyAverageRegular;
      return this;
    }

    /**
     * <p>Average amount of irregular income (with a frequency of <code>SINGLE</code> or <code>IRREGULAR</code>) received per month for the specific user.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("monthly_average_irregular")
    public MonthlyAverageLowConfidenceStage monthlyAverageIrregular(
        double monthlyAverageIrregular) {
      this.monthlyAverageIrregular = monthlyAverageIrregular;
      return this;
    }

    /**
     * <p>Average amount of income received per month for the specific user with <code>LOW</code> confidence.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("monthly_average_low_confidence")
    public MonthlyAverageMediumConfidenceStage monthlyAverageLowConfidence(
        double monthlyAverageLowConfidence) {
      this.monthlyAverageLowConfidence = monthlyAverageLowConfidence;
      return this;
    }

    /**
     * <p>Average amount of income received per month for the specific user with <code>MEDIUM</code> confidence.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("monthly_average_medium_confidence")
    public MonthlyAverageHighConfidenceStage monthlyAverageMediumConfidence(
        double monthlyAverageMediumConfidence) {
      this.monthlyAverageMediumConfidence = monthlyAverageMediumConfidence;
      return this;
    }

    /**
     * <p>Average amount of income received per month for the specific user with <code>HIGH</code> confidence.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("monthly_average_high_confidence")
    public TotalIncomeAmountStage monthlyAverageHighConfidence(
        double monthlyAverageHighConfidence) {
      this.monthlyAverageHighConfidence = monthlyAverageHighConfidence;
      return this;
    }

    /**
     * <p>Total amount of all income received for the specific user.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("total_income_amount")
    public TotalRegularIncomeAmountStage totalIncomeAmount(double totalIncomeAmount) {
      this.totalIncomeAmount = totalIncomeAmount;
      return this;
    }

    /**
     * <p>Total amount of regular income (with a frequency of <code>MONTHLY</code>, <code>FORTNIGHTLY</code>, <code>WEEKLY</code>) for the specific user.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("total_regular_income_amount")
    public TotalLowConfidenceStage totalRegularIncomeAmount(double totalRegularIncomeAmount) {
      this.totalRegularIncomeAmount = totalRegularIncomeAmount;
      return this;
    }

    /**
     * <p>Total amount of income for the specific user with <code>LOW</code> confidence.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("total_low_confidence")
    public TotalMediumConfidenceStage totalLowConfidence(double totalLowConfidence) {
      this.totalLowConfidence = totalLowConfidence;
      return this;
    }

    /**
     * <p>Total amount of income for the specific user with <code>MEDIUM</code> confidence.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("total_medium_confidence")
    public TotalHighConfidenceStage totalMediumConfidence(double totalMediumConfidence) {
      this.totalMediumConfidence = totalMediumConfidence;
      return this;
    }

    /**
     * <p>Total amount of income for the specific user with <code>HIGH</code> confidence.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("total_high_confidence")
    public _FinalStage totalHighConfidence(double totalHighConfidence) {
      this.totalHighConfidence = totalHighConfidence;
      return this;
    }

    /**
     * <p>Total amount of irregular income (with a frequency of <code>SINGLE</code> or <code>IRREGULAR</code>) for the specific user.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage totalIrregularIncomeAmount(Double totalIrregularIncomeAmount) {
      this.totalIrregularIncomeAmount = Optional.of(totalIrregularIncomeAmount);
      return this;
    }

    @Override
    @JsonSetter(
        value = "total_irregular_income_amount",
        nulls = Nulls.SKIP
    )
    public _FinalStage totalIrregularIncomeAmount(Optional<Double> totalIrregularIncomeAmount) {
      this.totalIrregularIncomeAmount = totalIrregularIncomeAmount;
      return this;
    }

    /**
     * <p>The date when the first transaction occurred, in <code>YYYY-MM-DD</code> format.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage firstTransactionDate(String firstTransactionDate) {
      this.firstTransactionDate = Optional.of(firstTransactionDate);
      return this;
    }

    @Override
    @JsonSetter(
        value = "first_transaction_date",
        nulls = Nulls.SKIP
    )
    public _FinalStage firstTransactionDate(Optional<String> firstTransactionDate) {
      this.firstTransactionDate = firstTransactionDate;
      return this;
    }

    /**
     * <p>An array of enriched income stream objects.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage addAllIncomeStreams(List<IncomeStreamsBody> incomeStreams) {
      this.incomeStreams.addAll(incomeStreams);
      return this;
    }

    /**
     * <p>An array of enriched income stream objects.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage addIncomeStreams(IncomeStreamsBody incomeStreams) {
      this.incomeStreams.add(incomeStreams);
      return this;
    }

    @Override
    @JsonSetter(
        value = "income_streams",
        nulls = Nulls.SKIP
    )
    public _FinalStage incomeStreams(List<IncomeStreamsBody> incomeStreams) {
      this.incomeStreams.clear();
      this.incomeStreams.addAll(incomeStreams);
      return this;
    }

    @Override
    public Income build() {
      return new Income(id, link, createdAt, incomeStreams, incomeSourceType, firstTransactionDate, lastTransactionDate, numberOfIncomeStreams, monthlyAverage, monthlyAverageRegular, monthlyAverageIrregular, monthlyAverageLowConfidence, monthlyAverageMediumConfidence, monthlyAverageHighConfidence, totalIncomeAmount, totalRegularIncomeAmount, totalIrregularIncomeAmount, totalLowConfidence, totalMediumConfidence, totalHighConfidence);
    }
  }
}
