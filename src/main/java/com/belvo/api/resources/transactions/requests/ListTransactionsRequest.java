package com.belvo.api.resources.transactions.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = ListTransactionsRequest.Builder.class
)
public final class ListTransactionsRequest {
  private final Optional<Integer> page;

  private final Optional<Integer> pageSize;

  private final Optional<String> omit;

  private final Optional<String> fields;

  private final String link;

  private final Optional<String> account;

  private final Optional<String> accountBalanceAvailable;

  private final Optional<String> accountBalanceAvailableLt;

  private final Optional<String> accountBalanceAvailableLte;

  private final Optional<String> accountBalanceAvailableRange;

  private final Optional<String> accountBalanceCurrent;

  private final Optional<String> accountBalanceCurrentGt;

  private final Optional<String> accountBalanceCurrentGte;

  private final Optional<String> accountBalanceCurrentLt;

  private final Optional<String> accountBalanceCurrentLte;

  private final Optional<String> accountBalanceCurrentRange;

  private final Optional<String> accountIn;

  private final Optional<String> accountType;

  private final Optional<String> accountTypeIn;

  private final Optional<String> accountingDate;

  private final Optional<String> accountingDateGt;

  private final Optional<String> accountingDateGte;

  private final Optional<String> accountingDateLt;

  private final Optional<String> accountingDateLte;

  private final Optional<String> accountingDateRange;

  private final Optional<String> amount;

  private final Optional<String> amountGt;

  private final Optional<String> amountGte;

  private final Optional<String> amountLt;

  private final Optional<String> amountLte;

  private final Optional<String> amountRange;

  private final Optional<String> collectedAt;

  private final Optional<String> collectedAtGt;

  private final Optional<String> collectedAtGte;

  private final Optional<String> collectedAtLt;

  private final Optional<String> collectedAtLte;

  private final Optional<String> collectedAtRange;

  private final Optional<String> createdAt;

  private final Optional<String> createdAtGt;

  private final Optional<String> createdAtGte;

  private final Optional<String> createdAtLt;

  private final Optional<String> createdAtLte;

  private final Optional<String> createdAtRange;

  private final Optional<String> creditCardDataBillNameIn;

  private final Optional<String> currency;

  private final Optional<String> currencyIn;

  private final Optional<String> reference;

  private final Optional<String> referenceIn;

  private final Optional<String> status;

  private final Optional<String> statusIn;

  private final Optional<String> type;

  private final Optional<String> typeIn;

  private final Optional<String> valueDate;

  private final Optional<String> valueDateGt;

  private final Optional<String> valueDateGte;

  private final Optional<String> valueDateLt;

  private final Optional<String> valueDateLte;

  private final Optional<String> valueDateRange;

  private int _cachedHashCode;

  ListTransactionsRequest(Optional<Integer> page, Optional<Integer> pageSize, Optional<String> omit,
      Optional<String> fields, String link, Optional<String> account,
      Optional<String> accountBalanceAvailable, Optional<String> accountBalanceAvailableLt,
      Optional<String> accountBalanceAvailableLte, Optional<String> accountBalanceAvailableRange,
      Optional<String> accountBalanceCurrent, Optional<String> accountBalanceCurrentGt,
      Optional<String> accountBalanceCurrentGte, Optional<String> accountBalanceCurrentLt,
      Optional<String> accountBalanceCurrentLte, Optional<String> accountBalanceCurrentRange,
      Optional<String> accountIn, Optional<String> accountType, Optional<String> accountTypeIn,
      Optional<String> accountingDate, Optional<String> accountingDateGt,
      Optional<String> accountingDateGte, Optional<String> accountingDateLt,
      Optional<String> accountingDateLte, Optional<String> accountingDateRange,
      Optional<String> amount, Optional<String> amountGt, Optional<String> amountGte,
      Optional<String> amountLt, Optional<String> amountLte, Optional<String> amountRange,
      Optional<String> collectedAt, Optional<String> collectedAtGt, Optional<String> collectedAtGte,
      Optional<String> collectedAtLt, Optional<String> collectedAtLte,
      Optional<String> collectedAtRange, Optional<String> createdAt, Optional<String> createdAtGt,
      Optional<String> createdAtGte, Optional<String> createdAtLt, Optional<String> createdAtLte,
      Optional<String> createdAtRange, Optional<String> creditCardDataBillNameIn,
      Optional<String> currency, Optional<String> currencyIn, Optional<String> reference,
      Optional<String> referenceIn, Optional<String> status, Optional<String> statusIn,
      Optional<String> type, Optional<String> typeIn, Optional<String> valueDate,
      Optional<String> valueDateGt, Optional<String> valueDateGte, Optional<String> valueDateLt,
      Optional<String> valueDateLte, Optional<String> valueDateRange) {
    this.page = page;
    this.pageSize = pageSize;
    this.omit = omit;
    this.fields = fields;
    this.link = link;
    this.account = account;
    this.accountBalanceAvailable = accountBalanceAvailable;
    this.accountBalanceAvailableLt = accountBalanceAvailableLt;
    this.accountBalanceAvailableLte = accountBalanceAvailableLte;
    this.accountBalanceAvailableRange = accountBalanceAvailableRange;
    this.accountBalanceCurrent = accountBalanceCurrent;
    this.accountBalanceCurrentGt = accountBalanceCurrentGt;
    this.accountBalanceCurrentGte = accountBalanceCurrentGte;
    this.accountBalanceCurrentLt = accountBalanceCurrentLt;
    this.accountBalanceCurrentLte = accountBalanceCurrentLte;
    this.accountBalanceCurrentRange = accountBalanceCurrentRange;
    this.accountIn = accountIn;
    this.accountType = accountType;
    this.accountTypeIn = accountTypeIn;
    this.accountingDate = accountingDate;
    this.accountingDateGt = accountingDateGt;
    this.accountingDateGte = accountingDateGte;
    this.accountingDateLt = accountingDateLt;
    this.accountingDateLte = accountingDateLte;
    this.accountingDateRange = accountingDateRange;
    this.amount = amount;
    this.amountGt = amountGt;
    this.amountGte = amountGte;
    this.amountLt = amountLt;
    this.amountLte = amountLte;
    this.amountRange = amountRange;
    this.collectedAt = collectedAt;
    this.collectedAtGt = collectedAtGt;
    this.collectedAtGte = collectedAtGte;
    this.collectedAtLt = collectedAtLt;
    this.collectedAtLte = collectedAtLte;
    this.collectedAtRange = collectedAtRange;
    this.createdAt = createdAt;
    this.createdAtGt = createdAtGt;
    this.createdAtGte = createdAtGte;
    this.createdAtLt = createdAtLt;
    this.createdAtLte = createdAtLte;
    this.createdAtRange = createdAtRange;
    this.creditCardDataBillNameIn = creditCardDataBillNameIn;
    this.currency = currency;
    this.currencyIn = currencyIn;
    this.reference = reference;
    this.referenceIn = referenceIn;
    this.status = status;
    this.statusIn = statusIn;
    this.type = type;
    this.typeIn = typeIn;
    this.valueDate = valueDate;
    this.valueDateGt = valueDateGt;
    this.valueDateGte = valueDateGte;
    this.valueDateLt = valueDateLt;
    this.valueDateLte = valueDateLte;
    this.valueDateRange = valueDateRange;
  }

  /**
   * @return A page number within the paginated result set.
   */
  @JsonProperty("page")
  public Optional<Integer> getPage() {
    return page;
  }

  /**
   * @return Indicates how many results to return per page. By default we return 100 results per page.
   * <p>ℹ️ The minimum number of results returned per page is 1 and the maximum is 1000. If you enter a value greater than 1000, our API will default to the maximum value (1000).</p>
   */
  @JsonProperty("page_size")
  public Optional<Integer> getPageSize() {
    return pageSize;
  }

  /**
   * @return Omit certain fields from being returned in the response. For more information, see our <a href="https://developers.belvo.com/docs/searching-and-filtering">Filtering responses</a> DevPortal article.
   */
  @JsonProperty("omit")
  public Optional<String> getOmit() {
    return omit;
  }

  /**
   * @return Return only the specified fields in the response. For more information, see our <a href="https://developers.belvo.com/docs/searching-and-filtering">Filtering responses</a> DevPortal article.
   */
  @JsonProperty("fields")
  public Optional<String> getFields() {
    return fields;
  }

  /**
   * @return The <code>link.id</code> you want to filter by.
   * <p>ℹ️ We highly recommend adding the <code>account.id</code> filter as well in order to improve your performance.</p>
   */
  @JsonProperty("link")
  public String getLink() {
    return link;
  }

