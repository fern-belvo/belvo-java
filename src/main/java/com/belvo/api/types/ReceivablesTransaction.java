package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = ReceivablesTransaction.Builder.class
)
public final class ReceivablesTransaction {
  private final String id;

  private final ReceivablesTransactionAccount account;

  private final String createdAt;

  private final String collectedAt;

  private final String valueHour;

  private final String valueDate;

  private final String institutionTransactionId;

  private final String currency;

  private final Optional<String> type;

  private final Optional<Double> grossAmount;

  private final Optional<Double> netAmount;

  private final List<RecevablesTransactionFees> fees;

  private final EnumReceivableTransactionStatus status;

  private final ReceivablesTransactionNumberOfInstallments numberOfInstallments;

  private int _cachedHashCode;

  ReceivablesTransaction(String id, ReceivablesTransactionAccount account, String createdAt,
      String collectedAt, String valueHour, String valueDate, String institutionTransactionId,
      String currency, Optional<String> type, Optional<Double> grossAmount,
      Optional<Double> netAmount, List<RecevablesTransactionFees> fees,
      EnumReceivableTransactionStatus status,
      ReceivablesTransactionNumberOfInstallments numberOfInstallments) {
    this.id = id;
    this.account = account;
    this.createdAt = createdAt;
    this.collectedAt = collectedAt;
    this.valueHour = valueHour;
    this.valueDate = valueDate;
    this.institutionTransactionId = institutionTransactionId;
    this.currency = currency;
    this.type = type;
    this.grossAmount = grossAmount;
    this.netAmount = netAmount;
    this.fees = fees;
    this.status = status;
    this.numberOfInstallments = numberOfInstallments;
  }

  /**
   * @return Belvo's unique ID for the current receivable transaction.
   */
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("account")
  public ReceivablesTransactionAccount getAccount() {
    return account;
  }

  /**
   * @return The ISO timestamp of when the data point was last updated in Belvo's database.
   */
  @JsonProperty("created_at")
  public String getCreatedAt() {
    return createdAt;
  }

  /**
   * @return The ISO timestamp when the data point was collected.
   */
  @JsonProperty("collected_at")
  public String getCollectedAt() {
    return collectedAt;
  }

  /**
   * @return The time that the transaction occurred, according to the institution, in <code>HH:MM</code> format.
   */
  @JsonProperty("value_hour")
  public String getValueHour() {
    return valueHour;
  }

  /**
   * @return The date that the transactions occurred, according to the institution, in <code>YYYY-MM-DD</code> format.
   */
  @JsonProperty("value_date")
  public String getValueDate() {
    return valueDate;
  }

  /**
   * @return Internal identification number that the acquirer uses to identify the transaction.
   * ℹ️ <strong>Note</strong>: For Brazil, this number is the NSU.
   */
  @JsonProperty("institution_transaction_id")
  public String getInstitutionTransactionId() {
    return institutionTransactionId;
  }

