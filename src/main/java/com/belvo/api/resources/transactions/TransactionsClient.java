package com.belvo.api.resources.transactions;

import com.belvo.api.resources.transactions.requests.DetailTransactionRequest;
import com.belvo.api.resources.transactions.requests.ListTransactionsRequest;
import com.belvo.api.resources.transactions.requests.PatchTransactionsRequest;
import com.belvo.api.resources.transactions.requests.RetrieveTransactionsAsyncRequest;
import com.belvo.api.resources.transactions.requests.RetrieveTransactionsRequest;
import com.belvo.api.types.AsynchronousAccepted202;
import com.belvo.api.types.Transaction;
import com.belvo.api.types.TransactionsPaginatedResponse;
import java.lang.String;
import java.util.List;

public interface TransactionsClient {
  TransactionsPaginatedResponse listTransactions(ListTransactionsRequest request);

  List<Transaction> retrieveTransactions(RetrieveTransactionsRequest request);

  AsynchronousAccepted202 retrieveTransactionsAsync(RetrieveTransactionsAsyncRequest request);

  List<Transaction> patchTransactions(PatchTransactionsRequest request);

  Transaction detailTransaction(String id, DetailTransactionRequest request);

  void destroyTransaction(String id);
}
