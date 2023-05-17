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
    builder = InstitutionsFormField.Builder.class
)
public final class InstitutionsFormField {
  private final Optional<String> name;

  private final Optional<String> type;

  private final Optional<String> label;

  private final Optional<String> validation;

  private final Optional<String> placeholder;

  private final Optional<String> validationMessage;

  private final Optional<List<InstitutionsFormFieldValues>> values;

  private int _cachedHashCode;

  InstitutionsFormField(Optional<String> name, Optional<String> type, Optional<String> label,
      Optional<String> validation, Optional<String> placeholder, Optional<String> validationMessage,
      Optional<List<InstitutionsFormFieldValues>> values) {
    this.name = name;
    this.type = type;
    this.label = label;
    this.validation = validation;
    this.placeholder = placeholder;
    this.validationMessage = validationMessage;
    this.values = values;
  }

  /**
   * @return The username, password, or username type field.
   */
  @JsonProperty("name")
  public Optional<String> getName() {
    return name;
  }

  /**
   * @return The input type for the form field. For example, string.
   */
  @JsonProperty("type")
  public Optional<String> getType() {
    return type;
  }

  /**
   * @return The label of the form field. For example:
   * <ul>
   * <li>Client number</li>
   * <li>Key Bancanet</li>
   * <li>Document</li>
   * </ul>
   */
  @JsonProperty("label")
  public Optional<String> getLabel() {
    return label;
  }

  /**
   * @return The type of input validation used for the field.
   */
  @JsonProperty("validation")
  public Optional<String> getValidation() {
    return validation;
  }

  /**
   * @return The placeholder text in the form field.
   */
  @JsonProperty("placeholder")
  public Optional<String> getPlaceholder() {
    return placeholder;
  }

  /**
   * @return The message displayed when an invalid input is provided in the form field.
   */
  @JsonProperty("validation_message")
  public Optional<String> getValidationMessage() {
    return validationMessage;
  }

  /**
   * @return If the form field is for documents, the institution may require additional input regarding the document type.
   */
  @JsonProperty("values")
  public Optional<List<InstitutionsFormFieldValues>> getValues() {
    return values;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof InstitutionsFormField && equalTo((InstitutionsFormField) other);
  }

  private boolean equalTo(InstitutionsFormField other) {
    return name.equals(other.name) && type.equals(other.type) && label.equals(other.label) && validation.equals(other.validation) && placeholder.equals(other.placeholder) && validationMessage.equals(other.validationMessage) && values.equals(other.values);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.name, this.type, this.label, this.validation, this.placeholder, this.validationMessage, this.values);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "InstitutionsFormField{" + "name: " + name + ", type: " + type + ", label: " + label + ", validation: " + validation + ", placeholder: " + placeholder + ", validationMessage: " + validationMessage + ", values: " + values + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> name = Optional.empty();

    private Optional<String> type = Optional.empty();

    private Optional<String> label = Optional.empty();

    private Optional<String> validation = Optional.empty();

    private Optional<String> placeholder = Optional.empty();

    private Optional<String> validationMessage = Optional.empty();

    private Optional<List<InstitutionsFormFieldValues>> values = Optional.empty();

    private Builder() {
    }

    public Builder from(InstitutionsFormField other) {
      name(other.getName());
      type(other.getType());
      label(other.getLabel());
      validation(other.getValidation());
      placeholder(other.getPlaceholder());
      validationMessage(other.getValidationMessage());
      values(other.getValues());
      return this;
    }

    @JsonSetter(
        value = "name",
        nulls = Nulls.SKIP
    )
    public Builder name(Optional<String> name) {
      this.name = name;
      return this;
    }

    public Builder name(String name) {
      this.name = Optional.of(name);
      return this;
    }

    @JsonSetter(
        value = "type",
        nulls = Nulls.SKIP
    )
    public Builder type(Optional<String> type) {
      this.type = type;
      return this;
    }

    public Builder type(String type) {
      this.type = Optional.of(type);
      return this;
    }

    @JsonSetter(
        value = "label",
        nulls = Nulls.SKIP
    )
    public Builder label(Optional<String> label) {
      this.label = label;
      return this;
    }

    public Builder label(String label) {
      this.label = Optional.of(label);
      return this;
    }

    @JsonSetter(
        value = "validation",
        nulls = Nulls.SKIP
    )
    public Builder validation(Optional<String> validation) {
      this.validation = validation;
      return this;
    }

    public Builder validation(String validation) {
      this.validation = Optional.of(validation);
      return this;
    }

    @JsonSetter(
        value = "placeholder",
        nulls = Nulls.SKIP
    )
    public Builder placeholder(Optional<String> placeholder) {
      this.placeholder = placeholder;
      return this;
    }

    public Builder placeholder(String placeholder) {
      this.placeholder = Optional.of(placeholder);
      return this;
    }

    @JsonSetter(
        value = "validation_message",
        nulls = Nulls.SKIP
    )
    public Builder validationMessage(Optional<String> validationMessage) {
      this.validationMessage = validationMessage;
      return this;
    }

    public Builder validationMessage(String validationMessage) {
      this.validationMessage = Optional.of(validationMessage);
      return this;
    }

    @JsonSetter(
        value = "values",
        nulls = Nulls.SKIP
    )
    public Builder values(Optional<List<InstitutionsFormFieldValues>> values) {
      this.values = values;
      return this;
    }

    public Builder values(List<InstitutionsFormFieldValues> values) {
      this.values = Optional.of(values);
      return this;
    }

    public InstitutionsFormField build() {
      return new InstitutionsFormField(name, type, label, validation, placeholder, validationMessage, values);
    }
  }
}
