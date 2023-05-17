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
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = InvoiceDetailSat.Builder.class
)
public final class InvoiceDetailSat {
  private final Optional<String> description;

  private final Optional<String> productIdentification;

  private final Optional<Integer> quantity;

  private final Optional<String> unitCode;

  private final Optional<String> unitDescription;

  private final Optional<Double> unitAmount;

  private final Optional<String> taxType;

  private final Optional<Double> preTaxAmount;

  private final Optional<Double> taxPercentage;

  private final Optional<Double> taxAmount;

  private final Optional<Double> totalAmount;

  private final Optional<List<InvoiceDetailRetainedTaxSat>> retainedTaxes;

  private final Optional<String> collectedAt;

  private int _cachedHashCode;

  InvoiceDetailSat(Optional<String> description, Optional<String> productIdentification,
      Optional<Integer> quantity, Optional<String> unitCode, Optional<String> unitDescription,
      Optional<Double> unitAmount, Optional<String> taxType, Optional<Double> preTaxAmount,
      Optional<Double> taxPercentage, Optional<Double> taxAmount, Optional<Double> totalAmount,
      Optional<List<InvoiceDetailRetainedTaxSat>> retainedTaxes, Optional<String> collectedAt) {
    this.description = description;
    this.productIdentification = productIdentification;
    this.quantity = quantity;
    this.unitCode = unitCode;
    this.unitDescription = unitDescription;
    this.unitAmount = unitAmount;
    this.taxType = taxType;
    this.preTaxAmount = preTaxAmount;
    this.taxPercentage = taxPercentage;
    this.taxAmount = taxAmount;
    this.totalAmount = totalAmount;
    this.retainedTaxes = retainedTaxes;
    this.collectedAt = collectedAt;
  }

  /**
   * @return The description of the invoice item (an invoice can have one or more items).
   */
  @JsonProperty("description")
  public Optional<String> getDescription() {
    return description;
  }

  /**
   * @return The identification code of the product or the service, as defined by the legal entity in the country.
   * <ul>
   * <li>🇲🇽 <a href="http://200.57.3.89/Pys/catPyS.aspx">Mexico</a></li>
   * </ul>
   */
  @JsonProperty("product_identification")
  public Optional<String> getProductIdentification() {
    return productIdentification;
  }

  /**
   * @return The quantity of this invoice item.
   */
  @JsonProperty("quantity")
  public Optional<Integer> getQuantity() {
    return quantity;
  }

  /**
   * @return The unit of measure, as defined by the legal entity in the country.
   * <ul>
   * <li>🇲🇽 Mexico <a href="https://developers.belvo.com/docs/sat-catalogs#unit-code">SAT catalog reference</a></li>
   * </ul>
   */
  @JsonProperty("unit_code")
  public Optional<String> getUnitCode() {
    return unitCode;
  }

  /**
   * @return The description of the item, as defined by the legal entity in the country.
   * <ul>
   * <li>🇲🇽 Mexico <a href="https://developers.belvo.com/docs/sat-catalogs#unit-code">SAT catalog reference</a></li>
   * </ul>
   */
  @JsonProperty("unit_description")
  public Optional<String> getUnitDescription() {
    return unitDescription;
  }

  /**
   * @return The price of one a singular item.
   */
  @JsonProperty("unit_amount")
  public Optional<Double> getUnitAmount() {
    return unitAmount;
  }

  /**
   * @return <strong>Note</strong>: This field is not applicable for DIAN Colombia and will return <code>null</code>.
   */
  @JsonProperty("tax_type")
  public Optional<String> getTaxType() {
    return taxType;
  }

  /**
   * @return The total price for this item before tax is applied (<code>quantity</code> x <code>unit_amount</code>).
   */
  @JsonProperty("pre_tax_amount")
  public Optional<Double> getPreTaxAmount() {
    return preTaxAmount;
  }

