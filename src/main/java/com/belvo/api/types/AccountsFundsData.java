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
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = AccountsFundsData.Builder.class
)
public final class AccountsFundsData {
  private final Optional<String> collectedAt;

  private final Optional<String> name;

  private final Optional<String> type;

  private final Optional<List<AccountsFundsDataPublicIdentifications>> publicIdentifications;

  private final Optional<Double> balance;

  private final Optional<Double> percentage;

  private int _cachedHashCode;

  AccountsFundsData(Optional<String> collectedAt, Optional<String> name, Optional<String> type,
      Optional<List<AccountsFundsDataPublicIdentifications>> publicIdentifications,
      Optional<Double> balance, Optional<Double> percentage) {
    this.collectedAt = collectedAt;
    this.name = name;
    this.type = type;
    this.publicIdentifications = publicIdentifications;
    this.balance = balance;
    this.percentage = percentage;
  }

  /**
   * @return The ISO-8601 timestamp when the data point was collected.
   */
  @JsonProperty("collected_at")
  public Optional<String> getCollectedAt() {
    return collectedAt;
  }

  /**
   * @return The pension fund name.
   */
  @JsonProperty("name")
  public Optional<String> getName() {
    return name;
  }

  /**
   * @return Type of pension fund.
   */
  @JsonProperty("type")
  public Optional<String> getType() {
    return type;
  }

  /**
   * @return The fund's public IDs.
   */
  @JsonProperty("public_identifications")
  public Optional<List<AccountsFundsDataPublicIdentifications>> getPublicIdentifications() {
    return publicIdentifications;
  }

  /**
   * @return The amount in the fund.
   */
  @JsonProperty("balance")
  public Optional<Double> getBalance() {
    return balance;
  }

  /**
   * @return How much this fund, as a percentage, contributes to the pension account's total.
   */
  @JsonProperty("percentage")
  public Optional<Double> getPercentage() {
    return percentage;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AccountsFundsData && equalTo((AccountsFundsData) other);
  }

  private boolean equalTo(AccountsFundsData other) {
    return collectedAt.equals(other.collectedAt) && name.equals(other.name) && type.equals(other.type) && publicIdentifications.equals(other.publicIdentifications) && balance.equals(other.balance) && percentage.equals(other.percentage);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.collectedAt, this.name, this.type, this.publicIdentifications, this.balance, this.percentage);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AccountsFundsData{" + "collectedAt: " + collectedAt + ", name: " + name + ", type: " + type + ", publicIdentifications: " + publicIdentifications + ", balance: " + balance + ", percentage: " + percentage + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> collectedAt = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Optional<String> type = Optional.empty();

    private Optional<List<AccountsFundsDataPublicIdentifications>> publicIdentifications = Optional.empty();

    private Optional<Double> balance = Optional.empty();

    private Optional<Double> percentage = Optional.empty();

    private Builder() {
    }

    public Builder from(AccountsFundsData other) {
      collectedAt(other.getCollectedAt());
      name(other.getName());
      type(other.getType());
      publicIdentifications(other.getPublicIdentifications());
      balance(other.getBalance());
      percentage(other.getPercentage());
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
        value = "name",
        nulls = Nulls.SKIP
    )
    public Builder name(Optional<String> name) {
      this.name = name;
      return this;
    }

    public Builder name(String name) {
      this.name = Optional.of(name);
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
        value = "public_identifications",
        nulls = Nulls.SKIP
    )
    public Builder publicIdentifications(
        Optional<List<AccountsFundsDataPublicIdentifications>> publicIdentifications) {
      this.publicIdentifications = publicIdentifications;
      return this;
    }

    public Builder publicIdentifications(
        List<AccountsFundsDataPublicIdentifications> publicIdentifications) {
      this.publicIdentifications = Optional.of(publicIdentifications);
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
        value = "percentage",
        nulls = Nulls.SKIP
    )
    public Builder percentage(Optional<Double> percentage) {
      this.percentage = percentage;
      return this;
    }

    public Builder percentage(Double percentage) {
      this.percentage = Optional.of(percentage);
      return this;
    }

    public AccountsFundsData build() {
      return new AccountsFundsData(collectedAt, name, type, publicIdentifications, balance, percentage);
    }
  }
}
