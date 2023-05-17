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
    builder = ValidationError.Builder.class
)
public final class ValidationError {
  private final Optional<String> code;

  private final Optional<String> message;

  private final Optional<String> requestId;

  private final Optional<String> field;

  private int _cachedHashCode;

  ValidationError(Optional<String> code, Optional<String> message, Optional<String> requestId,
      Optional<String> field) {
    this.code = code;
    this.message = message;
    this.requestId = requestId;
    this.field = field;
  }

  /**
   * @return A unique error code (<code>null</code>, <code>does_not_exist</code>, <code>required</code>) that allows you to classify and handle the error programmatically.
   * <p>ℹ️ Check our DevPortal for more information on how to handle:</p>
   * <ul>
   * <li>&lt;a href=&quot;https://developers.belvo.com/docs/belvo-api-errors#400-blank&quot; target=&quot;_blank&quot;&gt;400 blank errors&lt;/a&gt;</li>
   * <li>&lt;a href=&quot;https://developers.belvo.com/docs/belvo-api-errors#400-null&quot; target=&quot;_blank&quot;&gt;400 null errors&lt;/a&gt;</li>
   * <li>&lt;a href=&quot;https://developers.belvo.com/docs/belvo-api-errors#400-does_not_exist&quot; target=&quot;_blank&quot;&gt;400 does_not_exist errors&lt;/a&gt;</li>
   * <li>&lt;a href=&quot;https://developers.belvo.com/docs/belvo-api-errors#400-required&quot; target=&quot;_blank&quot;&gt;400 required errors&lt;/a&gt;</li>
   * </ul>
   */
  @JsonProperty("code")
  public Optional<String> getCode() {
    return code;
  }

  /**
   * @return A short description of the error.
   * <p>For <code>session_expired</code> errors, the description can be (among others):</p>
   * <ul>
   * <li><code>This field is required.</code></li>
   * <li><code>Object with name=narnia does not exist.</code></li>
   * <li><code>This field may not be null.</code></li>
   * <li><code>This field may not be blank.</code></li>
   * </ul>
   */
  @JsonProperty("message")
  public Optional<String> getMessage() {
    return message;
  }

  /**
   * @return A 32-character unique ID of the request (matching a regex pattern of: <code>[a-f0-9]{32}</code>). Provide this ID when contacting the Belvo support team to accelerate investigations.
   */
  @JsonProperty("request_id")
  public Optional<String> getRequestId() {
    return requestId;
  }

  /**
   * @return Name of the field where the error was encountered.
   */
  @JsonProperty("field")
  public Optional<String> getField() {
    return field;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof ValidationError && equalTo((ValidationError) other);
  }

  private boolean equalTo(ValidationError other) {
    return code.equals(other.code) && message.equals(other.message) && requestId.equals(other.requestId) && field.equals(other.field);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.code, this.message, this.requestId, this.field);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "ValidationError{" + "code: " + code + ", message: " + message + ", requestId: " + requestId + ", field: " + field + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> code = Optional.empty();

    private Optional<String> message = Optional.empty();

    private Optional<String> requestId = Optional.empty();

    private Optional<String> field = Optional.empty();

    private Builder() {
    }

    public Builder from(ValidationError other) {
      code(other.getCode());
      message(other.getMessage());
      requestId(other.getRequestId());
      field(other.getField());
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
        value = "message",
        nulls = Nulls.SKIP
    )
    public Builder message(Optional<String> message) {
      this.message = message;
      return this;
    }

    public Builder message(String message) {
      this.message = Optional.of(message);
      return this;
    }

    @JsonSetter(
        value = "request_id",
        nulls = Nulls.SKIP
    )
    public Builder requestId(Optional<String> requestId) {
      this.requestId = requestId;
      return this;
    }

    public Builder requestId(String requestId) {
      this.requestId = Optional.of(requestId);
      return this;
    }

    @JsonSetter(
        value = "field",
        nulls = Nulls.SKIP
    )
    public Builder field(Optional<String> field) {
      this.field = field;
      return this;
    }

    public Builder field(String field) {
      this.field = Optional.of(field);
      return this;
    }

    public ValidationError build() {
      return new ValidationError(code, message, requestId, field);
    }
  }
}
