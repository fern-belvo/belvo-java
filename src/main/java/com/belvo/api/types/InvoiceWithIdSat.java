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
    builder = InvoiceWithIdSat.Builder.class
)
public final class InvoiceWithIdSat {
  private final Optional<String> id;

  private final Optional<String> link;

  private final Optional<String> collectedAt;

  private final Optional<String> createdAt;

  private final Optional<String> invoiceIdentification;

  private final Optional<String> invoiceDate;

  private final Optional<String> status;

  private final Optional<EnumInvoiceSatInvoiceType> invoiceType;

  private final Optional<String> type;

  private final Optional<String> senderId;

  private final Optional<String> senderName;

  private final Optional<String> senderTaxFraudStatus;

  private final Optional<String> receiverId;

  private final Optional<String> receiverName;

  private final Optional<String> receiverTaxFraudStatus;

  private final Optional<String> cancelationStatus;

  private final Optional<String> cancelationUpdateDate;

  private final Optional<String> certificationDate;

  private final Optional<String> certificationAuthority;

  private final Optional<String> paymentType;

  private final Optional<String> paymentTypeDescription;

  private final Optional<String> paymentMethod;

  private final Optional<String> paymentMethodDescription;

  private final Optional<String> usage;

  private final Optional<String> version;

  private final Optional<String> placeOfIssue;

  private final List<InvoiceDetailSat> invoiceDetails;

  private final Optional<String> currency;

  private final Optional<Double> subtotalAmount;

  private final Optional<Double> exchangeRate;

  private final Optional<Double> taxAmount;

  private final Optional<Double> discountAmount;

  private final Optional<Double> totalAmount;

  private final List<InvoicesPaymentsSat> payments;

  private final Optional<InvoicesPayrollSat> payroll;

  private final Optional<String> folio;

  private final Optional<String> xml;

  private final Optional<InvoiceWarningsSat> warnings;

  private final Optional<String> senderBlacklistStatus;

  private final Optional<String> receiverBlacklistStatus;

  private int _cachedHashCode;

  InvoiceWithIdSat(Optional<String> id, Optional<String> link, Optional<String> collectedAt,
      Optional<String> createdAt, Optional<String> invoiceIdentification,
      Optional<String> invoiceDate, Optional<String> status,
      Optional<EnumInvoiceSatInvoiceType> invoiceType, Optional<String> type,
      Optional<String> senderId, Optional<String> senderName, Optional<String> senderTaxFraudStatus,
      Optional<String> receiverId, Optional<String> receiverName,
      Optional<String> receiverTaxFraudStatus, Optional<String> cancelationStatus,
      Optional<String> cancelationUpdateDate, Optional<String> certificationDate,
      Optional<String> certificationAuthority, Optional<String> paymentType,
      Optional<String> paymentTypeDescription, Optional<String> paymentMethod,
      Optional<String> paymentMethodDescription, Optional<String> usage, Optional<String> version,
      Optional<String> placeOfIssue, List<InvoiceDetailSat> invoiceDetails,
      Optional<String> currency, Optional<Double> subtotalAmount, Optional<Double> exchangeRate,
      Optional<Double> taxAmount, Optional<Double> discountAmount, Optional<Double> totalAmount,
      List<InvoicesPaymentsSat> payments, Optional<InvoicesPayrollSat> payroll,
      Optional<String> folio, Optional<String> xml, Optional<InvoiceWarningsSat> warnings,
      Optional<String> senderBlacklistStatus, Optional<String> receiverBlacklistStatus) {
    this.id = id;
    this.link = link;
    this.collectedAt = collectedAt;
    this.createdAt = createdAt;
    this.invoiceIdentification = invoiceIdentification;
    this.invoiceDate = invoiceDate;
    this.status = status;
    this.invoiceType = invoiceType;
    this.type = type;
    this.senderId = senderId;
    this.senderName = senderName;
    this.senderTaxFraudStatus = senderTaxFraudStatus;
    this.receiverId = receiverId;
    this.receiverName = receiverName;
    this.receiverTaxFraudStatus = receiverTaxFraudStatus;
    this.cancelationStatus = cancelationStatus;
    this.cancelationUpdateDate = cancelationUpdateDate;
    this.certificationDate = certificationDate;
    this.certificationAuthority = certificationAuthority;
    this.paymentType = paymentType;
    this.paymentTypeDescription = paymentTypeDescription;
    this.paymentMethod = paymentMethod;
    this.paymentMethodDescription = paymentMethodDescription;
    this.usage = usage;
    this.version = version;
    this.placeOfIssue = placeOfIssue;
    this.invoiceDetails = invoiceDetails;
    this.currency = currency;
    this.subtotalAmount = subtotalAmount;
    this.exchangeRate = exchangeRate;
    this.taxAmount = taxAmount;
    this.discountAmount = discountAmount;
    this.totalAmount = totalAmount;
    this.payments = payments;
    this.payroll = payroll;
    this.folio = folio;
    this.xml = xml;
    this.warnings = warnings;
    this.senderBlacklistStatus = senderBlacklistStatus;
    this.receiverBlacklistStatus = receiverBlacklistStatus;
  }

