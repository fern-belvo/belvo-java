package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = EmploymentRecord.Builder.class
)
public final class EmploymentRecord {
  private final Optional<String> id;

  private final Optional<String> link;

  private final Optional<String> createdAt;

  private final Optional<String> collectedAt;

  private final Optional<String> reportDate;

  private final Optional<String> internalIdentification;

  private final Optional<EmploymentRecordPersonalData> personalData;

  private final Optional<EmploymentRecordSocialSecuritySummary> socialSecuritySummary;

  private final Optional<List<EmploymentRecordDetail>> employmentRecords;

  private final Optional<List<EmploymentRecordFile>> files;

  private int _cachedHashCode;

  EmploymentRecord(Optional<String> id, Optional<String> link, Optional<String> createdAt,
      Optional<String> collectedAt, Optional<String> reportDate,
      Optional<String> internalIdentification, Optional<EmploymentRecordPersonalData> personalData,
      Optional<EmploymentRecordSocialSecuritySummary> socialSecuritySummary,
      Optional<List<EmploymentRecordDetail>> employmentRecords,
      Optional<List<EmploymentRecordFile>> files) {
    this.id = id;
    this.link = link;
    this.createdAt = createdAt;
    this.collectedAt = collectedAt;
    this.reportDate = reportDate;
    this.internalIdentification = internalIdentification;
    this.personalData = personalData;
    this.socialSecuritySummary = socialSecuritySummary;
    this.employmentRecords = employmentRecords;
    this.files = files;
  }

