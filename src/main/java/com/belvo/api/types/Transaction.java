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

  private final Optional<Account> account;

  private final Optional<String> collectedAt;

  private final Optional<String> createdAt;

  private final Optional<String> valueDate;

  private final Optional<String> accountingDate;

  private final Optional<Double> amount;

  private final Optional<Double> balance;

  private final Optional<String> currency;

  private final Optional<String> description;

  private final Optional<String> observations;

  private final Optional<TransactionMerchantData> merchant;

  private final Optional<String> category;

  private final Optional<String> subcategory;

  private final Optional<String> reference;

  private final Optional<String> type;

  private final Optional<String> status;

  private final Optional<TransactionCreditCardData> creditCardData;

  private int _cachedHashCode;

  Transaction(Optional<String> id, Optional<String> internalIdentification,
      Optional<Account> account, Optional<String> collectedAt, Optional<String> createdAt,
      Optional<String> valueDate, Optional<String> accountingDate, Optional<Double> amount,
      Optional<Double> balance, Optional<String> currency, Optional<String> description,
      Optional<String> observations, Optional<TransactionMerchantData> merchant,
      Optional<String> category, Optional<String> subcategory, Optional<String> reference,
      Optional<String> type, Optional<String> status,
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
  public Optional<Account> getAccount() {
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
  public Optional<TransactionMerchantData> getMerchant() {
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

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> id = Optional.empty();

    private Optional<String> internalIdentification = Optional.empty();

    private Optional<Account> account = Optional.empty();

    private Optional<String> collectedAt = Optional.empty();

    private Optional<String> createdAt = Optional.empty();

    private Optional<String> valueDate = Optional.empty();

    private Optional<String> accountingDate = Optional.empty();

    private Optional<Double> amount = Optional.empty();

    private Optional<Double> balance = Optional.empty();

    private Optional<String> currency = Optional.empty();

    private Optional<String> description = Optional.empty();

    private Optional<String> observations = Optional.empty();

    private Optional<TransactionMerchantData> merchant = Optional.empty();

    private Optional<String> category = Optional.empty();

    private Optional<String> subcategory = Optional.empty();

    private Optional<String> reference = Optional.empty();

    private Optional<String> type = Optional.empty();

    private Optional<String> status = Optional.empty();

    private Optional<TransactionCreditCardData> creditCardData = Optional.empty();

    private Builder() {
    }

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

    @JsonSetter(
        value = "id",
        nulls = Nulls.SKIP
    )
    public Builder id(Optional<String> id) {
      this.id = id;
      return this;
    }

    public Builder id(String id) {
      this.id = Optional.of(id);
      return this;
    }

    @JsonSetter(
        value = "internal_identification",
        nulls = Nulls.SKIP
    )
    public Builder internalIdentification(Optional<String> internalIdentification) {
      this.internalIdentification = internalIdentification;
      return this;
    }

    public Builder internalIdentification(String internalIdentification) {
      this.internalIdentification = Optional.of(internalIdentification);
      return this;
    }

    @JsonSetter(
        value = "account",
        nulls = Nulls.SKIP
    )
    public Builder account(Optional<Account> account) {
      this.account = account;
      return this;
    }

    public Builder account(Account account) {
      this.account = Optional.of(account);
      return this;
    }

    @JsonSetter(
        value = "collected_at",
        nulls = Nulls.SKIP
    )
    public Builder collectedAt(Optional<String> collectedAt) {
      this.collectedAt = collectedAt;
      return this;
    }

    public Builder collectedAt(String collectedAt) {
      this.collectedAt = Optional.of(collectedAt);
      return this;
    }

    @JsonSetter(
        value = "created_at",
        nulls = Nulls.SKIP
    )
    public Builder createdAt(Optional<String> createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    public Builder createdAt(String createdAt) {
      this.createdAt = Optional.of(createdAt);
      return this;
    }

    @JsonSetter(
        value = "value_date",
        nulls = Nulls.SKIP
    )
    public Builder valueDate(Optional<String> valueDate) {
      this.valueDate = valueDate;
      return this;
    }

    public Builder valueDate(String valueDate) {
      this.valueDate = Optional.of(valueDate);
      return this;
    }

    @JsonSetter(
        value = "accounting_date",
        nulls = Nulls.SKIP
    )
    public Builder accountingDate(Optional<String> accountingDate) {
      this.accountingDate = accountingDate;
      return this;
    }

    public Builder accountingDate(String accountingDate) {
      this.accountingDate = Optional.of(accountingDate);
      return this;
    }

    @JsonSetter(
        value = "amount",
        nulls = Nulls.SKIP
    )
    public Builder amount(Optional<Double> amount) {
      this.amount = amount;
      return this;
    }

    public Builder amount(Double amount) {
      this.amount = Optional.of(amount);
      return this;
    }

    @JsonSetter(
        value = "balance",
        nulls = Nulls.SKIP
    )
    public Builder balance(Optional<Double> balance) {
      this.balance = balance;
      return this;
    }

    public Builder balance(Double balance) {
      this.balance = Optional.of(balance);
      return this;
    }

    @JsonSetter(
        value = "currency",
        nulls = Nulls.SKIP
    )
    public Builder currency(Optional<String> currency) {
      this.currency = currency;
      return this;
    }

    public Builder currency(String currency) {
      this.currency = Optional.of(currency);
      return this;
    }

    @JsonSetter(
        value = "description",
        nulls = Nulls.SKIP
    )
    public Builder description(Optional<String> description) {
      this.description = description;
      return this;
    }

    public Builder description(String description) {
      this.description = Optional.of(description);
      return this;
    }

    @JsonSetter(
        value = "observations",
        nulls = Nulls.SKIP
    )
    public Builder observations(Optional<String> observations) {
      this.observations = observations;
      return this;
    }

    public Builder observations(String observations) {
      this.observations = Optional.of(observations);
      return this;
    }

    @JsonSetter(
        value = "merchant",
        nulls = Nulls.SKIP
    )
    public Builder merchant(Optional<TransactionMerchantData> merchant) {
      this.merchant = merchant;
      return this;
    }

    public Builder merchant(TransactionMerchantData merchant) {
      this.merchant = Optional.of(merchant);
      return this;
    }

    @JsonSetter(
        value = "category",
        nulls = Nulls.SKIP
    )
    public Builder category(Optional<String> category) {
      this.category = category;
      return this;
    }

    public Builder category(String category) {
      this.category = Optional.of(category);
      return this;
    }

    @JsonSetter(
        value = "subcategory",
        nulls = Nulls.SKIP
    )
    public Builder subcategory(Optional<String> subcategory) {
      this.subcategory = subcategory;
      return this;
    }

    public Builder subcategory(String subcategory) {
      this.subcategory = Optional.of(subcategory);
      return this;
    }

    @JsonSetter(
        value = "reference",
        nulls = Nulls.SKIP
    )
    public Builder reference(Optional<String> reference) {
      this.reference = reference;
      return this;
    }

    public Builder reference(String reference) {
      this.reference = Optional.of(reference);
      return this;
    }

    @JsonSetter(
        value = "type",
        nulls = Nulls.SKIP
    )
    public Builder type(Optional<String> type) {
      this.type = type;
      return this;
    }

    public Builder type(String type) {
      this.type = Optional.of(type);
      return this;
    }

    @JsonSetter(
        value = "status",
        nulls = Nulls.SKIP
    )
    public Builder status(Optional<String> status) {
      this.status = status;
      return this;
    }

    public Builder status(String status) {
      this.status = Optional.of(status);
      return this;
    }

    @JsonSetter(
        value = "credit_card_data",
        nulls = Nulls.SKIP
    )
    public Builder creditCardData(Optional<TransactionCreditCardData> creditCardData) {
      this.creditCardData = creditCardData;
      return this;
    }

    public Builder creditCardData(TransactionCreditCardData creditCardData) {
      this.creditCardData = Optional.of(creditCardData);
      return this;
    }

    public Transaction build() {
      return new Transaction(id, internalIdentification, account, collectedAt, createdAt, valueDate, accountingDate, amount, balance, currency, description, observations, merchant, category, subcategory, reference, type, status, creditCardData);
    }
  }
}