  /**
   * @return The currency of the transaction. For example:
   * <ul>
   * <li>🇧🇷 BRL (Brazilian Real)</li>
   * <li>🇨🇴 COP (Colombian Peso)</li>
   * <li>🇲🇽 MXN (Mexican Peso)</li>
   * </ul>
   * <p>Please note that currencies other than those listed above may be returned.</p>
   */
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }

  @JsonProperty("type")
  public Optional<String> getType() {
    return type;
  }

  /**
   * @return The total gross amount of the transaction.
   */
  @JsonProperty("gross_amount")
  public Optional<Double> getGrossAmount() {
    return grossAmount;
  }

  /**
   * @return The net amount of the transaction.
   */
  @JsonProperty("net_amount")
  public Optional<Double> getNetAmount() {
    return netAmount;
  }

  @JsonProperty("fees")
  public List<RecevablesTransactionFees> getFees() {
    return fees;
  }

  @JsonProperty("status")
  public EnumReceivableTransactionStatus getStatus() {
    return status;
  }

  @JsonProperty("number_of_installments")
  public ReceivablesTransactionNumberOfInstallments getNumberOfInstallments() {
    return numberOfInstallments;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof ReceivablesTransaction && equalTo((ReceivablesTransaction) other);
  }

  private boolean equalTo(ReceivablesTransaction other) {
    return id.equals(other.id) && account.equals(other.account) && createdAt.equals(other.createdAt) && collectedAt.equals(other.collectedAt) && valueHour.equals(other.valueHour) && valueDate.equals(other.valueDate) && institutionTransactionId.equals(other.institutionTransactionId) && currency.equals(other.currency) && type.equals(other.type) && grossAmount.equals(other.grossAmount) && netAmount.equals(other.netAmount) && fees.equals(other.fees) && status.equals(other.status) && numberOfInstallments.equals(other.numberOfInstallments);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.id, this.account, this.createdAt, this.collectedAt, this.valueHour, this.valueDate, this.institutionTransactionId, this.currency, this.type, this.grossAmount, this.netAmount, this.fees, this.status, this.numberOfInstallments);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "ReceivablesTransaction{" + "id: " + id + ", account: " + account + ", createdAt: " + createdAt + ", collectedAt: " + collectedAt + ", valueHour: " + valueHour + ", valueDate: " + valueDate + ", institutionTransactionId: " + institutionTransactionId + ", currency: " + currency + ", type: " + type + ", grossAmount: " + grossAmount + ", netAmount: " + netAmount + ", fees: " + fees + ", status: " + status + ", numberOfInstallments: " + numberOfInstallments + "}";
  }

  public static IdStage builder() {
    return new Builder();
  }

  public interface IdStage {
    AccountStage id(String id);

    Builder from(ReceivablesTransaction other);
  }

  public interface AccountStage {
    CreatedAtStage account(ReceivablesTransactionAccount account);
  }

  public interface CreatedAtStage {
    CollectedAtStage createdAt(String createdAt);
  }

  public interface CollectedAtStage {
    ValueHourStage collectedAt(String collectedAt);
  }

  public interface ValueHourStage {
    ValueDateStage valueHour(String valueHour);
  }

  public interface ValueDateStage {
    InstitutionTransactionIdStage valueDate(String valueDate);
  }

  public interface InstitutionTransactionIdStage {
    CurrencyStage institutionTransactionId(String institutionTransactionId);
  }

  public interface CurrencyStage {
    StatusStage currency(String currency);
  }

  public interface StatusStage {
    NumberOfInstallmentsStage status(EnumReceivableTransactionStatus status);
  }

  public interface NumberOfInstallmentsStage {
    _FinalStage numberOfInstallments(
        ReceivablesTransactionNumberOfInstallments numberOfInstallments);
  }

  public interface _FinalStage {
    ReceivablesTransaction build();

    _FinalStage type(Optional<String> type);

    _FinalStage type(String type);

    _FinalStage grossAmount(Optional<Double> grossAmount);

    _FinalStage grossAmount(Double grossAmount);

    _FinalStage netAmount(Optional<Double> netAmount);

    _FinalStage netAmount(Double netAmount);

    _FinalStage fees(List<RecevablesTransactionFees> fees);

    _FinalStage addFees(RecevablesTransactionFees fees);

    _FinalStage addAllFees(List<RecevablesTransactionFees> fees);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements IdStage, AccountStage, CreatedAtStage, CollectedAtStage, ValueHourStage, ValueDateStage, InstitutionTransactionIdStage, CurrencyStage, StatusStage, NumberOfInstallmentsStage, _FinalStage {
    private String id;

    private ReceivablesTransactionAccount account;

    private String createdAt;

    private String collectedAt;

    private String valueHour;

    private String valueDate;

    private String institutionTransactionId;

    private String currency;

    private EnumReceivableTransactionStatus status;

    private ReceivablesTransactionNumberOfInstallments numberOfInstallments;

    private List<RecevablesTransactionFees> fees = new ArrayList<>();

    private Optional<Double> netAmount = Optional.empty();

    private Optional<Double> grossAmount = Optional.empty();

    private Optional<String> type = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(ReceivablesTransaction other) {
      id(other.getId());
      account(other.getAccount());
      createdAt(other.getCreatedAt());
      collectedAt(other.getCollectedAt());
      valueHour(other.getValueHour());
      valueDate(other.getValueDate());
      institutionTransactionId(other.getInstitutionTransactionId());
      currency(other.getCurrency());
      type(other.getType());
      grossAmount(other.getGrossAmount());
      netAmount(other.getNetAmount());
      fees(other.getFees());
      status(other.getStatus());
      numberOfInstallments(other.getNumberOfInstallments());
      return this;
    }

    /**
     * <p>Belvo's unique ID for the current receivable transaction.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("id")
    public AccountStage id(String id) {
      this.id = id;
      return this;
    }

    @Override
    @JsonSetter("account")
    public CreatedAtStage account(ReceivablesTransactionAccount account) {
      this.account = account;
      return this;
    }

    /**
     * <p>The ISO timestamp of when the data point was last updated in Belvo's database.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("created_at")
    public CollectedAtStage createdAt(String createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * <p>The ISO timestamp when the data point was collected.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("collected_at")
    public ValueHourStage collectedAt(String collectedAt) {
      this.collectedAt = collectedAt;
      return this;
    }

    /**
     * <p>The time that the transaction occurred, according to the institution, in <code>HH:MM</code> format.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("value_hour")
    public ValueDateStage valueHour(String valueHour) {
      this.valueHour = valueHour;
      return this;
    }

    /**
     * <p>The date that the transactions occurred, according to the institution, in <code>YYYY-MM-DD</code> format.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("value_date")
    public InstitutionTransactionIdStage valueDate(String valueDate) {
      this.valueDate = valueDate;
      return this;
    }

    /**
     * <p>Internal identification number that the acquirer uses to identify the transaction.
     * ℹ️ <strong>Note</strong>: For Brazil, this number is the NSU.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("institution_transaction_id")
    public CurrencyStage institutionTransactionId(String institutionTransactionId) {
      this.institutionTransactionId = institutionTransactionId;
      return this;
    }

    /**
     * <p>The currency of the transaction. For example:</p>
     * <ul>
     * <li>🇧🇷 BRL (Brazilian Real)</li>
     * <li>🇨🇴 COP (Colombian Peso)</li>
     * <li>🇲🇽 MXN (Mexican Peso)</li>
     * </ul>
     * <p>Please note that currencies other than those listed above may be returned.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("currency")
    public StatusStage currency(String currency) {
      this.currency = currency;
      return this;
    }

    @Override
    @JsonSetter("status")
    public NumberOfInstallmentsStage status(EnumReceivableTransactionStatus status) {
      this.status = status;
      return this;
    }

    @Override
    @JsonSetter("number_of_installments")
    public _FinalStage numberOfInstallments(
        ReceivablesTransactionNumberOfInstallments numberOfInstallments) {
      this.numberOfInstallments = numberOfInstallments;
      return this;
    }

    @Override
    public _FinalStage addAllFees(List<RecevablesTransactionFees> fees) {
      this.fees.addAll(fees);
      return this;
    }

    @Override
    public _FinalStage addFees(RecevablesTransactionFees fees) {
      this.fees.add(fees);
      return this;
    }

    @Override
    @JsonSetter(
        value = "fees",
        nulls = Nulls.SKIP
    )
    public _FinalStage fees(List<RecevablesTransactionFees> fees) {
      this.fees.clear();
      this.fees.addAll(fees);
      return this;
    }

    /**
     * <p>The net amount of the transaction.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage netAmount(Double netAmount) {
      this.netAmount = Optional.of(netAmount);
      return this;
    }

    @Override
    @JsonSetter(
        value = "net_amount",
        nulls = Nulls.SKIP
    )
    public _FinalStage netAmount(Optional<Double> netAmount) {
      this.netAmount = netAmount;
      return this;
    }

    /**
     * <p>The total gross amount of the transaction.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage grossAmount(Double grossAmount) {
      this.grossAmount = Optional.of(grossAmount);
      return this;
    }

    @Override
    @JsonSetter(
        value = "gross_amount",
        nulls = Nulls.SKIP
    )
    public _FinalStage grossAmount(Optional<Double> grossAmount) {
      this.grossAmount = grossAmount;
      return this;
    }

    @Override
    public _FinalStage type(String type) {
      this.type = Optional.of(type);
      return this;
    }

    @Override
    @JsonSetter(
        value = "type",
        nulls = Nulls.SKIP
    )
    public _FinalStage type(Optional<String> type) {
      this.type = type;
      return this;
    }

    @Override
    public ReceivablesTransaction build() {
      return new ReceivablesTransaction(id, account, createdAt, collectedAt, valueHour, valueDate, institutionTransactionId, currency, type, grossAmount, netAmount, fees, status, numberOfInstallments);
    }
  }
}
