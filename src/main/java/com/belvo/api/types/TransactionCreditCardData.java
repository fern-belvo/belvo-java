package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = TransactionCreditCardData.Builder.class
)
public final class TransactionCreditCardData {
  private final Optional<String> collectedAt;

  private final Optional<String> billName;

  private final Optional<String> billStatus;

  private final Optional<Double> billAmount;

  private final Optional<String> previousBillTotal;

  private int _cachedHashCode;

  TransactionCreditCardData(Optional<String> collectedAt, Optional<String> billName,
      Optional<String> billStatus, Optional<Double> billAmount,
      Optional<String> previousBillTotal) {
    this.collectedAt = collectedAt;
    this.billName = billName;
    this.billStatus = billStatus;
    this.billAmount = billAmount;
    this.previousBillTotal = previousBillTotal;
  }

  /**
   * @return The ISO-8601 timestamp when the data point was collected.
   */
  @JsonProperty("collected_at")
  public Optional<String> getCollectedAt() {
    return collectedAt;
  }

  /**
   * @return The title of the monthly credit card bill the transaction belongs to. The format of the returned value is institution specific, however, some common examples are:
   * <ul>
   * <li>diciembre-2021</li>
   * <li>dec-2021</li>
   * <li>dec-21</li>
   * </ul>
   */
  @JsonProperty("bill_name")
  public Optional<String> getBillName() {
    return billName;
  }

  @JsonProperty("bill_status")
  public Optional<String> getBillStatus() {
    return billStatus;
  }

  /**
   * @return The aggregate bill amount, as of <code>collected_at</code>.
   */
  @JsonProperty("bill_amount")
  public Optional<Double> getBillAmount() {
    return billAmount;
  }

  /**
   * @return The total amount of the previous month's bill, if available.
   */
  @JsonProperty("previous_bill_total")
  public Optional<String> getPreviousBillTotal() {
    return previousBillTotal;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof TransactionCreditCardData && equalTo((TransactionCreditCardData) other);
  }

  private boolean equalTo(TransactionCreditCardData other) {
    return collectedAt.equals(other.collectedAt) && billName.equals(other.billName) && billStatus.equals(other.billStatus) && billAmount.equals(other.billAmount) && previousBillTotal.equals(other.previousBillTotal);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.collectedAt, this.billName, this.billStatus, this.billAmount, this.previousBillTotal);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "TransactionCreditCardData{" + "collectedAt: " + collectedAt + ", billName: " + billName + ", billStatus: " + billStatus + ", billAmount: " + billAmount + ", previousBillTotal: " + previousBillTotal + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> collectedAt = Optional.empty();

    private Optional<String> billName = Optional.empty();

    private Optional<String> billStatus = Optional.empty();

    private Optional<Double> billAmount = Optional.empty();

    private Optional<String> previousBillTotal = Optional.empty();

    private Builder() {
    }

    public Builder from(TransactionCreditCardData other) {
      collectedAt(other.getCollectedAt());
      billName(other.getBillName());
      billStatus(other.getBillStatus());
      billAmount(other.getBillAmount());
      previousBillTotal(other.getPreviousBillTotal());
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
        value = "bill_name",
        nulls = Nulls.SKIP
    )
    public Builder billName(Optional<String> billName) {
      this.billName = billName;
      return this;
    }

    public Builder billName(String billName) {
      this.billName = Optional.of(billName);
      return this;
    }

    @JsonSetter(
        value = "bill_status",
        nulls = Nulls.SKIP
    )
    public Builder billStatus(Optional<String> billStatus) {
      this.billStatus = billStatus;
      return this;
    }

    public Builder billStatus(String billStatus) {
      this.billStatus = Optional.of(billStatus);
      return this;
    }

    @JsonSetter(
        value = "bill_amount",
        nulls = Nulls.SKIP
    )
    public Builder billAmount(Optional<Double> billAmount) {
      this.billAmount = billAmount;
      return this;
    }

    public Builder billAmount(Double billAmount) {
      this.billAmount = Optional.of(billAmount);
      return this;
    }

    @JsonSetter(
        value = "previous_bill_total",
        nulls = Nulls.SKIP
    )
    public Builder previousBillTotal(Optional<String> previousBillTotal) {
      this.previousBillTotal = previousBillTotal;
      return this;
    }

    public Builder previousBillTotal(String previousBillTotal) {
      this.previousBillTotal = Optional.of(previousBillTotal);
      return this;
    }

    public TransactionCreditCardData build() {
      return new TransactionCreditCardData(collectedAt, billName, billStatus, billAmount, previousBillTotal);
    }
  }
}