  /**
   * @return Belvo's unique identifier used to reference the current invoice.
   */
  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
  }

  /**
   * @return The <code>link.id</code> the invoice belongs to.
   */
  @JsonProperty("link")
  public Optional<String> getLink() {
    return link;
  }

  /**
   * @return The ISO-8601 timestamp when the data point was collected.
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
   * @return The fiscal institution's unique ID for the invoice.
   */
  @JsonProperty("invoice_identification")
  public Optional<String> getInvoiceIdentification() {
    return invoiceIdentification;
  }

  /**
   * @return The date of the invoice.
   */
  @JsonProperty("invoice_date")
  public Optional<String> getInvoiceDate() {
    return invoiceDate;
  }

  /**
   * @return The status of the invoice. Can be either <em>Vigente</em> (valid) or <em>Cancelado</em> (cancelled).
   */
  @JsonProperty("status")
  public Optional<String> getStatus() {
    return status;
  }

  @JsonProperty("invoice_type")
  public Optional<EnumInvoiceSatInvoiceType> getInvoiceType() {
    return invoiceType;
  }

  @JsonProperty("type")
  public Optional<String> getType() {
    return type;
  }

  /**
   * @return The fiscal ID of the invoice sender
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

  /**
   * @return Indicates whether or not the sender is on SAT's tax fraud list for having submitted incorrect data, having outstanding payments, or having conducted business that is in violation of the fiscal institution's regulations.&lt;br&gt;&lt;br&gt;
   * SAT updates the tax fraud list every three months. &lt;br&gt;&lt;br&gt;
   * For more information regarding the reason's a taxpayer can be put on the tax fraud list, please see <a href="http://omawww.sat.gob.mx/cifras_sat/Paginas/datos/vinculo.html?page=ListCompleta69.html">Article 69</a> and <a href="http://omawww.sat.gob.mx/cifras_sat/Paginas/datos/vinculo.html?page=ListCompleta69B.html">Article 69-B</a> of Mexico's Código Fiscal de la Federación. &lt;br&gt;&lt;br&gt;
   * Possible statuses are:
   * <ul>
   * <li><code>INVESTIGATING</code> &lt;br&gt; The fiscal institution has identified irregularities and open an investigation regarding the taxpayer. &lt;br&gt; - <code>DISMISSED</code> &lt;br&gt; The fiscal institution has investigated the taxpayer and declared them innocent. &lt;br&gt; - <code>CONFIRMED</code> &lt;br&gt; The fiscal institution has confirmed that the taxpayer is guilty. &lt;br&gt; - <code>OVERTURNED</code> &lt;br&gt; The fiscal institution has reassessed a previously confirmed taxpayer and, based on new evidence, has taken the taxpayer off the tax fraud list. &lt;br&gt; - <code>NO_TAX_FRAUD_STATUS</code> &lt;br&gt; The receiver or sender is not found in the list (in other words, they are complying with the fiscal institution's regulations).</li>
   * </ul>
   */
  @JsonProperty("sender_tax_fraud_status")
  public Optional<String> getSenderTaxFraudStatus() {
    return senderTaxFraudStatus;
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
   * @return Indicates whether or not the receiver is on SAT's tax fraud list for having submitted incorrect data, having outstanding payments, or having conducted business that is in violation of the fiscal institution's regulations.&lt;br&gt;&lt;br&gt;
   * SAT updates the tax fraud list every three months. &lt;br&gt;&lt;br&gt;
   * For more information regarding the reason's a taxpayer can be put on the tax fraud list, please see <a href="http://omawww.sat.gob.mx/cifras_sat/Paginas/datos/vinculo.html?page=ListCompleta69.html">Article 69</a> and <a href="http://omawww.sat.gob.mx/cifras_sat/Paginas/datos/vinculo.html?page=ListCompleta69B.html">Article 69-B</a> of Mexico's Código Fiscal de la Federación. &lt;br&gt;&lt;br&gt;
   * Possible statuses are:
   * <ul>
   * <li><code>INVESTIGATING</code> &lt;br&gt; The fiscal institution has identified irregularities and open an investigation regarding the taxpayer. &lt;br&gt; - <code>DISMISSED</code> &lt;br&gt; The fiscal institution has investigated the taxpayer and declared them innocent. &lt;br&gt; - <code>CONFIRMED</code> &lt;br&gt; The fiscal institution has confirmed that the taxpayer is guilty. &lt;br&gt; - <code>OVERTURNED</code> &lt;br&gt; The fiscal institution has reassessed a previously confirmed taxpayer and, based on new evidence, has taken the taxpayer off the tax fraud list. &lt;br&gt; - <code>NO_TAX_FRAUD_STATUS</code> &lt;br&gt; The receiver or sender is not found in the list (in other words, they are complying with the fiscal institution's regulations).</li>
   * </ul>
   */
  @JsonProperty("receiver_tax_fraud_status")
  public Optional<String> getReceiverTaxFraudStatus() {
    return receiverTaxFraudStatus;
  }

  /**
   * @return If the invoice is cancelled, this field indicates the status of the cancellation.
   */
  @JsonProperty("cancelation_status")
  public Optional<String> getCancelationStatus() {
    return cancelationStatus;
  }

  /**
   * @return The date of the invoice cancelation.
   */
  @JsonProperty("cancelation_update_date")
  public Optional<String> getCancelationUpdateDate() {
    return cancelationUpdateDate;
  }

  /**
   * @return The date of the fiscal certification.
   */
  @JsonProperty("certification_date")
  public Optional<String> getCertificationDate() {
    return certificationDate;
  }

  /**
   * @return The fiscal ID of the certification provider.
   */
  @JsonProperty("certification_authority")
  public Optional<String> getCertificationAuthority() {
    return certificationAuthority;
  }

  /**
   * @return The payment type code used for this invoice, as defined by the country legal entity.
   * <ul>
   * <li>🇲🇽 Mexico <a href="https://developers.belvo.com/docs/sat-catalogs#payment-type">SAT catalog reference article</a></li>
   * </ul>
   */
  @JsonProperty("payment_type")
  public Optional<String> getPaymentType() {
    return paymentType;
  }

  /**
   * @return <em>This field has been deprecated.</em>
   */
  @JsonProperty("payment_type_description")
  public Optional<String> getPaymentTypeDescription() {
    return paymentTypeDescription;
  }

  @JsonProperty("payment_method")
  public Optional<String> getPaymentMethod() {
    return paymentMethod;
  }

  /**
   * @return <em>This field has been deprecated.</em>
   * <p><em>The description of the payment method used for this invoice.</em></p>
   */
  @JsonProperty("payment_method_description")
  public Optional<String> getPaymentMethodDescription() {
    return paymentMethodDescription;
  }

  /**
   * @return The invoice's usage code, as defined by the legal entity of the country.
   * <ul>
   * <li>🇲🇽 Mexico <a href="https://developers.belvo.com/docs/sat-catalogs#usage">SAT catalog reference article</a></li>
   * </ul>
   */
  @JsonProperty("usage")
  public Optional<String> getUsage() {
    return usage;
  }

  /**
   * @return The CFDI version of the invoice.
   */
  @JsonProperty("version")
  public Optional<String> getVersion() {
    return version;
  }

  /**
   * @return The postcode of where the invoice was issued.
   */
  @JsonProperty("place_of_issue")
  public Optional<String> getPlaceOfIssue() {
    return placeOfIssue;
  }

  /**
   * @return A list of descriptions for each item (purchased product or service provided) in the invoice.
   */
  @JsonProperty("invoice_details")
  public List<InvoiceDetailSat> getInvoiceDetails() {
    return invoiceDetails;
  }

  /**
   * @return The currency of the invoice. For example:
   * <ul>
   * <li>🇧🇷 BRL (Brazilian Real)</li>
   * <li>🇨🇴 COP (Colombian Peso)</li>
   * <li>🇲🇽 MXN (Mexican Peso)</li>
   * <li>🇺🇸 USD (United States Dollar)</li>
   * </ul>
   */
  @JsonProperty("currency")
  public Optional<String> getCurrency() {
    return currency;
  }

  /**
   * @return The pretax amount of this invoice (sum of each item's <code>pre_tax_amount</code>).
   */
  @JsonProperty("subtotal_amount")
  public Optional<Double> getSubtotalAmount() {
    return subtotalAmount;
  }

  /**
   * @return The exchange rate used in this invoice for the currency.
   */
  @JsonProperty("exchange_rate")
  public Optional<Double> getExchangeRate() {
    return exchangeRate;
  }

  /**
   * @return The amount of tax for this invoice (sum of each item's <code>tax_amount</code>).
   */
  @JsonProperty("tax_amount")
  public Optional<Double> getTaxAmount() {
    return taxAmount;
  }

  /**
   * @return The total amount discounted in this invoice.
   */
  @JsonProperty("discount_amount")
  public Optional<Double> getDiscountAmount() {
    return discountAmount;
  }

  /**
   * @return The total amount of the invoice (<code>subtotal_amount</code> + <code>tax_amount</code> - <code>discount_amount</code>)
   */
  @JsonProperty("total_amount")
  public Optional<Double> getTotalAmount() {
    return totalAmount;
  }

  /**
   * @return A list detailing all the invoice payments.
   */
  @JsonProperty("payments")
  public List<InvoicesPaymentsSat> getPayments() {
    return payments;
  }

  @JsonProperty("payroll")
  public Optional<InvoicesPayrollSat> getPayroll() {
    return payroll;
  }

  /**
   * @return The internal control number that the taxpayer assigns to the invoice.
   */
  @JsonProperty("folio")
  public Optional<String> getFolio() {
    return folio;
  }

  /**
   * @return XML of the invoice document.
   */
  @JsonProperty("xml")
  public Optional<String> getXml() {
    return xml;
  }

  @JsonProperty("warnings")
  public Optional<InvoiceWarningsSat> getWarnings() {
    return warnings;
  }

  /**
   * @return This field has been deprecated. Please use <code>sender_tax_fraud_status</code> instead.
   */
  @JsonProperty("sender_blacklist_status")
  public Optional<String> getSenderBlacklistStatus() {
    return senderBlacklistStatus;
  }

  /**
   * @return This field has been deprecated. Please use <code>receiver_tax_fraud_status</code> instead.
   */
  @JsonProperty("receiver_blacklist_status")
  public Optional<String> getReceiverBlacklistStatus() {
    return receiverBlacklistStatus;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof InvoiceWithIdSat && equalTo((InvoiceWithIdSat) other);
  }

  private boolean equalTo(InvoiceWithIdSat other) {
    return id.equals(other.id) && link.equals(other.link) && collectedAt.equals(other.collectedAt) && createdAt.equals(other.createdAt) && invoiceIdentification.equals(other.invoiceIdentification) && invoiceDate.equals(other.invoiceDate) && status.equals(other.status) && invoiceType.equals(other.invoiceType) && type.equals(other.type) && senderId.equals(other.senderId) && senderName.equals(other.senderName) && senderTaxFraudStatus.equals(other.senderTaxFraudStatus) && receiverId.equals(other.receiverId) && receiverName.equals(other.receiverName) && receiverTaxFraudStatus.equals(other.receiverTaxFraudStatus) && cancelationStatus.equals(other.cancelationStatus) && cancelationUpdateDate.equals(other.cancelationUpdateDate) && certificationDate.equals(other.certificationDate) && certificationAuthority.equals(other.certificationAuthority) && paymentType.equals(other.paymentType) && paymentTypeDescription.equals(other.paymentTypeDescription) && paymentMethod.equals(other.paymentMethod) && paymentMethodDescription.equals(other.paymentMethodDescription) && usage.equals(other.usage) && version.equals(other.version) && placeOfIssue.equals(other.placeOfIssue) && invoiceDetails.equals(other.invoiceDetails) && currency.equals(other.currency) && subtotalAmount.equals(other.subtotalAmount) && exchangeRate.equals(other.exchangeRate) && taxAmount.equals(other.taxAmount) && discountAmount.equals(other.discountAmount) && totalAmount.equals(other.totalAmount) && payments.equals(other.payments) && payroll.equals(other.payroll) && folio.equals(other.folio) && xml.equals(other.xml) && warnings.equals(other.warnings) && senderBlacklistStatus.equals(other.senderBlacklistStatus) && receiverBlacklistStatus.equals(other.receiverBlacklistStatus);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.id, this.link, this.collectedAt, this.createdAt, this.invoiceIdentification, this.invoiceDate, this.status, this.invoiceType, this.type, this.senderId, this.senderName, this.senderTaxFraudStatus, this.receiverId, this.receiverName, this.receiverTaxFraudStatus, this.cancelationStatus, this.cancelationUpdateDate, this.certificationDate, this.certificationAuthority, this.paymentType, this.paymentTypeDescription, this.paymentMethod, this.paymentMethodDescription, this.usage, this.version, this.placeOfIssue, this.invoiceDetails, this.currency, this.subtotalAmount, this.exchangeRate, this.taxAmount, this.discountAmount, this.totalAmount, this.payments, this.payroll, this.folio, this.xml, this.warnings, this.senderBlacklistStatus, this.receiverBlacklistStatus);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "InvoiceWithIdSat{" + "id: " + id + ", link: " + link + ", collectedAt: " + collectedAt + ", createdAt: " + createdAt + ", invoiceIdentification: " + invoiceIdentification + ", invoiceDate: " + invoiceDate + ", status: " + status + ", invoiceType: " + invoiceType + ", type: " + type + ", senderId: " + senderId + ", senderName: " + senderName + ", senderTaxFraudStatus: " + senderTaxFraudStatus + ", receiverId: " + receiverId + ", receiverName: " + receiverName + ", receiverTaxFraudStatus: " + receiverTaxFraudStatus + ", cancelationStatus: " + cancelationStatus + ", cancelationUpdateDate: " + cancelationUpdateDate + ", certificationDate: " + certificationDate + ", certificationAuthority: " + certificationAuthority + ", paymentType: " + paymentType + ", paymentTypeDescription: " + paymentTypeDescription + ", paymentMethod: " + paymentMethod + ", paymentMethodDescription: " + paymentMethodDescription + ", usage: " + usage + ", version: " + version + ", placeOfIssue: " + placeOfIssue + ", invoiceDetails: " + invoiceDetails + ", currency: " + currency + ", subtotalAmount: " + subtotalAmount + ", exchangeRate: " + exchangeRate + ", taxAmount: " + taxAmount + ", discountAmount: " + discountAmount + ", totalAmount: " + totalAmount + ", payments: " + payments + ", payroll: " + payroll + ", folio: " + folio + ", xml: " + xml + ", warnings: " + warnings + ", senderBlacklistStatus: " + senderBlacklistStatus + ", receiverBlacklistStatus: " + receiverBlacklistStatus + "}";
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

    private Optional<String> invoiceDate = Optional.empty();

    private Optional<String> status = Optional.empty();

    private Optional<EnumInvoiceSatInvoiceType> invoiceType = Optional.empty();

    private Optional<String> type = Optional.empty();

    private Optional<String> senderId = Optional.empty();

    private Optional<String> senderName = Optional.empty();

    private Optional<String> senderTaxFraudStatus = Optional.empty();

    private Optional<String> receiverId = Optional.empty();

    private Optional<String> receiverName = Optional.empty();

    private Optional<String> receiverTaxFraudStatus = Optional.empty();

    private Optional<String> cancelationStatus = Optional.empty();

    private Optional<String> cancelationUpdateDate = Optional.empty();

    private Optional<String> certificationDate = Optional.empty();

    private Optional<String> certificationAuthority = Optional.empty();

    private Optional<String> paymentType = Optional.empty();

    private Optional<String> paymentTypeDescription = Optional.empty();

    private Optional<String> paymentMethod = Optional.empty();

    private Optional<String> paymentMethodDescription = Optional.empty();

    private Optional<String> usage = Optional.empty();

    private Optional<String> version = Optional.empty();

    private Optional<String> placeOfIssue = Optional.empty();

    private List<InvoiceDetailSat> invoiceDetails = new ArrayList<>();

    private Optional<String> currency = Optional.empty();

    private Optional<Double> subtotalAmount = Optional.empty();

    private Optional<Double> exchangeRate = Optional.empty();

    private Optional<Double> taxAmount = Optional.empty();

    private Optional<Double> discountAmount = Optional.empty();

    private Optional<Double> totalAmount = Optional.empty();

    private List<InvoicesPaymentsSat> payments = new ArrayList<>();

    private Optional<InvoicesPayrollSat> payroll = Optional.empty();

    private Optional<String> folio = Optional.empty();

    private Optional<String> xml = Optional.empty();

    private Optional<InvoiceWarningsSat> warnings = Optional.empty();

    private Optional<String> senderBlacklistStatus = Optional.empty();

    private Optional<String> receiverBlacklistStatus = Optional.empty();

    private Builder() {
    }

    public Builder from(InvoiceWithIdSat other) {
      id(other.getId());
      link(other.getLink());
      collectedAt(other.getCollectedAt());
      createdAt(other.getCreatedAt());
      invoiceIdentification(other.getInvoiceIdentification());
      invoiceDate(other.getInvoiceDate());
      status(other.getStatus());
      invoiceType(other.getInvoiceType());
      type(other.getType());
      senderId(other.getSenderId());
      senderName(other.getSenderName());
      senderTaxFraudStatus(other.getSenderTaxFraudStatus());
      receiverId(other.getReceiverId());
      receiverName(other.getReceiverName());
      receiverTaxFraudStatus(other.getReceiverTaxFraudStatus());
      cancelationStatus(other.getCancelationStatus());
      cancelationUpdateDate(other.getCancelationUpdateDate());
      certificationDate(other.getCertificationDate());
      certificationAuthority(other.getCertificationAuthority());
      paymentType(other.getPaymentType());
      paymentTypeDescription(other.getPaymentTypeDescription());
      paymentMethod(other.getPaymentMethod());
      paymentMethodDescription(other.getPaymentMethodDescription());
      usage(other.getUsage());
      version(other.getVersion());
      placeOfIssue(other.getPlaceOfIssue());
      invoiceDetails(other.getInvoiceDetails());
      currency(other.getCurrency());
      subtotalAmount(other.getSubtotalAmount());
      exchangeRate(other.getExchangeRate());
      taxAmount(other.getTaxAmount());
      discountAmount(other.getDiscountAmount());
      totalAmount(other.getTotalAmount());
      payments(other.getPayments());
      payroll(other.getPayroll());
      folio(other.getFolio());
      xml(other.getXml());
      warnings(other.getWarnings());
      senderBlacklistStatus(other.getSenderBlacklistStatus());
      receiverBlacklistStatus(other.getReceiverBlacklistStatus());
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
        value = "invoice_type",
        nulls = Nulls.SKIP
    )
    public Builder invoiceType(Optional<EnumInvoiceSatInvoiceType> invoiceType) {
      this.invoiceType = invoiceType;
      return this;
    }

    public Builder invoiceType(EnumInvoiceSatInvoiceType invoiceType) {
      this.invoiceType = Optional.of(invoiceType);
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
        value = "sender_tax_fraud_status",
        nulls = Nulls.SKIP
    )
    public Builder senderTaxFraudStatus(Optional<String> senderTaxFraudStatus) {
      this.senderTaxFraudStatus = senderTaxFraudStatus;
      return this;
    }

    public Builder senderTaxFraudStatus(String senderTaxFraudStatus) {
      this.senderTaxFraudStatus = Optional.of(senderTaxFraudStatus);
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
        value = "receiver_tax_fraud_status",
        nulls = Nulls.SKIP
    )
    public Builder receiverTaxFraudStatus(Optional<String> receiverTaxFraudStatus) {
      this.receiverTaxFraudStatus = receiverTaxFraudStatus;
      return this;
    }

    public Builder receiverTaxFraudStatus(String receiverTaxFraudStatus) {
      this.receiverTaxFraudStatus = Optional.of(receiverTaxFraudStatus);
      return this;
    }

    @JsonSetter(
        value = "cancelation_status",
        nulls = Nulls.SKIP
    )
    public Builder cancelationStatus(Optional<String> cancelationStatus) {
      this.cancelationStatus = cancelationStatus;
      return this;
    }

    public Builder cancelationStatus(String cancelationStatus) {
      this.cancelationStatus = Optional.of(cancelationStatus);
      return this;
    }

    @JsonSetter(
        value = "cancelation_update_date",
        nulls = Nulls.SKIP
    )
    public Builder cancelationUpdateDate(Optional<String> cancelationUpdateDate) {
      this.cancelationUpdateDate = cancelationUpdateDate;
      return this;
    }

    public Builder cancelationUpdateDate(String cancelationUpdateDate) {
      this.cancelationUpdateDate = Optional.of(cancelationUpdateDate);
      return this;
    }

    @JsonSetter(
        value = "certification_date",
        nulls = Nulls.SKIP
    )
    public Builder certificationDate(Optional<String> certificationDate) {
      this.certificationDate = certificationDate;
      return this;
    }

    public Builder certificationDate(String certificationDate) {
      this.certificationDate = Optional.of(certificationDate);
      return this;
    }

    @JsonSetter(
        value = "certification_authority",
        nulls = Nulls.SKIP
    )
    public Builder certificationAuthority(Optional<String> certificationAuthority) {
      this.certificationAuthority = certificationAuthority;
      return this;
    }

    public Builder certificationAuthority(String certificationAuthority) {
      this.certificationAuthority = Optional.of(certificationAuthority);
      return this;
    }

    @JsonSetter(
        value = "payment_type",
        nulls = Nulls.SKIP
    )
    public Builder paymentType(Optional<String> paymentType) {
      this.paymentType = paymentType;
      return this;
    }

    public Builder paymentType(String paymentType) {
      this.paymentType = Optional.of(paymentType);
      return this;
    }

    @JsonSetter(
        value = "payment_type_description",
        nulls = Nulls.SKIP
    )
    public Builder paymentTypeDescription(Optional<String> paymentTypeDescription) {
      this.paymentTypeDescription = paymentTypeDescription;
      return this;
    }

    public Builder paymentTypeDescription(String paymentTypeDescription) {
      this.paymentTypeDescription = Optional.of(paymentTypeDescription);
      return this;
    }

    @JsonSetter(
        value = "payment_method",
        nulls = Nulls.SKIP
    )
    public Builder paymentMethod(Optional<String> paymentMethod) {
      this.paymentMethod = paymentMethod;
      return this;
    }

    public Builder paymentMethod(String paymentMethod) {
      this.paymentMethod = Optional.of(paymentMethod);
      return this;
    }

    @JsonSetter(
        value = "payment_method_description",
        nulls = Nulls.SKIP
    )
    public Builder paymentMethodDescription(Optional<String> paymentMethodDescription) {
      this.paymentMethodDescription = paymentMethodDescription;
      return this;
    }

    public Builder paymentMethodDescription(String paymentMethodDescription) {
      this.paymentMethodDescription = Optional.of(paymentMethodDescription);
      return this;
    }

    @JsonSetter(
        value = "usage",
        nulls = Nulls.SKIP
    )
    public Builder usage(Optional<String> usage) {
      this.usage = usage;
      return this;
    }

    public Builder usage(String usage) {
      this.usage = Optional.of(usage);
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
        value = "place_of_issue",
        nulls = Nulls.SKIP
    )
    public Builder placeOfIssue(Optional<String> placeOfIssue) {
      this.placeOfIssue = placeOfIssue;
      return this;
    }

    public Builder placeOfIssue(String placeOfIssue) {
      this.placeOfIssue = Optional.of(placeOfIssue);
      return this;
    }

    @JsonSetter(
        value = "invoice_details",
        nulls = Nulls.SKIP
    )
    public Builder invoiceDetails(List<InvoiceDetailSat> invoiceDetails) {
      this.invoiceDetails.clear();
      this.invoiceDetails.addAll(invoiceDetails);
      return this;
    }

    public Builder addInvoiceDetails(InvoiceDetailSat invoiceDetails) {
      this.invoiceDetails.add(invoiceDetails);
      return this;
    }

    public Builder addAllInvoiceDetails(List<InvoiceDetailSat> invoiceDetails) {
      this.invoiceDetails.addAll(invoiceDetails);
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
        value = "subtotal_amount",
        nulls = Nulls.SKIP
    )
    public Builder subtotalAmount(Optional<Double> subtotalAmount) {
      this.subtotalAmount = subtotalAmount;
      return this;
    }

    public Builder subtotalAmount(Double subtotalAmount) {
      this.subtotalAmount = Optional.of(subtotalAmount);
      return this;
    }

    @JsonSetter(
        value = "exchange_rate",
        nulls = Nulls.SKIP
    )
    public Builder exchangeRate(Optional<Double> exchangeRate) {
      this.exchangeRate = exchangeRate;
      return this;
    }

    public Builder exchangeRate(Double exchangeRate) {
      this.exchangeRate = Optional.of(exchangeRate);
      return this;
    }

    @JsonSetter(
        value = "tax_amount",
        nulls = Nulls.SKIP
    )
    public Builder taxAmount(Optional<Double> taxAmount) {
      this.taxAmount = taxAmount;
      return this;
    }

    public Builder taxAmount(Double taxAmount) {
      this.taxAmount = Optional.of(taxAmount);
      return this;
    }

    @JsonSetter(
        value = "discount_amount",
        nulls = Nulls.SKIP
    )
    public Builder discountAmount(Optional<Double> discountAmount) {
      this.discountAmount = discountAmount;
      return this;
    }

    public Builder discountAmount(Double discountAmount) {
      this.discountAmount = Optional.of(discountAmount);
      return this;
    }

    @JsonSetter(
        value = "total_amount",
        nulls = Nulls.SKIP
    )
    public Builder totalAmount(Optional<Double> totalAmount) {
      this.totalAmount = totalAmount;
      return this;
    }

    public Builder totalAmount(Double totalAmount) {
      this.totalAmount = Optional.of(totalAmount);
      return this;
    }

    @JsonSetter(
        value = "payments",
        nulls = Nulls.SKIP
    )
    public Builder payments(List<InvoicesPaymentsSat> payments) {
      this.payments.clear();
      this.payments.addAll(payments);
      return this;
    }

    public Builder addPayments(InvoicesPaymentsSat payments) {
      this.payments.add(payments);
      return this;
    }

    public Builder addAllPayments(List<InvoicesPaymentsSat> payments) {
      this.payments.addAll(payments);
      return this;
    }

    @JsonSetter(
        value = "payroll",
        nulls = Nulls.SKIP
    )
    public Builder payroll(Optional<InvoicesPayrollSat> payroll) {
      this.payroll = payroll;
      return this;
    }

    public Builder payroll(InvoicesPayrollSat payroll) {
      this.payroll = Optional.of(payroll);
      return this;
    }

    @JsonSetter(
        value = "folio",
        nulls = Nulls.SKIP
    )
    public Builder folio(Optional<String> folio) {
      this.folio = folio;
      return this;
    }

    public Builder folio(String folio) {
      this.folio = Optional.of(folio);
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

    @JsonSetter(
        value = "warnings",
        nulls = Nulls.SKIP
    )
    public Builder warnings(Optional<InvoiceWarningsSat> warnings) {
      this.warnings = warnings;
      return this;
    }

    public Builder warnings(InvoiceWarningsSat warnings) {
      this.warnings = Optional.of(warnings);
      return this;
    }

    @JsonSetter(
        value = "sender_blacklist_status",
        nulls = Nulls.SKIP
    )
    public Builder senderBlacklistStatus(Optional<String> senderBlacklistStatus) {
      this.senderBlacklistStatus = senderBlacklistStatus;
      return this;
    }

    public Builder senderBlacklistStatus(String senderBlacklistStatus) {
      this.senderBlacklistStatus = Optional.of(senderBlacklistStatus);
      return this;
    }

    @JsonSetter(
        value = "receiver_blacklist_status",
        nulls = Nulls.SKIP
    )
    public Builder receiverBlacklistStatus(Optional<String> receiverBlacklistStatus) {
      this.receiverBlacklistStatus = receiverBlacklistStatus;
      return this;
    }

    public Builder receiverBlacklistStatus(String receiverBlacklistStatus) {
      this.receiverBlacklistStatus = Optional.of(receiverBlacklistStatus);
      return this;
    }

    public InvoiceWithIdSat build() {
      return new InvoiceWithIdSat(id, link, collectedAt, createdAt, invoiceIdentification, invoiceDate, status, invoiceType, type, senderId, senderName, senderTaxFraudStatus, receiverId, receiverName, receiverTaxFraudStatus, cancelationStatus, cancelationUpdateDate, certificationDate, certificationAuthority, paymentType, paymentTypeDescription, paymentMethod, paymentMethodDescription, usage, version, placeOfIssue, invoiceDetails, currency, subtotalAmount, exchangeRate, taxAmount, discountAmount, totalAmount, payments, payroll, folio, xml, warnings, senderBlacklistStatus, receiverBlacklistStatus);
    }
  }
}
