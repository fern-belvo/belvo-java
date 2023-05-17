package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = TaxReturnBusinessMonthly.Builder.class
)
public final class TaxReturnBusinessMonthly {
  private final Optional<String> id;

  private final Optional<String> collectedAt;

  private final Optional<String> createdAt;

  private final Optional<Map<String, Object>> informacionGeneral;

  private final Optional<Map<String, Object>> determinacionIsr;

  private final Optional<Map<String, Object>> detallePagoIsr;

  private final Optional<Map<String, Object>> determinacionIva;

  private final Optional<Map<String, Object>> detallePagoIva;

  private final Optional<String> pdf;

  private final Optional<String> receiptPdf;

  private final Optional<String> type;

  private int _cachedHashCode;

  TaxReturnBusinessMonthly(Optional<String> id, Optional<String> collectedAt,
      Optional<String> createdAt, Optional<Map<String, Object>> informacionGeneral,
      Optional<Map<String, Object>> determinacionIsr, Optional<Map<String, Object>> detallePagoIsr,
      Optional<Map<String, Object>> determinacionIva, Optional<Map<String, Object>> detallePagoIva,
      Optional<String> pdf, Optional<String> receiptPdf, Optional<String> type) {
    this.id = id;
    this.collectedAt = collectedAt;
    this.createdAt = createdAt;
    this.informacionGeneral = informacionGeneral;
    this.determinacionIsr = determinacionIsr;
    this.detallePagoIsr = detallePagoIsr;
    this.determinacionIva = determinacionIva;
    this.detallePagoIva = detallePagoIva;
    this.pdf = pdf;
    this.receiptPdf = receiptPdf;
    this.type = type;
  }

  /**
   * @return Unique identifier created by Belvo used to reference the current Tax Return.
   */
  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
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
   * @return General information regarding the tax return (year, RFC, return type, person/company name, and so on).
   */
  @JsonProperty("informacion_general")
  public Optional<Map<String, Object>> getInformacionGeneral() {
    return informacionGeneral;
  }

  /**
   * @return Information used to calculate the provisional income tax for the period.
   */
  @JsonProperty("determinacion_isr")
  public Optional<Map<String, Object>> getDeterminacionIsr() {
    return determinacionIsr;
  }

  /**
   * @return Information on the monthly provisional payments for the income tax.
   */
  @JsonProperty("detalle_pago_isr")
  public Optional<Map<String, Object>> getDetallePagoIsr() {
    return detallePagoIsr;
  }

  /**
   * @return Information used to calculate the provisional VAT tax for the period.
   */
  @JsonProperty("determinacion_iva")
  public Optional<Map<String, Object>> getDeterminacionIva() {
    return determinacionIva;
  }

  /**
   * @return Information on the monthly provisional payments for the VAT tax.
   */
  @JsonProperty("detalle_pago_iva")
  public Optional<Map<String, Object>> getDetallePagoIva() {
    return detallePagoIva;
  }

  /**
   * @return Tax return PDF as a binary.
   */
  @JsonProperty("pdf")
  public Optional<String> getPdf() {
    return pdf;
  }

  /**
   * @return The acknowledgement receipt from the fiscal institution confirming that they received the tax return.
   */
  @JsonProperty("receipt_pdf")
  public Optional<String> getReceiptPdf() {
    return receiptPdf;
  }

  /**
   * @return The type of tax return. Can be either monthly or annual.
   */
  @JsonProperty("type")
  public Optional<String> getType() {
    return type;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof TaxReturnBusinessMonthly && equalTo((TaxReturnBusinessMonthly) other);
  }

  private boolean equalTo(TaxReturnBusinessMonthly other) {
    return id.equals(other.id) && collectedAt.equals(other.collectedAt) && createdAt.equals(other.createdAt) && informacionGeneral.equals(other.informacionGeneral) && determinacionIsr.equals(other.determinacionIsr) && detallePagoIsr.equals(other.detallePagoIsr) && determinacionIva.equals(other.determinacionIva) && detallePagoIva.equals(other.detallePagoIva) && pdf.equals(other.pdf) && receiptPdf.equals(other.receiptPdf) && type.equals(other.type);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.id, this.collectedAt, this.createdAt, this.informacionGeneral, this.determinacionIsr, this.detallePagoIsr, this.determinacionIva, this.detallePagoIva, this.pdf, this.receiptPdf, this.type);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "TaxReturnBusinessMonthly{" + "id: " + id + ", collectedAt: " + collectedAt + ", createdAt: " + createdAt + ", informacionGeneral: " + informacionGeneral + ", determinacionIsr: " + determinacionIsr + ", detallePagoIsr: " + detallePagoIsr + ", determinacionIva: " + determinacionIva + ", detallePagoIva: " + detallePagoIva + ", pdf: " + pdf + ", receiptPdf: " + receiptPdf + ", type: " + type + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> id = Optional.empty();

