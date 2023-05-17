package com.belvo.api.resources.accounts.requests;

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
    builder = ListAccountsRequest.Builder.class
)
public final class ListAccountsRequest {
  private final Optional<Integer> page;

  private final Optional<Integer> pageSize;

  private final Optional<String> omit;

  private final Optional<String> fields;

  private final Optional<String> link;

  private final Optional<String> balanceAvailable;

  private final Optional<String> balanceAvailableLt;

  private final Optional<String> balanceAvailableLte;

  private final Optional<String> balanceAvailableGt;

  private final Optional<String> balanceAvailableGte;

  private final Optional<String> balanceAvailableRange;

  private final Optional<String> balanceCurrent;

  private final Optional<String> balanceCurrentLt;

  private final Optional<String> balanceCurrentLte;

  private final Optional<String> balanceCurrentGt;

  private final Optional<String> balanceCurrentGte;

  private final Optional<String> balanceCurrentRange;

  private final Optional<String> category;

  private final Optional<String> categoryIn;

  private final Optional<String> createdAtGt;

  private final Optional<String> createdAtGte;

  private final Optional<String> createdAtLt;

  private final Optional<String> createdAtLte;

  private final Optional<String> createdAtRange;

  private final Optional<String> currency;

  private final Optional<String> currencyIn;

  private final Optional<String> id;

  private final Optional<String> idIn;

  private final Optional<String> institution;

  private final Optional<String> institutionIn;

  private final Optional<String> linkIn;

  private final Optional<String> name;

  private final Optional<String> nameIcontains;

  private final Optional<String> number;

  private final Optional<String> numberIn;

  private final Optional<String> publicIdentificationName;

  private final Optional<String> publicIdentificationValue;

  private final Optional<String> type;

  private int _cachedHashCode;

