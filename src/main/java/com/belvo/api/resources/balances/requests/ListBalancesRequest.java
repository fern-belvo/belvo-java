package com.belvo.api.resources.balances.requests;

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
    builder = ListBalancesRequest.Builder.class
)
public final class ListBalancesRequest {
  private final Optional<Integer> page;

  private final Optional<Integer> pageSize;

  private final Optional<String> omit;

  private final Optional<String> fields;

  private final Optional<String> link;

  private final Optional<String> account;

  private final Optional<String> accountIn;

  private final Optional<String> accountType;

  private final Optional<String> accountTypeIn;

  private final Optional<String> balance;

  private final Optional<String> balanceLt;

  private final Optional<String> balanceLte;

  private final Optional<String> balanceGt;

  private final Optional<String> balanceGte;

  private final Optional<String> balanceRange;

  private final Optional<String> currency;

  private final Optional<String> currencyIn;

  private final Optional<String> id;

  private final Optional<String> idIn;

  private final Optional<String> institution;

  private final Optional<String> institutionIn;

  private final Optional<String> linkIn;

  private final Optional<String> valueDate;

  private final Optional<String> valueDateGt;

  private final Optional<String> valueDateGte;

  private final Optional<String> valueDateLt;

  private final Optional<String> valueDateLte;

  private final Optional<String> valueDateRange;

  private int _cachedHashCode;

  ListBalancesRequest(Optional<Integer> page, Optional<Integer> pageSize, Optional<String> omit,
      Optional<String> fields, Optional<String> link, Optional<String> account,
      Optional<String> accountIn, Optional<String> accountType, Optional<String> accountTypeIn,
      Optional<String> balance, Optional<String> balanceLt, Optional<String> balanceLte,
      Optional<String> balanceGt, Optional<String> balanceGte, Optional<String> balanceRange,
      Optional<String> currency, Optional<String> currencyIn, Optional<String> id,
      Optional<String> idIn, Optional<String> institution, Optional<String> institutionIn,
      Optional<String> linkIn, Optional<String> valueDate, Optional<String> valueDateGt,
      Optional<String> valueDateGte, Optional<String> valueDateLt, Optional<String> valueDateLte,
      Optional<String> valueDateRange) {
    this.page = page;
    this.pageSize = pageSize;
    this.omit = omit;
    this.fields = fields;
    this.link = link;
    this.account = account;
    this.accountIn = accountIn;
    this.accountType = accountType;
    this.accountTypeIn = accountTypeIn;
    this.balance = balance;
    this.balanceLt = balanceLt;
    this.balanceLte = balanceLte;
    this.balanceGt = balanceGt;
    this.balanceGte = balanceGte;
    this.balanceRange = balanceRange;
    this.currency = currency;
    this.currencyIn = currencyIn;
    this.id = id;
    this.idIn = idIn;
    this.institution = institution;
    this.institutionIn = institutionIn;
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
   * @return Return balances only for these <code>account.id</code>s.
   */
  @JsonProperty("account__in")
  public Optional<String> getAccountIn() {
    return accountIn;
  }

  /**
   * @return Return information only for accounts matching this account type, as designated by the institution.
   */
  @JsonProperty("account__type")
  public Optional<String> getAccountType() {
    return accountType;
  }

  /**
   * @return Return information only for accounts matching these account types, as designated by the institution.
   */
  @JsonProperty("account__type__in")
  public Optional<String> getAccountTypeIn() {
    return accountTypeIn;
  }

  /**
   * @return Return balances matching exactly this value.
   */
  @JsonProperty("balance")
  public Optional<String> getBalance() {
    return balance;
  }

  /**
   * @return Return balances less than this value.
   */
  @JsonProperty("balance__lt")
  public Optional<String> getBalanceLt() {
    return balanceLt;
  }

  /**
   * @return Return balances less than or equal to this value.
   */
  @JsonProperty("balance__lte")
  public Optional<String> getBalanceLte() {
    return balanceLte;
  }

  /**
   * @return Return balances greater than this value.
   */
  @JsonProperty("balance__gt")
  public Optional<String> getBalanceGt() {
    return balanceGt;
  }

  /**
   * @return Return balances greater than or equal to this value.
   */
  @JsonProperty("balance__gte")
  public Optional<String> getBalanceGte() {
    return balanceGte;
  }

  /**
   * @return Return balances between these two values.
   */
  @JsonProperty("balance__range")
  public Optional<String> getBalanceRange() {
    return balanceRange;
  }

  /**
   * @return Return balances that are in this three-letter currency code.
   */
  @JsonProperty("currency")
  public Optional<String> getCurrency() {
    return currency;
  }

  /**
   * @return Return balances that are in these three-letter currency codes.
   */
  @JsonProperty("currency__in")
  public Optional<String> getCurrencyIn() {
    return currencyIn;
  }

  /**
   * @return Return information only for this <code>balance.id</code>.
   */
  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
  }

