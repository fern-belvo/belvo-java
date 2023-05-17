package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = PaymentIntentPse.Builder.class
)
public final class PaymentIntentPse {
  private final String id;

  private final String createdAt;

  private final String createdBy;

  private final String customer;

  private final List<EnumPaymentLinkAllowedPaymentMethod> allowedPaymentMethodTypes;

  private final String amount;

  private final EnumPaymentsCurrency currency;

  private final String description;

  private final Optional<String> failureCode;

  private final Optional<String> failureMessage;

  private final Optional<Map<String, Object>> metadata;

  private final PaymentIntentPseNextStep nextStep;

  private final PaymentIntentPseLastError lastError;

  private final PaymentIntentPaymentMethodDetailsPse paymentMethodDetails;

  private final PaymentMethodInformationPse paymentMethodInformation;

  private final Optional<List<Charge>> charges;

  private final EnumPaymentLinkProvider provider;

  private final EnumPaymentLinkAllowedPaymentMethod selectedPaymentMethodType;

  private final EnumPaymentIntentStatus status;

  private final Optional<String> updatedAt;

  private int _cachedHashCode;

  PaymentIntentPse(String id, String createdAt, String createdBy, String customer,
      List<EnumPaymentLinkAllowedPaymentMethod> allowedPaymentMethodTypes, String amount,
      EnumPaymentsCurrency currency, String description, Optional<String> failureCode,
      Optional<String> failureMessage, Optional<Map<String, Object>> metadata,
      PaymentIntentPseNextStep nextStep, PaymentIntentPseLastError lastError,
      PaymentIntentPaymentMethodDetailsPse paymentMethodDetails,
      PaymentMethodInformationPse paymentMethodInformation, Optional<List<Charge>> charges,
      EnumPaymentLinkProvider provider,
      EnumPaymentLinkAllowedPaymentMethod selectedPaymentMethodType, EnumPaymentIntentStatus status,
      Optional<String> updatedAt) {
    this.id = id;
    this.createdAt = createdAt;
    this.createdBy = createdBy;
    this.customer = customer;
    this.allowedPaymentMethodTypes = allowedPaymentMethodTypes;
    this.amount = amount;
    this.currency = currency;
    this.description = description;
    this.failureCode = failureCode;
    this.failureMessage = failureMessage;
    this.metadata = metadata;
    this.nextStep = nextStep;
    this.lastError = lastError;
    this.paymentMethodDetails = paymentMethodDetails;
    this.paymentMethodInformation = paymentMethodInformation;
    this.charges = charges;
    this.provider = provider;
    this.selectedPaymentMethodType = selectedPaymentMethodType;
    this.status = status;
    this.updatedAt = updatedAt;
  }

  /**
   * @return Belvo's unique ID for the current payment intent.
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
   * @return Belvo's unique ID for the user that created this payment intent.
   */
  @JsonProperty("created_by")
  public String getCreatedBy() {
    return createdBy;
  }

  /**
   * @return Belvo's unique ID for the customer related to this payment intent.
   */
  @JsonProperty("customer")
  public String getCustomer() {
    return customer;
  }

  /**
   * @return A list of payment method types allowed in this payment intent. For PSE, the value will be <code>pse</code>.
   */
  @JsonProperty("allowed_payment_method_types")
  public List<EnumPaymentLinkAllowedPaymentMethod> getAllowedPaymentMethodTypes() {
    return allowedPaymentMethodTypes;
  }

  /**
   * @return Amount to be paid by your customer.
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
   * @return Optional and customizable object where you can provide any additional key-value pairs for your internal purposes. For example, an internal reference number.
   * <p>⚠️ <strong>Note</strong>: You can only provide up to 50 keys (keys can have up to 50 characters each and each value can be up to 500 characters). We do not support nested objects, only ASCII values.</p>
   */
  @JsonProperty("metadata")
  public Optional<Map<String, Object>> getMetadata() {
    return metadata;
  }

  @JsonProperty("next_step")
  public PaymentIntentPseNextStep getNextStep() {
    return nextStep;
  }

  @JsonProperty("last_error")
  public PaymentIntentPseLastError getLastError() {
    return lastError;
  }

  @JsonProperty("payment_method_details")
  public PaymentIntentPaymentMethodDetailsPse getPaymentMethodDetails() {
    return paymentMethodDetails;
  }

  @JsonProperty("payment_method_information")
  public PaymentMethodInformationPse getPaymentMethodInformation() {
    return paymentMethodInformation;
  }

