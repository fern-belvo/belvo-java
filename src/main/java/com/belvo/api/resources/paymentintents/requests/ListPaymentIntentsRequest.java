package com.belvo.api.resources.paymentintents.requests;

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
    builder = ListPaymentIntentsRequest.Builder.class
)
public final class ListPaymentIntentsRequest {
  private final Optional<Integer> page;

  private final Optional<String> idIn;

  private final Optional<String> createdAt;

  private final Optional<String> createdAtGt;

  private final Optional<String> createdAtGte;

  private final Optional<String> createdAtLt;

  private final Optional<String> createdAtLte;

  private final Optional<String> createdAtRange;

  private final Optional<String> provider;

  private final Optional<String> paymentMethodType;

  private final Optional<String> customer;

  private final Optional<String> customerIn;

  private final Optional<String> amount;

  private final Optional<String> amountGt;

  private final Optional<String> amountGte;

  private final Optional<String> amountLt;

  private final Optional<String> amountLte;

  private final Optional<String> status;

  private final Optional<String> statusIn;

  private int _cachedHashCode;

  ListPaymentIntentsRequest(Optional<Integer> page, Optional<String> idIn,
      Optional<String> createdAt, Optional<String> createdAtGt, Optional<String> createdAtGte,
      Optional<String> createdAtLt, Optional<String> createdAtLte, Optional<String> createdAtRange,
      Optional<String> provider, Optional<String> paymentMethodType, Optional<String> customer,
      Optional<String> customerIn, Optional<String> amount, Optional<String> amountGt,
      Optional<String> amountGte, Optional<String> amountLt, Optional<String> amountLte,
      Optional<String> status, Optional<String> statusIn) {
    this.page = page;
    this.idIn = idIn;
    this.createdAt = createdAt;
    this.createdAtGt = createdAtGt;
    this.createdAtGte = createdAtGte;
    this.createdAtLt = createdAtLt;
    this.createdAtLte = createdAtLte;
    this.createdAtRange = createdAtRange;
    this.provider = provider;
    this.paymentMethodType = paymentMethodType;
    this.customer = customer;
    this.customerIn = customerIn;
    this.amount = amount;
    this.amountGt = amountGt;
    this.amountGte = amountGte;
    this.amountLt = amountLt;
    this.amountLte = amountLte;
    this.status = status;
    this.statusIn = statusIn;
  }

  /**
   * @return A page number within the paginated result set.
   */
  @JsonProperty("page")
  public Optional<Integer> getPage() {
    return page;
  }

  /**
   * @return One or more <code>payment-intent.id</code>s (comma separated) that you want to get results for.
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
   * @return Return results only for this value.
   */
  @JsonProperty("provider")
  public Optional<String> getProvider() {
    return provider;
  }

  /**
   * @return Return results only for this value.
   */
  @JsonProperty("payment_method_type")
  public Optional<String> getPaymentMethodType() {
    return paymentMethodType;
  }

  /**
   * @return The <code>customer.id</code> you want to get results for.
   */
  @JsonProperty("customer")
  public Optional<String> getCustomer() {
    return customer;
  }

  /**
   * @return One or more <code>customer.id</code>s (comma separated) that you want to get results for.
   */
  @JsonProperty("customer__in")
  public Optional<String> getCustomerIn() {
    return customerIn;
  }

  /**
   * @return Return results only for this value.
   */
  @JsonProperty("amount")
  public Optional<String> getAmount() {
    return amount;
  }

  /**
   * @return Return results only for more than this amount.
   */
  @JsonProperty("amount__gt")
  public Optional<String> getAmountGt() {
    return amountGt;
  }

  /**
   * @return Return results only for and more than this amount.
   */
  @JsonProperty("amount__gte")
  public Optional<String> getAmountGte() {
    return amountGte;
  }

  /**
   * @return Return results only for less than this amount.
   */
  @JsonProperty("amount__lt")
  public Optional<String> getAmountLt() {
    return amountLt;
  }

  /**
   * @return Return results only for this amount or less.
   */
  @JsonProperty("amount__lte")
  public Optional<String> getAmountLte() {
    return amountLte;
  }

  /**
   * @return Return results only for this value.
   */
  @JsonProperty("status")
  public Optional<String> getStatus() {
    return status;
  }

  /**
   * @return Return results for listed status.
   */
  @JsonProperty("status__in")
  public Optional<String> getStatusIn() {
    return statusIn;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof ListPaymentIntentsRequest && equalTo((ListPaymentIntentsRequest) other);
  }

