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
    builder = InvalidPeriodError.Builder.class
)
public final class InvalidPeriodError {
  private final Optional<String> code;

  private final Optional<String> message;

  private final Optional<String> requestId;

  private int _cachedHashCode;

  InvalidPeriodError(Optional<String> code, Optional<String> message, Optional<String> requestId) {
    this.code = code;
    this.message = message;
    this.requestId = requestId;
  }

  /**
   * @return A unique error code (<code>invalid_period</code>) that allows you to classify and handle the error programmatically.
   * <p>ℹ️ Check our DevPortal for more information on how to handle &lt;a href=&quot;https://developers.belvo.com/docs/belvo-api-errors#400-invalid_period&quot; target=&quot;_blank&quot;&gt;400 invalid_period errors&lt;/a&gt;.</p>
   */
  @JsonProperty("code")
  public Optional<String> getCode() {
    return code;
  }

  /**
   * @return A short description of the error.
   * <p>For <code>invalid_period</code> errors, the description is:</p>
   * <ul>
   * <li><code>The number of days between date_from and date_to must be at least 90 days</code>.</li>
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

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof InvalidPeriodError && equalTo((InvalidPeriodError) other);
  }

  private boolean equalTo(InvalidPeriodError other) {
    return code.equals(other.code) && message.equals(other.message) && requestId.equals(other.requestId);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.code, this.message, this.requestId);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "InvalidPeriodError{" + "code: " + code + ", message: " + message + ", requestId: " + requestId + "}";
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

    private Builder() {
    }

    public Builder from(InvalidPeriodError other) {
      code(other.getCode());
      message(other.getMessage());
      requestId(other.getRequestId());
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

    public InvalidPeriodError build() {
      return new InvalidPeriodError(code, message, requestId);
    }
  }
}
