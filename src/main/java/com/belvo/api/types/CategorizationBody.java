package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = CategorizationBody.Builder.class
)
public final class CategorizationBody {
  private final String transactionId;

  private final EnumCategorizationAccountHolderType accountHolderType;

  private final String accountHolderId;

  private final String accountId;

  private final EnumCategorizationAccountCategory accountCategory;

  private final String valueDate;

  private final String description;

  private final EnumCategorizationTransactionType type;

  private final double amount;

  private final String currency;

  private final String institution;

  private final Optional<Integer> mcc;

  private final Optional<String> category;

  private final Optional<String> subcategory;

  private final CategorizationMerchantData merchant;

  private int _cachedHashCode;

  CategorizationBody(String transactionId, EnumCategorizationAccountHolderType accountHolderType,
      String accountHolderId, String accountId, EnumCategorizationAccountCategory accountCategory,
      String valueDate, String description, EnumCategorizationTransactionType type, double amount,
      String currency, String institution, Optional<Integer> mcc, Optional<String> category,
      Optional<String> subcategory, CategorizationMerchantData merchant) {
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
    this.mcc = mcc;
    this.category = category;
    this.subcategory = subcategory;
    this.merchant = merchant;
  }

  /**
   * @return The unique ID for the transaction in your system.
   */
  @JsonProperty("transaction_id")
  public String getTransactionId() {
    return transactionId;
  }

  @JsonProperty("account_holder_type")
  public EnumCategorizationAccountHolderType getAccountHolderType() {
    return accountHolderType;
  }

  /**
   * @return The unique ID for the account holder in your system.
   */
  @JsonProperty("account_holder_id")
  public String getAccountHolderId() {
    return accountHolderId;
  }

  /**
   * @return The unique ID for the account where the transaction occurred in your system.
   */
  @JsonProperty("account_id")
  public String getAccountId() {
    return accountId;
  }

  @JsonProperty("account_category")
  public EnumCategorizationAccountCategory getAccountCategory() {
    return accountCategory;
  }

  /**
   * @return The date when the transaction occurred, in <code>YYYY-MM-DD</code> format.
   */
  @JsonProperty("value_date")
  public String getValueDate() {
    return valueDate;
  }

  /**
   * @return The description of the transaction.
   */
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  @JsonProperty("type")
  public EnumCategorizationTransactionType getType() {
    return type;
  }

  /**
   * @return The transaction amount.
   */
  @JsonProperty("amount")
  public double getAmount() {
    return amount;
  }

