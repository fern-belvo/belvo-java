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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = InvoicesPaymentsDian.Builder.class
)
public final class InvoicesPaymentsDian {
  private final Optional<String> date;

  private final Optional<String> paymentType;

  private final Optional<String> currency;

  private final Optional<String> exchangeRate;

  private final Optional<Double> amount;

  private final Optional<String> operationNumber;

  private final Optional<String> beneficiaryRfc;

  private final Optional<String> beneficiaryAccountNumber;

  private final Optional<String> payerRfc;

  private final Optional<String> payerAccountNumber;

  private final Optional<String> payerBankName;

  private final List<InvoicesPaymentsRelatedDocumentsDian> relatedDocuments;

  private int _cachedHashCode;

  InvoicesPaymentsDian(Optional<String> date, Optional<String> paymentType,
      Optional<String> currency, Optional<String> exchangeRate, Optional<Double> amount,
      Optional<String> operationNumber, Optional<String> beneficiaryRfc,
      Optional<String> beneficiaryAccountNumber, Optional<String> payerRfc,
      Optional<String> payerAccountNumber, Optional<String> payerBankName,
      List<InvoicesPaymentsRelatedDocumentsDian> relatedDocuments) {
    this.date = date;
    this.paymentType = paymentType;
    this.currency = currency;
    this.exchangeRate = exchangeRate;
    this.amount = amount;
    this.operationNumber = operationNumber;
    this.beneficiaryRfc = beneficiaryRfc;
    this.beneficiaryAccountNumber = beneficiaryAccountNumber;
    this.payerRfc = payerRfc;
    this.payerAccountNumber = payerAccountNumber;
    this.payerBankName = payerBankName;
    this.relatedDocuments = relatedDocuments;
  }

  /**
   * @return <strong>Note</strong>: This field is not applicable for DIAN Colombia and will return <code>null</code>.
   */
  @JsonProperty("date")
  public Optional<String> getDate() {
    return date;
  }

