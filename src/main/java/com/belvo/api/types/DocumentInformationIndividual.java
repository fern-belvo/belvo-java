package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = DocumentInformationIndividual.Builder.class
)
public final class DocumentInformationIndividual {
  private final String name;

  private final String type;

  private final String formNumber;

  private final Optional<Integer> year;

  private int _cachedHashCode;

  DocumentInformationIndividual(String name, String type, String formNumber,
      Optional<Integer> year) {
    this.name = name;
    this.type = type;
    this.formNumber = formNumber;
    this.year = year;
  }

  /**
   * @return The name of the tax document.
   */
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * @return The type of tax declaration form. For DIAN, this will be either <code>110</code> or <code>210</code>.
   */
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  /**
   * @return Institution-provided identifier for the tax declaration.
   */
  @JsonProperty("form_number")
  public String getFormNumber() {
    return formNumber;
  }

  /**
   * @return The year of this tax declaration.
   */
  @JsonProperty("year")
  public Optional<Integer> getYear() {
    return year;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof DocumentInformationIndividual && equalTo((DocumentInformationIndividual) other);
  }

  private boolean equalTo(DocumentInformationIndividual other) {
    return name.equals(other.name) && type.equals(other.type) && formNumber.equals(other.formNumber) && year.equals(other.year);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.name, this.type, this.formNumber, this.year);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "DocumentInformationIndividual{" + "name: " + name + ", type: " + type + ", formNumber: " + formNumber + ", year: " + year + "}";
  }

  public static NameStage builder() {
    return new Builder();
  }

  public interface NameStage {
    TypeStage name(String name);

    Builder from(DocumentInformationIndividual other);
  }

  public interface TypeStage {
    FormNumberStage type(String type);
  }

  public interface FormNumberStage {
    _FinalStage formNumber(String formNumber);
  }

  public interface _FinalStage {
    DocumentInformationIndividual build();

    _FinalStage year(Optional<Integer> year);

    _FinalStage year(Integer year);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements NameStage, TypeStage, FormNumberStage, _FinalStage {
    private String name;

    private String type;

    private String formNumber;

    private Optional<Integer> year = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(DocumentInformationIndividual other) {
      name(other.getName());
      type(other.getType());
      formNumber(other.getFormNumber());
      year(other.getYear());
      return this;
    }

    /**
     * <p>The name of the tax document.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("name")
    public TypeStage name(String name) {
      this.name = name;
      return this;
    }

    /**
     * <p>The type of tax declaration form. For DIAN, this will be either <code>110</code> or <code>210</code>.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("type")
    public FormNumberStage type(String type) {
      this.type = type;
      return this;
    }

    /**
     * <p>Institution-provided identifier for the tax declaration.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("form_number")
    public _FinalStage formNumber(String formNumber) {
      this.formNumber = formNumber;
      return this;
    }

    /**
     * <p>The year of this tax declaration.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage year(Integer year) {
      this.year = Optional.of(year);
      return this;
    }

    @Override
    @JsonSetter(
        value = "year",
        nulls = Nulls.SKIP
    )
    public _FinalStage year(Optional<Integer> year) {
      this.year = year;
      return this;
    }

    @Override
    public DocumentInformationIndividual build() {
      return new DocumentInformationIndividual(name, type, formNumber, year);
    }
  }
}
