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
    builder = PaymentWebhook.Builder.class
)
public final class PaymentWebhook {
  private final String id;

  private final Object name;

  private final String url;

  private final Optional<String> authHeader;

  private final Optional<String> authToken;

  private final String createdAt;

  private final String createdBy;

  private int _cachedHashCode;

  PaymentWebhook(String id, Object name, String url, Optional<String> authHeader,
      Optional<String> authToken, String createdAt, String createdBy) {
    this.id = id;
    this.name = name;
    this.url = url;
    this.authHeader = authHeader;
    this.authToken = authToken;
    this.createdAt = createdAt;
    this.createdBy = createdBy;
  }

  /**
   * @return Belvo's unique ID for the webhook.
   */
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("name")
  public Object getName() {
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
   * @return The authentication token you need to send webhook events. This value is obfuscated.
   */
  @JsonProperty("auth_token")
  public Optional<String> getAuthToken() {
    return authToken;
  }

  /**
   * @return The ISO-8601 timestamp of when the webhook was created in our database.
   */
  @JsonProperty("created_at")
  public String getCreatedAt() {
    return createdAt;
  }

  /**
   * @return Belvo's unique ID of the user that created the webhook.
   */
  @JsonProperty("created_by")
  public String getCreatedBy() {
    return createdBy;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof PaymentWebhook && equalTo((PaymentWebhook) other);
  }

  private boolean equalTo(PaymentWebhook other) {
    return id.equals(other.id) && name.equals(other.name) && url.equals(other.url) && authHeader.equals(other.authHeader) && authToken.equals(other.authToken) && createdAt.equals(other.createdAt) && createdBy.equals(other.createdBy);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.id, this.name, this.url, this.authHeader, this.authToken, this.createdAt, this.createdBy);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "PaymentWebhook{" + "id: " + id + ", name: " + name + ", url: " + url + ", authHeader: " + authHeader + ", authToken: " + authToken + ", createdAt: " + createdAt + ", createdBy: " + createdBy + "}";
  }

  public static IdStage builder() {
    return new Builder();
  }

  public interface IdStage {
    NameStage id(String id);

    Builder from(PaymentWebhook other);
  }

  public interface NameStage {
    UrlStage name(Object name);
  }

  public interface UrlStage {
    CreatedAtStage url(String url);
  }

  public interface CreatedAtStage {
    CreatedByStage createdAt(String createdAt);
  }

  public interface CreatedByStage {
    _FinalStage createdBy(String createdBy);
  }

  public interface _FinalStage {
    PaymentWebhook build();

    _FinalStage authHeader(Optional<String> authHeader);

    _FinalStage authHeader(String authHeader);

    _FinalStage authToken(Optional<String> authToken);

    _FinalStage authToken(String authToken);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements IdStage, NameStage, UrlStage, CreatedAtStage, CreatedByStage, _FinalStage {
    private String id;

    private Object name;

    private String url;

    private String createdAt;

    private String createdBy;

    private Optional<String> authToken = Optional.empty();

    private Optional<String> authHeader = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(PaymentWebhook other) {
      id(other.getId());
      name(other.getName());
      url(other.getUrl());
      authHeader(other.getAuthHeader());
      authToken(other.getAuthToken());
      createdAt(other.getCreatedAt());
      createdBy(other.getCreatedBy());
      return this;
    }

    /**
     * <p>Belvo's unique ID for the webhook.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("id")
    public NameStage id(String id) {
      this.id = id;
      return this;
    }

    @Override
    @JsonSetter("name")
    public UrlStage name(Object name) {
      this.name = name;
      return this;
    }

    /**
     * <p>The URL where webhook events should be sent to.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("url")
    public CreatedAtStage url(String url) {
      this.url = url;
      return this;
    }

    /**
     * <p>The ISO-8601 timestamp of when the webhook was created in our database.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("created_at")
    public CreatedByStage createdAt(String createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * <p>Belvo's unique ID of the user that created the webhook.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("created_by")
    public _FinalStage createdBy(String createdBy) {
      this.createdBy = createdBy;
      return this;
    }

    /**
     * <p>The authentication token you need to send webhook events. This value is obfuscated.</p>
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
    public PaymentWebhook build() {
      return new PaymentWebhook(id, name, url, authHeader, authToken, createdAt, createdBy);
    }
  }
}
