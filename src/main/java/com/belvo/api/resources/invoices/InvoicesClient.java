package com.belvo.api.resources.invoices;

import com.belvo.api.resources.invoices.requests.DetailInvoiceRequest;
import com.belvo.api.resources.invoices.requests.InvoicesRequest;
import com.belvo.api.resources.invoices.requests.ListInvoicesRequest;
import com.belvo.api.resources.invoices.requests.PatchInvoicesRequest;
import com.belvo.api.types.DetailInvoiceResponse;
import com.belvo.api.types.InvoicesResponsePaginatedResponse;
import com.belvo.api.types.PatchInvoicesResponseItem;
import com.belvo.api.types.RetrieveInvoicesResponseItem;
import java.lang.String;
import java.util.List;

public interface InvoicesClient {
  InvoicesResponsePaginatedResponse listInvoices(ListInvoicesRequest request);

  List<RetrieveInvoicesResponseItem> retrieveInvoices(InvoicesRequest request);

  List<PatchInvoicesResponseItem> patchInvoices(PatchInvoicesRequest request);

  DetailInvoiceResponse detailInvoice(String id, DetailInvoiceRequest request);

  void destroyInvoice(String id);
}