    private Optional<String> collectedAt = Optional.empty();

    private Optional<String> createdAt = Optional.empty();

    private Optional<Map<String, Object>> informacionGeneral = Optional.empty();

    private Optional<Map<String, Object>> determinacionIsr = Optional.empty();

    private Optional<Map<String, Object>> detallePagoIsr = Optional.empty();

    private Optional<Map<String, Object>> determinacionIva = Optional.empty();

    private Optional<Map<String, Object>> detallePagoIva = Optional.empty();

    private Optional<String> pdf = Optional.empty();

    private Optional<String> receiptPdf = Optional.empty();

    private Optional<String> type = Optional.empty();

    private Builder() {
    }

    public Builder from(TaxReturnBusinessMonthly other) {
      id(other.getId());
      collectedAt(other.getCollectedAt());
      createdAt(other.getCreatedAt());
      informacionGeneral(other.getInformacionGeneral());
      determinacionIsr(other.getDeterminacionIsr());
      detallePagoIsr(other.getDetallePagoIsr());
      determinacionIva(other.getDeterminacionIva());
      detallePagoIva(other.getDetallePagoIva());
      pdf(other.getPdf());
      receiptPdf(other.getReceiptPdf());
      type(other.getType());
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
        value = "informacion_general",
        nulls = Nulls.SKIP
    )
    public Builder informacionGeneral(Optional<Map<String, Object>> informacionGeneral) {
      this.informacionGeneral = informacionGeneral;
      return this;
    }

    public Builder informacionGeneral(Map<String, Object> informacionGeneral) {
      this.informacionGeneral = Optional.of(informacionGeneral);
      return this;
    }

    @JsonSetter(
        value = "determinacion_isr",
        nulls = Nulls.SKIP
    )
    public Builder determinacionIsr(Optional<Map<String, Object>> determinacionIsr) {
      this.determinacionIsr = determinacionIsr;
      return this;
    }

    public Builder determinacionIsr(Map<String, Object> determinacionIsr) {
      this.determinacionIsr = Optional.of(determinacionIsr);
      return this;
    }

    @JsonSetter(
        value = "detalle_pago_isr",
        nulls = Nulls.SKIP
    )
    public Builder detallePagoIsr(Optional<Map<String, Object>> detallePagoIsr) {
      this.detallePagoIsr = detallePagoIsr;
      return this;
    }

    public Builder detallePagoIsr(Map<String, Object> detallePagoIsr) {
      this.detallePagoIsr = Optional.of(detallePagoIsr);
      return this;
    }

    @JsonSetter(
        value = "determinacion_iva",
        nulls = Nulls.SKIP
    )
    public Builder determinacionIva(Optional<Map<String, Object>> determinacionIva) {
      this.determinacionIva = determinacionIva;
      return this;
    }

    public Builder determinacionIva(Map<String, Object> determinacionIva) {
      this.determinacionIva = Optional.of(determinacionIva);
      return this;
    }

    @JsonSetter(
        value = "detalle_pago_iva",
        nulls = Nulls.SKIP
    )
    public Builder detallePagoIva(Optional<Map<String, Object>> detallePagoIva) {
      this.detallePagoIva = detallePagoIva;
      return this;
    }

    public Builder detallePagoIva(Map<String, Object> detallePagoIva) {
      this.detallePagoIva = Optional.of(detallePagoIva);
      return this;
    }

    @JsonSetter(
        value = "pdf",
        nulls = Nulls.SKIP
    )
    public Builder pdf(Optional<String> pdf) {
      this.pdf = pdf;
      return this;
    }

    public Builder pdf(String pdf) {
      this.pdf = Optional.of(pdf);
      return this;
    }

    @JsonSetter(
        value = "receipt_pdf",
        nulls = Nulls.SKIP
    )
    public Builder receiptPdf(Optional<String> receiptPdf) {
      this.receiptPdf = receiptPdf;
      return this;
    }

    public Builder receiptPdf(String receiptPdf) {
      this.receiptPdf = Optional.of(receiptPdf);
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

    public TaxReturnBusinessMonthly build() {
      return new TaxReturnBusinessMonthly(id, collectedAt, createdAt, informacionGeneral, determinacionIsr, detallePagoIsr, determinacionIva, detallePagoIva, pdf, receiptPdf, type);
    }
  }
}
