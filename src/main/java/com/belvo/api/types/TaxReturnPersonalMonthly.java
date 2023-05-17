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
    builder = TaxReturnPersonalMonthly.Builder.class
)
public final class TaxReturnPersonalMonthly {
  private final Optional<String> id;

  private final Optional<String> collectedAt;

  private final Optional<String> createdAt;

  private final Optional<Map<String, Object>> informacionGeneral;

  private final Optional<Map<String, Object>> isr;

  private final Optional<Map<String, Object>> iva;

  private final Optional<String> pdf;

  private final Optional<String> receiptPdf;

  private final String type;

  private int _cachedHashCode;

  TaxReturnPersonalMonthly(Optional<String> id, Optional<String> collectedAt,
      Optional<String> createdAt, Optional<Map<String, Object>> informacionGeneral,
      Optional<Map<String, Object>> isr, Optional<Map<String, Object>> iva, Optional<String> pdf,
      Optional<String> receiptPdf, String type) {
    this.id = id;
    this.collectedAt = collectedAt;
    this.createdAt = createdAt;
    this.informacionGeneral = informacionGeneral;
    this.isr = isr;
    this.iva = iva;
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
   * @return Information used to calculate the monthly provisional payments of the income tax.
   */
  @JsonProperty("isr")
  public Optional<Map<String, Object>> getIsr() {
    return isr;
  }

  /**
   * @return Information used to calculate the monthly provisional payments of the VAT tax.
   */
  @JsonProperty("iva")
  public Optional<Map<String, Object>> getIva() {
    return iva;
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
  public String getType() {
    return type;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof TaxReturnPersonalMonthly && equalTo((TaxReturnPersonalMonthly) other);
  }

  private boolean equalTo(TaxReturnPersonalMonthly other) {
    return id.equals(other.id) && collectedAt.equals(other.collectedAt) && createdAt.equals(other.createdAt) && informacionGeneral.equals(other.informacionGeneral) && isr.equals(other.isr) && iva.equals(other.iva) && pdf.equals(other.pdf) && receiptPdf.equals(other.receiptPdf) && type.equals(other.type);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.id, this.collectedAt, this.createdAt, this.informacionGeneral, this.isr, this.iva, this.pdf, this.receiptPdf, this.type);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "TaxReturnPersonalMonthly{" + "id: " + id + ", collectedAt: " + collectedAt + ", createdAt: " + createdAt + ", informacionGeneral: " + informacionGeneral + ", isr: " + isr + ", iva: " + iva + ", pdf: " + pdf + ", receiptPdf: " + receiptPdf + ", type: " + type + "}";
  }

  public static TypeStage builder() {
    return new Builder();
  }

  public interface TypeStage {
    _FinalStage type(String type);

    Builder from(TaxReturnPersonalMonthly other);
  }

  public interface _FinalStage {
    TaxReturnPersonalMonthly build();

    _FinalStage id(Optional<String> id);

    _FinalStage id(String id);

    _FinalStage collectedAt(Optional<String> collectedAt);

    _FinalStage collectedAt(String collectedAt);

    _FinalStage createdAt(Optional<String> createdAt);

    _FinalStage createdAt(String createdAt);

    _FinalStage informacionGeneral(Optional<Map<String, Object>> informacionGeneral);

    _FinalStage informacionGeneral(Map<String, Object> informacionGeneral);

    _FinalStage isr(Optional<Map<String, Object>> isr);

    _FinalStage isr(Map<String, Object> isr);

    _FinalStage iva(Optional<Map<String, Object>> iva);

    _FinalStage iva(Map<String, Object> iva);

    _FinalStage pdf(Optional<String> pdf);

    _FinalStage pdf(String pdf);

    _FinalStage receiptPdf(Optional<String> receiptPdf);

    _FinalStage receiptPdf(String receiptPdf);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements TypeStage, _FinalStage {
    private String type;

    private Optional<String> receiptPdf = Optional.empty();

    private Optional<String> pdf = Optional.empty();

    private Optional<Map<String, Object>> iva = Optional.empty();

    private Optional<Map<String, Object>> isr = Optional.empty();

    private Optional<Map<String, Object>> informacionGeneral = Optional.empty();

    private Optional<String> createdAt = Optional.empty();

    private Optional<String> collectedAt = Optional.empty();

    private Optional<String> id = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(TaxReturnPersonalMonthly other) {
      id(other.getId());
      collectedAt(other.getCollectedAt());
      createdAt(other.getCreatedAt());
      informacionGeneral(other.getInformacionGeneral());
      isr(other.getIsr());
      iva(other.getIva());
      pdf(other.getPdf());
      receiptPdf(other.getReceiptPdf());
      type(other.getType());
      return this;
    }

    /**
     * <p>The type of tax return. Can be either monthly or annual.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("type")
    public _FinalStage type(String type) {
      this.type = type;
      return this;
    }

    /**
     * <p>The acknowledgement receipt from the fiscal institution confirming that they received the tax return.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage receiptPdf(String receiptPdf) {
      this.receiptPdf = Optional.of(receiptPdf);
      return this;
    }

    @Override
    @JsonSetter(
        value = "receipt_pdf",
        nulls = Nulls.SKIP
    )
    public _FinalStage receiptPdf(Optional<String> receiptPdf) {
      this.receiptPdf = receiptPdf;
      return this;
    }

    /**
     * <p>Tax return PDF as a binary.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage pdf(String pdf) {
      this.pdf = Optional.of(pdf);
      return this;
    }

    @Override
    @JsonSetter(
        value = "pdf",
        nulls = Nulls.SKIP
    )
    public _FinalStage pdf(Optional<String> pdf) {
      this.pdf = pdf;
      return this;
    }

    /**
     * <p>Information used to calculate the monthly provisional payments of the VAT tax.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage iva(Map<String, Object> iva) {
      this.iva = Optional.of(iva);
      return this;
    }

    @Override
    @JsonSetter(
        value = "iva",
        nulls = Nulls.SKIP
    )
    public _FinalStage iva(Optional<Map<String, Object>> iva) {
      this.iva = iva;
      return this;
    }

    /**
     * <p>Information used to calculate the monthly provisional payments of the income tax.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage isr(Map<String, Object> isr) {
      this.isr = Optional.of(isr);
      return this;
    }

    @Override
    @JsonSetter(
        value = "isr",
        nulls = Nulls.SKIP
    )
    public _FinalStage isr(Optional<Map<String, Object>> isr) {
      this.isr = isr;
      return this;
    }

    /**
     * <p>General information regarding the tax return (year, RFC, return type, person/company name, and so on).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage informacionGeneral(Map<String, Object> informacionGeneral) {
      this.informacionGeneral = Optional.of(informacionGeneral);
      return this;
    }

    @Override
    @JsonSetter(
        value = "informacion_general",
        nulls = Nulls.SKIP
    )
    public _FinalStage informacionGeneral(Optional<Map<String, Object>> informacionGeneral) {
      this.informacionGeneral = informacionGeneral;
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
     * <p>Unique identifier created by Belvo used to reference the current Tax Return.</p>
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
    public TaxReturnPersonalMonthly build() {
      return new TaxReturnPersonalMonthly(id, collectedAt, createdAt, informacionGeneral, isr, iva, pdf, receiptPdf, type);
    }
  }
}
