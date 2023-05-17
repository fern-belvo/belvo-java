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
    builder = CreatePaymentIntentPse.Builder.class
)
public final class CreatePaymentIntentPse {
  private final CreatePaymentIntentPseAmount amount;

  private final String customer;

  private final String description;

  private final List<EnumPaymentLinkAllowedPaymentMethod> allowedPaymentMethodTypes;

  private final PaymentIntentsPaymentMethodDetailsPse paymentMethodDetails;

  private final EnumPaymentLinkProvider provider;

  private final Optional<Map<String, Object>> metadata;

  private int _cachedHashCode;

  CreatePaymentIntentPse(CreatePaymentIntentPseAmount amount, String customer, String description,
      List<EnumPaymentLinkAllowedPaymentMethod> allowedPaymentMethodTypes,
      PaymentIntentsPaymentMethodDetailsPse paymentMethodDetails, EnumPaymentLinkProvider provider,
      Optional<Map<String, Object>> metadata) {
    this.amount = amount;
    this.customer = customer;
    this.description = description;
    this.allowedPaymentMethodTypes = allowedPaymentMethodTypes;
    this.paymentMethodDetails = paymentMethodDetails;
    this.provider = provider;
    this.metadata = metadata;
  }

  /**
   * @return Amount to be paid by your customer. For PSE, you can only send whole numbers. For example: <code>350000</code>.
   * <p><strong>Note:</strong> You can send through this value either as a string or an integer. Regardless of the type you choose to send the <code>amount</code> as, Belvo returns a string with two decimal points, separated by a period ( <code>.</code>). For example, <code>350000.00</code>.</p>
   */
  @JsonProperty("amount")
  public CreatePaymentIntentPseAmount getAmount() {
    return amount;
  }

  /**
   * @return Belvo's unique ID to reference the customer.
   */
  @JsonProperty("customer")
  public String getCustomer() {
    return customer;
  }

  /**
   * @return The description of the payment.
   */
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * @return A list of payment method types allowed in this payment intent. For PSE, this value must be set to <code>pse</code>.
   */
  @JsonProperty("allowed_payment_method_types")
  public List<EnumPaymentLinkAllowedPaymentMethod> getAllowedPaymentMethodTypes() {
    return allowedPaymentMethodTypes;
  }

  @JsonProperty("payment_method_details")
  public PaymentIntentsPaymentMethodDetailsPse getPaymentMethodDetails() {
    return paymentMethodDetails;
  }

  @JsonProperty("provider")
  public EnumPaymentLinkProvider getProvider() {
    return provider;
  }

  /**
   * @return Optional and customizable object where you can provide any additional key-value pairs for your internal purposes. For example, an internal reference number for the payment intent.
   * <p>⚠️ <strong>Note</strong>: You can only provide up to 50 keys (keys can have up to 50 characters each and each value can be up to 500 characters). We do not support nested objects, only ASCII values.</p>
   */
  @JsonProperty("metadata")
  public Optional<Map<String, Object>> getMetadata() {
    return metadata;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof CreatePaymentIntentPse && equalTo((CreatePaymentIntentPse) other);
  }

