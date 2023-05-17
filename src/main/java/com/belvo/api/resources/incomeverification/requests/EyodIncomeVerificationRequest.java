package com.belvo.api.resources.incomeverification.requests;

import com.belvo.api.types.EnumIncomeMinimumConfidenceLevelRequest;
import com.belvo.api.types.EnumInvoiceAllowedIncomeTypesRequest;
import com.belvo.api.types.EyodIncomeVerificationBodyRequest;
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
    builder = EyodIncomeVerificationRequest.Builder.class
)
public final class EyodIncomeVerificationRequest {
  private final String language;

  private final List<EyodIncomeVerificationBodyRequest> transactions;

  private final Optional<String> dateFrom;

  private final Optional<String> dateTo;

  private final Optional<List<EnumInvoiceAllowedIncomeTypesRequest>> allowedIncomeTypes;

  private final Optional<EnumIncomeMinimumConfidenceLevelRequest> minimumConfidenceLevel;

  private int _cachedHashCode;

  EyodIncomeVerificationRequest(String language,
      List<EyodIncomeVerificationBodyRequest> transactions, Optional<String> dateFrom,
      Optional<String> dateTo,
      Optional<List<EnumInvoiceAllowedIncomeTypesRequest>> allowedIncomeTypes,
      Optional<EnumIncomeMinimumConfidenceLevelRequest> minimumConfidenceLevel) {
    this.language = language;
    this.transactions = transactions;
    this.dateFrom = dateFrom;
    this.dateTo = dateTo;
    this.allowedIncomeTypes = allowedIncomeTypes;
    this.minimumConfidenceLevel = minimumConfidenceLevel;
  }

