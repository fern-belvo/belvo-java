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
    builder = RiskInsights.Builder.class
)
public final class RiskInsights {
  private final String id;

  private final String link;

  private final Optional<List<String>> accounts;

  private final String createdAt;

  private final Optional<RiskInsightsTransactionMetrics> transactionsMetrics;

  private final Optional<RiskInsightsBalanceMetrics> balancesMetrics;

  private final Optional<RiskInsightsCashflowMetrics> cashflowMetrics;

  private final Optional<RiskInsightsCreditCardMetrics> creditCardsMetrics;

  private final Optional<RiskInsightsLoansMetrics> loansMetrics;

  private int _cachedHashCode;

  RiskInsights(String id, String link, Optional<List<String>> accounts, String createdAt,
      Optional<RiskInsightsTransactionMetrics> transactionsMetrics,
      Optional<RiskInsightsBalanceMetrics> balancesMetrics,
      Optional<RiskInsightsCashflowMetrics> cashflowMetrics,
      Optional<RiskInsightsCreditCardMetrics> creditCardsMetrics,
      Optional<RiskInsightsLoansMetrics> loansMetrics) {
    this.id = id;
    this.link = link;
    this.accounts = accounts;
    this.createdAt = createdAt;
    this.transactionsMetrics = transactionsMetrics;
    this.balancesMetrics = balancesMetrics;
    this.cashflowMetrics = cashflowMetrics;
    this.creditCardsMetrics = creditCardsMetrics;
    this.loansMetrics = loansMetrics;
  }

  /**
   * @return Belvo's unique ID for the risk insights request.
   */
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * @return The <code>link.id</code> the risk insights analysis belongs to.
   */
  @JsonProperty("link")
  public String getLink() {
    return link;
  }

  /**
   * @return An array of Belvo-generated account numbers (UUIDs) that were used during the risk insights analysis. If no accounts were found, we return an empty array.
   */
  @JsonProperty("accounts")
  public Optional<List<String>> getAccounts() {
    return accounts;
  }

  /**
   * @return The ISO-8601 timestamp of when the data point was last updated in Belvo's database.
   */
  @JsonProperty("created_at")
  public String getCreatedAt() {
    return createdAt;
  }

  @JsonProperty("transactions_metrics")
  public Optional<RiskInsightsTransactionMetrics> getTransactionsMetrics() {
    return transactionsMetrics;
  }

  @JsonProperty("balances_metrics")
  public Optional<RiskInsightsBalanceMetrics> getBalancesMetrics() {
    return balancesMetrics;
  }

  @JsonProperty("cashflow_metrics")
  public Optional<RiskInsightsCashflowMetrics> getCashflowMetrics() {
    return cashflowMetrics;
  }

  @JsonProperty("credit_cards_metrics")
  public Optional<RiskInsightsCreditCardMetrics> getCreditCardsMetrics() {
    return creditCardsMetrics;
  }

  @JsonProperty("loans_metrics")
  public Optional<RiskInsightsLoansMetrics> getLoansMetrics() {
    return loansMetrics;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof RiskInsights && equalTo((RiskInsights) other);
  }

