package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = Transaction.Builder.class
)
public final class Transaction {
  private final Optional<String> id;

  private final Optional<String> internalIdentification;

  private final Account account;

  private final Optional<String> collectedAt;

  private final Optional<String> createdAt;

  private final Optional<String> valueDate;

  private final Optional<String> accountingDate;

  private final Optional<Double> amount;

  private final Optional<Double> balance;

  private final Optional<String> currency;

  private final Optional<String> description;

  private final Optional<String> observations;

  private final TransactionMerchantData merchant;

  private final Optional<String> category;

  private final Optional<String> subcategory;

  private final Optional<String> reference;

  private final Optional<String> type;

  private final Optional<String> status;

  private final Optional<TransactionCreditCardData> creditCardData;

  private int _cachedHashCode;

  Transaction(Optional<String> id, Optional<String> internalIdentification, Account account,
      Optional<String> collectedAt, Optional<String> createdAt, Optional<String> valueDate,
      Optional<String> accountingDate, Optional<Double> amount, Optional<Double> balance,
      Optional<String> currency, Optional<String> description, Optional<String> observations,
      TransactionMerchantData merchant, Optional<String> category, Optional<String> subcategory,
      Optional<String> reference, Optional<String> type, Optional<String> status,
      Optional<TransactionCreditCardData> creditCardData) {
    this.id = id;
    this.internalIdentification = internalIdentification;
    this.account = account;
    this.collectedAt = collectedAt;
    this.createdAt = createdAt;
    this.valueDate = valueDate;
    this.accountingDate = accountingDate;
    this.amount = amount;
    this.balance = balance;
    this.currency = currency;
    this.description = description;
    this.observations = observations;
    this.merchant = merchant;
    this.category = category;
    this.subcategory = subcategory;
    this.reference = reference;
    this.type = type;
    this.status = status;
    this.creditCardData = creditCardData;
  }