  ListAccountsRequest(Optional<Integer> page, Optional<Integer> pageSize, Optional<String> omit,
      Optional<String> fields, Optional<String> link, Optional<String> balanceAvailable,
      Optional<String> balanceAvailableLt, Optional<String> balanceAvailableLte,
      Optional<String> balanceAvailableGt, Optional<String> balanceAvailableGte,
      Optional<String> balanceAvailableRange, Optional<String> balanceCurrent,
      Optional<String> balanceCurrentLt, Optional<String> balanceCurrentLte,
      Optional<String> balanceCurrentGt, Optional<String> balanceCurrentGte,
      Optional<String> balanceCurrentRange, Optional<String> category, Optional<String> categoryIn,
      Optional<String> createdAtGt, Optional<String> createdAtGte, Optional<String> createdAtLt,
      Optional<String> createdAtLte, Optional<String> createdAtRange, Optional<String> currency,
      Optional<String> currencyIn, Optional<String> id, Optional<String> idIn,
      Optional<String> institution, Optional<String> institutionIn, Optional<String> linkIn,
      Optional<String> name, Optional<String> nameIcontains, Optional<String> number,
      Optional<String> numberIn, Optional<String> publicIdentificationName,
      Optional<String> publicIdentificationValue, Optional<String> type) {
    this.page = page;
    this.pageSize = pageSize;
    this.omit = omit;
    this.fields = fields;
    this.link = link;
    this.balanceAvailable = balanceAvailable;
    this.balanceAvailableLt = balanceAvailableLt;
    this.balanceAvailableLte = balanceAvailableLte;
    this.balanceAvailableGt = balanceAvailableGt;
    this.balanceAvailableGte = balanceAvailableGte;
    this.balanceAvailableRange = balanceAvailableRange;
    this.balanceCurrent = balanceCurrent;
    this.balanceCurrentLt = balanceCurrentLt;
    this.balanceCurrentLte = balanceCurrentLte;
    this.balanceCurrentGt = balanceCurrentGt;
    this.balanceCurrentGte = balanceCurrentGte;
    this.balanceCurrentRange = balanceCurrentRange;
    this.category = category;
    this.categoryIn = categoryIn;
    this.createdAtGt = createdAtGt;
    this.createdAtGte = createdAtGte;
    this.createdAtLt = createdAtLt;
    this.createdAtLte = createdAtLte;
    this.createdAtRange = createdAtRange;
    this.currency = currency;
    this.currencyIn = currencyIn;
    this.id = id;
    this.idIn = idIn;
    this.institution = institution;
    this.institutionIn = institutionIn;
    this.linkIn = linkIn;
    this.name = name;
    this.nameIcontains = nameIcontains;
    this.number = number;
    this.numberIn = numberIn;
    this.publicIdentificationName = publicIdentificationName;
    this.publicIdentificationValue = publicIdentificationValue;
    this.type = type;
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
   * <p>ℹ️ We highly recommend adding the <code>link.id</code> filter in order to improve your performance.</p>
   */
  @JsonProperty("link")
  public Optional<String> getLink() {
    return link;
  }

  /**
   * @return Return accounts that have a <code>balance.available</code> matching exactly this value.
   */
  @JsonProperty("balance__available")
  public Optional<String> getBalanceAvailable() {
    return balanceAvailable;
  }

  /**
   * @return Return accounts that have a <code>balance.available</code> less than this value.
   */
  @JsonProperty("balance__available__lt")
  public Optional<String> getBalanceAvailableLt() {
    return balanceAvailableLt;
  }

  /**
   * @return Return accounts that have a <code>balance.available</code> less than or equal to this value.
   */
  @JsonProperty("balance__available__lte")
  public Optional<String> getBalanceAvailableLte() {
    return balanceAvailableLte;
  }

  /**
   * @return Return accounts that have a <code>balance.available</code> greater than this value.
   */
  @JsonProperty("balance__available__gt")
  public Optional<String> getBalanceAvailableGt() {
    return balanceAvailableGt;
  }

  /**
   * @return Return accounts that have a <code>balance.available</code> greater than or equal to this value.
   */
  @JsonProperty("balance__available__gte")
  public Optional<String> getBalanceAvailableGte() {
    return balanceAvailableGte;
  }

  /**
   * @return Return accounts that have a <code>balance.available</code> within a range of two values.
   */
  @JsonProperty("balance__available__range")
  public Optional<String> getBalanceAvailableRange() {
    return balanceAvailableRange;
  }

  /**
   * @return Return accounts that have a <code>balance.current</code> matching exactly this value.
   */
  @JsonProperty("balance__current")
  public Optional<String> getBalanceCurrent() {
    return balanceCurrent;
  }

  /**
   * @return Return accounts that have a <code>balance.current</code> less than this value.
   */
  @JsonProperty("balance__current__lt")
  public Optional<String> getBalanceCurrentLt() {
    return balanceCurrentLt;
  }

  /**
   * @return Return accounts that have a <code>balance.available</code> less than or equal to this value.
   */
  @JsonProperty("balance__current__lte")
  public Optional<String> getBalanceCurrentLte() {
    return balanceCurrentLte;
  }

  /**
   * @return Return accounts that have a <code>balance.current</code> greater than this value.
   */
  @JsonProperty("balance__current__gt")
  public Optional<String> getBalanceCurrentGt() {
    return balanceCurrentGt;
  }

  /**
   * @return Return accounts that have a <code>balance.available</code> greater than or equal to this value.
   */
  @JsonProperty("balance__current__gte")
  public Optional<String> getBalanceCurrentGte() {
    return balanceCurrentGte;
  }

  /**
   * @return Return accounts that have a <code>balance.available</code> within a range of two values.
   */
  @JsonProperty("balance__current__range")
  public Optional<String> getBalanceCurrentRange() {
    return balanceCurrentRange;
  }

  /**
   * @return Return accounts only for the given category (for example, <code>CHECKING_ACCOUNT</code> and <code>SAVINGS_ACCOUNT</code>).
   */
  @JsonProperty("category")
  public Optional<String> getCategory() {
    return category;
  }

  /**
   * @return Return accounts only for the given categories (for example, <code>CHECKING_ACCOUNT</code> and <code>SAVINGS_ACCOUNT</code>).
   */
  @JsonProperty("category__in")
  public Optional<String> getCategoryIn() {
    return categoryIn;
  }

  /**
   * @return Return accounts that were last updated in Belvo's database after this date (<code>YYYY-MM-DD</code> or full <code>ISO-8601</code> timestamp).
   */
  @JsonProperty("created_at__gt")
  public Optional<String> getCreatedAtGt() {
    return createdAtGt;
  }

  /**
   * @return Return accounts that were last updated in Belvo's database after or on this date (<code>YYYY-MM-DD</code> or full <code>ISO-8601</code> timestamp).
   */
  @JsonProperty("created_at__gte")
  public Optional<String> getCreatedAtGte() {
    return createdAtGte;
  }

  /**
   * @return Return accounts that were last updated in Belvo's database before this date (<code>YYYY-MM-DD</code> or full <code>ISO-8601</code> timestamp).
   */
  @JsonProperty("created_at__lt")
  public Optional<String> getCreatedAtLt() {
    return createdAtLt;
  }

  /**
   * @return Return accounts that were last updated in Belvo's database before or on this date (<code>YYYY-MM-DD</code> or full <code>ISO-8601</code> timestamp).
   */
  @JsonProperty("created_at__lte")
  public Optional<String> getCreatedAtLte() {
    return createdAtLte;
  }

  /**
   * @return Return accounts that were last updated in Belvo's database between two dates (<code>YYYY-MM-DD</code> or full <code>ISO-8601</code> timestamp).
   */
  @JsonProperty("created_at__range")
  public Optional<String> getCreatedAtRange() {
    return createdAtRange;
  }

  /**
   * @return Return accounts that hold finances in only this three-letter currency code.
   */
  @JsonProperty("currency")
  public Optional<String> getCurrency() {
    return currency;
  }

  /**
   * @return Return accounts that hold finances in one of these three-letter currency codes.
   */
  @JsonProperty("currency__in")
  public Optional<String> getCurrencyIn() {
    return currencyIn;
  }

  /**
   * @return Return information only for this <code>account.id</code>.
   */
  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
  }