  /**
   * @return <strong>Note</strong>: This field is not applicable for DIAN Colombia and will return <code>null</code>.
   */
  @JsonProperty("payment_type")
  public Optional<String> getPaymentType() {
    return paymentType;
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
  @JsonProperty("exchange_rate")
  public Optional<String> getExchangeRate() {
    return exchangeRate;
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
  @JsonProperty("operation_number")
  public Optional<String> getOperationNumber() {
    return operationNumber;
  }

  /**
   * @return <strong>Note</strong>: This field is not applicable for DIAN Colombia and will return <code>null</code>.
   */
  @JsonProperty("beneficiary_rfc")
  public Optional<String> getBeneficiaryRfc() {
    return beneficiaryRfc;
  }

  /**
   * @return <strong>Note</strong>: This field is not applicable for DIAN Colombia and will return <code>null</code>.
   */
  @JsonProperty("beneficiary_account_number")
  public Optional<String> getBeneficiaryAccountNumber() {
    return beneficiaryAccountNumber;
  }

  /**
   * @return <strong>Note</strong>: This field is not applicable for DIAN Colombia and will return <code>null</code>.
   */
  @JsonProperty("payer_rfc")
  public Optional<String> getPayerRfc() {
    return payerRfc;
  }

  /**
   * @return <strong>Note</strong>: This field is not applicable for DIAN Colombia and will return <code>null</code>.
   */
  @JsonProperty("payer_account_number")
  public Optional<String> getPayerAccountNumber() {
    return payerAccountNumber;
  }

  /**
   * @return <strong>Note</strong>: This field is not applicable for DIAN Colombia and will return <code>null</code>.
   */
  @JsonProperty("payer_bank_name")
  public Optional<String> getPayerBankName() {
    return payerBankName;
  }

  /**
   * @return <strong>Note</strong>: This field is not applicable for DIAN Colombia and will return <code>null</code>.
   */
  @JsonProperty("related_documents")
  public List<InvoicesPaymentsRelatedDocumentsDian> getRelatedDocuments() {
    return relatedDocuments;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof InvoicesPaymentsDian && equalTo((InvoicesPaymentsDian) other);
  }

  private boolean equalTo(InvoicesPaymentsDian other) {
    return date.equals(other.date) && paymentType.equals(other.paymentType) && currency.equals(other.currency) && exchangeRate.equals(other.exchangeRate) && amount.equals(other.amount) && operationNumber.equals(other.operationNumber) && beneficiaryRfc.equals(other.beneficiaryRfc) && beneficiaryAccountNumber.equals(other.beneficiaryAccountNumber) && payerRfc.equals(other.payerRfc) && payerAccountNumber.equals(other.payerAccountNumber) && payerBankName.equals(other.payerBankName) && relatedDocuments.equals(other.relatedDocuments);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.date, this.paymentType, this.currency, this.exchangeRate, this.amount, this.operationNumber, this.beneficiaryRfc, this.beneficiaryAccountNumber, this.payerRfc, this.payerAccountNumber, this.payerBankName, this.relatedDocuments);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "InvoicesPaymentsDian{" + "date: " + date + ", paymentType: " + paymentType + ", currency: " + currency + ", exchangeRate: " + exchangeRate + ", amount: " + amount + ", operationNumber: " + operationNumber + ", beneficiaryRfc: " + beneficiaryRfc + ", beneficiaryAccountNumber: " + beneficiaryAccountNumber + ", payerRfc: " + payerRfc + ", payerAccountNumber: " + payerAccountNumber + ", payerBankName: " + payerBankName + ", relatedDocuments: " + relatedDocuments + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> date = Optional.empty();

    private Optional<String> paymentType = Optional.empty();

    private Optional<String> currency = Optional.empty();

    private Optional<String> exchangeRate = Optional.empty();

    private Optional<Double> amount = Optional.empty();

    private Optional<String> operationNumber = Optional.empty();

    private Optional<String> beneficiaryRfc = Optional.empty();

    private Optional<String> beneficiaryAccountNumber = Optional.empty();

    private Optional<String> payerRfc = Optional.empty();

    private Optional<String> payerAccountNumber = Optional.empty();

    private Optional<String> payerBankName = Optional.empty();

    private List<InvoicesPaymentsRelatedDocumentsDian> relatedDocuments = new ArrayList<>();

    private Builder() {
    }

    public Builder from(InvoicesPaymentsDian other) {
      date(other.getDate());
      paymentType(other.getPaymentType());
      currency(other.getCurrency());
      exchangeRate(other.getExchangeRate());
      amount(other.getAmount());
      operationNumber(other.getOperationNumber());
      beneficiaryRfc(other.getBeneficiaryRfc());
      beneficiaryAccountNumber(other.getBeneficiaryAccountNumber());
      payerRfc(other.getPayerRfc());
      payerAccountNumber(other.getPayerAccountNumber());
      payerBankName(other.getPayerBankName());
      relatedDocuments(other.getRelatedDocuments());
      return this;
    }

    @JsonSetter(
        value = "date",
        nulls = Nulls.SKIP
    )
    public Builder date(Optional<String> date) {
      this.date = date;
      return this;
    }

    public Builder date(String date) {
      this.date = Optional.of(date);
      return this;
    }

    @JsonSetter(
        value = "payment_type",
        nulls = Nulls.SKIP
    )
    public Builder paymentType(Optional<String> paymentType) {
      this.paymentType = paymentType;
      return this;
    }

    public Builder paymentType(String paymentType) {
      this.paymentType = Optional.of(paymentType);
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
        value = "exchange_rate",
        nulls = Nulls.SKIP
    )
    public Builder exchangeRate(Optional<String> exchangeRate) {
      this.exchangeRate = exchangeRate;
      return this;
    }

    public Builder exchangeRate(String exchangeRate) {
      this.exchangeRate = Optional.of(exchangeRate);
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
        value = "operation_number",
        nulls = Nulls.SKIP
    )
    public Builder operationNumber(Optional<String> operationNumber) {
      this.operationNumber = operationNumber;
      return this;
    }

    public Builder operationNumber(String operationNumber) {
      this.operationNumber = Optional.of(operationNumber);
      return this;
    }

    @JsonSetter(
        value = "beneficiary_rfc",
        nulls = Nulls.SKIP
    )
    public Builder beneficiaryRfc(Optional<String> beneficiaryRfc) {
      this.beneficiaryRfc = beneficiaryRfc;
      return this;
    }

    public Builder beneficiaryRfc(String beneficiaryRfc) {
      this.beneficiaryRfc = Optional.of(beneficiaryRfc);
      return this;
    }

    @JsonSetter(
        value = "beneficiary_account_number",
        nulls = Nulls.SKIP
    )
    public Builder beneficiaryAccountNumber(Optional<String> beneficiaryAccountNumber) {
      this.beneficiaryAccountNumber = beneficiaryAccountNumber;
      return this;
    }

    public Builder beneficiaryAccountNumber(String beneficiaryAccountNumber) {
      this.beneficiaryAccountNumber = Optional.of(beneficiaryAccountNumber);
      return this;
    }

    @JsonSetter(
        value = "payer_rfc",
        nulls = Nulls.SKIP
    )
    public Builder payerRfc(Optional<String> payerRfc) {
      this.payerRfc = payerRfc;
      return this;
    }

    public Builder payerRfc(String payerRfc) {
      this.payerRfc = Optional.of(payerRfc);
      return this;
    }

    @JsonSetter(
        value = "payer_account_number",
        nulls = Nulls.SKIP
    )
    public Builder payerAccountNumber(Optional<String> payerAccountNumber) {
      this.payerAccountNumber = payerAccountNumber;
      return this;
    }

    public Builder payerAccountNumber(String payerAccountNumber) {
      this.payerAccountNumber = Optional.of(payerAccountNumber);
      return this;
    }

    @JsonSetter(
        value = "payer_bank_name",
        nulls = Nulls.SKIP
    )
    public Builder payerBankName(Optional<String> payerBankName) {
      this.payerBankName = payerBankName;
      return this;
    }

    public Builder payerBankName(String payerBankName) {
      this.payerBankName = Optional.of(payerBankName);
      return this;
    }

    @JsonSetter(
        value = "related_documents",
        nulls = Nulls.SKIP
    )
    public Builder relatedDocuments(List<InvoicesPaymentsRelatedDocumentsDian> relatedDocuments) {
      this.relatedDocuments.clear();
      this.relatedDocuments.addAll(relatedDocuments);
      return this;
    }

    public Builder addRelatedDocuments(InvoicesPaymentsRelatedDocumentsDian relatedDocuments) {
      this.relatedDocuments.add(relatedDocuments);
      return this;
    }

    public Builder addAllRelatedDocuments(
        List<InvoicesPaymentsRelatedDocumentsDian> relatedDocuments) {
      this.relatedDocuments.addAll(relatedDocuments);
      return this;
    }

    public InvoicesPaymentsDian build() {
      return new InvoicesPaymentsDian(date, paymentType, currency, exchangeRate, amount, operationNumber, beneficiaryRfc, beneficiaryAccountNumber, payerRfc, payerAccountNumber, payerBankName, relatedDocuments);
    }
  }
}
