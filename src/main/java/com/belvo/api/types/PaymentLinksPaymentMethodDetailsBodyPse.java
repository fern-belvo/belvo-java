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
    builder = PaymentLinksPaymentMethodDetailsBodyPse.Builder.class
)
public final class PaymentLinksPaymentMethodDetailsBodyPse {
  private final String beneficiaryBankAccount;

  private final Optional<String> callbackUrl;

  private final boolean belvoFlow;

  private int _cachedHashCode;

  PaymentLinksPaymentMethodDetailsBodyPse(String beneficiaryBankAccount,
      Optional<String> callbackUrl, boolean belvoFlow) {
    this.beneficiaryBankAccount = beneficiaryBankAccount;
    this.callbackUrl = callbackUrl;
    this.belvoFlow = belvoFlow;
  }

  /**
   * @return Belvo's unique ID used to identify the beneficiary's bank account.
   */
  @JsonProperty("beneficiary_bank_account")
  public String getBeneficiaryBankAccount() {
    return beneficiaryBankAccount;
  }

  /**
   * @return The URL to your application that your customer will be directed to once they confirm the payment in their bank application.
   */
  @JsonProperty("callback_url")
  public Optional<String> getCallbackUrl() {
    return callbackUrl;
  }

  /**
   * @return This parameter determines the payment flow of the payment intent. By default, this is set to <code>true</code> and the payment intent created is processed using the Belvo's payment flow and Belvo-integrated institutions. When set to <code>false</code>, the payment intent process uses institutions not integrated into Belvo's flow.
   */
  @JsonProperty("belvo_flow")
  public boolean getBelvoFlow() {
    return belvoFlow;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof PaymentLinksPaymentMethodDetailsBodyPse && equalTo((PaymentLinksPaymentMethodDetailsBodyPse) other);
  }

  private boolean equalTo(PaymentLinksPaymentMethodDetailsBodyPse other) {
    return beneficiaryBankAccount.equals(other.beneficiaryBankAccount) && callbackUrl.equals(other.callbackUrl) && belvoFlow == other.belvoFlow;
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.beneficiaryBankAccount, this.callbackUrl, this.belvoFlow);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "PaymentLinksPaymentMethodDetailsBodyPse{" + "beneficiaryBankAccount: " + beneficiaryBankAccount + ", callbackUrl: " + callbackUrl + ", belvoFlow: " + belvoFlow + "}";
  }

  public static BeneficiaryBankAccountStage builder() {
    return new Builder();
  }

  public interface BeneficiaryBankAccountStage {
    BelvoFlowStage beneficiaryBankAccount(String beneficiaryBankAccount);

    Builder from(PaymentLinksPaymentMethodDetailsBodyPse other);
  }

  public interface BelvoFlowStage {
    _FinalStage belvoFlow(boolean belvoFlow);
  }

  public interface _FinalStage {
    PaymentLinksPaymentMethodDetailsBodyPse build();

    _FinalStage callbackUrl(Optional<String> callbackUrl);

    _FinalStage callbackUrl(String callbackUrl);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements BeneficiaryBankAccountStage, BelvoFlowStage, _FinalStage {
    private String beneficiaryBankAccount;

    private boolean belvoFlow;

    private Optional<String> callbackUrl = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(PaymentLinksPaymentMethodDetailsBodyPse other) {
      beneficiaryBankAccount(other.getBeneficiaryBankAccount());
      callbackUrl(other.getCallbackUrl());
      belvoFlow(other.getBelvoFlow());
      return this;
    }

    /**
     * <p>Belvo's unique ID used to identify the beneficiary's bank account.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("beneficiary_bank_account")
    public BelvoFlowStage beneficiaryBankAccount(String beneficiaryBankAccount) {
      this.beneficiaryBankAccount = beneficiaryBankAccount;
      return this;
    }

    /**
     * <p>This parameter determines the payment flow of the payment intent. By default, this is set to <code>true</code> and the payment intent created is processed using the Belvo's payment flow and Belvo-integrated institutions. When set to <code>false</code>, the payment intent process uses institutions not integrated into Belvo's flow.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("belvo_flow")
    public _FinalStage belvoFlow(boolean belvoFlow) {
      this.belvoFlow = belvoFlow;
      return this;
    }

    /**
     * <p>The URL to your application that your customer will be directed to once they confirm the payment in their bank application.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage callbackUrl(String callbackUrl) {
      this.callbackUrl = Optional.of(callbackUrl);
      return this;
    }

    @Override
    @JsonSetter(
        value = "callback_url",
        nulls = Nulls.SKIP
    )
    public _FinalStage callbackUrl(Optional<String> callbackUrl) {
      this.callbackUrl = callbackUrl;
      return this;
    }

    @Override
    public PaymentLinksPaymentMethodDetailsBodyPse build() {
      return new PaymentLinksPaymentMethodDetailsBodyPse(beneficiaryBankAccount, callbackUrl, belvoFlow);
    }
  }
}
