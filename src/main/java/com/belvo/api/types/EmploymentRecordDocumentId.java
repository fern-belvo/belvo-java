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
    builder = EmploymentRecordDocumentId.Builder.class
)
public final class EmploymentRecordDocumentId {
  private final Optional<EnumEmploymentRecordDocumentType> documentType;

  private final Optional<String> documentNumber;

  private int _cachedHashCode;

  EmploymentRecordDocumentId(Optional<EnumEmploymentRecordDocumentType> documentType,
      Optional<String> documentNumber) {
    this.documentType = documentType;
    this.documentNumber = documentNumber;
  }

  @JsonProperty("document_type")
  public Optional<EnumEmploymentRecordDocumentType> getDocumentType() {
    return documentType;
  }

  /**
   * @return The ID document's number (as a string).
   */
  @JsonProperty("document_number")
  public Optional<String> getDocumentNumber() {
    return documentNumber;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof EmploymentRecordDocumentId && equalTo((EmploymentRecordDocumentId) other);
  }

  private boolean equalTo(EmploymentRecordDocumentId other) {
    return documentType.equals(other.documentType) && documentNumber.equals(other.documentNumber);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.documentType, this.documentNumber);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "EmploymentRecordDocumentId{" + "documentType: " + documentType + ", documentNumber: " + documentNumber + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<EnumEmploymentRecordDocumentType> documentType = Optional.empty();

    private Optional<String> documentNumber = Optional.empty();

    private Builder() {
    }

    public Builder from(EmploymentRecordDocumentId other) {
      documentType(other.getDocumentType());
      documentNumber(other.getDocumentNumber());
      return this;
    }

    @JsonSetter(
        value = "document_type",
        nulls = Nulls.SKIP
    )
    public Builder documentType(Optional<EnumEmploymentRecordDocumentType> documentType) {
      this.documentType = documentType;
      return this;
    }

    public Builder documentType(EnumEmploymentRecordDocumentType documentType) {
      this.documentType = Optional.of(documentType);
      return this;
    }

    @JsonSetter(
        value = "document_number",
        nulls = Nulls.SKIP
    )
    public Builder documentNumber(Optional<String> documentNumber) {
      this.documentNumber = documentNumber;
      return this;
    }

    public Builder documentNumber(String documentNumber) {
      this.documentNumber = Optional.of(documentNumber);
      return this;
    }

    public EmploymentRecordDocumentId build() {
      return new EmploymentRecordDocumentId(documentType, documentNumber);
    }
  }
}
