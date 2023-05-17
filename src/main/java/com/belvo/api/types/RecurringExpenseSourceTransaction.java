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
    builder = RecurringExpenseSourceTransaction.Builder.class
)
public final class RecurringExpenseSourceTransaction {
  private final double amount;

  private final Optional<String> description;

  private final String valueDate;

  private int _cachedHashCode;

  RecurringExpenseSourceTransaction(double amount, Optional<String> description, String valueDate) {
    this.amount = amount;
    this.description = description;
    this.valueDate = valueDate;
  }

  /**
   * @return The transaction amount.
   */
  @JsonProperty("amount")
  public double getAmount() {
    return amount;
  }

  /**
   * @return The description of the transaction provided by the institution. Usually, this is the text that the end user would see in the bank statement. The description can be an empty string.
   */
  @JsonProperty("description")
  public Optional<String> getDescription() {
    return description;
  }

  /**
   * @return The date when the transaction occurred, in <code>YYYY-MM-DD</code> format.
   */
  @JsonProperty("value_date")
  public String getValueDate() {
    return valueDate;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof RecurringExpenseSourceTransaction && equalTo((RecurringExpenseSourceTransaction) other);
  }

  private boolean equalTo(RecurringExpenseSourceTransaction other) {
    return amount == other.amount && description.equals(other.description) && valueDate.equals(other.valueDate);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.amount, this.description, this.valueDate);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "RecurringExpenseSourceTransaction{" + "amount: " + amount + ", description: " + description + ", valueDate: " + valueDate + "}";
  }

  public static AmountStage builder() {
    return new Builder();
  }

  public interface AmountStage {
    ValueDateStage amount(double amount);

    Builder from(RecurringExpenseSourceTransaction other);
  }

  public interface ValueDateStage {
    _FinalStage valueDate(String valueDate);
  }

  public interface _FinalStage {
    RecurringExpenseSourceTransaction build();

    _FinalStage description(Optional<String> description);

    _FinalStage description(String description);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements AmountStage, ValueDateStage, _FinalStage {
    private double amount;

    private String valueDate;

    private Optional<String> description = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(RecurringExpenseSourceTransaction other) {
      amount(other.getAmount());
      description(other.getDescription());
      valueDate(other.getValueDate());
      return this;
    }

    /**
     * <p>The transaction amount.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("amount")
    public ValueDateStage amount(double amount) {
      this.amount = amount;
      return this;
    }

    /**
     * <p>The date when the transaction occurred, in <code>YYYY-MM-DD</code> format.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("value_date")
    public _FinalStage valueDate(String valueDate) {
      this.valueDate = valueDate;
      return this;
    }

    /**
     * <p>The description of the transaction provided by the institution. Usually, this is the text that the end user would see in the bank statement. The description can be an empty string.</p>
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

    @Override
    public RecurringExpenseSourceTransaction build() {
      return new RecurringExpenseSourceTransaction(amount, description, valueDate);
    }
  }
}
