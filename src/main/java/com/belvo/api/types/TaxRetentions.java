package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = TaxRetentions.Builder.class
)
public final class TaxRetentions {
  private final Optional<String> id;

  private final Optional<String> link;

  private final Optional<String> collectedAt;

  private final Optional<String> createdAt;

  private final Optional<String> invoiceIdentification;

  private final Optional<String> version;

  private final Optional<Integer> code;

  private final Optional<String> issuedAt;

  private final Optional<String> certifiedAt;

  private final Optional<String> cancelledAt;

  private final Optional<String> senderId;

  private final Optional<String> senderName;

  private final EnumTaxRetentionReceiverNationality receiverNationality;

  private final Optional<String> receiverId;

  private final Optional<String> receiverName;

  private final Optional<Double> totalInvoiceAmount;

  private final Optional<Double> totalExemptAmount;

  private final Optional<Double> totalRetainedAmount;

  private final Optional<Double> totalTaxableAmount;

  private final Optional<List<RetentionBreakdown>> retentionBreakdown;

  private final Optional<String> xml;

  private int _cachedHashCode;

  TaxRetentions(Optional<String> id, Optional<String> link, Optional<String> collectedAt,
      Optional<String> createdAt, Optional<String> invoiceIdentification, Optional<String> version,
      Optional<Integer> code, Optional<String> issuedAt, Optional<String> certifiedAt,
      Optional<String> cancelledAt, Optional<String> senderId, Optional<String> senderName,
      EnumTaxRetentionReceiverNationality receiverNationality, Optional<String> receiverId,
      Optional<String> receiverName, Optional<Double> totalInvoiceAmount,
      Optional<Double> totalExemptAmount, Optional<Double> totalRetainedAmount,
      Optional<Double> totalTaxableAmount, Optional<List<RetentionBreakdown>> retentionBreakdown,
      Optional<String> xml) {
    this.id = id;
    this.link = link;
    this.collectedAt = collectedAt;
    this.createdAt = createdAt;
    this.invoiceIdentification = invoiceIdentification;
    this.version = version;
    this.code = code;
    this.issuedAt = issuedAt;
    this.certifiedAt = certifiedAt;
    this.cancelledAt = cancelledAt;
    this.senderId = senderId;
    this.senderName = senderName;
    this.receiverNationality = receiverNationality;
    this.receiverId = receiverId;
    this.receiverName = receiverName;
    this.totalInvoiceAmount = totalInvoiceAmount;
    this.totalExemptAmount = totalExemptAmount;
    this.totalRetainedAmount = totalRetainedAmount;
    this.totalTaxableAmount = totalTaxableAmount;
    this.retentionBreakdown = retentionBreakdown;
    this.xml = xml;
  }

