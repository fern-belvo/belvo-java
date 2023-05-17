package com.belvo.api.resources.taxreturns.requests;

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
    builder = ListTaxReturnsRequest.Builder.class
)
public final class ListTaxReturnsRequest {
  private final Optional<Integer> page;

  private final Optional<Integer> pageSize;

  private final Optional<String> omit;

  private final Optional<String> fields;

  private final Optional<String> link;

  private final Optional<String> createdAtGt;

  private final Optional<String> createdAtGte;

  private final Optional<String> createdAtLt;

  private final Optional<String> createdAtLte;

  private final Optional<String> createdAtRange;

  private final Optional<String> id;

  private final Optional<String> idIn;

  private final Optional<String> ejercicio;

  private final Optional<String> ejercicioLt;

  private final Optional<String> ejercicioLte;

  private final Optional<String> ejercicioGt;

  private final Optional<String> ejercicioGte;

  private final Optional<String> ejercicioRange;

  private final Optional<String> tipoDeclaracion;

  private final Optional<String> tipoDeclaracionIn;

  private final Optional<String> linkIn;

  private int _cachedHashCode;

  ListTaxReturnsRequest(Optional<Integer> page, Optional<Integer> pageSize, Optional<String> omit,
      Optional<String> fields, Optional<String> link, Optional<String> createdAtGt,
      Optional<String> createdAtGte, Optional<String> createdAtLt, Optional<String> createdAtLte,
      Optional<String> createdAtRange, Optional<String> id, Optional<String> idIn,
      Optional<String> ejercicio, Optional<String> ejercicioLt, Optional<String> ejercicioLte,
      Optional<String> ejercicioGt, Optional<String> ejercicioGte, Optional<String> ejercicioRange,
      Optional<String> tipoDeclaracion, Optional<String> tipoDeclaracionIn,
      Optional<String> linkIn) {
    this.page = page;
    this.pageSize = pageSize;
    this.omit = omit;
    this.fields = fields;
    this.link = link;
    this.createdAtGt = createdAtGt;
    this.createdAtGte = createdAtGte;
    this.createdAtLt = createdAtLt;
    this.createdAtLte = createdAtLte;
    this.createdAtRange = createdAtRange;
    this.id = id;
    this.idIn = idIn;
    this.ejercicio = ejercicio;
    this.ejercicioLt = ejercicioLt;
    this.ejercicioLte = ejercicioLte;
    this.ejercicioGt = ejercicioGt;
    this.ejercicioGte = ejercicioGte;
    this.ejercicioRange = ejercicioRange;
    this.tipoDeclaracion = tipoDeclaracion;
    this.tipoDeclaracionIn = tipoDeclaracionIn;
    this.linkIn = linkIn;
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
   * @return Return tax returns that were last updated in Belvo's database after this date (<code>YYYY-MM-DD</code> or full <code>ISO-8601</code> timestamp).
   */
  @JsonProperty("created_at__gt")
  public Optional<String> getCreatedAtGt() {
    return createdAtGt;
  }

  /**
   * @return Return tax returns that were last updated in Belvo's database after or on this date (<code>YYYY-MM-DD</code> or full <code>ISO-8601</code> timestamp).
   */
  @JsonProperty("created_at__gte")
  public Optional<String> getCreatedAtGte() {
    return createdAtGte;
  }

  /**
   * @return Return tax returns that were last updated in Belvo's database before this date (<code>YYYY-MM-DD</code> or full <code>ISO-8601</code> timestamp).
   */
  @JsonProperty("created_at__lt")
  public Optional<String> getCreatedAtLt() {
    return createdAtLt;
  }

  /**
   * @return Return tax returns that were last updated in Belvo's database before or on this date (<code>YYYY-MM-DD</code> or full <code>ISO-8601</code> timestamp).
   */
  @JsonProperty("created_at__lte")
  public Optional<String> getCreatedAtLte() {
    return createdAtLte;
  }

  /**
   * @return Return tax returns that were last updated in Belvo's database between two dates (<code>YYYY-MM-DD</code> or full <code>ISO-8601</code> timestamp).
   */
  @JsonProperty("created_at__range")
  public Optional<String> getCreatedAtRange() {
    return createdAtRange;
  }

  /**
   * @return Return information for this <code>tax-return.id</code>.
   */
  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
  }

  /**
   * @return Return information for these <code>tax-return.id</code>s.
   */
  @JsonProperty("id__in")
  public Optional<String> getIdIn() {
    return idIn;
  }

  /**
   * @return Return tax returns for exactly this year (<code>YYYY</code>).
   */
  @JsonProperty("ejercicio")
  public Optional<String> getEjercicio() {
    return ejercicio;
  }

  /**
   * @return Return tax returns for before this year (<code>YYYY</code>).
   */
  @JsonProperty("ejercicio__lt")
  public Optional<String> getEjercicioLt() {
    return ejercicioLt;
  }

