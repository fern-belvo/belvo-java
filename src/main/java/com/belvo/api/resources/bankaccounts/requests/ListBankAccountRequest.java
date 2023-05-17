package com.belvo.api.resources.bankaccounts.requests;

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
    builder = ListBankAccountRequest.Builder.class
)
public final class ListBankAccountRequest {
  private final Optional<Integer> page;

  private final Optional<String> idIn;

  private final Optional<String> createdAt;

  private final Optional<String> createdAtGt;

  private final Optional<String> createdAtGte;

  private final Optional<String> createdAtLt;

  private final Optional<String> createdAtLte;

  private final Optional<String> createdAtRange;

  private final Optional<String> number;

  private final Optional<String> numberIn;

  private final Optional<String> customer;

  private final Optional<String> institution;

  private final Optional<String> holderType;

  private final Optional<String> holderTypeIn;

  private final Optional<String> providers;

  private int _cachedHashCode;

  ListBankAccountRequest(Optional<Integer> page, Optional<String> idIn, Optional<String> createdAt,
      Optional<String> createdAtGt, Optional<String> createdAtGte, Optional<String> createdAtLt,
      Optional<String> createdAtLte, Optional<String> createdAtRange, Optional<String> number,
      Optional<String> numberIn, Optional<String> customer, Optional<String> institution,
      Optional<String> holderType, Optional<String> holderTypeIn, Optional<String> providers) {
    this.page = page;
    this.idIn = idIn;
    this.createdAt = createdAt;
    this.createdAtGt = createdAtGt;
    this.createdAtGte = createdAtGte;
    this.createdAtLt = createdAtLt;
    this.createdAtLte = createdAtLte;
    this.createdAtRange = createdAtRange;
    this.number = number;
    this.numberIn = numberIn;
    this.customer = customer;
    this.institution = institution;
    this.holderType = holderType;
    this.holderTypeIn = holderTypeIn;
    this.providers = providers;
  }

  /**
   * @return A page number within the paginated result set.
   */
  @JsonProperty("page")
  public Optional<Integer> getPage() {
    return page;
  }

  /**
   * @return One or more <code>bank-account.id</code>s (comma separated) that you want to get results for.
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
   * @return Return results that exactly match a value.
   */
  @JsonProperty("number")
  public Optional<String> getNumber() {
    return number;
  }

  /**
   * @return Return results for listed numbers.
   */
  @JsonProperty("number__in")
  public Optional<String> getNumberIn() {
    return numberIn;
  }

  /**
   * @return The <code>customer.id</code> you want to get results for.
   */
  @JsonProperty("customer")
  public Optional<String> getCustomer() {
    return customer;
  }

  /**
   * @return The <code>institution.id</code> you want to get results for.
   */
  @JsonProperty("institution")
  public Optional<String> getInstitution() {
    return institution;
  }

  /**
   * @return Return results for a matched value type.
   */
  @JsonProperty("holder__type")
  public Optional<String> getHolderType() {
    return holderType;
  }

  /**
   * @return Return results for listed holder types.
   */
  @JsonProperty("holder__type__in")
  public Optional<String> getHolderTypeIn() {
    return holderTypeIn;
  }

  /**
   * @return Return results only for this value.
   */
  @JsonProperty("providers")
  public Optional<String> getProviders() {
    return providers;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof ListBankAccountRequest && equalTo((ListBankAccountRequest) other);
  }

  private boolean equalTo(ListBankAccountRequest other) {
    return page.equals(other.page) && idIn.equals(other.idIn) && createdAt.equals(other.createdAt) && createdAtGt.equals(other.createdAtGt) && createdAtGte.equals(other.createdAtGte) && createdAtLt.equals(other.createdAtLt) && createdAtLte.equals(other.createdAtLte) && createdAtRange.equals(other.createdAtRange) && number.equals(other.number) && numberIn.equals(other.numberIn) && customer.equals(other.customer) && institution.equals(other.institution) && holderType.equals(other.holderType) && holderTypeIn.equals(other.holderTypeIn) && providers.equals(other.providers);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.page, this.idIn, this.createdAt, this.createdAtGt, this.createdAtGte, this.createdAtLt, this.createdAtLte, this.createdAtRange, this.number, this.numberIn, this.customer, this.institution, this.holderType, this.holderTypeIn, this.providers);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "ListBankAccountRequest{" + "page: " + page + ", idIn: " + idIn + ", createdAt: " + createdAt + ", createdAtGt: " + createdAtGt + ", createdAtGte: " + createdAtGte + ", createdAtLt: " + createdAtLt + ", createdAtLte: " + createdAtLte + ", createdAtRange: " + createdAtRange + ", number: " + number + ", numberIn: " + numberIn + ", customer: " + customer + ", institution: " + institution + ", holderType: " + holderType + ", holderTypeIn: " + holderTypeIn + ", providers: " + providers + "}";
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

    private Optional<String> number = Optional.empty();

    private Optional<String> numberIn = Optional.empty();

    private Optional<String> customer = Optional.empty();

    private Optional<String> institution = Optional.empty();

    private Optional<String> holderType = Optional.empty();

    private Optional<String> holderTypeIn = Optional.empty();

    private Optional<String> providers = Optional.empty();

    private Builder() {
    }

    public Builder from(ListBankAccountRequest other) {
      page(other.getPage());
      idIn(other.getIdIn());
      createdAt(other.getCreatedAt());
      createdAtGt(other.getCreatedAtGt());
      createdAtGte(other.getCreatedAtGte());
      createdAtLt(other.getCreatedAtLt());
      createdAtLte(other.getCreatedAtLte());
      createdAtRange(other.getCreatedAtRange());
      number(other.getNumber());
      numberIn(other.getNumberIn());
      customer(other.getCustomer());
      institution(other.getInstitution());
      holderType(other.getHolderType());
      holderTypeIn(other.getHolderTypeIn());
      providers(other.getProviders());
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
        value = "customer",
        nulls = Nulls.SKIP
    )
    public Builder customer(Optional<String> customer) {
      this.customer = customer;
      return this;
    }

    public Builder customer(String customer) {
      this.customer = Optional.of(customer);
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
        value = "holder__type",
        nulls = Nulls.SKIP
    )
    public Builder holderType(Optional<String> holderType) {
      this.holderType = holderType;
      return this;
    }

    public Builder holderType(String holderType) {
      this.holderType = Optional.of(holderType);
      return this;
    }

    @JsonSetter(
        value = "holder__type__in",
        nulls = Nulls.SKIP
    )
    public Builder holderTypeIn(Optional<String> holderTypeIn) {
      this.holderTypeIn = holderTypeIn;
      return this;
    }

    public Builder holderTypeIn(String holderTypeIn) {
      this.holderTypeIn = Optional.of(holderTypeIn);
      return this;
    }

    @JsonSetter(
        value = "providers",
        nulls = Nulls.SKIP
    )
    public Builder providers(Optional<String> providers) {
      this.providers = providers;
      return this;
    }

    public Builder providers(String providers) {
      this.providers = Optional.of(providers);
      return this;
    }

    public ListBankAccountRequest build() {
      return new ListBankAccountRequest(page, idIn, createdAt, createdAtGt, createdAtGte, createdAtLt, createdAtLte, createdAtRange, number, numberIn, customer, institution, holderType, holderTypeIn, providers);
    }
  }
}
