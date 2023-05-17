package com.belvo.api.resources.paymentlinks.requests;

import com.belvo.api.types.ListPaymentLinksRequestOrdering;
import com.belvo.api.types.ListPaymentLinksRequestStatus;
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
    builder = ListPaymentLinksRequest.Builder.class
)
public final class ListPaymentLinksRequest {
  private final Optional<Integer> page;

  private final Optional<Integer> pageSize;

  private final Optional<String> createdAt;

  private final Optional<String> createdAtGt;

  private final Optional<String> createdAtGte;

  private final Optional<String> createdAtLt;

  private final Optional<String> createdAtLte;

  private final Optional<String> createdAtRange;

  private final Optional<ListPaymentLinksRequestStatus> status;

  private final Optional<ListPaymentLinksRequestOrdering> ordering;

  private final Optional<String> search;

  private int _cachedHashCode;

  ListPaymentLinksRequest(Optional<Integer> page, Optional<Integer> pageSize,
      Optional<String> createdAt, Optional<String> createdAtGt, Optional<String> createdAtGte,
      Optional<String> createdAtLt, Optional<String> createdAtLte, Optional<String> createdAtRange,
      Optional<ListPaymentLinksRequestStatus> status,
      Optional<ListPaymentLinksRequestOrdering> ordering, Optional<String> search) {
    this.page = page;
    this.pageSize = pageSize;
    this.createdAt = createdAt;
    this.createdAtGt = createdAtGt;
    this.createdAtGte = createdAtGte;
    this.createdAtLt = createdAtLt;
    this.createdAtLte = createdAtLte;
    this.createdAtRange = createdAtRange;
    this.status = status;
    this.ordering = ordering;
    this.search = search;
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
   * <p>ℹ️ The minimum number of results returned per page is 1 and the maximum is 100. If you enter a value greater than 100, our API will default to the maximum value (1000).</p>
   */
  @JsonProperty("page_size")
  public Optional<Integer> getPageSize() {
    return pageSize;
  }

  /**
   * @return Return results only for this date (in <code>YYYY-MM-DD</code> format).
   */
  @JsonProperty("created_at")
  public Optional<String> getCreatedAt() {
    return createdAt;
  }

  /**
   * @return Return results only after this date (in <code>YYYY-MM-DD</code> format).
   */
  @JsonProperty("created_at__gt")
  public Optional<String> getCreatedAtGt() {
    return createdAtGt;
  }

  /**
   * @return Return results only for this date and after (in <code>YYYY-MM-DD</code> format).
   */
  @JsonProperty("created_at__gte")
  public Optional<String> getCreatedAtGte() {
    return createdAtGte;
  }

  /**
   * @return Return results only before this date (in <code>YYYY-MM-DD</code> format).
   */
  @JsonProperty("created_at__lt")
  public Optional<String> getCreatedAtLt() {
    return createdAtLt;
  }

  /**
   * @return Return results only for this date and before (in <code>YYYY-MM-DD</code> format).
   */
  @JsonProperty("created_at__lte")
  public Optional<String> getCreatedAtLte() {
    return createdAtLte;
  }

  /**
   * @return Return results between this date range (in <code>YYYY-MM-DD</code> format).
   */
  @JsonProperty("created_at__range")
  public Optional<String> getCreatedAtRange() {
    return createdAtRange;
  }

  /**
   * @return Return payment links with this status. Can be either <code>ACTIVE</code> or <code>INACTIVE</code>.
   */
  @JsonProperty("status")
  public Optional<ListPaymentLinksRequestStatus> getStatus() {
    return status;
  }

  /**
   * @return Return results in a specified time order. Can be either:
   * <ul>
   * <li><code>created_at</code> returns payment links from newest to oldest (in ascending order).</li>
   * <li><code>-created_at</code> returns payment links from oldest to newest (in descending order).</li>
   * </ul>
   */
  @JsonProperty("ordering")
  public Optional<ListPaymentLinksRequestOrdering> getOrdering() {
    return ordering;
  }

  /**
   * @return Return results for one or more payment links that match the description you searched for.
   * <p><strong>Note:</strong> This filter supports both full and partial search queries, with a minimum of three characters required. For example, searching for <code>trai</code> may match the following values:</p>
   * <ul>
   * <li><code>Awesome training sneakers</code></li>
   * <li><code>Training equipment</code></li>
   * </ul>
   */
  @JsonProperty("search")
  public Optional<String> getSearch() {
    return search;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof ListPaymentLinksRequest && equalTo((ListPaymentLinksRequest) other);
  }

  private boolean equalTo(ListPaymentLinksRequest other) {
    return page.equals(other.page) && pageSize.equals(other.pageSize) && createdAt.equals(other.createdAt) && createdAtGt.equals(other.createdAtGt) && createdAtGte.equals(other.createdAtGte) && createdAtLt.equals(other.createdAtLt) && createdAtLte.equals(other.createdAtLte) && createdAtRange.equals(other.createdAtRange) && status.equals(other.status) && ordering.equals(other.ordering) && search.equals(other.search);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.page, this.pageSize, this.createdAt, this.createdAtGt, this.createdAtGte, this.createdAtLt, this.createdAtLte, this.createdAtRange, this.status, this.ordering, this.search);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "ListPaymentLinksRequest{" + "page: " + page + ", pageSize: " + pageSize + ", createdAt: " + createdAt + ", createdAtGt: " + createdAtGt + ", createdAtGte: " + createdAtGte + ", createdAtLt: " + createdAtLt + ", createdAtLte: " + createdAtLte + ", createdAtRange: " + createdAtRange + ", status: " + status + ", ordering: " + ordering + ", search: " + search + "}";
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

    private Optional<String> createdAt = Optional.empty();

    private Optional<String> createdAtGt = Optional.empty();

    private Optional<String> createdAtGte = Optional.empty();

    private Optional<String> createdAtLt = Optional.empty();

    private Optional<String> createdAtLte = Optional.empty();

    private Optional<String> createdAtRange = Optional.empty();

    private Optional<ListPaymentLinksRequestStatus> status = Optional.empty();

    private Optional<ListPaymentLinksRequestOrdering> ordering = Optional.empty();

    private Optional<String> search = Optional.empty();

    private Builder() {
    }

    public Builder from(ListPaymentLinksRequest other) {
      page(other.getPage());
      pageSize(other.getPageSize());
      createdAt(other.getCreatedAt());
      createdAtGt(other.getCreatedAtGt());
      createdAtGte(other.getCreatedAtGte());
      createdAtLt(other.getCreatedAtLt());
      createdAtLte(other.getCreatedAtLte());
      createdAtRange(other.getCreatedAtRange());
      status(other.getStatus());
      ordering(other.getOrdering());
      search(other.getSearch());
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
        value = "created_at",
        nulls = Nulls.SKIP
    )
    public Builder createdAt(Optional<String> createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    public Builder createdAt(String createdAt) {
      this.createdAt = Optional.of(createdAt);
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
        value = "status",
        nulls = Nulls.SKIP
    )
    public Builder status(Optional<ListPaymentLinksRequestStatus> status) {
      this.status = status;
      return this;
    }

    public Builder status(ListPaymentLinksRequestStatus status) {
      this.status = Optional.of(status);
      return this;
    }

    @JsonSetter(
        value = "ordering",
        nulls = Nulls.SKIP
    )
    public Builder ordering(Optional<ListPaymentLinksRequestOrdering> ordering) {
      this.ordering = ordering;
      return this;
    }

    public Builder ordering(ListPaymentLinksRequestOrdering ordering) {
      this.ordering = Optional.of(ordering);
      return this;
    }

    @JsonSetter(
        value = "search",
        nulls = Nulls.SKIP
    )
    public Builder search(Optional<String> search) {
      this.search = search;
      return this;
    }

    public Builder search(String search) {
      this.search = Optional.of(search);
      return this;
    }

    public ListPaymentLinksRequest build() {
      return new ListPaymentLinksRequest(page, pageSize, createdAt, createdAtGt, createdAtGte, createdAtLt, createdAtLte, createdAtRange, status, ordering, search);
    }
  }
}
