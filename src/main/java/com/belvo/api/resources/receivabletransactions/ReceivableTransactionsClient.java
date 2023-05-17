package com.belvo.api.resources.receivabletransactions;

import com.belvo.api.resources.receivabletransactions.requests.DetailReceivableTransactionRequest;
import com.belvo.api.resources.receivabletransactions.requests.ListReceivableTransactionsRequest;
import com.belvo.api.resources.receivabletransactions.requests.ReceivableTransactionRequest;
import com.belvo.api.types.ReceivablesTransaction;
import com.belvo.api.types.ReceivablesTransactionsPaginatedResponse;
import java.lang.String;

public interface ReceivableTransactionsClient {
  ReceivablesTransactionsPaginatedResponse listReceivableTransactions(
      ListReceivableTransactionsRequest request);

  ReceivablesTransaction retrieveReceivableTransactions(ReceivableTransactionRequest request);

  ReceivablesTransaction detailReceivableTransaction(String id,
      DetailReceivableTransactionRequest request);

  void destroyReceivableTransaction(String id);
}