  /**
   * @return Return information for these <code>account.id</code>s.
   */
  @JsonProperty("id__in")
  public Optional<String> getIdIn() {
    return idIn;
  }

  /**
   * @return Return accounts only for this institution (use the Belvo-designated name, such as <code>erebor_mx_retail</code>).
   */
  @JsonProperty("institution")
  public Optional<String> getInstitution() {
    return institution;
  }

  /**
   * @return Return accounts only for these institutions (use the Belvo-designated names, such as <code>erebor_mx_retail</code> and <code>gringotts_mx_retail</code>).
   */
  @JsonProperty("institution__in")
  public Optional<String> getInstitutionIn() {
    return institutionIn;
  }

  /**
   * @return Return accounts only for these <code>link.id</code>s.
   */
  @JsonProperty("link__in")
  public Optional<String> getLinkIn() {
    return linkIn;
  }

  /**
   * @return Return accounts with exactly this internal (specified by the institution) name.
   */
  @JsonProperty("name")
  public Optional<String> getName() {
    return name;
  }

  /**
   * @return Return accounts partially matching this internal (specified by the institution) name.
   */
  @JsonProperty("name__icontains")
  public Optional<String> getNameIcontains() {
    return nameIcontains;
  }

  /**
   * @return Return information only for this account number (as specified by the institution).
   */
  @JsonProperty("number")
  public Optional<String> getNumber() {
    return number;
  }

  /**
   * @return Return information for these account numbers (as specified by the institution).
   */
  @JsonProperty("number__in")
  public Optional<String> getNumberIn() {
    return numberIn;
  }

  /**
   * @return Return information only for this type of account ID. For example, CLABE accounts.
   */
  @JsonProperty("public_identification_name")
  public Optional<String> getPublicIdentificationName() {
    return publicIdentificationName;
  }

  /**
   * @return Return information only for this account ID. For example, the account number for a CLABE account.
   */
  @JsonProperty("public_identification_value")
  public Optional<String> getPublicIdentificationValue() {
    return publicIdentificationValue;
  }

