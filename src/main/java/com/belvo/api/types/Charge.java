package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = Charge.Builder.class
)
public final class Charge {
  private final String id;

  private final String createdAt;

  private final Optional<String> createdBy;

  private final Optional<String> customer;

  private final Optional<String> failureCode;

  private final Optional<String> failureMessage;

  private final ChargeStatus status;

  private final Optional<String> amount;

  private final Optional<EnumPaymentsCurrency> currency;

  private final Optional<String> description;

  private final Map<String, Object> metadata;

  private final String beneficiary;

  private final EnumPaymentLinkProvider provider;

  private final Optional<EnumPaymentLinkAllowedPaymentMethod> paymentMethodType;

  private final ChargePaymentMethodDetails paymentMethodDetails;

  private final PaymentMethodInformationPse paymentMethodInformation;

  private final Optional<String> paymentIntent;

  private final Optional<List<PaymentTransaction>> transactions;

  private final Optional<String> updatedAt;

  private int _cachedHashCode;

  Charge(String id, String createdAt, Optional<String> createdBy, Optional<String> customer,
      Optional<String> failureCode, Optional<String> failureMessage, ChargeStatus status,
      Optional<String> amount, Optional<EnumPaymentsCurrency> currency,
      Optional<String> description, Map<String, Object> metadata, String beneficiary,
      EnumPaymentLinkProvider provider,
      Optional<EnumPaymentLinkAllowedPaymentMethod> paymentMethodType,
      ChargePaymentMethodDetails paymentMethodDetails,
      PaymentMethodInformationPse paymentMethodInformation, Optional<String> paymentIntent,
      Optional<List<PaymentTransaction>> transactions, Optional<String> updatedAt) {
    this.id = id;
    this.createdAt = createdAt;
    this.createdBy = createdBy;
    this.customer = customer;
    this.failureCode = failureCode;
    this.failureMessage = failureMessage;
    this.status = status;
    this.amount = amount;
    this.currency = currency;
    this.description = description;
    this.metadata = metadata;
    this.beneficiary = beneficiary;
    this.provider = provider;
    this.paymentMethodType = paymentMethodType;
    this.paymentMethodDetails = paymentMethodDetails;
    this.paymentMethodInformation = paymentMethodInformation;
    this.paymentIntent = paymentIntent;
    this.transactions = transactions;
    this.updatedAt = updatedAt;
  }

  /**
   * @return Belvo's unique ID for the current charge.
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
   * @return Belvo's unique ID for the user that created the charge.
   */
  @JsonProperty("created_by")
  public Optional<String> getCreatedBy() {
    return createdBy;
  }

  /**
   * @return Belvo's unique ID for the customer that the charge was created for.
   */
  @JsonProperty("customer")
  public Optional<String> getCustomer() {
    return customer;
  }

  /**
   * @return Error code that explains the reason behind a payment being unsuccessful (if applicable).
   */
  @JsonProperty("failure_code")
  public Optional<String> getFailureCode() {
    return failureCode;
  }

  /**
   * @return Further information regarding the <code>failure_code</code>.
   */
  @JsonProperty("failure_message")
  public Optional<String> getFailureMessage() {
    return failureMessage;
  }

  /**
   * @return The current status of the charge.
   */
  @JsonProperty("status")
  public ChargeStatus getStatus() {
    return status;
  }

  /**
   * @return The amount of the charge.
   */
  @JsonProperty("amount")
  public Optional<String> getAmount() {
    return amount;
  }

  @JsonProperty("currency")
  public Optional<EnumPaymentsCurrency> getCurrency() {
    return currency;
  }

  /**
   * @return The description of the payment.
   */
  @JsonProperty("description")
  public Optional<String> getDescription() {
    return description;
  }

  /**
   * @return Optional and customizable object where you can provide any additional key-value pairs for your internal purposes. For example, an internal reference number.
   * <p>⚠️ <strong>Note</strong>: You can only provide up to 50 keys (keys can have up to 50 characters each and each value can be up to 500 characters). We do not support nested objects, only ASCII values.</p>
   */
  @JsonProperty("metadata")
  public Map<String, Object> getMetadata() {
    return metadata;
  }

  /**
   * @return Belvo's unique ID used to identify the beneficiary’s bank account.
   */
  @JsonProperty("beneficiary")
  public String getBeneficiary() {
    return beneficiary;
  }

  @JsonProperty("provider")
  public EnumPaymentLinkProvider getProvider() {
    return provider;
  }

  @JsonProperty("payment_method_type")
  public Optional<EnumPaymentLinkAllowedPaymentMethod> getPaymentMethodType() {
    return paymentMethodType;
  }