  /**
   * @return Belvo's unique ID for the transaction.
   */
  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
  }

  /**
   * @return The institution's internal identification for the transaction.
   */
  @JsonProperty("internal_identification")
  public Optional<String> getInternalIdentification() {
    return internalIdentification;
  }

  @JsonProperty("account")
  public Account getAccount() {
    return account;
  }

  /**
   * @return The ISO-8601 timestamp when the data point was collected.
   */
  @JsonProperty("collected_at")
  public Optional<String> getCollectedAt() {
    return collectedAt;
  }

  /**
   * @return The ISO-8601 timestamp of when the data point was last updated in Belvo's database.
   */
  @JsonProperty("created_at")
  public Optional<String> getCreatedAt() {
    return createdAt;
  }

  /**
   * @return The date when the transaction occurred, in <code>YYYY-MM-DD</code> format.
   */
  @JsonProperty("value_date")
  public Optional<String> getValueDate() {
    return valueDate;
  }

  /**
   * @return The ISO timestamp when the transaction was processed and accounted for by the institution.
   */
  @JsonProperty("accounting_date")
  public Optional<String> getAccountingDate() {
    return accountingDate;
  }

  /**
   * @return The transaction amount.
   * ℹ️ The amount displayed is always positive as we indicate the direction of the transaction in the <code>type</code> parameter.
   */
  @JsonProperty("amount")
  public Optional<Double> getAmount() {
    return amount;
  }

  /**
   * @return The balance at the end of the transaction.
   */
  @JsonProperty("balance")
  public Optional<Double> getBalance() {
    return balance;
  }

  /**
   * @return The three-letter currency code (ISO-4217).
   */
  @JsonProperty("currency")
  public Optional<String> getCurrency() {
    return currency;
  }

  /**
   * @return The description of transaction provided by the institution. Usually this is the text that the end user sees in the online platform.
   */
  @JsonProperty("description")
  public Optional<String> getDescription() {
    return description;
  }

  /**
   * @return Additional observations provided by the institution on the transaction.
   */
  @JsonProperty("observations")
  public Optional<String> getObservations() {
    return observations;
  }

  @JsonProperty("merchant")
  public TransactionMerchantData getMerchant() {
    return merchant;
  }

  @JsonProperty("category")
  public Optional<String> getCategory() {
    return category;
  }

  @JsonProperty("subcategory")
  public Optional<String> getSubcategory() {
    return subcategory;
  }

  /**
   * @return The reference number of the transaction, provided by the bank.
   */
  @JsonProperty("reference")
  public Optional<String> getReference() {
    return reference;
  }

  @JsonProperty("type")
  public Optional<String> getType() {
    return type;
  }

  @JsonProperty("status")
  public Optional<String> getStatus() {
    return status;
  }

  @JsonProperty("credit_card_data")
  public Optional<TransactionCreditCardData> getCreditCardData() {
    return creditCardData;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof Transaction && equalTo((Transaction) other);
  }

  private boolean equalTo(Transaction other) {
    return id.equals(other.id) && internalIdentification.equals(other.internalIdentification) && account.equals(other.account) && collectedAt.equals(other.collectedAt) && createdAt.equals(other.createdAt) && valueDate.equals(other.valueDate) && accountingDate.equals(other.accountingDate) && amount.equals(other.amount) && balance.equals(other.balance) && currency.equals(other.currency) && description.equals(other.description) && observations.equals(other.observations) && merchant.equals(other.merchant) && category.equals(other.category) && subcategory.equals(other.subcategory) && reference.equals(other.reference) && type.equals(other.type) && status.equals(other.status) && creditCardData.equals(other.creditCardData);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.id, this.internalIdentification, this.account, this.collectedAt, this.createdAt, this.valueDate, this.accountingDate, this.amount, this.balance, this.currency, this.description, this.observations, this.merchant, this.category, this.subcategory, this.reference, this.type, this.status, this.creditCardData);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "Transaction{" + "id: " + id + ", internalIdentification: " + internalIdentification + ", account: " + account + ", collectedAt: " + collectedAt + ", createdAt: " + createdAt + ", valueDate: " + valueDate + ", accountingDate: " + accountingDate + ", amount: " + amount + ", balance: " + balance + ", currency: " + currency + ", description: " + description + ", observations: " + observations + ", merchant: " + merchant + ", category: " + category + ", subcategory: " + subcategory + ", reference: " + reference + ", type: " + type + ", status: " + status + ", creditCardData: " + creditCardData + "}";
  }

  public static AccountStage builder() {
    return new Builder();
  }

  public interface AccountStage {
    MerchantStage account(Account account);

    Builder from(Transaction other);
  }

  public interface MerchantStage {
    _FinalStage merchant(TransactionMerchantData merchant);
  }

  public interface _FinalStage {
    Transaction build();

    _FinalStage id(Optional<String> id);

    _FinalStage id(String id);

    _FinalStage internalIdentification(Optional<String> internalIdentification);

    _FinalStage internalIdentification(String internalIdentification);

    _FinalStage collectedAt(Optional<String> collectedAt);

    _FinalStage collectedAt(String collectedAt);

    _FinalStage createdAt(Optional<String> createdAt);

    _FinalStage createdAt(String createdAt);

    _FinalStage valueDate(Optional<String> valueDate);

    _FinalStage valueDate(String valueDate);

    _FinalStage accountingDate(Optional<String> accountingDate);

    _FinalStage accountingDate(String accountingDate);

    _FinalStage amount(Optional<Double> amount);

    _FinalStage amount(Double amount);

    _FinalStage balance(Optional<Double> balance);

    _FinalStage balance(Double balance);

    _FinalStage currency(Optional<String> currency);

    _FinalStage currency(String currency);

    _FinalStage description(Optional<String> description);

    _FinalStage description(String description);

    _FinalStage observations(Optional<String> observations);

    _FinalStage observations(String observations);

    _FinalStage category(Optional<String> category);

    _FinalStage category(String category);

    _FinalStage subcategory(Optional<String> subcategory);

    _FinalStage subcategory(String subcategory);

    _FinalStage reference(Optional<String> reference);

    _FinalStage reference(String reference);

    _FinalStage type(Optional<String> type);

    _FinalStage type(String type);

    _FinalStage status(Optional<String> status);

    _FinalStage status(String status);

    _FinalStage creditCardData(Optional<TransactionCreditCardData> creditCardData);

    _FinalStage creditCardData(TransactionCreditCardData creditCardData);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements AccountStage, MerchantStage, _FinalStage {
    private Account account;

    private TransactionMerchantData merchant;

    private Optional<TransactionCreditCardData> creditCardData = Optional.empty();

    private Optional<String> status = Optional.empty();

    private Optional<String> type = Optional.empty();

    private Optional<String> reference = Optional.empty();

    private Optional<String> subcategory = Optional.empty();

    private Optional<String> category = Optional.empty();

    private Optional<String> observations = Optional.empty();

    private Optional<String> description = Optional.empty();

    private Optional<String> currency = Optional.empty();

    private Optional<Double> balance = Optional.empty();

    private Optional<Double> amount = Optional.empty();

    private Optional<String> accountingDate = Optional.empty();

    private Optional<String> valueDate = Optional.empty();

    private Optional<String> createdAt = Optional.empty();

    private Optional<String> collectedAt = Optional.empty();

    private Optional<String> internalIdentification = Optional.empty();

    private Optional<String> id = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(Transaction other) {
      id(other.getId());
      internalIdentification(other.getInternalIdentification());
      account(other.getAccount());
      collectedAt(other.getCollectedAt());
      createdAt(other.getCreatedAt());
      valueDate(other.getValueDate());
      accountingDate(other.getAccountingDate());
      amount(other.getAmount());
      balance(other.getBalance());
      currency(other.getCurrency());
      description(other.getDescription());
      observations(other.getObservations());
      merchant(other.getMerchant());
      category(other.getCategory());
      subcategory(other.getSubcategory());
      reference(other.getReference());
      type(other.getType());
      status(other.getStatus());
      creditCardData(other.getCreditCardData());
      return this;
    }

    @Override
    @JsonSetter("account")
    public MerchantStage account(Account account) {
      this.account = account;
      return this;
    }

    @Override
    @JsonSetter("merchant")
    public _FinalStage merchant(TransactionMerchantData merchant) {
      this.merchant = merchant;
      return this;
    }

    @Override
    public _FinalStage creditCardData(TransactionCreditCardData creditCardData) {
      this.creditCardData = Optional.of(creditCardData);
      return this;
    }

    @Override
    @JsonSetter(
        value = "credit_card_data",
        nulls = Nulls.SKIP
    )
    public _FinalStage creditCardData(Optional<TransactionCreditCardData> creditCardData) {
      this.creditCardData = creditCardData;
      return this;
    }

    @Override
    public _FinalStage status(String status) {
      this.status = Optional.of(status);
      return this;
    }

    @Override
    @JsonSetter(
        value = "status",
        nulls = Nulls.SKIP
    )
    public _FinalStage status(Optional<String> status) {
      this.status = status;
      return this;
    }

    @Override
    public _FinalStage type(String type) {
      this.type = Optional.of(type);
      return this;
    }

    @Override
    @JsonSetter(
        value = "type",
        nulls = Nulls.SKIP
    )
    public _FinalStage type(Optional<String> type) {
      this.type = type;
      return this;
    }

    /**
     * <p>The reference number of the transaction, provided by the bank.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage reference(String reference) {
      this.reference = Optional.of(reference);
      return this;
    }

    @Override
    @JsonSetter(
        value = "reference",
        nulls = Nulls.SKIP
    )
    public _FinalStage reference(Optional<String> reference) {
      this.reference = reference;
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
     * <p>Additional observations provided by the institution on the transaction.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage observations(String observations) {
      this.observations = Optional.of(observations);
      return this;
    }

    @Override
    @JsonSetter(
        value = "observations",
        nulls = Nulls.SKIP
    )
    public _FinalStage observations(Optional<String> observations) {
      this.observations = observations;
      return this;
    }

    /**
     * <p>The description of transaction provided by the institution. Usually this is the text that the end user sees in the online platform.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage description(String description) {
      this.description = Optional.of(description);
      return this;
    }

    @Override
    @JsonSetter(
        value = "description",
        nulls = Nulls.SKIP
    )
    public _FinalStage description(Optional<String> description) {
      this.description = description;
      return this;
    }

    /**
     * <p>The three-letter currency code (ISO-4217).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage currency(String currency) {
      this.currency = Optional.of(currency);
      return this;
    }

    @Override
    @JsonSetter(
        value = "currency",
        nulls = Nulls.SKIP
    )
    public _FinalStage currency(Optional<String> currency) {
      this.currency = currency;
      return this;
    }

    /**
     * <p>The balance at the end of the transaction.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage balance(Double balance) {
      this.balance = Optional.of(balance);
      return this;
    }

    @Override
    @JsonSetter(
        value = "balance",
        nulls = Nulls.SKIP
    )
    public _FinalStage balance(Optional<Double> balance) {
      this.balance = balance;
      return this;
    }

    /**
     * <p>The transaction amount.
     * ℹ️ The amount displayed is always positive as we indicate the direction of the transaction in the <code>type</code> parameter.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage amount(Double amount) {
      this.amount = Optional.of(amount);
      return this;
    }

    @Override
    @JsonSetter(
        value = "amount",
        nulls = Nulls.SKIP
    )
    public _FinalStage amount(Optional<Double> amount) {
      this.amount = amount;
      return this;
    }

    /**
     * <p>The ISO timestamp when the transaction was processed and accounted for by the institution.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage accountingDate(String accountingDate) {
      this.accountingDate = Optional.of(accountingDate);
      return this;
    }

    @Override
    @JsonSetter(
        value = "accounting_date",
        nulls = Nulls.SKIP
    )
    public _FinalStage accountingDate(Optional<String> accountingDate) {
      this.accountingDate = accountingDate;
      return this;
    }

    /**
     * <p>The date when the transaction occurred, in <code>YYYY-MM-DD</code> format.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage valueDate(String valueDate) {
      this.valueDate = Optional.of(valueDate);
      return this;
    }

    @Override
    @JsonSetter(
        value = "value_date",
        nulls = Nulls.SKIP
    )
    public _FinalStage valueDate(Optional<String> valueDate) {
      this.valueDate = valueDate;
      return this;
    }

    /**
     * <p>The ISO-8601 timestamp of when the data point was last updated in Belvo's database.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage createdAt(String createdAt) {
      this.createdAt = Optional.of(createdAt);
      return this;
    }

    @Override
    @JsonSetter(
        value = "created_at",
        nulls = Nulls.SKIP
    )
    public _FinalStage createdAt(Optional<String> createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * <p>The ISO-8601 timestamp when the data point was collected.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage collectedAt(String collectedAt) {
      this.collectedAt = Optional.of(collectedAt);
      return this;
    }

    @Override
    @JsonSetter(
        value = "collected_at",
        nulls = Nulls.SKIP
    )
    public _FinalStage collectedAt(Optional<String> collectedAt) {
      this.collectedAt = collectedAt;
      return this;
    }

    /**
     * <p>The institution's internal identification for the transaction.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage internalIdentification(String internalIdentification) {
      this.internalIdentification = Optional.of(internalIdentification);
      return this;
    }

    @Override
    @JsonSetter(
        value = "internal_identification",
        nulls = Nulls.SKIP
    )
    public _FinalStage internalIdentification(Optional<String> internalIdentification) {
      this.internalIdentification = internalIdentification;
      return this;
    }

    /**
     * <p>Belvo's unique ID for the transaction.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage id(String id) {
      this.id = Optional.of(id);
      return this;
    }

    @Override
    @JsonSetter(
        value = "id",
        nulls = Nulls.SKIP
    )
    public _FinalStage id(Optional<String> id) {
      this.id = id;
      return this;
    }

    @Override
    public Transaction build() {
      return new Transaction(id, internalIdentification, account, collectedAt, createdAt, valueDate, accountingDate, amount, balance, currency, description, observations, merchant, category, subcategory, reference, type, status, creditCardData);
    }
  }
}
