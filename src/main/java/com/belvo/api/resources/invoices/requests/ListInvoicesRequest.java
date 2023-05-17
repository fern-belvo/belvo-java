package com.belvo.api.resources.invoices.requests;

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
    builder = ListInvoicesRequest.Builder.class
)
public final class ListInvoicesRequest {
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

  private final Optional<String> invoiceDate;

  private final Optional<String> invoiceDateLt;

  private final Optional<String> invoiceDateLte;

  private final Optional<String> invoiceDateGt;

  private final Optional<String> invoiceDateGte;

  private final Optional<String> invoiceDateRange;

  private final Optional<String> invoiceIdentification;

  private final Optional<String> invoiceIdentificationIn;

  private final Optional<String> linkIn;

  private final Optional<String> status;

  private final Optional<String> statusIn;

  private final Optional<String> totalAmount;

  private final Optional<String> totalAmountLt;

  private final Optional<String> totalAmountLte;

  private final Optional<String> totalAmountGt;

  private final Optional<String> totalAmountGte;

  private final Optional<String> totalAmountRange;

  private final Optional<String> type;

  private final Optional<String> typeIn;

  private int _cachedHashCode;

  ListInvoicesRequest(Optional<Integer> page, Optional<Integer> pageSize, Optional<String> omit,
      Optional<String> fields, Optional<String> link, Optional<String> createdAtGt,
      Optional<String> createdAtGte, Optional<String> createdAtLt, Optional<String> createdAtLte,
      Optional<String> createdAtRange, Optional<String> id, Optional<String> idIn,
      Optional<String> invoiceDate, Optional<String> invoiceDateLt, Optional<String> invoiceDateLte,
      Optional<String> invoiceDateGt, Optional<String> invoiceDateGte,
      Optional<String> invoiceDateRange, Optional<String> invoiceIdentification,
      Optional<String> invoiceIdentificationIn, Optional<String> linkIn, Optional<String> status,
      Optional<String> statusIn, Optional<String> totalAmount, Optional<String> totalAmountLt,
      Optional<String> totalAmountLte, Optional<String> totalAmountGt,
      Optional<String> totalAmountGte, Optional<String> totalAmountRange, Optional<String> type,
      Optional<String> typeIn) {
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
    this.invoiceDate = invoiceDate;
    this.invoiceDateLt = invoiceDateLt;
    this.invoiceDateLte = invoiceDateLte;
    this.invoiceDateGt = invoiceDateGt;
    this.invoiceDateGte = invoiceDateGte;
    this.invoiceDateRange = invoiceDateRange;
    this.invoiceIdentification = invoiceIdentification;
    this.invoiceIdentificationIn = invoiceIdentificationIn;
    this.linkIn = linkIn;
    this.status = status;
    this.statusIn = statusIn;
    this.totalAmount = totalAmount;
    this.totalAmountLt = totalAmountLt;
    this.totalAmountLte = totalAmountLte;
    this.totalAmountGt = totalAmountGt;
    this.totalAmountGte = totalAmountGte;
    this.totalAmountRange = totalAmountRange;
    this.type = type;
    this.typeIn = typeIn;
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
   * @return Return invoices that were last updated in Belvo's database after this date (<code>YYYY-MM-DD</code> or full <code>ISO-8601</code> timestamp).
   */
  @JsonProperty("created_at__gt")
  public Optional<String> getCreatedAtGt() {
    return createdAtGt;
  }

  /**
   * @return Return invoices that were last updated in Belvo's database after or on this date (<code>YYYY-MM-DD</code> or full <code>ISO-8601</code> timestamp).
   */
  @JsonProperty("created_at__gte")
  public Optional<String> getCreatedAtGte() {
    return createdAtGte;
  }

  /**
   * @return Return invoices that were last updated in Belvo's database before this date (<code>YYYY-MM-DD</code> or full <code>ISO-8601</code> timestamp).
   */
  @JsonProperty("created_at__lt")
  public Optional<String> getCreatedAtLt() {
    return createdAtLt;
  }

  /**
   * @return Return invoices that were last updated in Belvo's database before or on this date (<code>YYYY-MM-DD</code> or full <code>ISO-8601</code> timestamp).
   */
  @JsonProperty("created_at__lte")
  public Optional<String> getCreatedAtLte() {
    return createdAtLte;
  }

  /**
   * @return Return invoices that were last updated in Belvo's database between two dates (<code>YYYY-MM-DD</code> or full <code>ISO-8601</code> timestamp).
   */
  @JsonProperty("created_at__range")
  public Optional<String> getCreatedAtRange() {
    return createdAtRange;
  }

  /**
   * @return Return information only for this <code>invoice.id</code>.
   */
  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
  }