  /**
   * @return The currency of the account, in ISO-4217 format. For example:
   * <ul>
   * <li>🇧🇷 BRL (Brazilian Real)</li>
   * <li>🇨🇴 COP (Colombian Peso)</li>
   * <li>🇲🇽 MXN (Mexican Peso)</li>
   * </ul>
   */
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }

  /**
   * @return The institution where the account is registered.
   * <blockquote>
   * <p><strong>Note:</strong> This is the name that you use in your system to identify an institution.</p>
   * </blockquote>
   */
  @JsonProperty("institution")
  public String getInstitution() {
    return institution;
  }

  /**
   * @return The four-digit ISO 18245 Merchant Category Code (MCC). We only return this value when <code>account_type</code> = <code>CREDIT_CARD</code>.
   */
  @JsonProperty("mcc")
  public Optional<Integer> getMcc() {
    return mcc;
  }

  @JsonProperty("category")
  public Optional<String> getCategory() {
    return category;
  }

  @JsonProperty("subcategory")
  public Optional<String> getSubcategory() {
    return subcategory;
  }

  @JsonProperty("merchant")
  public CategorizationMerchantData getMerchant() {
    return merchant;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof CategorizationBody && equalTo((CategorizationBody) other);
  }

  private boolean equalTo(CategorizationBody other) {
    return transactionId.equals(other.transactionId) && accountHolderType.equals(other.accountHolderType) && accountHolderId.equals(other.accountHolderId) && accountId.equals(other.accountId) && accountCategory.equals(other.accountCategory) && valueDate.equals(other.valueDate) && description.equals(other.description) && type.equals(other.type) && amount == other.amount && currency.equals(other.currency) && institution.equals(other.institution) && mcc.equals(other.mcc) && category.equals(other.category) && subcategory.equals(other.subcategory) && merchant.equals(other.merchant);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.transactionId, this.accountHolderType, this.accountHolderId, this.accountId, this.accountCategory, this.valueDate, this.description, this.type, this.amount, this.currency, this.institution, this.mcc, this.category, this.subcategory, this.merchant);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "CategorizationBody{" + "transactionId: " + transactionId + ", accountHolderType: " + accountHolderType + ", accountHolderId: " + accountHolderId + ", accountId: " + accountId + ", accountCategory: " + accountCategory + ", valueDate: " + valueDate + ", description: " + description + ", type: " + type + ", amount: " + amount + ", currency: " + currency + ", institution: " + institution + ", mcc: " + mcc + ", category: " + category + ", subcategory: " + subcategory + ", merchant: " + merchant + "}";
  }

  public static TransactionIdStage builder() {
    return new Builder();
  }

  public interface TransactionIdStage {
    AccountHolderTypeStage transactionId(String transactionId);

    Builder from(CategorizationBody other);
  }

  public interface AccountHolderTypeStage {
    AccountHolderIdStage accountHolderType(EnumCategorizationAccountHolderType accountHolderType);
  }

  public interface AccountHolderIdStage {
    AccountIdStage accountHolderId(String accountHolderId);
  }

  public interface AccountIdStage {
    AccountCategoryStage accountId(String accountId);
  }

  public interface AccountCategoryStage {
    ValueDateStage accountCategory(EnumCategorizationAccountCategory accountCategory);
  }

  public interface ValueDateStage {
    DescriptionStage valueDate(String valueDate);
  }

  public interface DescriptionStage {
    TypeStage description(String description);
  }

  public interface TypeStage {
    AmountStage type(EnumCategorizationTransactionType type);
  }

  public interface AmountStage {
    CurrencyStage amount(double amount);
  }

  public interface CurrencyStage {
    InstitutionStage currency(String currency);
  }

  public interface InstitutionStage {
    MerchantStage institution(String institution);
  }

  public interface MerchantStage {
    _FinalStage merchant(CategorizationMerchantData merchant);
  }

  public interface _FinalStage {
    CategorizationBody build();

    _FinalStage mcc(Optional<Integer> mcc);

    _FinalStage mcc(Integer mcc);

    _FinalStage category(Optional<String> category);

    _FinalStage category(String category);

    _FinalStage subcategory(Optional<String> subcategory);

    _FinalStage subcategory(String subcategory);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements TransactionIdStage, AccountHolderTypeStage, AccountHolderIdStage, AccountIdStage, AccountCategoryStage, ValueDateStage, DescriptionStage, TypeStage, AmountStage, CurrencyStage, InstitutionStage, MerchantStage, _FinalStage {
    private String transactionId;

    private EnumCategorizationAccountHolderType accountHolderType;

    private String accountHolderId;

    private String accountId;

    private EnumCategorizationAccountCategory accountCategory;

    private String valueDate;

    private String description;

    private EnumCategorizationTransactionType type;

    private double amount;

    private String currency;

    private String institution;

    private CategorizationMerchantData merchant;

    private Optional<String> subcategory = Optional.empty();

    private Optional<String> category = Optional.empty();

    private Optional<Integer> mcc = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(CategorizationBody other) {
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
      mcc(other.getMcc());
      category(other.getCategory());
      subcategory(other.getSubcategory());
      merchant(other.getMerchant());
      return this;
    }

    /**
     * <p>The unique ID for the transaction in your system.</p>
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
        EnumCategorizationAccountHolderType accountHolderType) {
      this.accountHolderType = accountHolderType;
      return this;
    }

    /**
     * <p>The unique ID for the account holder in your system.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("account_holder_id")
    public AccountIdStage accountHolderId(String accountHolderId) {
      this.accountHolderId = accountHolderId;
      return this;
    }

    /**
     * <p>The unique ID for the account where the transaction occurred in your system.</p>
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
    public ValueDateStage accountCategory(EnumCategorizationAccountCategory accountCategory) {
      this.accountCategory = accountCategory;
      return this;
    }

    /**
     * <p>The date when the transaction occurred, in <code>YYYY-MM-DD</code> format.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("value_date")
    public DescriptionStage valueDate(String valueDate) {
      this.valueDate = valueDate;
      return this;
    }

    /**
     * <p>The description of the transaction.</p>
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
    public AmountStage type(EnumCategorizationTransactionType type) {
      this.type = type;
      return this;
    }

    /**
     * <p>The transaction amount.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("amount")
    public CurrencyStage amount(double amount) {
      this.amount = amount;
      return this;
    }

    /**
     * <p>The currency of the account, in ISO-4217 format. For example:</p>
     * <ul>
     * <li>🇧🇷 BRL (Brazilian Real)</li>
     * <li>🇨🇴 COP (Colombian Peso)</li>
     * <li>🇲🇽 MXN (Mexican Peso)</li>
     * </ul>
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
     * <blockquote>
     * <p><strong>Note:</strong> This is the name that you use in your system to identify an institution.</p>
     * </blockquote>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("institution")
    public MerchantStage institution(String institution) {
      this.institution = institution;
      return this;
    }

    @Override
    @JsonSetter("merchant")
    public _FinalStage merchant(CategorizationMerchantData merchant) {
      this.merchant = merchant;
      return this;
    }

    @Override
    public _FinalStage subcategory(String subcategory) {
      this.subcategory = Optional.of(subcategory);
      return this;
    }

    @Override
    @JsonSetter(
        value = "subcategory",
        nulls = Nulls.SKIP
    )
    public _FinalStage subcategory(Optional<String> subcategory) {
      this.subcategory = subcategory;
      return this;
    }

    @Override
    public _FinalStage category(String category) {
      this.category = Optional.of(category);
      return this;
    }

    @Override
    @JsonSetter(
        value = "category",
        nulls = Nulls.SKIP
    )
    public _FinalStage category(Optional<String> category) {
      this.category = category;
      return this;
    }

    /**
     * <p>The four-digit ISO 18245 Merchant Category Code (MCC). We only return this value when <code>account_type</code> = <code>CREDIT_CARD</code>.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage mcc(Integer mcc) {
      this.mcc = Optional.of(mcc);
      return this;
    }

    @Override
    @JsonSetter(
        value = "mcc",
        nulls = Nulls.SKIP
    )
    public _FinalStage mcc(Optional<Integer> mcc) {
      this.mcc = mcc;
      return this;
    }

    @Override
    public CategorizationBody build() {
      return new CategorizationBody(transactionId, accountHolderType, accountHolderId, accountId, accountCategory, valueDate, description, type, amount, currency, institution, mcc, category, subcategory, merchant);
    }
  }
}
