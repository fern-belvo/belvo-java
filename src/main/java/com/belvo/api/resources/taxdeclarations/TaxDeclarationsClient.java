package com.belvo.api.resources.taxdeclarations;

import com.belvo.api.resources.taxdeclarations.requests.DetailTaxDeclarationRequest;
import com.belvo.api.resources.taxdeclarations.requests.ListTaxDeclarationsRequest;
import com.belvo.api.resources.taxdeclarations.requests.TaxDeclarationsRequest;
import com.belvo.api.types.DetailTaxDeclarationResponse;
import com.belvo.api.types.ListTaxDeclarationsResponse;
import com.belvo.api.types.RetrieveTaxDeclarationsResponseItem;
import java.lang.String;
import java.util.List;

public interface TaxDeclarationsClient {
  ListTaxDeclarationsResponse listTaxDeclarations(ListTaxDeclarationsRequest request);

  List<RetrieveTaxDeclarationsResponseItem> retrieveTaxDeclarations(TaxDeclarationsRequest request);

  DetailTaxDeclarationResponse detailTaxDeclaration(String id, DetailTaxDeclarationRequest request);

  void destroyTaxDeclaration(String id);
}
