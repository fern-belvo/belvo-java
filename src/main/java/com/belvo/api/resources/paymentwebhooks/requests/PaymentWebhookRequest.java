package com.belvo.api.resources.paymentwebhooks.requests;

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
    builder = PaymentWebhookRequest.Builder.class
)
public final class PaymentWebhookRequest {
  private final String name;

  private final String url;

  private final Optional<String> authHeader;

  private final Optional<String> authToken;

  private int _cachedHashCode;

  PaymentWebhookRequest(String name, String url, Optional<String> authHeader,
      Optional<String> authToken) {
    this.name = name;
    this.url = url;
    this.authHeader = authHeader;
    this.authToken = authToken;
  }

  /**
   * @return The name you want to provide to identify the webhook.
   */
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * @return The URL where webhook events should be sent to.
   */
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  /**
   * @return The authentication header for the request. <strong>Must</strong> be set to <code>Authorization</code>.
   */
  @JsonProperty("auth_header")
  public Optional<String> getAuthHeader() {
    return authHeader;
  }

  /**
   * @return The authentication token you need to send webhook events. Can be either:
   * <ul>
   * <li><code>Bearer</code> and a token (for Bearer authentication).</li>
   * <li><code>Basic</code> and a base64-encoded username:password string (for Basic authentication).</li>
   * </ul>
   */
  @JsonProperty("auth_token")
  public Optional<String> getAuthToken() {
    return authToken;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof PaymentWebhookRequest && equalTo((PaymentWebhookRequest) other);
  }

  private boolean equalTo(PaymentWebhookRequest other) {
    return name.equals(other.name) && url.equals(other.url) && authHeader.equals(other.authHeader) && authToken.equals(other.authToken);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.name, this.url, this.authHeader, this.authToken);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "PaymentWebhookRequest{" + "name: " + name + ", url: " + url + ", authHeader: " + authHeader + ", authToken: " + authToken + "}";
  }

  public static NameStage builder() {
    return new Builder();
  }

  public interface NameStage {
    UrlStage name(String name);

    Builder from(PaymentWebhookRequest other);
  }

  public interface UrlStage {
    _FinalStage url(String url);
  }

  public interface _FinalStage {
    PaymentWebhookRequest build();

    _FinalStage authHeader(Optional<String> authHeader);

    _FinalStage authHeader(String authHeader);

    _FinalStage authToken(Optional<String> authToken);

    _FinalStage authToken(String authToken);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements NameStage, UrlStage, _FinalStage {
    private String name;

    private String url;

    private Optional<String> authToken = Optional.empty();

    private Optional<String> authHeader = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(PaymentWebhookRequest other) {
      name(other.getName());
      url(other.getUrl());
      authHeader(other.getAuthHeader());
      authToken(other.getAuthToken());
      return this;
    }

    /**
     * <p>The name you want to provide to identify the webhook.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("name")
    public UrlStage name(String name) {
      this.name = name;
      return this;
    }

    /**
     * <p>The URL where webhook events should be sent to.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("url")
    public _FinalStage url(String url) {
      this.url = url;
      return this;
    }

    /**
     * <p>The authentication token you need to send webhook events. Can be either:</p>
     * <ul>
     * <li><code>Bearer</code> and a token (for Bearer authentication).</li>
     * <li><code>Basic</code> and a base64-encoded username:password string (for Basic authentication).</li>
     * </ul>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage authToken(String authToken) {
      this.authToken = Optional.of(authToken);
      return this;
    }

    @Override
    @JsonSetter(
        value = "auth_token",
        nulls = Nulls.SKIP
    )
    public _FinalStage authToken(Optional<String> authToken) {
      this.authToken = authToken;
      return this;
    }

    /**
     * <p>The authentication header for the request. <strong>Must</strong> be set to <code>Authorization</code>.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage authHeader(String authHeader) {
      this.authHeader = Optional.of(authHeader);
      return this;
    }

    @Override
    @JsonSetter(
        value = "auth_header",
        nulls = Nulls.SKIP
    )
    public _FinalStage authHeader(Optional<String> authHeader) {
      this.authHeader = authHeader;
      return this;
    }

    @Override
    public PaymentWebhookRequest build() {
      return new PaymentWebhookRequest(name, url, authHeader, authToken);
    }
  }
}
