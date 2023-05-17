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
    builder = TaxReturnBusiness.Builder.class
)
public final class TaxReturnBusiness {
  private final Optional<String> id;

  private final Optional<String> collectedAt;

  private final Optional<String> createdAt;

  private final Optional<Map<String, Object>> informacionGeneral;

  private final Optional<Map<String, Object>> datosAdicionales;

  private final Optional<Map<String, Object>> estadoResultados;

  private final Optional<Map<String, Object>> estadoPosicionFinancieraBalance;

  private final Optional<Map<String, Object>> conciliacionEntreResultadoContableFiscal;

  private final Optional<Map<String, Object>> deduccionesAutorizadas;

  private final Optional<Map<String, Object>> cifrasCierreEjercicio;

  private final Optional<Map<String, Object>> determinacionDelImpuestoSobreLaRenta;

  private final Optional<Map<String, Object>> dividendosOUtilidadesDistribuidos;

  private final Optional<Map<String, Object>> detallePagoR1IsrPersonasMorales;

  private final Optional<String> pdf;

  private final Optional<String> receiptPdf;

  private int _cachedHashCode;

  TaxReturnBusiness(Optional<String> id, Optional<String> collectedAt, Optional<String> createdAt,
      Optional<Map<String, Object>> informacionGeneral,
      Optional<Map<String, Object>> datosAdicionales,
      Optional<Map<String, Object>> estadoResultados,
      Optional<Map<String, Object>> estadoPosicionFinancieraBalance,
      Optional<Map<String, Object>> conciliacionEntreResultadoContableFiscal,
      Optional<Map<String, Object>> deduccionesAutorizadas,
      Optional<Map<String, Object>> cifrasCierreEjercicio,
      Optional<Map<String, Object>> determinacionDelImpuestoSobreLaRenta,
      Optional<Map<String, Object>> dividendosOUtilidadesDistribuidos,
      Optional<Map<String, Object>> detallePagoR1IsrPersonasMorales, Optional<String> pdf,
      Optional<String> receiptPdf) {
    this.id = id;
    this.collectedAt = collectedAt;
    this.createdAt = createdAt;
    this.informacionGeneral = informacionGeneral;
    this.datosAdicionales = datosAdicionales;
    this.estadoResultados = estadoResultados;
    this.estadoPosicionFinancieraBalance = estadoPosicionFinancieraBalance;
    this.conciliacionEntreResultadoContableFiscal = conciliacionEntreResultadoContableFiscal;
    this.deduccionesAutorizadas = deduccionesAutorizadas;
    this.cifrasCierreEjercicio = cifrasCierreEjercicio;
    this.determinacionDelImpuestoSobreLaRenta = determinacionDelImpuestoSobreLaRenta;
    this.dividendosOUtilidadesDistribuidos = dividendosOUtilidadesDistribuidos;
    this.detallePagoR1IsrPersonasMorales = detallePagoR1IsrPersonasMorales;
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
   * @return Additional data regarding the tax return.
   */
  @JsonProperty("datos_adicionales")
  public Optional<Map<String, Object>> getDatosAdicionales() {
    return datosAdicionales;
  }

  /**
   * @return Detailed information about the legal entity's yearly profit and loss.
   */
  @JsonProperty("estado_resultados")
  public Optional<Map<String, Object>> getEstadoResultados() {
    return estadoResultados;
  }

  /**
   * @return Details regarding balance sheet of the legal entity.
   */
  @JsonProperty("estado_posicion_financiera_balance")
  public Optional<Map<String, Object>> getEstadoPosicionFinancieraBalance() {
    return estadoPosicionFinancieraBalance;
  }

  /**
   * @return Details regarding the accounting reconciliation.
   */
  @JsonProperty("conciliacion_entre_resultado_contable_fiscal")
  public Optional<Map<String, Object>> getConciliacionEntreResultadoContableFiscal() {
    return conciliacionEntreResultadoContableFiscal;
  }

  /**
   * @return Details regarding the legal entity's deductions.
   */
  @JsonProperty("deducciones_autorizadas")
  public Optional<Map<String, Object>> getDeduccionesAutorizadas() {
    return deduccionesAutorizadas;
  }

  /**
   * @return Details regarding key numbers at the end of the fiscal exercise.
   */
  @JsonProperty("cifras_cierre_ejercicio")
  public Optional<Map<String, Object>> getCifrasCierreEjercicio() {
    return cifrasCierreEjercicio;
  }

  /**
   * @return Details regarding the final tax return.
   */
  @JsonProperty("determinacion_del_impuesto_sobre_la_renta")
  public Optional<Map<String, Object>> getDeterminacionDelImpuestoSobreLaRenta() {
    return determinacionDelImpuestoSobreLaRenta;
  }

  /**
   * @return Details regarding distributed dividends.
   */
  @JsonProperty("dividendos_o_utilidades_distribuidos")
  public Optional<Map<String, Object>> getDividendosOUtilidadesDistribuidos() {
    return dividendosOUtilidadesDistribuidos;
  }

  /**
   * @return Details of the tax payment.
   */
  @JsonProperty("detalle_pago_r1_isr_personas_morales")
  public Optional<Map<String, Object>> getDetallePagoR1IsrPersonasMorales() {
    return detallePagoR1IsrPersonasMorales;
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
    return other instanceof TaxReturnBusiness && equalTo((TaxReturnBusiness) other);
  }

  private boolean equalTo(TaxReturnBusiness other) {
    return id.equals(other.id) && collectedAt.equals(other.collectedAt) && createdAt.equals(other.createdAt) && informacionGeneral.equals(other.informacionGeneral) && datosAdicionales.equals(other.datosAdicionales) && estadoResultados.equals(other.estadoResultados) && estadoPosicionFinancieraBalance.equals(other.estadoPosicionFinancieraBalance) && conciliacionEntreResultadoContableFiscal.equals(other.conciliacionEntreResultadoContableFiscal) && deduccionesAutorizadas.equals(other.deduccionesAutorizadas) && cifrasCierreEjercicio.equals(other.cifrasCierreEjercicio) && determinacionDelImpuestoSobreLaRenta.equals(other.determinacionDelImpuestoSobreLaRenta) && dividendosOUtilidadesDistribuidos.equals(other.dividendosOUtilidadesDistribuidos) && detallePagoR1IsrPersonasMorales.equals(other.detallePagoR1IsrPersonasMorales) && pdf.equals(other.pdf) && receiptPdf.equals(other.receiptPdf);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.id, this.collectedAt, this.createdAt, this.informacionGeneral, this.datosAdicionales, this.estadoResultados, this.estadoPosicionFinancieraBalance, this.conciliacionEntreResultadoContableFiscal, this.deduccionesAutorizadas, this.cifrasCierreEjercicio, this.determinacionDelImpuestoSobreLaRenta, this.dividendosOUtilidadesDistribuidos, this.detallePagoR1IsrPersonasMorales, this.pdf, this.receiptPdf);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "TaxReturnBusiness{" + "id: " + id + ", collectedAt: " + collectedAt + ", createdAt: " + createdAt + ", informacionGeneral: " + informacionGeneral + ", datosAdicionales: " + datosAdicionales + ", estadoResultados: " + estadoResultados + ", estadoPosicionFinancieraBalance: " + estadoPosicionFinancieraBalance + ", conciliacionEntreResultadoContableFiscal: " + conciliacionEntreResultadoContableFiscal + ", deduccionesAutorizadas: " + deduccionesAutorizadas + ", cifrasCierreEjercicio: " + cifrasCierreEjercicio + ", determinacionDelImpuestoSobreLaRenta: " + determinacionDelImpuestoSobreLaRenta + ", dividendosOUtilidadesDistribuidos: " + dividendosOUtilidadesDistribuidos + ", detallePagoR1IsrPersonasMorales: " + detallePagoR1IsrPersonasMorales + ", pdf: " + pdf + ", receiptPdf: " + receiptPdf + "}";
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

    private Optional<Map<String, Object>> datosAdicionales = Optional.empty();

    private Optional<Map<String, Object>> estadoResultados = Optional.empty();

    private Optional<Map<String, Object>> estadoPosicionFinancieraBalance = Optional.empty();

    private Optional<Map<String, Object>> conciliacionEntreResultadoContableFiscal = Optional.empty();

    private Optional<Map<String, Object>> deduccionesAutorizadas = Optional.empty();

    private Optional<Map<String, Object>> cifrasCierreEjercicio = Optional.empty();

    private Optional<Map<String, Object>> determinacionDelImpuestoSobreLaRenta = Optional.empty();

    private Optional<Map<String, Object>> dividendosOUtilidadesDistribuidos = Optional.empty();

    private Optional<Map<String, Object>> detallePagoR1IsrPersonasMorales = Optional.empty();

    private Optional<String> pdf = Optional.empty();

    private Optional<String> receiptPdf = Optional.empty();

    private Builder() {
    }

    public Builder from(TaxReturnBusiness other) {
      id(other.getId());
      collectedAt(other.getCollectedAt());
      createdAt(other.getCreatedAt());
      informacionGeneral(other.getInformacionGeneral());
      datosAdicionales(other.getDatosAdicionales());
      estadoResultados(other.getEstadoResultados());
      estadoPosicionFinancieraBalance(other.getEstadoPosicionFinancieraBalance());
      conciliacionEntreResultadoContableFiscal(other.getConciliacionEntreResultadoContableFiscal());
      deduccionesAutorizadas(other.getDeduccionesAutorizadas());
      cifrasCierreEjercicio(other.getCifrasCierreEjercicio());
      determinacionDelImpuestoSobreLaRenta(other.getDeterminacionDelImpuestoSobreLaRenta());
      dividendosOUtilidadesDistribuidos(other.getDividendosOUtilidadesDistribuidos());
      detallePagoR1IsrPersonasMorales(other.getDetallePagoR1IsrPersonasMorales());
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
        value = "datos_adicionales",
        nulls = Nulls.SKIP
    )
    public Builder datosAdicionales(Optional<Map<String, Object>> datosAdicionales) {
      this.datosAdicionales = datosAdicionales;
      return this;
    }

    public Builder datosAdicionales(Map<String, Object> datosAdicionales) {
      this.datosAdicionales = Optional.of(datosAdicionales);
      return this;
    }

    @JsonSetter(
        value = "estado_resultados",
        nulls = Nulls.SKIP
    )
    public Builder estadoResultados(Optional<Map<String, Object>> estadoResultados) {
      this.estadoResultados = estadoResultados;
      return this;
    }

    public Builder estadoResultados(Map<String, Object> estadoResultados) {
      this.estadoResultados = Optional.of(estadoResultados);
      return this;
    }

    @JsonSetter(
        value = "estado_posicion_financiera_balance",
        nulls = Nulls.SKIP
    )
    public Builder estadoPosicionFinancieraBalance(
        Optional<Map<String, Object>> estadoPosicionFinancieraBalance) {
      this.estadoPosicionFinancieraBalance = estadoPosicionFinancieraBalance;
      return this;
    }

    public Builder estadoPosicionFinancieraBalance(
        Map<String, Object> estadoPosicionFinancieraBalance) {
      this.estadoPosicionFinancieraBalance = Optional.of(estadoPosicionFinancieraBalance);
      return this;
    }

    @JsonSetter(
        value = "conciliacion_entre_resultado_contable_fiscal",
        nulls = Nulls.SKIP
    )
    public Builder conciliacionEntreResultadoContableFiscal(
        Optional<Map<String, Object>> conciliacionEntreResultadoContableFiscal) {
      this.conciliacionEntreResultadoContableFiscal = conciliacionEntreResultadoContableFiscal;
      return this;
    }

    public Builder conciliacionEntreResultadoContableFiscal(
        Map<String, Object> conciliacionEntreResultadoContableFiscal) {
      this.conciliacionEntreResultadoContableFiscal = Optional.of(conciliacionEntreResultadoContableFiscal);
      return this;
    }

    @JsonSetter(
        value = "deducciones_autorizadas",
        nulls = Nulls.SKIP
    )
    public Builder deduccionesAutorizadas(Optional<Map<String, Object>> deduccionesAutorizadas) {
      this.deduccionesAutorizadas = deduccionesAutorizadas;
      return this;
    }

    public Builder deduccionesAutorizadas(Map<String, Object> deduccionesAutorizadas) {
      this.deduccionesAutorizadas = Optional.of(deduccionesAutorizadas);
      return this;
    }

    @JsonSetter(
        value = "cifras_cierre_ejercicio",
        nulls = Nulls.SKIP
    )
    public Builder cifrasCierreEjercicio(Optional<Map<String, Object>> cifrasCierreEjercicio) {
      this.cifrasCierreEjercicio = cifrasCierreEjercicio;
      return this;
    }

    public Builder cifrasCierreEjercicio(Map<String, Object> cifrasCierreEjercicio) {
      this.cifrasCierreEjercicio = Optional.of(cifrasCierreEjercicio);
      return this;
    }

    @JsonSetter(
        value = "determinacion_del_impuesto_sobre_la_renta",
        nulls = Nulls.SKIP
    )
    public Builder determinacionDelImpuestoSobreLaRenta(
        Optional<Map<String, Object>> determinacionDelImpuestoSobreLaRenta) {
      this.determinacionDelImpuestoSobreLaRenta = determinacionDelImpuestoSobreLaRenta;
      return this;
    }

    public Builder determinacionDelImpuestoSobreLaRenta(
        Map<String, Object> determinacionDelImpuestoSobreLaRenta) {
      this.determinacionDelImpuestoSobreLaRenta = Optional.of(determinacionDelImpuestoSobreLaRenta);
      return this;
    }

    @JsonSetter(
        value = "dividendos_o_utilidades_distribuidos",
        nulls = Nulls.SKIP
    )
    public Builder dividendosOUtilidadesDistribuidos(
        Optional<Map<String, Object>> dividendosOUtilidadesDistribuidos) {
      this.dividendosOUtilidadesDistribuidos = dividendosOUtilidadesDistribuidos;
      return this;
    }

    public Builder dividendosOUtilidadesDistribuidos(
        Map<String, Object> dividendosOUtilidadesDistribuidos) {
      this.dividendosOUtilidadesDistribuidos = Optional.of(dividendosOUtilidadesDistribuidos);
      return this;
    }

    @JsonSetter(
        value = "detalle_pago_r1_isr_personas_morales",
        nulls = Nulls.SKIP
    )
    public Builder detallePagoR1IsrPersonasMorales(
        Optional<Map<String, Object>> detallePagoR1IsrPersonasMorales) {
      this.detallePagoR1IsrPersonasMorales = detallePagoR1IsrPersonasMorales;
      return this;
    }

    public Builder detallePagoR1IsrPersonasMorales(
        Map<String, Object> detallePagoR1IsrPersonasMorales) {
      this.detallePagoR1IsrPersonasMorales = Optional.of(detallePagoR1IsrPersonasMorales);
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

    public TaxReturnBusiness build() {
      return new TaxReturnBusiness(id, collectedAt, createdAt, informacionGeneral, datosAdicionales, estadoResultados, estadoPosicionFinancieraBalance, conciliacionEntreResultadoContableFiscal, deduccionesAutorizadas, cifrasCierreEjercicio, determinacionDelImpuestoSobreLaRenta, dividendosOUtilidadesDistribuidos, detallePagoR1IsrPersonasMorales, pdf, receiptPdf);
    }
  }
}
