package com.belvo.api.resources.taxdeclarations.requests;

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
    builder = ListTaxDeclarationsRequest.Builder.class
)
public final class ListTaxDeclarationsRequest {
  private final Optional<Integer> page;

  private final Optional<Integer> pageSize;

  private final Optional<String> omit;

  private final Optional<String> fields;

  private final Optional<String> link;

  private final Optional<String> linkIn;

  private final Optional<String> createdAtGt;

  private final Optional<String> createdAtGte;

  private final Optional<String> createdAtLt;

  private final Optional<String> createdAtLte;

  private final Optional<String> createdAtRange;

  private final Optional<String> id;

  private final Optional<String> idIn;

  private final Optional<String> year;

  private final Optional<String> yearGt;

  private final Optional<String> yearGte;

  private final Optional<String> yearLt;

  private final Optional<String> yearLte;

  private final Optional<String> yearRange;

  private int _cachedHashCode;

  ListTaxDeclarationsRequest(Optional<Integer> page, Optional<Integer> pageSize,
      Optional<String> omit, Optional<String> fields, Optional<String> link,
      Optional<String> linkIn, Optional<String> createdAtGt, Optional<String> createdAtGte,
      Optional<String> createdAtLt, Optional<String> createdAtLte, Optional<String> createdAtRange,
      Optional<String> id, Optional<String> idIn, Optional<String> year, Optional<String> yearGt,
      Optional<String> yearGte, Optional<String> yearLt, Optional<String> yearLte,
      Optional<String> yearRange) {
    this.page = page;
    this.pageSize = pageSize;
    this.omit = omit;
    this.fields = fields;
    this.link = link;
    this.linkIn = linkIn;
    this.createdAtGt = createdAtGt;
    this.createdAtGte = createdAtGte;
    this.createdAtLt = createdAtLt;
    this.createdAtLte = createdAtLte;
    this.createdAtRange = createdAtRange;
    this.id = id;
    this.idIn = idIn;
    this.year = year;
    this.yearGt = yearGt;
    this.yearGte = yearGte;
    this.yearLt = yearLt;
    this.yearLte = yearLte;
    this.yearRange = yearRange;
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
   * @return Return information for these <code>link.id</code>s.
   */
  @JsonProperty("link__in")
  public Optional<String> getLinkIn() {
    return linkIn;
  }

  /**
   * @return Return tax declarations that were last updated in Belvo's database after this date (<code>YYYY-MM-DD</code> or full <code>ISO-8601</code> timestamp).
   */
  @JsonProperty("created_at__gt")
  public Optional<String> getCreatedAtGt() {
    return createdAtGt;
  }

  /**
   * @return Return tax declarations that were last updated in Belvo's database after or on this date (<code>YYYY-MM-DD</code> or full <code>ISO-8601</code> timestamp).
   */
  @JsonProperty("created_at__gte")
  public Optional<String> getCreatedAtGte() {
    return createdAtGte;
  }

  /**
   * @return Return tax declarations that were last updated in Belvo's database before this date (<code>YYYY-MM-DD</code> or full <code>ISO-8601</code> timestamp).
   */
  @JsonProperty("created_at__lt")
  public Optional<String> getCreatedAtLt() {
    return createdAtLt;
  }

  /**
   * @return Return tax declarations that were last updated in Belvo's database before or on this date (<code>YYYY-MM-DD</code> or full <code>ISO-8601</code> timestamp).
   */
  @JsonProperty("created_at__lte")
  public Optional<String> getCreatedAtLte() {
    return createdAtLte;
  }

  /**
   * @return Return tax declarations that were last updated in Belvo's database between two dates (<code>YYYY-MM-DD</code> or full <code>ISO-8601</code> timestamp).
   */
  @JsonProperty("created_at__range")
  public Optional<String> getCreatedAtRange() {
    return createdAtRange;
  }

  /**
   * @return Return information for this <code>tax-declaration.id</code>.
   */
  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
  }

  /**
   * @return Return information for these <code>tax-declaration.id</code>s.
   */
  @JsonProperty("id__in")
  public Optional<String> getIdIn() {
    return idIn;
  }

  /**
   * @return Return tax declarations for this year (<code>YYYY</code>).
   */
  @JsonProperty("year")
  public Optional<String> getYear() {
    return year;
  }

  /**
   * @return Return tax declarations for after this year (<code>YYYY</code>).
   */
  @JsonProperty("year__gt")
  public Optional<String> getYearGt() {
    return yearGt;
  }

  /**
   * @return Return tax declarations for this year or after (<code>YYYY</code>).
   */
  @JsonProperty("year__gte")
  public Optional<String> getYearGte() {
    return yearGte;
  }

  /**
   * @return Return tax declarations for before this year (<code>YYYY</code>).
   */
  @JsonProperty("year__lt")
  public Optional<String> getYearLt() {
    return yearLt;
  }

  /**
   * @return Return tax declarations for this year or earlier (<code>YYYY</code>).
   */
  @JsonProperty("year__lte")
  public Optional<String> getYearLte() {
    return yearLte;
  }

  /**
   * @return Return tax declarations between these two years (<code>YYYY</code>).
   */
  @JsonProperty("year__range")
  public Optional<String> getYearRange() {
    return yearRange;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof ListTaxDeclarationsRequest && equalTo((ListTaxDeclarationsRequest) other);
  }

