package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = Categorization.Builder.class
)
public final class Categorization {
  private final Optional<List<CategorizationBody>> transactions;

  private int _cachedHashCode;

  Categorization(Optional<List<CategorizationBody>> transactions) {
    this.transactions = transactions;
  }

  /**
   * @return An array of enriched transaction objects.
   */
  @JsonProperty("transactions")
  public Optional<List<CategorizationBody>> getTransactions() {
    return transactions;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof Categorization && equalTo((Categorization) other);
  }

  private boolean equalTo(Categorization other) {
    return transactions.equals(other.transactions);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.transactions);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "Categorization{" + "transactions: " + transactions + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<List<CategorizationBody>> transactions = Optional.empty();

    private Builder() {
    }

    public Builder from(Categorization other) {
      transactions(other.getTransactions());
      return this;
    }

    @JsonSetter(
        value = "transactions",
        nulls = Nulls.SKIP
    )
    public Builder transactions(Optional<List<CategorizationBody>> transactions) {
      this.transactions = transactions;
      return this;
    }

    public Builder transactions(List<CategorizationBody> transactions) {
      this.transactions = Optional.of(transactions);
      return this;
    }

    public Categorization build() {
      return new Categorization(transactions);
    }
  }
}