  /**
   * @return The <code>account.id</code> you want to filter by.
   * <p>ℹ️ We highly recommend adding the <code>account.id</code> filter in order to improve your performance.</p>
   */
  @JsonProperty("account")
  public Optional<String> getAccount() {
    return account;
  }

  /**
   * @return Return transactions that have a <code>account.balance.available</code> matching exactly this value.
   */
  @JsonProperty("account__balance__available")
  public Optional<String> getAccountBalanceAvailable() {
    return accountBalanceAvailable;
  }

  /**
   * @return Return transactions that have a <code>account.balance.available</code> less than this value.
   */
  @JsonProperty("account__balance__available__lt")
  public Optional<String> getAccountBalanceAvailableLt() {
    return accountBalanceAvailableLt;
  }

  /**
   * @return Return transactions that have a <code>account.balance.available</code> less than or equal to this value.
   */
  @JsonProperty("account__balance__available__lte")
  public Optional<String> getAccountBalanceAvailableLte() {
    return accountBalanceAvailableLte;
  }

  /**
   * @return Return transactions that have a <code>account.balance.available</code> within a range of two values.
   */
  @JsonProperty("account__balance__available__range")
  public Optional<String> getAccountBalanceAvailableRange() {
    return accountBalanceAvailableRange;
  }

  /**
   * @return Return transactions that have a <code>account.balance.current</code> matching exactly this value.
   */
  @JsonProperty("account__balance__current")
  public Optional<String> getAccountBalanceCurrent() {
    return accountBalanceCurrent;
  }

  /**
   * @return Return transactions that have a <code>account.balance.current</code> greater than this value.
   */
  @JsonProperty("account__balance__current__gt")
  public Optional<String> getAccountBalanceCurrentGt() {
    return accountBalanceCurrentGt;
  }

  /**
   * @return Return transactions that have a <code>account.balance.current</code> greater than or equal to this value.
   */
  @JsonProperty("account__balance__current__gte")
  public Optional<String> getAccountBalanceCurrentGte() {
    return accountBalanceCurrentGte;
  }

  /**
   * @return Return transactions that have a <code>account.balance.current</code> less than this value.
   */
  @JsonProperty("account__balance__current__lt")
  public Optional<String> getAccountBalanceCurrentLt() {
    return accountBalanceCurrentLt;
  }

  /**
   * @return Return transactions that have a <code>account.balance.current</code> less than or equal to this value.
   */
  @JsonProperty("account__balance__current__lte")
  public Optional<String> getAccountBalanceCurrentLte() {
    return accountBalanceCurrentLte;
  }

  /**
   * @return Return transactions that have a <code>account.balance.current</code> within a range of two values.
   */
  @JsonProperty("account__balance__current__range")
  public Optional<String> getAccountBalanceCurrentRange() {
    return accountBalanceCurrentRange;
  }

  /**
   * @return Return transactions only for these <code>account.id</code>s.
   */
  @JsonProperty("account__in")
  public Optional<String> getAccountIn() {
    return accountIn;
  }

  /**
   * @return Return information only for transactions matching this account type, as designated by the institution.
   */
  @JsonProperty("account_type")
  public Optional<String> getAccountType() {
    return accountType;
  }

  /**
   * @return Return information only for transactions matching these account types, as designated by the institution.
   */
  @JsonProperty("account_type__in")
  public Optional<String> getAccountTypeIn() {
    return accountTypeIn;
  }

  /**
   * @return Return transactions that were processed by the institution on exactly this date (<code>YYYY-MM-DD</code> or full ISO-8601 timestamp).
   */
  @JsonProperty("accounting_date")
  public Optional<String> getAccountingDate() {
    return accountingDate;
  }

  /**
   * @return Return transactions that were processed by the institution after this date (<code>YYYY-MM-DD</code> or full ISO-8601 timestamp).
   */
  @JsonProperty("accounting_date__gt")
  public Optional<String> getAccountingDateGt() {
    return accountingDateGt;
  }

  /**
   * @return Return transactions that were processed by the institution on this date or later (<code>YYYY-MM-DD</code> or full ISO-8601 timestamp).
   */
  @JsonProperty("accounting_date__gte")
  public Optional<String> getAccountingDateGte() {
    return accountingDateGte;
  }

  /**
   * @return Return transactions that were processed by the institution before this date (<code>YYYY-MM-DD</code> or full ISO-8601 timestamp).
   */
  @JsonProperty("accounting_date__lt")
  public Optional<String> getAccountingDateLt() {
    return accountingDateLt;
  }

  /**
   * @return Return transactions that were processed by the institution on this date or earlier (<code>YYYY-MM-DD</code> or full ISO-8601 timestamp).
   */
  @JsonProperty("accounting_date__lte")
  public Optional<String> getAccountingDateLte() {
    return accountingDateLte;
  }

  /**
   * @return Return transactions that were processed by the institution in this date range (<code>YYYY-MM-DD</code> or full ISO-8601 timestamp).
   */
  @JsonProperty("accounting_date__range")
  public Optional<String> getAccountingDateRange() {
    return accountingDateRange;
  }

  /**
   * @return Return transactions matching exactly this value.
   */
  @JsonProperty("amount")
  public Optional<String> getAmount() {
    return amount;
  }

  /**
   * @return Return transactions greater than this value.
   */
  @JsonProperty("amount__gt")
  public Optional<String> getAmountGt() {
    return amountGt;
  }

  /**
   * @return Return transactions greater than or equal to this value.
   */
  @JsonProperty("amount__gte")
  public Optional<String> getAmountGte() {
    return amountGte;
  }

  /**
   * @return Return transactions less than this value.
   */
  @JsonProperty("amount__lt")
  public Optional<String> getAmountLt() {
    return amountLt;
  }

  /**
   * @return Return transactions less than or equal to this value.
   */
  @JsonProperty("amount__lte")
  public Optional<String> getAmountLte() {
    return amountLte;
  }

  /**
   * @return Return transactions between these two values.
   */
  @JsonProperty("amount__range")
  public Optional<String> getAmountRange() {
    return amountRange;
  }

  /**
   * @return Return transactions that were retrieved from the institution on this date (<code>YYYY-MM-DD</code> or full <code>ISO-8601</code> timestamp).
   */
  @JsonProperty("collected_at")
  public Optional<String> getCollectedAt() {
    return collectedAt;
  }

  /**
   * @return Return transactions that were retrieved from the institution after this date (<code>YYYY-MM-DD</code> or full <code>ISO-8601</code> timestamp).
   */
  @JsonProperty("collected_at__gt")
  public Optional<String> getCollectedAtGt() {
    return collectedAtGt;
  }

  /**
   * @return Return transactions that were retrieved from the institution after or on this date (<code>YYYY-MM-DD</code> or full <code>ISO-8601</code> timestamp).
   */
  @JsonProperty("collected_at__gte")
  public Optional<String> getCollectedAtGte() {
    return collectedAtGte;
  }

  /**
   * @return Return transactions that were retrieved from the institution before this date (<code>YYYY-MM-DD</code> or full <code>ISO-8601</code> timestamp).
   */
  @JsonProperty("collected_at__lt")
  public Optional<String> getCollectedAtLt() {
    return collectedAtLt;
  }

  /**
   * @return Return transactions that were retrieved from the institution before or on this date (<code>YYYY-MM-DD</code> or full <code>ISO-8601</code> timestamp).
   */
  @JsonProperty("collected_at__lte")
  public Optional<String> getCollectedAtLte() {
    return collectedAtLte;
  }

  /**
   * @return Return transactions that were retrieved from the institution between two dates (<code>YYYY-MM-DD</code> or full <code>ISO-8601</code> timestamp).
   */
  @JsonProperty("collected_at__range")
  public Optional<String> getCollectedAtRange() {
    return collectedAtRange;
  }

  /**
   * @return Return transactions that were last updated in Belvo's database on this date (<code>YYYY-MM-DD</code> or full <code>ISO-8601</code> timestamp).
   */
  @JsonProperty("created_at")
  public Optional<String> getCreatedAt() {
    return createdAt;
  }

  /**
   * @return Return transactions that were last updated in Belvo's database after this date (<code>YYYY-MM-DD</code> or full <code>ISO-8601</code> timestamp).
   */
  @JsonProperty("created_at__gt")
  public Optional<String> getCreatedAtGt() {
    return createdAtGt;
  }

  /**
   * @return Return transactions that were last updated in Belvo's database after or on this date (<code>YYYY-MM-DD</code> or full <code>ISO-8601</code> timestamp).
   */
  @JsonProperty("created_at__gte")
  public Optional<String> getCreatedAtGte() {
    return createdAtGte;
  }