  private boolean equalTo(ListTaxDeclarationsRequest other) {
    return page.equals(other.page) && pageSize.equals(other.pageSize) && omit.equals(other.omit) && fields.equals(other.fields) && link.equals(other.link) && linkIn.equals(other.linkIn) && createdAtGt.equals(other.createdAtGt) && createdAtGte.equals(other.createdAtGte) && createdAtLt.equals(other.createdAtLt) && createdAtLte.equals(other.createdAtLte) && createdAtRange.equals(other.createdAtRange) && id.equals(other.id) && idIn.equals(other.idIn) && year.equals(other.year) && yearGt.equals(other.yearGt) && yearGte.equals(other.yearGte) && yearLt.equals(other.yearLt) && yearLte.equals(other.yearLte) && yearRange.equals(other.yearRange);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.page, this.pageSize, this.omit, this.fields, this.link, this.linkIn, this.createdAtGt, this.createdAtGte, this.createdAtLt, this.createdAtLte, this.createdAtRange, this.id, this.idIn, this.year, this.yearGt, this.yearGte, this.yearLt, this.yearLte, this.yearRange);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "ListTaxDeclarationsRequest{" + "page: " + page + ", pageSize: " + pageSize + ", omit: " + omit + ", fields: " + fields + ", link: " + link + ", linkIn: " + linkIn + ", createdAtGt: " + createdAtGt + ", createdAtGte: " + createdAtGte + ", createdAtLt: " + createdAtLt + ", createdAtLte: " + createdAtLte + ", createdAtRange: " + createdAtRange + ", id: " + id + ", idIn: " + idIn + ", year: " + year + ", yearGt: " + yearGt + ", yearGte: " + yearGte + ", yearLt: " + yearLt + ", yearLte: " + yearLte + ", yearRange: " + yearRange + "}";
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

    private Optional<String> linkIn = Optional.empty();

    private Optional<String> createdAtGt = Optional.empty();

    private Optional<String> createdAtGte = Optional.empty();

    private Optional<String> createdAtLt = Optional.empty();

    private Optional<String> createdAtLte = Optional.empty();

    private Optional<String> createdAtRange = Optional.empty();

    private Optional<String> id = Optional.empty();

    private Optional<String> idIn = Optional.empty();

    private Optional<String> year = Optional.empty();

    private Optional<String> yearGt = Optional.empty();

    private Optional<String> yearGte = Optional.empty();

    private Optional<String> yearLt = Optional.empty();

    private Optional<String> yearLte = Optional.empty();

    private Optional<String> yearRange = Optional.empty();

    private Builder() {
    }

    public Builder from(ListTaxDeclarationsRequest other) {
      page(other.getPage());
      pageSize(other.getPageSize());
      omit(other.getOmit());
      fields(other.getFields());
      link(other.getLink());
      linkIn(other.getLinkIn());
      createdAtGt(other.getCreatedAtGt());
      createdAtGte(other.getCreatedAtGte());
      createdAtLt(other.getCreatedAtLt());
      createdAtLte(other.getCreatedAtLte());
      createdAtRange(other.getCreatedAtRange());
      id(other.getId());
      idIn(other.getIdIn());
      year(other.getYear());
      yearGt(other.getYearGt());
      yearGte(other.getYearGte());
      yearLt(other.getYearLt());
      yearLte(other.getYearLte());
      yearRange(other.getYearRange());
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
        value = "year",
        nulls = Nulls.SKIP
    )
    public Builder year(Optional<String> year) {
      this.year = year;
      return this;
    }

    public Builder year(String year) {
      this.year = Optional.of(year);
      return this;
    }

    @JsonSetter(
        value = "year__gt",
        nulls = Nulls.SKIP
    )
    public Builder yearGt(Optional<String> yearGt) {
      this.yearGt = yearGt;
      return this;
    }

    public Builder yearGt(String yearGt) {
      this.yearGt = Optional.of(yearGt);
      return this;
    }

    @JsonSetter(
        value = "year__gte",
        nulls = Nulls.SKIP
    )
    public Builder yearGte(Optional<String> yearGte) {
      this.yearGte = yearGte;
      return this;
    }

    public Builder yearGte(String yearGte) {
      this.yearGte = Optional.of(yearGte);
      return this;
    }

    @JsonSetter(
        value = "year__lt",
        nulls = Nulls.SKIP
    )
    public Builder yearLt(Optional<String> yearLt) {
      this.yearLt = yearLt;
      return this;
    }

    public Builder yearLt(String yearLt) {
      this.yearLt = Optional.of(yearLt);
      return this;
    }

    @JsonSetter(
        value = "year__lte",
        nulls = Nulls.SKIP
    )
    public Builder yearLte(Optional<String> yearLte) {
      this.yearLte = yearLte;
      return this;
    }

    public Builder yearLte(String yearLte) {
      this.yearLte = Optional.of(yearLte);
      return this;
    }

    @JsonSetter(
        value = "year__range",
        nulls = Nulls.SKIP
    )
    public Builder yearRange(Optional<String> yearRange) {
      this.yearRange = yearRange;
      return this;
    }

    public Builder yearRange(String yearRange) {
      this.yearRange = Optional.of(yearRange);
      return this;
    }

    public ListTaxDeclarationsRequest build() {
      return new ListTaxDeclarationsRequest(page, pageSize, omit, fields, link, linkIn, createdAtGt, createdAtGte, createdAtLt, createdAtLte, createdAtRange, id, idIn, year, yearGt, yearGte, yearLt, yearLte, yearRange);
    }
  }
}
