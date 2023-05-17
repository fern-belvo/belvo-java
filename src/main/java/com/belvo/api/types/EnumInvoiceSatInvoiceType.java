package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum EnumInvoiceSatInvoiceType {
  EGRESO("Egreso"),

  INGRESO("Ingreso"),

  NOMINA("Nómina"),

  PAGO("Pago"),

  TRASLADO("Traslado");

  private final String value;

  EnumInvoiceSatInvoiceType(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
