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
    builder = PaymentLinksPaymentMethodDetailsBodyOfpi.Builder.class
)
public final class PaymentLinksPaymentMethodDetailsBodyOfpi {
  private final String beneficiaryBankAccount;

  private final Optional<String> callbackUrl;

  private int _cachedHashCode;

  PaymentLinksPaymentMethodDetailsBodyOfpi(String beneficiaryBankAccount,
      Optional<String> callbackUrl) {
    this.beneficiaryBankAccount = beneficiaryBankAccount;
    this.callbackUrl = callbackUrl;
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

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof PaymentLinksPaymentMethodDetailsBodyOfpi && equalTo((PaymentLinksPaymentMethodDetailsBodyOfpi) other);
  }

  private boolean equalTo(PaymentLinksPaymentMethodDetailsBodyOfpi other) {
    return beneficiaryBankAccount.equals(other.beneficiaryBankAccount) && callbackUrl.equals(other.callbackUrl);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.beneficiaryBankAccount, this.callbackUrl);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "PaymentLinksPaymentMethodDetailsBodyOfpi{" + "beneficiaryBankAccount: " + beneficiaryBankAccount + ", callbackUrl: " + callbackUrl + "}";
  }

  public static BeneficiaryBankAccountStage builder() {
    return new Builder();
  }

  public interface BeneficiaryBankAccountStage {
    _FinalStage beneficiaryBankAccount(String beneficiaryBankAccount);

    Builder from(PaymentLinksPaymentMethodDetailsBodyOfpi other);
  }

  public interface _FinalStage {
    PaymentLinksPaymentMethodDetailsBodyOfpi build();

    _FinalStage callbackUrl(Optional<String> callbackUrl);

    _FinalStage callbackUrl(String callbackUrl);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements BeneficiaryBankAccountStage, _FinalStage {
    private String beneficiaryBankAccount;

    private Optional<String> callbackUrl = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(PaymentLinksPaymentMethodDetailsBodyOfpi other) {
      beneficiaryBankAccount(other.getBeneficiaryBankAccount());
      callbackUrl(other.getCallbackUrl());
      return this;
    }

    /**
     * <p>Belvo's unique ID used to identify the beneficiary's bank account.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("beneficiary_bank_account")
    public _FinalStage beneficiaryBankAccount(String beneficiaryBankAccount) {
      this.beneficiaryBankAccount = beneficiaryBankAccount;
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
    public PaymentLinksPaymentMethodDetailsBodyOfpi build() {
      return new PaymentLinksPaymentMethodDetailsBodyOfpi(beneficiaryBankAccount, callbackUrl);
    }
  }
}
