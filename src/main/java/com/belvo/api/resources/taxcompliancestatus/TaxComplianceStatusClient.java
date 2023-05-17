package com.belvo.api.resources.taxcompliancestatus;

import com.belvo.api.resources.taxcompliancestatus.requests.DetailTaxComplianceStatusRequest;
import com.belvo.api.resources.taxcompliancestatus.requests.ListTaxComplianceStatusRequest;
import com.belvo.api.resources.taxcompliancestatus.requests.TaxComplianceStatusRequest;
import com.belvo.api.types.TaxComplianceStatus;
import com.belvo.api.types.TaxComplianceStatusPaginatedResponse;
import java.lang.String;

public interface TaxComplianceStatusClient {
  TaxComplianceStatusPaginatedResponse listTaxComplianceStatus(
      ListTaxComplianceStatusRequest request);

  TaxComplianceStatus retrieveTaxComplianceStatus(TaxComplianceStatusRequest request);

  TaxComplianceStatus detailTaxComplianceStatus(String id,
      DetailTaxComplianceStatusRequest request);

  void destroyTaxComplianceStatus(String id);
}
