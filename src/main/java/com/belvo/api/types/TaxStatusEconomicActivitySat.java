package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = TaxStatusEconomicActivitySat.Builder.class
)
public final class TaxStatusEconomicActivitySat {
  private final Optional<String> economicActivity;

  private final Optional<String> initialDate;

  private final Optional<String> endDate;

  private final Optional<String> order;

  private final Optional<String> percentage;

  private int _cachedHashCode;

  TaxStatusEconomicActivitySat(Optional<String> economicActivity, Optional<String> initialDate,
      Optional<String> endDate, Optional<String> order, Optional<String> percentage) {
    this.economicActivity = economicActivity;
    this.initialDate = initialDate;
    this.endDate = endDate;
    this.order = order;
    this.percentage = percentage;
  }

  /**
   * @return The description of the economic activity.
   */
  @JsonProperty("economic_activity")
  public Optional<String> getEconomicActivity() {
    return economicActivity;
  }

  /**
   * @return The start date of the economic activity.
   */
  @JsonProperty("initial_date")
  public Optional<String> getInitialDate() {
    return initialDate;
  }

  /**
   * @return The end date of the economic activity.
   */
  @JsonProperty("end_date")
  public Optional<String> getEndDate() {
    return endDate;
  }

  /**
   * @return The order of the economic activity.
   */
  @JsonProperty("order")
  public Optional<String> getOrder() {
    return order;
  }

  /**
   * @return The percentage of the economic activity.
   */
  @JsonProperty("percentage")
  public Optional<String> getPercentage() {
    return percentage;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof TaxStatusEconomicActivitySat && equalTo((TaxStatusEconomicActivitySat) other);
  }

  private boolean equalTo(TaxStatusEconomicActivitySat other) {
    return economicActivity.equals(other.economicActivity) && initialDate.equals(other.initialDate) && endDate.equals(other.endDate) && order.equals(other.order) && percentage.equals(other.percentage);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.economicActivity, this.initialDate, this.endDate, this.order, this.percentage);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "TaxStatusEconomicActivitySat{" + "economicActivity: " + economicActivity + ", initialDate: " + initialDate + ", endDate: " + endDate + ", order: " + order + ", percentage: " + percentage + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> economicActivity = Optional.empty();

    private Optional<String> initialDate = Optional.empty();

    private Optional<String> endDate = Optional.empty();

    private Optional<String> order = Optional.empty();

    private Optional<String> percentage = Optional.empty();

    private Builder() {
    }

    public Builder from(TaxStatusEconomicActivitySat other) {
      economicActivity(other.getEconomicActivity());
      initialDate(other.getInitialDate());
      endDate(other.getEndDate());
      order(other.getOrder());
      percentage(other.getPercentage());
      return this;
    }

    @JsonSetter(
        value = "economic_activity",
        nulls = Nulls.SKIP
    )
    public Builder economicActivity(Optional<String> economicActivity) {
      this.economicActivity = economicActivity;
      return this;
    }

    public Builder economicActivity(String economicActivity) {
      this.economicActivity = Optional.of(economicActivity);
      return this;
    }

    @JsonSetter(
        value = "initial_date",
        nulls = Nulls.SKIP
    )
    public Builder initialDate(Optional<String> initialDate) {
      this.initialDate = initialDate;
      return this;
    }

    public Builder initialDate(String initialDate) {
      this.initialDate = Optional.of(initialDate);
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
        value = "order",
        nulls = Nulls.SKIP
    )
    public Builder order(Optional<String> order) {
      this.order = order;
      return this;
    }

    public Builder order(String order) {
      this.order = Optional.of(order);
      return this;
    }

    @JsonSetter(
        value = "percentage",
        nulls = Nulls.SKIP
    )
    public Builder percentage(Optional<String> percentage) {
      this.percentage = percentage;
      return this;
    }

    public Builder percentage(String percentage) {
      this.percentage = Optional.of(percentage);
      return this;
    }

    public TaxStatusEconomicActivitySat build() {
      return new TaxStatusEconomicActivitySat(economicActivity, initialDate, endDate, order, percentage);
    }
  }
}
