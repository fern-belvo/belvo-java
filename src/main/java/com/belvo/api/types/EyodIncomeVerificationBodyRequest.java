package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

@JsonDeserialize(
    builder = EyodIncomeVerificationBodyRequest.Builder.class
)
public final class EyodIncomeVerificationBodyRequest {
  private final String transactionId;

  private final EnumIncomeVerificationAccountHolderType accountHolderType;

  private final String accountHolderId;

  private final String accountId;

  private final EnumIncomeVerificationAccountCategory accountCategory;

  private final String valueDate;

  private final String description;

  private final EnumIncomeVerificationType type;

  private final double amount;

  private final String currency;

  private final String institution;

  private int _cachedHashCode;

  EyodIncomeVerificationBodyRequest(String transactionId,
      EnumIncomeVerificationAccountHolderType accountHolderType, String accountHolderId,
      String accountId, EnumIncomeVerificationAccountCategory accountCategory, String valueDate,
      String description, EnumIncomeVerificationType type, double amount, String currency,
      String institution) {
    this.transactionId = transactionId;
    this.accountHolderType = accountHolderType;
    this.accountHolderId = accountHolderId;
    this.accountId = accountId;
    this.accountCategory = accountCategory;
    this.valueDate = valueDate;
    this.description = description;
    this.type = type;
    this.amount = amount;
    this.currency = currency;
    this.institution = institution;
  }

  /**
   * @return Your unique ID for the income.
   */
  @JsonProperty("transaction_id")
  public String getTransactionId() {
    return transactionId;
  }

  @JsonProperty("account_holder_type")
  public EnumIncomeVerificationAccountHolderType getAccountHolderType() {
    return accountHolderType;
  }

  /**
   * @return Your unique ID for the account holder, in UUID format.
   */
  @JsonProperty("account_holder_id")
  public String getAccountHolderId() {
    return accountHolderId;
  }

  /**
   * @return Your unique ID for the account where the transaction occurred.
   */
  @JsonProperty("account_id")
  public String getAccountId() {
    return accountId;
  }

  @JsonProperty("account_category")
  public EnumIncomeVerificationAccountCategory getAccountCategory() {
    return accountCategory;
  }

  /**
   * @return The date when the income transaction occurred, in <code>YYYY-MM-DD</code> format.
   */
  @JsonProperty("value_date")
  public String getValueDate() {
    return valueDate;
  }

  /**
   * @return The description of the income.
   */
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  @JsonProperty("type")
  public EnumIncomeVerificationType getType() {
    return type;
  }

  /**
   * @return The income amount.
   */
  @JsonProperty("amount")
  public double getAmount() {
    return amount;
  }