  /**
   * @return Return transactions that were last updated in Belvo's database before this date (<code>YYYY-MM-DD</code> or full <code>ISO-8601</code> timestamp).
   */
  @JsonProperty("created_at__lt")
  public Optional<String> getCreatedAtLt() {
    return createdAtLt;
  }

  /**
   * @return Return transactions that were last updated in Belvo's database before or on this date (<code>YYYY-MM-DD</code> or full <code>ISO-8601</code> timestamp).
   */
  @JsonProperty("created_at__lte")
  public Optional<String> getCreatedAtLte() {
    return createdAtLte;
  }

  /**
   * @return Return transactions that were last updated in Belvo's database between two dates (<code>YYYY-MM-DD</code> or full <code>ISO-8601</code> timestamp).
   */
  @JsonProperty("created_at__range")
  public Optional<String> getCreatedAtRange() {
    return createdAtRange;
  }

  /**
   * @return Return transactions for one of these bill names.
   */
  @JsonProperty("credit_card_data__bill_name__in")
  public Optional<String> getCreditCardDataBillNameIn() {
    return creditCardDataBillNameIn;
  }

  /**
   * @return Return transactions in only this three-letter currency code.
   */
  @JsonProperty("currency")
  public Optional<String> getCurrency() {
    return currency;
  }

  /**
   * @return Return transactions in one of these three-letter currency codes.
   */
  @JsonProperty("currency__in")
  public Optional<String> getCurrencyIn() {
    return currencyIn;
  }

  /**
   * @return <p>transactions with this institution-assigned reference number.</p>
   */
  @JsonProperty("reference")
  public Optional<String> getReference() {
    return reference;
  }

  /**
   * @return <p>transactions with these institution-assigned reference numbers.</p>
   */
  @JsonProperty("reference__in")
  public Optional<String> getReferenceIn() {
    return referenceIn;
  }

  /**
   * @return Return transactions with this status. Can be either <code>PENDING</code>, <code>PROCESSED</code>, or <code>UNCATEGORIZED</code>.
   */
  @JsonProperty("status")
  public Optional<String> getStatus() {
    return status;
  }

  /**
   * @return Return transactions with these statuses. Can be either <code>PENDING</code>, <code>PROCESSED</code>, or <code>UNCATEGORIZED</code>.
   */
  @JsonProperty("status__in")
  public Optional<String> getStatusIn() {
    return statusIn;
  }

  /**
   * @return Return transactions with this type. Can be either <code>INFLOW</code> or <code>OUTFLOW</code>.
   */
  @JsonProperty("type")
  public Optional<String> getType() {
    return type;
  }

  /**
   * @return Return transactions with this types. Can be either <code>INFLOW</code> or <code>OUTFLOW</code>.
   */
  @JsonProperty("type__in")
  public Optional<String> getTypeIn() {
    return typeIn;
  }

  /**
   * @return Return transactions that occurred on exactly this date (<code>YYYY-MM-DD</code> or full ISO-8601 timestamp).
   */
  @JsonProperty("value_date")
  public Optional<String> getValueDate() {
    return valueDate;
  }

  /**
   * @return Return transactions that occurred after this date (<code>YYYY-MM-DD</code> or full ISO-8601 timestamp).
   */
  @JsonProperty("value_date__gt")
  public Optional<String> getValueDateGt() {
    return valueDateGt;
  }

  /**
   * @return Return transactions that occurred on this date or later (<code>YYYY-MM-DD</code> or full ISO-8601 timestamp).
   */
  @JsonProperty("value_date__gte")
  public Optional<String> getValueDateGte() {
    return valueDateGte;
  }

  /**
   * @return Return transactions that occurred before this date (<code>YYYY-MM-DD</code> or full ISO-8601 timestamp).
   */
  @JsonProperty("value_date__lt")
  public Optional<String> getValueDateLt() {
    return valueDateLt;
  }

  /**
   * @return Return transactions that occurred on this date or earlier (<code>YYYY-MM-DD</code> or full ISO-8601 timestamp).
   */
  @JsonProperty("value_date__lte")
  public Optional<String> getValueDateLte() {
    return valueDateLte;
  }

  /**
   * @return Return transactions for this date range (<code>YYYY-MM-DD</code> or full ISO-8601 timestamp).
   */
  @JsonProperty("value_date__range")
  public Optional<String> getValueDateRange() {
    return valueDateRange;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof ListTransactionsRequest && equalTo((ListTransactionsRequest) other);
  }

