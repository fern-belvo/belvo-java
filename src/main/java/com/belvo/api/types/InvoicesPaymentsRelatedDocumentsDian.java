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
    builder = InvoicesPaymentsRelatedDocumentsDian.Builder.class
)
public final class InvoicesPaymentsRelatedDocumentsDian {
  private final Optional<String> invoiceIdentification;

  private final Optional<String> currency;

  private final Optional<String> paymentMethod;

  private final Optional<Integer> partialityNumber;

  private final Optional<Double> previousBalance;

  private final Optional<Double> amountPaid;

  private final Optional<Double> outstandingBalance;

  private int _cachedHashCode;

  InvoicesPaymentsRelatedDocumentsDian(Optional<String> invoiceIdentification,
      Optional<String> currency, Optional<String> paymentMethod, Optional<Integer> partialityNumber,
      Optional<Double> previousBalance, Optional<Double> amountPaid,
      Optional<Double> outstandingBalance) {
    this.invoiceIdentification = invoiceIdentification;
    this.currency = currency;
    this.paymentMethod = paymentMethod;
    this.partialityNumber = partialityNumber;
    this.previousBalance = previousBalance;
    this.amountPaid = amountPaid;
    this.outstandingBalance = outstandingBalance;
  }

  /**
   * @return <strong>Note</strong>: This field is not applicable for DIAN Colombia and will return <code>null</code>.
   */
  @JsonProperty("invoice_identification")
  public Optional<String> getInvoiceIdentification() {
    return invoiceIdentification;
  }

  /**
   * @return <strong>Note</strong>: This field is not applicable for DIAN Colombia and will return <code>null</code>.
   */
  @JsonProperty("currency")
  public Optional<String> getCurrency() {
    return currency;
  }

  /**
   * @return <strong>Note</strong>: This field is not applicable for DIAN Colombia and will return <code>null</code>.
   */
  @JsonProperty("payment_method")
  public Optional<String> getPaymentMethod() {
    return paymentMethod;
  }

  /**
   * @return <strong>Note</strong>: This field is not applicable for DIAN Colombia and will return <code>null</code>.
   */
  @JsonProperty("partiality_number")
  public Optional<Integer> getPartialityNumber() {
    return partialityNumber;
  }

  /**
   * @return <strong>Note</strong>: This field is not applicable for DIAN Colombia and will return <code>null</code>.
   */
  @JsonProperty("previous_balance")
  public Optional<Double> getPreviousBalance() {
    return previousBalance;
  }

  /**
   * @return <strong>Note</strong>: This field is not applicable for DIAN Colombia and will return <code>null</code>.
   */
  @JsonProperty("amount_paid")
  public Optional<Double> getAmountPaid() {
    return amountPaid;
  }

  /**
   * @return <strong>Note</strong>: This field is not applicable for DIAN Colombia and will return <code>null</code>.
   */
  @JsonProperty("outstanding_balance")
  public Optional<Double> getOutstandingBalance() {
    return outstandingBalance;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof InvoicesPaymentsRelatedDocumentsDian && equalTo((InvoicesPaymentsRelatedDocumentsDian) other);
  }

  private boolean equalTo(InvoicesPaymentsRelatedDocumentsDian other) {
    return invoiceIdentification.equals(other.invoiceIdentification) && currency.equals(other.currency) && paymentMethod.equals(other.paymentMethod) && partialityNumber.equals(other.partialityNumber) && previousBalance.equals(other.previousBalance) && amountPaid.equals(other.amountPaid) && outstandingBalance.equals(other.outstandingBalance);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.invoiceIdentification, this.currency, this.paymentMethod, this.partialityNumber, this.previousBalance, this.amountPaid, this.outstandingBalance);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "InvoicesPaymentsRelatedDocumentsDian{" + "invoiceIdentification: " + invoiceIdentification + ", currency: " + currency + ", paymentMethod: " + paymentMethod + ", partialityNumber: " + partialityNumber + ", previousBalance: " + previousBalance + ", amountPaid: " + amountPaid + ", outstandingBalance: " + outstandingBalance + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> invoiceIdentification = Optional.empty();

