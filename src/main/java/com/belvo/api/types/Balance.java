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
    builder = Balance.Builder.class
)
public final class Balance {
  private final Optional<String> id;

  private final Optional<Account> account;

  private final Optional<String> valueDate;

  private final Optional<Double> balance;

  private final Optional<Double> currentBalance;

  private final Optional<String> statement;

  private final Optional<String> collectedAt;

  private int _cachedHashCode;

  Balance(Optional<String> id, Optional<Account> account, Optional<String> valueDate,
      Optional<Double> balance, Optional<Double> currentBalance, Optional<String> statement,
      Optional<String> collectedAt) {
    this.id = id;
    this.account = account;
    this.valueDate = valueDate;
    this.balance = balance;
    this.currentBalance = currentBalance;
    this.statement = statement;
    this.collectedAt = collectedAt;
  }

  /**
   * @return Belvo's unique ID for the balance request.
   */
  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
  }

  @JsonProperty("account")
  public Optional<Account> getAccount() {
    return account;
  }

  /**
   * @return The date when the <code>balance</code> was available, in <code>YYYY-MM-DD</code> format.
   */
  @JsonProperty("value_date")
  public Optional<String> getValueDate() {
    return valueDate;
  }

  /**
   * @return The funds available in the account by the end of the <code>value_date</code>.
   */
  @JsonProperty("balance")
  public Optional<Double> getBalance() {
    return balance;
  }

  /**
   * @return <em>This field has been deprecated. Please use the <code>balance</code> field instead.</em>
   */
  @JsonProperty("current_balance")
  public Optional<Double> getCurrentBalance() {
    return currentBalance;
  }

  /**
   * @return <em>This field has been deprecated.</em>
   * <p><em>The ID of the banking statement used to extract the <code>balance</code>.</em></p>
   */
  @JsonProperty("statement")
  public Optional<String> getStatement() {
    return statement;
  }

  /**
   * @return This field has been deprecated.
   * <p>The ISO-8601 timestamp when the data point was collected.</p>
   */
  @JsonProperty("collected_at")
  public Optional<String> getCollectedAt() {
    return collectedAt;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof Balance && equalTo((Balance) other);
  }

  private boolean equalTo(Balance other) {
    return id.equals(other.id) && account.equals(other.account) && valueDate.equals(other.valueDate) && balance.equals(other.balance) && currentBalance.equals(other.currentBalance) && statement.equals(other.statement) && collectedAt.equals(other.collectedAt);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.id, this.account, this.valueDate, this.balance, this.currentBalance, this.statement, this.collectedAt);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "Balance{" + "id: " + id + ", account: " + account + ", valueDate: " + valueDate + ", balance: " + balance + ", currentBalance: " + currentBalance + ", statement: " + statement + ", collectedAt: " + collectedAt + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> id = Optional.empty();

    private Optional<Account> account = Optional.empty();

    private Optional<String> valueDate = Optional.empty();

    private Optional<Double> balance = Optional.empty();

    private Optional<Double> currentBalance = Optional.empty();

    private Optional<String> statement = Optional.empty();

    private Optional<String> collectedAt = Optional.empty();

    private Builder() {
    }

    public Builder from(Balance other) {
      id(other.getId());
      account(other.getAccount());
      valueDate(other.getValueDate());
      balance(other.getBalance());
      currentBalance(other.getCurrentBalance());
      statement(other.getStatement());
      collectedAt(other.getCollectedAt());
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
        value = "current_balance",
        nulls = Nulls.SKIP
    )
    public Builder currentBalance(Optional<Double> currentBalance) {
      this.currentBalance = currentBalance;
      return this;
    }

    public Builder currentBalance(Double currentBalance) {
      this.currentBalance = Optional.of(currentBalance);
      return this;
    }

    @JsonSetter(
        value = "statement",
        nulls = Nulls.SKIP
    )
    public Builder statement(Optional<String> statement) {
      this.statement = statement;
      return this;
    }

    public Builder statement(String statement) {
      this.statement = Optional.of(statement);
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

    public Balance build() {
      return new Balance(id, account, valueDate, balance, currentBalance, statement, collectedAt);
    }
  }
}