  @JsonProperty("payment_method_details")
  public ChargePaymentMethodDetails getPaymentMethodDetails() {
    return paymentMethodDetails;
  }

  @JsonProperty("payment_method_information")
  public PaymentMethodInformationPse getPaymentMethodInformation() {
    return paymentMethodInformation;
  }

  /**
   * @return The <code>payment_intent.id</code> associated with this charge.
   */
  @JsonProperty("payment_intent")
  public Optional<String> getPaymentIntent() {
    return paymentIntent;
  }

  /**
   * @return An array of Transaction objects relating to the charge.
   */
  @JsonProperty("transactions")
  public Optional<List<PaymentTransaction>> getTransactions() {
    return transactions;
  }

  /**
   * @return The ISO-8601 timestamp of when the status of the charge was last updated.
   */
  @JsonProperty("updated_at")
  public Optional<String> getUpdatedAt() {
    return updatedAt;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof Charge && equalTo((Charge) other);
  }

  private boolean equalTo(Charge other) {
    return id.equals(other.id) && createdAt.equals(other.createdAt) && createdBy.equals(other.createdBy) && customer.equals(other.customer) && failureCode.equals(other.failureCode) && failureMessage.equals(other.failureMessage) && status.equals(other.status) && amount.equals(other.amount) && currency.equals(other.currency) && description.equals(other.description) && metadata.equals(other.metadata) && beneficiary.equals(other.beneficiary) && provider.equals(other.provider) && paymentMethodType.equals(other.paymentMethodType) && paymentMethodDetails.equals(other.paymentMethodDetails) && paymentMethodInformation.equals(other.paymentMethodInformation) && paymentIntent.equals(other.paymentIntent) && transactions.equals(other.transactions) && updatedAt.equals(other.updatedAt);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.id, this.createdAt, this.createdBy, this.customer, this.failureCode, this.failureMessage, this.status, this.amount, this.currency, this.description, this.metadata, this.beneficiary, this.provider, this.paymentMethodType, this.paymentMethodDetails, this.paymentMethodInformation, this.paymentIntent, this.transactions, this.updatedAt);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "Charge{" + "id: " + id + ", createdAt: " + createdAt + ", createdBy: " + createdBy + ", customer: " + customer + ", failureCode: " + failureCode + ", failureMessage: " + failureMessage + ", status: " + status + ", amount: " + amount + ", currency: " + currency + ", description: " + description + ", metadata: " + metadata + ", beneficiary: " + beneficiary + ", provider: " + provider + ", paymentMethodType: " + paymentMethodType + ", paymentMethodDetails: " + paymentMethodDetails + ", paymentMethodInformation: " + paymentMethodInformation + ", paymentIntent: " + paymentIntent + ", transactions: " + transactions + ", updatedAt: " + updatedAt + "}";
  }

  public static IdStage builder() {
    return new Builder();
  }

  public interface IdStage {
    CreatedAtStage id(String id);

    Builder from(Charge other);
  }

  public interface CreatedAtStage {
    StatusStage createdAt(String createdAt);
  }

  public interface StatusStage {
    BeneficiaryStage status(ChargeStatus status);
  }

  public interface BeneficiaryStage {
    ProviderStage beneficiary(String beneficiary);
  }

  public interface ProviderStage {
    PaymentMethodDetailsStage provider(EnumPaymentLinkProvider provider);
  }

  public interface PaymentMethodDetailsStage {
    PaymentMethodInformationStage paymentMethodDetails(
        ChargePaymentMethodDetails paymentMethodDetails);
  }

  public interface PaymentMethodInformationStage {
    _FinalStage paymentMethodInformation(PaymentMethodInformationPse paymentMethodInformation);
  }

  public interface _FinalStage {
    Charge build();

    _FinalStage createdBy(Optional<String> createdBy);

    _FinalStage createdBy(String createdBy);

    _FinalStage customer(Optional<String> customer);

    _FinalStage customer(String customer);

    _FinalStage failureCode(Optional<String> failureCode);

    _FinalStage failureCode(String failureCode);

    _FinalStage failureMessage(Optional<String> failureMessage);

    _FinalStage failureMessage(String failureMessage);

    _FinalStage amount(Optional<String> amount);

    _FinalStage amount(String amount);

    _FinalStage currency(Optional<EnumPaymentsCurrency> currency);

    _FinalStage currency(EnumPaymentsCurrency currency);

    _FinalStage description(Optional<String> description);

    _FinalStage description(String description);

    _FinalStage metadata(Map<String, Object> metadata);

    _FinalStage putAllMetadata(Map<String, Object> metadata);

    _FinalStage metadata(String key, Object value);

    _FinalStage paymentMethodType(Optional<EnumPaymentLinkAllowedPaymentMethod> paymentMethodType);

    _FinalStage paymentMethodType(EnumPaymentLinkAllowedPaymentMethod paymentMethodType);

    _FinalStage paymentIntent(Optional<String> paymentIntent);

    _FinalStage paymentIntent(String paymentIntent);

    _FinalStage transactions(Optional<List<PaymentTransaction>> transactions);

    _FinalStage transactions(List<PaymentTransaction> transactions);

    _FinalStage updatedAt(Optional<String> updatedAt);

    _FinalStage updatedAt(String updatedAt);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements IdStage, CreatedAtStage, StatusStage, BeneficiaryStage, ProviderStage, PaymentMethodDetailsStage, PaymentMethodInformationStage, _FinalStage {
    private String id;

    private String createdAt;

    private ChargeStatus status;

    private String beneficiary;

    private EnumPaymentLinkProvider provider;

    private ChargePaymentMethodDetails paymentMethodDetails;

    private PaymentMethodInformationPse paymentMethodInformation;

    private Optional<String> updatedAt = Optional.empty();

    private Optional<List<PaymentTransaction>> transactions = Optional.empty();

    private Optional<String> paymentIntent = Optional.empty();

    private Optional<EnumPaymentLinkAllowedPaymentMethod> paymentMethodType = Optional.empty();

    private Map<String, Object> metadata = new LinkedHashMap<>();

    private Optional<String> description = Optional.empty();

    private Optional<EnumPaymentsCurrency> currency = Optional.empty();

    private Optional<String> amount = Optional.empty();

    private Optional<String> failureMessage = Optional.empty();

    private Optional<String> failureCode = Optional.empty();

    private Optional<String> customer = Optional.empty();

    private Optional<String> createdBy = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(Charge other) {
      id(other.getId());
      createdAt(other.getCreatedAt());
      createdBy(other.getCreatedBy());
      customer(other.getCustomer());
      failureCode(other.getFailureCode());
      failureMessage(other.getFailureMessage());
      status(other.getStatus());
      amount(other.getAmount());
      currency(other.getCurrency());
      description(other.getDescription());
      metadata(other.getMetadata());
      beneficiary(other.getBeneficiary());
      provider(other.getProvider());
      paymentMethodType(other.getPaymentMethodType());
      paymentMethodDetails(other.getPaymentMethodDetails());
      paymentMethodInformation(other.getPaymentMethodInformation());
      paymentIntent(other.getPaymentIntent());
      transactions(other.getTransactions());
      updatedAt(other.getUpdatedAt());
      return this;
    }

    /**
     * <p>Belvo's unique ID for the current charge.</p>
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
    public StatusStage createdAt(String createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * <p>The current status of the charge.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("status")
    public BeneficiaryStage status(ChargeStatus status) {
      this.status = status;
      return this;
    }

    /**
     * <p>Belvo's unique ID used to identify the beneficiary’s bank account.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("beneficiary")
    public ProviderStage beneficiary(String beneficiary) {
      this.beneficiary = beneficiary;
      return this;
    }

    @Override
    @JsonSetter("provider")
    public PaymentMethodDetailsStage provider(EnumPaymentLinkProvider provider) {
      this.provider = provider;
      return this;
    }

    @Override
    @JsonSetter("payment_method_details")
    public PaymentMethodInformationStage paymentMethodDetails(
        ChargePaymentMethodDetails paymentMethodDetails) {
      this.paymentMethodDetails = paymentMethodDetails;
      return this;
    }

    @Override
    @JsonSetter("payment_method_information")
    public _FinalStage paymentMethodInformation(
        PaymentMethodInformationPse paymentMethodInformation) {
      this.paymentMethodInformation = paymentMethodInformation;
      return this;
    }

    /**
     * <p>The ISO-8601 timestamp of when the status of the charge was last updated.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage updatedAt(String updatedAt) {
      this.updatedAt = Optional.of(updatedAt);
      return this;
    }

    @Override
    @JsonSetter(
        value = "updated_at",
        nulls = Nulls.SKIP
    )
    public _FinalStage updatedAt(Optional<String> updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }

    /**
     * <p>An array of Transaction objects relating to the charge.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage transactions(List<PaymentTransaction> transactions) {
      this.transactions = Optional.of(transactions);
      return this;
    }

    @Override
    @JsonSetter(
        value = "transactions",
        nulls = Nulls.SKIP
    )
    public _FinalStage transactions(Optional<List<PaymentTransaction>> transactions) {
      this.transactions = transactions;
      return this;
    }

    /**
     * <p>The <code>payment_intent.id</code> associated with this charge.</p>
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
    public _FinalStage paymentMethodType(EnumPaymentLinkAllowedPaymentMethod paymentMethodType) {
      this.paymentMethodType = Optional.of(paymentMethodType);
      return this;
    }

    @Override
    @JsonSetter(
        value = "payment_method_type",
        nulls = Nulls.SKIP
    )
    public _FinalStage paymentMethodType(
        Optional<EnumPaymentLinkAllowedPaymentMethod> paymentMethodType) {
      this.paymentMethodType = paymentMethodType;
      return this;
    }

    /**
     * <p>Optional and customizable object where you can provide any additional key-value pairs for your internal purposes. For example, an internal reference number.</p>
     * <p>⚠️ <strong>Note</strong>: You can only provide up to 50 keys (keys can have up to 50 characters each and each value can be up to 500 characters). We do not support nested objects, only ASCII values.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage metadata(String key, Object value) {
      this.metadata.put(key, value);
      return this;
    }

    /**
     * <p>Optional and customizable object where you can provide any additional key-value pairs for your internal purposes. For example, an internal reference number.</p>
     * <p>⚠️ <strong>Note</strong>: You can only provide up to 50 keys (keys can have up to 50 characters each and each value can be up to 500 characters). We do not support nested objects, only ASCII values.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage putAllMetadata(Map<String, Object> metadata) {
      this.metadata.putAll(metadata);
      return this;
    }

    @Override
    @JsonSetter(
        value = "metadata",
        nulls = Nulls.SKIP
    )
    public _FinalStage metadata(Map<String, Object> metadata) {
      this.metadata.clear();
      this.metadata.putAll(metadata);
      return this;
    }

    /**
     * <p>The description of the payment.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage description(String description) {
      this.description = Optional.of(description);
      return this;
    }

    @Override
    @JsonSetter(
        value = "description",
        nulls = Nulls.SKIP
    )
    public _FinalStage description(Optional<String> description) {
      this.description = description;
      return this;
    }

    @Override
    public _FinalStage currency(EnumPaymentsCurrency currency) {
      this.currency = Optional.of(currency);
      return this;
    }

    @Override
    @JsonSetter(
        value = "currency",
        nulls = Nulls.SKIP
    )
    public _FinalStage currency(Optional<EnumPaymentsCurrency> currency) {
      this.currency = currency;
      return this;
    }

    /**
     * <p>The amount of the charge.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage amount(String amount) {
      this.amount = Optional.of(amount);
      return this;
    }

    @Override
    @JsonSetter(
        value = "amount",
        nulls = Nulls.SKIP
    )
    public _FinalStage amount(Optional<String> amount) {
      this.amount = amount;
      return this;
    }

    /**
     * <p>Further information regarding the <code>failure_code</code>.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage failureMessage(String failureMessage) {
      this.failureMessage = Optional.of(failureMessage);
      return this;
    }

    @Override
    @JsonSetter(
        value = "failure_message",
        nulls = Nulls.SKIP
    )
    public _FinalStage failureMessage(Optional<String> failureMessage) {
      this.failureMessage = failureMessage;
      return this;
    }

    /**
     * <p>Error code that explains the reason behind a payment being unsuccessful (if applicable).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage failureCode(String failureCode) {
      this.failureCode = Optional.of(failureCode);
      return this;
    }

    @Override
    @JsonSetter(
        value = "failure_code",
        nulls = Nulls.SKIP
    )
    public _FinalStage failureCode(Optional<String> failureCode) {
      this.failureCode = failureCode;
      return this;
    }

    /**
     * <p>Belvo's unique ID for the customer that the charge was created for.</p>
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
     * <p>Belvo's unique ID for the user that created the charge.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage createdBy(String createdBy) {
      this.createdBy = Optional.of(createdBy);
      return this;
    }

    @Override
    @JsonSetter(
        value = "created_by",
        nulls = Nulls.SKIP
    )
    public _FinalStage createdBy(Optional<String> createdBy) {
      this.createdBy = createdBy;
      return this;
    }

    @Override
    public Charge build() {
      return new Charge(id, createdAt, createdBy, customer, failureCode, failureMessage, status, amount, currency, description, metadata, beneficiary, provider, paymentMethodType, paymentMethodDetails, paymentMethodInformation, paymentIntent, transactions, updatedAt);
    }
  }
}