    private Optional<String> currency = Optional.empty();

    private Optional<String> paymentMethod = Optional.empty();

    private Optional<Integer> partialityNumber = Optional.empty();

    private Optional<Double> previousBalance = Optional.empty();

    private Optional<Double> amountPaid = Optional.empty();

    private Optional<Double> outstandingBalance = Optional.empty();

    private Builder() {
    }

    public Builder from(InvoicesPaymentsRelatedDocumentsDian other) {
      invoiceIdentification(other.getInvoiceIdentification());
      currency(other.getCurrency());
      paymentMethod(other.getPaymentMethod());
      partialityNumber(other.getPartialityNumber());
      previousBalance(other.getPreviousBalance());
      amountPaid(other.getAmountPaid());
      outstandingBalance(other.getOutstandingBalance());
      return this;
    }

    @JsonSetter(
        value = "invoice_identification",
        nulls = Nulls.SKIP
    )
    public Builder invoiceIdentification(Optional<String> invoiceIdentification) {
      this.invoiceIdentification = invoiceIdentification;
      return this;
    }

    public Builder invoiceIdentification(String invoiceIdentification) {
      this.invoiceIdentification = Optional.of(invoiceIdentification);
      return this;
    }

    @JsonSetter(
        value = "currency",
        nulls = Nulls.SKIP
    )
    public Builder currency(Optional<String> currency) {
      this.currency = currency;
      return this;
    }

    public Builder currency(String currency) {
      this.currency = Optional.of(currency);
      return this;
    }

    @JsonSetter(
        value = "payment_method",
        nulls = Nulls.SKIP
    )
    public Builder paymentMethod(Optional<String> paymentMethod) {
      this.paymentMethod = paymentMethod;
      return this;
    }

    public Builder paymentMethod(String paymentMethod) {
      this.paymentMethod = Optional.of(paymentMethod);
      return this;
    }

    @JsonSetter(
        value = "partiality_number",
        nulls = Nulls.SKIP
    )
    public Builder partialityNumber(Optional<Integer> partialityNumber) {
      this.partialityNumber = partialityNumber;
      return this;
    }

    public Builder partialityNumber(Integer partialityNumber) {
      this.partialityNumber = Optional.of(partialityNumber);
      return this;
    }

    @JsonSetter(
        value = "previous_balance",
        nulls = Nulls.SKIP
    )
    public Builder previousBalance(Optional<Double> previousBalance) {
      this.previousBalance = previousBalance;
      return this;
    }

    public Builder previousBalance(Double previousBalance) {
      this.previousBalance = Optional.of(previousBalance);
      return this;
    }

    @JsonSetter(
        value = "amount_paid",
        nulls = Nulls.SKIP
    )
    public Builder amountPaid(Optional<Double> amountPaid) {
      this.amountPaid = amountPaid;
      return this;
    }

    public Builder amountPaid(Double amountPaid) {
      this.amountPaid = Optional.of(amountPaid);
      return this;
    }

    @JsonSetter(
        value = "outstanding_balance",
        nulls = Nulls.SKIP
    )
    public Builder outstandingBalance(Optional<Double> outstandingBalance) {
      this.outstandingBalance = outstandingBalance;
      return this;
    }

    public Builder outstandingBalance(Double outstandingBalance) {
      this.outstandingBalance = Optional.of(outstandingBalance);
      return this;
    }

    public InvoicesPaymentsRelatedDocumentsDian build() {
      return new InvoicesPaymentsRelatedDocumentsDian(invoiceIdentification, currency, paymentMethod, partialityNumber, previousBalance, amountPaid, outstandingBalance);
    }
  }
}
