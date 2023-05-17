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
    builder = InvoicesPayrollSat.Builder.class
)
public final class InvoicesPayrollSat {
  private final Optional<Integer> days;

  private final Optional<String> type;

  private final double amount;

  private final String version;

  private final Optional<String> dateFrom;

  private final Optional<String> dateTo;

  private final Optional<String> collectedAt;

  private final String paymentDate;

  private int _cachedHashCode;

  InvoicesPayrollSat(Optional<Integer> days, Optional<String> type, double amount, String version,
      Optional<String> dateFrom, Optional<String> dateTo, Optional<String> collectedAt,
      String paymentDate) {
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
   * @return The number of days covered by the payment.
   */
  @JsonProperty("days")
  public Optional<Integer> getDays() {
    return days;
  }

  /**
   * @return The payroll type, as defined by the legal entity of the country.
   * <ul>
   * <li>🇲🇽 Mexico <a href="https://developers.belvo.com/docs/sat-catalogs#payroll-type">SAT catalog reference article</a></li>
   * </ul>
   */
  @JsonProperty("type")
  public Optional<String> getType() {
    return type;
  }

  /**
   * @return The total amount of the payroll payment.
   */
  @JsonProperty("amount")
  public double getAmount() {
    return amount;
  }

  /**
   * @return The version of the payroll object.
   */
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  /**
   * @return The start date of the payment period.
   */
  @JsonProperty("date_from")
  public Optional<String> getDateFrom() {
    return dateFrom;
  }

  /**
   * @return The end date of the payment period.
   */
  @JsonProperty("date_to")
  public Optional<String> getDateTo() {
    return dateTo;
  }

  /**
   * @return The ISO-8601 timestamp when the data point was collected.
   */
  @JsonProperty("collected_at")
  public Optional<String> getCollectedAt() {
    return collectedAt;
  }

  /**
   * @return The payment date.
   */
  @JsonProperty("payment_date")
  public String getPaymentDate() {
    return paymentDate;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof InvoicesPayrollSat && equalTo((InvoicesPayrollSat) other);
  }

  private boolean equalTo(InvoicesPayrollSat other) {
    return days.equals(other.days) && type.equals(other.type) && amount == other.amount && version.equals(other.version) && dateFrom.equals(other.dateFrom) && dateTo.equals(other.dateTo) && collectedAt.equals(other.collectedAt) && paymentDate.equals(other.paymentDate);
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
    return "InvoicesPayrollSat{" + "days: " + days + ", type: " + type + ", amount: " + amount + ", version: " + version + ", dateFrom: " + dateFrom + ", dateTo: " + dateTo + ", collectedAt: " + collectedAt + ", paymentDate: " + paymentDate + "}";
  }

  public static AmountStage builder() {
    return new Builder();
  }

  public interface AmountStage {
    VersionStage amount(double amount);

    Builder from(InvoicesPayrollSat other);
  }

  public interface VersionStage {
    PaymentDateStage version(String version);
  }

  public interface PaymentDateStage {
    _FinalStage paymentDate(String paymentDate);
  }

  public interface _FinalStage {
    InvoicesPayrollSat build();

    _FinalStage days(Optional<Integer> days);

    _FinalStage days(Integer days);

    _FinalStage type(Optional<String> type);

    _FinalStage type(String type);

    _FinalStage dateFrom(Optional<String> dateFrom);

    _FinalStage dateFrom(String dateFrom);

    _FinalStage dateTo(Optional<String> dateTo);

    _FinalStage dateTo(String dateTo);

    _FinalStage collectedAt(Optional<String> collectedAt);

    _FinalStage collectedAt(String collectedAt);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements AmountStage, VersionStage, PaymentDateStage, _FinalStage {
    private double amount;

    private String version;

    private String paymentDate;

    private Optional<String> collectedAt = Optional.empty();

    private Optional<String> dateTo = Optional.empty();

    private Optional<String> dateFrom = Optional.empty();

    private Optional<String> type = Optional.empty();

    private Optional<Integer> days = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(InvoicesPayrollSat other) {
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

    /**
     * <p>The total amount of the payroll payment.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("amount")
    public VersionStage amount(double amount) {
      this.amount = amount;
      return this;
    }

    /**
     * <p>The version of the payroll object.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("version")
    public PaymentDateStage version(String version) {
      this.version = version;
      return this;
    }

    /**
     * <p>The payment date.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("payment_date")
    public _FinalStage paymentDate(String paymentDate) {
      this.paymentDate = paymentDate;
      return this;
    }

    /**
     * <p>The ISO-8601 timestamp when the data point was collected.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage collectedAt(String collectedAt) {
      this.collectedAt = Optional.of(collectedAt);
      return this;
    }

    @Override
    @JsonSetter(
        value = "collected_at",
        nulls = Nulls.SKIP
    )
    public _FinalStage collectedAt(Optional<String> collectedAt) {
      this.collectedAt = collectedAt;
      return this;
    }

    /**
     * <p>The end date of the payment period.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage dateTo(String dateTo) {
      this.dateTo = Optional.of(dateTo);
      return this;
    }

    @Override
    @JsonSetter(
        value = "date_to",
        nulls = Nulls.SKIP
    )
    public _FinalStage dateTo(Optional<String> dateTo) {
      this.dateTo = dateTo;
      return this;
    }

    /**
     * <p>The start date of the payment period.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage dateFrom(String dateFrom) {
      this.dateFrom = Optional.of(dateFrom);
      return this;
    }

    @Override
    @JsonSetter(
        value = "date_from",
        nulls = Nulls.SKIP
    )
    public _FinalStage dateFrom(Optional<String> dateFrom) {
      this.dateFrom = dateFrom;
      return this;
    }

    /**
     * <p>The payroll type, as defined by the legal entity of the country.</p>
     * <ul>
     * <li>🇲🇽 Mexico <a href="https://developers.belvo.com/docs/sat-catalogs#payroll-type">SAT catalog reference article</a></li>
     * </ul>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage type(String type) {
      this.type = Optional.of(type);
      return this;
    }

    @Override
    @JsonSetter(
        value = "type",
        nulls = Nulls.SKIP
    )
    public _FinalStage type(Optional<String> type) {
      this.type = type;
      return this;
    }

    /**
     * <p>The number of days covered by the payment.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage days(Integer days) {
      this.days = Optional.of(days);
      return this;
    }

    @Override
    @JsonSetter(
        value = "days",
        nulls = Nulls.SKIP
    )
    public _FinalStage days(Optional<Integer> days) {
      this.days = days;
      return this;
    }

    @Override
    public InvoicesPayrollSat build() {
      return new InvoicesPayrollSat(days, type, amount, version, dateFrom, dateTo, collectedAt, paymentDate);
    }
  }
}
