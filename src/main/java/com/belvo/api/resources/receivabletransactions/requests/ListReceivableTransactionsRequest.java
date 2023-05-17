package com.belvo.api.resources.receivabletransactions.requests;

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
    builder = ListReceivableTransactionsRequest.Builder.class
)
public final class ListReceivableTransactionsRequest {
  private final Optional<Integer> page;

  private final Optional<Integer> pageSize;

  private final Optional<String> omit;

  private final Optional<String> fields;

  private final Optional<String> link;

  private final Optional<String> account;

  private final Optional<String> accountIn;

  private final Optional<String> createdAtGt;

  private final Optional<String> createdAtGte;

  private final Optional<String> createdAtLt;

  private final Optional<String> createdAtLte;

  private final Optional<String> createdAtRange;

  private final Optional<String> linkIn;

  private final Optional<String> valueDate;

  private final Optional<String> valueDateGt;

  private final Optional<String> valueDateGte;

  private final Optional<String> valueDateLt;

  private final Optional<String> valueDateLte;

  private final Optional<String> valueDateRange;

  private int _cachedHashCode;

  ListReceivableTransactionsRequest(Optional<Integer> page, Optional<Integer> pageSize,
      Optional<String> omit, Optional<String> fields, Optional<String> link,
      Optional<String> account, Optional<String> accountIn, Optional<String> createdAtGt,
      Optional<String> createdAtGte, Optional<String> createdAtLt, Optional<String> createdAtLte,
      Optional<String> createdAtRange, Optional<String> linkIn, Optional<String> valueDate,
      Optional<String> valueDateGt, Optional<String> valueDateGte, Optional<String> valueDateLt,
      Optional<String> valueDateLte, Optional<String> valueDateRange) {
    this.page = page;
    this.pageSize = pageSize;
    this.omit = omit;
    this.fields = fields;
    this.link = link;
    this.account = account;
    this.accountIn = accountIn;
    this.createdAtGt = createdAtGt;
    this.createdAtGte = createdAtGte;
    this.createdAtLt = createdAtLt;
    this.createdAtLte = createdAtLte;
    this.createdAtRange = createdAtRange;
    this.linkIn = linkIn;
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
   * <p>ℹ️ We highly recommend adding either the <code>link.id</code> or the <code>account.id</code> filters in order to improve your performance.</p>
   */
  @JsonProperty("link")
  public Optional<String> getLink() {
    return link;
  }

  /**
   * @return The <code>account.id</code> you want to filter by.
   * <p>ℹ️ We highly recommend adding either the <code>link.id</code> or the <code>account.id</code> filters in order to improve your performance.</p>
   */
  @JsonProperty("account")
  public Optional<String> getAccount() {
    return account;
  }

  /**
   * @return Return receivable transactions only for these <code>account.id</code>s.
   */
  @JsonProperty("account__in")
  public Optional<String> getAccountIn() {
    return accountIn;
  }

  /**
   * @return Return receivable transactions that were last updated in Belvo's database after this date (<code>YYYY-MM-DD</code> or full <code>ISO-8601</code> timestamp).
   */
  @JsonProperty("created_at__gt")
  public Optional<String> getCreatedAtGt() {
    return createdAtGt;
  }

  /**
   * @return Return receivable transactions that were last updated in Belvo's database after or on this date (<code>YYYY-MM-DD</code> or full <code>ISO-8601</code> timestamp).
   */
  @JsonProperty("created_at__gte")
  public Optional<String> getCreatedAtGte() {
    return createdAtGte;
  }

  /**
   * @return Return receivable transactions that were last updated in Belvo's database before this date (<code>YYYY-MM-DD</code> or full <code>ISO-8601</code> timestamp).
   */
  @JsonProperty("created_at__lt")
  public Optional<String> getCreatedAtLt() {
    return createdAtLt;
  }

  /**
   * @return Return receivable transactions that were last updated in Belvo's database before or on this date (<code>YYYY-MM-DD</code> or full <code>ISO-8601</code> timestamp).
   */
  @JsonProperty("created_at__lte")
  public Optional<String> getCreatedAtLte() {
    return createdAtLte;
  }

  /**
   * @return Return receivable transactions that were last updated in Belvo's database between two dates (<code>YYYY-MM-DD</code> or full <code>ISO-8601</code> timestamp).
   */
  @JsonProperty("created_at__range")
  public Optional<String> getCreatedAtRange() {
    return createdAtRange;
  }

  /**
   * @return Return information for these <code>link.id</code>s.
   */
  @JsonProperty("link__in")
  public Optional<String> getLinkIn() {
    return linkIn;
  }

  /**
   * @return Return receivable transactions for exactly this date (<code>YYYY-MM-DD</code> or full ISO-8601 timestamp).
   */
  @JsonProperty("value_date")
  public Optional<String> getValueDate() {
    return valueDate;
  }

  /**
   * @return Return receivable transactions for after this date (<code>YYYY-MM-DD</code> or full ISO-8601 timestamp).
   */
  @JsonProperty("value_date__gt")
  public Optional<String> getValueDateGt() {
    return valueDateGt;
  }

  /**
   * @return Return receivable transactions for this date or later (<code>YYYY-MM-DD</code> or full ISO-8601 timestamp).
   */
  @JsonProperty("value_date__gte")
  public Optional<String> getValueDateGte() {
    return valueDateGte;
  }

  /**
   * @return Return receivable transactions for before this date (<code>YYYY-MM-DD</code> or full ISO-8601 timestamp).
   */
  @JsonProperty("value_date__lt")
  public Optional<String> getValueDateLt() {
    return valueDateLt;
  }

  /**
   * @return Return receivable transactions for this date or earlier (<code>YYYY-MM-DD</code> or full ISO-8601 timestamp).
   */
  @JsonProperty("value_date__lte")
  public Optional<String> getValueDateLte() {
    return valueDateLte;
  }

  /**
   * @return Return receivable transactions for this date range (<code>YYYY-MM-DD</code> or full ISO-8601 timestamp).
   */
  @JsonProperty("value_date__range")
  public Optional<String> getValueDateRange() {
    return valueDateRange;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof ListReceivableTransactionsRequest && equalTo((ListReceivableTransactionsRequest) other);
  }

  private boolean equalTo(ListReceivableTransactionsRequest other) {
    return page.equals(other.page) && pageSize.equals(other.pageSize) && omit.equals(other.omit) && fields.equals(other.fields) && link.equals(other.link) && account.equals(other.account) && accountIn.equals(other.accountIn) && createdAtGt.equals(other.createdAtGt) && createdAtGte.equals(other.createdAtGte) && createdAtLt.equals(other.createdAtLt) && createdAtLte.equals(other.createdAtLte) && createdAtRange.equals(other.createdAtRange) && linkIn.equals(other.linkIn) && valueDate.equals(other.valueDate) && valueDateGt.equals(other.valueDateGt) && valueDateGte.equals(other.valueDateGte) && valueDateLt.equals(other.valueDateLt) && valueDateLte.equals(other.valueDateLte) && valueDateRange.equals(other.valueDateRange);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.page, this.pageSize, this.omit, this.fields, this.link, this.account, this.accountIn, this.createdAtGt, this.createdAtGte, this.createdAtLt, this.createdAtLte, this.createdAtRange, this.linkIn, this.valueDate, this.valueDateGt, this.valueDateGte, this.valueDateLt, this.valueDateLte, this.valueDateRange);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "ListReceivableTransactionsRequest{" + "page: " + page + ", pageSize: " + pageSize + ", omit: " + omit + ", fields: " + fields + ", link: " + link + ", account: " + account + ", accountIn: " + accountIn + ", createdAtGt: " + createdAtGt + ", createdAtGte: " + createdAtGte + ", createdAtLt: " + createdAtLt + ", createdAtLte: " + createdAtLte + ", createdAtRange: " + createdAtRange + ", linkIn: " + linkIn + ", valueDate: " + valueDate + ", valueDateGt: " + valueDateGt + ", valueDateGte: " + valueDateGte + ", valueDateLt: " + valueDateLt + ", valueDateLte: " + valueDateLte + ", valueDateRange: " + valueDateRange + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<Integer> page = Optional.empty();

    private Optional<Integer> pageSize = Optional.empty();

    private Optional<String> omit = Optional.empty();

    private Optional<String> fields = Optional.empty();

    private Optional<String> link = Optional.empty();

    private Optional<String> account = Optional.empty();

    private Optional<String> accountIn = Optional.empty();

    private Optional<String> createdAtGt = Optional.empty();

    private Optional<String> createdAtGte = Optional.empty();

    private Optional<String> createdAtLt = Optional.empty();

    private Optional<String> createdAtLte = Optional.empty();

    private Optional<String> createdAtRange = Optional.empty();

    private Optional<String> linkIn = Optional.empty();

    private Optional<String> valueDate = Optional.empty();

    private Optional<String> valueDateGt = Optional.empty();

    private Optional<String> valueDateGte = Optional.empty();

    private Optional<String> valueDateLt = Optional.empty();

    private Optional<String> valueDateLte = Optional.empty();

    private Optional<String> valueDateRange = Optional.empty();

    private Builder() {
    }

    public Builder from(ListReceivableTransactionsRequest other) {
      page(other.getPage());
      pageSize(other.getPageSize());
      omit(other.getOmit());
      fields(other.getFields());
      link(other.getLink());
      account(other.getAccount());
      accountIn(other.getAccountIn());
      createdAtGt(other.getCreatedAtGt());
      createdAtGte(other.getCreatedAtGte());
      createdAtLt(other.getCreatedAtLt());
      createdAtLte(other.getCreatedAtLte());
      createdAtRange(other.getCreatedAtRange());
      linkIn(other.getLinkIn());
      valueDate(other.getValueDate());
      valueDateGt(other.getValueDateGt());
      valueDateGte(other.getValueDateGte());
      valueDateLt(other.getValueDateLt());
      valueDateLte(other.getValueDateLte());
      valueDateRange(other.getValueDateRange());
      return this;
    }

    @JsonSetter(
        value = "page",
        nulls = Nulls.SKIP
    )
    public Builder page(Optional<Integer> page) {
      this.page = page;
      return this;
    }

    public Builder page(Integer page) {
      this.page = Optional.of(page);
      return this;
    }

    @JsonSetter(
        value = "page_size",
        nulls = Nulls.SKIP
    )
    public Builder pageSize(Optional<Integer> pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    public Builder pageSize(Integer pageSize) {
      this.pageSize = Optional.of(pageSize);
      return this;
    }

    @JsonSetter(
        value = "omit",
        nulls = Nulls.SKIP
    )
    public Builder omit(Optional<String> omit) {
      this.omit = omit;
      return this;
    }

    public Builder omit(String omit) {
      this.omit = Optional.of(omit);
      return this;
    }

    @JsonSetter(
        value = "fields",
        nulls = Nulls.SKIP
    )
    public Builder fields(Optional<String> fields) {
      this.fields = fields;
      return this;
    }

    public Builder fields(String fields) {
      this.fields = Optional.of(fields);
      return this;
    }

    @JsonSetter(
        value = "link",
        nulls = Nulls.SKIP
    )
    public Builder link(Optional<String> link) {
      this.link = link;
      return this;
    }

    public Builder link(String link) {
      this.link = Optional.of(link);
      return this;
    }

    @JsonSetter(
        value = "account",
        nulls = Nulls.SKIP
    )
    public Builder account(Optional<String> account) {
      this.account = account;
      return this;
    }

    public Builder account(String account) {
      this.account = Optional.of(account);
      return this;
    }

    @JsonSetter(
        value = "account__in",
        nulls = Nulls.SKIP
    )
    public Builder accountIn(Optional<String> accountIn) {
      this.accountIn = accountIn;
      return this;
    }

    public Builder accountIn(String accountIn) {
      this.accountIn = Optional.of(accountIn);
      return this;
    }

    @JsonSetter(
        value = "created_at__gt",
        nulls = Nulls.SKIP
    )
    public Builder createdAtGt(Optional<String> createdAtGt) {
      this.createdAtGt = createdAtGt;
      return this;
    }

    public Builder createdAtGt(String createdAtGt) {
      this.createdAtGt = Optional.of(createdAtGt);
      return this;
    }

    @JsonSetter(
        value = "created_at__gte",
        nulls = Nulls.SKIP
    )
    public Builder createdAtGte(Optional<String> createdAtGte) {
      this.createdAtGte = createdAtGte;
      return this;
    }

    public Builder createdAtGte(String createdAtGte) {
      this.createdAtGte = Optional.of(createdAtGte);
      return this;
    }

    @JsonSetter(
        value = "created_at__lt",
        nulls = Nulls.SKIP
    )
    public Builder createdAtLt(Optional<String> createdAtLt) {
      this.createdAtLt = createdAtLt;
      return this;
    }

    public Builder createdAtLt(String createdAtLt) {
      this.createdAtLt = Optional.of(createdAtLt);
      return this;
    }

    @JsonSetter(
        value = "created_at__lte",
        nulls = Nulls.SKIP
    )
    public Builder createdAtLte(Optional<String> createdAtLte) {
      this.createdAtLte = createdAtLte;
      return this;
    }

    public Builder createdAtLte(String createdAtLte) {
      this.createdAtLte = Optional.of(createdAtLte);
      return this;
    }

    @JsonSetter(
        value = "created_at__range",
        nulls = Nulls.SKIP
    )
    public Builder createdAtRange(Optional<String> createdAtRange) {
      this.createdAtRange = createdAtRange;
      return this;
    }

    public Builder createdAtRange(String createdAtRange) {
      this.createdAtRange = Optional.of(createdAtRange);
      return this;
    }

    @JsonSetter(
        value = "link__in",
        nulls = Nulls.SKIP
    )
    public Builder linkIn(Optional<String> linkIn) {
      this.linkIn = linkIn;
      return this;
    }

    public Builder linkIn(String linkIn) {
      this.linkIn = Optional.of(linkIn);
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
        value = "value_date__gt",
        nulls = Nulls.SKIP
    )
    public Builder valueDateGt(Optional<String> valueDateGt) {
      this.valueDateGt = valueDateGt;
      return this;
    }

    public Builder valueDateGt(String valueDateGt) {
      this.valueDateGt = Optional.of(valueDateGt);
      return this;
    }

    @JsonSetter(
        value = "value_date__gte",
        nulls = Nulls.SKIP
    )
    public Builder valueDateGte(Optional<String> valueDateGte) {
      this.valueDateGte = valueDateGte;
      return this;
    }

    public Builder valueDateGte(String valueDateGte) {
      this.valueDateGte = Optional.of(valueDateGte);
      return this;
    }

    @JsonSetter(
        value = "value_date__lt",
        nulls = Nulls.SKIP
    )
    public Builder valueDateLt(Optional<String> valueDateLt) {
      this.valueDateLt = valueDateLt;
      return this;
    }

    public Builder valueDateLt(String valueDateLt) {
      this.valueDateLt = Optional.of(valueDateLt);
      return this;
    }

    @JsonSetter(
        value = "value_date__lte",
        nulls = Nulls.SKIP
    )
    public Builder valueDateLte(Optional<String> valueDateLte) {
      this.valueDateLte = valueDateLte;
      return this;
    }

    public Builder valueDateLte(String valueDateLte) {
      this.valueDateLte = Optional.of(valueDateLte);
      return this;
    }

    @JsonSetter(
        value = "value_date__range",
        nulls = Nulls.SKIP
    )
    public Builder valueDateRange(Optional<String> valueDateRange) {
      this.valueDateRange = valueDateRange;
      return this;
    }

    public Builder valueDateRange(String valueDateRange) {
      this.valueDateRange = Optional.of(valueDateRange);
      return this;
    }

    public ListReceivableTransactionsRequest build() {
      return new ListReceivableTransactionsRequest(page, pageSize, omit, fields, link, account, accountIn, createdAtGt, createdAtGte, createdAtLt, createdAtLte, createdAtRange, linkIn, valueDate, valueDateGt, valueDateGte, valueDateLt, valueDateLte, valueDateRange);
    }
  }
}
