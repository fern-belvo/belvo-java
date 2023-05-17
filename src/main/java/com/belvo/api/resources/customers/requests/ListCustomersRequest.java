package com.belvo.api.resources.customers.requests;

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
    builder = ListCustomersRequest.Builder.class
)
public final class ListCustomersRequest {
  private final Optional<Integer> page;

  private final Optional<String> idIn;

  private final Optional<String> createdAt;

  private final Optional<String> createdAtGt;

  private final Optional<String> createdAtGte;

  private final Optional<String> createdAtLt;

  private final Optional<String> createdAtLte;

  private final Optional<String> createdAtRange;

  private final Optional<String> customerType;

  private final Optional<String> search;

  private int _cachedHashCode;

  ListCustomersRequest(Optional<Integer> page, Optional<String> idIn, Optional<String> createdAt,
      Optional<String> createdAtGt, Optional<String> createdAtGte, Optional<String> createdAtLt,
      Optional<String> createdAtLte, Optional<String> createdAtRange, Optional<String> customerType,
      Optional<String> search) {
    this.page = page;
    this.idIn = idIn;
    this.createdAt = createdAt;
    this.createdAtGt = createdAtGt;
    this.createdAtGte = createdAtGte;
    this.createdAtLt = createdAtLt;
    this.createdAtLte = createdAtLte;
    this.createdAtRange = createdAtRange;
    this.customerType = customerType;
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
   * @return One or more <code>customer.id</code>s (comma separated) that you want to get results for.
   */
  @JsonProperty("id__in")
  public Optional<String> getIdIn() {
    return idIn;
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
   * @return Return results only for this customer type (either <code>INDIVIDUAL</code> or <code>BUSINESS</code>).
   */
  @JsonProperty("customer__type")
  public Optional<String> getCustomerType() {
    return customerType;
  }

  /**
   * @return Return results for one or more customers that match either the name or email you searched for.
   * <p><strong>Note:</strong> This filter supports both full and partial search queries, with a minimum of three characters required. For example, searching for <code>car</code> may match the following values:</p>
   * <ul>
   * <li><code>Carlos Vives</code></li>
   * <li><code>Carmen Domínguez</code></li>
   * <li><code>carlos.vives@musicacolombia.co</code></li>
   * </ul>
   */
  @JsonProperty("search")
  public Optional<String> getSearch() {
    return search;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof ListCustomersRequest && equalTo((ListCustomersRequest) other);
  }

  private boolean equalTo(ListCustomersRequest other) {
    return page.equals(other.page) && idIn.equals(other.idIn) && createdAt.equals(other.createdAt) && createdAtGt.equals(other.createdAtGt) && createdAtGte.equals(other.createdAtGte) && createdAtLt.equals(other.createdAtLt) && createdAtLte.equals(other.createdAtLte) && createdAtRange.equals(other.createdAtRange) && customerType.equals(other.customerType) && search.equals(other.search);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.page, this.idIn, this.createdAt, this.createdAtGt, this.createdAtGte, this.createdAtLt, this.createdAtLte, this.createdAtRange, this.customerType, this.search);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "ListCustomersRequest{" + "page: " + page + ", idIn: " + idIn + ", createdAt: " + createdAt + ", createdAtGt: " + createdAtGt + ", createdAtGte: " + createdAtGte + ", createdAtLt: " + createdAtLt + ", createdAtLte: " + createdAtLte + ", createdAtRange: " + createdAtRange + ", customerType: " + customerType + ", search: " + search + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<Integer> page = Optional.empty();

    private Optional<String> idIn = Optional.empty();

    private Optional<String> createdAt = Optional.empty();

    private Optional<String> createdAtGt = Optional.empty();

    private Optional<String> createdAtGte = Optional.empty();

    private Optional<String> createdAtLt = Optional.empty();

    private Optional<String> createdAtLte = Optional.empty();

    private Optional<String> createdAtRange = Optional.empty();

    private Optional<String> customerType = Optional.empty();

    private Optional<String> search = Optional.empty();

    private Builder() {
    }

    public Builder from(ListCustomersRequest other) {
      page(other.getPage());
      idIn(other.getIdIn());
      createdAt(other.getCreatedAt());
      createdAtGt(other.getCreatedAtGt());
      createdAtGte(other.getCreatedAtGte());
      createdAtLt(other.getCreatedAtLt());
      createdAtLte(other.getCreatedAtLte());
      createdAtRange(other.getCreatedAtRange());
      customerType(other.getCustomerType());
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
        value = "customer__type",
        nulls = Nulls.SKIP
    )
    public Builder customerType(Optional<String> customerType) {
      this.customerType = customerType;
      return this;
    }

    public Builder customerType(String customerType) {
      this.customerType = Optional.of(customerType);
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

    public ListCustomersRequest build() {
      return new ListCustomersRequest(page, idIn, createdAt, createdAtGt, createdAtGte, createdAtLt, createdAtLte, createdAtRange, customerType, search);
    }
  }
}