  /**
   * @return Return information only for accounts matching this account type, as designated by the institution.
   */
  @JsonProperty("type")
  public Optional<String> getType() {
    return type;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof ListAccountsRequest && equalTo((ListAccountsRequest) other);
  }

  private boolean equalTo(ListAccountsRequest other) {
    return page.equals(other.page) && pageSize.equals(other.pageSize) && omit.equals(other.omit) && fields.equals(other.fields) && link.equals(other.link) && balanceAvailable.equals(other.balanceAvailable) && balanceAvailableLt.equals(other.balanceAvailableLt) && balanceAvailableLte.equals(other.balanceAvailableLte) && balanceAvailableGt.equals(other.balanceAvailableGt) && balanceAvailableGte.equals(other.balanceAvailableGte) && balanceAvailableRange.equals(other.balanceAvailableRange) && balanceCurrent.equals(other.balanceCurrent) && balanceCurrentLt.equals(other.balanceCurrentLt) && balanceCurrentLte.equals(other.balanceCurrentLte) && balanceCurrentGt.equals(other.balanceCurrentGt) && balanceCurrentGte.equals(other.balanceCurrentGte) && balanceCurrentRange.equals(other.balanceCurrentRange) && category.equals(other.category) && categoryIn.equals(other.categoryIn) && createdAtGt.equals(other.createdAtGt) && createdAtGte.equals(other.createdAtGte) && createdAtLt.equals(other.createdAtLt) && createdAtLte.equals(other.createdAtLte) && createdAtRange.equals(other.createdAtRange) && currency.equals(other.currency) && currencyIn.equals(other.currencyIn) && id.equals(other.id) && idIn.equals(other.idIn) && institution.equals(other.institution) && institutionIn.equals(other.institutionIn) && linkIn.equals(other.linkIn) && name.equals(other.name) && nameIcontains.equals(other.nameIcontains) && number.equals(other.number) && numberIn.equals(other.numberIn) && publicIdentificationName.equals(other.publicIdentificationName) && publicIdentificationValue.equals(other.publicIdentificationValue) && type.equals(other.type);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.page, this.pageSize, this.omit, this.fields, this.link, this.balanceAvailable, this.balanceAvailableLt, this.balanceAvailableLte, this.balanceAvailableGt, this.balanceAvailableGte, this.balanceAvailableRange, this.balanceCurrent, this.balanceCurrentLt, this.balanceCurrentLte, this.balanceCurrentGt, this.balanceCurrentGte, this.balanceCurrentRange, this.category, this.categoryIn, this.createdAtGt, this.createdAtGte, this.createdAtLt, this.createdAtLte, this.createdAtRange, this.currency, this.currencyIn, this.id, this.idIn, this.institution, this.institutionIn, this.linkIn, this.name, this.nameIcontains, this.number, this.numberIn, this.publicIdentificationName, this.publicIdentificationValue, this.type);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "ListAccountsRequest{" + "page: " + page + ", pageSize: " + pageSize + ", omit: " + omit + ", fields: " + fields + ", link: " + link + ", balanceAvailable: " + balanceAvailable + ", balanceAvailableLt: " + balanceAvailableLt + ", balanceAvailableLte: " + balanceAvailableLte + ", balanceAvailableGt: " + balanceAvailableGt + ", balanceAvailableGte: " + balanceAvailableGte + ", balanceAvailableRange: " + balanceAvailableRange + ", balanceCurrent: " + balanceCurrent + ", balanceCurrentLt: " + balanceCurrentLt + ", balanceCurrentLte: " + balanceCurrentLte + ", balanceCurrentGt: " + balanceCurrentGt + ", balanceCurrentGte: " + balanceCurrentGte + ", balanceCurrentRange: " + balanceCurrentRange + ", category: " + category + ", categoryIn: " + categoryIn + ", createdAtGt: " + createdAtGt + ", createdAtGte: " + createdAtGte + ", createdAtLt: " + createdAtLt + ", createdAtLte: " + createdAtLte + ", createdAtRange: " + createdAtRange + ", currency: " + currency + ", currencyIn: " + currencyIn + ", id: " + id + ", idIn: " + idIn + ", institution: " + institution + ", institutionIn: " + institutionIn + ", linkIn: " + linkIn + ", name: " + name + ", nameIcontains: " + nameIcontains + ", number: " + number + ", numberIn: " + numberIn + ", publicIdentificationName: " + publicIdentificationName + ", publicIdentificationValue: " + publicIdentificationValue + ", type: " + type + "}";
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

