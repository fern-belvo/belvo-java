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

  private final EnumInvoiceSatInvoiceType invoiceType;

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

  private final InvoicesPayrollSat payroll;

  private final Optional<String> folio;

  private final Optional<String> xml;

  private final Optional<InvoiceWarningsSat> warnings;

  private final Optional<String> senderBlacklistStatus;

  private final Optional<String> receiverBlacklistStatus;

  private int _cachedHashCode;

  InvoiceWithIdSat(Optional<String> id, Optional<String> link, Optional<String> collectedAt,
      Optional<String> createdAt, Optional<String> invoiceIdentification,
      Optional<String> invoiceDate, Optional<String> status, EnumInvoiceSatInvoiceType invoiceType,
      Optional<String> type, Optional<String> senderId, Optional<String> senderName,
      Optional<String> senderTaxFraudStatus, Optional<String> receiverId,
      Optional<String> receiverName, Optional<String> receiverTaxFraudStatus,
      Optional<String> cancelationStatus, Optional<String> cancelationUpdateDate,
      Optional<String> certificationDate, Optional<String> certificationAuthority,
      Optional<String> paymentType, Optional<String> paymentTypeDescription,
      Optional<String> paymentMethod, Optional<String> paymentMethodDescription,
      Optional<String> usage, Optional<String> version, Optional<String> placeOfIssue,
      List<InvoiceDetailSat> invoiceDetails, Optional<String> currency,
      Optional<Double> subtotalAmount, Optional<Double> exchangeRate, Optional<Double> taxAmount,
      Optional<Double> discountAmount, Optional<Double> totalAmount,
      List<InvoicesPaymentsSat> payments, InvoicesPayrollSat payroll, Optional<String> folio,
      Optional<String> xml, Optional<InvoiceWarningsSat> warnings,
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
  public EnumInvoiceSatInvoiceType getInvoiceType() {
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
  public InvoicesPayrollSat getPayroll() {
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

  public static InvoiceTypeStage builder() {
    return new Builder();
  }

  public interface InvoiceTypeStage {
    PayrollStage invoiceType(EnumInvoiceSatInvoiceType invoiceType);

    Builder from(InvoiceWithIdSat other);
  }

  public interface PayrollStage {
    _FinalStage payroll(InvoicesPayrollSat payroll);
  }

  public interface _FinalStage {
    InvoiceWithIdSat build();

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

    _FinalStage invoiceDate(Optional<String> invoiceDate);

    _FinalStage invoiceDate(String invoiceDate);

    _FinalStage status(Optional<String> status);

    _FinalStage status(String status);

    _FinalStage type(Optional<String> type);

    _FinalStage type(String type);

    _FinalStage senderId(Optional<String> senderId);

    _FinalStage senderId(String senderId);

    _FinalStage senderName(Optional<String> senderName);

    _FinalStage senderName(String senderName);

    _FinalStage senderTaxFraudStatus(Optional<String> senderTaxFraudStatus);

    _FinalStage senderTaxFraudStatus(String senderTaxFraudStatus);

    _FinalStage receiverId(Optional<String> receiverId);

    _FinalStage receiverId(String receiverId);

    _FinalStage receiverName(Optional<String> receiverName);

    _FinalStage receiverName(String receiverName);

    _FinalStage receiverTaxFraudStatus(Optional<String> receiverTaxFraudStatus);

    _FinalStage receiverTaxFraudStatus(String receiverTaxFraudStatus);

    _FinalStage cancelationStatus(Optional<String> cancelationStatus);

    _FinalStage cancelationStatus(String cancelationStatus);

    _FinalStage cancelationUpdateDate(Optional<String> cancelationUpdateDate);

    _FinalStage cancelationUpdateDate(String cancelationUpdateDate);

    _FinalStage certificationDate(Optional<String> certificationDate);

    _FinalStage certificationDate(String certificationDate);

    _FinalStage certificationAuthority(Optional<String> certificationAuthority);

    _FinalStage certificationAuthority(String certificationAuthority);

    _FinalStage paymentType(Optional<String> paymentType);

    _FinalStage paymentType(String paymentType);

    _FinalStage paymentTypeDescription(Optional<String> paymentTypeDescription);

    _FinalStage paymentTypeDescription(String paymentTypeDescription);

    _FinalStage paymentMethod(Optional<String> paymentMethod);

    _FinalStage paymentMethod(String paymentMethod);

    _FinalStage paymentMethodDescription(Optional<String> paymentMethodDescription);

    _FinalStage paymentMethodDescription(String paymentMethodDescription);

    _FinalStage usage(Optional<String> usage);

    _FinalStage usage(String usage);

    _FinalStage version(Optional<String> version);

    _FinalStage version(String version);

    _FinalStage placeOfIssue(Optional<String> placeOfIssue);

    _FinalStage placeOfIssue(String placeOfIssue);

    _FinalStage invoiceDetails(List<InvoiceDetailSat> invoiceDetails);

    _FinalStage addInvoiceDetails(InvoiceDetailSat invoiceDetails);

    _FinalStage addAllInvoiceDetails(List<InvoiceDetailSat> invoiceDetails);

    _FinalStage currency(Optional<String> currency);

    _FinalStage currency(String currency);

    _FinalStage subtotalAmount(Optional<Double> subtotalAmount);

    _FinalStage subtotalAmount(Double subtotalAmount);

    _FinalStage exchangeRate(Optional<Double> exchangeRate);

    _FinalStage exchangeRate(Double exchangeRate);

    _FinalStage taxAmount(Optional<Double> taxAmount);

    _FinalStage taxAmount(Double taxAmount);

    _FinalStage discountAmount(Optional<Double> discountAmount);

    _FinalStage discountAmount(Double discountAmount);

    _FinalStage totalAmount(Optional<Double> totalAmount);

    _FinalStage totalAmount(Double totalAmount);

    _FinalStage payments(List<InvoicesPaymentsSat> payments);

    _FinalStage addPayments(InvoicesPaymentsSat payments);

    _FinalStage addAllPayments(List<InvoicesPaymentsSat> payments);

    _FinalStage folio(Optional<String> folio);

    _FinalStage folio(String folio);

    _FinalStage xml(Optional<String> xml);

    _FinalStage xml(String xml);

    _FinalStage warnings(Optional<InvoiceWarningsSat> warnings);

    _FinalStage warnings(InvoiceWarningsSat warnings);

    _FinalStage senderBlacklistStatus(Optional<String> senderBlacklistStatus);

    _FinalStage senderBlacklistStatus(String senderBlacklistStatus);

    _FinalStage receiverBlacklistStatus(Optional<String> receiverBlacklistStatus);

    _FinalStage receiverBlacklistStatus(String receiverBlacklistStatus);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements InvoiceTypeStage, PayrollStage, _FinalStage {
    private EnumInvoiceSatInvoiceType invoiceType;

    private InvoicesPayrollSat payroll;

    private Optional<String> receiverBlacklistStatus = Optional.empty();

    private Optional<String> senderBlacklistStatus = Optional.empty();

    private Optional<InvoiceWarningsSat> warnings = Optional.empty();

    private Optional<String> xml = Optional.empty();

    private Optional<String> folio = Optional.empty();

    private List<InvoicesPaymentsSat> payments = new ArrayList<>();

    private Optional<Double> totalAmount = Optional.empty();

    private Optional<Double> discountAmount = Optional.empty();

    private Optional<Double> taxAmount = Optional.empty();

    private Optional<Double> exchangeRate = Optional.empty();

    private Optional<Double> subtotalAmount = Optional.empty();

    private Optional<String> currency = Optional.empty();

    private List<InvoiceDetailSat> invoiceDetails = new ArrayList<>();

    private Optional<String> placeOfIssue = Optional.empty();

    private Optional<String> version = Optional.empty();

    private Optional<String> usage = Optional.empty();

    private Optional<String> paymentMethodDescription = Optional.empty();

    private Optional<String> paymentMethod = Optional.empty();

    private Optional<String> paymentTypeDescription = Optional.empty();

    private Optional<String> paymentType = Optional.empty();

    private Optional<String> certificationAuthority = Optional.empty();

    private Optional<String> certificationDate = Optional.empty();

    private Optional<String> cancelationUpdateDate = Optional.empty();

    private Optional<String> cancelationStatus = Optional.empty();

    private Optional<String> receiverTaxFraudStatus = Optional.empty();

    private Optional<String> receiverName = Optional.empty();

    private Optional<String> receiverId = Optional.empty();

    private Optional<String> senderTaxFraudStatus = Optional.empty();

    private Optional<String> senderName = Optional.empty();

    private Optional<String> senderId = Optional.empty();

    private Optional<String> type = Optional.empty();

    private Optional<String> status = Optional.empty();

    private Optional<String> invoiceDate = Optional.empty();

    private Optional<String> invoiceIdentification = Optional.empty();

    private Optional<String> createdAt = Optional.empty();

    private Optional<String> collectedAt = Optional.empty();

    private Optional<String> link = Optional.empty();

    private Optional<String> id = Optional.empty();

    private Builder() {
    }

    @Override
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

    @Override
    @JsonSetter("invoice_type")
    public PayrollStage invoiceType(EnumInvoiceSatInvoiceType invoiceType) {
      this.invoiceType = invoiceType;
      return this;
    }

    @Override
    @JsonSetter("payroll")
    public _FinalStage payroll(InvoicesPayrollSat payroll) {
      this.payroll = payroll;
      return this;
    }

    /**
     * <p>This field has been deprecated. Please use <code>receiver_tax_fraud_status</code> instead.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage receiverBlacklistStatus(String receiverBlacklistStatus) {
      this.receiverBlacklistStatus = Optional.of(receiverBlacklistStatus);
      return this;
    }

    @Override
    @JsonSetter(
        value = "receiver_blacklist_status",
        nulls = Nulls.SKIP
    )
    public _FinalStage receiverBlacklistStatus(Optional<String> receiverBlacklistStatus) {
      this.receiverBlacklistStatus = receiverBlacklistStatus;
      return this;
    }

    /**
     * <p>This field has been deprecated. Please use <code>sender_tax_fraud_status</code> instead.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage senderBlacklistStatus(String senderBlacklistStatus) {
      this.senderBlacklistStatus = Optional.of(senderBlacklistStatus);
      return this;
    }

    @Override
    @JsonSetter(
        value = "sender_blacklist_status",
        nulls = Nulls.SKIP
    )
    public _FinalStage senderBlacklistStatus(Optional<String> senderBlacklistStatus) {
      this.senderBlacklistStatus = senderBlacklistStatus;
      return this;
    }

    @Override
    public _FinalStage warnings(InvoiceWarningsSat warnings) {
      this.warnings = Optional.of(warnings);
      return this;
    }

    @Override
    @JsonSetter(
        value = "warnings",
        nulls = Nulls.SKIP
    )
    public _FinalStage warnings(Optional<InvoiceWarningsSat> warnings) {
      this.warnings = warnings;
      return this;
    }

    /**
     * <p>XML of the invoice document.</p>
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
     * <p>The internal control number that the taxpayer assigns to the invoice.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage folio(String folio) {
      this.folio = Optional.of(folio);
      return this;
    }

    @Override
    @JsonSetter(
        value = "folio",
        nulls = Nulls.SKIP
    )
    public _FinalStage folio(Optional<String> folio) {
      this.folio = folio;
      return this;
    }

    /**
     * <p>A list detailing all the invoice payments.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage addAllPayments(List<InvoicesPaymentsSat> payments) {
      this.payments.addAll(payments);
      return this;
    }

    /**
     * <p>A list detailing all the invoice payments.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage addPayments(InvoicesPaymentsSat payments) {
      this.payments.add(payments);
      return this;
    }

    @Override
    @JsonSetter(
        value = "payments",
        nulls = Nulls.SKIP
    )
    public _FinalStage payments(List<InvoicesPaymentsSat> payments) {
      this.payments.clear();
      this.payments.addAll(payments);
      return this;
    }

    /**
     * <p>The total amount of the invoice (<code>subtotal_amount</code> + <code>tax_amount</code> - <code>discount_amount</code>)</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage totalAmount(Double totalAmount) {
      this.totalAmount = Optional.of(totalAmount);
      return this;
    }

    @Override
    @JsonSetter(
        value = "total_amount",
        nulls = Nulls.SKIP
    )
    public _FinalStage totalAmount(Optional<Double> totalAmount) {
      this.totalAmount = totalAmount;
      return this;
    }

    /**
     * <p>The total amount discounted in this invoice.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage discountAmount(Double discountAmount) {
      this.discountAmount = Optional.of(discountAmount);
      return this;
    }

    @Override
    @JsonSetter(
        value = "discount_amount",
        nulls = Nulls.SKIP
    )
    public _FinalStage discountAmount(Optional<Double> discountAmount) {
      this.discountAmount = discountAmount;
      return this;
    }

    /**
     * <p>The amount of tax for this invoice (sum of each item's <code>tax_amount</code>).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage taxAmount(Double taxAmount) {
      this.taxAmount = Optional.of(taxAmount);
      return this;
    }

    @Override
    @JsonSetter(
        value = "tax_amount",
        nulls = Nulls.SKIP
    )
    public _FinalStage taxAmount(Optional<Double> taxAmount) {
      this.taxAmount = taxAmount;
      return this;
    }

    /**
     * <p>The exchange rate used in this invoice for the currency.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage exchangeRate(Double exchangeRate) {
      this.exchangeRate = Optional.of(exchangeRate);
      return this;
    }

    @Override
    @JsonSetter(
        value = "exchange_rate",
        nulls = Nulls.SKIP
    )
    public _FinalStage exchangeRate(Optional<Double> exchangeRate) {
      this.exchangeRate = exchangeRate;
      return this;
    }

    /**
     * <p>The pretax amount of this invoice (sum of each item's <code>pre_tax_amount</code>).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage subtotalAmount(Double subtotalAmount) {
      this.subtotalAmount = Optional.of(subtotalAmount);
      return this;
    }

    @Override
    @JsonSetter(
        value = "subtotal_amount",
        nulls = Nulls.SKIP
    )
    public _FinalStage subtotalAmount(Optional<Double> subtotalAmount) {
      this.subtotalAmount = subtotalAmount;
      return this;
    }

    /**
     * <p>The currency of the invoice. For example:</p>
     * <ul>
     * <li>🇧🇷 BRL (Brazilian Real)</li>
     * <li>🇨🇴 COP (Colombian Peso)</li>
     * <li>🇲🇽 MXN (Mexican Peso)</li>
     * <li>🇺🇸 USD (United States Dollar)</li>
     * </ul>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage currency(String currency) {
      this.currency = Optional.of(currency);
      return this;
    }

    @Override
    @JsonSetter(
        value = "currency",
        nulls = Nulls.SKIP
    )
    public _FinalStage currency(Optional<String> currency) {
      this.currency = currency;
      return this;
    }

    /**
     * <p>A list of descriptions for each item (purchased product or service provided) in the invoice.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage addAllInvoiceDetails(List<InvoiceDetailSat> invoiceDetails) {
      this.invoiceDetails.addAll(invoiceDetails);
      return this;
    }

    /**
     * <p>A list of descriptions for each item (purchased product or service provided) in the invoice.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage addInvoiceDetails(InvoiceDetailSat invoiceDetails) {
      this.invoiceDetails.add(invoiceDetails);
      return this;
    }

    @Override
    @JsonSetter(
        value = "invoice_details",
        nulls = Nulls.SKIP
    )
    public _FinalStage invoiceDetails(List<InvoiceDetailSat> invoiceDetails) {
      this.invoiceDetails.clear();
      this.invoiceDetails.addAll(invoiceDetails);
      return this;
    }

    /**
     * <p>The postcode of where the invoice was issued.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage placeOfIssue(String placeOfIssue) {
      this.placeOfIssue = Optional.of(placeOfIssue);
      return this;
    }

    @Override
    @JsonSetter(
        value = "place_of_issue",
        nulls = Nulls.SKIP
    )
    public _FinalStage placeOfIssue(Optional<String> placeOfIssue) {
      this.placeOfIssue = placeOfIssue;
      return this;
    }

    /**
     * <p>The CFDI version of the invoice.</p>
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
     * <p>The invoice's usage code, as defined by the legal entity of the country.</p>
     * <ul>
     * <li>🇲🇽 Mexico <a href="https://developers.belvo.com/docs/sat-catalogs#usage">SAT catalog reference article</a></li>
     * </ul>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage usage(String usage) {
      this.usage = Optional.of(usage);
      return this;
    }

    @Override
    @JsonSetter(
        value = "usage",
        nulls = Nulls.SKIP
    )
    public _FinalStage usage(Optional<String> usage) {
      this.usage = usage;
      return this;
    }

    /**
     * <p><em>This field has been deprecated.</em></p>
     * <p><em>The description of the payment method used for this invoice.</em></p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage paymentMethodDescription(String paymentMethodDescription) {
      this.paymentMethodDescription = Optional.of(paymentMethodDescription);
      return this;
    }

    @Override
    @JsonSetter(
        value = "payment_method_description",
        nulls = Nulls.SKIP
    )
    public _FinalStage paymentMethodDescription(Optional<String> paymentMethodDescription) {
      this.paymentMethodDescription = paymentMethodDescription;
      return this;
    }

    @Override
    public _FinalStage paymentMethod(String paymentMethod) {
      this.paymentMethod = Optional.of(paymentMethod);
      return this;
    }

    @Override
    @JsonSetter(
        value = "payment_method",
        nulls = Nulls.SKIP
    )
    public _FinalStage paymentMethod(Optional<String> paymentMethod) {
      this.paymentMethod = paymentMethod;
      return this;
    }

    /**
     * <p><em>This field has been deprecated.</em></p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage paymentTypeDescription(String paymentTypeDescription) {
      this.paymentTypeDescription = Optional.of(paymentTypeDescription);
      return this;
    }

    @Override
    @JsonSetter(
        value = "payment_type_description",
        nulls = Nulls.SKIP
    )
    public _FinalStage paymentTypeDescription(Optional<String> paymentTypeDescription) {
      this.paymentTypeDescription = paymentTypeDescription;
      return this;
    }

    /**
     * <p>The payment type code used for this invoice, as defined by the country legal entity.</p>
     * <ul>
     * <li>🇲🇽 Mexico <a href="https://developers.belvo.com/docs/sat-catalogs#payment-type">SAT catalog reference article</a></li>
     * </ul>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage paymentType(String paymentType) {
      this.paymentType = Optional.of(paymentType);
      return this;
    }

    @Override
    @JsonSetter(
        value = "payment_type",
        nulls = Nulls.SKIP
    )
    public _FinalStage paymentType(Optional<String> paymentType) {
      this.paymentType = paymentType;
      return this;
    }

    /**
     * <p>The fiscal ID of the certification provider.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage certificationAuthority(String certificationAuthority) {
      this.certificationAuthority = Optional.of(certificationAuthority);
      return this;
    }

    @Override
    @JsonSetter(
        value = "certification_authority",
        nulls = Nulls.SKIP
    )
    public _FinalStage certificationAuthority(Optional<String> certificationAuthority) {
      this.certificationAuthority = certificationAuthority;
      return this;
    }

    /**
     * <p>The date of the fiscal certification.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage certificationDate(String certificationDate) {
      this.certificationDate = Optional.of(certificationDate);
      return this;
    }

    @Override
    @JsonSetter(
        value = "certification_date",
        nulls = Nulls.SKIP
    )
    public _FinalStage certificationDate(Optional<String> certificationDate) {
      this.certificationDate = certificationDate;
      return this;
    }

    /**
     * <p>The date of the invoice cancelation.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage cancelationUpdateDate(String cancelationUpdateDate) {
      this.cancelationUpdateDate = Optional.of(cancelationUpdateDate);
      return this;
    }

    @Override
    @JsonSetter(
        value = "cancelation_update_date",
        nulls = Nulls.SKIP
    )
    public _FinalStage cancelationUpdateDate(Optional<String> cancelationUpdateDate) {
      this.cancelationUpdateDate = cancelationUpdateDate;
      return this;
    }

    /**
     * <p>If the invoice is cancelled, this field indicates the status of the cancellation.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage cancelationStatus(String cancelationStatus) {
      this.cancelationStatus = Optional.of(cancelationStatus);
      return this;
    }

    @Override
    @JsonSetter(
        value = "cancelation_status",
        nulls = Nulls.SKIP
    )
    public _FinalStage cancelationStatus(Optional<String> cancelationStatus) {
      this.cancelationStatus = cancelationStatus;
      return this;
    }

    /**
     * <p>Indicates whether or not the receiver is on SAT's tax fraud list for having submitted incorrect data, having outstanding payments, or having conducted business that is in violation of the fiscal institution's regulations.&lt;br&gt;&lt;br&gt;
     * SAT updates the tax fraud list every three months. &lt;br&gt;&lt;br&gt;
     * For more information regarding the reason's a taxpayer can be put on the tax fraud list, please see <a href="http://omawww.sat.gob.mx/cifras_sat/Paginas/datos/vinculo.html?page=ListCompleta69.html">Article 69</a> and <a href="http://omawww.sat.gob.mx/cifras_sat/Paginas/datos/vinculo.html?page=ListCompleta69B.html">Article 69-B</a> of Mexico's Código Fiscal de la Federación. &lt;br&gt;&lt;br&gt;
     * Possible statuses are:</p>
     * <ul>
     * <li><code>INVESTIGATING</code> &lt;br&gt; The fiscal institution has identified irregularities and open an investigation regarding the taxpayer. &lt;br&gt; - <code>DISMISSED</code> &lt;br&gt; The fiscal institution has investigated the taxpayer and declared them innocent. &lt;br&gt; - <code>CONFIRMED</code> &lt;br&gt; The fiscal institution has confirmed that the taxpayer is guilty. &lt;br&gt; - <code>OVERTURNED</code> &lt;br&gt; The fiscal institution has reassessed a previously confirmed taxpayer and, based on new evidence, has taken the taxpayer off the tax fraud list. &lt;br&gt; - <code>NO_TAX_FRAUD_STATUS</code> &lt;br&gt; The receiver or sender is not found in the list (in other words, they are complying with the fiscal institution's regulations).</li>
     * </ul>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage receiverTaxFraudStatus(String receiverTaxFraudStatus) {
      this.receiverTaxFraudStatus = Optional.of(receiverTaxFraudStatus);
      return this;
    }

    @Override
    @JsonSetter(
        value = "receiver_tax_fraud_status",
        nulls = Nulls.SKIP
    )
    public _FinalStage receiverTaxFraudStatus(Optional<String> receiverTaxFraudStatus) {
      this.receiverTaxFraudStatus = receiverTaxFraudStatus;
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
     * <p>Indicates whether or not the sender is on SAT's tax fraud list for having submitted incorrect data, having outstanding payments, or having conducted business that is in violation of the fiscal institution's regulations.&lt;br&gt;&lt;br&gt;
     * SAT updates the tax fraud list every three months. &lt;br&gt;&lt;br&gt;
     * For more information regarding the reason's a taxpayer can be put on the tax fraud list, please see <a href="http://omawww.sat.gob.mx/cifras_sat/Paginas/datos/vinculo.html?page=ListCompleta69.html">Article 69</a> and <a href="http://omawww.sat.gob.mx/cifras_sat/Paginas/datos/vinculo.html?page=ListCompleta69B.html">Article 69-B</a> of Mexico's Código Fiscal de la Federación. &lt;br&gt;&lt;br&gt;
     * Possible statuses are:</p>
     * <ul>
     * <li><code>INVESTIGATING</code> &lt;br&gt; The fiscal institution has identified irregularities and open an investigation regarding the taxpayer. &lt;br&gt; - <code>DISMISSED</code> &lt;br&gt; The fiscal institution has investigated the taxpayer and declared them innocent. &lt;br&gt; - <code>CONFIRMED</code> &lt;br&gt; The fiscal institution has confirmed that the taxpayer is guilty. &lt;br&gt; - <code>OVERTURNED</code> &lt;br&gt; The fiscal institution has reassessed a previously confirmed taxpayer and, based on new evidence, has taken the taxpayer off the tax fraud list. &lt;br&gt; - <code>NO_TAX_FRAUD_STATUS</code> &lt;br&gt; The receiver or sender is not found in the list (in other words, they are complying with the fiscal institution's regulations).</li>
     * </ul>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage senderTaxFraudStatus(String senderTaxFraudStatus) {
      this.senderTaxFraudStatus = Optional.of(senderTaxFraudStatus);
      return this;
    }

    @Override
    @JsonSetter(
        value = "sender_tax_fraud_status",
        nulls = Nulls.SKIP
    )
    public _FinalStage senderTaxFraudStatus(Optional<String> senderTaxFraudStatus) {
      this.senderTaxFraudStatus = senderTaxFraudStatus;
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
     * <p>The fiscal ID of the invoice sender</p>
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

    /**
     * <p>The status of the invoice. Can be either <em>Vigente</em> (valid) or <em>Cancelado</em> (cancelled).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage status(String status) {
      this.status = Optional.of(status);
      return this;
    }

    @Override
    @JsonSetter(
        value = "status",
        nulls = Nulls.SKIP
    )
    public _FinalStage status(Optional<String> status) {
      this.status = status;
      return this;
    }

    /**
     * <p>The date of the invoice.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage invoiceDate(String invoiceDate) {
      this.invoiceDate = Optional.of(invoiceDate);
      return this;
    }

    @Override
    @JsonSetter(
        value = "invoice_date",
        nulls = Nulls.SKIP
    )
    public _FinalStage invoiceDate(Optional<String> invoiceDate) {
      this.invoiceDate = invoiceDate;
      return this;
    }

    /**
     * <p>The fiscal institution's unique ID for the invoice.</p>
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
     * <p>The ISO-8601 timestamp when the data point was collected.</p>
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
     * <p>The <code>link.id</code> the invoice belongs to.</p>
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
     * <p>Belvo's unique identifier used to reference the current invoice.</p>
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
    public InvoiceWithIdSat build() {
      return new InvoiceWithIdSat(id, link, collectedAt, createdAt, invoiceIdentification, invoiceDate, status, invoiceType, type, senderId, senderName, senderTaxFraudStatus, receiverId, receiverName, receiverTaxFraudStatus, cancelationStatus, cancelationUpdateDate, certificationDate, certificationAuthority, paymentType, paymentTypeDescription, paymentMethod, paymentMethodDescription, usage, version, placeOfIssue, invoiceDetails, currency, subtotalAmount, exchangeRate, taxAmount, discountAmount, totalAmount, payments, payroll, folio, xml, warnings, senderBlacklistStatus, receiverBlacklistStatus);
    }
  }
}
