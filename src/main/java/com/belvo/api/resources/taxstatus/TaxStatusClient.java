package com.belvo.api.resources.taxstatus;

import com.belvo.api.resources.taxstatus.requests.DetailTaxStatusRequest;
import com.belvo.api.resources.taxstatus.requests.ListTaxStatusRequest;
import com.belvo.api.resources.taxstatus.requests.TaxStatusRequest;
import com.belvo.api.types.DetailTaxStatusResponse;
import com.belvo.api.types.RetrieveTaxStatusResponse;
import com.belvo.api.types.TaxStatusPaginatedResponse;
import java.lang.String;

public interface TaxStatusClient {
  TaxStatusPaginatedResponse listTaxStatus(ListTaxStatusRequest request);

  RetrieveTaxStatusResponse retrieveTaxStatus(TaxStatusRequest request);

  DetailTaxStatusResponse detailTaxStatus(String id, DetailTaxStatusRequest request);

  void destroyTaxStatus(String id);
}
