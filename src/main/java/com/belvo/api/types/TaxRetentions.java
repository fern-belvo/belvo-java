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

  private final Optional<EnumTaxRetentionReceiverNationality> receiverNationality;

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
      Optional<EnumTaxRetentionReceiverNationality> receiverNationality,
      Optional<String> receiverId, Optional<String> receiverName,
      Optional<Double> totalInvoiceAmount, Optional<Double> totalExemptAmount,
      Optional<Double> totalRetainedAmount, Optional<Double> totalTaxableAmount,
      Optional<List<RetentionBreakdown>> retentionBreakdown, Optional<String> xml) {
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
  public Optional<EnumTaxRetentionReceiverNationality> getReceiverNationality() {
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

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> id = Optional.empty();

    private Optional<String> link = Optional.empty();

    private Optional<String> collectedAt = Optional.empty();

    private Optional<String> createdAt = Optional.empty();

    private Optional<String> invoiceIdentification = Optional.empty();

    private Optional<String> version = Optional.empty();

    private Optional<Integer> code = Optional.empty();

    private Optional<String> issuedAt = Optional.empty();

    private Optional<String> certifiedAt = Optional.empty();

    private Optional<String> cancelledAt = Optional.empty();

    private Optional<String> senderId = Optional.empty();

    private Optional<String> senderName = Optional.empty();

    private Optional<EnumTaxRetentionReceiverNationality> receiverNationality = Optional.empty();

    private Optional<String> receiverId = Optional.empty();

    private Optional<String> receiverName = Optional.empty();

    private Optional<Double> totalInvoiceAmount = Optional.empty();

    private Optional<Double> totalExemptAmount = Optional.empty();

    private Optional<Double> totalRetainedAmount = Optional.empty();

    private Optional<Double> totalTaxableAmount = Optional.empty();

    private Optional<List<RetentionBreakdown>> retentionBreakdown = Optional.empty();

    private Optional<String> xml = Optional.empty();

    private Builder() {
    }

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
        value = "collected_at",
        nulls = Nulls.SKIP
    )
    public Builder collectedAt(Optional<String> collectedAt) {
      this.collectedAt = collectedAt;
      return this;
    }

    public Builder collectedAt(String collectedAt) {
      this.collectedAt = Optional.of(collectedAt);
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
        value = "version",
        nulls = Nulls.SKIP
    )
    public Builder version(Optional<String> version) {
      this.version = version;
      return this;
    }

    public Builder version(String version) {
      this.version = Optional.of(version);
      return this;
    }

    @JsonSetter(
        value = "code",
        nulls = Nulls.SKIP
    )
    public Builder code(Optional<Integer> code) {
      this.code = code;
      return this;
    }

    public Builder code(Integer code) {
      this.code = Optional.of(code);
      return this;
    }

    @JsonSetter(
        value = "issued_at",
        nulls = Nulls.SKIP
    )
    public Builder issuedAt(Optional<String> issuedAt) {
      this.issuedAt = issuedAt;
      return this;
    }

    public Builder issuedAt(String issuedAt) {
      this.issuedAt = Optional.of(issuedAt);
      return this;
    }

    @JsonSetter(
        value = "certified_at",
        nulls = Nulls.SKIP
    )
    public Builder certifiedAt(Optional<String> certifiedAt) {
      this.certifiedAt = certifiedAt;
      return this;
    }

    public Builder certifiedAt(String certifiedAt) {
      this.certifiedAt = Optional.of(certifiedAt);
      return this;
    }

    @JsonSetter(
        value = "cancelled_at",
        nulls = Nulls.SKIP
    )
    public Builder cancelledAt(Optional<String> cancelledAt) {
      this.cancelledAt = cancelledAt;
      return this;
    }

    public Builder cancelledAt(String cancelledAt) {
      this.cancelledAt = Optional.of(cancelledAt);
      return this;
    }

    @JsonSetter(
        value = "sender_id",
        nulls = Nulls.SKIP
    )
    public Builder senderId(Optional<String> senderId) {
      this.senderId = senderId;
      return this;
    }

    public Builder senderId(String senderId) {
      this.senderId = Optional.of(senderId);
      return this;
    }

    @JsonSetter(
        value = "sender_name",
        nulls = Nulls.SKIP
    )
    public Builder senderName(Optional<String> senderName) {
      this.senderName = senderName;
      return this;
    }

    public Builder senderName(String senderName) {
      this.senderName = Optional.of(senderName);
      return this;
    }

    @JsonSetter(
        value = "receiver_nationality",
        nulls = Nulls.SKIP
    )
    public Builder receiverNationality(
        Optional<EnumTaxRetentionReceiverNationality> receiverNationality) {
      this.receiverNationality = receiverNationality;
      return this;
    }

    public Builder receiverNationality(EnumTaxRetentionReceiverNationality receiverNationality) {
      this.receiverNationality = Optional.of(receiverNationality);
      return this;
    }

    @JsonSetter(
        value = "receiver_id",
        nulls = Nulls.SKIP
    )
    public Builder receiverId(Optional<String> receiverId) {
      this.receiverId = receiverId;
      return this;
    }

    public Builder receiverId(String receiverId) {
      this.receiverId = Optional.of(receiverId);
      return this;
    }

    @JsonSetter(
        value = "receiver_name",
        nulls = Nulls.SKIP
    )
    public Builder receiverName(Optional<String> receiverName) {
      this.receiverName = receiverName;
      return this;
    }

    public Builder receiverName(String receiverName) {
      this.receiverName = Optional.of(receiverName);
      return this;
    }

    @JsonSetter(
        value = "total_invoice_amount",
        nulls = Nulls.SKIP
    )
    public Builder totalInvoiceAmount(Optional<Double> totalInvoiceAmount) {
      this.totalInvoiceAmount = totalInvoiceAmount;
      return this;
    }

    public Builder totalInvoiceAmount(Double totalInvoiceAmount) {
      this.totalInvoiceAmount = Optional.of(totalInvoiceAmount);
      return this;
    }

    @JsonSetter(
        value = "total_exempt_amount",
        nulls = Nulls.SKIP
    )
    public Builder totalExemptAmount(Optional<Double> totalExemptAmount) {
      this.totalExemptAmount = totalExemptAmount;
      return this;
    }

    public Builder totalExemptAmount(Double totalExemptAmount) {
      this.totalExemptAmount = Optional.of(totalExemptAmount);
      return this;
    }

    @JsonSetter(
        value = "total_retained_amount",
        nulls = Nulls.SKIP
    )
    public Builder totalRetainedAmount(Optional<Double> totalRetainedAmount) {
      this.totalRetainedAmount = totalRetainedAmount;
      return this;
    }

    public Builder totalRetainedAmount(Double totalRetainedAmount) {
      this.totalRetainedAmount = Optional.of(totalRetainedAmount);
      return this;
    }

    @JsonSetter(
        value = "total_taxable_amount",
        nulls = Nulls.SKIP
    )
    public Builder totalTaxableAmount(Optional<Double> totalTaxableAmount) {
      this.totalTaxableAmount = totalTaxableAmount;
      return this;
    }

    public Builder totalTaxableAmount(Double totalTaxableAmount) {
      this.totalTaxableAmount = Optional.of(totalTaxableAmount);
      return this;
    }

    @JsonSetter(
        value = "retention_breakdown",
        nulls = Nulls.SKIP
    )
    public Builder retentionBreakdown(Optional<List<RetentionBreakdown>> retentionBreakdown) {
      this.retentionBreakdown = retentionBreakdown;
      return this;
    }

    public Builder retentionBreakdown(List<RetentionBreakdown> retentionBreakdown) {
      this.retentionBreakdown = Optional.of(retentionBreakdown);
      return this;
    }

    @JsonSetter(
        value = "xml",
        nulls = Nulls.SKIP
    )
    public Builder xml(Optional<String> xml) {
      this.xml = xml;
      return this;
    }

    public Builder xml(String xml) {
      this.xml = Optional.of(xml);
      return this;
    }

    public TaxRetentions build() {
      return new TaxRetentions(id, link, collectedAt, createdAt, invoiceIdentification, version, code, issuedAt, certifiedAt, cancelledAt, senderId, senderName, receiverNationality, receiverId, receiverName, totalInvoiceAmount, totalExemptAmount, totalRetainedAmount, totalTaxableAmount, retentionBreakdown, xml);
    }
  }
}
