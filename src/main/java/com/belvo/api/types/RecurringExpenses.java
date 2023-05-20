package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = RecurringExpenses.Builder.class
)
public final class RecurringExpenses {
  private final Optional<String> id;

  private final Optional<Account> account;

  private final Optional<String> name;

  private final List<Optional<RecurringExpenseSourceTransaction>> transactions;

  private final EnumRecurringExpenseFrequency frequency;

  private final double averageTransactionAmount;

  private final double medianTransactionAmount;

  private final int daysSinceLastTransaction;

  private final EnumRecurringExpenseCategory category;

  private final Optional<EnumRecurringExpensePaymentType> paymentType;

  private int _cachedHashCode;

  RecurringExpenses(Optional<String> id, Optional<Account> account, Optional<String> name,
      List<Optional<RecurringExpenseSourceTransaction>> transactions,
      EnumRecurringExpenseFrequency frequency, double averageTransactionAmount,
      double medianTransactionAmount, int daysSinceLastTransaction,
      EnumRecurringExpenseCategory category,
      Optional<EnumRecurringExpensePaymentType> paymentType) {
    this.id = id;
    this.account = account;
    this.name = name;
    this.transactions = transactions;
    this.frequency = frequency;
    this.averageTransactionAmount = averageTransactionAmount;
    this.medianTransactionAmount = medianTransactionAmount;
    this.daysSinceLastTransaction = daysSinceLastTransaction;
    this.category = category;
    this.paymentType = paymentType;
  }

  /**
   * @return Belvo's unique identifier used to reference the current recurring expense.
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
   * @return The name for the recurring expense.
   * <p>ℹ️ <strong>Note</strong>: This information is taken from the description section of a transaction and then normalized to provide you with an easy-to-read name. As such, sometimes the name will reflect the merchant the payment is made to (for example, Netflix.com), while for other recurring expenses, this could be something like &quot;Monthly payment to John&quot;.</p>
   */
  @JsonProperty("name")
  public Optional<String> getName() {
    return name;
  }

  /**
   * @return An array of minified transaction objects used to evaluate the recurring expense. If no transactions were found, we return an empty array.
   */
  @JsonProperty("transactions")
  public List<Optional<RecurringExpenseSourceTransaction>> getTransactions() {
    return transactions;
  }

  @JsonProperty("frequency")
  public EnumRecurringExpenseFrequency getFrequency() {
    return frequency;
  }

  /**
   * @return The average transaction amount of the recurring expense.
   */
  @JsonProperty("average_transaction_amount")
  public double getAverageTransactionAmount() {
    return averageTransactionAmount;
  }

  /**
   * @return The median transaction amount of the recurring expense.
   */
  @JsonProperty("median_transaction_amount")
  public double getMedianTransactionAmount() {
    return medianTransactionAmount;
  }

  /**
   * @return Number of days since the last recurring expense occurred.
   * <p>Based on the frequency, you can infer how many days until the next charge will occur.</p>
   */
  @JsonProperty("days_since_last_transaction")
  public int getDaysSinceLastTransaction() {
    return daysSinceLastTransaction;
  }

  @JsonProperty("category")
  public EnumRecurringExpenseCategory getCategory() {
    return category;
  }

  @JsonProperty("payment_type")
  public Optional<EnumRecurringExpensePaymentType> getPaymentType() {
    return paymentType;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof RecurringExpenses && equalTo((RecurringExpenses) other);
  }

