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
    builder = TaxReturnPersonal.Builder.class
)
public final class TaxReturnPersonal {
  private final Optional<String> id;

  private final Optional<String> link;

  private final Optional<String> collectedAt;

  private final Optional<String> createdAt;

  private final Optional<Map<String, Object>> informacionGeneral;

  private final Optional<Map<String, Object>> sueldosSalarios;

  private final Optional<Map<String, Object>> serviciosProfesionales;

  private final Optional<Map<String, Object>> deduccionesPersonales;

  private final Optional<Map<String, Object>> determinacionImpuesto;

  private final Optional<Map<String, Object>> retenciones;

  private final Optional<Map<String, Object>> dividendos;

  private final Optional<Map<String, Object>> datosInformativos;

  private final Optional<String> pdf;

  private final Optional<String> receiptPdf;

  private int _cachedHashCode;

  TaxReturnPersonal(Optional<String> id, Optional<String> link, Optional<String> collectedAt,
      Optional<String> createdAt, Optional<Map<String, Object>> informacionGeneral,
      Optional<Map<String, Object>> sueldosSalarios,
      Optional<Map<String, Object>> serviciosProfesionales,
      Optional<Map<String, Object>> deduccionesPersonales,
      Optional<Map<String, Object>> determinacionImpuesto,
      Optional<Map<String, Object>> retenciones, Optional<Map<String, Object>> dividendos,
      Optional<Map<String, Object>> datosInformativos, Optional<String> pdf,
      Optional<String> receiptPdf) {
    this.id = id;
    this.link = link;
    this.collectedAt = collectedAt;
    this.createdAt = createdAt;
    this.informacionGeneral = informacionGeneral;
    this.sueldosSalarios = sueldosSalarios;
    this.serviciosProfesionales = serviciosProfesionales;
    this.deduccionesPersonales = deduccionesPersonales;
    this.determinacionImpuesto = determinacionImpuesto;
    this.retenciones = retenciones;
    this.dividendos = dividendos;
    this.datosInformativos = datosInformativos;
    this.pdf = pdf;
    this.receiptPdf = receiptPdf;
  }