  /**
   * @return Return information only for these <code>invoice.id</code>s.
   */
  @JsonProperty("id__in")
  public Optional<String> getIdIn() {
    return idIn;
  }

  /**
   * @return Return invoices issued exactly on this date (<code>YYYY-MM-DD</code> or full ISO-8601 timestamp).
   */
  @JsonProperty("invoice_date")
  public Optional<String> getInvoiceDate() {
    return invoiceDate;
  }

  /**
   * @return Return balances issued before this date (<code>YYYY-MM-DD</code> or full ISO-8601 timestamp).
   */
  @JsonProperty("invoice_date__lt")
  public Optional<String> getInvoiceDateLt() {
    return invoiceDateLt;
  }

  /**
   * @return Return balances issued on this date or earlier (<code>YYYY-MM-DD</code> or full ISO-8601 timestamp).
   */
  @JsonProperty("invoice_date__lte")
  public Optional<String> getInvoiceDateLte() {
    return invoiceDateLte;
  }

  /**
   * @return Return invoices issued after this date (<code>YYYY-MM-DD</code> or full ISO-8601 timestamp).
   */
  @JsonProperty("invoice_date__gt")
  public Optional<String> getInvoiceDateGt() {
    return invoiceDateGt;
  }

  /**
   * @return Return invoices issued on this date or later (<code>YYYY-MM-DD</code> or full ISO-8601 timestamp).
   */
  @JsonProperty("invoice_date__gte")
  public Optional<String> getInvoiceDateGte() {
    return invoiceDateGte;
  }

  /**
   * @return Return invoices issued within this date range (<code>YYYY-MM-DD</code> or full ISO-8601 timestamp).
   */
  @JsonProperty("invoice_date__range")
  public Optional<String> getInvoiceDateRange() {
    return invoiceDateRange;
  }

  /**
   * @return Return an invoice with this ID (as provided by the insitution).
   */
  @JsonProperty("invoice_identification")
  public Optional<String> getInvoiceIdentification() {
    return invoiceIdentification;
  }

  /**
   * @return Return invoices with these IDs (as provided by the institution).
   */
  @JsonProperty("invoice_identification__in")
  public Optional<String> getInvoiceIdentificationIn() {
    return invoiceIdentificationIn;
  }

  /**
   * @return Return invoices only for these <code>link.id</code>s.
   */
  @JsonProperty("link__in")
  public Optional<String> getLinkIn() {
    return linkIn;
  }

  /**
   * @return Return invoices with this status. Can be either <code>Vigente</code> (valid) or <code>Cancelado</code> (cancelled).
   */
  @JsonProperty("status")
  public Optional<String> getStatus() {
    return status;
  }

  /**
   * @return Return invoices with these statuses. Can be either <code>Vigente</code> (valid) or <code>Cancelado</code> (cancelled).
   */
  @JsonProperty("status__in")
  public Optional<String> getStatusIn() {
    return statusIn;
  }

  /**
   * @return Return invoices matching exactly this value.
   */
  @JsonProperty("total_amount")
  public Optional<String> getTotalAmount() {
    return totalAmount;
  }

  /**
   * @return Return invoices less than this value.
   */
  @JsonProperty("total_amount__lt")
  public Optional<String> getTotalAmountLt() {
    return totalAmountLt;
  }

  /**
   * @return Return invoices less than or equal to this value.
   */
  @JsonProperty("total_amount__lte")
  public Optional<String> getTotalAmountLte() {
    return totalAmountLte;
  }

  /**
   * @return Return invoices greater than this value.
   */
  @JsonProperty("total_amount__gt")
  public Optional<String> getTotalAmountGt() {
    return totalAmountGt;
  }

  /**
   * @return Return invoices greater than or equal to this value.
   */
  @JsonProperty("total_amount__gte")
  public Optional<String> getTotalAmountGte() {
    return totalAmountGte;
  }

  /**
   * @return Return invoices between these two values.
   */
  @JsonProperty("total_amount__range")
  public Optional<String> getTotalAmountRange() {
    return totalAmountRange;
  }

