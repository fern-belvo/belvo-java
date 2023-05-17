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
    builder = ReceivablesTransactionNumberOfInstallments.Builder.class
)
public final class ReceivablesTransactionNumberOfInstallments {
  private final Optional<Integer> paid;

  private final Optional<Integer> total;

  private int _cachedHashCode;

  ReceivablesTransactionNumberOfInstallments(Optional<Integer> paid, Optional<Integer> total) {
    this.paid = paid;
    this.total = total;
  }

  /**
   * @return The number of payments already made to pay the cost of the transaction.
   */
  @JsonProperty("paid")
  public Optional<Integer> getPaid() {
    return paid;
  }

  /**
   * @return The number of payments required to pay the cost of the transaction.
   */
  @JsonProperty("total")
  public Optional<Integer> getTotal() {
    return total;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof ReceivablesTransactionNumberOfInstallments && equalTo((ReceivablesTransactionNumberOfInstallments) other);
  }

  private boolean equalTo(ReceivablesTransactionNumberOfInstallments other) {
    return paid.equals(other.paid) && total.equals(other.total);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.paid, this.total);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "ReceivablesTransactionNumberOfInstallments{" + "paid: " + paid + ", total: " + total + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<Integer> paid = Optional.empty();

    private Optional<Integer> total = Optional.empty();

    private Builder() {
    }

    public Builder from(ReceivablesTransactionNumberOfInstallments other) {
      paid(other.getPaid());
      total(other.getTotal());
      return this;
    }

    @JsonSetter(
        value = "paid",
        nulls = Nulls.SKIP
    )
    public Builder paid(Optional<Integer> paid) {
      this.paid = paid;
      return this;
    }

    public Builder paid(Integer paid) {
      this.paid = Optional.of(paid);
      return this;
    }

    @JsonSetter(
        value = "total",
        nulls = Nulls.SKIP
    )
    public Builder total(Optional<Integer> total) {
      this.total = total;
      return this;
    }

    public Builder total(Integer total) {
      this.total = Optional.of(total);
      return this;
    }

    public ReceivablesTransactionNumberOfInstallments build() {
      return new ReceivablesTransactionNumberOfInstallments(paid, total);
    }
  }
}
