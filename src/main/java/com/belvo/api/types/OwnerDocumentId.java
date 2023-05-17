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
    builder = OwnerDocumentId.Builder.class
)
public final class OwnerDocumentId {
  private final Optional<String> documentType;

  private final Optional<String> documentNumber;

  private int _cachedHashCode;

  OwnerDocumentId(Optional<String> documentType, Optional<String> documentNumber) {
    this.documentType = documentType;
    this.documentNumber = documentNumber;
  }

  /**
   * @return The type of document the owner provided to the institution to open the account. Common document types are:
   * <p>🇧🇷 Brazil</p>
   * <ul>
   * <li><code>CPF</code> (<em>Cadastro de Pessoas Físicas</em>)</li>
   * <li><code>CNPJ</code>(<em>Cadastro Nacional de Pessoas Jurídicas</em>)</li>
   * </ul>
   * <p>🇨🇴 Colombia</p>
   * <ul>
   * <li><code>CC</code>(<em>Cédula de Ciudadanía</em>)</li>
   * <li><code>NIT</code> (<em>Número de Identificación Tributaria</em>)</li>
   * </ul>
   * <p>🇲🇽 Mexico</p>
   * <ul>
   * <li><code>CURP</code> (<em>Clave Única de Registro de Población</em>)</li>
   * <li><code>NISS</code> (<em>Número de Seguridad Social</em>)</li>
   * </ul>
   */
  @JsonProperty("document_type")
  public Optional<String> getDocumentType() {
    return documentType;
  }

  /**
   * @return The document's identification number.
   */
  @JsonProperty("document_number")
  public Optional<String> getDocumentNumber() {
    return documentNumber;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof OwnerDocumentId && equalTo((OwnerDocumentId) other);
  }

  private boolean equalTo(OwnerDocumentId other) {
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
    return "OwnerDocumentId{" + "documentType: " + documentType + ", documentNumber: " + documentNumber + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> documentType = Optional.empty();

    private Optional<String> documentNumber = Optional.empty();

    private Builder() {
    }

    public Builder from(OwnerDocumentId other) {
      documentType(other.getDocumentType());
      documentNumber(other.getDocumentNumber());
      return this;
    }

    @JsonSetter(
        value = "document_type",
        nulls = Nulls.SKIP
    )
    public Builder documentType(Optional<String> documentType) {
      this.documentType = documentType;
      return this;
    }

    public Builder documentType(String documentType) {
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

    public OwnerDocumentId build() {
      return new OwnerDocumentId(documentType, documentNumber);
    }
  }
}