  private boolean equalTo(RecurringExpenses other) {
    return id.equals(other.id) && account.equals(other.account) && name.equals(other.name) && transactions.equals(other.transactions) && frequency.equals(other.frequency) && averageTransactionAmount == other.averageTransactionAmount && medianTransactionAmount == other.medianTransactionAmount && daysSinceLastTransaction == other.daysSinceLastTransaction && category.equals(other.category) && paymentType.equals(other.paymentType);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.id, this.account, this.name, this.transactions, this.frequency, this.averageTransactionAmount, this.medianTransactionAmount, this.daysSinceLastTransaction, this.category, this.paymentType);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "RecurringExpenses{" + "id: " + id + ", account: " + account + ", name: " + name + ", transactions: " + transactions + ", frequency: " + frequency + ", averageTransactionAmount: " + averageTransactionAmount + ", medianTransactionAmount: " + medianTransactionAmount + ", daysSinceLastTransaction: " + daysSinceLastTransaction + ", category: " + category + ", paymentType: " + paymentType + "}";
  }

  public static FrequencyStage builder() {
    return new Builder();
  }

  public interface FrequencyStage {
    AverageTransactionAmountStage frequency(EnumRecurringExpenseFrequency frequency);

    Builder from(RecurringExpenses other);
  }

  public interface AverageTransactionAmountStage {
    MedianTransactionAmountStage averageTransactionAmount(double averageTransactionAmount);
  }

  public interface MedianTransactionAmountStage {
    DaysSinceLastTransactionStage medianTransactionAmount(double medianTransactionAmount);
  }

  public interface DaysSinceLastTransactionStage {
    CategoryStage daysSinceLastTransaction(int daysSinceLastTransaction);
  }

  public interface CategoryStage {
    _FinalStage category(EnumRecurringExpenseCategory category);
  }

  public interface _FinalStage {
    RecurringExpenses build();

    _FinalStage id(Optional<String> id);

    _FinalStage id(String id);

    _FinalStage account(Optional<Account> account);

    _FinalStage account(Account account);

    _FinalStage name(Optional<String> name);

    _FinalStage name(String name);

    _FinalStage transactions(List<Optional<RecurringExpenseSourceTransaction>> transactions);

    _FinalStage addTransactions(Optional<RecurringExpenseSourceTransaction> transactions);

    _FinalStage addAllTransactions(List<Optional<RecurringExpenseSourceTransaction>> transactions);

    _FinalStage paymentType(Optional<EnumRecurringExpensePaymentType> paymentType);

    _FinalStage paymentType(EnumRecurringExpensePaymentType paymentType);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements FrequencyStage, AverageTransactionAmountStage, MedianTransactionAmountStage, DaysSinceLastTransactionStage, CategoryStage, _FinalStage {
    private EnumRecurringExpenseFrequency frequency;

    private double averageTransactionAmount;

    private double medianTransactionAmount;

    private int daysSinceLastTransaction;

    private EnumRecurringExpenseCategory category;

    private Optional<EnumRecurringExpensePaymentType> paymentType = Optional.empty();

    private List<Optional<RecurringExpenseSourceTransaction>> transactions = new ArrayList<>();

    private Optional<String> name = Optional.empty();

    private Optional<Account> account = Optional.empty();

    private Optional<String> id = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(RecurringExpenses other) {
      id(other.getId());
      account(other.getAccount());
      name(other.getName());
      transactions(other.getTransactions());
      frequency(other.getFrequency());
      averageTransactionAmount(other.getAverageTransactionAmount());
      medianTransactionAmount(other.getMedianTransactionAmount());
      daysSinceLastTransaction(other.getDaysSinceLastTransaction());
      category(other.getCategory());
      paymentType(other.getPaymentType());
      return this;
    }

    @Override
    @JsonSetter("frequency")
    public AverageTransactionAmountStage frequency(EnumRecurringExpenseFrequency frequency) {
      this.frequency = frequency;
      return this;
    }

    /**
     * <p>The average transaction amount of the recurring expense.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("average_transaction_amount")
    public MedianTransactionAmountStage averageTransactionAmount(double averageTransactionAmount) {
      this.averageTransactionAmount = averageTransactionAmount;
      return this;
    }

    /**
     * <p>The median transaction amount of the recurring expense.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("median_transaction_amount")
    public DaysSinceLastTransactionStage medianTransactionAmount(double medianTransactionAmount) {
      this.medianTransactionAmount = medianTransactionAmount;
      return this;
    }

    /**
     * <p>Number of days since the last recurring expense occurred.</p>
     * <p>Based on the frequency, you can infer how many days until the next charge will occur.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("days_since_last_transaction")
    public CategoryStage daysSinceLastTransaction(int daysSinceLastTransaction) {
      this.daysSinceLastTransaction = daysSinceLastTransaction;
      return this;
    }

    @Override
    @JsonSetter("category")
    public _FinalStage category(EnumRecurringExpenseCategory category) {
      this.category = category;
      return this;
    }

    @Override
    public _FinalStage paymentType(EnumRecurringExpensePaymentType paymentType) {
      this.paymentType = Optional.of(paymentType);
      return this;
    }

    @Override
    @JsonSetter(
        value = "payment_type",
        nulls = Nulls.SKIP
    )
    public _FinalStage paymentType(Optional<EnumRecurringExpensePaymentType> paymentType) {
      this.paymentType = paymentType;
      return this;
    }

    /**
     * <p>An array of minified transaction objects used to evaluate the recurring expense. If no transactions were found, we return an empty array.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage addAllTransactions(
        List<Optional<RecurringExpenseSourceTransaction>> transactions) {
      this.transactions.addAll(transactions);
      return this;
    }

    /**
     * <p>An array of minified transaction objects used to evaluate the recurring expense. If no transactions were found, we return an empty array.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage addTransactions(Optional<RecurringExpenseSourceTransaction> transactions) {
      this.transactions.add(transactions);
      return this;
    }

    @Override
    @JsonSetter(
        value = "transactions",
        nulls = Nulls.SKIP
    )
    public _FinalStage transactions(
        List<Optional<RecurringExpenseSourceTransaction>> transactions) {
      this.transactions.clear();
      this.transactions.addAll(transactions);
      return this;
    }

    /**
     * <p>The name for the recurring expense.</p>
     * <p>ℹ️ <strong>Note</strong>: This information is taken from the description section of a transaction and then normalized to provide you with an easy-to-read name. As such, sometimes the name will reflect the merchant the payment is made to (for example, Netflix.com), while for other recurring expenses, this could be something like &quot;Monthly payment to John&quot;.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage name(String name) {
      this.name = Optional.of(name);
      return this;
    }

    @Override
    @JsonSetter(
        value = "name",
        nulls = Nulls.SKIP
    )
    public _FinalStage name(Optional<String> name) {
      this.name = name;
      return this;
    }

    @Override
    public _FinalStage account(Account account) {
      this.account = Optional.of(account);
      return this;
    }

    @Override
    @JsonSetter(
        value = "account",
        nulls = Nulls.SKIP
    )
    public _FinalStage account(Optional<Account> account) {
      this.account = account;
      return this;
    }

    /**
     * <p>Belvo's unique identifier used to reference the current recurring expense.</p>
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
    public RecurringExpenses build() {
      return new RecurringExpenses(id, account, name, transactions, frequency, averageTransactionAmount, medianTransactionAmount, daysSinceLastTransaction, category, paymentType);
    }
  }
}
