package com.belvo.api.resources.paymenttransactions.requests;

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
    builder = ListPaymentTransactionsRequest.Builder.class
)
public final class ListPaymentTransactionsRequest {
  private final Optional<Integer> page;

  private final Optional<String> idIn;

  private final Optional<String> createdAt;

  private final Optional<String> createdAtGt;

  private final Optional<String> createdAtGte;

  private final Optional<String> createdAtLt;

  private final Optional<String> createdAtLte;

  private final Optional<String> createdAtRange;

  private final Optional<String> charge;

  private final Optional<String> chargeIn;

  private final Optional<String> beneficiary;

  private final Optional<String> beneficiaryIn;

  private final Optional<String> payer;

  private final Optional<String> payerIn;

  private final Optional<String> transactionType;

  private final Optional<String> currency;

  private final Optional<String> description;

  private final Optional<String> amount;

  private final Optional<String> amountGt;

  private final Optional<String> amountGte;

  private final Optional<String> amountLt;

  private final Optional<String> amountLte;

  private final Optional<String> amountRange;

  private int _cachedHashCode;

  ListPaymentTransactionsRequest(Optional<Integer> page, Optional<String> idIn,
      Optional<String> createdAt, Optional<String> createdAtGt, Optional<String> createdAtGte,
      Optional<String> createdAtLt, Optional<String> createdAtLte, Optional<String> createdAtRange,
      Optional<String> charge, Optional<String> chargeIn, Optional<String> beneficiary,
      Optional<String> beneficiaryIn, Optional<String> payer, Optional<String> payerIn,
      Optional<String> transactionType, Optional<String> currency, Optional<String> description,
      Optional<String> amount, Optional<String> amountGt, Optional<String> amountGte,
      Optional<String> amountLt, Optional<String> amountLte, Optional<String> amountRange) {
    this.page = page;
    this.idIn = idIn;
    this.createdAt = createdAt;
    this.createdAtGt = createdAtGt;
    this.createdAtGte = createdAtGte;
    this.createdAtLt = createdAtLt;
    this.createdAtLte = createdAtLte;
    this.createdAtRange = createdAtRange;
    this.charge = charge;
    this.chargeIn = chargeIn;
    this.beneficiary = beneficiary;
    this.beneficiaryIn = beneficiaryIn;
    this.payer = payer;
    this.payerIn = payerIn;
    this.transactionType = transactionType;
    this.currency = currency;
    this.description = description;
    this.amount = amount;
    this.amountGt = amountGt;
    this.amountGte = amountGte;
    this.amountLt = amountLt;
    this.amountLte = amountLte;
    this.amountRange = amountRange;
  }

  /**
   * @return A page number within the paginated result set.
   */
  @JsonProperty("page")
  public Optional<Integer> getPage() {
    return page;
  }

  /**
   * @return One or more payment <code>transaction.id</code>s (comma separated) that you want to get results for.
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
   * @return The <code>charge.id</code> you want to get results for.
   */
  @JsonProperty("charge")
  public Optional<String> getCharge() {
    return charge;
  }

  /**
   * @return One or more <code>charge.id</code>s (comma separated) that you want to get results for.
   */
  @JsonProperty("charge__in")
  public Optional<String> getChargeIn() {
    return chargeIn;
  }

  /**
   * @return The <code>beneficiary.id</code> you want to get results for.
   */
  @JsonProperty("beneficiary")
  public Optional<String> getBeneficiary() {
    return beneficiary;
  }

  /**
   * @return One or more <code>beneficiary.id</code>s (comma separated) that you want to get results for.
   */
  @JsonProperty("beneficiary__in")
  public Optional<String> getBeneficiaryIn() {
    return beneficiaryIn;
  }

  /**
   * @return The payer's <code>bank-account.id</code> you want to get results for.
   */
  @JsonProperty("payer")
  public Optional<String> getPayer() {
    return payer;
  }

  /**
   * @return One or more payer <code>bank-account.id</code>s (comma separated) that you want to get results for.
   */
  @JsonProperty("payer__in")
  public Optional<String> getPayerIn() {
    return payerIn;
  }

