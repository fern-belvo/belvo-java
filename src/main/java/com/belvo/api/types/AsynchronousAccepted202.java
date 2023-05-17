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
    builder = AsynchronousAccepted202.Builder.class
)
public final class AsynchronousAccepted202 {
  private final Optional<String> requestId;

  private int _cachedHashCode;

  AsynchronousAccepted202(Optional<String> requestId) {
    this.requestId = requestId;
  }

  /**
   * @return The unique ID for this request. We recommend you store this value to later identify which webhook event relates to an asynchronous request.
   */
  @JsonProperty("request_id")
  public Optional<String> getRequestId() {
    return requestId;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AsynchronousAccepted202 && equalTo((AsynchronousAccepted202) other);
  }

  private boolean equalTo(AsynchronousAccepted202 other) {
    return requestId.equals(other.requestId);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.requestId);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AsynchronousAccepted202{" + "requestId: " + requestId + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> requestId = Optional.empty();

    private Builder() {
    }

    public Builder from(AsynchronousAccepted202 other) {
      requestId(other.getRequestId());
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

    public AsynchronousAccepted202 build() {
      return new AsynchronousAccepted202(requestId);
    }
  }
}
