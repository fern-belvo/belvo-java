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
    builder = PaymentTransaction.Builder.class
)
public final class PaymentTransaction {
  private final String id;

  private final String createdAt;

  private final String createdBy;

  private final String amount;

  private final EnumPaymentsCurrency currency;

  private final String description;

  private final EnumPaymentTransactionType transactionType;

  private final String beneficiary;

  private final PaymentTransactionPayer payer;

  private final Optional<String> paymentIntent;

  private final Optional<String> customer;

  private int _cachedHashCode;

  PaymentTransaction(String id, String createdAt, String createdBy, String amount,
      EnumPaymentsCurrency currency, String description, EnumPaymentTransactionType transactionType,
      String beneficiary, PaymentTransactionPayer payer, Optional<String> paymentIntent,
      Optional<String> customer) {
    this.id = id;
    this.createdAt = createdAt;
    this.createdBy = createdBy;
    this.amount = amount;
    this.currency = currency;
    this.description = description;
    this.transactionType = transactionType;
    this.beneficiary = beneficiary;
    this.payer = payer;
    this.paymentIntent = paymentIntent;
    this.customer = customer;
  }

  /**
   * @return Belvo’s unique ID to reference the transaction.
   */
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * @return The ISO-8601 timestamp of when the data point was last updated in Belvo's database.
   */
  @JsonProperty("created_at")
  public String getCreatedAt() {
    return createdAt;
  }

  /**
   * @return Belvo's unique ID for the user that created the payment.
   */
  @JsonProperty("created_by")
  public String getCreatedBy() {
    return createdBy;
  }

  /**
   * @return The transaction amount.
   * <p><strong>Note</strong>: The amount displayed is always positive as we indicate the direction of the transaction in <code>transaction_type</code> parameter.</p>
   */
  @JsonProperty("amount")
  public String getAmount() {
    return amount;
  }

  @JsonProperty("currency")
  public EnumPaymentsCurrency getCurrency() {
    return currency;
  }

  /**
   * @return The description of the payment.
   */
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  @JsonProperty("transaction_type")
  public EnumPaymentTransactionType getTransactionType() {
    return transactionType;
  }

  /**
   * @return Belvo's unique ID used to identify the beneficiary's bank account.
   */
  @JsonProperty("beneficiary")
  public String getBeneficiary() {
    return beneficiary;
  }

  @JsonProperty("payer")
  public PaymentTransactionPayer getPayer() {
    return payer;
  }

  /**
   * @return The unique ID of the payment intent associated with the transaction.
   */
  @JsonProperty("payment_intent")
  public Optional<String> getPaymentIntent() {
    return paymentIntent;
  }

  /**
   * @return Belvo's unique ID for the customer asscociated with this transaction.
   */
  @JsonProperty("customer")
  public Optional<String> getCustomer() {
    return customer;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof PaymentTransaction && equalTo((PaymentTransaction) other);
  }