  /**
   * @return The tax percentage to apply.
   */
  @JsonProperty("tax_percentage")
  public Optional<Double> getTaxPercentage() {
    return taxPercentage;
  }

  /**
   * @return The amount of tax for this invoice item (<code>pre_tax_amount</code> x <code>tax_percentage</code>).
   */
  @JsonProperty("tax_amount")
  public Optional<Double> getTaxAmount() {
    return taxAmount;
  }

  /**
   * @return The total price for this invoice item (<code>pre_tax_amount</code> + <code>tax_amount</code>).
   */
  @JsonProperty("total_amount")
  public Optional<Double> getTotalAmount() {
    return totalAmount;
  }

  /**
   * @return The retained tax on the invoice item.
   */
  @JsonProperty("retained_taxes")
  public Optional<List<InvoiceDetailRetainedTaxSat>> getRetainedTaxes() {
    return retainedTaxes;
  }

  /**
   * @return The ISO-8601 timestamp when the data point was collected.
   */
  @JsonProperty("collected_at")
  public Optional<String> getCollectedAt() {
    return collectedAt;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof InvoiceDetailSat && equalTo((InvoiceDetailSat) other);
  }

  private boolean equalTo(InvoiceDetailSat other) {
    return description.equals(other.description) && productIdentification.equals(other.productIdentification) && quantity.equals(other.quantity) && unitCode.equals(other.unitCode) && unitDescription.equals(other.unitDescription) && unitAmount.equals(other.unitAmount) && taxType.equals(other.taxType) && preTaxAmount.equals(other.preTaxAmount) && taxPercentage.equals(other.taxPercentage) && taxAmount.equals(other.taxAmount) && totalAmount.equals(other.totalAmount) && retainedTaxes.equals(other.retainedTaxes) && collectedAt.equals(other.collectedAt);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.description, this.productIdentification, this.quantity, this.unitCode, this.unitDescription, this.unitAmount, this.taxType, this.preTaxAmount, this.taxPercentage, this.taxAmount, this.totalAmount, this.retainedTaxes, this.collectedAt);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "InvoiceDetailSat{" + "description: " + description + ", productIdentification: " + productIdentification + ", quantity: " + quantity + ", unitCode: " + unitCode + ", unitDescription: " + unitDescription + ", unitAmount: " + unitAmount + ", taxType: " + taxType + ", preTaxAmount: " + preTaxAmount + ", taxPercentage: " + taxPercentage + ", taxAmount: " + taxAmount + ", totalAmount: " + totalAmount + ", retainedTaxes: " + retainedTaxes + ", collectedAt: " + collectedAt + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> description = Optional.empty();

    private Optional<String> productIdentification = Optional.empty();

    private Optional<Integer> quantity = Optional.empty();

    private Optional<String> unitCode = Optional.empty();

    private Optional<String> unitDescription = Optional.empty();

    private Optional<Double> unitAmount = Optional.empty();

    private Optional<String> taxType = Optional.empty();

    private Optional<Double> preTaxAmount = Optional.empty();

    private Optional<Double> taxPercentage = Optional.empty();

    private Optional<Double> taxAmount = Optional.empty();

    private Optional<Double> totalAmount = Optional.empty();

    private Optional<List<InvoiceDetailRetainedTaxSat>> retainedTaxes = Optional.empty();

    private Optional<String> collectedAt = Optional.empty();

    private Builder() {
    }

    public Builder from(InvoiceDetailSat other) {
      description(other.getDescription());
      productIdentification(other.getProductIdentification());
      quantity(other.getQuantity());
      unitCode(other.getUnitCode());
      unitDescription(other.getUnitDescription());
      unitAmount(other.getUnitAmount());
      taxType(other.getTaxType());
      preTaxAmount(other.getPreTaxAmount());
      taxPercentage(other.getTaxPercentage());
      taxAmount(other.getTaxAmount());
      totalAmount(other.getTotalAmount());
      retainedTaxes(other.getRetainedTaxes());
      collectedAt(other.getCollectedAt());
      return this;
    }

