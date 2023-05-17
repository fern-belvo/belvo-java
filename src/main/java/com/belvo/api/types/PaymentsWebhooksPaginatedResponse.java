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
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = PaymentsWebhooksPaginatedResponse.Builder.class
)
public final class PaymentsWebhooksPaginatedResponse {
  private final Optional<Integer> count;

  private final Optional<String> next;

  private final Optional<String> previous;

  private final Optional<List<PaymentWebhook>> results;

  private int _cachedHashCode;

  PaymentsWebhooksPaginatedResponse(Optional<Integer> count, Optional<String> next,
      Optional<String> previous, Optional<List<PaymentWebhook>> results) {
    this.count = count;
    this.next = next;
    this.previous = previous;
    this.results = results;
  }

  /**
   * @return The total number of results in your Belvo account.
   */
  @JsonProperty("count")
  public Optional<Integer> getCount() {
    return count;
  }

  /**
   * @return The URL to next page of results. Each page consists of up to 100 items. If there are not enough results for an additional page, the value is <code>null</code>.
   * <p>In our documentation example, we use <code>{endpoint}</code> as a placeholder value. In production, this value will be replaced by the actual endpoint you are currently using (for example, <code>customer</code> or <code>bank-accounts</code>).</p>
   */
  @JsonProperty("next")
  public Optional<String> getNext() {
    return next;
  }

  /**
   * @return The URL to the previous page of results. If there is no previous page, the value is <code>null</code>.
   */
  @JsonProperty("previous")
  public Optional<String> getPrevious() {
    return previous;
  }

  /**
   * @return Array of webhook objects.
   */
  @JsonProperty("results")
  public Optional<List<PaymentWebhook>> getResults() {
    return results;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof PaymentsWebhooksPaginatedResponse && equalTo((PaymentsWebhooksPaginatedResponse) other);
  }

  private boolean equalTo(PaymentsWebhooksPaginatedResponse other) {
    return count.equals(other.count) && next.equals(other.next) && previous.equals(other.previous) && results.equals(other.results);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.count, this.next, this.previous, this.results);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "PaymentsWebhooksPaginatedResponse{" + "count: " + count + ", next: " + next + ", previous: " + previous + ", results: " + results + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<Integer> count = Optional.empty();

    private Optional<String> next = Optional.empty();

    private Optional<String> previous = Optional.empty();

    private Optional<List<PaymentWebhook>> results = Optional.empty();

    private Builder() {
    }

    public Builder from(PaymentsWebhooksPaginatedResponse other) {
      count(other.getCount());
      next(other.getNext());
      previous(other.getPrevious());
      results(other.getResults());
      return this;
    }

    @JsonSetter(
        value = "count",
        nulls = Nulls.SKIP
    )
    public Builder count(Optional<Integer> count) {
      this.count = count;
      return this;
    }

    public Builder count(Integer count) {
      this.count = Optional.of(count);
      return this;
    }

    @JsonSetter(
        value = "next",
        nulls = Nulls.SKIP
    )
    public Builder next(Optional<String> next) {
      this.next = next;
      return this;
    }

    public Builder next(String next) {
      this.next = Optional.of(next);
      return this;
    }

    @JsonSetter(
        value = "previous",
        nulls = Nulls.SKIP
    )
    public Builder previous(Optional<String> previous) {
      this.previous = previous;
      return this;
    }

    public Builder previous(String previous) {
      this.previous = Optional.of(previous);
      return this;
    }

    @JsonSetter(
        value = "results",
        nulls = Nulls.SKIP
    )
    public Builder results(Optional<List<PaymentWebhook>> results) {
      this.results = results;
      return this;
    }

    public Builder results(List<PaymentWebhook> results) {
      this.results = Optional.of(results);
      return this;
    }

    public PaymentsWebhooksPaginatedResponse build() {
      return new PaymentsWebhooksPaginatedResponse(count, next, previous, results);
    }
  }
}