    private Optional<String> balanceAvailable = Optional.empty();

    private Optional<String> balanceAvailableLt = Optional.empty();

    private Optional<String> balanceAvailableLte = Optional.empty();

    private Optional<String> balanceAvailableGt = Optional.empty();

    private Optional<String> balanceAvailableGte = Optional.empty();

    private Optional<String> balanceAvailableRange = Optional.empty();

    private Optional<String> balanceCurrent = Optional.empty();

    private Optional<String> balanceCurrentLt = Optional.empty();

    private Optional<String> balanceCurrentLte = Optional.empty();

    private Optional<String> balanceCurrentGt = Optional.empty();

    private Optional<String> balanceCurrentGte = Optional.empty();

    private Optional<String> balanceCurrentRange = Optional.empty();

    private Optional<String> category = Optional.empty();

    private Optional<String> categoryIn = Optional.empty();

    private Optional<String> createdAtGt = Optional.empty();

    private Optional<String> createdAtGte = Optional.empty();

    private Optional<String> createdAtLt = Optional.empty();

    private Optional<String> createdAtLte = Optional.empty();

    private Optional<String> createdAtRange = Optional.empty();

    private Optional<String> currency = Optional.empty();

    private Optional<String> currencyIn = Optional.empty();

    private Optional<String> id = Optional.empty();

    private Optional<String> idIn = Optional.empty();

    private Optional<String> institution = Optional.empty();

    private Optional<String> institutionIn = Optional.empty();

    private Optional<String> linkIn = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Optional<String> nameIcontains = Optional.empty();

    private Optional<String> number = Optional.empty();

    private Optional<String> numberIn = Optional.empty();

    private Optional<String> publicIdentificationName = Optional.empty();

    private Optional<String> publicIdentificationValue = Optional.empty();

    private Optional<String> type = Optional.empty();

    private Builder() {
    }

    public Builder from(ListAccountsRequest other) {
      page(other.getPage());
      pageSize(other.getPageSize());
      omit(other.getOmit());
      fields(other.getFields());
      link(other.getLink());
      balanceAvailable(other.getBalanceAvailable());
      balanceAvailableLt(other.getBalanceAvailableLt());
      balanceAvailableLte(other.getBalanceAvailableLte());
      balanceAvailableGt(other.getBalanceAvailableGt());
      balanceAvailableGte(other.getBalanceAvailableGte());
      balanceAvailableRange(other.getBalanceAvailableRange());
      balanceCurrent(other.getBalanceCurrent());
      balanceCurrentLt(other.getBalanceCurrentLt());
      balanceCurrentLte(other.getBalanceCurrentLte());
      balanceCurrentGt(other.getBalanceCurrentGt());
      balanceCurrentGte(other.getBalanceCurrentGte());
      balanceCurrentRange(other.getBalanceCurrentRange());
      category(other.getCategory());
      categoryIn(other.getCategoryIn());
      createdAtGt(other.getCreatedAtGt());
      createdAtGte(other.getCreatedAtGte());
      createdAtLt(other.getCreatedAtLt());
      createdAtLte(other.getCreatedAtLte());
      createdAtRange(other.getCreatedAtRange());
      currency(other.getCurrency());
      currencyIn(other.getCurrencyIn());
      id(other.getId());
      idIn(other.getIdIn());
      institution(other.getInstitution());
      institutionIn(other.getInstitutionIn());
      linkIn(other.getLinkIn());
      name(other.getName());
      nameIcontains(other.getNameIcontains());
      number(other.getNumber());
      numberIn(other.getNumberIn());
      publicIdentificationName(other.getPublicIdentificationName());
      publicIdentificationValue(other.getPublicIdentificationValue());
      type(other.getType());
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
        value = "balance__available",
        nulls = Nulls.SKIP
    )
    public Builder balanceAvailable(Optional<String> balanceAvailable) {
      this.balanceAvailable = balanceAvailable;
      return this;
    }