  /**
   * @return Return information only for these <code>balance.id</code>s.
   */
  @JsonProperty("id__in")
  public Optional<String> getIdIn() {
    return idIn;
  }

  /**
   * @return Return balances only for this institution (use the Belvo-designated name, such as <code>erebor_mx_retail</code>).
   */
  @JsonProperty("institution")
  public Optional<String> getInstitution() {
    return institution;
  }

  /**
   * @return Return balances only for these institutions (use the Belvo-designated names, such as <code>erebor_mx_retail</code> and <code>gringotts_mx_retail</code>).
   */
  @JsonProperty("institution__in")
  public Optional<String> getInstitutionIn() {
    return institutionIn;
  }

  /**
   * @return Return balances only for these <code>link.id</code>s.
   */
  @JsonProperty("link__in")
  public Optional<String> getLinkIn() {
    return linkIn;
  }

  /**
   * @return Return balances for exactly this date (<code>YYYY-MM-DD</code> or full ISO-8601 timestamp).
   */
  @JsonProperty("value_date")
  public Optional<String> getValueDate() {
    return valueDate;
  }

  /**
   * @return Return balances for after this date (<code>YYYY-MM-DD</code> or full ISO-8601 timestamp).
   */
  @JsonProperty("value_date__gt")
  public Optional<String> getValueDateGt() {
    return valueDateGt;
  }

  /**
   * @return Return balances for this date or later (<code>YYYY-MM-DD</code> or full ISO-8601 timestamp).
   */
  @JsonProperty("value_date__gte")
  public Optional<String> getValueDateGte() {
    return valueDateGte;
  }

  /**
   * @return Return balances for before this date (<code>YYYY-MM-DD</code> or full ISO-8601 timestamp).
   */
  @JsonProperty("value_date__lt")
  public Optional<String> getValueDateLt() {
    return valueDateLt;
  }

  /**
   * @return Return balances for this date or earlier (<code>YYYY-MM-DD</code> or full ISO-8601 timestamp).
   */
  @JsonProperty("value_date__lte")
  public Optional<String> getValueDateLte() {
    return valueDateLte;
  }

  /**
   * @return Return balances for this date range (<code>YYYY-MM-DD</code> or full ISO-8601 timestamp).
   */
  @JsonProperty("value_date__range")
  public Optional<String> getValueDateRange() {
    return valueDateRange;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof ListBalancesRequest && equalTo((ListBalancesRequest) other);
  }

