package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = CreatePaymentLinkPse.Builder.class
)
public final class CreatePaymentLinkPse {
  private final CreatePaymentLinkPseAmount amount;

  private final String customer;

  private final String description;

  private final Optional<List<EnumPaymentLinkAllowedPaymentMethod>> allowedPaymentMethodTypes;

  private final EnumPaymentLinkProvider provider;

  private final PaymentMethodDetailsPse paymentMethodDetails;

  private final Optional<PaymentLinkCallbackUrls> callbackUrls;

  private final Optional<String> expiresIn;

  private int _cachedHashCode;

  CreatePaymentLinkPse(CreatePaymentLinkPseAmount amount, String customer, String description,
      Optional<List<EnumPaymentLinkAllowedPaymentMethod>> allowedPaymentMethodTypes,
      EnumPaymentLinkProvider provider, PaymentMethodDetailsPse paymentMethodDetails,
      Optional<PaymentLinkCallbackUrls> callbackUrls, Optional<String> expiresIn) {
    this.amount = amount;
    this.customer = customer;
    this.description = description;
    this.allowedPaymentMethodTypes = allowedPaymentMethodTypes;
    this.provider = provider;
    this.paymentMethodDetails = paymentMethodDetails;
    this.callbackUrls = callbackUrls;
    this.expiresIn = expiresIn;
  }

  /**
   * @return Amount to be paid by your customer. For PSE, you can only send whole numbers. For example: <code>350000</code>.
   * <p><strong>Note:</strong> You can send this value either as a string or an integer. Regardless of the type you choose to send the <code>amount</code> as, Belvo returns a string with two decimal points, separated by a period ( <code>.</code>). For example, <code>350000.00</code>.</p>
   */
  @JsonProperty("amount")
  public CreatePaymentLinkPseAmount getAmount() {
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
  public Optional<List<EnumPaymentLinkAllowedPaymentMethod>> getAllowedPaymentMethodTypes() {
    return allowedPaymentMethodTypes;
  }

  @JsonProperty("provider")
  public EnumPaymentLinkProvider getProvider() {
    return provider;
  }

  @JsonProperty("payment_method_details")
  public PaymentMethodDetailsPse getPaymentMethodDetails() {
    return paymentMethodDetails;
  }

  @JsonProperty("callback_urls")
  public Optional<PaymentLinkCallbackUrls> getCallbackUrls() {
    return callbackUrls;
  }

  /**
   * @return The payment link expiration time. It allows the following formats to be sent through:
   * <ul>
   * <li>whole number + <code>m</code> for x amount of minutes. For example: <code>15m</code> for 15 minutes.</li>
   * <li>whole number + <code>h</code> for x amount of hours. For example: <code>12h</code> for 12 hours.</li>
   * <li>whole number + <code>d</code> for x amount of days. For example: <code>30d</code> for 30 days.</li>
   * </ul>
   * <p>ℹ️ The minimum expiration time allowed for a payment link is <code>1m</code> (1 minute) and the maximum is <code>90d</code> (90 days).</p>
   */
  @JsonProperty("expires_in")
  public Optional<String> getExpiresIn() {
    return expiresIn;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof CreatePaymentLinkPse && equalTo((CreatePaymentLinkPse) other);
  }

  private boolean equalTo(CreatePaymentLinkPse other) {
    return amount.equals(other.amount) && customer.equals(other.customer) && description.equals(other.description) && allowedPaymentMethodTypes.equals(other.allowedPaymentMethodTypes) && provider.equals(other.provider) && paymentMethodDetails.equals(other.paymentMethodDetails) && callbackUrls.equals(other.callbackUrls) && expiresIn.equals(other.expiresIn);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.amount, this.customer, this.description, this.allowedPaymentMethodTypes, this.provider, this.paymentMethodDetails, this.callbackUrls, this.expiresIn);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "CreatePaymentLinkPse{" + "amount: " + amount + ", customer: " + customer + ", description: " + description + ", allowedPaymentMethodTypes: " + allowedPaymentMethodTypes + ", provider: " + provider + ", paymentMethodDetails: " + paymentMethodDetails + ", callbackUrls: " + callbackUrls + ", expiresIn: " + expiresIn + "}";
  }

  public static AmountStage builder() {
    return new Builder();
  }

  public interface AmountStage {
    CustomerStage amount(CreatePaymentLinkPseAmount amount);

    Builder from(CreatePaymentLinkPse other);
  }

  public interface CustomerStage {
    DescriptionStage customer(String customer);
  }

  public interface DescriptionStage {
    ProviderStage description(String description);
  }

  public interface ProviderStage {
    PaymentMethodDetailsStage provider(EnumPaymentLinkProvider provider);
  }

  public interface PaymentMethodDetailsStage {
    _FinalStage paymentMethodDetails(PaymentMethodDetailsPse paymentMethodDetails);
  }

