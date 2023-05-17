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
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = CreatePaymentLinkOfpi.Builder.class
)
public final class CreatePaymentLinkOfpi {
  private final CreatePaymentLinkOfpiAmount amount;

  private final String customer;

  private final String description;

  private final List<EnumPaymentLinkAllowedPaymentMethod> allowedPaymentMethodTypes;

  private final EnumPaymentLinkProvider provider;

  private final PaymentMethodDetailsOfpi paymentMethodDetails;

  private final Optional<PaymentLinkCallbackUrls> callbackUrls;

  private final Optional<String> expiresIn;

  private int _cachedHashCode;

  CreatePaymentLinkOfpi(CreatePaymentLinkOfpiAmount amount, String customer, String description,
      List<EnumPaymentLinkAllowedPaymentMethod> allowedPaymentMethodTypes,
      EnumPaymentLinkProvider provider, PaymentMethodDetailsOfpi paymentMethodDetails,
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
   * @return Amount to be paid by your customer. For OFPI, you can send through numbers with up to two decimal points, separated by a <code>.</code> period. For example: <code>1234.12</code>
   * <p><strong>Note:</strong> You can send through this value either as a string or an float. Regardless of the type you choose to send the <code>amount</code> as, Belvo returns a string with two decimal points, separated by a period ( <code>.</code>). For example, <code>1234.12</code>.</p>
   */
  @JsonProperty("amount")
  public CreatePaymentLinkOfpiAmount getAmount() {
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
   * @return A list of payment method types allowed in this payment intent. For OFPI, this value must be set to <code>open_finance</code>.
   */
  @JsonProperty("allowed_payment_method_types")
  public List<EnumPaymentLinkAllowedPaymentMethod> getAllowedPaymentMethodTypes() {
    return allowedPaymentMethodTypes;
  }

  @JsonProperty("provider")
  public EnumPaymentLinkProvider getProvider() {
    return provider;
  }

  @JsonProperty("payment_method_details")
  public PaymentMethodDetailsOfpi getPaymentMethodDetails() {
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
    return other instanceof CreatePaymentLinkOfpi && equalTo((CreatePaymentLinkOfpi) other);
  }

  private boolean equalTo(CreatePaymentLinkOfpi other) {
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
    return "CreatePaymentLinkOfpi{" + "amount: " + amount + ", customer: " + customer + ", description: " + description + ", allowedPaymentMethodTypes: " + allowedPaymentMethodTypes + ", provider: " + provider + ", paymentMethodDetails: " + paymentMethodDetails + ", callbackUrls: " + callbackUrls + ", expiresIn: " + expiresIn + "}";
  }

  public static AmountStage builder() {
    return new Builder();
  }

  public interface AmountStage {
    CustomerStage amount(CreatePaymentLinkOfpiAmount amount);

    Builder from(CreatePaymentLinkOfpi other);
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
    _FinalStage paymentMethodDetails(PaymentMethodDetailsOfpi paymentMethodDetails);
  }

  public interface _FinalStage {
    CreatePaymentLinkOfpi build();

    _FinalStage allowedPaymentMethodTypes(
        List<EnumPaymentLinkAllowedPaymentMethod> allowedPaymentMethodTypes);

    _FinalStage addAllowedPaymentMethodTypes(
        EnumPaymentLinkAllowedPaymentMethod allowedPaymentMethodTypes);

    _FinalStage addAllAllowedPaymentMethodTypes(
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
    private CreatePaymentLinkOfpiAmount amount;

    private String customer;

    private String description;

    private EnumPaymentLinkProvider provider;

    private PaymentMethodDetailsOfpi paymentMethodDetails;

    private Optional<String> expiresIn = Optional.empty();

    private Optional<PaymentLinkCallbackUrls> callbackUrls = Optional.empty();

    private List<EnumPaymentLinkAllowedPaymentMethod> allowedPaymentMethodTypes = new ArrayList<>();

    private Builder() {
    }

    @Override
    public Builder from(CreatePaymentLinkOfpi other) {
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
     * <p>Amount to be paid by your customer. For OFPI, you can send through numbers with up to two decimal points, separated by a <code>.</code> period. For example: <code>1234.12</code></p>
     * <p><strong>Note:</strong> You can send through this value either as a string or an float. Regardless of the type you choose to send the <code>amount</code> as, Belvo returns a string with two decimal points, separated by a period ( <code>.</code>). For example, <code>1234.12</code>.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("amount")
    public CustomerStage amount(CreatePaymentLinkOfpiAmount amount) {
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
    public _FinalStage paymentMethodDetails(PaymentMethodDetailsOfpi paymentMethodDetails) {
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
     * <p>A list of payment method types allowed in this payment intent. For OFPI, this value must be set to <code>open_finance</code>.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage addAllAllowedPaymentMethodTypes(
        List<EnumPaymentLinkAllowedPaymentMethod> allowedPaymentMethodTypes) {
      this.allowedPaymentMethodTypes.addAll(allowedPaymentMethodTypes);
      return this;
    }

    /**
     * <p>A list of payment method types allowed in this payment intent. For OFPI, this value must be set to <code>open_finance</code>.</p>
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
    public CreatePaymentLinkOfpi build() {
      return new CreatePaymentLinkOfpi(amount, customer, description, allowedPaymentMethodTypes, provider, paymentMethodDetails, callbackUrls, expiresIn);
    }
  }
}
