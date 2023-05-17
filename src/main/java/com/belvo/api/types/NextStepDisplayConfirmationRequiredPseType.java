package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.Override;
import java.lang.String;

public enum NextStepDisplayConfirmationRequiredPseType {
  PSE_DISPLAY_PAYMENT_METHOD_INFORMATION("pse_display_payment_method_information"),

  PSE_DISPLAY_CREDENTIALS_REQUIRED("pse_display_credentials_required"),

  PSE_DISPLAY_NEEDS_REDIRECT("pse_display_needs_redirect"),

  PSE_DISPLAY_TOKEN_REQUIRED("pse_display_token_required"),

  PSE_DISPLAY_CUSTOMER_BANK_ACCOUNTS("pse_display_customer_bank_accounts"),

  PSE_DISPLAY_CONFIRMATION_REQUIRED("pse_display_confirmation_required"),

  PSE_DISPLAY_PAYMENT_PROCESSING("pse_display_payment_processing"),

  PSE_DISPLAY_PAYMENT_FAILED("pse_display_payment_failed"),

  PSE_DISPLAY_PAYMENT_SUCCEEDED("pse_display_payment_succeeded");

  private final String value;

  NextStepDisplayConfirmationRequiredPseType(String value) {
    this.value = value;
  }

  @JsonValue
  @Override
  public String toString() {
    return this.value;
  }
}