  private boolean equalTo(ListBalancesRequest other) {
    return page.equals(other.page) && pageSize.equals(other.pageSize) && omit.equals(other.omit) && fields.equals(other.fields) && link.equals(other.link) && account.equals(other.account) && accountIn.equals(other.accountIn) && accountType.equals(other.accountType) && accountTypeIn.equals(other.accountTypeIn) && balance.equals(other.balance) && balanceLt.equals(other.balanceLt) && balanceLte.equals(other.balanceLte) && balanceGt.equals(other.balanceGt) && balanceGte.equals(other.balanceGte) && balanceRange.equals(other.balanceRange) && currency.equals(other.currency) && currencyIn.equals(other.currencyIn) && id.equals(other.id) && idIn.equals(other.idIn) && institution.equals(other.institution) && institutionIn.equals(other.institutionIn) && linkIn.equals(other.linkIn) && valueDate.equals(other.valueDate) && valueDateGt.equals(other.valueDateGt) && valueDateGte.equals(other.valueDateGte) && valueDateLt.equals(other.valueDateLt) && valueDateLte.equals(other.valueDateLte) && valueDateRange.equals(other.valueDateRange);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.page, this.pageSize, this.omit, this.fields, this.link, this.account, this.accountIn, this.accountType, this.accountTypeIn, this.balance, this.balanceLt, this.balanceLte, this.balanceGt, this.balanceGte, this.balanceRange, this.currency, this.currencyIn, this.id, this.idIn, this.institution, this.institutionIn, this.linkIn, this.valueDate, this.valueDateGt, this.valueDateGte, this.valueDateLt, this.valueDateLte, this.valueDateRange);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "ListBalancesRequest{" + "page: " + page + ", pageSize: " + pageSize + ", omit: " + omit + ", fields: " + fields + ", link: " + link + ", account: " + account + ", accountIn: " + accountIn + ", accountType: " + accountType + ", accountTypeIn: " + accountTypeIn + ", balance: " + balance + ", balanceLt: " + balanceLt + ", balanceLte: " + balanceLte + ", balanceGt: " + balanceGt + ", balanceGte: " + balanceGte + ", balanceRange: " + balanceRange + ", currency: " + currency + ", currencyIn: " + currencyIn + ", id: " + id + ", idIn: " + idIn + ", institution: " + institution + ", institutionIn: " + institutionIn + ", linkIn: " + linkIn + ", valueDate: " + valueDate + ", valueDateGt: " + valueDateGt + ", valueDateGte: " + valueDateGte + ", valueDateLt: " + valueDateLt + ", valueDateLte: " + valueDateLte + ", valueDateRange: " + valueDateRange + "}";
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

    private Optional<String> accountType = Optional.empty();

    private Optional<String> accountTypeIn = Optional.empty();

    private Optional<String> balance = Optional.empty();

    private Optional<String> balanceLt = Optional.empty();

    private Optional<String> balanceLte = Optional.empty();

    private Optional<String> balanceGt = Optional.empty();

    private Optional<String> balanceGte = Optional.empty();

    private Optional<String> balanceRange = Optional.empty();

    private Optional<String> currency = Optional.empty();

    private Optional<String> currencyIn = Optional.empty();

    private Optional<String> id = Optional.empty();

    private Optional<String> idIn = Optional.empty();

    private Optional<String> institution = Optional.empty();

    private Optional<String> institutionIn = Optional.empty();

    private Optional<String> linkIn = Optional.empty();

    private Optional<String> valueDate = Optional.empty();

    private Optional<String> valueDateGt = Optional.empty();

    private Optional<String> valueDateGte = Optional.empty();

    private Optional<String> valueDateLt = Optional.empty();

    private Optional<String> valueDateLte = Optional.empty();

    private Optional<String> valueDateRange = Optional.empty();

    private Builder() {
    }

    public Builder from(ListBalancesRequest other) {
      page(other.getPage());
      pageSize(other.getPageSize());
      omit(other.getOmit());
      fields(other.getFields());
      link(other.getLink());
      account(other.getAccount());
      accountIn(other.getAccountIn());
      accountType(other.getAccountType());
      accountTypeIn(other.getAccountTypeIn());
      balance(other.getBalance());
      balanceLt(other.getBalanceLt());
      balanceLte(other.getBalanceLte());
      balanceGt(other.getBalanceGt());
      balanceGte(other.getBalanceGte());
      balanceRange(other.getBalanceRange());
      currency(other.getCurrency());
      currencyIn(other.getCurrencyIn());
      id(other.getId());
      idIn(other.getIdIn());
      institution(other.getInstitution());
      institutionIn(other.getInstitutionIn());
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
        value = "account__type",
        nulls = Nulls.SKIP
    )
    public Builder accountType(Optional<String> accountType) {
      this.accountType = accountType;
      return this;
    }

    public Builder accountType(String accountType) {
      this.accountType = Optional.of(accountType);
      return this;
    }

    @JsonSetter(
        value = "account__type__in",
        nulls = Nulls.SKIP
    )
    public Builder accountTypeIn(Optional<String> accountTypeIn) {
      this.accountTypeIn = accountTypeIn;
      return this;
    }

