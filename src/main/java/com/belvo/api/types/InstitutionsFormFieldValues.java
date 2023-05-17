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
    builder = InstitutionsFormFieldValues.Builder.class
)
public final class InstitutionsFormFieldValues {
  private final Optional<String> code;

  private final Optional<String> label;

  private final Optional<String> validation;

  private final Optional<String> validationMessage;

  private final Optional<String> placeholder;

  private int _cachedHashCode;

  InstitutionsFormFieldValues(Optional<String> code, Optional<String> label,
      Optional<String> validation, Optional<String> validationMessage,
      Optional<String> placeholder) {
    this.code = code;
    this.label = label;
    this.validation = validation;
    this.validationMessage = validationMessage;
    this.placeholder = placeholder;
  }

  /**
   * @return The code of the document.
   */
  @JsonProperty("code")
  public Optional<String> getCode() {
    return code;
  }

  /**
   * @return The label for the field. For example:
   * <ul>
   * <li>Cédula de Ciudadanía</li>
   * <li>Cédula de Extranjería</li>
   * <li>Pasaporte</li>
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
   * @return The message displayed when an invalid input is provided in the form field.
   */
  @JsonProperty("validation_message")
  public Optional<String> getValidationMessage() {
    return validationMessage;
  }

  /**
   * @return The placeholder text in the form field.
   */
  @JsonProperty("placeholder")
  public Optional<String> getPlaceholder() {
    return placeholder;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof InstitutionsFormFieldValues && equalTo((InstitutionsFormFieldValues) other);
  }

  private boolean equalTo(InstitutionsFormFieldValues other) {
    return code.equals(other.code) && label.equals(other.label) && validation.equals(other.validation) && validationMessage.equals(other.validationMessage) && placeholder.equals(other.placeholder);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.code, this.label, this.validation, this.validationMessage, this.placeholder);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "InstitutionsFormFieldValues{" + "code: " + code + ", label: " + label + ", validation: " + validation + ", validationMessage: " + validationMessage + ", placeholder: " + placeholder + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> code = Optional.empty();

    private Optional<String> label = Optional.empty();

    private Optional<String> validation = Optional.empty();

    private Optional<String> validationMessage = Optional.empty();

    private Optional<String> placeholder = Optional.empty();

    private Builder() {
    }

    public Builder from(InstitutionsFormFieldValues other) {
      code(other.getCode());
      label(other.getLabel());
      validation(other.getValidation());
      validationMessage(other.getValidationMessage());
      placeholder(other.getPlaceholder());
      return this;
    }

    @JsonSetter(
        value = "code",
        nulls = Nulls.SKIP
    )
    public Builder code(Optional<String> code) {
      this.code = code;
      return this;
    }

    public Builder code(String code) {
      this.code = Optional.of(code);
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

    public InstitutionsFormFieldValues build() {
      return new InstitutionsFormFieldValues(code, label, validation, validationMessage, placeholder);
    }
  }
}
