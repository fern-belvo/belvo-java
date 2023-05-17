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
    builder = PaymentMethodInformationBodyOfpi.Builder.class
)
public final class PaymentMethodInformationBodyOfpi {
  private final Optional<String> providerRequestId;

  private final Optional<String> redirectUrl;

  private final Optional<String> endToEndId;

  private int _cachedHashCode;

  PaymentMethodInformationBodyOfpi(Optional<String> providerRequestId, Optional<String> redirectUrl,
      Optional<String> endToEndId) {
    this.providerRequestId = providerRequestId;
    this.redirectUrl = redirectUrl;
    this.endToEndId = endToEndId;
  }

  /**
   * @return Unique ID for the payment, as sent by the provider.
   */
  @JsonProperty("provider_request_id")
  public Optional<String> getProviderRequestId() {
    return providerRequestId;
  }

  /**
   * @return URL that redirects the user to the institution's website.
   */
  @JsonProperty("redirect_url")
  public Optional<String> getRedirectUrl() {
    return redirectUrl;
  }

  /**
   * @return A unique ID for the transaction in the Brazil's PIX payment system.
   */
  @JsonProperty("end_to_end_id")
  public Optional<String> getEndToEndId() {
    return endToEndId;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof PaymentMethodInformationBodyOfpi && equalTo((PaymentMethodInformationBodyOfpi) other);
  }

  private boolean equalTo(PaymentMethodInformationBodyOfpi other) {
    return providerRequestId.equals(other.providerRequestId) && redirectUrl.equals(other.redirectUrl) && endToEndId.equals(other.endToEndId);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.providerRequestId, this.redirectUrl, this.endToEndId);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "PaymentMethodInformationBodyOfpi{" + "providerRequestId: " + providerRequestId + ", redirectUrl: " + redirectUrl + ", endToEndId: " + endToEndId + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> providerRequestId = Optional.empty();

    private Optional<String> redirectUrl = Optional.empty();

    private Optional<String> endToEndId = Optional.empty();

    private Builder() {
    }

    public Builder from(PaymentMethodInformationBodyOfpi other) {
      providerRequestId(other.getProviderRequestId());
      redirectUrl(other.getRedirectUrl());
      endToEndId(other.getEndToEndId());
      return this;
    }

    @JsonSetter(
        value = "provider_request_id",
        nulls = Nulls.SKIP
    )
    public Builder providerRequestId(Optional<String> providerRequestId) {
      this.providerRequestId = providerRequestId;
      return this;
    }

    public Builder providerRequestId(String providerRequestId) {
      this.providerRequestId = Optional.of(providerRequestId);
      return this;
    }

    @JsonSetter(
        value = "redirect_url",
        nulls = Nulls.SKIP
    )
    public Builder redirectUrl(Optional<String> redirectUrl) {
      this.redirectUrl = redirectUrl;
      return this;
    }

    public Builder redirectUrl(String redirectUrl) {
      this.redirectUrl = Optional.of(redirectUrl);
      return this;
    }

    @JsonSetter(
        value = "end_to_end_id",
        nulls = Nulls.SKIP
    )
    public Builder endToEndId(Optional<String> endToEndId) {
      this.endToEndId = endToEndId;
      return this;
    }

    public Builder endToEndId(String endToEndId) {
      this.endToEndId = Optional.of(endToEndId);
      return this;
    }

    public PaymentMethodInformationBodyOfpi build() {
      return new PaymentMethodInformationBodyOfpi(providerRequestId, redirectUrl, endToEndId);
    }
  }
}