  /**
   * @return Return invoices of this type. Can be either <code>OUTFLOW</code> or <code>INFLOW</code>.
   */
  @JsonProperty("type")
  public Optional<String> getType() {
    return type;
  }

  /**
   * @return Return invoices of these types. Can be either <code>OUTFLOW</code> or <code>INFLOW</code>.
   */
  @JsonProperty("type__in")
  public Optional<String> getTypeIn() {
    return typeIn;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof ListInvoicesRequest && equalTo((ListInvoicesRequest) other);
  }

  private boolean equalTo(ListInvoicesRequest other) {
    return page.equals(other.page) && pageSize.equals(other.pageSize) && omit.equals(other.omit) && fields.equals(other.fields) && link.equals(other.link) && createdAtGt.equals(other.createdAtGt) && createdAtGte.equals(other.createdAtGte) && createdAtLt.equals(other.createdAtLt) && createdAtLte.equals(other.createdAtLte) && createdAtRange.equals(other.createdAtRange) && id.equals(other.id) && idIn.equals(other.idIn) && invoiceDate.equals(other.invoiceDate) && invoiceDateLt.equals(other.invoiceDateLt) && invoiceDateLte.equals(other.invoiceDateLte) && invoiceDateGt.equals(other.invoiceDateGt) && invoiceDateGte.equals(other.invoiceDateGte) && invoiceDateRange.equals(other.invoiceDateRange) && invoiceIdentification.equals(other.invoiceIdentification) && invoiceIdentificationIn.equals(other.invoiceIdentificationIn) && linkIn.equals(other.linkIn) && status.equals(other.status) && statusIn.equals(other.statusIn) && totalAmount.equals(other.totalAmount) && totalAmountLt.equals(other.totalAmountLt) && totalAmountLte.equals(other.totalAmountLte) && totalAmountGt.equals(other.totalAmountGt) && totalAmountGte.equals(other.totalAmountGte) && totalAmountRange.equals(other.totalAmountRange) && type.equals(other.type) && typeIn.equals(other.typeIn);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.page, this.pageSize, this.omit, this.fields, this.link, this.createdAtGt, this.createdAtGte, this.createdAtLt, this.createdAtLte, this.createdAtRange, this.id, this.idIn, this.invoiceDate, this.invoiceDateLt, this.invoiceDateLte, this.invoiceDateGt, this.invoiceDateGte, this.invoiceDateRange, this.invoiceIdentification, this.invoiceIdentificationIn, this.linkIn, this.status, this.statusIn, this.totalAmount, this.totalAmountLt, this.totalAmountLte, this.totalAmountGt, this.totalAmountGte, this.totalAmountRange, this.type, this.typeIn);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "ListInvoicesRequest{" + "page: " + page + ", pageSize: " + pageSize + ", omit: " + omit + ", fields: " + fields + ", link: " + link + ", createdAtGt: " + createdAtGt + ", createdAtGte: " + createdAtGte + ", createdAtLt: " + createdAtLt + ", createdAtLte: " + createdAtLte + ", createdAtRange: " + createdAtRange + ", id: " + id + ", idIn: " + idIn + ", invoiceDate: " + invoiceDate + ", invoiceDateLt: " + invoiceDateLt + ", invoiceDateLte: " + invoiceDateLte + ", invoiceDateGt: " + invoiceDateGt + ", invoiceDateGte: " + invoiceDateGte + ", invoiceDateRange: " + invoiceDateRange + ", invoiceIdentification: " + invoiceIdentification + ", invoiceIdentificationIn: " + invoiceIdentificationIn + ", linkIn: " + linkIn + ", status: " + status + ", statusIn: " + statusIn + ", totalAmount: " + totalAmount + ", totalAmountLt: " + totalAmountLt + ", totalAmountLte: " + totalAmountLte + ", totalAmountGt: " + totalAmountGt + ", totalAmountGte: " + totalAmountGte + ", totalAmountRange: " + totalAmountRange + ", type: " + type + ", typeIn: " + typeIn + "}";
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

    private Optional<String> invoiceDate = Optional.empty();

    private Optional<String> invoiceDateLt = Optional.empty();

    private Optional<String> invoiceDateLte = Optional.empty();

    private Optional<String> invoiceDateGt = Optional.empty();

    private Optional<String> invoiceDateGte = Optional.empty();

    private Optional<String> invoiceDateRange = Optional.empty();

    private Optional<String> invoiceIdentification = Optional.empty();

