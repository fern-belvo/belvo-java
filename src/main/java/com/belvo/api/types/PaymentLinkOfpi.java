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
    builder = PaymentLinkOfpi.Builder.class
)
public final class PaymentLinkOfpi {
  private final String id;

  private final String createdAt;

  private final String createdBy;

  private final String paymentUrl;

  private final Optional<String> accessToken;

  private final PaymentLinkCallbackUrlsResponse callbackUrls;

  private final Optional<PaymentIntentOfpi> paymentIntent;

  private final Optional<String> updatedAt;

  private final EnumPaymentLinksStatus status;

  private final String expiresIn;

  private final String expiresAt;

  private int _cachedHashCode;

  PaymentLinkOfpi(String id, String createdAt, String createdBy, String paymentUrl,
      Optional<String> accessToken, PaymentLinkCallbackUrlsResponse callbackUrls,
      Optional<PaymentIntentOfpi> paymentIntent, Optional<String> updatedAt,
      EnumPaymentLinksStatus status, String expiresIn, String expiresAt) {
    this.id = id;
    this.createdAt = createdAt;
    this.createdBy = createdBy;
    this.paymentUrl = paymentUrl;
    this.accessToken = accessToken;
    this.callbackUrls = callbackUrls;
    this.paymentIntent = paymentIntent;
    this.updatedAt = updatedAt;
    this.status = status;
    this.expiresIn = expiresIn;
    this.expiresAt = expiresAt;
  }

  /**
   * @return Belvo's unique ID for the current payment link.
   */
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * @return The ISO-8601 timestamp of when the data point was last updated in Belvo's database.
   */
  @JsonProperty("created_at")
  public String getCreatedAt() {
    return createdAt;
  }

  /**
   * @return Belvo's unique ID for the user that created the payment link.
   */
  @JsonProperty("created_by")
  public String getCreatedBy() {
    return createdBy;
  }

  /**
   * @return The URL for the hosted-widget that will guide your user through the payments process.
   */
  @JsonProperty("payment_url")
  public String getPaymentUrl() {
    return paymentUrl;
  }

  /**
   * @return The Belvo-generated access token for the payment link.
   * <p><strong>Note:</strong> You'll need the <code>access_token</code> to make <a href="https://developers.belvo.com/reference/detailcreatepaymentlink">Get details for a payment link</a> requests.</p>
   */
  @JsonProperty("access_token")
  public Optional<String> getAccessToken() {
    return accessToken;
  }

  @JsonProperty("callback_urls")
  public PaymentLinkCallbackUrlsResponse getCallbackUrls() {
    return callbackUrls;
  }

  @JsonProperty("payment_intent")
  public Optional<PaymentIntentOfpi> getPaymentIntent() {
    return paymentIntent;
  }

  /**
   * @return The ISO-8601 timestamp of when the payment link was last updated.
   */
  @JsonProperty("updated_at")
  public Optional<String> getUpdatedAt() {
    return updatedAt;
  }

  @JsonProperty("status")
  public EnumPaymentLinksStatus getStatus() {
    return status;
  }

  /**
   * @return The payment link expiration time.
   */
  @JsonProperty("expires_in")
  public String getExpiresIn() {
    return expiresIn;
  }

  /**
   * @return The ISO-8601 timestamp of when the payment link is set to expire.
   */
  @JsonProperty("expires_at")
  public String getExpiresAt() {
    return expiresAt;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof PaymentLinkOfpi && equalTo((PaymentLinkOfpi) other);
  }