    @JsonSetter(
        value = "description",
        nulls = Nulls.SKIP
    )
    public Builder description(Optional<String> description) {
      this.description = description;
      return this;
    }

    public Builder description(String description) {
      this.description = Optional.of(description);
      return this;
    }

    @JsonSetter(
        value = "product_identification",
        nulls = Nulls.SKIP
    )
    public Builder productIdentification(Optional<String> productIdentification) {
      this.productIdentification = productIdentification;
      return this;
    }

    public Builder productIdentification(String productIdentification) {
      this.productIdentification = Optional.of(productIdentification);
      return this;
    }

    @JsonSetter(
        value = "quantity",
        nulls = Nulls.SKIP
    )
    public Builder quantity(Optional<Integer> quantity) {
      this.quantity = quantity;
      return this;
    }

    public Builder quantity(Integer quantity) {
      this.quantity = Optional.of(quantity);
      return this;
    }

    @JsonSetter(
        value = "unit_code",
        nulls = Nulls.SKIP
    )
    public Builder unitCode(Optional<String> unitCode) {
      this.unitCode = unitCode;
      return this;
    }

    public Builder unitCode(String unitCode) {
      this.unitCode = Optional.of(unitCode);
      return this;
    }

    @JsonSetter(
        value = "unit_description",
        nulls = Nulls.SKIP
    )
    public Builder unitDescription(Optional<String> unitDescription) {
      this.unitDescription = unitDescription;
      return this;
    }

    public Builder unitDescription(String unitDescription) {
      this.unitDescription = Optional.of(unitDescription);
      return this;
    }

    @JsonSetter(
        value = "unit_amount",
        nulls = Nulls.SKIP
    )
    public Builder unitAmount(Optional<Double> unitAmount) {
      this.unitAmount = unitAmount;
      return this;
    }

    public Builder unitAmount(Double unitAmount) {
      this.unitAmount = Optional.of(unitAmount);
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
        value = "pre_tax_amount",
        nulls = Nulls.SKIP
    )
    public Builder preTaxAmount(Optional<Double> preTaxAmount) {
      this.preTaxAmount = preTaxAmount;
      return this;
    }

    public Builder preTaxAmount(Double preTaxAmount) {
      this.preTaxAmount = Optional.of(preTaxAmount);
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
        value = "tax_amount",
        nulls = Nulls.SKIP
    )
    public Builder taxAmount(Optional<Double> taxAmount) {
      this.taxAmount = taxAmount;
      return this;
    }

    public Builder taxAmount(Double taxAmount) {
      this.taxAmount = Optional.of(taxAmount);
      return this;
    }

    @JsonSetter(
        value = "total_amount",
        nulls = Nulls.SKIP
    )
    public Builder totalAmount(Optional<Double> totalAmount) {
      this.totalAmount = totalAmount;
      return this;
    }

    public Builder totalAmount(Double totalAmount) {
      this.totalAmount = Optional.of(totalAmount);
      return this;
    }

    @JsonSetter(
        value = "retained_taxes",
        nulls = Nulls.SKIP
    )
    public Builder retainedTaxes(Optional<List<InvoiceDetailRetainedTaxSat>> retainedTaxes) {
      this.retainedTaxes = retainedTaxes;
      return this;
    }

    public Builder retainedTaxes(List<InvoiceDetailRetainedTaxSat> retainedTaxes) {
      this.retainedTaxes = Optional.of(retainedTaxes);
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

    public InvoiceDetailSat build() {
      return new InvoiceDetailSat(description, productIdentification, quantity, unitCode, unitDescription, unitAmount, taxType, preTaxAmount, taxPercentage, taxAmount, totalAmount, retainedTaxes, collectedAt);
    }
  }
}
