package com.belvo.api.resources.paymentwebhooks;

import com.belvo.api.resources.paymentwebhooks.requests.PaymentWebhookRequest;
import com.belvo.api.types.PaymentWebhook;
import com.belvo.api.types.PaymentsWebhooksPaginatedResponse;
import java.lang.String;
import java.util.List;

public interface PaymentWebhooksClient {
  PaymentsWebhooksPaginatedResponse listPaymentWebhooks();

  List<PaymentWebhook> registerPaymentWebhook(PaymentWebhookRequest request);

  PaymentWebhook detailPaymentWebhooks(String id);

  void deletePaymentWebhooks(String id);
}
