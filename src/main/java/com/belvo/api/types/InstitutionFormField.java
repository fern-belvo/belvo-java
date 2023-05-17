package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = InstitutionFormField.Builder.class
)
public final class InstitutionFormField {
  private final Optional<String> name;

  private final Optional<String> type;

  private final Optional<String> label;

  private final Optional<String> validation;

  private final Optional<String> placeholder;

  private final Optional<String> validationMessage;

  private final Optional<List<InstitutionsFormFieldValues>> values;

  private final Optional<Integer> length;

  private final Optional<Boolean> optional;

  private int _cachedHashCode;

  InstitutionFormField(Optional<String> name, Optional<String> type, Optional<String> label,
      Optional<String> validation, Optional<String> placeholder, Optional<String> validationMessage,
      Optional<List<InstitutionsFormFieldValues>> values, Optional<Integer> length,
      Optional<Boolean> optional) {
    this.name = name;
    this.type = type;
    this.label = label;
    this.validation = validation;
    this.placeholder = placeholder;
    this.validationMessage = validationMessage;
    this.values = values;
    this.length = length;
    this.optional = optional;
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
   * <li>Document</li>
   * <li>Clave</li>
   * <li>Token</li>
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
   * @return Array of additional form field values.
   */
  @JsonProperty("values")
  public Optional<List<InstitutionsFormFieldValues>> getValues() {
    return values;
  }

  /**
   * @return Number of digits allowed when the type is <code>token</code>.
   */
  @JsonProperty("length")
  public Optional<Integer> getLength() {
    return length;
  }

  /**
   * @return It indicates whether this form field is optional.
   */
  @JsonProperty("optional")
  public Optional<Boolean> getOptional() {
    return optional;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof InstitutionFormField && equalTo((InstitutionFormField) other);
  }

  private boolean equalTo(InstitutionFormField other) {
    return name.equals(other.name) && type.equals(other.type) && label.equals(other.label) && validation.equals(other.validation) && placeholder.equals(other.placeholder) && validationMessage.equals(other.validationMessage) && values.equals(other.values) && length.equals(other.length) && optional.equals(other.optional);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.name, this.type, this.label, this.validation, this.placeholder, this.validationMessage, this.values, this.length, this.optional);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "InstitutionFormField{" + "name: " + name + ", type: " + type + ", label: " + label + ", validation: " + validation + ", placeholder: " + placeholder + ", validationMessage: " + validationMessage + ", values: " + values + ", length: " + length + ", optional: " + optional + "}";
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

    private Optional<Integer> length = Optional.empty();

    private Optional<Boolean> optional = Optional.empty();

    private Builder() {
    }

    public Builder from(InstitutionFormField other) {
      name(other.getName());
      type(other.getType());
      label(other.getLabel());
      validation(other.getValidation());
      placeholder(other.getPlaceholder());
      validationMessage(other.getValidationMessage());
      values(other.getValues());
      length(other.getLength());
      optional(other.getOptional());
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

    @JsonSetter(
        value = "length",
        nulls = Nulls.SKIP
    )
    public Builder length(Optional<Integer> length) {
      this.length = length;
      return this;
    }

    public Builder length(Integer length) {
      this.length = Optional.of(length);
      return this;
    }

    @JsonSetter(
        value = "optional",
        nulls = Nulls.SKIP
    )
    public Builder optional(Optional<Boolean> optional) {
      this.optional = optional;
      return this;
    }

    public Builder optional(Boolean optional) {
      this.optional = Optional.of(optional);
      return this;
    }

    public InstitutionFormField build() {
      return new InstitutionFormField(name, type, label, validation, placeholder, validationMessage, values, length, optional);
    }
  }
}