  /**
   * @return Belvo's unique identifier used to reference the current tax retention statement.
   */
  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
  }

  /**
   * @return The <code>link.id</code> the tax retention belongs to.
   */
  @JsonProperty("link")
  public Optional<String> getLink() {
    return link;
  }

  /**
   * @return The ISO-8601 timestamp of when the data point was collected.
   */
  @JsonProperty("collected_at")
  public Optional<String> getCollectedAt() {
    return collectedAt;
  }

  /**
   * @return The ISO-8601 timestamp of when the data point was last updated in Belvo's database.
   */
  @JsonProperty("created_at")
  public Optional<String> getCreatedAt() {
    return createdAt;
  }

  /**
   * @return The fiscal institution's unique ID for the invoice that the tax retention relates to.
   */
  @JsonProperty("invoice_identification")
  public Optional<String> getInvoiceIdentification() {
    return invoiceIdentification;
  }

  /**
   * @return The CFDI version of the tax retentions.
   */
  @JsonProperty("version")
  public Optional<String> getVersion() {
    return version;
  }

  /**
   * @return The tax retention code. For more information, see our <a href="https://developers.belvo.com/docs/sat-catalogs#retention-code">SAT Catalogs DevPortal article</a>.
   */
  @JsonProperty("code")
  public Optional<Integer> getCode() {
    return code;
  }

  /**
   * @return The ISO-8601 timestamp of when the tax retention was issued.
   */
  @JsonProperty("issued_at")
  public Optional<String> getIssuedAt() {
    return issuedAt;
  }

  /**
   * @return The ISO-8601 timestamp of when the tax retention was certified.
   */
  @JsonProperty("certified_at")
  public Optional<String> getCertifiedAt() {
    return certifiedAt;
  }

  /**
   * @return The ISO-8601 timestamp of when the tax retention was canceled (if applicable).
   */
  @JsonProperty("cancelled_at")
  public Optional<String> getCancelledAt() {
    return cancelledAt;
  }

  /**
   * @return The fiscal ID of the invoice sender.
   */
  @JsonProperty("sender_id")
  public Optional<String> getSenderId() {
    return senderId;
  }

  /**
   * @return The name of the invoice sender.
   */
  @JsonProperty("sender_name")
  public Optional<String> getSenderName() {
    return senderName;
  }

  @JsonProperty("receiver_nationality")
  public EnumTaxRetentionReceiverNationality getReceiverNationality() {
    return receiverNationality;
  }

  /**
   * @return The fiscal ID of the invoice receiver.
   */
  @JsonProperty("receiver_id")
  public Optional<String> getReceiverId() {
    return receiverId;
  }

  /**
   * @return The name of the invoice receiver.
   */
  @JsonProperty("receiver_name")
  public Optional<String> getReceiverName() {
    return receiverName;
  }

  /**
   * @return The total amount of the invoice that the tax retention relates to.
   */
  @JsonProperty("total_invoice_amount")
  public Optional<Double> getTotalInvoiceAmount() {
    return totalInvoiceAmount;
  }

  /**
   * @return Total amount that is exempt from taxation.
   */
  @JsonProperty("total_exempt_amount")
  public Optional<Double> getTotalExemptAmount() {
    return totalExemptAmount;
  }

  /**
   * @return Total tax retained.
   */
  @JsonProperty("total_retained_amount")
  public Optional<Double> getTotalRetainedAmount() {
    return totalRetainedAmount;
  }

  /**
   * @return The total amount that can be taxed. Calculated as <code>total_invoice_amount</code> - <code>total_exempt_amount</code>.
   */
  @JsonProperty("total_taxable_amount")
  public Optional<Double> getTotalTaxableAmount() {
    return totalTaxableAmount;
  }

  /**
   * @return A breakdown of the retained taxes.
   */
  @JsonProperty("retention_breakdown")
  public Optional<List<RetentionBreakdown>> getRetentionBreakdown() {
    return retentionBreakdown;
  }

  /**
   * @return The tax retention document in XML form.
   */
  @JsonProperty("xml")
  public Optional<String> getXml() {
    return xml;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof TaxRetentions && equalTo((TaxRetentions) other);
  }

  private boolean equalTo(TaxRetentions other) {
    return id.equals(other.id) && link.equals(other.link) && collectedAt.equals(other.collectedAt) && createdAt.equals(other.createdAt) && invoiceIdentification.equals(other.invoiceIdentification) && version.equals(other.version) && code.equals(other.code) && issuedAt.equals(other.issuedAt) && certifiedAt.equals(other.certifiedAt) && cancelledAt.equals(other.cancelledAt) && senderId.equals(other.senderId) && senderName.equals(other.senderName) && receiverNationality.equals(other.receiverNationality) && receiverId.equals(other.receiverId) && receiverName.equals(other.receiverName) && totalInvoiceAmount.equals(other.totalInvoiceAmount) && totalExemptAmount.equals(other.totalExemptAmount) && totalRetainedAmount.equals(other.totalRetainedAmount) && totalTaxableAmount.equals(other.totalTaxableAmount) && retentionBreakdown.equals(other.retentionBreakdown) && xml.equals(other.xml);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.id, this.link, this.collectedAt, this.createdAt, this.invoiceIdentification, this.version, this.code, this.issuedAt, this.certifiedAt, this.cancelledAt, this.senderId, this.senderName, this.receiverNationality, this.receiverId, this.receiverName, this.totalInvoiceAmount, this.totalExemptAmount, this.totalRetainedAmount, this.totalTaxableAmount, this.retentionBreakdown, this.xml);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "TaxRetentions{" + "id: " + id + ", link: " + link + ", collectedAt: " + collectedAt + ", createdAt: " + createdAt + ", invoiceIdentification: " + invoiceIdentification + ", version: " + version + ", code: " + code + ", issuedAt: " + issuedAt + ", certifiedAt: " + certifiedAt + ", cancelledAt: " + cancelledAt + ", senderId: " + senderId + ", senderName: " + senderName + ", receiverNationality: " + receiverNationality + ", receiverId: " + receiverId + ", receiverName: " + receiverName + ", totalInvoiceAmount: " + totalInvoiceAmount + ", totalExemptAmount: " + totalExemptAmount + ", totalRetainedAmount: " + totalRetainedAmount + ", totalTaxableAmount: " + totalTaxableAmount + ", retentionBreakdown: " + retentionBreakdown + ", xml: " + xml + "}";
  }

  public static ReceiverNationalityStage builder() {
    return new Builder();
  }

  public interface ReceiverNationalityStage {
    _FinalStage receiverNationality(EnumTaxRetentionReceiverNationality receiverNationality);

    Builder from(TaxRetentions other);
  }

  public interface _FinalStage {
    TaxRetentions build();

    _FinalStage id(Optional<String> id);

    _FinalStage id(String id);

    _FinalStage link(Optional<String> link);

    _FinalStage link(String link);

    _FinalStage collectedAt(Optional<String> collectedAt);

    _FinalStage collectedAt(String collectedAt);

    _FinalStage createdAt(Optional<String> createdAt);

    _FinalStage createdAt(String createdAt);

    _FinalStage invoiceIdentification(Optional<String> invoiceIdentification);

    _FinalStage invoiceIdentification(String invoiceIdentification);

    _FinalStage version(Optional<String> version);

    _FinalStage version(String version);

    _FinalStage code(Optional<Integer> code);

    _FinalStage code(Integer code);

    _FinalStage issuedAt(Optional<String> issuedAt);

    _FinalStage issuedAt(String issuedAt);

    _FinalStage certifiedAt(Optional<String> certifiedAt);

    _FinalStage certifiedAt(String certifiedAt);

    _FinalStage cancelledAt(Optional<String> cancelledAt);

    _FinalStage cancelledAt(String cancelledAt);

    _FinalStage senderId(Optional<String> senderId);

    _FinalStage senderId(String senderId);

    _FinalStage senderName(Optional<String> senderName);

    _FinalStage senderName(String senderName);

    _FinalStage receiverId(Optional<String> receiverId);

    _FinalStage receiverId(String receiverId);

    _FinalStage receiverName(Optional<String> receiverName);

    _FinalStage receiverName(String receiverName);

    _FinalStage totalInvoiceAmount(Optional<Double> totalInvoiceAmount);

    _FinalStage totalInvoiceAmount(Double totalInvoiceAmount);

    _FinalStage totalExemptAmount(Optional<Double> totalExemptAmount);

    _FinalStage totalExemptAmount(Double totalExemptAmount);

    _FinalStage totalRetainedAmount(Optional<Double> totalRetainedAmount);

    _FinalStage totalRetainedAmount(Double totalRetainedAmount);

    _FinalStage totalTaxableAmount(Optional<Double> totalTaxableAmount);

    _FinalStage totalTaxableAmount(Double totalTaxableAmount);

    _FinalStage retentionBreakdown(Optional<List<RetentionBreakdown>> retentionBreakdown);

    _FinalStage retentionBreakdown(List<RetentionBreakdown> retentionBreakdown);

    _FinalStage xml(Optional<String> xml);

    _FinalStage xml(String xml);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements ReceiverNationalityStage, _FinalStage {
    private EnumTaxRetentionReceiverNationality receiverNationality;

    private Optional<String> xml = Optional.empty();

    private Optional<List<RetentionBreakdown>> retentionBreakdown = Optional.empty();

    private Optional<Double> totalTaxableAmount = Optional.empty();

    private Optional<Double> totalRetainedAmount = Optional.empty();

    private Optional<Double> totalExemptAmount = Optional.empty();

    private Optional<Double> totalInvoiceAmount = Optional.empty();

    private Optional<String> receiverName = Optional.empty();

    private Optional<String> receiverId = Optional.empty();

    private Optional<String> senderName = Optional.empty();

    private Optional<String> senderId = Optional.empty();

    private Optional<String> cancelledAt = Optional.empty();

    private Optional<String> certifiedAt = Optional.empty();

    private Optional<String> issuedAt = Optional.empty();

    private Optional<Integer> code = Optional.empty();

    private Optional<String> version = Optional.empty();

    private Optional<String> invoiceIdentification = Optional.empty();

    private Optional<String> createdAt = Optional.empty();

    private Optional<String> collectedAt = Optional.empty();

    private Optional<String> link = Optional.empty();

    private Optional<String> id = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(TaxRetentions other) {
      id(other.getId());
      link(other.getLink());
      collectedAt(other.getCollectedAt());
      createdAt(other.getCreatedAt());
      invoiceIdentification(other.getInvoiceIdentification());
      version(other.getVersion());
      code(other.getCode());
      issuedAt(other.getIssuedAt());
      certifiedAt(other.getCertifiedAt());
      cancelledAt(other.getCancelledAt());
      senderId(other.getSenderId());
      senderName(other.getSenderName());
      receiverNationality(other.getReceiverNationality());
      receiverId(other.getReceiverId());
      receiverName(other.getReceiverName());
      totalInvoiceAmount(other.getTotalInvoiceAmount());
      totalExemptAmount(other.getTotalExemptAmount());
      totalRetainedAmount(other.getTotalRetainedAmount());
      totalTaxableAmount(other.getTotalTaxableAmount());
      retentionBreakdown(other.getRetentionBreakdown());
      xml(other.getXml());
      return this;
    }

    @Override
    @JsonSetter("receiver_nationality")
    public _FinalStage receiverNationality(
        EnumTaxRetentionReceiverNationality receiverNationality) {
      this.receiverNationality = receiverNationality;
      return this;
    }

    /**
     * <p>The tax retention document in XML form.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage xml(String xml) {
      this.xml = Optional.of(xml);
      return this;
    }

    @Override
    @JsonSetter(
        value = "xml",
        nulls = Nulls.SKIP
    )
    public _FinalStage xml(Optional<String> xml) {
      this.xml = xml;
      return this;
    }

    /**
     * <p>A breakdown of the retained taxes.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage retentionBreakdown(List<RetentionBreakdown> retentionBreakdown) {
      this.retentionBreakdown = Optional.of(retentionBreakdown);
      return this;
    }

    @Override
    @JsonSetter(
        value = "retention_breakdown",
        nulls = Nulls.SKIP
    )
    public _FinalStage retentionBreakdown(Optional<List<RetentionBreakdown>> retentionBreakdown) {
      this.retentionBreakdown = retentionBreakdown;
      return this;
    }

    /**
     * <p>The total amount that can be taxed. Calculated as <code>total_invoice_amount</code> - <code>total_exempt_amount</code>.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage totalTaxableAmount(Double totalTaxableAmount) {
      this.totalTaxableAmount = Optional.of(totalTaxableAmount);
      return this;
    }

    @Override
    @JsonSetter(
        value = "total_taxable_amount",
        nulls = Nulls.SKIP
    )
    public _FinalStage totalTaxableAmount(Optional<Double> totalTaxableAmount) {
      this.totalTaxableAmount = totalTaxableAmount;
      return this;
    }

    /**
     * <p>Total tax retained.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage totalRetainedAmount(Double totalRetainedAmount) {
      this.totalRetainedAmount = Optional.of(totalRetainedAmount);
      return this;
    }

    @Override
    @JsonSetter(
        value = "total_retained_amount",
        nulls = Nulls.SKIP
    )
    public _FinalStage totalRetainedAmount(Optional<Double> totalRetainedAmount) {
      this.totalRetainedAmount = totalRetainedAmount;
      return this;
    }

    /**
     * <p>Total amount that is exempt from taxation.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage totalExemptAmount(Double totalExemptAmount) {
      this.totalExemptAmount = Optional.of(totalExemptAmount);
      return this;
    }

    @Override
    @JsonSetter(
        value = "total_exempt_amount",
        nulls = Nulls.SKIP
    )
    public _FinalStage totalExemptAmount(Optional<Double> totalExemptAmount) {
      this.totalExemptAmount = totalExemptAmount;
      return this;
    }

    /**
     * <p>The total amount of the invoice that the tax retention relates to.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage totalInvoiceAmount(Double totalInvoiceAmount) {
      this.totalInvoiceAmount = Optional.of(totalInvoiceAmount);
      return this;
    }

    @Override
    @JsonSetter(
        value = "total_invoice_amount",
        nulls = Nulls.SKIP
    )
    public _FinalStage totalInvoiceAmount(Optional<Double> totalInvoiceAmount) {
      this.totalInvoiceAmount = totalInvoiceAmount;
      return this;
    }

    /**
     * <p>The name of the invoice receiver.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage receiverName(String receiverName) {
      this.receiverName = Optional.of(receiverName);
      return this;
    }

    @Override
    @JsonSetter(
        value = "receiver_name",
        nulls = Nulls.SKIP
    )
    public _FinalStage receiverName(Optional<String> receiverName) {
      this.receiverName = receiverName;
      return this;
    }

    /**
     * <p>The fiscal ID of the invoice receiver.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage receiverId(String receiverId) {
      this.receiverId = Optional.of(receiverId);
      return this;
    }

    @Override
    @JsonSetter(
        value = "receiver_id",
        nulls = Nulls.SKIP
    )
    public _FinalStage receiverId(Optional<String> receiverId) {
      this.receiverId = receiverId;
      return this;
    }

    /**
     * <p>The name of the invoice sender.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage senderName(String senderName) {
      this.senderName = Optional.of(senderName);
      return this;
    }

    @Override
    @JsonSetter(
        value = "sender_name",
        nulls = Nulls.SKIP
    )
    public _FinalStage senderName(Optional<String> senderName) {
      this.senderName = senderName;
      return this;
    }

    /**
     * <p>The fiscal ID of the invoice sender.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage senderId(String senderId) {
      this.senderId = Optional.of(senderId);
      return this;
    }

    @Override
    @JsonSetter(
        value = "sender_id",
        nulls = Nulls.SKIP
    )
    public _FinalStage senderId(Optional<String> senderId) {
      this.senderId = senderId;
      return this;
    }

    /**
     * <p>The ISO-8601 timestamp of when the tax retention was canceled (if applicable).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage cancelledAt(String cancelledAt) {
      this.cancelledAt = Optional.of(cancelledAt);
      return this;
    }

    @Override
    @JsonSetter(
        value = "cancelled_at",
        nulls = Nulls.SKIP
    )
    public _FinalStage cancelledAt(Optional<String> cancelledAt) {
      this.cancelledAt = cancelledAt;
      return this;
    }

    /**
     * <p>The ISO-8601 timestamp of when the tax retention was certified.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage certifiedAt(String certifiedAt) {
      this.certifiedAt = Optional.of(certifiedAt);
      return this;
    }

    @Override
    @JsonSetter(
        value = "certified_at",
        nulls = Nulls.SKIP
    )
    public _FinalStage certifiedAt(Optional<String> certifiedAt) {
      this.certifiedAt = certifiedAt;
      return this;
    }

    /**
     * <p>The ISO-8601 timestamp of when the tax retention was issued.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage issuedAt(String issuedAt) {
      this.issuedAt = Optional.of(issuedAt);
      return this;
    }

    @Override
    @JsonSetter(
        value = "issued_at",
        nulls = Nulls.SKIP
    )
    public _FinalStage issuedAt(Optional<String> issuedAt) {
      this.issuedAt = issuedAt;
      return this;
    }

    /**
     * <p>The tax retention code. For more information, see our <a href="https://developers.belvo.com/docs/sat-catalogs#retention-code">SAT Catalogs DevPortal article</a>.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage code(Integer code) {
      this.code = Optional.of(code);
      return this;
    }

    @Override
    @JsonSetter(
        value = "code",
        nulls = Nulls.SKIP
    )
    public _FinalStage code(Optional<Integer> code) {
      this.code = code;
      return this;
    }

    /**
     * <p>The CFDI version of the tax retentions.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage version(String version) {
      this.version = Optional.of(version);
      return this;
    }

    @Override
    @JsonSetter(
        value = "version",
        nulls = Nulls.SKIP
    )
    public _FinalStage version(Optional<String> version) {
      this.version = version;
      return this;
    }

    /**
     * <p>The fiscal institution's unique ID for the invoice that the tax retention relates to.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage invoiceIdentification(String invoiceIdentification) {
      this.invoiceIdentification = Optional.of(invoiceIdentification);
      return this;
    }

    @Override
    @JsonSetter(
        value = "invoice_identification",
        nulls = Nulls.SKIP
    )
    public _FinalStage invoiceIdentification(Optional<String> invoiceIdentification) {
      this.invoiceIdentification = invoiceIdentification;
      return this;
    }

    /**
     * <p>The ISO-8601 timestamp of when the data point was last updated in Belvo's database.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage createdAt(String createdAt) {
      this.createdAt = Optional.of(createdAt);
      return this;
    }

    @Override
    @JsonSetter(
        value = "created_at",
        nulls = Nulls.SKIP
    )
    public _FinalStage createdAt(Optional<String> createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * <p>The ISO-8601 timestamp of when the data point was collected.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage collectedAt(String collectedAt) {
      this.collectedAt = Optional.of(collectedAt);
      return this;
    }

    @Override
    @JsonSetter(
        value = "collected_at",
        nulls = Nulls.SKIP
    )
    public _FinalStage collectedAt(Optional<String> collectedAt) {
      this.collectedAt = collectedAt;
      return this;
    }

    /**
     * <p>The <code>link.id</code> the tax retention belongs to.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage link(String link) {
      this.link = Optional.of(link);
      return this;
    }

    @Override
    @JsonSetter(
        value = "link",
        nulls = Nulls.SKIP
    )
    public _FinalStage link(Optional<String> link) {
      this.link = link;
      return this;
    }

    /**
     * <p>Belvo's unique identifier used to reference the current tax retention statement.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage id(String id) {
      this.id = Optional.of(id);
      return this;
    }

    @Override
    @JsonSetter(
        value = "id",
        nulls = Nulls.SKIP
    )
    public _FinalStage id(Optional<String> id) {
      this.id = id;
      return this;
    }

    @Override
    public TaxRetentions build() {
      return new TaxRetentions(id, link, collectedAt, createdAt, invoiceIdentification, version, code, issuedAt, certifiedAt, cancelledAt, senderId, senderName, receiverNationality, receiverId, receiverName, totalInvoiceAmount, totalExemptAmount, totalRetainedAmount, totalTaxableAmount, retentionBreakdown, xml);
    }
  }
}