  /**
   * @return Return results for a matched value type.
   */
  @JsonProperty("transaction__type")
  public Optional<String> getTransactionType() {
    return transactionType;
  }

  /**
   * @return Return results for a matched value type.
   */
  @JsonProperty("currency")
  public Optional<String> getCurrency() {
    return currency;
  }

  /**
   * @return Return results for a matched value type.
   */
  @JsonProperty("description")
  public Optional<String> getDescription() {
    return description;
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
   * @return Return results between this amount range
   */
  @JsonProperty("amount__range")
  public Optional<String> getAmountRange() {
    return amountRange;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof ListPaymentTransactionsRequest && equalTo((ListPaymentTransactionsRequest) other);
  }

  private boolean equalTo(ListPaymentTransactionsRequest other) {
    return page.equals(other.page) && idIn.equals(other.idIn) && createdAt.equals(other.createdAt) && createdAtGt.equals(other.createdAtGt) && createdAtGte.equals(other.createdAtGte) && createdAtLt.equals(other.createdAtLt) && createdAtLte.equals(other.createdAtLte) && createdAtRange.equals(other.createdAtRange) && charge.equals(other.charge) && chargeIn.equals(other.chargeIn) && beneficiary.equals(other.beneficiary) && beneficiaryIn.equals(other.beneficiaryIn) && payer.equals(other.payer) && payerIn.equals(other.payerIn) && transactionType.equals(other.transactionType) && currency.equals(other.currency) && description.equals(other.description) && amount.equals(other.amount) && amountGt.equals(other.amountGt) && amountGte.equals(other.amountGte) && amountLt.equals(other.amountLt) && amountLte.equals(other.amountLte) && amountRange.equals(other.amountRange);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.page, this.idIn, this.createdAt, this.createdAtGt, this.createdAtGte, this.createdAtLt, this.createdAtLte, this.createdAtRange, this.charge, this.chargeIn, this.beneficiary, this.beneficiaryIn, this.payer, this.payerIn, this.transactionType, this.currency, this.description, this.amount, this.amountGt, this.amountGte, this.amountLt, this.amountLte, this.amountRange);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "ListPaymentTransactionsRequest{" + "page: " + page + ", idIn: " + idIn + ", createdAt: " + createdAt + ", createdAtGt: " + createdAtGt + ", createdAtGte: " + createdAtGte + ", createdAtLt: " + createdAtLt + ", createdAtLte: " + createdAtLte + ", createdAtRange: " + createdAtRange + ", charge: " + charge + ", chargeIn: " + chargeIn + ", beneficiary: " + beneficiary + ", beneficiaryIn: " + beneficiaryIn + ", payer: " + payer + ", payerIn: " + payerIn + ", transactionType: " + transactionType + ", currency: " + currency + ", description: " + description + ", amount: " + amount + ", amountGt: " + amountGt + ", amountGte: " + amountGte + ", amountLt: " + amountLt + ", amountLte: " + amountLte + ", amountRange: " + amountRange + "}";
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

    private Optional<String> charge = Optional.empty();

    private Optional<String> chargeIn = Optional.empty();

    private Optional<String> beneficiary = Optional.empty();

    private Optional<String> beneficiaryIn = Optional.empty();

    private Optional<String> payer = Optional.empty();

    private Optional<String> payerIn = Optional.empty();

    private Optional<String> transactionType = Optional.empty();

    private Optional<String> currency = Optional.empty();

    private Optional<String> description = Optional.empty();

    private Optional<String> amount = Optional.empty();

    private Optional<String> amountGt = Optional.empty();

    private Optional<String> amountGte = Optional.empty();

    private Optional<String> amountLt = Optional.empty();

    private Optional<String> amountLte = Optional.empty();

    private Optional<String> amountRange = Optional.empty();

    private Builder() {
    }

    public Builder from(ListPaymentTransactionsRequest other) {
      page(other.getPage());
      idIn(other.getIdIn());
      createdAt(other.getCreatedAt());
      createdAtGt(other.getCreatedAtGt());
      createdAtGte(other.getCreatedAtGte());
      createdAtLt(other.getCreatedAtLt());
      createdAtLte(other.getCreatedAtLte());
      createdAtRange(other.getCreatedAtRange());
      charge(other.getCharge());
      chargeIn(other.getChargeIn());
      beneficiary(other.getBeneficiary());
      beneficiaryIn(other.getBeneficiaryIn());
      payer(other.getPayer());
      payerIn(other.getPayerIn());
      transactionType(other.getTransactionType());
      currency(other.getCurrency());
      description(other.getDescription());
      amount(other.getAmount());
      amountGt(other.getAmountGt());
      amountGte(other.getAmountGte());
      amountLt(other.getAmountLt());
      amountLte(other.getAmountLte());
      amountRange(other.getAmountRange());
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
        value = "charge",
        nulls = Nulls.SKIP
    )
    public Builder charge(Optional<String> charge) {
      this.charge = charge;
      return this;
    }

    public Builder charge(String charge) {
      this.charge = Optional.of(charge);
      return this;
    }

    @JsonSetter(
        value = "charge__in",
        nulls = Nulls.SKIP
    )
    public Builder chargeIn(Optional<String> chargeIn) {
      this.chargeIn = chargeIn;
      return this;
    }

    public Builder chargeIn(String chargeIn) {
      this.chargeIn = Optional.of(chargeIn);
      return this;
    }

    @JsonSetter(
        value = "beneficiary",
        nulls = Nulls.SKIP
    )
    public Builder beneficiary(Optional<String> beneficiary) {
      this.beneficiary = beneficiary;
      return this;
    }

    public Builder beneficiary(String beneficiary) {
      this.beneficiary = Optional.of(beneficiary);
      return this;
    }

    @JsonSetter(
        value = "beneficiary__in",
        nulls = Nulls.SKIP
    )
    public Builder beneficiaryIn(Optional<String> beneficiaryIn) {
      this.beneficiaryIn = beneficiaryIn;
      return this;
    }

    public Builder beneficiaryIn(String beneficiaryIn) {
      this.beneficiaryIn = Optional.of(beneficiaryIn);
      return this;
    }

    @JsonSetter(
        value = "payer",
        nulls = Nulls.SKIP
    )
    public Builder payer(Optional<String> payer) {
      this.payer = payer;
      return this;
    }

    public Builder payer(String payer) {
      this.payer = Optional.of(payer);
      return this;
    }

    @JsonSetter(
        value = "payer__in",
        nulls = Nulls.SKIP
    )
    public Builder payerIn(Optional<String> payerIn) {
      this.payerIn = payerIn;
      return this;
    }

    public Builder payerIn(String payerIn) {
      this.payerIn = Optional.of(payerIn);
      return this;
    }

    @JsonSetter(
        value = "transaction__type",
        nulls = Nulls.SKIP
    )
    public Builder transactionType(Optional<String> transactionType) {
      this.transactionType = transactionType;
      return this;
    }

    public Builder transactionType(String transactionType) {
      this.transactionType = Optional.of(transactionType);
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
        value = "description",
        nulls = Nulls.SKIP
    )
    public Builder description(Optional<String> description) {
      this.description = description;
      return this;
    }

    public Builder description(String description) {
      this.description = Optional.of(description);
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
        value = "amount__range",
        nulls = Nulls.SKIP
    )
    public Builder amountRange(Optional<String> amountRange) {
      this.amountRange = amountRange;
      return this;
    }

    public Builder amountRange(String amountRange) {
      this.amountRange = Optional.of(amountRange);
      return this;
    }

    public ListPaymentTransactionsRequest build() {
      return new ListPaymentTransactionsRequest(page, idIn, createdAt, createdAtGt, createdAtGte, createdAtLt, createdAtLte, createdAtRange, charge, chargeIn, beneficiary, beneficiaryIn, payer, payerIn, transactionType, currency, description, amount, amountGt, amountGte, amountLt, amountLte, amountRange);
    }
  }
}