  /**
   * @return Two-letter ISO 639-1 code for the language of the transaction.
   */
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }

  /**
   * @return An array of transaction objects that you want enriched.
   * <p><strong>Note:</strong> Each object corresponds to one, unique transaction and you can send through up to 10,000 transactions per request.</p>
   */
  @JsonProperty("transactions")
  public List<EyodIncomeVerificationBodyRequest> getTransactions() {
    return transactions;
  }

  /**
   * @return The date from which you want to start getting incomes for, in <code>YYYY-MM-DD</code> format, within the last 365 days. When you use this parameter, you must also send <code>date_to</code>.
   * <p>⚠️ The value of <code>date_from</code> cannot be greater than <code>date_to</code>.</p>
   */
  @JsonProperty("date_from")
  public Optional<String> getDateFrom() {
    return dateFrom;
  }

  /**
   * @return The date you want to stop getting incomes for, in <code>YYYY-MM-DD</code> format, within the last 365 days. When you use this parameter, you must also send <code>date_from</code>.
   * <p>⚠️ The value of <code>date_to</code> cannot be greater than today's date (in other words, no future dates).</p>
   */
  @JsonProperty("date_to")
  public Optional<String> getDateTo() {
    return dateTo;
  }

  @JsonProperty("allowed_income_types")
  public Optional<List<EnumInvoiceAllowedIncomeTypesRequest>> getAllowedIncomeTypes() {
    return allowedIncomeTypes;
  }

  @JsonProperty("minimum_confidence_level")
  public Optional<EnumIncomeMinimumConfidenceLevelRequest> getMinimumConfidenceLevel() {
    return minimumConfidenceLevel;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof EyodIncomeVerificationRequest && equalTo((EyodIncomeVerificationRequest) other);
  }

  private boolean equalTo(EyodIncomeVerificationRequest other) {
    return language.equals(other.language) && transactions.equals(other.transactions) && dateFrom.equals(other.dateFrom) && dateTo.equals(other.dateTo) && allowedIncomeTypes.equals(other.allowedIncomeTypes) && minimumConfidenceLevel.equals(other.minimumConfidenceLevel);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.language, this.transactions, this.dateFrom, this.dateTo, this.allowedIncomeTypes, this.minimumConfidenceLevel);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "EyodIncomeVerificationRequest{" + "language: " + language + ", transactions: " + transactions + ", dateFrom: " + dateFrom + ", dateTo: " + dateTo + ", allowedIncomeTypes: " + allowedIncomeTypes + ", minimumConfidenceLevel: " + minimumConfidenceLevel + "}";
  }

  public static LanguageStage builder() {
    return new Builder();
  }

  public interface LanguageStage {
    _FinalStage language(String language);

    Builder from(EyodIncomeVerificationRequest other);
  }

  public interface _FinalStage {
    EyodIncomeVerificationRequest build();

    _FinalStage transactions(List<EyodIncomeVerificationBodyRequest> transactions);

    _FinalStage addTransactions(EyodIncomeVerificationBodyRequest transactions);

    _FinalStage addAllTransactions(List<EyodIncomeVerificationBodyRequest> transactions);

    _FinalStage dateFrom(Optional<String> dateFrom);

    _FinalStage dateFrom(String dateFrom);

    _FinalStage dateTo(Optional<String> dateTo);

    _FinalStage dateTo(String dateTo);

    _FinalStage allowedIncomeTypes(
        Optional<List<EnumInvoiceAllowedIncomeTypesRequest>> allowedIncomeTypes);

    _FinalStage allowedIncomeTypes(List<EnumInvoiceAllowedIncomeTypesRequest> allowedIncomeTypes);

    _FinalStage minimumConfidenceLevel(
        Optional<EnumIncomeMinimumConfidenceLevelRequest> minimumConfidenceLevel);

    _FinalStage minimumConfidenceLevel(
        EnumIncomeMinimumConfidenceLevelRequest minimumConfidenceLevel);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements LanguageStage, _FinalStage {
    private String language;

    private Optional<EnumIncomeMinimumConfidenceLevelRequest> minimumConfidenceLevel = Optional.empty();

    private Optional<List<EnumInvoiceAllowedIncomeTypesRequest>> allowedIncomeTypes = Optional.empty();

    private Optional<String> dateTo = Optional.empty();

    private Optional<String> dateFrom = Optional.empty();

    private List<EyodIncomeVerificationBodyRequest> transactions = new ArrayList<>();

    private Builder() {
    }

    @Override
    public Builder from(EyodIncomeVerificationRequest other) {
      language(other.getLanguage());
      transactions(other.getTransactions());
      dateFrom(other.getDateFrom());
      dateTo(other.getDateTo());
      allowedIncomeTypes(other.getAllowedIncomeTypes());
      minimumConfidenceLevel(other.getMinimumConfidenceLevel());
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

    @Override
    public _FinalStage minimumConfidenceLevel(
        EnumIncomeMinimumConfidenceLevelRequest minimumConfidenceLevel) {
      this.minimumConfidenceLevel = Optional.of(minimumConfidenceLevel);
      return this;
    }

    @Override
    @JsonSetter(
        value = "minimum_confidence_level",
        nulls = Nulls.SKIP
    )
    public _FinalStage minimumConfidenceLevel(
        Optional<EnumIncomeMinimumConfidenceLevelRequest> minimumConfidenceLevel) {
      this.minimumConfidenceLevel = minimumConfidenceLevel;
      return this;
    }

    @Override
    public _FinalStage allowedIncomeTypes(
        List<EnumInvoiceAllowedIncomeTypesRequest> allowedIncomeTypes) {
      this.allowedIncomeTypes = Optional.of(allowedIncomeTypes);
      return this;
    }

    @Override
    @JsonSetter(
        value = "allowed_income_types",
        nulls = Nulls.SKIP
    )
    public _FinalStage allowedIncomeTypes(
        Optional<List<EnumInvoiceAllowedIncomeTypesRequest>> allowedIncomeTypes) {
      this.allowedIncomeTypes = allowedIncomeTypes;
      return this;
    }

    /**
     * <p>The date you want to stop getting incomes for, in <code>YYYY-MM-DD</code> format, within the last 365 days. When you use this parameter, you must also send <code>date_from</code>.</p>
     * <p>⚠️ The value of <code>date_to</code> cannot be greater than today's date (in other words, no future dates).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage dateTo(String dateTo) {
      this.dateTo = Optional.of(dateTo);
      return this;
    }

    @Override
    @JsonSetter(
        value = "date_to",
        nulls = Nulls.SKIP
    )
    public _FinalStage dateTo(Optional<String> dateTo) {
      this.dateTo = dateTo;
      return this;
    }

    /**
     * <p>The date from which you want to start getting incomes for, in <code>YYYY-MM-DD</code> format, within the last 365 days. When you use this parameter, you must also send <code>date_to</code>.</p>
     * <p>⚠️ The value of <code>date_from</code> cannot be greater than <code>date_to</code>.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage dateFrom(String dateFrom) {
      this.dateFrom = Optional.of(dateFrom);
      return this;
    }

    @Override
    @JsonSetter(
        value = "date_from",
        nulls = Nulls.SKIP
    )
    public _FinalStage dateFrom(Optional<String> dateFrom) {
      this.dateFrom = dateFrom;
      return this;
    }

    /**
     * <p>An array of transaction objects that you want enriched.</p>
     * <p><strong>Note:</strong> Each object corresponds to one, unique transaction and you can send through up to 10,000 transactions per request.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage addAllTransactions(List<EyodIncomeVerificationBodyRequest> transactions) {
      this.transactions.addAll(transactions);
      return this;
    }

    /**
     * <p>An array of transaction objects that you want enriched.</p>
     * <p><strong>Note:</strong> Each object corresponds to one, unique transaction and you can send through up to 10,000 transactions per request.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage addTransactions(EyodIncomeVerificationBodyRequest transactions) {
      this.transactions.add(transactions);
      return this;
    }

    @Override
    @JsonSetter(
        value = "transactions",
        nulls = Nulls.SKIP
    )
    public _FinalStage transactions(List<EyodIncomeVerificationBodyRequest> transactions) {
      this.transactions.clear();
      this.transactions.addAll(transactions);
      return this;
    }

    @Override
    public EyodIncomeVerificationRequest build() {
      return new EyodIncomeVerificationRequest(language, transactions, dateFrom, dateTo, allowedIncomeTypes, minimumConfidenceLevel);
    }
  }
}
