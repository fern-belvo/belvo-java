package com.belvo.api.resources.paymentintents;

import com.belvo.api.resources.paymentintents.requests.ListPaymentIntentsRequest;
import com.belvo.api.resources.paymentintents.requests.PatchPaymentIntentPse;
import com.belvo.api.types.CreatePaymentIntentPse;
import com.belvo.api.types.PaymentIntentPaginatedResponse;
import com.belvo.api.types.PaymentIntentPse;
import java.lang.String;

public interface PaymentIntentsClient {
  PaymentIntentPaginatedResponse listPaymentIntents(ListPaymentIntentsRequest request);

  PaymentIntentPse createPaymentIntent(CreatePaymentIntentPse request);

  PaymentIntentPse detailPaymentIntent(String id);

  PaymentIntentPse patchPaymentIntent(String id, PatchPaymentIntentPse request);
}
