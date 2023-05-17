package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

@JsonDeserialize(
    builder = ReportingId.Builder.class
)
public final class ReportingId {
  private final String reportingType;

  private final String reportingValue;

  private int _cachedHashCode;

  ReportingId(String reportingType, String reportingValue) {
    this.reportingType = reportingType;
    this.reportingValue = reportingValue;
  }

  /**
   * @return The type of reporting ID. For DIAN, this is the sectional address code (<em>Codigo Dirrecion Seccional</em>)
   */
  @JsonProperty("reporting_type")
  public String getReportingType() {
    return reportingType;
  }

  /**
   * @return The value of the reporting ID.
   */
  @JsonProperty("reporting_value")
  public String getReportingValue() {
    return reportingValue;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof ReportingId && equalTo((ReportingId) other);
  }

  private boolean equalTo(ReportingId other) {
    return reportingType.equals(other.reportingType) && reportingValue.equals(other.reportingValue);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.reportingType, this.reportingValue);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "ReportingId{" + "reportingType: " + reportingType + ", reportingValue: " + reportingValue + "}";
  }

  public static ReportingTypeStage builder() {
    return new Builder();
  }

  public interface ReportingTypeStage {
    ReportingValueStage reportingType(String reportingType);

    Builder from(ReportingId other);
  }

  public interface ReportingValueStage {
    _FinalStage reportingValue(String reportingValue);
  }

  public interface _FinalStage {
    ReportingId build();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements ReportingTypeStage, ReportingValueStage, _FinalStage {
    private String reportingType;

    private String reportingValue;

    private Builder() {
    }

    @Override
    public Builder from(ReportingId other) {
      reportingType(other.getReportingType());
      reportingValue(other.getReportingValue());
      return this;
    }

    /**
     * <p>The type of reporting ID. For DIAN, this is the sectional address code (<em>Codigo Dirrecion Seccional</em>)</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("reporting_type")
    public ReportingValueStage reportingType(String reportingType) {
      this.reportingType = reportingType;
      return this;
    }

    /**
     * <p>The value of the reporting ID.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("reporting_value")
    public _FinalStage reportingValue(String reportingValue) {
      this.reportingValue = reportingValue;
      return this;
    }

    @Override
    public ReportingId build() {
      return new ReportingId(reportingType, reportingValue);
    }
  }
}