  /**
   * @return Return tax returns for this year and earlier (<code>YYYY</code>).
   */
  @JsonProperty("ejercicio__lte")
  public Optional<String> getEjercicioLte() {
    return ejercicioLte;
  }

  /**
   * @return Return tax returns for after this year (<code>YYYY</code>).
   */
  @JsonProperty("ejercicio__gt")
  public Optional<String> getEjercicioGt() {
    return ejercicioGt;
  }

  /**
   * @return Return tax returns for this year or later (<code>YYYY</code>).
   */
  @JsonProperty("ejercicio__gte")
  public Optional<String> getEjercicioGte() {
    return ejercicioGte;
  }

  /**
   * @return Return tax returns for this range of years (<code>YYYY</code>).
   */
  @JsonProperty("ejercicio__range")
  public Optional<String> getEjercicioRange() {
    return ejercicioRange;
  }

  /**
   * @return Return tax returns with this declaration type.
   */
  @JsonProperty("tipo_declaracion")
  public Optional<String> getTipoDeclaracion() {
    return tipoDeclaracion;
  }

  /**
   * @return Return tax returns with these declaration types.
   */
  @JsonProperty("tipo_declaracion__in")
  public Optional<String> getTipoDeclaracionIn() {
    return tipoDeclaracionIn;
  }

  /**
   * @return Return information for these <code>link.id</code>s.
   */
  @JsonProperty("link__in")
  public Optional<String> getLinkIn() {
    return linkIn;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof ListTaxReturnsRequest && equalTo((ListTaxReturnsRequest) other);
  }

  private boolean equalTo(ListTaxReturnsRequest other) {
    return page.equals(other.page) && pageSize.equals(other.pageSize) && omit.equals(other.omit) && fields.equals(other.fields) && link.equals(other.link) && createdAtGt.equals(other.createdAtGt) && createdAtGte.equals(other.createdAtGte) && createdAtLt.equals(other.createdAtLt) && createdAtLte.equals(other.createdAtLte) && createdAtRange.equals(other.createdAtRange) && id.equals(other.id) && idIn.equals(other.idIn) && ejercicio.equals(other.ejercicio) && ejercicioLt.equals(other.ejercicioLt) && ejercicioLte.equals(other.ejercicioLte) && ejercicioGt.equals(other.ejercicioGt) && ejercicioGte.equals(other.ejercicioGte) && ejercicioRange.equals(other.ejercicioRange) && tipoDeclaracion.equals(other.tipoDeclaracion) && tipoDeclaracionIn.equals(other.tipoDeclaracionIn) && linkIn.equals(other.linkIn);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.page, this.pageSize, this.omit, this.fields, this.link, this.createdAtGt, this.createdAtGte, this.createdAtLt, this.createdAtLte, this.createdAtRange, this.id, this.idIn, this.ejercicio, this.ejercicioLt, this.ejercicioLte, this.ejercicioGt, this.ejercicioGte, this.ejercicioRange, this.tipoDeclaracion, this.tipoDeclaracionIn, this.linkIn);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "ListTaxReturnsRequest{" + "page: " + page + ", pageSize: " + pageSize + ", omit: " + omit + ", fields: " + fields + ", link: " + link + ", createdAtGt: " + createdAtGt + ", createdAtGte: " + createdAtGte + ", createdAtLt: " + createdAtLt + ", createdAtLte: " + createdAtLte + ", createdAtRange: " + createdAtRange + ", id: " + id + ", idIn: " + idIn + ", ejercicio: " + ejercicio + ", ejercicioLt: " + ejercicioLt + ", ejercicioLte: " + ejercicioLte + ", ejercicioGt: " + ejercicioGt + ", ejercicioGte: " + ejercicioGte + ", ejercicioRange: " + ejercicioRange + ", tipoDeclaracion: " + tipoDeclaracion + ", tipoDeclaracionIn: " + tipoDeclaracionIn + ", linkIn: " + linkIn + "}";
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

    private Optional<String> createdAtGt = Optional.empty();

    private Optional<String> createdAtGte = Optional.empty();

    private Optional<String> createdAtLt = Optional.empty();

    private Optional<String> createdAtLte = Optional.empty();

    private Optional<String> createdAtRange = Optional.empty();

    private Optional<String> id = Optional.empty();

    private Optional<String> idIn = Optional.empty();

    private Optional<String> ejercicio = Optional.empty();

    private Optional<String> ejercicioLt = Optional.empty();

    private Optional<String> ejercicioLte = Optional.empty();

    private Optional<String> ejercicioGt = Optional.empty();

    private Optional<String> ejercicioGte = Optional.empty();

    private Optional<String> ejercicioRange = Optional.empty();

    private Optional<String> tipoDeclaracion = Optional.empty();

