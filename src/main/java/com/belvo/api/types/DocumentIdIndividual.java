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
    builder = DocumentIdIndividual.Builder.class
)
public final class DocumentIdIndividual {
  private final String documentType;

  private final String documentNumber;

  private int _cachedHashCode;

  DocumentIdIndividual(String documentType, String documentNumber) {
    this.documentType = documentType;
    this.documentNumber = documentNumber;
  }

  /**
   * @return The type of ID document.
   */
  @JsonProperty("document_type")
  public String getDocumentType() {
    return documentType;
  }

  /**
   * @return The number of the ID document.
   */
  @JsonProperty("document_number")
  public String getDocumentNumber() {
    return documentNumber;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof DocumentIdIndividual && equalTo((DocumentIdIndividual) other);
  }

  private boolean equalTo(DocumentIdIndividual other) {
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
    return "DocumentIdIndividual{" + "documentType: " + documentType + ", documentNumber: " + documentNumber + "}";
  }

  public static DocumentTypeStage builder() {
    return new Builder();
  }

  public interface DocumentTypeStage {
    DocumentNumberStage documentType(String documentType);

    Builder from(DocumentIdIndividual other);
  }

  public interface DocumentNumberStage {
    _FinalStage documentNumber(String documentNumber);
  }

  public interface _FinalStage {
    DocumentIdIndividual build();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements DocumentTypeStage, DocumentNumberStage, _FinalStage {
    private String documentType;

    private String documentNumber;

    private Builder() {
    }

    @Override
    public Builder from(DocumentIdIndividual other) {
      documentType(other.getDocumentType());
      documentNumber(other.getDocumentNumber());
      return this;
    }

    /**
     * <p>The type of ID document.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("document_type")
    public DocumentNumberStage documentType(String documentType) {
      this.documentType = documentType;
      return this;
    }

    /**
     * <p>The number of the ID document.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("document_number")
    public _FinalStage documentNumber(String documentNumber) {
      this.documentNumber = documentNumber;
      return this;
    }

    @Override
    public DocumentIdIndividual build() {
      return new DocumentIdIndividual(documentType, documentNumber);
    }
  }
}