  /**
   * @return The three-letter currency code of the income. For example:
   * <p>• 🇧🇷 BRL (Brazilian Real)
   * • 🇨🇴 COP (Colombian Peso)
   * • 🇲🇽 MXN (Mexican Peso)</p>
   */
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }

  /**
   * @return The institution where the account is registered.
   * <p><strong>Note:</strong> This is the name that you use in your system to identify the institution. For example BBVA Retail.</p>
   */
  @JsonProperty("institution")
  public String getInstitution() {
    return institution;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof EyodIncomeVerificationBodyRequest && equalTo((EyodIncomeVerificationBodyRequest) other);
  }

  private boolean equalTo(EyodIncomeVerificationBodyRequest other) {
    return transactionId.equals(other.transactionId) && accountHolderType.equals(other.accountHolderType) && accountHolderId.equals(other.accountHolderId) && accountId.equals(other.accountId) && accountCategory.equals(other.accountCategory) && valueDate.equals(other.valueDate) && description.equals(other.description) && type.equals(other.type) && amount == other.amount && currency.equals(other.currency) && institution.equals(other.institution);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.transactionId, this.accountHolderType, this.accountHolderId, this.accountId, this.accountCategory, this.valueDate, this.description, this.type, this.amount, this.currency, this.institution);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "EyodIncomeVerificationBodyRequest{" + "transactionId: " + transactionId + ", accountHolderType: " + accountHolderType + ", accountHolderId: " + accountHolderId + ", accountId: " + accountId + ", accountCategory: " + accountCategory + ", valueDate: " + valueDate + ", description: " + description + ", type: " + type + ", amount: " + amount + ", currency: " + currency + ", institution: " + institution + "}";
  }

  public static TransactionIdStage builder() {
    return new Builder();
  }

  public interface TransactionIdStage {
    AccountHolderTypeStage transactionId(String transactionId);

    Builder from(EyodIncomeVerificationBodyRequest other);
  }

  public interface AccountHolderTypeStage {
    AccountHolderIdStage accountHolderType(
        EnumIncomeVerificationAccountHolderType accountHolderType);
  }

  public interface AccountHolderIdStage {
    AccountIdStage accountHolderId(String accountHolderId);
  }

  public interface AccountIdStage {
    AccountCategoryStage accountId(String accountId);
  }

  public interface AccountCategoryStage {
    ValueDateStage accountCategory(EnumIncomeVerificationAccountCategory accountCategory);
  }

  public interface ValueDateStage {
    DescriptionStage valueDate(String valueDate);
  }

  public interface DescriptionStage {
    TypeStage description(String description);
  }

  public interface TypeStage {
    AmountStage type(EnumIncomeVerificationType type);
  }

  public interface AmountStage {
    CurrencyStage amount(double amount);
  }

  public interface CurrencyStage {
    InstitutionStage currency(String currency);
  }

  public interface InstitutionStage {
    _FinalStage institution(String institution);
  }

  public interface _FinalStage {
    EyodIncomeVerificationBodyRequest build();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements TransactionIdStage, AccountHolderTypeStage, AccountHolderIdStage, AccountIdStage, AccountCategoryStage, ValueDateStage, DescriptionStage, TypeStage, AmountStage, CurrencyStage, InstitutionStage, _FinalStage {
    private String transactionId;

    private EnumIncomeVerificationAccountHolderType accountHolderType;

    private String accountHolderId;

    private String accountId;

    private EnumIncomeVerificationAccountCategory accountCategory;

    private String valueDate;

    private String description;

    private EnumIncomeVerificationType type;

    private double amount;

    private String currency;

    private String institution;

    private Builder() {
    }

    @Override
    public Builder from(EyodIncomeVerificationBodyRequest other) {
      transactionId(other.getTransactionId());
      accountHolderType(other.getAccountHolderType());
      accountHolderId(other.getAccountHolderId());
      accountId(other.getAccountId());
      accountCategory(other.getAccountCategory());
      valueDate(other.getValueDate());
      description(other.getDescription());
      type(other.getType());
      amount(other.getAmount());
      currency(other.getCurrency());
      institution(other.getInstitution());
      return this;
    }

    /**
     * <p>Your unique ID for the income.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("transaction_id")
    public AccountHolderTypeStage transactionId(String transactionId) {
      this.transactionId = transactionId;
      return this;
    }

    @Override
    @JsonSetter("account_holder_type")
    public AccountHolderIdStage accountHolderType(
        EnumIncomeVerificationAccountHolderType accountHolderType) {
      this.accountHolderType = accountHolderType;
      return this;
    }

    /**
     * <p>Your unique ID for the account holder, in UUID format.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("account_holder_id")
    public AccountIdStage accountHolderId(String accountHolderId) {
      this.accountHolderId = accountHolderId;
      return this;
    }

    /**
     * <p>Your unique ID for the account where the transaction occurred.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("account_id")
    public AccountCategoryStage accountId(String accountId) {
      this.accountId = accountId;
      return this;
    }

    @Override
    @JsonSetter("account_category")
    public ValueDateStage accountCategory(EnumIncomeVerificationAccountCategory accountCategory) {
      this.accountCategory = accountCategory;
      return this;
    }

    /**
     * <p>The date when the income transaction occurred, in <code>YYYY-MM-DD</code> format.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("value_date")
    public DescriptionStage valueDate(String valueDate) {
      this.valueDate = valueDate;
      return this;
    }

    /**
     * <p>The description of the income.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("description")
    public TypeStage description(String description) {
      this.description = description;
      return this;
    }

    @Override
    @JsonSetter("type")
    public AmountStage type(EnumIncomeVerificationType type) {
      this.type = type;
      return this;
    }

    /**
     * <p>The income amount.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("amount")
    public CurrencyStage amount(double amount) {
      this.amount = amount;
      return this;
    }

    /**
     * <p>The three-letter currency code of the income. For example:</p>
     * <p>• 🇧🇷 BRL (Brazilian Real)
     * • 🇨🇴 COP (Colombian Peso)
     * • 🇲🇽 MXN (Mexican Peso)</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("currency")
    public InstitutionStage currency(String currency) {
      this.currency = currency;
      return this;
    }

    /**
     * <p>The institution where the account is registered.</p>
     * <p><strong>Note:</strong> This is the name that you use in your system to identify the institution. For example BBVA Retail.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("institution")
    public _FinalStage institution(String institution) {
      this.institution = institution;
      return this;
    }

    @Override
    public EyodIncomeVerificationBodyRequest build() {
      return new EyodIncomeVerificationBodyRequest(transactionId, accountHolderType, accountHolderId, accountId, accountCategory, valueDate, description, type, amount, currency, institution);
    }
  }
}