  private boolean equalTo(PaymentTransaction other) {
    return id.equals(other.id) && createdAt.equals(other.createdAt) && createdBy.equals(other.createdBy) && amount.equals(other.amount) && currency.equals(other.currency) && description.equals(other.description) && transactionType.equals(other.transactionType) && beneficiary.equals(other.beneficiary) && payer.equals(other.payer) && paymentIntent.equals(other.paymentIntent) && customer.equals(other.customer);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.id, this.createdAt, this.createdBy, this.amount, this.currency, this.description, this.transactionType, this.beneficiary, this.payer, this.paymentIntent, this.customer);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "PaymentTransaction{" + "id: " + id + ", createdAt: " + createdAt + ", createdBy: " + createdBy + ", amount: " + amount + ", currency: " + currency + ", description: " + description + ", transactionType: " + transactionType + ", beneficiary: " + beneficiary + ", payer: " + payer + ", paymentIntent: " + paymentIntent + ", customer: " + customer + "}";
  }

  public static IdStage builder() {
    return new Builder();
  }

  public interface IdStage {
    CreatedAtStage id(String id);

    Builder from(PaymentTransaction other);
  }

  public interface CreatedAtStage {
    CreatedByStage createdAt(String createdAt);
  }

  public interface CreatedByStage {
    AmountStage createdBy(String createdBy);
  }

  public interface AmountStage {
    CurrencyStage amount(String amount);
  }

  public interface CurrencyStage {
    DescriptionStage currency(EnumPaymentsCurrency currency);
  }

  public interface DescriptionStage {
    TransactionTypeStage description(String description);
  }

  public interface TransactionTypeStage {
    BeneficiaryStage transactionType(EnumPaymentTransactionType transactionType);
  }

  public interface BeneficiaryStage {
    PayerStage beneficiary(String beneficiary);
  }

  public interface PayerStage {
    _FinalStage payer(PaymentTransactionPayer payer);
  }

  public interface _FinalStage {
    PaymentTransaction build();

    _FinalStage paymentIntent(Optional<String> paymentIntent);

    _FinalStage paymentIntent(String paymentIntent);

    _FinalStage customer(Optional<String> customer);

    _FinalStage customer(String customer);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements IdStage, CreatedAtStage, CreatedByStage, AmountStage, CurrencyStage, DescriptionStage, TransactionTypeStage, BeneficiaryStage, PayerStage, _FinalStage {
    private String id;

    private String createdAt;

    private String createdBy;

    private String amount;

    private EnumPaymentsCurrency currency;

    private String description;

    private EnumPaymentTransactionType transactionType;

    private String beneficiary;

    private PaymentTransactionPayer payer;

    private Optional<String> customer = Optional.empty();

    private Optional<String> paymentIntent = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(PaymentTransaction other) {
      id(other.getId());
      createdAt(other.getCreatedAt());
      createdBy(other.getCreatedBy());
      amount(other.getAmount());
      currency(other.getCurrency());
      description(other.getDescription());
      transactionType(other.getTransactionType());
      beneficiary(other.getBeneficiary());
      payer(other.getPayer());
      paymentIntent(other.getPaymentIntent());
      customer(other.getCustomer());
      return this;
    }

    /**
     * <p>Belvo’s unique ID to reference the transaction.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("id")
    public CreatedAtStage id(String id) {
      this.id = id;
      return this;
    }

    /**
     * <p>The ISO-8601 timestamp of when the data point was last updated in Belvo's database.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("created_at")
    public CreatedByStage createdAt(String createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * <p>Belvo's unique ID for the user that created the payment.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("created_by")
    public AmountStage createdBy(String createdBy) {
      this.createdBy = createdBy;
      return this;
    }

    /**
     * <p>The transaction amount.</p>
     * <p><strong>Note</strong>: The amount displayed is always positive as we indicate the direction of the transaction in <code>transaction_type</code> parameter.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("amount")
    public CurrencyStage amount(String amount) {
      this.amount = amount;
      return this;
    }

    @Override
    @JsonSetter("currency")
    public DescriptionStage currency(EnumPaymentsCurrency currency) {
      this.currency = currency;
      return this;
    }

    /**
     * <p>The description of the payment.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("description")
    public TransactionTypeStage description(String description) {
      this.description = description;
      return this;
    }

    @Override
    @JsonSetter("transaction_type")
    public BeneficiaryStage transactionType(EnumPaymentTransactionType transactionType) {
      this.transactionType = transactionType;
      return this;
    }

    /**
     * <p>Belvo's unique ID used to identify the beneficiary's bank account.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("beneficiary")
    public PayerStage beneficiary(String beneficiary) {
      this.beneficiary = beneficiary;
      return this;
    }

    @Override
    @JsonSetter("payer")
    public _FinalStage payer(PaymentTransactionPayer payer) {
      this.payer = payer;
      return this;
    }

    /**
     * <p>Belvo's unique ID for the customer asscociated with this transaction.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage customer(String customer) {
      this.customer = Optional.of(customer);
      return this;
    }

    @Override
    @JsonSetter(
        value = "customer",
        nulls = Nulls.SKIP
    )
    public _FinalStage customer(Optional<String> customer) {
      this.customer = customer;
      return this;
    }

    /**
     * <p>The unique ID of the payment intent associated with the transaction.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage paymentIntent(String paymentIntent) {
      this.paymentIntent = Optional.of(paymentIntent);
      return this;
    }

    @Override
    @JsonSetter(
        value = "payment_intent",
        nulls = Nulls.SKIP
    )
    public _FinalStage paymentIntent(Optional<String> paymentIntent) {
      this.paymentIntent = paymentIntent;
      return this;
    }

    @Override
    public PaymentTransaction build() {
      return new PaymentTransaction(id, createdAt, createdBy, amount, currency, description, transactionType, beneficiary, payer, paymentIntent, customer);
    }
  }
}
