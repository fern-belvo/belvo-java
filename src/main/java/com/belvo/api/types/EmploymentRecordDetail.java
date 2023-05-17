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
    builder = EmploymentRecordDetail.Builder.class
)
public final class EmploymentRecordDetail {
  private final Optional<String> collectedAt;

  private final Optional<String> employer;

  private final Optional<String> employerId;

  private final Optional<String> startDate;

  private final Optional<String> endDate;

  private final Optional<Integer> weeksEmployed;

  private final Optional<String> state;

  private final Optional<Double> mostRecentBaseSalary;

  private final Optional<Double> monthlySalary;

  private final Optional<String> currency;

  private final Optional<List<EmploymentRecordEmploymentStatusUpdates>> employmentStatusUpdates;

  private int _cachedHashCode;

  EmploymentRecordDetail(Optional<String> collectedAt, Optional<String> employer,
      Optional<String> employerId, Optional<String> startDate, Optional<String> endDate,
      Optional<Integer> weeksEmployed, Optional<String> state,
      Optional<Double> mostRecentBaseSalary, Optional<Double> monthlySalary,
      Optional<String> currency,
      Optional<List<EmploymentRecordEmploymentStatusUpdates>> employmentStatusUpdates) {
    this.collectedAt = collectedAt;
    this.employer = employer;
    this.employerId = employerId;
    this.startDate = startDate;
    this.endDate = endDate;
    this.weeksEmployed = weeksEmployed;
    this.state = state;
    this.mostRecentBaseSalary = mostRecentBaseSalary;
    this.monthlySalary = monthlySalary;
    this.currency = currency;
    this.employmentStatusUpdates = employmentStatusUpdates;
  }

  /**
   * @return The ISO-8601 timestamp when the data point was collected.
   */
  @JsonProperty("collected_at")
  public Optional<String> getCollectedAt() {
    return collectedAt;
  }

  /**
   * @return The official name of the employer.
   */
  @JsonProperty("employer")
  public Optional<String> getEmployer() {
    return employer;
  }

  /**
   * @return The official ID of the employer, according to the country.
   */
  @JsonProperty("employer_id")
  public Optional<String> getEmployerId() {
    return employerId;
  }

  /**
   * @return Date when employment started, in <code>YYYY-MM-DD</code> format.
   */
  @JsonProperty("start_date")
  public Optional<String> getStartDate() {
    return startDate;
  }

  /**
   * @return Date when employment finished, in <code>YYYY-MM-DD</code> format.
   */
  @JsonProperty("end_date")
  public Optional<String> getEndDate() {
    return endDate;
  }

  /**
   * @return Number of weeks that the individual was employed.
   */
  @JsonProperty("weeks_employed")
  public Optional<Integer> getWeeksEmployed() {
    return weeksEmployed;
  }

  /**
   * @return In what geographical state the individual was employed, according to the country.
   */
  @JsonProperty("state")
  public Optional<String> getState() {
    return state;
  }

  /**
   * @return The most recent base salary the individual earned.
   * <p>For Mexico, this is the <em>daily</em> rate that the individual earned, including the perks that the individual is entitled to throughout the year.</p>
   */
  @JsonProperty("most_recent_base_salary")
  public Optional<Double> getMostRecentBaseSalary() {
    return mostRecentBaseSalary;
  }

  /**
   * @return The monthly salary of the individual, including any additional perks.
   */
  @JsonProperty("monthly_salary")
  public Optional<Double> getMonthlySalary() {
    return monthlySalary;
  }

  /**
   * @return The three-letter currency code in which the salary is paid.
   */
  @JsonProperty("currency")
  public Optional<String> getCurrency() {
    return currency;
  }

  /**
   * @return Details regarding any employment changes of the individual.
   */
  @JsonProperty("employment_status_updates")
  public Optional<List<EmploymentRecordEmploymentStatusUpdates>> getEmploymentStatusUpdates() {
    return employmentStatusUpdates;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof EmploymentRecordDetail && equalTo((EmploymentRecordDetail) other);
  }

  private boolean equalTo(EmploymentRecordDetail other) {
    return collectedAt.equals(other.collectedAt) && employer.equals(other.employer) && employerId.equals(other.employerId) && startDate.equals(other.startDate) && endDate.equals(other.endDate) && weeksEmployed.equals(other.weeksEmployed) && state.equals(other.state) && mostRecentBaseSalary.equals(other.mostRecentBaseSalary) && monthlySalary.equals(other.monthlySalary) && currency.equals(other.currency) && employmentStatusUpdates.equals(other.employmentStatusUpdates);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.collectedAt, this.employer, this.employerId, this.startDate, this.endDate, this.weeksEmployed, this.state, this.mostRecentBaseSalary, this.monthlySalary, this.currency, this.employmentStatusUpdates);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "EmploymentRecordDetail{" + "collectedAt: " + collectedAt + ", employer: " + employer + ", employerId: " + employerId + ", startDate: " + startDate + ", endDate: " + endDate + ", weeksEmployed: " + weeksEmployed + ", state: " + state + ", mostRecentBaseSalary: " + mostRecentBaseSalary + ", monthlySalary: " + monthlySalary + ", currency: " + currency + ", employmentStatusUpdates: " + employmentStatusUpdates + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> collectedAt = Optional.empty();

