package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum NextStepDisplayPaymentFailedType {
  OPEN_FINANCE_DISPLAY_PAYMENT_METHOD_INFORMATION("open_finance_display_payment_method_information"),

  OPEN_FINANCE_DISPLAY_CONFIRMATION_REQUIRED("open_finance_display_confirmation_required"),

  OPEN_FINANCE_DISPLAY_NEEDS_REDIRECT("open_finance_display_needs_redirect"),

  OPEN_FINANCE_DISPLAY_PAYMENT_PROCESSING("open_finance_display_payment_processing"),

  OPEN_FINANCE_DISPLAY_PAYMENT_SUCCEEDED("open_finance_display_payment_succeeded"),

  OPEN_FINANCE_DISPLAY_PAYMENT_FAILED("open_finance_display_payment_failed");

  private final String value;

  NextStepDisplayPaymentFailedType(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