  private boolean equalTo(RiskInsights other) {
    return id.equals(other.id) && link.equals(other.link) && accounts.equals(other.accounts) && createdAt.equals(other.createdAt) && transactionsMetrics.equals(other.transactionsMetrics) && balancesMetrics.equals(other.balancesMetrics) && cashflowMetrics.equals(other.cashflowMetrics) && creditCardsMetrics.equals(other.creditCardsMetrics) && loansMetrics.equals(other.loansMetrics);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.id, this.link, this.accounts, this.createdAt, this.transactionsMetrics, this.balancesMetrics, this.cashflowMetrics, this.creditCardsMetrics, this.loansMetrics);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "RiskInsights{" + "id: " + id + ", link: " + link + ", accounts: " + accounts + ", createdAt: " + createdAt + ", transactionsMetrics: " + transactionsMetrics + ", balancesMetrics: " + balancesMetrics + ", cashflowMetrics: " + cashflowMetrics + ", creditCardsMetrics: " + creditCardsMetrics + ", loansMetrics: " + loansMetrics + "}";
  }

  public static IdStage builder() {
    return new Builder();
  }

  public interface IdStage {
    LinkStage id(String id);

    Builder from(RiskInsights other);
  }

  public interface LinkStage {
    CreatedAtStage link(String link);
  }

  public interface CreatedAtStage {
    _FinalStage createdAt(String createdAt);
  }

  public interface _FinalStage {
    RiskInsights build();

    _FinalStage accounts(Optional<List<String>> accounts);

    _FinalStage accounts(List<String> accounts);

    _FinalStage transactionsMetrics(Optional<RiskInsightsTransactionMetrics> transactionsMetrics);

    _FinalStage transactionsMetrics(RiskInsightsTransactionMetrics transactionsMetrics);

    _FinalStage balancesMetrics(Optional<RiskInsightsBalanceMetrics> balancesMetrics);

    _FinalStage balancesMetrics(RiskInsightsBalanceMetrics balancesMetrics);

    _FinalStage cashflowMetrics(Optional<RiskInsightsCashflowMetrics> cashflowMetrics);

    _FinalStage cashflowMetrics(RiskInsightsCashflowMetrics cashflowMetrics);

    _FinalStage creditCardsMetrics(Optional<RiskInsightsCreditCardMetrics> creditCardsMetrics);

    _FinalStage creditCardsMetrics(RiskInsightsCreditCardMetrics creditCardsMetrics);

    _FinalStage loansMetrics(Optional<RiskInsightsLoansMetrics> loansMetrics);

    _FinalStage loansMetrics(RiskInsightsLoansMetrics loansMetrics);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements IdStage, LinkStage, CreatedAtStage, _FinalStage {
    private String id;

    private String link;

    private String createdAt;

    private Optional<RiskInsightsLoansMetrics> loansMetrics = Optional.empty();

    private Optional<RiskInsightsCreditCardMetrics> creditCardsMetrics = Optional.empty();

    private Optional<RiskInsightsCashflowMetrics> cashflowMetrics = Optional.empty();

    private Optional<RiskInsightsBalanceMetrics> balancesMetrics = Optional.empty();

    private Optional<RiskInsightsTransactionMetrics> transactionsMetrics = Optional.empty();

    private Optional<List<String>> accounts = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(RiskInsights other) {
      id(other.getId());
      link(other.getLink());
      accounts(other.getAccounts());
      createdAt(other.getCreatedAt());
      transactionsMetrics(other.getTransactionsMetrics());
      balancesMetrics(other.getBalancesMetrics());
      cashflowMetrics(other.getCashflowMetrics());
      creditCardsMetrics(other.getCreditCardsMetrics());
      loansMetrics(other.getLoansMetrics());
      return this;
    }

    /**
     * <p>Belvo's unique ID for the risk insights request.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("id")
    public LinkStage id(String id) {
      this.id = id;
      return this;
    }

    /**
     * <p>The <code>link.id</code> the risk insights analysis belongs to.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("link")
    public CreatedAtStage link(String link) {
      this.link = link;
      return this;
    }

    /**
     * <p>The ISO-8601 timestamp of when the data point was last updated in Belvo's database.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("created_at")
    public _FinalStage createdAt(String createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    @Override
    public _FinalStage loansMetrics(RiskInsightsLoansMetrics loansMetrics) {
      this.loansMetrics = Optional.of(loansMetrics);
      return this;
    }

    @Override
    @JsonSetter(
        value = "loans_metrics",
        nulls = Nulls.SKIP
    )
    public _FinalStage loansMetrics(Optional<RiskInsightsLoansMetrics> loansMetrics) {
      this.loansMetrics = loansMetrics;
      return this;
    }

    @Override
    public _FinalStage creditCardsMetrics(RiskInsightsCreditCardMetrics creditCardsMetrics) {
      this.creditCardsMetrics = Optional.of(creditCardsMetrics);
      return this;
    }

    @Override
    @JsonSetter(
        value = "credit_cards_metrics",
        nulls = Nulls.SKIP
    )
    public _FinalStage creditCardsMetrics(
        Optional<RiskInsightsCreditCardMetrics> creditCardsMetrics) {
      this.creditCardsMetrics = creditCardsMetrics;
      return this;
    }

    @Override
    public _FinalStage cashflowMetrics(RiskInsightsCashflowMetrics cashflowMetrics) {
      this.cashflowMetrics = Optional.of(cashflowMetrics);
      return this;
    }

    @Override
    @JsonSetter(
        value = "cashflow_metrics",
        nulls = Nulls.SKIP
    )
    public _FinalStage cashflowMetrics(Optional<RiskInsightsCashflowMetrics> cashflowMetrics) {
      this.cashflowMetrics = cashflowMetrics;
      return this;
    }

    @Override
    public _FinalStage balancesMetrics(RiskInsightsBalanceMetrics balancesMetrics) {
      this.balancesMetrics = Optional.of(balancesMetrics);
      return this;
    }

    @Override
    @JsonSetter(
        value = "balances_metrics",
        nulls = Nulls.SKIP
    )
    public _FinalStage balancesMetrics(Optional<RiskInsightsBalanceMetrics> balancesMetrics) {
      this.balancesMetrics = balancesMetrics;
      return this;
    }

    @Override
    public _FinalStage transactionsMetrics(RiskInsightsTransactionMetrics transactionsMetrics) {
      this.transactionsMetrics = Optional.of(transactionsMetrics);
      return this;
    }

    @Override
    @JsonSetter(
        value = "transactions_metrics",
        nulls = Nulls.SKIP
    )
    public _FinalStage transactionsMetrics(
        Optional<RiskInsightsTransactionMetrics> transactionsMetrics) {
      this.transactionsMetrics = transactionsMetrics;
      return this;
    }

    /**
     * <p>An array of Belvo-generated account numbers (UUIDs) that were used during the risk insights analysis. If no accounts were found, we return an empty array.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage accounts(List<String> accounts) {
      this.accounts = Optional.of(accounts);
      return this;
    }

    @Override
    @JsonSetter(
        value = "accounts",
        nulls = Nulls.SKIP
    )
    public _FinalStage accounts(Optional<List<String>> accounts) {
      this.accounts = accounts;
      return this;
    }

    @Override
    public RiskInsights build() {
      return new RiskInsights(id, link, accounts, createdAt, transactionsMetrics, balancesMetrics, cashflowMetrics, creditCardsMetrics, loansMetrics);
    }
  }
}