  /**
   * @return An array of charge objects related to this paymnet intent. If no charges are associated, we return an empty array.
   * <p><strong>Note</strong>: The charges resource will be deprecated and removed from our API by end of Q1 2023. We recommend not using any data from this resource.</p>
   */
  @JsonProperty("charges")
  public Optional<List<Charge>> getCharges() {
    return charges;
  }

  @JsonProperty("provider")
  public EnumPaymentLinkProvider getProvider() {
    return provider;
  }

  @JsonProperty("selected_payment_method_type")
  public EnumPaymentLinkAllowedPaymentMethod getSelectedPaymentMethodType() {
    return selectedPaymentMethodType;
  }

  @JsonProperty("status")
  public EnumPaymentIntentStatus getStatus() {
    return status;
  }

  /**
   * @return The ISO-8601 timestamp of when the payment intent was last updated.
   */
  @JsonProperty("updated_at")
  public Optional<String> getUpdatedAt() {
    return updatedAt;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof PaymentIntentPse && equalTo((PaymentIntentPse) other);
  }

  private boolean equalTo(PaymentIntentPse other) {
    return id.equals(other.id) && createdAt.equals(other.createdAt) && createdBy.equals(other.createdBy) && customer.equals(other.customer) && allowedPaymentMethodTypes.equals(other.allowedPaymentMethodTypes) && amount.equals(other.amount) && currency.equals(other.currency) && description.equals(other.description) && failureCode.equals(other.failureCode) && failureMessage.equals(other.failureMessage) && metadata.equals(other.metadata) && nextStep.equals(other.nextStep) && lastError.equals(other.lastError) && paymentMethodDetails.equals(other.paymentMethodDetails) && paymentMethodInformation.equals(other.paymentMethodInformation) && charges.equals(other.charges) && provider.equals(other.provider) && selectedPaymentMethodType.equals(other.selectedPaymentMethodType) && status.equals(other.status) && updatedAt.equals(other.updatedAt);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.id, this.createdAt, this.createdBy, this.customer, this.allowedPaymentMethodTypes, this.amount, this.currency, this.description, this.failureCode, this.failureMessage, this.metadata, this.nextStep, this.lastError, this.paymentMethodDetails, this.paymentMethodInformation, this.charges, this.provider, this.selectedPaymentMethodType, this.status, this.updatedAt);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "PaymentIntentPse{" + "id: " + id + ", createdAt: " + createdAt + ", createdBy: " + createdBy + ", customer: " + customer + ", allowedPaymentMethodTypes: " + allowedPaymentMethodTypes + ", amount: " + amount + ", currency: " + currency + ", description: " + description + ", failureCode: " + failureCode + ", failureMessage: " + failureMessage + ", metadata: " + metadata + ", nextStep: " + nextStep + ", lastError: " + lastError + ", paymentMethodDetails: " + paymentMethodDetails + ", paymentMethodInformation: " + paymentMethodInformation + ", charges: " + charges + ", provider: " + provider + ", selectedPaymentMethodType: " + selectedPaymentMethodType + ", status: " + status + ", updatedAt: " + updatedAt + "}";
  }

  public static IdStage builder() {
    return new Builder();
  }

  public interface IdStage {
    CreatedAtStage id(String id);

    Builder from(PaymentIntentPse other);
  }

  public interface CreatedAtStage {
    CreatedByStage createdAt(String createdAt);
  }

  public interface CreatedByStage {
    CustomerStage createdBy(String createdBy);
  }

  public interface CustomerStage {
    AmountStage customer(String customer);
  }

  public interface AmountStage {
    CurrencyStage amount(String amount);
  }

  public interface CurrencyStage {
    DescriptionStage currency(EnumPaymentsCurrency currency);
  }

  public interface DescriptionStage {
    NextStepStage description(String description);
  }

  public interface NextStepStage {
    LastErrorStage nextStep(PaymentIntentPseNextStep nextStep);
  }

  public interface LastErrorStage {
    PaymentMethodDetailsStage lastError(PaymentIntentPseLastError lastError);
  }

  public interface PaymentMethodDetailsStage {
    PaymentMethodInformationStage paymentMethodDetails(
        PaymentIntentPaymentMethodDetailsPse paymentMethodDetails);
  }

  public interface PaymentMethodInformationStage {
    ProviderStage paymentMethodInformation(PaymentMethodInformationPse paymentMethodInformation);
  }

  public interface ProviderStage {
    SelectedPaymentMethodTypeStage provider(EnumPaymentLinkProvider provider);
  }

  public interface SelectedPaymentMethodTypeStage {
    StatusStage selectedPaymentMethodType(
        EnumPaymentLinkAllowedPaymentMethod selectedPaymentMethodType);
  }

  public interface StatusStage {
    _FinalStage status(EnumPaymentIntentStatus status);
  }

  public interface _FinalStage {
    PaymentIntentPse build();

    _FinalStage allowedPaymentMethodTypes(
        List<EnumPaymentLinkAllowedPaymentMethod> allowedPaymentMethodTypes);

    _FinalStage addAllowedPaymentMethodTypes(
        EnumPaymentLinkAllowedPaymentMethod allowedPaymentMethodTypes);

    _FinalStage addAllAllowedPaymentMethodTypes(
        List<EnumPaymentLinkAllowedPaymentMethod> allowedPaymentMethodTypes);

    _FinalStage failureCode(Optional<String> failureCode);

    _FinalStage failureCode(String failureCode);

    _FinalStage failureMessage(Optional<String> failureMessage);

    _FinalStage failureMessage(String failureMessage);

    _FinalStage metadata(Optional<Map<String, Object>> metadata);

    _FinalStage metadata(Map<String, Object> metadata);

    _FinalStage charges(Optional<List<Charge>> charges);

    _FinalStage charges(List<Charge> charges);

    _FinalStage updatedAt(Optional<String> updatedAt);

    _FinalStage updatedAt(String updatedAt);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements IdStage, CreatedAtStage, CreatedByStage, CustomerStage, AmountStage, CurrencyStage, DescriptionStage, NextStepStage, LastErrorStage, PaymentMethodDetailsStage, PaymentMethodInformationStage, ProviderStage, SelectedPaymentMethodTypeStage, StatusStage, _FinalStage {
    private String id;

    private String createdAt;

    private String createdBy;

    private String customer;

    private String amount;

    private EnumPaymentsCurrency currency;

    private String description;

    private PaymentIntentPseNextStep nextStep;

    private PaymentIntentPseLastError lastError;

    private PaymentIntentPaymentMethodDetailsPse paymentMethodDetails;

    private PaymentMethodInformationPse paymentMethodInformation;

    private EnumPaymentLinkProvider provider;

    private EnumPaymentLinkAllowedPaymentMethod selectedPaymentMethodType;

    private EnumPaymentIntentStatus status;

    private Optional<String> updatedAt = Optional.empty();

    private Optional<List<Charge>> charges = Optional.empty();

    private Optional<Map<String, Object>> metadata = Optional.empty();

    private Optional<String> failureMessage = Optional.empty();

    private Optional<String> failureCode = Optional.empty();

    private List<EnumPaymentLinkAllowedPaymentMethod> allowedPaymentMethodTypes = new ArrayList<>();

    private Builder() {
    }

    @Override
    public Builder from(PaymentIntentPse other) {
      id(other.getId());
      createdAt(other.getCreatedAt());
      createdBy(other.getCreatedBy());
      customer(other.getCustomer());
      allowedPaymentMethodTypes(other.getAllowedPaymentMethodTypes());
      amount(other.getAmount());
      currency(other.getCurrency());
      description(other.getDescription());
      failureCode(other.getFailureCode());
      failureMessage(other.getFailureMessage());
      metadata(other.getMetadata());
      nextStep(other.getNextStep());
      lastError(other.getLastError());
      paymentMethodDetails(other.getPaymentMethodDetails());
      paymentMethodInformation(other.getPaymentMethodInformation());
      charges(other.getCharges());
      provider(other.getProvider());
      selectedPaymentMethodType(other.getSelectedPaymentMethodType());
      status(other.getStatus());
      updatedAt(other.getUpdatedAt());
      return this;
    }

    /**
     * <p>Belvo's unique ID for the current payment intent.</p>
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
     * <p>Belvo's unique ID for the user that created this payment intent.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("created_by")
    public CustomerStage createdBy(String createdBy) {
      this.createdBy = createdBy;
      return this;
    }

    /**
     * <p>Belvo's unique ID for the customer related to this payment intent.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("customer")
    public AmountStage customer(String customer) {
      this.customer = customer;
      return this;
    }

    /**
     * <p>Amount to be paid by your customer.</p>
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
    public NextStepStage description(String description) {
      this.description = description;
      return this;
    }

    @Override
    @JsonSetter("next_step")
    public LastErrorStage nextStep(PaymentIntentPseNextStep nextStep) {
      this.nextStep = nextStep;
      return this;
    }

    @Override
    @JsonSetter("last_error")
    public PaymentMethodDetailsStage lastError(PaymentIntentPseLastError lastError) {
      this.lastError = lastError;
      return this;
    }

    @Override
    @JsonSetter("payment_method_details")
    public PaymentMethodInformationStage paymentMethodDetails(
        PaymentIntentPaymentMethodDetailsPse paymentMethodDetails) {
      this.paymentMethodDetails = paymentMethodDetails;
      return this;
    }

    @Override
    @JsonSetter("payment_method_information")
    public ProviderStage paymentMethodInformation(
        PaymentMethodInformationPse paymentMethodInformation) {
      this.paymentMethodInformation = paymentMethodInformation;
      return this;
    }

    @Override
    @JsonSetter("provider")
    public SelectedPaymentMethodTypeStage provider(EnumPaymentLinkProvider provider) {
      this.provider = provider;
      return this;
    }

    @Override
    @JsonSetter("selected_payment_method_type")
    public StatusStage selectedPaymentMethodType(
        EnumPaymentLinkAllowedPaymentMethod selectedPaymentMethodType) {
      this.selectedPaymentMethodType = selectedPaymentMethodType;
      return this;
    }

    @Override
    @JsonSetter("status")
    public _FinalStage status(EnumPaymentIntentStatus status) {
      this.status = status;
      return this;
    }

    /**
     * <p>The ISO-8601 timestamp of when the payment intent was last updated.</p>
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
     * <p>An array of charge objects related to this paymnet intent. If no charges are associated, we return an empty array.</p>
     * <p><strong>Note</strong>: The charges resource will be deprecated and removed from our API by end of Q1 2023. We recommend not using any data from this resource.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage charges(List<Charge> charges) {
      this.charges = Optional.of(charges);
      return this;
    }

    @Override
    @JsonSetter(
        value = "charges",
        nulls = Nulls.SKIP
    )
    public _FinalStage charges(Optional<List<Charge>> charges) {
      this.charges = charges;
      return this;
    }

    /**
     * <p>Optional and customizable object where you can provide any additional key-value pairs for your internal purposes. For example, an internal reference number.</p>
     * <p>⚠️ <strong>Note</strong>: You can only provide up to 50 keys (keys can have up to 50 characters each and each value can be up to 500 characters). We do not support nested objects, only ASCII values.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage metadata(Map<String, Object> metadata) {
      this.metadata = Optional.of(metadata);
      return this;
    }

    @Override
    @JsonSetter(
        value = "metadata",
        nulls = Nulls.SKIP
    )
    public _FinalStage metadata(Optional<Map<String, Object>> metadata) {
      this.metadata = metadata;
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
     * <p>A list of payment method types allowed in this payment intent. For PSE, the value will be <code>pse</code>.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage addAllAllowedPaymentMethodTypes(
        List<EnumPaymentLinkAllowedPaymentMethod> allowedPaymentMethodTypes) {
      this.allowedPaymentMethodTypes.addAll(allowedPaymentMethodTypes);
      return this;
    }

    /**
     * <p>A list of payment method types allowed in this payment intent. For PSE, the value will be <code>pse</code>.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage addAllowedPaymentMethodTypes(
        EnumPaymentLinkAllowedPaymentMethod allowedPaymentMethodTypes) {
      this.allowedPaymentMethodTypes.add(allowedPaymentMethodTypes);
      return this;
    }

    @Override
    @JsonSetter(
        value = "allowed_payment_method_types",
        nulls = Nulls.SKIP
    )
    public _FinalStage allowedPaymentMethodTypes(
        List<EnumPaymentLinkAllowedPaymentMethod> allowedPaymentMethodTypes) {
      this.allowedPaymentMethodTypes.clear();
      this.allowedPaymentMethodTypes.addAll(allowedPaymentMethodTypes);
      return this;
    }

    @Override
    public PaymentIntentPse build() {
      return new PaymentIntentPse(id, createdAt, createdBy, customer, allowedPaymentMethodTypes, amount, currency, description, failureCode, failureMessage, metadata, nextStep, lastError, paymentMethodDetails, paymentMethodInformation, charges, provider, selectedPaymentMethodType, status, updatedAt);
    }
  }
}
