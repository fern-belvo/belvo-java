package com.belvo.api.resources.paymentlinks;

import com.belvo.api.resources.paymentlinks.requests.ListPaymentLinksRequest;
import com.belvo.api.types.CreatePaymentlinkRequest;
import com.belvo.api.types.CreatePaymentlinkResponse;
import com.belvo.api.types.DetailCreatePaymentlinkResponse;
import com.belvo.api.types.PaymentLinkPaginatedResponse;
import java.lang.String;

public interface PaymentLinksClient {
  PaymentLinkPaginatedResponse listPaymentLinks(ListPaymentLinksRequest request);

  CreatePaymentlinkResponse createPaymentlink(CreatePaymentlinkRequest request);

  DetailCreatePaymentlinkResponse detailCreatePaymentlink(String accessToken);
}
