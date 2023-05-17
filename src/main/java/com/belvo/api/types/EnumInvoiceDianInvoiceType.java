package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum EnumInvoiceDianInvoiceType {
  FACTURA_ELECTRONICA_DE_VENTA("Factura Electrónica de Venta");

  private final String value;

  EnumInvoiceDianInvoiceType(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