    private Optional<String> invoiceIdentificationIn = Optional.empty();

    private Optional<String> linkIn = Optional.empty();

    private Optional<String> status = Optional.empty();

    private Optional<String> statusIn = Optional.empty();

    private Optional<String> totalAmount = Optional.empty();

    private Optional<String> totalAmountLt = Optional.empty();

    private Optional<String> totalAmountLte = Optional.empty();

    private Optional<String> totalAmountGt = Optional.empty();

    private Optional<String> totalAmountGte = Optional.empty();

    private Optional<String> totalAmountRange = Optional.empty();

    private Optional<String> type = Optional.empty();

    private Optional<String> typeIn = Optional.empty();

    private Builder() {
    }

    public Builder from(ListInvoicesRequest other) {
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
      invoiceDate(other.getInvoiceDate());
      invoiceDateLt(other.getInvoiceDateLt());
      invoiceDateLte(other.getInvoiceDateLte());
      invoiceDateGt(other.getInvoiceDateGt());
      invoiceDateGte(other.getInvoiceDateGte());
      invoiceDateRange(other.getInvoiceDateRange());
      invoiceIdentification(other.getInvoiceIdentification());
      invoiceIdentificationIn(other.getInvoiceIdentificationIn());
      linkIn(other.getLinkIn());
      status(other.getStatus());
      statusIn(other.getStatusIn());
      totalAmount(other.getTotalAmount());
      totalAmountLt(other.getTotalAmountLt());
      totalAmountLte(other.getTotalAmountLte());
      totalAmountGt(other.getTotalAmountGt());
      totalAmountGte(other.getTotalAmountGte());
      totalAmountRange(other.getTotalAmountRange());
      type(other.getType());
      typeIn(other.getTypeIn());
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
        value = "invoice_date",
        nulls = Nulls.SKIP
    )
    public Builder invoiceDate(Optional<String> invoiceDate) {
      this.invoiceDate = invoiceDate;
      return this;
    }

    public Builder invoiceDate(String invoiceDate) {
      this.invoiceDate = Optional.of(invoiceDate);
      return this;
    }

    @JsonSetter(
        value = "invoice_date__lt",
        nulls = Nulls.SKIP
    )
    public Builder invoiceDateLt(Optional<String> invoiceDateLt) {
      this.invoiceDateLt = invoiceDateLt;
      return this;
    }

    public Builder invoiceDateLt(String invoiceDateLt) {
      this.invoiceDateLt = Optional.of(invoiceDateLt);
      return this;
    }

    @JsonSetter(
        value = "invoice_date__lte",
        nulls = Nulls.SKIP
    )
    public Builder invoiceDateLte(Optional<String> invoiceDateLte) {
      this.invoiceDateLte = invoiceDateLte;
      return this;
    }

    public Builder invoiceDateLte(String invoiceDateLte) {
      this.invoiceDateLte = Optional.of(invoiceDateLte);
      return this;
    }

    @JsonSetter(
        value = "invoice_date__gt",
        nulls = Nulls.SKIP
    )
    public Builder invoiceDateGt(Optional<String> invoiceDateGt) {
      this.invoiceDateGt = invoiceDateGt;
      return this;
    }

    public Builder invoiceDateGt(String invoiceDateGt) {
      this.invoiceDateGt = Optional.of(invoiceDateGt);
      return this;
    }

    @JsonSetter(
        value = "invoice_date__gte",
        nulls = Nulls.SKIP
    )
    public Builder invoiceDateGte(Optional<String> invoiceDateGte) {
      this.invoiceDateGte = invoiceDateGte;
      return this;
    }

    public Builder invoiceDateGte(String invoiceDateGte) {
      this.invoiceDateGte = Optional.of(invoiceDateGte);
      return this;
    }

    @JsonSetter(
        value = "invoice_date__range",
        nulls = Nulls.SKIP
    )
    public Builder invoiceDateRange(Optional<String> invoiceDateRange) {
      this.invoiceDateRange = invoiceDateRange;
      return this;
    }

    public Builder invoiceDateRange(String invoiceDateRange) {
      this.invoiceDateRange = Optional.of(invoiceDateRange);
      return this;
    }

    @JsonSetter(
        value = "invoice_identification",
        nulls = Nulls.SKIP
    )
    public Builder invoiceIdentification(Optional<String> invoiceIdentification) {
      this.invoiceIdentification = invoiceIdentification;
      return this;
    }