    private Optional<String> employer = Optional.empty();

    private Optional<String> employerId = Optional.empty();

    private Optional<String> startDate = Optional.empty();

    private Optional<String> endDate = Optional.empty();

    private Optional<Integer> weeksEmployed = Optional.empty();

    private Optional<String> state = Optional.empty();

    private Optional<Double> mostRecentBaseSalary = Optional.empty();

    private Optional<Double> monthlySalary = Optional.empty();

    private Optional<String> currency = Optional.empty();

    private Optional<List<EmploymentRecordEmploymentStatusUpdates>> employmentStatusUpdates = Optional.empty();

    private Builder() {
    }

    public Builder from(EmploymentRecordDetail other) {
      collectedAt(other.getCollectedAt());
      employer(other.getEmployer());
      employerId(other.getEmployerId());
      startDate(other.getStartDate());
      endDate(other.getEndDate());
      weeksEmployed(other.getWeeksEmployed());
      state(other.getState());
      mostRecentBaseSalary(other.getMostRecentBaseSalary());
      monthlySalary(other.getMonthlySalary());
      currency(other.getCurrency());
      employmentStatusUpdates(other.getEmploymentStatusUpdates());
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
        value = "employer",
        nulls = Nulls.SKIP
    )
    public Builder employer(Optional<String> employer) {
      this.employer = employer;
      return this;
    }

    public Builder employer(String employer) {
      this.employer = Optional.of(employer);
      return this;
    }

    @JsonSetter(
        value = "employer_id",
        nulls = Nulls.SKIP
    )
    public Builder employerId(Optional<String> employerId) {
      this.employerId = employerId;
      return this;
    }

    public Builder employerId(String employerId) {
      this.employerId = Optional.of(employerId);
      return this;
    }

    @JsonSetter(
        value = "start_date",
        nulls = Nulls.SKIP
    )
    public Builder startDate(Optional<String> startDate) {
      this.startDate = startDate;
      return this;
    }

    public Builder startDate(String startDate) {
      this.startDate = Optional.of(startDate);
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
        value = "weeks_employed",
        nulls = Nulls.SKIP
    )
    public Builder weeksEmployed(Optional<Integer> weeksEmployed) {
      this.weeksEmployed = weeksEmployed;
      return this;
    }

    public Builder weeksEmployed(Integer weeksEmployed) {
      this.weeksEmployed = Optional.of(weeksEmployed);
      return this;
    }

    @JsonSetter(
        value = "state",
        nulls = Nulls.SKIP
    )
    public Builder state(Optional<String> state) {
      this.state = state;
      return this;
    }

    public Builder state(String state) {
      this.state = Optional.of(state);
      return this;
    }

    @JsonSetter(
        value = "most_recent_base_salary",
        nulls = Nulls.SKIP
    )
    public Builder mostRecentBaseSalary(Optional<Double> mostRecentBaseSalary) {
      this.mostRecentBaseSalary = mostRecentBaseSalary;
      return this;
    }

    public Builder mostRecentBaseSalary(Double mostRecentBaseSalary) {
      this.mostRecentBaseSalary = Optional.of(mostRecentBaseSalary);
      return this;
    }

    @JsonSetter(
        value = "monthly_salary",
        nulls = Nulls.SKIP
    )
    public Builder monthlySalary(Optional<Double> monthlySalary) {
      this.monthlySalary = monthlySalary;
      return this;
    }

    public Builder monthlySalary(Double monthlySalary) {
      this.monthlySalary = Optional.of(monthlySalary);
      return this;
    }

    @JsonSetter(
        value = "currency",
        nulls = Nulls.SKIP
    )
    public Builder currency(Optional<String> currency) {
      this.currency = currency;
      return this;
    }

    public Builder currency(String currency) {
      this.currency = Optional.of(currency);
      return this;
    }

    @JsonSetter(
        value = "employment_status_updates",
        nulls = Nulls.SKIP
    )
    public Builder employmentStatusUpdates(
        Optional<List<EmploymentRecordEmploymentStatusUpdates>> employmentStatusUpdates) {
      this.employmentStatusUpdates = employmentStatusUpdates;
      return this;
    }

    public Builder employmentStatusUpdates(
        List<EmploymentRecordEmploymentStatusUpdates> employmentStatusUpdates) {
      this.employmentStatusUpdates = Optional.of(employmentStatusUpdates);
      return this;
    }

    public EmploymentRecordDetail build() {
      return new EmploymentRecordDetail(collectedAt, employer, employerId, startDate, endDate, weeksEmployed, state, mostRecentBaseSalary, monthlySalary, currency, employmentStatusUpdates);
    }
  }
}
