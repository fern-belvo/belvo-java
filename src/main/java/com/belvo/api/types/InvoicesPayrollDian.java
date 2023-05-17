package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = InvoicesPayrollDian.Builder.class
)
public final class InvoicesPayrollDian {
  private final Optional<Integer> days;

  private final Optional<String> type;

  private final Optional<Double> amount;

  private final Optional<String> version;

  private final Optional<String> dateFrom;

  private final Optional<String> dateTo;

  private final Optional<String> collectedAt;

  private final Optional<String> paymentDate;

  private int _cachedHashCode;

  InvoicesPayrollDian(Optional<Integer> days, Optional<String> type, Optional<Double> amount,
      Optional<String> version, Optional<String> dateFrom, Optional<String> dateTo,
      Optional<String> collectedAt, Optional<String> paymentDate) {
    this.days = days;
    this.type = type;
    this.amount = amount;
    this.version = version;
    this.dateFrom = dateFrom;
    this.dateTo = dateTo;
    this.collectedAt = collectedAt;
    this.paymentDate = paymentDate;
  }

  /**
   * @return <strong>Note</strong>: This field is not applicable for DIAN Colombia and will return <code>null</code>.
   */
  @JsonProperty("days")
  public Optional<Integer> getDays() {
    return days;
  }

  /**
   * @return <strong>Note</strong>: This field is not applicable for DIAN Colombia and will return <code>null</code>.
   */
  @JsonProperty("type")
  public Optional<String> getType() {
    return type;
  }

  /**
   * @return <strong>Note</strong>: This field is not applicable for DIAN Colombia and will return <code>null</code>.
   */
  @JsonProperty("amount")
  public Optional<Double> getAmount() {
    return amount;
  }

  /**
   * @return <strong>Note</strong>: This field is not applicable for DIAN Colombia and will return <code>null</code>.
   */
  @JsonProperty("version")
  public Optional<String> getVersion() {
    return version;
  }

  /**
   * @return <strong>Note</strong>: This field is not applicable for DIAN Colombia and will return <code>null</code>.
   */
  @JsonProperty("date_from")
  public Optional<String> getDateFrom() {
    return dateFrom;
  }

  /**
   * @return <strong>Note</strong>: This field is not applicable for DIAN Colombia and will return <code>null</code>.
   */
  @JsonProperty("date_to")
  public Optional<String> getDateTo() {
    return dateTo;
  }

  /**
   * @return <strong>Note</strong>: This field is not applicable for DIAN Colombia and will return <code>null</code>.
   */
  @JsonProperty("collected_at")
  public Optional<String> getCollectedAt() {
    return collectedAt;
  }

  /**
   * @return <strong>Note</strong>: This field is not applicable for DIAN Colombia and will return <code>null</code>.
   */
  @JsonProperty("payment_date")
  public Optional<String> getPaymentDate() {
    return paymentDate;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof InvoicesPayrollDian && equalTo((InvoicesPayrollDian) other);
  }

  private boolean equalTo(InvoicesPayrollDian other) {
    return days.equals(other.days) && type.equals(other.type) && amount.equals(other.amount) && version.equals(other.version) && dateFrom.equals(other.dateFrom) && dateTo.equals(other.dateTo) && collectedAt.equals(other.collectedAt) && paymentDate.equals(other.paymentDate);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.days, this.type, this.amount, this.version, this.dateFrom, this.dateTo, this.collectedAt, this.paymentDate);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "InvoicesPayrollDian{" + "days: " + days + ", type: " + type + ", amount: " + amount + ", version: " + version + ", dateFrom: " + dateFrom + ", dateTo: " + dateTo + ", collectedAt: " + collectedAt + ", paymentDate: " + paymentDate + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<Integer> days = Optional.empty();

    private Optional<String> type = Optional.empty();

    private Optional<Double> amount = Optional.empty();

    private Optional<String> version = Optional.empty();

    private Optional<String> dateFrom = Optional.empty();

    private Optional<String> dateTo = Optional.empty();

    private Optional<String> collectedAt = Optional.empty();

    private Optional<String> paymentDate = Optional.empty();

    private Builder() {
    }

    public Builder from(InvoicesPayrollDian other) {
      days(other.getDays());
      type(other.getType());
      amount(other.getAmount());
      version(other.getVersion());
      dateFrom(other.getDateFrom());
      dateTo(other.getDateTo());
      collectedAt(other.getCollectedAt());
      paymentDate(other.getPaymentDate());
      return this;
    }

    @JsonSetter(
        value = "days",
        nulls = Nulls.SKIP
    )
    public Builder days(Optional<Integer> days) {
      this.days = days;
      return this;
    }

    public Builder days(Integer days) {
      this.days = Optional.of(days);
      return this;
    }

    @JsonSetter(
        value = "type",
        nulls = Nulls.SKIP
    )
    public Builder type(Optional<String> type) {
      this.type = type;
      return this;
    }

    public Builder type(String type) {
      this.type = Optional.of(type);
      return this;
    }

    @JsonSetter(
        value = "amount",
        nulls = Nulls.SKIP
    )
    public Builder amount(Optional<Double> amount) {
      this.amount = amount;
      return this;
    }

    public Builder amount(Double amount) {
      this.amount = Optional.of(amount);
      return this;
    }

    @JsonSetter(
        value = "version",
        nulls = Nulls.SKIP
    )
    public Builder version(Optional<String> version) {
      this.version = version;
      return this;
    }

    public Builder version(String version) {
      this.version = Optional.of(version);
      return this;
    }

    @JsonSetter(
        value = "date_from",
        nulls = Nulls.SKIP
    )
    public Builder dateFrom(Optional<String> dateFrom) {
      this.dateFrom = dateFrom;
      return this;
    }

    public Builder dateFrom(String dateFrom) {
      this.dateFrom = Optional.of(dateFrom);
      return this;
    }

    @JsonSetter(
        value = "date_to",
        nulls = Nulls.SKIP
    )
    public Builder dateTo(Optional<String> dateTo) {
      this.dateTo = dateTo;
      return this;
    }

    public Builder dateTo(String dateTo) {
      this.dateTo = Optional.of(dateTo);
      return this;
    }

    @JsonSetter(
        value = "collected_at",
        nulls = Nulls.SKIP
    )
    public Builder collectedAt(Optional<String> collectedAt) {
      this.collectedAt = collectedAt;
      return this;
    }

    public Builder collectedAt(String collectedAt) {
      this.collectedAt = Optional.of(collectedAt);
      return this;
    }

    @JsonSetter(
        value = "payment_date",
        nulls = Nulls.SKIP
    )
    public Builder paymentDate(Optional<String> paymentDate) {
      this.paymentDate = paymentDate;
      return this;
    }

    public Builder paymentDate(String paymentDate) {
      this.paymentDate = Optional.of(paymentDate);
      return this;
    }

    public InvoicesPayrollDian build() {
      return new InvoicesPayrollDian(days, type, amount, version, dateFrom, dateTo, collectedAt, paymentDate);
    }
  }
}
