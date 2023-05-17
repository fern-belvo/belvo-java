package com.belvo.api.resources.taxreturns;

import com.belvo.api.resources.taxreturns.requests.DetailTaxReturnRequest;
import com.belvo.api.resources.taxreturns.requests.ListTaxReturnsRequest;
import com.belvo.api.resources.taxreturns.requests.RetrieveTaxReturnsRequest;
import com.belvo.api.types.DetailTaxReturnResponse;
import com.belvo.api.types.ListTaxReturnsResponse;
import com.belvo.api.types.RetrieveTaxReturnsResponseItem;
import java.lang.String;
import java.util.List;

public interface TaxReturnsClient {
  ListTaxReturnsResponse listTaxReturns(ListTaxReturnsRequest request);

  List<RetrieveTaxReturnsResponseItem> retrieveTaxReturns(RetrieveTaxReturnsRequest request);

  DetailTaxReturnResponse detailTaxReturn(String id, DetailTaxReturnRequest request);

  void destroyTaxReturn(String id);
}