  /**
   * @return Unique identifier created by Belvo used to reference the current Tax Return.
   */
  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
  }

  /**
   * @return The <code>link.id</code> the statement belongs to
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
   * @return General information on the tax return (year, RFC, return type, person/company name, and so on).
   */
  @JsonProperty("informacion_general")
  public Optional<Map<String, Object>> getInformacionGeneral() {
    return informacionGeneral;
  }

  /**
   * @return Details regarding the income information together combined with withheld taxes.
   */
  @JsonProperty("sueldos_salarios")
  public Optional<Map<String, Object>> getSueldosSalarios() {
    return sueldosSalarios;
  }

  /**
   * @return Details regarding the income and tax information from professional services provided.
   */
  @JsonProperty("servicios_profesionales")
  public Optional<Map<String, Object>> getServiciosProfesionales() {
    return serviciosProfesionales;
  }

  /**
   * @return List of all personal tax deductions.
   */
  @JsonProperty("deducciones_personales")
  public Optional<Map<String, Object>> getDeduccionesPersonales() {
    return deduccionesPersonales;
  }

  /**
   * @return Details regarding the final tax return.
   */
  @JsonProperty("determinacion_impuesto")
  public Optional<Map<String, Object>> getDeterminacionImpuesto() {
    return determinacionImpuesto;
  }

  /**
   * @return Details on the already withheld taxes.
   */
  @JsonProperty("retenciones")
  public Optional<Map<String, Object>> getRetenciones() {
    return retenciones;
  }

  /**
   * @return Details regarding dividends.
   */
  @JsonProperty("dividendos")
  public Optional<Map<String, Object>> getDividendos() {
    return dividendos;
  }

  /**
   * @return Extra informative data on the tax return.
   */
  @JsonProperty("datos_informativos")
  public Optional<Map<String, Object>> getDatosInformativos() {
    return datosInformativos;
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

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof TaxReturnPersonal && equalTo((TaxReturnPersonal) other);
  }

  private boolean equalTo(TaxReturnPersonal other) {
    return id.equals(other.id) && link.equals(other.link) && collectedAt.equals(other.collectedAt) && createdAt.equals(other.createdAt) && informacionGeneral.equals(other.informacionGeneral) && sueldosSalarios.equals(other.sueldosSalarios) && serviciosProfesionales.equals(other.serviciosProfesionales) && deduccionesPersonales.equals(other.deduccionesPersonales) && determinacionImpuesto.equals(other.determinacionImpuesto) && retenciones.equals(other.retenciones) && dividendos.equals(other.dividendos) && datosInformativos.equals(other.datosInformativos) && pdf.equals(other.pdf) && receiptPdf.equals(other.receiptPdf);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.id, this.link, this.collectedAt, this.createdAt, this.informacionGeneral, this.sueldosSalarios, this.serviciosProfesionales, this.deduccionesPersonales, this.determinacionImpuesto, this.retenciones, this.dividendos, this.datosInformativos, this.pdf, this.receiptPdf);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "TaxReturnPersonal{" + "id: " + id + ", link: " + link + ", collectedAt: " + collectedAt + ", createdAt: " + createdAt + ", informacionGeneral: " + informacionGeneral + ", sueldosSalarios: " + sueldosSalarios + ", serviciosProfesionales: " + serviciosProfesionales + ", deduccionesPersonales: " + deduccionesPersonales + ", determinacionImpuesto: " + determinacionImpuesto + ", retenciones: " + retenciones + ", dividendos: " + dividendos + ", datosInformativos: " + datosInformativos + ", pdf: " + pdf + ", receiptPdf: " + receiptPdf + "}";
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

    private Optional<Map<String, Object>> informacionGeneral = Optional.empty();

    private Optional<Map<String, Object>> sueldosSalarios = Optional.empty();

    private Optional<Map<String, Object>> serviciosProfesionales = Optional.empty();

    private Optional<Map<String, Object>> deduccionesPersonales = Optional.empty();

    private Optional<Map<String, Object>> determinacionImpuesto = Optional.empty();

    private Optional<Map<String, Object>> retenciones = Optional.empty();

    private Optional<Map<String, Object>> dividendos = Optional.empty();

    private Optional<Map<String, Object>> datosInformativos = Optional.empty();

    private Optional<String> pdf = Optional.empty();

    private Optional<String> receiptPdf = Optional.empty();

    private Builder() {
    }

    public Builder from(TaxReturnPersonal other) {
      id(other.getId());
      link(other.getLink());
      collectedAt(other.getCollectedAt());
      createdAt(other.getCreatedAt());
      informacionGeneral(other.getInformacionGeneral());
      sueldosSalarios(other.getSueldosSalarios());
      serviciosProfesionales(other.getServiciosProfesionales());
      deduccionesPersonales(other.getDeduccionesPersonales());
      determinacionImpuesto(other.getDeterminacionImpuesto());
      retenciones(other.getRetenciones());
      dividendos(other.getDividendos());
      datosInformativos(other.getDatosInformativos());
      pdf(other.getPdf());
      receiptPdf(other.getReceiptPdf());
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
        value = "sueldos_salarios",
        nulls = Nulls.SKIP
    )
    public Builder sueldosSalarios(Optional<Map<String, Object>> sueldosSalarios) {
      this.sueldosSalarios = sueldosSalarios;
      return this;
    }

    public Builder sueldosSalarios(Map<String, Object> sueldosSalarios) {
      this.sueldosSalarios = Optional.of(sueldosSalarios);
      return this;
    }

    @JsonSetter(
        value = "servicios_profesionales",
        nulls = Nulls.SKIP
    )
    public Builder serviciosProfesionales(Optional<Map<String, Object>> serviciosProfesionales) {
      this.serviciosProfesionales = serviciosProfesionales;
      return this;
    }

    public Builder serviciosProfesionales(Map<String, Object> serviciosProfesionales) {
      this.serviciosProfesionales = Optional.of(serviciosProfesionales);
      return this;
    }

    @JsonSetter(
        value = "deducciones_personales",
        nulls = Nulls.SKIP
    )
    public Builder deduccionesPersonales(Optional<Map<String, Object>> deduccionesPersonales) {
      this.deduccionesPersonales = deduccionesPersonales;
      return this;
    }

    public Builder deduccionesPersonales(Map<String, Object> deduccionesPersonales) {
      this.deduccionesPersonales = Optional.of(deduccionesPersonales);
      return this;
    }

    @JsonSetter(
        value = "determinacion_impuesto",
        nulls = Nulls.SKIP
    )
    public Builder determinacionImpuesto(Optional<Map<String, Object>> determinacionImpuesto) {
      this.determinacionImpuesto = determinacionImpuesto;
      return this;
    }

    public Builder determinacionImpuesto(Map<String, Object> determinacionImpuesto) {
      this.determinacionImpuesto = Optional.of(determinacionImpuesto);
      return this;
    }

    @JsonSetter(
        value = "retenciones",
        nulls = Nulls.SKIP
    )
    public Builder retenciones(Optional<Map<String, Object>> retenciones) {
      this.retenciones = retenciones;
      return this;
    }

    public Builder retenciones(Map<String, Object> retenciones) {
      this.retenciones = Optional.of(retenciones);
      return this;
    }

    @JsonSetter(
        value = "dividendos",
        nulls = Nulls.SKIP
    )
    public Builder dividendos(Optional<Map<String, Object>> dividendos) {
      this.dividendos = dividendos;
      return this;
    }

    public Builder dividendos(Map<String, Object> dividendos) {
      this.dividendos = Optional.of(dividendos);
      return this;
    }

    @JsonSetter(
        value = "datos_informativos",
        nulls = Nulls.SKIP
    )
    public Builder datosInformativos(Optional<Map<String, Object>> datosInformativos) {
      this.datosInformativos = datosInformativos;
      return this;
    }

    public Builder datosInformativos(Map<String, Object> datosInformativos) {
      this.datosInformativos = Optional.of(datosInformativos);
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

    public TaxReturnPersonal build() {
      return new TaxReturnPersonal(id, link, collectedAt, createdAt, informacionGeneral, sueldosSalarios, serviciosProfesionales, deduccionesPersonales, determinacionImpuesto, retenciones, dividendos, datosInformativos, pdf, receiptPdf);
    }
  }
}