    public Builder invoiceIdentification(String invoiceIdentification) {
      this.invoiceIdentification = Optional.of(invoiceIdentification);
      return this;
    }

    @JsonSetter(
        value = "invoice_identification__in",
        nulls = Nulls.SKIP
    )
    public Builder invoiceIdentificationIn(Optional<String> invoiceIdentificationIn) {
      this.invoiceIdentificationIn = invoiceIdentificationIn;
      return this;
    }

    public Builder invoiceIdentificationIn(String invoiceIdentificationIn) {
      this.invoiceIdentificationIn = Optional.of(invoiceIdentificationIn);
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
        value = "status",
        nulls = Nulls.SKIP
    )
    public Builder status(Optional<String> status) {
      this.status = status;
      return this;
    }

    public Builder status(String status) {
      this.status = Optional.of(status);
      return this;
    }

    @JsonSetter(
        value = "status__in",
        nulls = Nulls.SKIP
    )
    public Builder statusIn(Optional<String> statusIn) {
      this.statusIn = statusIn;
      return this;
    }

    public Builder statusIn(String statusIn) {
      this.statusIn = Optional.of(statusIn);
      return this;
    }

    @JsonSetter(
        value = "total_amount",
        nulls = Nulls.SKIP
    )
    public Builder totalAmount(Optional<String> totalAmount) {
      this.totalAmount = totalAmount;
      return this;
    }

    public Builder totalAmount(String totalAmount) {
      this.totalAmount = Optional.of(totalAmount);
      return this;
    }

    @JsonSetter(
        value = "total_amount__lt",
        nulls = Nulls.SKIP
    )
    public Builder totalAmountLt(Optional<String> totalAmountLt) {
      this.totalAmountLt = totalAmountLt;
      return this;
    }

    public Builder totalAmountLt(String totalAmountLt) {
      this.totalAmountLt = Optional.of(totalAmountLt);
      return this;
    }

    @JsonSetter(
        value = "total_amount__lte",
        nulls = Nulls.SKIP
    )
    public Builder totalAmountLte(Optional<String> totalAmountLte) {
      this.totalAmountLte = totalAmountLte;
      return this;
    }

    public Builder totalAmountLte(String totalAmountLte) {
      this.totalAmountLte = Optional.of(totalAmountLte);
      return this;
    }

    @JsonSetter(
        value = "total_amount__gt",
        nulls = Nulls.SKIP
    )
    public Builder totalAmountGt(Optional<String> totalAmountGt) {
      this.totalAmountGt = totalAmountGt;
      return this;
    }

    public Builder totalAmountGt(String totalAmountGt) {
      this.totalAmountGt = Optional.of(totalAmountGt);
      return this;
    }

    @JsonSetter(
        value = "total_amount__gte",
        nulls = Nulls.SKIP
    )
    public Builder totalAmountGte(Optional<String> totalAmountGte) {
      this.totalAmountGte = totalAmountGte;
      return this;
    }

    public Builder totalAmountGte(String totalAmountGte) {
      this.totalAmountGte = Optional.of(totalAmountGte);
      return this;
    }

    @JsonSetter(
        value = "total_amount__range",
        nulls = Nulls.SKIP
    )
    public Builder totalAmountRange(Optional<String> totalAmountRange) {
      this.totalAmountRange = totalAmountRange;
      return this;
    }

    public Builder totalAmountRange(String totalAmountRange) {
      this.totalAmountRange = Optional.of(totalAmountRange);
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

    @JsonSetter(
        value = "type__in",
        nulls = Nulls.SKIP
    )
    public Builder typeIn(Optional<String> typeIn) {
      this.typeIn = typeIn;
      return this;
    }

    public Builder typeIn(String typeIn) {
      this.typeIn = Optional.of(typeIn);
      return this;
    }

    public ListInvoicesRequest build() {
      return new ListInvoicesRequest(page, pageSize, omit, fields, link, createdAtGt, createdAtGte, createdAtLt, createdAtLte, createdAtRange, id, idIn, invoiceDate, invoiceDateLt, invoiceDateLte, invoiceDateGt, invoiceDateGte, invoiceDateRange, invoiceIdentification, invoiceIdentificationIn, linkIn, status, statusIn, totalAmount, totalAmountLt, totalAmountLte, totalAmountGt, totalAmountGte, totalAmountRange, type, typeIn);
    }
  }
}