    private Optional<String> tipoDeclaracionIn = Optional.empty();

    private Optional<String> linkIn = Optional.empty();

    private Builder() {
    }

    public Builder from(ListTaxReturnsRequest other) {
      page(other.getPage());
      pageSize(other.getPageSize());
      omit(other.getOmit());
      fields(other.getFields());
      link(other.getLink());
      createdAtGt(other.getCreatedAtGt());
      createdAtGte(other.getCreatedAtGte());
      createdAtLt(other.getCreatedAtLt());
      createdAtLte(other.getCreatedAtLte());
      createdAtRange(other.getCreatedAtRange());
      id(other.getId());
      idIn(other.getIdIn());
      ejercicio(other.getEjercicio());
      ejercicioLt(other.getEjercicioLt());
      ejercicioLte(other.getEjercicioLte());
      ejercicioGt(other.getEjercicioGt());
      ejercicioGte(other.getEjercicioGte());
      ejercicioRange(other.getEjercicioRange());
      tipoDeclaracion(other.getTipoDeclaracion());
      tipoDeclaracionIn(other.getTipoDeclaracionIn());
      linkIn(other.getLinkIn());
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
        value = "ejercicio",
        nulls = Nulls.SKIP
    )
    public Builder ejercicio(Optional<String> ejercicio) {
      this.ejercicio = ejercicio;
      return this;
    }

    public Builder ejercicio(String ejercicio) {
      this.ejercicio = Optional.of(ejercicio);
      return this;
    }

    @JsonSetter(
        value = "ejercicio__lt",
        nulls = Nulls.SKIP
    )
    public Builder ejercicioLt(Optional<String> ejercicioLt) {
      this.ejercicioLt = ejercicioLt;
      return this;
    }

    public Builder ejercicioLt(String ejercicioLt) {
      this.ejercicioLt = Optional.of(ejercicioLt);
      return this;
    }

    @JsonSetter(
        value = "ejercicio__lte",
        nulls = Nulls.SKIP
    )
    public Builder ejercicioLte(Optional<String> ejercicioLte) {
      this.ejercicioLte = ejercicioLte;
      return this;
    }

    public Builder ejercicioLte(String ejercicioLte) {
      this.ejercicioLte = Optional.of(ejercicioLte);
      return this;
    }

    @JsonSetter(
        value = "ejercicio__gt",
        nulls = Nulls.SKIP
    )
    public Builder ejercicioGt(Optional<String> ejercicioGt) {
      this.ejercicioGt = ejercicioGt;
      return this;
    }

    public Builder ejercicioGt(String ejercicioGt) {
      this.ejercicioGt = Optional.of(ejercicioGt);
      return this;
    }

    @JsonSetter(
        value = "ejercicio__gte",
        nulls = Nulls.SKIP
    )
    public Builder ejercicioGte(Optional<String> ejercicioGte) {
      this.ejercicioGte = ejercicioGte;
      return this;
    }

    public Builder ejercicioGte(String ejercicioGte) {
      this.ejercicioGte = Optional.of(ejercicioGte);
      return this;
    }

    @JsonSetter(
        value = "ejercicio__range",
        nulls = Nulls.SKIP
    )
    public Builder ejercicioRange(Optional<String> ejercicioRange) {
      this.ejercicioRange = ejercicioRange;
      return this;
    }

    public Builder ejercicioRange(String ejercicioRange) {
      this.ejercicioRange = Optional.of(ejercicioRange);
      return this;
    }

    @JsonSetter(
        value = "tipo_declaracion",
        nulls = Nulls.SKIP
    )
    public Builder tipoDeclaracion(Optional<String> tipoDeclaracion) {
      this.tipoDeclaracion = tipoDeclaracion;
      return this;
    }

    public Builder tipoDeclaracion(String tipoDeclaracion) {
      this.tipoDeclaracion = Optional.of(tipoDeclaracion);
      return this;
    }

    @JsonSetter(
        value = "tipo_declaracion__in",
        nulls = Nulls.SKIP
    )
    public Builder tipoDeclaracionIn(Optional<String> tipoDeclaracionIn) {
      this.tipoDeclaracionIn = tipoDeclaracionIn;
      return this;
    }

    public Builder tipoDeclaracionIn(String tipoDeclaracionIn) {
      this.tipoDeclaracionIn = Optional.of(tipoDeclaracionIn);
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

    public ListTaxReturnsRequest build() {
      return new ListTaxReturnsRequest(page, pageSize, omit, fields, link, createdAtGt, createdAtGte, createdAtLt, createdAtLte, createdAtRange, id, idIn, ejercicio, ejercicioLt, ejercicioLte, ejercicioGt, ejercicioGte, ejercicioRange, tipoDeclaracion, tipoDeclaracionIn, linkIn);
    }
  }
}