    public Builder accountTypeIn(String accountTypeIn) {
      this.accountTypeIn = Optional.of(accountTypeIn);
      return this;
    }

    @JsonSetter(
        value = "balance",
        nulls = Nulls.SKIP
    )
    public Builder balance(Optional<String> balance) {
      this.balance = balance;
      return this;
    }

    public Builder balance(String balance) {
      this.balance = Optional.of(balance);
      return this;
    }

    @JsonSetter(
        value = "balance__lt",
        nulls = Nulls.SKIP
    )
    public Builder balanceLt(Optional<String> balanceLt) {
      this.balanceLt = balanceLt;
      return this;
    }

    public Builder balanceLt(String balanceLt) {
      this.balanceLt = Optional.of(balanceLt);
      return this;
    }

    @JsonSetter(
        value = "balance__lte",
        nulls = Nulls.SKIP
    )
    public Builder balanceLte(Optional<String> balanceLte) {
      this.balanceLte = balanceLte;
      return this;
    }

    public Builder balanceLte(String balanceLte) {
      this.balanceLte = Optional.of(balanceLte);
      return this;
    }

    @JsonSetter(
        value = "balance__gt",
        nulls = Nulls.SKIP
    )
    public Builder balanceGt(Optional<String> balanceGt) {
      this.balanceGt = balanceGt;
      return this;
    }

    public Builder balanceGt(String balanceGt) {
      this.balanceGt = Optional.of(balanceGt);
      return this;
    }

    @JsonSetter(
        value = "balance__gte",
        nulls = Nulls.SKIP
    )
    public Builder balanceGte(Optional<String> balanceGte) {
      this.balanceGte = balanceGte;
      return this;
    }

    public Builder balanceGte(String balanceGte) {
      this.balanceGte = Optional.of(balanceGte);
      return this;
    }

    @JsonSetter(
        value = "balance__range",
        nulls = Nulls.SKIP
    )
    public Builder balanceRange(Optional<String> balanceRange) {
      this.balanceRange = balanceRange;
      return this;
    }

    public Builder balanceRange(String balanceRange) {
      this.balanceRange = Optional.of(balanceRange);
      return this;
    }

    @JsonSetter(
        value = "currency",
        nulls = Nulls.SKIP
    )
    public Builder currency(Optional<String> currency) {
      this.currency = currency;
      return this;
    }

    public Builder currency(String currency) {
      this.currency = Optional.of(currency);
      return this;
    }

    @JsonSetter(
        value = "currency__in",
        nulls = Nulls.SKIP
    )
    public Builder currencyIn(Optional<String> currencyIn) {
      this.currencyIn = currencyIn;
      return this;
    }

    public Builder currencyIn(String currencyIn) {
      this.currencyIn = Optional.of(currencyIn);
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
        value = "id__in",
        nulls = Nulls.SKIP
    )
    public Builder idIn(Optional<String> idIn) {
      this.idIn = idIn;
      return this;
    }

    public Builder idIn(String idIn) {
      this.idIn = Optional.of(idIn);
      return this;
    }

    @JsonSetter(
        value = "institution",
        nulls = Nulls.SKIP
    )
    public Builder institution(Optional<String> institution) {
      this.institution = institution;
      return this;
    }

    public Builder institution(String institution) {
      this.institution = Optional.of(institution);
      return this;
    }

    @JsonSetter(
        value = "institution__in",
        nulls = Nulls.SKIP
    )
    public Builder institutionIn(Optional<String> institutionIn) {
      this.institutionIn = institutionIn;
      return this;
    }

    public Builder institutionIn(String institutionIn) {
      this.institutionIn = Optional.of(institutionIn);
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

    public ListBalancesRequest build() {
      return new ListBalancesRequest(page, pageSize, omit, fields, link, account, accountIn, accountType, accountTypeIn, balance, balanceLt, balanceLte, balanceGt, balanceGte, balanceRange, currency, currencyIn, id, idIn, institution, institutionIn, linkIn, valueDate, valueDateGt, valueDateGte, valueDateLt, valueDateLte, valueDateRange);
    }
  }
}
