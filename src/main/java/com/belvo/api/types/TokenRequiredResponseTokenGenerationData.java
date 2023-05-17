package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = TokenRequiredResponseTokenGenerationData.Builder.class
)
public final class TokenRequiredResponseTokenGenerationData {
  private final Optional<String> instructions;

  private final Optional<String> type;

  private final Optional<String> value;

  private final Optional<Boolean> expectsUserInput;

  private int _cachedHashCode;

  TokenRequiredResponseTokenGenerationData(Optional<String> instructions, Optional<String> type,
      Optional<String> value, Optional<Boolean> expectsUserInput) {
    this.instructions = instructions;
    this.type = type;
    this.value = value;
    this.expectsUserInput = expectsUserInput;
  }

  /**
   * @return Instructions for token generation.
   */
  @JsonProperty("instructions")
  public Optional<String> getInstructions() {
    return instructions;
  }

  /**
   * @return Type of the data to generate the token (QR code, numeric challenge).
   */
  @JsonProperty("type")
  public Optional<String> getType() {
    return type;
  }

  /**
   * @return Value to use to generate the token.
   */
  @JsonProperty("value")
  public Optional<String> getValue() {
    return value;
  }

  /**
   * @return Indicates whether the user needs to provide input in order to complete the authentication.
   * When set to <code>false</code>, your user may need to:
   * <ul>
   * <li>confirm the login on another device - scan a QR code
   * You will still need to make a PATCH call to complete the request.</li>
   * </ul>
   */
  @JsonProperty("expects_user_input")
  public Optional<Boolean> getExpectsUserInput() {
    return expectsUserInput;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof TokenRequiredResponseTokenGenerationData && equalTo((TokenRequiredResponseTokenGenerationData) other);
  }

  private boolean equalTo(TokenRequiredResponseTokenGenerationData other) {
    return instructions.equals(other.instructions) && type.equals(other.type) && value.equals(other.value) && expectsUserInput.equals(other.expectsUserInput);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.instructions, this.type, this.value, this.expectsUserInput);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "TokenRequiredResponseTokenGenerationData{" + "instructions: " + instructions + ", type: " + type + ", value: " + value + ", expectsUserInput: " + expectsUserInput + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> instructions = Optional.empty();

    private Optional<String> type = Optional.empty();

    private Optional<String> value = Optional.empty();

    private Optional<Boolean> expectsUserInput = Optional.empty();

    private Builder() {
    }

    public Builder from(TokenRequiredResponseTokenGenerationData other) {
      instructions(other.getInstructions());
      type(other.getType());
      value(other.getValue());
      expectsUserInput(other.getExpectsUserInput());
      return this;
    }

    @JsonSetter(
        value = "instructions",
        nulls = Nulls.SKIP
    )
    public Builder instructions(Optional<String> instructions) {
      this.instructions = instructions;
      return this;
    }

    public Builder instructions(String instructions) {
      this.instructions = Optional.of(instructions);
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
        value = "value",
        nulls = Nulls.SKIP
    )
    public Builder value(Optional<String> value) {
      this.value = value;
      return this;
    }

    public Builder value(String value) {
      this.value = Optional.of(value);
      return this;
    }

    @JsonSetter(
        value = "expects_user_input",
        nulls = Nulls.SKIP
    )
    public Builder expectsUserInput(Optional<Boolean> expectsUserInput) {
      this.expectsUserInput = expectsUserInput;
      return this;
    }

    public Builder expectsUserInput(Boolean expectsUserInput) {
      this.expectsUserInput = Optional.of(expectsUserInput);
      return this;
    }

    public TokenRequiredResponseTokenGenerationData build() {
      return new TokenRequiredResponseTokenGenerationData(instructions, type, value, expectsUserInput);
    }
  }
}
