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
    builder = TaxComplianceStatus.Builder.class
)
public final class TaxComplianceStatus {
  private final Optional<String> id;

  private final Optional<String> collectedAt;

  private final Optional<String> createdAt;

  private final Optional<String> internalIdentification;

  private final Optional<String> pdf;

  private final Optional<String> rfc;

  private final Optional<EnumTaxComplianceStatusOutcome> outcome;

  private int _cachedHashCode;

  TaxComplianceStatus(Optional<String> id, Optional<String> collectedAt, Optional<String> createdAt,
      Optional<String> internalIdentification, Optional<String> pdf, Optional<String> rfc,
      Optional<EnumTaxComplianceStatusOutcome> outcome) {
    this.id = id;
    this.collectedAt = collectedAt;
    this.createdAt = createdAt;
    this.internalIdentification = internalIdentification;
    this.pdf = pdf;
    this.rfc = rfc;
    this.outcome = outcome;
  }

  /**
   * @return Unique identifier created by Belvo used to reference the current Tax Compliance Status.
   */
  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
  }

  /**
   * @return The ISO-8601 timestamp when the data point was collected.
   */
  @JsonProperty("collected_at")
  public Optional<String> getCollectedAt() {
    return collectedAt;
  }

  /**
   * @return The ISO-8601 timestamp of when the data point was last updated in Belvo's database.
   */
  @JsonProperty("created_at")
  public Optional<String> getCreatedAt() {
    return createdAt;
  }

  /**
   * @return The institution’s internal identification number for the document.
   */
  @JsonProperty("internal_identification")
  public Optional<String> getInternalIdentification() {
    return internalIdentification;
  }

  /**
   * @return Tax compliance status PDF as a binary.
   */
  @JsonProperty("pdf")
  public Optional<String> getPdf() {
    return pdf;
  }

  /**
   * @return The account holder's RFC (Registro Federal de Contribuyentes) number.
   */
  @JsonProperty("rfc")
  public Optional<String> getRfc() {
    return rfc;
  }

  @JsonProperty("outcome")
  public Optional<EnumTaxComplianceStatusOutcome> getOutcome() {
    return outcome;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof TaxComplianceStatus && equalTo((TaxComplianceStatus) other);
  }

  private boolean equalTo(TaxComplianceStatus other) {
    return id.equals(other.id) && collectedAt.equals(other.collectedAt) && createdAt.equals(other.createdAt) && internalIdentification.equals(other.internalIdentification) && pdf.equals(other.pdf) && rfc.equals(other.rfc) && outcome.equals(other.outcome);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.id, this.collectedAt, this.createdAt, this.internalIdentification, this.pdf, this.rfc, this.outcome);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "TaxComplianceStatus{" + "id: " + id + ", collectedAt: " + collectedAt + ", createdAt: " + createdAt + ", internalIdentification: " + internalIdentification + ", pdf: " + pdf + ", rfc: " + rfc + ", outcome: " + outcome + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> id = Optional.empty();

    private Optional<String> collectedAt = Optional.empty();

    private Optional<String> createdAt = Optional.empty();

    private Optional<String> internalIdentification = Optional.empty();

    private Optional<String> pdf = Optional.empty();

    private Optional<String> rfc = Optional.empty();

    private Optional<EnumTaxComplianceStatusOutcome> outcome = Optional.empty();

    private Builder() {
    }

    public Builder from(TaxComplianceStatus other) {
      id(other.getId());
      collectedAt(other.getCollectedAt());
      createdAt(other.getCreatedAt());
      internalIdentification(other.getInternalIdentification());
      pdf(other.getPdf());
      rfc(other.getRfc());
      outcome(other.getOutcome());
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
        value = "pdf",
        nulls = Nulls.SKIP
    )
    public Builder pdf(Optional<String> pdf) {
      this.pdf = pdf;
      return this;
    }

    public Builder pdf(String pdf) {
      this.pdf = Optional.of(pdf);
      return this;
    }

    @JsonSetter(
        value = "rfc",
        nulls = Nulls.SKIP
    )
    public Builder rfc(Optional<String> rfc) {
      this.rfc = rfc;
      return this;
    }

    public Builder rfc(String rfc) {
      this.rfc = Optional.of(rfc);
      return this;
    }

    @JsonSetter(
        value = "outcome",
        nulls = Nulls.SKIP
    )
    public Builder outcome(Optional<EnumTaxComplianceStatusOutcome> outcome) {
      this.outcome = outcome;
      return this;
    }

    public Builder outcome(EnumTaxComplianceStatusOutcome outcome) {
      this.outcome = Optional.of(outcome);
      return this;
    }

    public TaxComplianceStatus build() {
      return new TaxComplianceStatus(id, collectedAt, createdAt, internalIdentification, pdf, rfc, outcome);
    }
  }
}
