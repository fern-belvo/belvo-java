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
    builder = TokenRequiredResponse.Builder.class
)
public final class TokenRequiredResponse {
  private final Optional<String> code;

  private final Optional<String> message;

  private final Optional<String> requestId;

  private final Optional<String> session;

  private final Optional<Integer> expiry;

  private final Optional<String> link;

  private final Optional<TokenRequiredResponseTokenGenerationData> tokenGenerationData;

  private int _cachedHashCode;

  TokenRequiredResponse(Optional<String> code, Optional<String> message, Optional<String> requestId,
      Optional<String> session, Optional<Integer> expiry, Optional<String> link,
      Optional<TokenRequiredResponseTokenGenerationData> tokenGenerationData) {
    this.code = code;
    this.message = message;
    this.requestId = requestId;
    this.session = session;
    this.expiry = expiry;
    this.link = link;
    this.tokenGenerationData = tokenGenerationData;
  }

  /**
   * @return A unique error code (<code>token_required</code>) that allows you to classify and handle the error programmatically.
   * <p>ℹ️ Check our DevPortal for more information on how to handle &lt;a href=&quot;https://developers.belvo.com/docs/belvo-api-errors#428-token_required&quot; target=&quot;_blank&quot;&gt;428 token_required errors&lt;/a&gt;.</p>
   */
  @JsonProperty("code")
  public Optional<String> getCode() {
    return code;
  }

  /**
   * @return A short description of the error.
   * <p>For <code>token_required</code> errors, the description is:</p>
   * <ul>
   * <li><code>A MFA token is required by the institution to login</code>.</li>
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
   * @return A 32-character unique ID of the login session (matching a regex pattern of: <code>[a-f0-9]{32}</code>).
   */
  @JsonProperty("session")
  public Optional<String> getSession() {
    return session;
  }

  /**
   * @return Session duration time in seconds.
   */
  @JsonProperty("expiry")
  public Optional<Integer> getExpiry() {
    return expiry;
  }

  /**
   * @return Unique identifier created by Belvo, used to reference the current Link.
   */
  @JsonProperty("link")
  public Optional<String> getLink() {
    return link;
  }

  @JsonProperty("token_generation_data")
  public Optional<TokenRequiredResponseTokenGenerationData> getTokenGenerationData() {
    return tokenGenerationData;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof TokenRequiredResponse && equalTo((TokenRequiredResponse) other);
  }

  private boolean equalTo(TokenRequiredResponse other) {
    return code.equals(other.code) && message.equals(other.message) && requestId.equals(other.requestId) && session.equals(other.session) && expiry.equals(other.expiry) && link.equals(other.link) && tokenGenerationData.equals(other.tokenGenerationData);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.code, this.message, this.requestId, this.session, this.expiry, this.link, this.tokenGenerationData);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "TokenRequiredResponse{" + "code: " + code + ", message: " + message + ", requestId: " + requestId + ", session: " + session + ", expiry: " + expiry + ", link: " + link + ", tokenGenerationData: " + tokenGenerationData + "}";
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

    private Optional<String> session = Optional.empty();

    private Optional<Integer> expiry = Optional.empty();

    private Optional<String> link = Optional.empty();

    private Optional<TokenRequiredResponseTokenGenerationData> tokenGenerationData = Optional.empty();

    private Builder() {
    }

    public Builder from(TokenRequiredResponse other) {
      code(other.getCode());
      message(other.getMessage());
      requestId(other.getRequestId());
      session(other.getSession());
      expiry(other.getExpiry());
      link(other.getLink());
      tokenGenerationData(other.getTokenGenerationData());
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
        value = "session",
        nulls = Nulls.SKIP
    )
    public Builder session(Optional<String> session) {
      this.session = session;
      return this;
    }

    public Builder session(String session) {
      this.session = Optional.of(session);
      return this;
    }

    @JsonSetter(
        value = "expiry",
        nulls = Nulls.SKIP
    )
    public Builder expiry(Optional<Integer> expiry) {
      this.expiry = expiry;
      return this;
    }

    public Builder expiry(Integer expiry) {
      this.expiry = Optional.of(expiry);
      return this;
    }

    @JsonSetter(
        value = "link",
        nulls = Nulls.SKIP
    )
    public Builder link(Optional<String> link) {
      this.link = link;
      return this;
    }

    public Builder link(String link) {
      this.link = Optional.of(link);
      return this;
    }

    @JsonSetter(
        value = "token_generation_data",
        nulls = Nulls.SKIP
    )
    public Builder tokenGenerationData(
        Optional<TokenRequiredResponseTokenGenerationData> tokenGenerationData) {
      this.tokenGenerationData = tokenGenerationData;
      return this;
    }

    public Builder tokenGenerationData(
        TokenRequiredResponseTokenGenerationData tokenGenerationData) {
      this.tokenGenerationData = Optional.of(tokenGenerationData);
      return this;
    }

    public TokenRequiredResponse build() {
      return new TokenRequiredResponse(code, message, requestId, session, expiry, link, tokenGenerationData);
    }
  }
}