  private boolean equalTo(PaymentLinkOfpi other) {
    return id.equals(other.id) && createdAt.equals(other.createdAt) && createdBy.equals(other.createdBy) && paymentUrl.equals(other.paymentUrl) && accessToken.equals(other.accessToken) && callbackUrls.equals(other.callbackUrls) && paymentIntent.equals(other.paymentIntent) && updatedAt.equals(other.updatedAt) && status.equals(other.status) && expiresIn.equals(other.expiresIn) && expiresAt.equals(other.expiresAt);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.id, this.createdAt, this.createdBy, this.paymentUrl, this.accessToken, this.callbackUrls, this.paymentIntent, this.updatedAt, this.status, this.expiresIn, this.expiresAt);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "PaymentLinkOfpi{" + "id: " + id + ", createdAt: " + createdAt + ", createdBy: " + createdBy + ", paymentUrl: " + paymentUrl + ", accessToken: " + accessToken + ", callbackUrls: " + callbackUrls + ", paymentIntent: " + paymentIntent + ", updatedAt: " + updatedAt + ", status: " + status + ", expiresIn: " + expiresIn + ", expiresAt: " + expiresAt + "}";
  }

  public static IdStage builder() {
    return new Builder();
  }

  public interface IdStage {
    CreatedAtStage id(String id);

    Builder from(PaymentLinkOfpi other);
  }

  public interface CreatedAtStage {
    CreatedByStage createdAt(String createdAt);
  }

  public interface CreatedByStage {
    PaymentUrlStage createdBy(String createdBy);
  }

  public interface PaymentUrlStage {
    CallbackUrlsStage paymentUrl(String paymentUrl);
  }

  public interface CallbackUrlsStage {
    StatusStage callbackUrls(PaymentLinkCallbackUrlsResponse callbackUrls);
  }

  public interface StatusStage {
    ExpiresInStage status(EnumPaymentLinksStatus status);
  }

  public interface ExpiresInStage {
    ExpiresAtStage expiresIn(String expiresIn);
  }

  public interface ExpiresAtStage {
    _FinalStage expiresAt(String expiresAt);
  }

  public interface _FinalStage {
    PaymentLinkOfpi build();

    _FinalStage accessToken(Optional<String> accessToken);

    _FinalStage accessToken(String accessToken);

    _FinalStage paymentIntent(Optional<PaymentIntentOfpi> paymentIntent);

    _FinalStage paymentIntent(PaymentIntentOfpi paymentIntent);

    _FinalStage updatedAt(Optional<String> updatedAt);

    _FinalStage updatedAt(String updatedAt);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements IdStage, CreatedAtStage, CreatedByStage, PaymentUrlStage, CallbackUrlsStage, StatusStage, ExpiresInStage, ExpiresAtStage, _FinalStage {
    private String id;

    private String createdAt;

    private String createdBy;

    private String paymentUrl;

    private PaymentLinkCallbackUrlsResponse callbackUrls;

    private EnumPaymentLinksStatus status;

    private String expiresIn;

    private String expiresAt;

    private Optional<String> updatedAt = Optional.empty();

    private Optional<PaymentIntentOfpi> paymentIntent = Optional.empty();

    private Optional<String> accessToken = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(PaymentLinkOfpi other) {
      id(other.getId());
      createdAt(other.getCreatedAt());
      createdBy(other.getCreatedBy());
      paymentUrl(other.getPaymentUrl());
      accessToken(other.getAccessToken());
      callbackUrls(other.getCallbackUrls());
      paymentIntent(other.getPaymentIntent());
      updatedAt(other.getUpdatedAt());
      status(other.getStatus());
      expiresIn(other.getExpiresIn());
      expiresAt(other.getExpiresAt());
      return this;
    }

    /**
     * <p>Belvo's unique ID for the current payment link.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("id")
    public CreatedAtStage id(String id) {
      this.id = id;
      return this;
    }

    /**
     * <p>The ISO-8601 timestamp of when the data point was last updated in Belvo's database.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("created_at")
    public CreatedByStage createdAt(String createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * <p>Belvo's unique ID for the user that created the payment link.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("created_by")
    public PaymentUrlStage createdBy(String createdBy) {
      this.createdBy = createdBy;
      return this;
    }

    /**
     * <p>The URL for the hosted-widget that will guide your user through the payments process.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("payment_url")
    public CallbackUrlsStage paymentUrl(String paymentUrl) {
      this.paymentUrl = paymentUrl;
      return this;
    }

    @Override
    @JsonSetter("callback_urls")
    public StatusStage callbackUrls(PaymentLinkCallbackUrlsResponse callbackUrls) {
      this.callbackUrls = callbackUrls;
      return this;
    }

    @Override
    @JsonSetter("status")
    public ExpiresInStage status(EnumPaymentLinksStatus status) {
      this.status = status;
      return this;
    }

    /**
     * <p>The payment link expiration time.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("expires_in")
    public ExpiresAtStage expiresIn(String expiresIn) {
      this.expiresIn = expiresIn;
      return this;
    }

    /**
     * <p>The ISO-8601 timestamp of when the payment link is set to expire.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("expires_at")
    public _FinalStage expiresAt(String expiresAt) {
      this.expiresAt = expiresAt;
      return this;
    }

    /**
     * <p>The ISO-8601 timestamp of when the payment link was last updated.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage updatedAt(String updatedAt) {
      this.updatedAt = Optional.of(updatedAt);
      return this;
    }

    @Override
    @JsonSetter(
        value = "updated_at",
        nulls = Nulls.SKIP
    )
    public _FinalStage updatedAt(Optional<String> updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }

    @Override
    public _FinalStage paymentIntent(PaymentIntentOfpi paymentIntent) {
      this.paymentIntent = Optional.of(paymentIntent);
      return this;
    }

    @Override
    @JsonSetter(
        value = "payment_intent",
        nulls = Nulls.SKIP
    )
    public _FinalStage paymentIntent(Optional<PaymentIntentOfpi> paymentIntent) {
      this.paymentIntent = paymentIntent;
      return this;
    }

    /**
     * <p>The Belvo-generated access token for the payment link.</p>
     * <p><strong>Note:</strong> You'll need the <code>access_token</code> to make <a href="https://developers.belvo.com/reference/detailcreatepaymentlink">Get details for a payment link</a> requests.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage accessToken(String accessToken) {
      this.accessToken = Optional.of(accessToken);
      return this;
    }

    @Override
    @JsonSetter(
        value = "access_token",
        nulls = Nulls.SKIP
    )
    public _FinalStage accessToken(Optional<String> accessToken) {
      this.accessToken = accessToken;
      return this;
    }

    @Override
    public PaymentLinkOfpi build() {
      return new PaymentLinkOfpi(id, createdAt, createdBy, paymentUrl, accessToken, callbackUrls, paymentIntent, updatedAt, status, expiresIn, expiresAt);
    }
  }
}