    public Builder balanceAvailable(String balanceAvailable) {
      this.balanceAvailable = Optional.of(balanceAvailable);
      return this;
    }

    @JsonSetter(
        value = "balance__available__lt",
        nulls = Nulls.SKIP
    )
    public Builder balanceAvailableLt(Optional<String> balanceAvailableLt) {
      this.balanceAvailableLt = balanceAvailableLt;
      return this;
    }

    public Builder balanceAvailableLt(String balanceAvailableLt) {
      this.balanceAvailableLt = Optional.of(balanceAvailableLt);
      return this;
    }

    @JsonSetter(
        value = "balance__available__lte",
        nulls = Nulls.SKIP
    )
    public Builder balanceAvailableLte(Optional<String> balanceAvailableLte) {
      this.balanceAvailableLte = balanceAvailableLte;
      return this;
    }

    public Builder balanceAvailableLte(String balanceAvailableLte) {
      this.balanceAvailableLte = Optional.of(balanceAvailableLte);
      return this;
    }

    @JsonSetter(
        value = "balance__available__gt",
        nulls = Nulls.SKIP
    )
    public Builder balanceAvailableGt(Optional<String> balanceAvailableGt) {
      this.balanceAvailableGt = balanceAvailableGt;
      return this;
    }

    public Builder balanceAvailableGt(String balanceAvailableGt) {
      this.balanceAvailableGt = Optional.of(balanceAvailableGt);
      return this;
    }

    @JsonSetter(
        value = "balance__available__gte",
        nulls = Nulls.SKIP
    )
    public Builder balanceAvailableGte(Optional<String> balanceAvailableGte) {
      this.balanceAvailableGte = balanceAvailableGte;
      return this;
    }

    public Builder balanceAvailableGte(String balanceAvailableGte) {
      this.balanceAvailableGte = Optional.of(balanceAvailableGte);
      return this;
    }

    @JsonSetter(
        value = "balance__available__range",
        nulls = Nulls.SKIP
    )
    public Builder balanceAvailableRange(Optional<String> balanceAvailableRange) {
      this.balanceAvailableRange = balanceAvailableRange;
      return this;
    }

    public Builder balanceAvailableRange(String balanceAvailableRange) {
      this.balanceAvailableRange = Optional.of(balanceAvailableRange);
      return this;
    }

    @JsonSetter(
        value = "balance__current",
        nulls = Nulls.SKIP
    )
    public Builder balanceCurrent(Optional<String> balanceCurrent) {
      this.balanceCurrent = balanceCurrent;
      return this;
    }

    public Builder balanceCurrent(String balanceCurrent) {
      this.balanceCurrent = Optional.of(balanceCurrent);
      return this;
    }

    @JsonSetter(
        value = "balance__current__lt",
        nulls = Nulls.SKIP
    )
    public Builder balanceCurrentLt(Optional<String> balanceCurrentLt) {
      this.balanceCurrentLt = balanceCurrentLt;
      return this;
    }

    public Builder balanceCurrentLt(String balanceCurrentLt) {
      this.balanceCurrentLt = Optional.of(balanceCurrentLt);
      return this;
    }

    @JsonSetter(
        value = "balance__current__lte",
        nulls = Nulls.SKIP
    )
    public Builder balanceCurrentLte(Optional<String> balanceCurrentLte) {
      this.balanceCurrentLte = balanceCurrentLte;
      return this;
    }

    public Builder balanceCurrentLte(String balanceCurrentLte) {
      this.balanceCurrentLte = Optional.of(balanceCurrentLte);
      return this;
    }

    @JsonSetter(
        value = "balance__current__gt",
        nulls = Nulls.SKIP
    )
    public Builder balanceCurrentGt(Optional<String> balanceCurrentGt) {
      this.balanceCurrentGt = balanceCurrentGt;
      return this;
    }

