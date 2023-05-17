package com.belvo.api.resources.categorization.requests;

import com.belvo.api.types.CategorizationBodyRequest;
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

@JsonDeserialize(
    builder = CategorizationRequest.Builder.class
)
public final class CategorizationRequest {
  private final String language;

  private final List<CategorizationBodyRequest> transactions;

  private int _cachedHashCode;

  CategorizationRequest(String language, List<CategorizationBodyRequest> transactions) {
    this.language = language;
    this.transactions = transactions;
  }

  /**
   * @return Two-letter ISO 639-1 code for the language of the transaction.
   */
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }

  /**
   * @return An array of transaction objects that you want categorized.
   * <p><strong>Note:</strong> Each object corresponds to one, unique transaction and you can send through up to 10,000 transactions per request.</p>
   */
  @JsonProperty("transactions")
  public List<CategorizationBodyRequest> getTransactions() {
    return transactions;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof CategorizationRequest && equalTo((CategorizationRequest) other);
  }

  private boolean equalTo(CategorizationRequest other) {
    return language.equals(other.language) && transactions.equals(other.transactions);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.language, this.transactions);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "CategorizationRequest{" + "language: " + language + ", transactions: " + transactions + "}";
  }

  public static LanguageStage builder() {
    return new Builder();
  }

  public interface LanguageStage {
    _FinalStage language(String language);

    Builder from(CategorizationRequest other);
  }

  public interface _FinalStage {
    CategorizationRequest build();

    _FinalStage transactions(List<CategorizationBodyRequest> transactions);

    _FinalStage addTransactions(CategorizationBodyRequest transactions);

    _FinalStage addAllTransactions(List<CategorizationBodyRequest> transactions);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements LanguageStage, _FinalStage {
    private String language;

    private List<CategorizationBodyRequest> transactions = new ArrayList<>();

    private Builder() {
    }

    @Override
    public Builder from(CategorizationRequest other) {
      language(other.getLanguage());
      transactions(other.getTransactions());
      return this;
    }

    /**
     * <p>Two-letter ISO 639-1 code for the language of the transaction.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("language")
    public _FinalStage language(String language) {
      this.language = language;
      return this;
    }

    /**
     * <p>An array of transaction objects that you want categorized.</p>
     * <p><strong>Note:</strong> Each object corresponds to one, unique transaction and you can send through up to 10,000 transactions per request.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage addAllTransactions(List<CategorizationBodyRequest> transactions) {
      this.transactions.addAll(transactions);
      return this;
    }

    /**
     * <p>An array of transaction objects that you want categorized.</p>
     * <p><strong>Note:</strong> Each object corresponds to one, unique transaction and you can send through up to 10,000 transactions per request.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage addTransactions(CategorizationBodyRequest transactions) {
      this.transactions.add(transactions);
      return this;
    }

    @Override
    @JsonSetter(
        value = "transactions",
        nulls = Nulls.SKIP
    )
    public _FinalStage transactions(List<CategorizationBodyRequest> transactions) {
      this.transactions.clear();
      this.transactions.addAll(transactions);
      return this;
    }

    @Override
    public CategorizationRequest build() {
      return new CategorizationRequest(language, transactions);
    }
  }
}