  /**
   * @return The unique identifier created by Belvo for the current IMSS statement.
   */
  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
  }

  /**
   * @return The unique identifier created by Belvo for the current user.
   */
  @JsonProperty("link")
  public Optional<String> getLink() {
    return link;
  }

  /**
   * @return The ISO-8601 timestamp of when the data point was initially created in Belvo's database.
   */
  @JsonProperty("created_at")
  public Optional<String> getCreatedAt() {
    return createdAt;
  }

  /**
   * @return The ISO-8601 timestamp when the data point was collected.
   */
  @JsonProperty("collected_at")
  public Optional<String> getCollectedAt() {
    return collectedAt;
  }

  /**
   * @return The date when the employment record report was generated, in <code>YYYY-MM-DD</code> format.
   */
  @JsonProperty("report_date")
  public Optional<String> getReportDate() {
    return reportDate;
  }

  /**
   * @return Unique ID for user according to the institution. For IMSS Mexico, this is the CURP.
   */
  @JsonProperty("internal_identification")
  public Optional<String> getInternalIdentification() {
    return internalIdentification;
  }

  @JsonProperty("personal_data")
  public Optional<EmploymentRecordPersonalData> getPersonalData() {
    return personalData;
  }

  @JsonProperty("social_security_summary")
  public Optional<EmploymentRecordSocialSecuritySummary> getSocialSecuritySummary() {
    return socialSecuritySummary;
  }

  /**
   * @return Details regarding the individual's employment history.
   */
  @JsonProperty("employment_records")
  public Optional<List<EmploymentRecordDetail>> getEmploymentRecords() {
    return employmentRecords;
  }

  /**
   * @return Additional PDF binary files relating to the individual's employment.
   */
  @JsonProperty("files")
  public Optional<List<EmploymentRecordFile>> getFiles() {
    return files;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof EmploymentRecord && equalTo((EmploymentRecord) other);
  }

  private boolean equalTo(EmploymentRecord other) {
    return id.equals(other.id) && link.equals(other.link) && createdAt.equals(other.createdAt) && collectedAt.equals(other.collectedAt) && reportDate.equals(other.reportDate) && internalIdentification.equals(other.internalIdentification) && personalData.equals(other.personalData) && socialSecuritySummary.equals(other.socialSecuritySummary) && employmentRecords.equals(other.employmentRecords) && files.equals(other.files);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.id, this.link, this.createdAt, this.collectedAt, this.reportDate, this.internalIdentification, this.personalData, this.socialSecuritySummary, this.employmentRecords, this.files);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "EmploymentRecord{" + "id: " + id + ", link: " + link + ", createdAt: " + createdAt + ", collectedAt: " + collectedAt + ", reportDate: " + reportDate + ", internalIdentification: " + internalIdentification + ", personalData: " + personalData + ", socialSecuritySummary: " + socialSecuritySummary + ", employmentRecords: " + employmentRecords + ", files: " + files + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> id = Optional.empty();

    private Optional<String> link = Optional.empty();

    private Optional<String> createdAt = Optional.empty();

    private Optional<String> collectedAt = Optional.empty();

    private Optional<String> reportDate = Optional.empty();

    private Optional<String> internalIdentification = Optional.empty();

    private Optional<EmploymentRecordPersonalData> personalData = Optional.empty();

    private Optional<EmploymentRecordSocialSecuritySummary> socialSecuritySummary = Optional.empty();

    private Optional<List<EmploymentRecordDetail>> employmentRecords = Optional.empty();

    private Optional<List<EmploymentRecordFile>> files = Optional.empty();

    private Builder() {
    }

    public Builder from(EmploymentRecord other) {
      id(other.getId());
      link(other.getLink());
      createdAt(other.getCreatedAt());
      collectedAt(other.getCollectedAt());
      reportDate(other.getReportDate());
      internalIdentification(other.getInternalIdentification());
      personalData(other.getPersonalData());
      socialSecuritySummary(other.getSocialSecuritySummary());
      employmentRecords(other.getEmploymentRecords());
      files(other.getFiles());
      return this;
    }

    @JsonSetter(
        value = "id",
        nulls = Nulls.SKIP
    )
    public Builder id(Optional<String> id) {
      this.id = id;
      return this;
    }

    public Builder id(String id) {
      this.id = Optional.of(id);
      return this;
    }

    @JsonSetter(
        value = "link",
        nulls = Nulls.SKIP
    )
    public Builder link(Optional<String> link) {
      this.link = link;
      return this;
    }

    public Builder link(String link) {
      this.link = Optional.of(link);
      return this;
    }

    @JsonSetter(
        value = "created_at",
        nulls = Nulls.SKIP
    )
    public Builder createdAt(Optional<String> createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    public Builder createdAt(String createdAt) {
      this.createdAt = Optional.of(createdAt);
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
        value = "report_date",
        nulls = Nulls.SKIP
    )
    public Builder reportDate(Optional<String> reportDate) {
      this.reportDate = reportDate;
      return this;
    }

    public Builder reportDate(String reportDate) {
      this.reportDate = Optional.of(reportDate);
      return this;
    }

    @JsonSetter(
        value = "internal_identification",
        nulls = Nulls.SKIP
    )
    public Builder internalIdentification(Optional<String> internalIdentification) {
      this.internalIdentification = internalIdentification;
      return this;
    }

    public Builder internalIdentification(String internalIdentification) {
      this.internalIdentification = Optional.of(internalIdentification);
      return this;
    }

    @JsonSetter(
        value = "personal_data",
        nulls = Nulls.SKIP
    )
    public Builder personalData(Optional<EmploymentRecordPersonalData> personalData) {
      this.personalData = personalData;
      return this;
    }

    public Builder personalData(EmploymentRecordPersonalData personalData) {
      this.personalData = Optional.of(personalData);
      return this;
    }

    @JsonSetter(
        value = "social_security_summary",
        nulls = Nulls.SKIP
    )
    public Builder socialSecuritySummary(
        Optional<EmploymentRecordSocialSecuritySummary> socialSecuritySummary) {
      this.socialSecuritySummary = socialSecuritySummary;
      return this;
    }

    public Builder socialSecuritySummary(
        EmploymentRecordSocialSecuritySummary socialSecuritySummary) {
      this.socialSecuritySummary = Optional.of(socialSecuritySummary);
      return this;
    }

    @JsonSetter(
        value = "employment_records",
        nulls = Nulls.SKIP
    )
    public Builder employmentRecords(Optional<List<EmploymentRecordDetail>> employmentRecords) {
      this.employmentRecords = employmentRecords;
      return this;
    }

    public Builder employmentRecords(List<EmploymentRecordDetail> employmentRecords) {
      this.employmentRecords = Optional.of(employmentRecords);
      return this;
    }

    @JsonSetter(
        value = "files",
        nulls = Nulls.SKIP
    )
    public Builder files(Optional<List<EmploymentRecordFile>> files) {
      this.files = files;
      return this;
    }

    public Builder files(List<EmploymentRecordFile> files) {
      this.files = Optional.of(files);
      return this;
    }

    public EmploymentRecord build() {
      return new EmploymentRecord(id, link, createdAt, collectedAt, reportDate, internalIdentification, personalData, socialSecuritySummary, employmentRecords, files);
    }
  }
}
