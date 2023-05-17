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
    builder = PaymentLinkCallbackUrls.Builder.class
)
public final class PaymentLinkCallbackUrls {
  private final Optional<String> cancel;

  private final Optional<String> success;

  private int _cachedHashCode;

  PaymentLinkCallbackUrls(Optional<String> cancel, Optional<String> success) {
    this.cancel = cancel;
    this.success = success;
  }

  /**
   * @return The URL that the user should be redirected to if they decide to cancel the payment process or if an error occurs.
   * <p><strong>Note:</strong> Not required if your integration only generates payment links through the <a href="https://dashboard.belvo.com/">Belvo Dashboard</a>.</p>
   */
  @JsonProperty("cancel")
  public Optional<String> getCancel() {
    return cancel;
  }

  /**
   * @return The URL that the user should be redirected to when they complete the payment process successfully.
   * <p><strong>Note:</strong> Not required if your integration only generates payment links through the <a href="https://dashboard.belvo.com/">Belvo Dashboard</a>.</p>
   */
  @JsonProperty("success")
  public Optional<String> getSuccess() {
    return success;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof PaymentLinkCallbackUrls && equalTo((PaymentLinkCallbackUrls) other);
  }

  private boolean equalTo(PaymentLinkCallbackUrls other) {
    return cancel.equals(other.cancel) && success.equals(other.success);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.cancel, this.success);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "PaymentLinkCallbackUrls{" + "cancel: " + cancel + ", success: " + success + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> cancel = Optional.empty();

    private Optional<String> success = Optional.empty();

    private Builder() {
    }

    public Builder from(PaymentLinkCallbackUrls other) {
      cancel(other.getCancel());
      success(other.getSuccess());
      return this;
    }

    @JsonSetter(
        value = "cancel",
        nulls = Nulls.SKIP
    )
    public Builder cancel(Optional<String> cancel) {
      this.cancel = cancel;
      return this;
    }

    public Builder cancel(String cancel) {
      this.cancel = Optional.of(cancel);
      return this;
    }

    @JsonSetter(
        value = "success",
        nulls = Nulls.SKIP
    )
    public Builder success(Optional<String> success) {
      this.success = success;
      return this;
    }

    public Builder success(String success) {
      this.success = Optional.of(success);
      return this;
    }

    public PaymentLinkCallbackUrls build() {
      return new PaymentLinkCallbackUrls(cancel, success);
    }
  }
}
