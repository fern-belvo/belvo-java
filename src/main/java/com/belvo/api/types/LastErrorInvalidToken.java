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
    builder = LastErrorInvalidToken.Builder.class
)
public final class LastErrorInvalidToken {
  private final String errorCode;

  private final String errorMessage;

  private int _cachedHashCode;

  LastErrorInvalidToken(String errorCode, String errorMessage) {
    this.errorCode = errorCode;
    this.errorMessage = errorMessage;
  }

  /**
   * @return A unique error code (<code>invalid_token</code>) that allows you to classify and handle the error programmatically.
   */
  @JsonProperty("error_code")
  public String getErrorCode() {
    return errorCode;
  }

  /**
   * @return A short description of the error.
   */
  @JsonProperty("error_message")
  public String getErrorMessage() {
    return errorMessage;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof LastErrorInvalidToken && equalTo((LastErrorInvalidToken) other);
  }

  private boolean equalTo(LastErrorInvalidToken other) {
    return errorCode.equals(other.errorCode) && errorMessage.equals(other.errorMessage);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.errorCode, this.errorMessage);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "LastErrorInvalidToken{" + "errorCode: " + errorCode + ", errorMessage: " + errorMessage + "}";
  }

  public static ErrorCodeStage builder() {
    return new Builder();
  }

  public interface ErrorCodeStage {
    ErrorMessageStage errorCode(String errorCode);

    Builder from(LastErrorInvalidToken other);
  }

  public interface ErrorMessageStage {
    _FinalStage errorMessage(String errorMessage);
  }

  public interface _FinalStage {
    LastErrorInvalidToken build();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements ErrorCodeStage, ErrorMessageStage, _FinalStage {
    private String errorCode;

    private String errorMessage;

    private Builder() {
    }

    @Override
    public Builder from(LastErrorInvalidToken other) {
      errorCode(other.getErrorCode());
      errorMessage(other.getErrorMessage());
      return this;
    }

    /**
     * <p>A unique error code (<code>invalid_token</code>) that allows you to classify and handle the error programmatically.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("error_code")
    public ErrorMessageStage errorCode(String errorCode) {
      this.errorCode = errorCode;
      return this;
    }

    /**
     * <p>A short description of the error.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("error_message")
    public _FinalStage errorMessage(String errorMessage) {
      this.errorMessage = errorMessage;
      return this;
    }

    @Override
    public LastErrorInvalidToken build() {
      return new LastErrorInvalidToken(errorCode, errorMessage);
    }
  }
}