  private boolean equalTo(ListPaymentIntentsRequest other) {
    return page.equals(other.page) && idIn.equals(other.idIn) && createdAt.equals(other.createdAt) && createdAtGt.equals(other.createdAtGt) && createdAtGte.equals(other.createdAtGte) && createdAtLt.equals(other.createdAtLt) && createdAtLte.equals(other.createdAtLte) && createdAtRange.equals(other.createdAtRange) && provider.equals(other.provider) && paymentMethodType.equals(other.paymentMethodType) && customer.equals(other.customer) && customerIn.equals(other.customerIn) && amount.equals(other.amount) && amountGt.equals(other.amountGt) && amountGte.equals(other.amountGte) && amountLt.equals(other.amountLt) && amountLte.equals(other.amountLte) && status.equals(other.status) && statusIn.equals(other.statusIn);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.page, this.idIn, this.createdAt, this.createdAtGt, this.createdAtGte, this.createdAtLt, this.createdAtLte, this.createdAtRange, this.provider, this.paymentMethodType, this.customer, this.customerIn, this.amount, this.amountGt, this.amountGte, this.amountLt, this.amountLte, this.status, this.statusIn);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "ListPaymentIntentsRequest{" + "page: " + page + ", idIn: " + idIn + ", createdAt: " + createdAt + ", createdAtGt: " + createdAtGt + ", createdAtGte: " + createdAtGte + ", createdAtLt: " + createdAtLt + ", createdAtLte: " + createdAtLte + ", createdAtRange: " + createdAtRange + ", provider: " + provider + ", paymentMethodType: " + paymentMethodType + ", customer: " + customer + ", customerIn: " + customerIn + ", amount: " + amount + ", amountGt: " + amountGt + ", amountGte: " + amountGte + ", amountLt: " + amountLt + ", amountLte: " + amountLte + ", status: " + status + ", statusIn: " + statusIn + "}";
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

    private Optional<String> provider = Optional.empty();

    private Optional<String> paymentMethodType = Optional.empty();

    private Optional<String> customer = Optional.empty();

    private Optional<String> customerIn = Optional.empty();

    private Optional<String> amount = Optional.empty();

    private Optional<String> amountGt = Optional.empty();

    private Optional<String> amountGte = Optional.empty();

    private Optional<String> amountLt = Optional.empty();

    private Optional<String> amountLte = Optional.empty();

    private Optional<String> status = Optional.empty();

    private Optional<String> statusIn = Optional.empty();

    private Builder() {
    }

    public Builder from(ListPaymentIntentsRequest other) {
      page(other.getPage());
      idIn(other.getIdIn());
      createdAt(other.getCreatedAt());
      createdAtGt(other.getCreatedAtGt());
      createdAtGte(other.getCreatedAtGte());
      createdAtLt(other.getCreatedAtLt());
      createdAtLte(other.getCreatedAtLte());
      createdAtRange(other.getCreatedAtRange());
      provider(other.getProvider());
      paymentMethodType(other.getPaymentMethodType());
      customer(other.getCustomer());
      customerIn(other.getCustomerIn());
      amount(other.getAmount());
      amountGt(other.getAmountGt());
      amountGte(other.getAmountGte());
      amountLt(other.getAmountLt());
      amountLte(other.getAmountLte());
      status(other.getStatus());
      statusIn(other.getStatusIn());
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
        value = "provider",
        nulls = Nulls.SKIP
    )
    public Builder provider(Optional<String> provider) {
      this.provider = provider;
      return this;
    }

    public Builder provider(String provider) {
      this.provider = Optional.of(provider);
      return this;
    }

    @JsonSetter(
        value = "payment_method_type",
        nulls = Nulls.SKIP
    )
    public Builder paymentMethodType(Optional<String> paymentMethodType) {
      this.paymentMethodType = paymentMethodType;
      return this;
    }

    public Builder paymentMethodType(String paymentMethodType) {
      this.paymentMethodType = Optional.of(paymentMethodType);
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
        value = "customer__in",
        nulls = Nulls.SKIP
    )
    public Builder customerIn(Optional<String> customerIn) {
      this.customerIn = customerIn;
      return this;
    }

    public Builder customerIn(String customerIn) {
      this.customerIn = Optional.of(customerIn);
      return this;
    }

    @JsonSetter(
        value = "amount",
        nulls = Nulls.SKIP
    )
    public Builder amount(Optional<String> amount) {
      this.amount = amount;
      return this;
    }

    public Builder amount(String amount) {
      this.amount = Optional.of(amount);
      return this;
    }

    @JsonSetter(
        value = "amount__gt",
        nulls = Nulls.SKIP
    )
    public Builder amountGt(Optional<String> amountGt) {
      this.amountGt = amountGt;
      return this;
    }

    public Builder amountGt(String amountGt) {
      this.amountGt = Optional.of(amountGt);
      return this;
    }

    @JsonSetter(
        value = "amount__gte",
        nulls = Nulls.SKIP
    )
    public Builder amountGte(Optional<String> amountGte) {
      this.amountGte = amountGte;
      return this;
    }

    public Builder amountGte(String amountGte) {
      this.amountGte = Optional.of(amountGte);
      return this;
    }

    @JsonSetter(
        value = "amount__lt",
        nulls = Nulls.SKIP
    )
    public Builder amountLt(Optional<String> amountLt) {
      this.amountLt = amountLt;
      return this;
    }

    public Builder amountLt(String amountLt) {
      this.amountLt = Optional.of(amountLt);
      return this;
    }

    @JsonSetter(
        value = "amount__lte",
        nulls = Nulls.SKIP
    )
    public Builder amountLte(Optional<String> amountLte) {
      this.amountLte = amountLte;
      return this;
    }

    public Builder amountLte(String amountLte) {
      this.amountLte = Optional.of(amountLte);
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

    public ListPaymentIntentsRequest build() {
      return new ListPaymentIntentsRequest(page, idIn, createdAt, createdAtGt, createdAtGte, createdAtLt, createdAtLte, createdAtRange, provider, paymentMethodType, customer, customerIn, amount, amountGt, amountGte, amountLt, amountLte, status, statusIn);
    }
  }
}