  private boolean equalTo(ListTransactionsRequest other) {
    return page.equals(other.page) && pageSize.equals(other.pageSize) && omit.equals(other.omit) && fields.equals(other.fields) && link.equals(other.link) && account.equals(other.account) && accountBalanceAvailable.equals(other.accountBalanceAvailable) && accountBalanceAvailableLt.equals(other.accountBalanceAvailableLt) && accountBalanceAvailableLte.equals(other.accountBalanceAvailableLte) && accountBalanceAvailableRange.equals(other.accountBalanceAvailableRange) && accountBalanceCurrent.equals(other.accountBalanceCurrent) && accountBalanceCurrentGt.equals(other.accountBalanceCurrentGt) && accountBalanceCurrentGte.equals(other.accountBalanceCurrentGte) && accountBalanceCurrentLt.equals(other.accountBalanceCurrentLt) && accountBalanceCurrentLte.equals(other.accountBalanceCurrentLte) && accountBalanceCurrentRange.equals(other.accountBalanceCurrentRange) && accountIn.equals(other.accountIn) && accountType.equals(other.accountType) && accountTypeIn.equals(other.accountTypeIn) && accountingDate.equals(other.accountingDate) && accountingDateGt.equals(other.accountingDateGt) && accountingDateGte.equals(other.accountingDateGte) && accountingDateLt.equals(other.accountingDateLt) && accountingDateLte.equals(other.accountingDateLte) && accountingDateRange.equals(other.accountingDateRange) && amount.equals(other.amount) && amountGt.equals(other.amountGt) && amountGte.equals(other.amountGte) && amountLt.equals(other.amountLt) && amountLte.equals(other.amountLte) && amountRange.equals(other.amountRange) && collectedAt.equals(other.collectedAt) && collectedAtGt.equals(other.collectedAtGt) && collectedAtGte.equals(other.collectedAtGte) && collectedAtLt.equals(other.collectedAtLt) && collectedAtLte.equals(other.collectedAtLte) && collectedAtRange.equals(other.collectedAtRange) && createdAt.equals(other.createdAt) && createdAtGt.equals(other.createdAtGt) && createdAtGte.equals(other.createdAtGte) && createdAtLt.equals(other.createdAtLt) && createdAtLte.equals(other.createdAtLte) && createdAtRange.equals(other.createdAtRange) && creditCardDataBillNameIn.equals(other.creditCardDataBillNameIn) && currency.equals(other.currency) && currencyIn.equals(other.currencyIn) && reference.equals(other.reference) && referenceIn.equals(other.referenceIn) && status.equals(other.status) && statusIn.equals(other.statusIn) && type.equals(other.type) && typeIn.equals(other.typeIn) && valueDate.equals(other.valueDate) && valueDateGt.equals(other.valueDateGt) && valueDateGte.equals(other.valueDateGte) && valueDateLt.equals(other.valueDateLt) && valueDateLte.equals(other.valueDateLte) && valueDateRange.equals(other.valueDateRange);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.page, this.pageSize, this.omit, this.fields, this.link, this.account, this.accountBalanceAvailable, this.accountBalanceAvailableLt, this.accountBalanceAvailableLte, this.accountBalanceAvailableRange, this.accountBalanceCurrent, this.accountBalanceCurrentGt, this.accountBalanceCurrentGte, this.accountBalanceCurrentLt, this.accountBalanceCurrentLte, this.accountBalanceCurrentRange, this.accountIn, this.accountType, this.accountTypeIn, this.accountingDate, this.accountingDateGt, this.accountingDateGte, this.accountingDateLt, this.accountingDateLte, this.accountingDateRange, this.amount, this.amountGt, this.amountGte, this.amountLt, this.amountLte, this.amountRange, this.collectedAt, this.collectedAtGt, this.collectedAtGte, this.collectedAtLt, this.collectedAtLte, this.collectedAtRange, this.createdAt, this.createdAtGt, this.createdAtGte, this.createdAtLt, this.createdAtLte, this.createdAtRange, this.creditCardDataBillNameIn, this.currency, this.currencyIn, this.reference, this.referenceIn, this.status, this.statusIn, this.type, this.typeIn, this.valueDate, this.valueDateGt, this.valueDateGte, this.valueDateLt, this.valueDateLte, this.valueDateRange);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "ListTransactionsRequest{" + "page: " + page + ", pageSize: " + pageSize + ", omit: " + omit + ", fields: " + fields + ", link: " + link + ", account: " + account + ", accountBalanceAvailable: " + accountBalanceAvailable + ", accountBalanceAvailableLt: " + accountBalanceAvailableLt + ", accountBalanceAvailableLte: " + accountBalanceAvailableLte + ", accountBalanceAvailableRange: " + accountBalanceAvailableRange + ", accountBalanceCurrent: " + accountBalanceCurrent + ", accountBalanceCurrentGt: " + accountBalanceCurrentGt + ", accountBalanceCurrentGte: " + accountBalanceCurrentGte + ", accountBalanceCurrentLt: " + accountBalanceCurrentLt + ", accountBalanceCurrentLte: " + accountBalanceCurrentLte + ", accountBalanceCurrentRange: " + accountBalanceCurrentRange + ", accountIn: " + accountIn + ", accountType: " + accountType + ", accountTypeIn: " + accountTypeIn + ", accountingDate: " + accountingDate + ", accountingDateGt: " + accountingDateGt + ", accountingDateGte: " + accountingDateGte + ", accountingDateLt: " + accountingDateLt + ", accountingDateLte: " + accountingDateLte + ", accountingDateRange: " + accountingDateRange + ", amount: " + amount + ", amountGt: " + amountGt + ", amountGte: " + amountGte + ", amountLt: " + amountLt + ", amountLte: " + amountLte + ", amountRange: " + amountRange + ", collectedAt: " + collectedAt + ", collectedAtGt: " + collectedAtGt + ", collectedAtGte: " + collectedAtGte + ", collectedAtLt: " + collectedAtLt + ", collectedAtLte: " + collectedAtLte + ", collectedAtRange: " + collectedAtRange + ", createdAt: " + createdAt + ", createdAtGt: " + createdAtGt + ", createdAtGte: " + createdAtGte + ", createdAtLt: " + createdAtLt + ", createdAtLte: " + createdAtLte + ", createdAtRange: " + createdAtRange + ", creditCardDataBillNameIn: " + creditCardDataBillNameIn + ", currency: " + currency + ", currencyIn: " + currencyIn + ", reference: " + reference + ", referenceIn: " + referenceIn + ", status: " + status + ", statusIn: " + statusIn + ", type: " + type + ", typeIn: " + typeIn + ", valueDate: " + valueDate + ", valueDateGt: " + valueDateGt + ", valueDateGte: " + valueDateGte + ", valueDateLt: " + valueDateLt + ", valueDateLte: " + valueDateLte + ", valueDateRange: " + valueDateRange + "}";
  }

  public static LinkStage builder() {
    return new Builder();
  }

  public interface LinkStage {
    _FinalStage link(String link);

    Builder from(ListTransactionsRequest other);
  }

  public interface _FinalStage {
    ListTransactionsRequest build();

    _FinalStage page(Optional<Integer> page);

    _FinalStage page(Integer page);

    _FinalStage pageSize(Optional<Integer> pageSize);

    _FinalStage pageSize(Integer pageSize);

    _FinalStage omit(Optional<String> omit);

    _FinalStage omit(String omit);

    _FinalStage fields(Optional<String> fields);

    _FinalStage fields(String fields);

    _FinalStage account(Optional<String> account);

    _FinalStage account(String account);

    _FinalStage accountBalanceAvailable(Optional<String> accountBalanceAvailable);

    _FinalStage accountBalanceAvailable(String accountBalanceAvailable);

    _FinalStage accountBalanceAvailableLt(Optional<String> accountBalanceAvailableLt);

    _FinalStage accountBalanceAvailableLt(String accountBalanceAvailableLt);

    _FinalStage accountBalanceAvailableLte(Optional<String> accountBalanceAvailableLte);

    _FinalStage accountBalanceAvailableLte(String accountBalanceAvailableLte);

    _FinalStage accountBalanceAvailableRange(Optional<String> accountBalanceAvailableRange);

    _FinalStage accountBalanceAvailableRange(String accountBalanceAvailableRange);

    _FinalStage accountBalanceCurrent(Optional<String> accountBalanceCurrent);

    _FinalStage accountBalanceCurrent(String accountBalanceCurrent);

    _FinalStage accountBalanceCurrentGt(Optional<String> accountBalanceCurrentGt);

    _FinalStage accountBalanceCurrentGt(String accountBalanceCurrentGt);

    _FinalStage accountBalanceCurrentGte(Optional<String> accountBalanceCurrentGte);

    _FinalStage accountBalanceCurrentGte(String accountBalanceCurrentGte);

    _FinalStage accountBalanceCurrentLt(Optional<String> accountBalanceCurrentLt);

    _FinalStage accountBalanceCurrentLt(String accountBalanceCurrentLt);

    _FinalStage accountBalanceCurrentLte(Optional<String> accountBalanceCurrentLte);

    _FinalStage accountBalanceCurrentLte(String accountBalanceCurrentLte);

    _FinalStage accountBalanceCurrentRange(Optional<String> accountBalanceCurrentRange);

    _FinalStage accountBalanceCurrentRange(String accountBalanceCurrentRange);

    _FinalStage accountIn(Optional<String> accountIn);

    _FinalStage accountIn(String accountIn);

    _FinalStage accountType(Optional<String> accountType);

    _FinalStage accountType(String accountType);

    _FinalStage accountTypeIn(Optional<String> accountTypeIn);

    _FinalStage accountTypeIn(String accountTypeIn);

    _FinalStage accountingDate(Optional<String> accountingDate);

    _FinalStage accountingDate(String accountingDate);

    _FinalStage accountingDateGt(Optional<String> accountingDateGt);

    _FinalStage accountingDateGt(String accountingDateGt);

    _FinalStage accountingDateGte(Optional<String> accountingDateGte);

    _FinalStage accountingDateGte(String accountingDateGte);

    _FinalStage accountingDateLt(Optional<String> accountingDateLt);

    _FinalStage accountingDateLt(String accountingDateLt);

    _FinalStage accountingDateLte(Optional<String> accountingDateLte);

    _FinalStage accountingDateLte(String accountingDateLte);

    _FinalStage accountingDateRange(Optional<String> accountingDateRange);

    _FinalStage accountingDateRange(String accountingDateRange);

    _FinalStage amount(Optional<String> amount);

    _FinalStage amount(String amount);

    _FinalStage amountGt(Optional<String> amountGt);

    _FinalStage amountGt(String amountGt);

    _FinalStage amountGte(Optional<String> amountGte);

    _FinalStage amountGte(String amountGte);

    _FinalStage amountLt(Optional<String> amountLt);

    _FinalStage amountLt(String amountLt);

    _FinalStage amountLte(Optional<String> amountLte);

    _FinalStage amountLte(String amountLte);

    _FinalStage amountRange(Optional<String> amountRange);

    _FinalStage amountRange(String amountRange);

    _FinalStage collectedAt(Optional<String> collectedAt);

    _FinalStage collectedAt(String collectedAt);

    _FinalStage collectedAtGt(Optional<String> collectedAtGt);

    _FinalStage collectedAtGt(String collectedAtGt);

    _FinalStage collectedAtGte(Optional<String> collectedAtGte);

    _FinalStage collectedAtGte(String collectedAtGte);

    _FinalStage collectedAtLt(Optional<String> collectedAtLt);

    _FinalStage collectedAtLt(String collectedAtLt);

    _FinalStage collectedAtLte(Optional<String> collectedAtLte);

    _FinalStage collectedAtLte(String collectedAtLte);

    _FinalStage collectedAtRange(Optional<String> collectedAtRange);

    _FinalStage collectedAtRange(String collectedAtRange);

    _FinalStage createdAt(Optional<String> createdAt);

    _FinalStage createdAt(String createdAt);

    _FinalStage createdAtGt(Optional<String> createdAtGt);

    _FinalStage createdAtGt(String createdAtGt);

    _FinalStage createdAtGte(Optional<String> createdAtGte);

    _FinalStage createdAtGte(String createdAtGte);

    _FinalStage createdAtLt(Optional<String> createdAtLt);

    _FinalStage createdAtLt(String createdAtLt);

    _FinalStage createdAtLte(Optional<String> createdAtLte);

    _FinalStage createdAtLte(String createdAtLte);

    _FinalStage createdAtRange(Optional<String> createdAtRange);

    _FinalStage createdAtRange(String createdAtRange);

    _FinalStage creditCardDataBillNameIn(Optional<String> creditCardDataBillNameIn);

    _FinalStage creditCardDataBillNameIn(String creditCardDataBillNameIn);

    _FinalStage currency(Optional<String> currency);

    _FinalStage currency(String currency);

    _FinalStage currencyIn(Optional<String> currencyIn);

    _FinalStage currencyIn(String currencyIn);

    _FinalStage reference(Optional<String> reference);

    _FinalStage reference(String reference);

    _FinalStage referenceIn(Optional<String> referenceIn);

    _FinalStage referenceIn(String referenceIn);

    _FinalStage status(Optional<String> status);

    _FinalStage status(String status);

    _FinalStage statusIn(Optional<String> statusIn);

    _FinalStage statusIn(String statusIn);

    _FinalStage type(Optional<String> type);

    _FinalStage type(String type);

    _FinalStage typeIn(Optional<String> typeIn);

    _FinalStage typeIn(String typeIn);

    _FinalStage valueDate(Optional<String> valueDate);

    _FinalStage valueDate(String valueDate);

    _FinalStage valueDateGt(Optional<String> valueDateGt);

    _FinalStage valueDateGt(String valueDateGt);

    _FinalStage valueDateGte(Optional<String> valueDateGte);

    _FinalStage valueDateGte(String valueDateGte);

    _FinalStage valueDateLt(Optional<String> valueDateLt);

    _FinalStage valueDateLt(String valueDateLt);

    _FinalStage valueDateLte(Optional<String> valueDateLte);

    _FinalStage valueDateLte(String valueDateLte);

    _FinalStage valueDateRange(Optional<String> valueDateRange);

    _FinalStage valueDateRange(String valueDateRange);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements LinkStage, _FinalStage {
    private String link;

    private Optional<String> valueDateRange = Optional.empty();

    private Optional<String> valueDateLte = Optional.empty();

    private Optional<String> valueDateLt = Optional.empty();

    private Optional<String> valueDateGte = Optional.empty();

    private Optional<String> valueDateGt = Optional.empty();

    private Optional<String> valueDate = Optional.empty();

    private Optional<String> typeIn = Optional.empty();

    private Optional<String> type = Optional.empty();

    private Optional<String> statusIn = Optional.empty();

    private Optional<String> status = Optional.empty();

    private Optional<String> referenceIn = Optional.empty();

    private Optional<String> reference = Optional.empty();

    private Optional<String> currencyIn = Optional.empty();

    private Optional<String> currency = Optional.empty();

    private Optional<String> creditCardDataBillNameIn = Optional.empty();

    private Optional<String> createdAtRange = Optional.empty();

    private Optional<String> createdAtLte = Optional.empty();

    private Optional<String> createdAtLt = Optional.empty();

    private Optional<String> createdAtGte = Optional.empty();

    private Optional<String> createdAtGt = Optional.empty();

    private Optional<String> createdAt = Optional.empty();

    private Optional<String> collectedAtRange = Optional.empty();

    private Optional<String> collectedAtLte = Optional.empty();

    private Optional<String> collectedAtLt = Optional.empty();

    private Optional<String> collectedAtGte = Optional.empty();

    private Optional<String> collectedAtGt = Optional.empty();

    private Optional<String> collectedAt = Optional.empty();

    private Optional<String> amountRange = Optional.empty();

    private Optional<String> amountLte = Optional.empty();

    private Optional<String> amountLt = Optional.empty();

    private Optional<String> amountGte = Optional.empty();

    private Optional<String> amountGt = Optional.empty();

    private Optional<String> amount = Optional.empty();

    private Optional<String> accountingDateRange = Optional.empty();

    private Optional<String> accountingDateLte = Optional.empty();

    private Optional<String> accountingDateLt = Optional.empty();

    private Optional<String> accountingDateGte = Optional.empty();

    private Optional<String> accountingDateGt = Optional.empty();

    private Optional<String> accountingDate = Optional.empty();

    private Optional<String> accountTypeIn = Optional.empty();

    private Optional<String> accountType = Optional.empty();

    private Optional<String> accountIn = Optional.empty();

    private Optional<String> accountBalanceCurrentRange = Optional.empty();

    private Optional<String> accountBalanceCurrentLte = Optional.empty();

    private Optional<String> accountBalanceCurrentLt = Optional.empty();

    private Optional<String> accountBalanceCurrentGte = Optional.empty();

    private Optional<String> accountBalanceCurrentGt = Optional.empty();

    private Optional<String> accountBalanceCurrent = Optional.empty();

    private Optional<String> accountBalanceAvailableRange = Optional.empty();

    private Optional<String> accountBalanceAvailableLte = Optional.empty();

    private Optional<String> accountBalanceAvailableLt = Optional.empty();

    private Optional<String> accountBalanceAvailable = Optional.empty();

    private Optional<String> account = Optional.empty();

    private Optional<String> fields = Optional.empty();

    private Optional<String> omit = Optional.empty();

    private Optional<Integer> pageSize = Optional.empty();

    private Optional<Integer> page = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(ListTransactionsRequest other) {
      page(other.getPage());
      pageSize(other.getPageSize());
      omit(other.getOmit());
      fields(other.getFields());
      link(other.getLink());
      account(other.getAccount());
      accountBalanceAvailable(other.getAccountBalanceAvailable());
      accountBalanceAvailableLt(other.getAccountBalanceAvailableLt());
      accountBalanceAvailableLte(other.getAccountBalanceAvailableLte());
      accountBalanceAvailableRange(other.getAccountBalanceAvailableRange());
      accountBalanceCurrent(other.getAccountBalanceCurrent());
      accountBalanceCurrentGt(other.getAccountBalanceCurrentGt());
      accountBalanceCurrentGte(other.getAccountBalanceCurrentGte());
      accountBalanceCurrentLt(other.getAccountBalanceCurrentLt());
      accountBalanceCurrentLte(other.getAccountBalanceCurrentLte());
      accountBalanceCurrentRange(other.getAccountBalanceCurrentRange());
      accountIn(other.getAccountIn());
      accountType(other.getAccountType());
      accountTypeIn(other.getAccountTypeIn());
      accountingDate(other.getAccountingDate());
      accountingDateGt(other.getAccountingDateGt());
      accountingDateGte(other.getAccountingDateGte());
      accountingDateLt(other.getAccountingDateLt());
      accountingDateLte(other.getAccountingDateLte());
      accountingDateRange(other.getAccountingDateRange());
      amount(other.getAmount());
      amountGt(other.getAmountGt());
      amountGte(other.getAmountGte());
      amountLt(other.getAmountLt());
      amountLte(other.getAmountLte());
      amountRange(other.getAmountRange());
      collectedAt(other.getCollectedAt());
      collectedAtGt(other.getCollectedAtGt());
      collectedAtGte(other.getCollectedAtGte());
      collectedAtLt(other.getCollectedAtLt());
      collectedAtLte(other.getCollectedAtLte());
      collectedAtRange(other.getCollectedAtRange());
      createdAt(other.getCreatedAt());
      createdAtGt(other.getCreatedAtGt());
      createdAtGte(other.getCreatedAtGte());
      createdAtLt(other.getCreatedAtLt());
      createdAtLte(other.getCreatedAtLte());
      createdAtRange(other.getCreatedAtRange());
      creditCardDataBillNameIn(other.getCreditCardDataBillNameIn());
      currency(other.getCurrency());
      currencyIn(other.getCurrencyIn());
      reference(other.getReference());
      referenceIn(other.getReferenceIn());
      status(other.getStatus());
      statusIn(other.getStatusIn());
      type(other.getType());
      typeIn(other.getTypeIn());
      valueDate(other.getValueDate());
      valueDateGt(other.getValueDateGt());
      valueDateGte(other.getValueDateGte());
      valueDateLt(other.getValueDateLt());
      valueDateLte(other.getValueDateLte());
      valueDateRange(other.getValueDateRange());
      return this;
    }

    /**
     * <p>The <code>link.id</code> you want to filter by.</p>
     * <p>ℹ️ We highly recommend adding the <code>account.id</code> filter as well in order to improve your performance.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("link")
    public _FinalStage link(String link) {
      this.link = link;
      return this;
    }

    /**
     * <p>Return transactions for this date range (<code>YYYY-MM-DD</code> or full ISO-8601 timestamp).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage valueDateRange(String valueDateRange) {
      this.valueDateRange = Optional.of(valueDateRange);
      return this;
    }

    @Override
    @JsonSetter(
        value = "value_date__range",
        nulls = Nulls.SKIP
    )
    public _FinalStage valueDateRange(Optional<String> valueDateRange) {
      this.valueDateRange = valueDateRange;
      return this;
    }

    /**
     * <p>Return transactions that occurred on this date or earlier (<code>YYYY-MM-DD</code> or full ISO-8601 timestamp).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage valueDateLte(String valueDateLte) {
      this.valueDateLte = Optional.of(valueDateLte);
      return this;
    }

    @Override
    @JsonSetter(
        value = "value_date__lte",
        nulls = Nulls.SKIP
    )
    public _FinalStage valueDateLte(Optional<String> valueDateLte) {
      this.valueDateLte = valueDateLte;
      return this;
    }

    /**
     * <p>Return transactions that occurred before this date (<code>YYYY-MM-DD</code> or full ISO-8601 timestamp).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage valueDateLt(String valueDateLt) {
      this.valueDateLt = Optional.of(valueDateLt);
      return this;
    }

    @Override
    @JsonSetter(
        value = "value_date__lt",
        nulls = Nulls.SKIP
    )
    public _FinalStage valueDateLt(Optional<String> valueDateLt) {
      this.valueDateLt = valueDateLt;
      return this;
    }

    /**
     * <p>Return transactions that occurred on this date or later (<code>YYYY-MM-DD</code> or full ISO-8601 timestamp).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage valueDateGte(String valueDateGte) {
      this.valueDateGte = Optional.of(valueDateGte);
      return this;
    }

    @Override
    @JsonSetter(
        value = "value_date__gte",
        nulls = Nulls.SKIP
    )
    public _FinalStage valueDateGte(Optional<String> valueDateGte) {
      this.valueDateGte = valueDateGte;
      return this;
    }

    /**
     * <p>Return transactions that occurred after this date (<code>YYYY-MM-DD</code> or full ISO-8601 timestamp).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage valueDateGt(String valueDateGt) {
      this.valueDateGt = Optional.of(valueDateGt);
      return this;
    }

    @Override
    @JsonSetter(
        value = "value_date__gt",
        nulls = Nulls.SKIP
    )
    public _FinalStage valueDateGt(Optional<String> valueDateGt) {
      this.valueDateGt = valueDateGt;
      return this;
    }

    /**
     * <p>Return transactions that occurred on exactly this date (<code>YYYY-MM-DD</code> or full ISO-8601 timestamp).</p>
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
     * <p>Return transactions with this types. Can be either <code>INFLOW</code> or <code>OUTFLOW</code>.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage typeIn(String typeIn) {
      this.typeIn = Optional.of(typeIn);
      return this;
    }

    @Override
    @JsonSetter(
        value = "type__in",
        nulls = Nulls.SKIP
    )
    public _FinalStage typeIn(Optional<String> typeIn) {
      this.typeIn = typeIn;
      return this;
    }

    /**
     * <p>Return transactions with this type. Can be either <code>INFLOW</code> or <code>OUTFLOW</code>.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
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
     * <p>Return transactions with these statuses. Can be either <code>PENDING</code>, <code>PROCESSED</code>, or <code>UNCATEGORIZED</code>.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage statusIn(String statusIn) {
      this.statusIn = Optional.of(statusIn);
      return this;
    }

    @Override
    @JsonSetter(
        value = "status__in",
        nulls = Nulls.SKIP
    )
    public _FinalStage statusIn(Optional<String> statusIn) {
      this.statusIn = statusIn;
      return this;
    }

    /**
     * <p>Return transactions with this status. Can be either <code>PENDING</code>, <code>PROCESSED</code>, or <code>UNCATEGORIZED</code>.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
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

    /**
     * <p>Returns transactions with these institution-assigned reference numbers.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage referenceIn(String referenceIn) {
      this.referenceIn = Optional.of(referenceIn);
      return this;
    }

    @Override
    @JsonSetter(
        value = "reference__in",
        nulls = Nulls.SKIP
    )
    public _FinalStage referenceIn(Optional<String> referenceIn) {
      this.referenceIn = referenceIn;
      return this;
    }

    /**
     * <p>Returns transactions with this institution-assigned reference number.</p>
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

    /**
     * <p>Return transactions in one of these three-letter currency codes.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage currencyIn(String currencyIn) {
      this.currencyIn = Optional.of(currencyIn);
      return this;
    }

    @Override
    @JsonSetter(
        value = "currency__in",
        nulls = Nulls.SKIP
    )
    public _FinalStage currencyIn(Optional<String> currencyIn) {
      this.currencyIn = currencyIn;
      return this;
    }

    /**
     * <p>Return transactions in only this three-letter currency code.</p>
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
     * <p>Return transactions for one of these bill names.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage creditCardDataBillNameIn(String creditCardDataBillNameIn) {
      this.creditCardDataBillNameIn = Optional.of(creditCardDataBillNameIn);
      return this;
    }

    @Override
    @JsonSetter(
        value = "credit_card_data__bill_name__in",
        nulls = Nulls.SKIP
    )
    public _FinalStage creditCardDataBillNameIn(Optional<String> creditCardDataBillNameIn) {
      this.creditCardDataBillNameIn = creditCardDataBillNameIn;
      return this;
    }

    /**
     * <p>Return transactions that were last updated in Belvo's database between two dates (<code>YYYY-MM-DD</code> or full <code>ISO-8601</code> timestamp).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage createdAtRange(String createdAtRange) {
      this.createdAtRange = Optional.of(createdAtRange);
      return this;
    }

    @Override
    @JsonSetter(
        value = "created_at__range",
        nulls = Nulls.SKIP
    )
    public _FinalStage createdAtRange(Optional<String> createdAtRange) {
      this.createdAtRange = createdAtRange;
      return this;
    }

    /**
     * <p>Return transactions that were last updated in Belvo's database before or on this date (<code>YYYY-MM-DD</code> or full <code>ISO-8601</code> timestamp).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage createdAtLte(String createdAtLte) {
      this.createdAtLte = Optional.of(createdAtLte);
      return this;
    }

    @Override
    @JsonSetter(
        value = "created_at__lte",
        nulls = Nulls.SKIP
    )
    public _FinalStage createdAtLte(Optional<String> createdAtLte) {
      this.createdAtLte = createdAtLte;
      return this;
    }

    /**
     * <p>Return transactions that were last updated in Belvo's database before this date (<code>YYYY-MM-DD</code> or full <code>ISO-8601</code> timestamp).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage createdAtLt(String createdAtLt) {
      this.createdAtLt = Optional.of(createdAtLt);
      return this;
    }

    @Override
    @JsonSetter(
        value = "created_at__lt",
        nulls = Nulls.SKIP
    )
    public _FinalStage createdAtLt(Optional<String> createdAtLt) {
      this.createdAtLt = createdAtLt;
      return this;
    }

    /**
     * <p>Return transactions that were last updated in Belvo's database after or on this date (<code>YYYY-MM-DD</code> or full <code>ISO-8601</code> timestamp).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage createdAtGte(String createdAtGte) {
      this.createdAtGte = Optional.of(createdAtGte);
      return this;
    }

    @Override
    @JsonSetter(
        value = "created_at__gte",
        nulls = Nulls.SKIP
    )
    public _FinalStage createdAtGte(Optional<String> createdAtGte) {
      this.createdAtGte = createdAtGte;
      return this;
    }

    /**
     * <p>Return transactions that were last updated in Belvo's database after this date (<code>YYYY-MM-DD</code> or full <code>ISO-8601</code> timestamp).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage createdAtGt(String createdAtGt) {
      this.createdAtGt = Optional.of(createdAtGt);
      return this;
    }

    @Override
    @JsonSetter(
        value = "created_at__gt",
        nulls = Nulls.SKIP
    )
    public _FinalStage createdAtGt(Optional<String> createdAtGt) {
      this.createdAtGt = createdAtGt;
      return this;
    }

    /**
     * <p>Return transactions that were last updated in Belvo's database on this date (<code>YYYY-MM-DD</code> or full <code>ISO-8601</code> timestamp).</p>
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
     * <p>Return transactions that were retrieved from the institution between two dates (<code>YYYY-MM-DD</code> or full <code>ISO-8601</code> timestamp).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage collectedAtRange(String collectedAtRange) {
      this.collectedAtRange = Optional.of(collectedAtRange);
      return this;
    }

    @Override
    @JsonSetter(
        value = "collected_at__range",
        nulls = Nulls.SKIP
    )
    public _FinalStage collectedAtRange(Optional<String> collectedAtRange) {
      this.collectedAtRange = collectedAtRange;
      return this;
    }

    /**
     * <p>Return transactions that were retrieved from the institution before or on this date (<code>YYYY-MM-DD</code> or full <code>ISO-8601</code> timestamp).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage collectedAtLte(String collectedAtLte) {
      this.collectedAtLte = Optional.of(collectedAtLte);
      return this;
    }

    @Override
    @JsonSetter(
        value = "collected_at__lte",
        nulls = Nulls.SKIP
    )
    public _FinalStage collectedAtLte(Optional<String> collectedAtLte) {
      this.collectedAtLte = collectedAtLte;
      return this;
    }

    /**
     * <p>Return transactions that were retrieved from the institution before this date (<code>YYYY-MM-DD</code> or full <code>ISO-8601</code> timestamp).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage collectedAtLt(String collectedAtLt) {
      this.collectedAtLt = Optional.of(collectedAtLt);
      return this;
    }

    @Override
    @JsonSetter(
        value = "collected_at__lt",
        nulls = Nulls.SKIP
    )
    public _FinalStage collectedAtLt(Optional<String> collectedAtLt) {
      this.collectedAtLt = collectedAtLt;
      return this;
    }

    /**
     * <p>Return transactions that were retrieved from the institution after or on this date (<code>YYYY-MM-DD</code> or full <code>ISO-8601</code> timestamp).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage collectedAtGte(String collectedAtGte) {
      this.collectedAtGte = Optional.of(collectedAtGte);
      return this;
    }

    @Override
    @JsonSetter(
        value = "collected_at__gte",
        nulls = Nulls.SKIP
    )
    public _FinalStage collectedAtGte(Optional<String> collectedAtGte) {
      this.collectedAtGte = collectedAtGte;
      return this;
    }

    /**
     * <p>Return transactions that were retrieved from the institution after this date (<code>YYYY-MM-DD</code> or full <code>ISO-8601</code> timestamp).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage collectedAtGt(String collectedAtGt) {
      this.collectedAtGt = Optional.of(collectedAtGt);
      return this;
    }

    @Override
    @JsonSetter(
        value = "collected_at__gt",
        nulls = Nulls.SKIP
    )
    public _FinalStage collectedAtGt(Optional<String> collectedAtGt) {
      this.collectedAtGt = collectedAtGt;
      return this;
    }

    /**
     * <p>Return transactions that were retrieved from the institution on this date (<code>YYYY-MM-DD</code> or full <code>ISO-8601</code> timestamp).</p>
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
     * <p>Return transactions between these two values.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage amountRange(String amountRange) {
      this.amountRange = Optional.of(amountRange);
      return this;
    }

    @Override
    @JsonSetter(
        value = "amount__range",
        nulls = Nulls.SKIP
    )
    public _FinalStage amountRange(Optional<String> amountRange) {
      this.amountRange = amountRange;
      return this;
    }

    /**
     * <p>Return transactions less than or equal to this value.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage amountLte(String amountLte) {
      this.amountLte = Optional.of(amountLte);
      return this;
    }

    @Override
    @JsonSetter(
        value = "amount__lte",
        nulls = Nulls.SKIP
    )
    public _FinalStage amountLte(Optional<String> amountLte) {
      this.amountLte = amountLte;
      return this;
    }

    /**
     * <p>Return transactions less than this value.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage amountLt(String amountLt) {
      this.amountLt = Optional.of(amountLt);
      return this;
    }

    @Override
    @JsonSetter(
        value = "amount__lt",
        nulls = Nulls.SKIP
    )
    public _FinalStage amountLt(Optional<String> amountLt) {
      this.amountLt = amountLt;
      return this;
    }

    /**
     * <p>Return transactions greater than or equal to this value.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage amountGte(String amountGte) {
      this.amountGte = Optional.of(amountGte);
      return this;
    }

    @Override
    @JsonSetter(
        value = "amount__gte",
        nulls = Nulls.SKIP
    )
    public _FinalStage amountGte(Optional<String> amountGte) {
      this.amountGte = amountGte;
      return this;
    }

    /**
     * <p>Return transactions greater than this value.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage amountGt(String amountGt) {
      this.amountGt = Optional.of(amountGt);
      return this;
    }

    @Override
    @JsonSetter(
        value = "amount__gt",
        nulls = Nulls.SKIP
    )
    public _FinalStage amountGt(Optional<String> amountGt) {
      this.amountGt = amountGt;
      return this;
    }

    /**
     * <p>Return transactions matching exactly this value.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage amount(String amount) {
      this.amount = Optional.of(amount);
      return this;
    }

    @Override
    @JsonSetter(
        value = "amount",
        nulls = Nulls.SKIP
    )
    public _FinalStage amount(Optional<String> amount) {
      this.amount = amount;
      return this;
    }

    /**
     * <p>Return transactions that were processed by the institution in this date range (<code>YYYY-MM-DD</code> or full ISO-8601 timestamp).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage accountingDateRange(String accountingDateRange) {
      this.accountingDateRange = Optional.of(accountingDateRange);
      return this;
    }

    @Override
    @JsonSetter(
        value = "accounting_date__range",
        nulls = Nulls.SKIP
    )
    public _FinalStage accountingDateRange(Optional<String> accountingDateRange) {
      this.accountingDateRange = accountingDateRange;
      return this;
    }

    /**
     * <p>Return transactions that were processed by the institution on this date or earlier (<code>YYYY-MM-DD</code> or full ISO-8601 timestamp).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage accountingDateLte(String accountingDateLte) {
      this.accountingDateLte = Optional.of(accountingDateLte);
      return this;
    }

    @Override
    @JsonSetter(
        value = "accounting_date__lte",
        nulls = Nulls.SKIP
    )
    public _FinalStage accountingDateLte(Optional<String> accountingDateLte) {
      this.accountingDateLte = accountingDateLte;
      return this;
    }

    /**
     * <p>Return transactions that were processed by the institution before this date (<code>YYYY-MM-DD</code> or full ISO-8601 timestamp).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage accountingDateLt(String accountingDateLt) {
      this.accountingDateLt = Optional.of(accountingDateLt);
      return this;
    }

    @Override
    @JsonSetter(
        value = "accounting_date__lt",
        nulls = Nulls.SKIP
    )
    public _FinalStage accountingDateLt(Optional<String> accountingDateLt) {
      this.accountingDateLt = accountingDateLt;
      return this;
    }

    /**
     * <p>Return transactions that were processed by the institution on this date or later (<code>YYYY-MM-DD</code> or full ISO-8601 timestamp).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage accountingDateGte(String accountingDateGte) {
      this.accountingDateGte = Optional.of(accountingDateGte);
      return this;
    }

    @Override
    @JsonSetter(
        value = "accounting_date__gte",
        nulls = Nulls.SKIP
    )
    public _FinalStage accountingDateGte(Optional<String> accountingDateGte) {
      this.accountingDateGte = accountingDateGte;
      return this;
    }

    /**
     * <p>Return transactions that were processed by the institution after this date (<code>YYYY-MM-DD</code> or full ISO-8601 timestamp).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage accountingDateGt(String accountingDateGt) {
      this.accountingDateGt = Optional.of(accountingDateGt);
      return this;
    }

    @Override
    @JsonSetter(
        value = "accounting_date__gt",
        nulls = Nulls.SKIP
    )
    public _FinalStage accountingDateGt(Optional<String> accountingDateGt) {
      this.accountingDateGt = accountingDateGt;
      return this;
    }

    /**
     * <p>Return transactions that were processed by the institution on exactly this date (<code>YYYY-MM-DD</code> or full ISO-8601 timestamp).</p>
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
     * <p>Return information only for transactions matching these account types, as designated by the institution.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage accountTypeIn(String accountTypeIn) {
      this.accountTypeIn = Optional.of(accountTypeIn);
      return this;
    }

    @Override
    @JsonSetter(
        value = "account_type__in",
        nulls = Nulls.SKIP
    )
    public _FinalStage accountTypeIn(Optional<String> accountTypeIn) {
      this.accountTypeIn = accountTypeIn;
      return this;
    }

    /**
     * <p>Return information only for transactions matching this account type, as designated by the institution.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage accountType(String accountType) {
      this.accountType = Optional.of(accountType);
      return this;
    }

    @Override
    @JsonSetter(
        value = "account_type",
        nulls = Nulls.SKIP
    )
    public _FinalStage accountType(Optional<String> accountType) {
      this.accountType = accountType;
      return this;
    }

    /**
     * <p>Return transactions only for these <code>account.id</code>s.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage accountIn(String accountIn) {
      this.accountIn = Optional.of(accountIn);
      return this;
    }

    @Override
    @JsonSetter(
        value = "account__in",
        nulls = Nulls.SKIP
    )
    public _FinalStage accountIn(Optional<String> accountIn) {
      this.accountIn = accountIn;
      return this;
    }

    /**
     * <p>Return transactions that have a <code>account.balance.current</code> within a range of two values.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage accountBalanceCurrentRange(String accountBalanceCurrentRange) {
      this.accountBalanceCurrentRange = Optional.of(accountBalanceCurrentRange);
      return this;
    }

    @Override
    @JsonSetter(
        value = "account__balance__current__range",
        nulls = Nulls.SKIP
    )
    public _FinalStage accountBalanceCurrentRange(Optional<String> accountBalanceCurrentRange) {
      this.accountBalanceCurrentRange = accountBalanceCurrentRange;
      return this;
    }

    /**
     * <p>Return transactions that have a <code>account.balance.current</code> less than or equal to this value.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage accountBalanceCurrentLte(String accountBalanceCurrentLte) {
      this.accountBalanceCurrentLte = Optional.of(accountBalanceCurrentLte);
      return this;
    }

    @Override
    @JsonSetter(
        value = "account__balance__current__lte",
        nulls = Nulls.SKIP
    )
    public _FinalStage accountBalanceCurrentLte(Optional<String> accountBalanceCurrentLte) {
      this.accountBalanceCurrentLte = accountBalanceCurrentLte;
      return this;
    }

    /**
     * <p>Return transactions that have a <code>account.balance.current</code> less than this value.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage accountBalanceCurrentLt(String accountBalanceCurrentLt) {
      this.accountBalanceCurrentLt = Optional.of(accountBalanceCurrentLt);
      return this;
    }

    @Override
    @JsonSetter(
        value = "account__balance__current__lt",
        nulls = Nulls.SKIP
    )
    public _FinalStage accountBalanceCurrentLt(Optional<String> accountBalanceCurrentLt) {
      this.accountBalanceCurrentLt = accountBalanceCurrentLt;
      return this;
    }

    /**
     * <p>Return transactions that have a <code>account.balance.current</code> greater than or equal to this value.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage accountBalanceCurrentGte(String accountBalanceCurrentGte) {
      this.accountBalanceCurrentGte = Optional.of(accountBalanceCurrentGte);
      return this;
    }

    @Override
    @JsonSetter(
        value = "account__balance__current__gte",
        nulls = Nulls.SKIP
    )
    public _FinalStage accountBalanceCurrentGte(Optional<String> accountBalanceCurrentGte) {
      this.accountBalanceCurrentGte = accountBalanceCurrentGte;
      return this;
    }

    /**
     * <p>Return transactions that have a <code>account.balance.current</code> greater than this value.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage accountBalanceCurrentGt(String accountBalanceCurrentGt) {
      this.accountBalanceCurrentGt = Optional.of(accountBalanceCurrentGt);
      return this;
    }

    @Override
    @JsonSetter(
        value = "account__balance__current__gt",
        nulls = Nulls.SKIP
    )
    public _FinalStage accountBalanceCurrentGt(Optional<String> accountBalanceCurrentGt) {
      this.accountBalanceCurrentGt = accountBalanceCurrentGt;
      return this;
    }

    /**
     * <p>Return transactions that have a <code>account.balance.current</code> matching exactly this value.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage accountBalanceCurrent(String accountBalanceCurrent) {
      this.accountBalanceCurrent = Optional.of(accountBalanceCurrent);
      return this;
    }

    @Override
    @JsonSetter(
        value = "account__balance__current",
        nulls = Nulls.SKIP
    )
    public _FinalStage accountBalanceCurrent(Optional<String> accountBalanceCurrent) {
      this.accountBalanceCurrent = accountBalanceCurrent;
      return this;
    }

    /**
     * <p>Return transactions that have a <code>account.balance.available</code> within a range of two values.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage accountBalanceAvailableRange(String accountBalanceAvailableRange) {
      this.accountBalanceAvailableRange = Optional.of(accountBalanceAvailableRange);
      return this;
    }

    @Override
    @JsonSetter(
        value = "account__balance__available__range",
        nulls = Nulls.SKIP
    )
    public _FinalStage accountBalanceAvailableRange(Optional<String> accountBalanceAvailableRange) {
      this.accountBalanceAvailableRange = accountBalanceAvailableRange;
      return this;
    }

    /**
     * <p>Return transactions that have a <code>account.balance.available</code> less than or equal to this value.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage accountBalanceAvailableLte(String accountBalanceAvailableLte) {
      this.accountBalanceAvailableLte = Optional.of(accountBalanceAvailableLte);
      return this;
    }

    @Override
    @JsonSetter(
        value = "account__balance__available__lte",
        nulls = Nulls.SKIP
    )
    public _FinalStage accountBalanceAvailableLte(Optional<String> accountBalanceAvailableLte) {
      this.accountBalanceAvailableLte = accountBalanceAvailableLte;
      return this;
    }

    /**
     * <p>Return transactions that have a <code>account.balance.available</code> less than this value.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage accountBalanceAvailableLt(String accountBalanceAvailableLt) {
      this.accountBalanceAvailableLt = Optional.of(accountBalanceAvailableLt);
      return this;
    }

    @Override
    @JsonSetter(
        value = "account__balance__available__lt",
        nulls = Nulls.SKIP
    )
    public _FinalStage accountBalanceAvailableLt(Optional<String> accountBalanceAvailableLt) {
      this.accountBalanceAvailableLt = accountBalanceAvailableLt;
      return this;
    }

    /**
     * <p>Return transactions that have a <code>account.balance.available</code> matching exactly this value.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage accountBalanceAvailable(String accountBalanceAvailable) {
      this.accountBalanceAvailable = Optional.of(accountBalanceAvailable);
      return this;
    }

    @Override
    @JsonSetter(
        value = "account__balance__available",
        nulls = Nulls.SKIP
    )
    public _FinalStage accountBalanceAvailable(Optional<String> accountBalanceAvailable) {
      this.accountBalanceAvailable = accountBalanceAvailable;
      return this;
    }

    /**
     * <p>The <code>account.id</code> you want to filter by.</p>
     * <p>ℹ️ We highly recommend adding the <code>account.id</code> filter in order to improve your performance.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage account(String account) {
      this.account = Optional.of(account);
      return this;
    }

    @Override
    @JsonSetter(
        value = "account",
        nulls = Nulls.SKIP
    )
    public _FinalStage account(Optional<String> account) {
      this.account = account;
      return this;
    }

    /**
     * <p>Return only the specified fields in the response. For more information, see our <a href="https://developers.belvo.com/docs/searching-and-filtering">Filtering responses</a> DevPortal article.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage fields(String fields) {
      this.fields = Optional.of(fields);
      return this;
    }

    @Override
    @JsonSetter(
        value = "fields",
        nulls = Nulls.SKIP
    )
    public _FinalStage fields(Optional<String> fields) {
      this.fields = fields;
      return this;
    }

    /**
     * <p>Omit certain fields from being returned in the response. For more information, see our <a href="https://developers.belvo.com/docs/searching-and-filtering">Filtering responses</a> DevPortal article.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage omit(String omit) {
      this.omit = Optional.of(omit);
      return this;
    }

    @Override
    @JsonSetter(
        value = "omit",
        nulls = Nulls.SKIP
    )
    public _FinalStage omit(Optional<String> omit) {
      this.omit = omit;
      return this;
    }

    /**
     * <p>Indicates how many results to return per page. By default we return 100 results per page.</p>
     * <p>ℹ️ The minimum number of results returned per page is 1 and the maximum is 1000. If you enter a value greater than 1000, our API will default to the maximum value (1000).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage pageSize(Integer pageSize) {
      this.pageSize = Optional.of(pageSize);
      return this;
    }

    @Override
    @JsonSetter(
        value = "page_size",
        nulls = Nulls.SKIP
    )
    public _FinalStage pageSize(Optional<Integer> pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * <p>A page number within the paginated result set.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage page(Integer page) {
      this.page = Optional.of(page);
      return this;
    }

    @Override
    @JsonSetter(
        value = "page",
        nulls = Nulls.SKIP
    )
    public _FinalStage page(Optional<Integer> page) {
      this.page = page;
      return this;
    }

    @Override
    public ListTransactionsRequest build() {
      return new ListTransactionsRequest(page, pageSize, omit, fields, link, account, accountBalanceAvailable, accountBalanceAvailableLt, accountBalanceAvailableLte, accountBalanceAvailableRange, accountBalanceCurrent, accountBalanceCurrentGt, accountBalanceCurrentGte, accountBalanceCurrentLt, accountBalanceCurrentLte, accountBalanceCurrentRange, accountIn, accountType, accountTypeIn, accountingDate, accountingDateGt, accountingDateGte, accountingDateLt, accountingDateLte, accountingDateRange, amount, amountGt, amountGte, amountLt, amountLte, amountRange, collectedAt, collectedAtGt, collectedAtGte, collectedAtLt, collectedAtLte, collectedAtRange, createdAt, createdAtGt, createdAtGte, createdAtLt, createdAtLte, createdAtRange, creditCardDataBillNameIn, currency, currencyIn, reference, referenceIn, status, statusIn, type, typeIn, valueDate, valueDateGt, valueDateGte, valueDateLt, valueDateLte, valueDateRange);
    }
  }
}