  public interface _FinalStage {
    CreatePaymentLinkPse build();

    _FinalStage allowedPaymentMethodTypes(
        Optional<List<EnumPaymentLinkAllowedPaymentMethod>> allowedPaymentMethodTypes);

    _FinalStage allowedPaymentMethodTypes(
        List<EnumPaymentLinkAllowedPaymentMethod> allowedPaymentMethodTypes);

    _FinalStage callbackUrls(Optional<PaymentLinkCallbackUrls> callbackUrls);

    _FinalStage callbackUrls(PaymentLinkCallbackUrls callbackUrls);

    _FinalStage expiresIn(Optional<String> expiresIn);

    _FinalStage expiresIn(String expiresIn);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements AmountStage, CustomerStage, DescriptionStage, ProviderStage, PaymentMethodDetailsStage, _FinalStage {
    private CreatePaymentLinkPseAmount amount;

    private String customer;

    private String description;

    private EnumPaymentLinkProvider provider;

    private PaymentMethodDetailsPse paymentMethodDetails;

    private Optional<String> expiresIn = Optional.empty();

    private Optional<PaymentLinkCallbackUrls> callbackUrls = Optional.empty();

    private Optional<List<EnumPaymentLinkAllowedPaymentMethod>> allowedPaymentMethodTypes = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(CreatePaymentLinkPse other) {
      amount(other.getAmount());
      customer(other.getCustomer());
      description(other.getDescription());
      allowedPaymentMethodTypes(other.getAllowedPaymentMethodTypes());
      provider(other.getProvider());
      paymentMethodDetails(other.getPaymentMethodDetails());
      callbackUrls(other.getCallbackUrls());
      expiresIn(other.getExpiresIn());
      return this;
    }

    /**
     * <p>Amount to be paid by your customer. For PSE, you can only send whole numbers. For example: <code>350000</code>.</p>
     * <p><strong>Note:</strong> You can send this value either as a string or an integer. Regardless of the type you choose to send the <code>amount</code> as, Belvo returns a string with two decimal points, separated by a period ( <code>.</code>). For example, <code>350000.00</code>.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("amount")
    public CustomerStage amount(CreatePaymentLinkPseAmount amount) {
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
    public ProviderStage description(String description) {
      this.description = description;
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
    public _FinalStage paymentMethodDetails(PaymentMethodDetailsPse paymentMethodDetails) {
      this.paymentMethodDetails = paymentMethodDetails;
      return this;
    }

    /**
     * <p>The payment link expiration time. It allows the following formats to be sent through:</p>
     * <ul>
     * <li>whole number + <code>m</code> for x amount of minutes. For example: <code>15m</code> for 15 minutes.</li>
     * <li>whole number + <code>h</code> for x amount of hours. For example: <code>12h</code> for 12 hours.</li>
     * <li>whole number + <code>d</code> for x amount of days. For example: <code>30d</code> for 30 days.</li>
     * </ul>
     * <p>ℹ️ The minimum expiration time allowed for a payment link is <code>1m</code> (1 minute) and the maximum is <code>90d</code> (90 days).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage expiresIn(String expiresIn) {
      this.expiresIn = Optional.of(expiresIn);
      return this;
    }

    @Override
    @JsonSetter(
        value = "expires_in",
        nulls = Nulls.SKIP
    )
    public _FinalStage expiresIn(Optional<String> expiresIn) {
      this.expiresIn = expiresIn;
      return this;
    }

    @Override
    public _FinalStage callbackUrls(PaymentLinkCallbackUrls callbackUrls) {
      this.callbackUrls = Optional.of(callbackUrls);
      return this;
    }

    @Override
    @JsonSetter(
        value = "callback_urls",
        nulls = Nulls.SKIP
    )
    public _FinalStage callbackUrls(Optional<PaymentLinkCallbackUrls> callbackUrls) {
      this.callbackUrls = callbackUrls;
      return this;
    }

    /**
     * <p>A list of payment method types allowed in this payment intent. For PSE, this value must be set to <code>pse</code>.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage allowedPaymentMethodTypes(
        List<EnumPaymentLinkAllowedPaymentMethod> allowedPaymentMethodTypes) {
      this.allowedPaymentMethodTypes = Optional.of(allowedPaymentMethodTypes);
      return this;
    }

    @Override
    @JsonSetter(
        value = "allowed_payment_method_types",
        nulls = Nulls.SKIP
    )
    public _FinalStage allowedPaymentMethodTypes(
        Optional<List<EnumPaymentLinkAllowedPaymentMethod>> allowedPaymentMethodTypes) {
      this.allowedPaymentMethodTypes = allowedPaymentMethodTypes;
      return this;
    }

    @Override
    public CreatePaymentLinkPse build() {
      return new CreatePaymentLinkPse(amount, customer, description, allowedPaymentMethodTypes, provider, paymentMethodDetails, callbackUrls, expiresIn);
    }
  }
}
