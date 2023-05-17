package com.belvo.api.resources.paymentinstitutions;

import com.belvo.api.resources.paymentinstitutions.requests.ListPaymentInstitutionsRequest;
import com.belvo.api.types.PaymentInstitution;
import com.belvo.api.types.PaymentsInstitutionsPaginatedResponse;
import java.lang.String;

public interface PaymentInstitutionsClient {
  PaymentsInstitutionsPaginatedResponse listPaymentInstitutions(
      ListPaymentInstitutionsRequest request);

  PaymentInstitution detailPaymentInstitution(String id);
}
