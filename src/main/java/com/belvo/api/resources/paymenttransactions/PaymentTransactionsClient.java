package com.belvo.api.resources.paymenttransactions;

import com.belvo.api.resources.paymenttransactions.requests.ListPaymentTransactionsRequest;
import com.belvo.api.types.PaymentTransaction;
import com.belvo.api.types.PaymentsTransactionsPaginatedResponse;
import java.lang.String;

public interface PaymentTransactionsClient {
  PaymentsTransactionsPaginatedResponse listPaymentTransactions(
      ListPaymentTransactionsRequest request);

  PaymentTransaction detailPaymentTransactions(String id);
}
