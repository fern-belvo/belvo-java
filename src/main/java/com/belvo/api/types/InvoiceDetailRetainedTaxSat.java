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
    builder = InvoiceDetailRetainedTaxSat.Builder.class
)
public final class InvoiceDetailRetainedTaxSat {
  private final Optional<String> collectedAt;

  private final Optional<String> taxType;

  private final Optional<String> tax;

  private final Optional<Double> taxPercentage;

  private final Optional<Double> retainedTaxAmount;

  private int _cachedHashCode;

  InvoiceDetailRetainedTaxSat(Optional<String> collectedAt, Optional<String> taxType,
      Optional<String> tax, Optional<Double> taxPercentage, Optional<Double> retainedTaxAmount) {
    this.collectedAt = collectedAt;
    this.taxType = taxType;
    this.tax = tax;
    this.taxPercentage = taxPercentage;
    this.retainedTaxAmount = retainedTaxAmount;
  }

  /**
   * @return The ISO-8601 timestamp when the data point was collected.
   */
  @JsonProperty("collected_at")
  public Optional<String> getCollectedAt() {
    return collectedAt;
  }

  /**
   * @return <strong>Note</strong>: This field is not applicable for SAT Mexico and will return <code>null</code>.
   */
  @JsonProperty("tax_type")
  public Optional<String> getTaxType() {
    return taxType;
  }

  /**
   * @return The type of retained tax (for example, ISR, IVA or IEPS).
   */
  @JsonProperty("tax")
  public Optional<String> getTax() {
    return tax;
  }

  /**
   * @return The percentage of tax retained.
   */
  @JsonProperty("tax_percentage")
  public Optional<Double> getTaxPercentage() {
    return taxPercentage;
  }

  /**
   * @return The amount of retained tax.
   */
  @JsonProperty("retained_tax_amount")
  public Optional<Double> getRetainedTaxAmount() {
    return retainedTaxAmount;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof InvoiceDetailRetainedTaxSat && equalTo((InvoiceDetailRetainedTaxSat) other);
  }

  private boolean equalTo(InvoiceDetailRetainedTaxSat other) {
    return collectedAt.equals(other.collectedAt) && taxType.equals(other.taxType) && tax.equals(other.tax) && taxPercentage.equals(other.taxPercentage) && retainedTaxAmount.equals(other.retainedTaxAmount);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.collectedAt, this.taxType, this.tax, this.taxPercentage, this.retainedTaxAmount);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "InvoiceDetailRetainedTaxSat{" + "collectedAt: " + collectedAt + ", taxType: " + taxType + ", tax: " + tax + ", taxPercentage: " + taxPercentage + ", retainedTaxAmount: " + retainedTaxAmount + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> collectedAt = Optional.empty();

    private Optional<String> taxType = Optional.empty();

    private Optional<String> tax = Optional.empty();

    private Optional<Double> taxPercentage = Optional.empty();

    private Optional<Double> retainedTaxAmount = Optional.empty();

    private Builder() {
    }

    public Builder from(InvoiceDetailRetainedTaxSat other) {
      collectedAt(other.getCollectedAt());
      taxType(other.getTaxType());
      tax(other.getTax());
      taxPercentage(other.getTaxPercentage());
      retainedTaxAmount(other.getRetainedTaxAmount());
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
        value = "tax_type",
        nulls = Nulls.SKIP
    )
    public Builder taxType(Optional<String> taxType) {
      this.taxType = taxType;
      return this;
    }

    public Builder taxType(String taxType) {
      this.taxType = Optional.of(taxType);
      return this;
    }

    @JsonSetter(
        value = "tax",
        nulls = Nulls.SKIP
    )
    public Builder tax(Optional<String> tax) {
      this.tax = tax;
      return this;
    }

    public Builder tax(String tax) {
      this.tax = Optional.of(tax);
      return this;
    }

    @JsonSetter(
        value = "tax_percentage",
        nulls = Nulls.SKIP
    )
    public Builder taxPercentage(Optional<Double> taxPercentage) {
      this.taxPercentage = taxPercentage;
      return this;
    }

    public Builder taxPercentage(Double taxPercentage) {
      this.taxPercentage = Optional.of(taxPercentage);
      return this;
    }

    @JsonSetter(
        value = "retained_tax_amount",
        nulls = Nulls.SKIP
    )
    public Builder retainedTaxAmount(Optional<Double> retainedTaxAmount) {
      this.retainedTaxAmount = retainedTaxAmount;
      return this;
    }

    public Builder retainedTaxAmount(Double retainedTaxAmount) {
      this.retainedTaxAmount = Optional.of(retainedTaxAmount);
      return this;
    }

    public InvoiceDetailRetainedTaxSat build() {
      return new InvoiceDetailRetainedTaxSat(collectedAt, taxType, tax, taxPercentage, retainedTaxAmount);
    }
  }
}
