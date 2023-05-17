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
    builder = PaymentIntentPaymentMethodDetailsBodyBusinessOfpi.Builder.class
)
public final class PaymentIntentPaymentMethodDetailsBodyBusinessOfpi {
  private final String beneficiaryBankAccount;

  private final String payerInstitution;

  private final String callbackUrl;

  private final Optional<String> cpf;

  private int _cachedHashCode;

  PaymentIntentPaymentMethodDetailsBodyBusinessOfpi(String beneficiaryBankAccount,
      String payerInstitution, String callbackUrl, Optional<String> cpf) {
    this.beneficiaryBankAccount = beneficiaryBankAccount;
    this.payerInstitution = payerInstitution;
    this.callbackUrl = callbackUrl;
    this.cpf = cpf;
  }

  /**
   * @return Belvo's unique ID used to identify the beneficiary's bank account.
   */
  @JsonProperty("beneficiary_bank_account")
  public String getBeneficiaryBankAccount() {
    return beneficiaryBankAccount;
  }

  /**
   * @return Belvo's unique ID to reference the payer's institution.
   */
  @JsonProperty("payer_institution")
  public String getPayerInstitution() {
    return payerInstitution;
  }

  /**
   * @return The callback URL that your user will be redirected to after confirming the payment in their banking application.
   */
  @JsonProperty("callback_url")
  public String getCallbackUrl() {
    return callbackUrl;
  }

  /**
   * @return The customer's CPF number. Only required when the <code>customer_type</code> is <code>BUSINESS</code>.
   * <p><strong>Note:</strong> This value is obfuscated.</p>
   */
  @JsonProperty("cpf")
  public Optional<String> getCpf() {
    return cpf;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof PaymentIntentPaymentMethodDetailsBodyBusinessOfpi && equalTo((PaymentIntentPaymentMethodDetailsBodyBusinessOfpi) other);
  }

  private boolean equalTo(PaymentIntentPaymentMethodDetailsBodyBusinessOfpi other) {
    return beneficiaryBankAccount.equals(other.beneficiaryBankAccount) && payerInstitution.equals(other.payerInstitution) && callbackUrl.equals(other.callbackUrl) && cpf.equals(other.cpf);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.beneficiaryBankAccount, this.payerInstitution, this.callbackUrl, this.cpf);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "PaymentIntentPaymentMethodDetailsBodyBusinessOfpi{" + "beneficiaryBankAccount: " + beneficiaryBankAccount + ", payerInstitution: " + payerInstitution + ", callbackUrl: " + callbackUrl + ", cpf: " + cpf + "}";
  }

  public static BeneficiaryBankAccountStage builder() {
    return new Builder();
  }

  public interface BeneficiaryBankAccountStage {
    PayerInstitutionStage beneficiaryBankAccount(String beneficiaryBankAccount);

    Builder from(PaymentIntentPaymentMethodDetailsBodyBusinessOfpi other);
  }

  public interface PayerInstitutionStage {
    CallbackUrlStage payerInstitution(String payerInstitution);
  }

  public interface CallbackUrlStage {
    _FinalStage callbackUrl(String callbackUrl);
  }

  public interface _FinalStage {
    PaymentIntentPaymentMethodDetailsBodyBusinessOfpi build();

    _FinalStage cpf(Optional<String> cpf);

    _FinalStage cpf(String cpf);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements BeneficiaryBankAccountStage, PayerInstitutionStage, CallbackUrlStage, _FinalStage {
    private String beneficiaryBankAccount;

    private String payerInstitution;

    private String callbackUrl;

    private Optional<String> cpf = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(PaymentIntentPaymentMethodDetailsBodyBusinessOfpi other) {
      beneficiaryBankAccount(other.getBeneficiaryBankAccount());
      payerInstitution(other.getPayerInstitution());
      callbackUrl(other.getCallbackUrl());
      cpf(other.getCpf());
      return this;
    }

    /**
     * <p>Belvo's unique ID used to identify the beneficiary's bank account.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("beneficiary_bank_account")
    public PayerInstitutionStage beneficiaryBankAccount(String beneficiaryBankAccount) {
      this.beneficiaryBankAccount = beneficiaryBankAccount;
      return this;
    }

    /**
     * <p>Belvo's unique ID to reference the payer's institution.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("payer_institution")
    public CallbackUrlStage payerInstitution(String payerInstitution) {
      this.payerInstitution = payerInstitution;
      return this;
    }

    /**
     * <p>The callback URL that your user will be redirected to after confirming the payment in their banking application.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("callback_url")
    public _FinalStage callbackUrl(String callbackUrl) {
      this.callbackUrl = callbackUrl;
      return this;
    }

    /**
     * <p>The customer's CPF number. Only required when the <code>customer_type</code> is <code>BUSINESS</code>.</p>
     * <p><strong>Note:</strong> This value is obfuscated.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage cpf(String cpf) {
      this.cpf = Optional.of(cpf);
      return this;
    }

    @Override
    @JsonSetter(
        value = "cpf",
        nulls = Nulls.SKIP
    )
    public _FinalStage cpf(Optional<String> cpf) {
      this.cpf = cpf;
      return this;
    }

    @Override
    public PaymentIntentPaymentMethodDetailsBodyBusinessOfpi build() {
      return new PaymentIntentPaymentMethodDetailsBodyBusinessOfpi(beneficiaryBankAccount, payerInstitution, callbackUrl, cpf);
    }
  }
}
