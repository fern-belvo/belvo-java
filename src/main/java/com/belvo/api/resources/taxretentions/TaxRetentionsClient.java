package com.belvo.api.resources.taxretentions;

import com.belvo.api.resources.taxretentions.requests.DetailTaxRetentionsRequest;
import com.belvo.api.resources.taxretentions.requests.ListTaxRetentionsRequest;
import com.belvo.api.resources.taxretentions.requests.TaxRetentionsRequest;
import com.belvo.api.types.TaxRetentions;
import com.belvo.api.types.TaxRetentionsPaginatedResponse;
import java.lang.String;
import java.util.List;

public interface TaxRetentionsClient {
  TaxRetentionsPaginatedResponse listTaxRetentions(ListTaxRetentionsRequest request);

  List<TaxRetentions> retrieveTaxRetentions(TaxRetentionsRequest request);

  TaxRetentions detailTaxRetentions(String id, DetailTaxRetentionsRequest request);

  void destroyTaxRetention(String id);
}