  private boolean equalTo(CreatePaymentIntentPse other) {
    return amount.equals(other.amount) && customer.equals(other.customer) && description.equals(other.description) && allowedPaymentMethodTypes.equals(other.allowedPaymentMethodTypes) && paymentMethodDetails.equals(other.paymentMethodDetails) && provider.equals(other.provider) && metadata.equals(other.metadata);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.amount, this.customer, this.description, this.allowedPaymentMethodTypes, this.paymentMethodDetails, this.provider, this.metadata);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "CreatePaymentIntentPse{" + "amount: " + amount + ", customer: " + customer + ", description: " + description + ", allowedPaymentMethodTypes: " + allowedPaymentMethodTypes + ", paymentMethodDetails: " + paymentMethodDetails + ", provider: " + provider + ", metadata: " + metadata + "}";
  }

  public static AmountStage builder() {
    return new Builder();
  }

  public interface AmountStage {
    CustomerStage amount(CreatePaymentIntentPseAmount amount);

    Builder from(CreatePaymentIntentPse other);
  }

  public interface CustomerStage {
    DescriptionStage customer(String customer);
  }

  public interface DescriptionStage {
    PaymentMethodDetailsStage description(String description);
  }

  public interface PaymentMethodDetailsStage {
    ProviderStage paymentMethodDetails(PaymentIntentsPaymentMethodDetailsPse paymentMethodDetails);
  }

  public interface ProviderStage {
    _FinalStage provider(EnumPaymentLinkProvider provider);
  }

  public interface _FinalStage {
    CreatePaymentIntentPse build();

    _FinalStage allowedPaymentMethodTypes(
        List<EnumPaymentLinkAllowedPaymentMethod> allowedPaymentMethodTypes);

    _FinalStage addAllowedPaymentMethodTypes(
        EnumPaymentLinkAllowedPaymentMethod allowedPaymentMethodTypes);

    _FinalStage addAllAllowedPaymentMethodTypes(
        List<EnumPaymentLinkAllowedPaymentMethod> allowedPaymentMethodTypes);

    _FinalStage metadata(Optional<Map<String, Object>> metadata);

    _FinalStage metadata(Map<String, Object> metadata);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements AmountStage, CustomerStage, DescriptionStage, PaymentMethodDetailsStage, ProviderStage, _FinalStage {
    private CreatePaymentIntentPseAmount amount;

    private String customer;

    private String description;

    private PaymentIntentsPaymentMethodDetailsPse paymentMethodDetails;

    private EnumPaymentLinkProvider provider;

    private Optional<Map<String, Object>> metadata = Optional.empty();

    private List<EnumPaymentLinkAllowedPaymentMethod> allowedPaymentMethodTypes = new ArrayList<>();

    private Builder() {
    }

    @Override
    public Builder from(CreatePaymentIntentPse other) {
      amount(other.getAmount());
      customer(other.getCustomer());
      description(other.getDescription());
      allowedPaymentMethodTypes(other.getAllowedPaymentMethodTypes());
      paymentMethodDetails(other.getPaymentMethodDetails());
      provider(other.getProvider());
      metadata(other.getMetadata());
      return this;
    }

    /**
     * <p>Amount to be paid by your customer. For PSE, you can only send whole numbers. For example: <code>350000</code>.</p>
     * <p><strong>Note:</strong> You can send through this value either as a string or an integer. Regardless of the type you choose to send the <code>amount</code> as, Belvo returns a string with two decimal points, separated by a period ( <code>.</code>). For example, <code>350000.00</code>.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("amount")
    public CustomerStage amount(CreatePaymentIntentPseAmount amount) {
      this.amount = amount;
      return this;
    }

    /**
     * <p>Belvo's unique ID to reference the customer.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("customer")
    public DescriptionStage customer(String customer) {
      this.customer = customer;
      return this;
    }

    /**
     * <p>The description of the payment.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("description")
    public PaymentMethodDetailsStage description(String description) {
      this.description = description;
      return this;
    }

    @Override
    @JsonSetter("payment_method_details")
    public ProviderStage paymentMethodDetails(
        PaymentIntentsPaymentMethodDetailsPse paymentMethodDetails) {
      this.paymentMethodDetails = paymentMethodDetails;
      return this;
    }

    @Override
    @JsonSetter("provider")
    public _FinalStage provider(EnumPaymentLinkProvider provider) {
      this.provider = provider;
      return this;
    }

    /**
     * <p>Optional and customizable object where you can provide any additional key-value pairs for your internal purposes. For example, an internal reference number for the payment intent.</p>
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
     * <p>A list of payment method types allowed in this payment intent. For PSE, this value must be set to <code>pse</code>.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage addAllAllowedPaymentMethodTypes(
        List<EnumPaymentLinkAllowedPaymentMethod> allowedPaymentMethodTypes) {
      this.allowedPaymentMethodTypes.addAll(allowedPaymentMethodTypes);
      return this;
    }

    /**
     * <p>A list of payment method types allowed in this payment intent. For PSE, this value must be set to <code>pse</code>.</p>
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
    public CreatePaymentIntentPse build() {
      return new CreatePaymentIntentPse(amount, customer, description, allowedPaymentMethodTypes, paymentMethodDetails, provider, metadata);
    }
  }
}