    public Builder balanceCurrentGt(String balanceCurrentGt) {
      this.balanceCurrentGt = Optional.of(balanceCurrentGt);
      return this;
    }

    @JsonSetter(
        value = "balance__current__gte",
        nulls = Nulls.SKIP
    )
    public Builder balanceCurrentGte(Optional<String> balanceCurrentGte) {
      this.balanceCurrentGte = balanceCurrentGte;
      return this;
    }

    public Builder balanceCurrentGte(String balanceCurrentGte) {
      this.balanceCurrentGte = Optional.of(balanceCurrentGte);
      return this;
    }

    @JsonSetter(
        value = "balance__current__range",
        nulls = Nulls.SKIP
    )
    public Builder balanceCurrentRange(Optional<String> balanceCurrentRange) {
      this.balanceCurrentRange = balanceCurrentRange;
      return this;
    }

    public Builder balanceCurrentRange(String balanceCurrentRange) {
      this.balanceCurrentRange = Optional.of(balanceCurrentRange);
      return this;
    }

    @JsonSetter(
        value = "category",
        nulls = Nulls.SKIP
    )
    public Builder category(Optional<String> category) {
      this.category = category;
      return this;
    }

    public Builder category(String category) {
      this.category = Optional.of(category);
      return this;
    }

    @JsonSetter(
        value = "category__in",
        nulls = Nulls.SKIP
    )
    public Builder categoryIn(Optional<String> categoryIn) {
      this.categoryIn = categoryIn;
      return this;
    }

    public Builder categoryIn(String categoryIn) {
      this.categoryIn = Optional.of(categoryIn);
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
        value = "name__icontains",
        nulls = Nulls.SKIP
    )
    public Builder nameIcontains(Optional<String> nameIcontains) {
      this.nameIcontains = nameIcontains;
      return this;
    }

    public Builder nameIcontains(String nameIcontains) {
      this.nameIcontains = Optional.of(nameIcontains);
      return this;
    }

    @JsonSetter(
        value = "number",
        nulls = Nulls.SKIP
    )
    public Builder number(Optional<String> number) {
      this.number = number;
      return this;
    }

    public Builder number(String number) {
      this.number = Optional.of(number);
      return this;
    }

    @JsonSetter(
        value = "number__in",
        nulls = Nulls.SKIP
    )
    public Builder numberIn(Optional<String> numberIn) {
      this.numberIn = numberIn;
      return this;
    }

    public Builder numberIn(String numberIn) {
      this.numberIn = Optional.of(numberIn);
      return this;
    }

    @JsonSetter(
        value = "public_identification_name",
        nulls = Nulls.SKIP
    )
    public Builder publicIdentificationName(Optional<String> publicIdentificationName) {
      this.publicIdentificationName = publicIdentificationName;
      return this;
    }

    public Builder publicIdentificationName(String publicIdentificationName) {
      this.publicIdentificationName = Optional.of(publicIdentificationName);
      return this;
    }

    @JsonSetter(
        value = "public_identification_value",
        nulls = Nulls.SKIP
    )
    public Builder publicIdentificationValue(Optional<String> publicIdentificationValue) {
      this.publicIdentificationValue = publicIdentificationValue;
      return this;
    }

    public Builder publicIdentificationValue(String publicIdentificationValue) {
      this.publicIdentificationValue = Optional.of(publicIdentificationValue);
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

    public ListAccountsRequest build() {
      return new ListAccountsRequest(page, pageSize, omit, fields, link, balanceAvailable, balanceAvailableLt, balanceAvailableLte, balanceAvailableGt, balanceAvailableGte, balanceAvailableRange, balanceCurrent, balanceCurrentLt, balanceCurrentLte, balanceCurrentGt, balanceCurrentGte, balanceCurrentRange, category, categoryIn, createdAtGt, createdAtGte, createdAtLt, createdAtLte, createdAtRange, currency, currencyIn, id, idIn, institution, institutionIn, linkIn, name, nameIcontains, number, numberIn, publicIdentificationName, publicIdentificationValue, type);
    }
  }
}
