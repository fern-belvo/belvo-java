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
    builder = PaymentIntentPaymentMethodDetailsBodyPse.Builder.class
)
public final class PaymentIntentPaymentMethodDetailsBodyPse {
  private final Optional<String> payerInstitution;

  private final Optional<String> payerBankAccount;

  private final String beneficiaryBankAccount;

  private final Optional<String> username;

  private final Optional<String> password;

  private final String callbackUrl;

  private final boolean belvoFlow;

  private int _cachedHashCode;

  PaymentIntentPaymentMethodDetailsBodyPse(Optional<String> payerInstitution,
      Optional<String> payerBankAccount, String beneficiaryBankAccount, Optional<String> username,
      Optional<String> password, String callbackUrl, boolean belvoFlow) {
    this.payerInstitution = payerInstitution;
    this.payerBankAccount = payerBankAccount;
    this.beneficiaryBankAccount = beneficiaryBankAccount;
    this.username = username;
    this.password = password;
    this.callbackUrl = callbackUrl;
    this.belvoFlow = belvoFlow;
  }

  /**
   * @return Belvo's unique identifier for the payer’s institution.
   */
  @JsonProperty("payer_institution")
  public Optional<String> getPayerInstitution() {
    return payerInstitution;
  }

  /**
   * @return Belvo's unique ID used to identify the customer’s bank account.
   */
  @JsonProperty("payer_bank_account")
  public Optional<String> getPayerBankAccount() {
    return payerBankAccount;
  }

  /**
   * @return Belvo's unique ID used to identify the beneficiary’s bank account.
   */
  @JsonProperty("beneficiary_bank_account")
  public String getBeneficiaryBankAccount() {
    return beneficiaryBankAccount;
  }

  /**
   * @return The username used to log in to the institution. This value is obfuscated.
   */
  @JsonProperty("username")
  public Optional<String> getUsername() {
    return username;
  }

  /**
   * @return The password used to log in to the institution. This value is obfuscated.
   */
  @JsonProperty("password")
  public Optional<String> getPassword() {
    return password;
  }

  /**
   * @return The callback URL that your user will be redirected to after confirming the payment in their banking application.
   */
  @JsonProperty("callback_url")
  public String getCallbackUrl() {
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
    return other instanceof PaymentIntentPaymentMethodDetailsBodyPse && equalTo((PaymentIntentPaymentMethodDetailsBodyPse) other);
  }

  private boolean equalTo(PaymentIntentPaymentMethodDetailsBodyPse other) {
    return payerInstitution.equals(other.payerInstitution) && payerBankAccount.equals(other.payerBankAccount) && beneficiaryBankAccount.equals(other.beneficiaryBankAccount) && username.equals(other.username) && password.equals(other.password) && callbackUrl.equals(other.callbackUrl) && belvoFlow == other.belvoFlow;
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.payerInstitution, this.payerBankAccount, this.beneficiaryBankAccount, this.username, this.password, this.callbackUrl, this.belvoFlow);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "PaymentIntentPaymentMethodDetailsBodyPse{" + "payerInstitution: " + payerInstitution + ", payerBankAccount: " + payerBankAccount + ", beneficiaryBankAccount: " + beneficiaryBankAccount + ", username: " + username + ", password: " + password + ", callbackUrl: " + callbackUrl + ", belvoFlow: " + belvoFlow + "}";
  }

  public static BeneficiaryBankAccountStage builder() {
    return new Builder();
  }

  public interface BeneficiaryBankAccountStage {
    CallbackUrlStage beneficiaryBankAccount(String beneficiaryBankAccount);

    Builder from(PaymentIntentPaymentMethodDetailsBodyPse other);
  }

  public interface CallbackUrlStage {
    BelvoFlowStage callbackUrl(String callbackUrl);
  }

  public interface BelvoFlowStage {
    _FinalStage belvoFlow(boolean belvoFlow);
  }

  public interface _FinalStage {
    PaymentIntentPaymentMethodDetailsBodyPse build();

    _FinalStage payerInstitution(Optional<String> payerInstitution);

    _FinalStage payerInstitution(String payerInstitution);

    _FinalStage payerBankAccount(Optional<String> payerBankAccount);

    _FinalStage payerBankAccount(String payerBankAccount);

    _FinalStage username(Optional<String> username);

    _FinalStage username(String username);

    _FinalStage password(Optional<String> password);

    _FinalStage password(String password);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements BeneficiaryBankAccountStage, CallbackUrlStage, BelvoFlowStage, _FinalStage {
    private String beneficiaryBankAccount;

    private String callbackUrl;

    private boolean belvoFlow;

    private Optional<String> password = Optional.empty();

    private Optional<String> username = Optional.empty();

    private Optional<String> payerBankAccount = Optional.empty();

    private Optional<String> payerInstitution = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(PaymentIntentPaymentMethodDetailsBodyPse other) {
      payerInstitution(other.getPayerInstitution());
      payerBankAccount(other.getPayerBankAccount());
      beneficiaryBankAccount(other.getBeneficiaryBankAccount());
      username(other.getUsername());
      password(other.getPassword());
      callbackUrl(other.getCallbackUrl());
      belvoFlow(other.getBelvoFlow());
      return this;
    }

    /**
     * <p>Belvo's unique ID used to identify the beneficiary’s bank account.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("beneficiary_bank_account")
    public CallbackUrlStage beneficiaryBankAccount(String beneficiaryBankAccount) {
      this.beneficiaryBankAccount = beneficiaryBankAccount;
      return this;
    }

    /**
     * <p>The callback URL that your user will be redirected to after confirming the payment in their banking application.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("callback_url")
    public BelvoFlowStage callbackUrl(String callbackUrl) {
      this.callbackUrl = callbackUrl;
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
     * <p>The password used to log in to the institution. This value is obfuscated.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage password(String password) {
      this.password = Optional.of(password);
      return this;
    }

    @Override
    @JsonSetter(
        value = "password",
        nulls = Nulls.SKIP
    )
    public _FinalStage password(Optional<String> password) {
      this.password = password;
      return this;
    }

    /**
     * <p>The username used to log in to the institution. This value is obfuscated.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage username(String username) {
      this.username = Optional.of(username);
      return this;
    }

    @Override
    @JsonSetter(
        value = "username",
        nulls = Nulls.SKIP
    )
    public _FinalStage username(Optional<String> username) {
      this.username = username;
      return this;
    }

    /**
     * <p>Belvo's unique ID used to identify the customer’s bank account.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage payerBankAccount(String payerBankAccount) {
      this.payerBankAccount = Optional.of(payerBankAccount);
      return this;
    }

    @Override
    @JsonSetter(
        value = "payer_bank_account",
        nulls = Nulls.SKIP
    )
    public _FinalStage payerBankAccount(Optional<String> payerBankAccount) {
      this.payerBankAccount = payerBankAccount;
      return this;
    }

    /**
     * <p>Belvo's unique identifier for the payer’s institution.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage payerInstitution(String payerInstitution) {
      this.payerInstitution = Optional.of(payerInstitution);
      return this;
    }

    @Override
    @JsonSetter(
        value = "payer_institution",
        nulls = Nulls.SKIP
    )
    public _FinalStage payerInstitution(Optional<String> payerInstitution) {
      this.payerInstitution = payerInstitution;
      return this;
    }

    @Override
    public PaymentIntentPaymentMethodDetailsBodyPse build() {
      return new PaymentIntentPaymentMethodDetailsBodyPse(payerInstitution, payerBankAccount, beneficiaryBankAccount, username, password, callbackUrl, belvoFlow);
    }
  }
}
