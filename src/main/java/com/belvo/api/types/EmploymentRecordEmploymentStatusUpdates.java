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
    builder = EmploymentRecordEmploymentStatusUpdates.Builder.class
)
public final class EmploymentRecordEmploymentStatusUpdates {
  private final Optional<EnumEmploymentRecordStatusUpdateEvents> event;

  private final Optional<Double> baseSalary;

  private final Optional<String> updateDate;

  private int _cachedHashCode;

  EmploymentRecordEmploymentStatusUpdates(Optional<EnumEmploymentRecordStatusUpdateEvents> event,
      Optional<Double> baseSalary, Optional<String> updateDate) {
    this.event = event;
    this.baseSalary = baseSalary;
    this.updateDate = updateDate;
  }

  @JsonProperty("event")
  public Optional<EnumEmploymentRecordStatusUpdateEvents> getEvent() {
    return event;
  }

  /**
   * @return The base salary of the individual, current as of the <code>update_date</code>.
   */
  @JsonProperty("base_salary")
  public Optional<Double> getBaseSalary() {
    return baseSalary;
  }

  /**
   * @return The date that the employment event occured, in <code>YYYY-MM-DD</code> format.
   */
  @JsonProperty("update_date")
  public Optional<String> getUpdateDate() {
    return updateDate;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof EmploymentRecordEmploymentStatusUpdates && equalTo((EmploymentRecordEmploymentStatusUpdates) other);
  }

  private boolean equalTo(EmploymentRecordEmploymentStatusUpdates other) {
    return event.equals(other.event) && baseSalary.equals(other.baseSalary) && updateDate.equals(other.updateDate);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.event, this.baseSalary, this.updateDate);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "EmploymentRecordEmploymentStatusUpdates{" + "event: " + event + ", baseSalary: " + baseSalary + ", updateDate: " + updateDate + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<EnumEmploymentRecordStatusUpdateEvents> event = Optional.empty();

    private Optional<Double> baseSalary = Optional.empty();

    private Optional<String> updateDate = Optional.empty();

    private Builder() {
    }

    public Builder from(EmploymentRecordEmploymentStatusUpdates other) {
      event(other.getEvent());
      baseSalary(other.getBaseSalary());
      updateDate(other.getUpdateDate());
      return this;
    }

    @JsonSetter(
        value = "event",
        nulls = Nulls.SKIP
    )
    public Builder event(Optional<EnumEmploymentRecordStatusUpdateEvents> event) {
      this.event = event;
      return this;
    }

    public Builder event(EnumEmploymentRecordStatusUpdateEvents event) {
      this.event = Optional.of(event);
      return this;
    }

    @JsonSetter(
        value = "base_salary",
        nulls = Nulls.SKIP
    )
    public Builder baseSalary(Optional<Double> baseSalary) {
      this.baseSalary = baseSalary;
      return this;
    }

    public Builder baseSalary(Double baseSalary) {
      this.baseSalary = Optional.of(baseSalary);
      return this;
    }

    @JsonSetter(
        value = "update_date",
        nulls = Nulls.SKIP
    )
    public Builder updateDate(Optional<String> updateDate) {
      this.updateDate = updateDate;
      return this;
    }

    public Builder updateDate(String updateDate) {
      this.updateDate = Optional.of(updateDate);
      return this;
    }

    public EmploymentRecordEmploymentStatusUpdates build() {
      return new EmploymentRecordEmploymentStatusUpdates(event, baseSalary, updateDate);
    }
  }
}
