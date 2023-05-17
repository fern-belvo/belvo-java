package com.belvo.api.resources.paymenttransactions;

import com.belvo.api.core.ClientOptions;
import com.belvo.api.core.ObjectMappers;
import com.belvo.api.resources.paymenttransactions.requests.ListPaymentTransactionsRequest;
import com.belvo.api.types.PaymentTransaction;
import com.belvo.api.types.PaymentsTransactionsPaginatedResponse;
import java.lang.Exception;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public final class PaymentTransactionsClientImpl implements PaymentTransactionsClient {
  private final ClientOptions clientOptions;

  public PaymentTransactionsClientImpl(ClientOptions clientOptions) {
    this.clientOptions = clientOptions;
  }

  @Override
  public PaymentsTransactionsPaginatedResponse listPaymentTransactions(
      ListPaymentTransactionsRequest request) {
    HttpUrl.Builder _httpUrlBuilder = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
      .addPathSegment("/payments/transactions")
      ;if (request.getPage().isPresent()) {
        _httpUrlBuilder.addQueryParameter("page", request.getPage().get().toString());
      }
      if (request.getIdIn().isPresent()) {
        _httpUrlBuilder.addQueryParameter("id__in", request.getIdIn().get());
      }
      if (request.getCreatedAt().isPresent()) {
        _httpUrlBuilder.addQueryParameter("created_at", request.getCreatedAt().get());
      }
      if (request.getCreatedAtGt().isPresent()) {
        _httpUrlBuilder.addQueryParameter("created_at__gt", request.getCreatedAtGt().get());
      }
      if (request.getCreatedAtGte().isPresent()) {
        _httpUrlBuilder.addQueryParameter("created_at__gte", request.getCreatedAtGte().get());
      }
      if (request.getCreatedAtLt().isPresent()) {
        _httpUrlBuilder.addQueryParameter("created_at__lt", request.getCreatedAtLt().get());
      }
      if (request.getCreatedAtLte().isPresent()) {
        _httpUrlBuilder.addQueryParameter("created_at__lte", request.getCreatedAtLte().get());
      }
      if (request.getCreatedAtRange().isPresent()) {
        _httpUrlBuilder.addQueryParameter("created_at__range", request.getCreatedAtRange().get());
      }
      if (request.getCharge().isPresent()) {
        _httpUrlBuilder.addQueryParameter("charge", request.getCharge().get());
      }
      if (request.getChargeIn().isPresent()) {
        _httpUrlBuilder.addQueryParameter("charge__in", request.getChargeIn().get());
      }
      if (request.getBeneficiary().isPresent()) {
        _httpUrlBuilder.addQueryParameter("beneficiary", request.getBeneficiary().get());
      }
      if (request.getBeneficiaryIn().isPresent()) {
        _httpUrlBuilder.addQueryParameter("beneficiary__in", request.getBeneficiaryIn().get());
      }
      if (request.getPayer().isPresent()) {
        _httpUrlBuilder.addQueryParameter("payer", request.getPayer().get());
      }
      if (request.getPayerIn().isPresent()) {
        _httpUrlBuilder.addQueryParameter("payer__in", request.getPayerIn().get());
      }
      if (request.getTransactionType().isPresent()) {
        _httpUrlBuilder.addQueryParameter("transaction__type", request.getTransactionType().get());
      }
      if (request.getCurrency().isPresent()) {
        _httpUrlBuilder.addQueryParameter("currency", request.getCurrency().get());
      }
      if (request.getDescription().isPresent()) {
        _httpUrlBuilder.addQueryParameter("description", request.getDescription().get());
      }
      if (request.getAmount().isPresent()) {
        _httpUrlBuilder.addQueryParameter("amount", request.getAmount().get());
      }
      if (request.getAmountGt().isPresent()) {
        _httpUrlBuilder.addQueryParameter("amount__gt", request.getAmountGt().get());
      }
      if (request.getAmountGte().isPresent()) {
        _httpUrlBuilder.addQueryParameter("amount__gte", request.getAmountGte().get());
      }
      if (request.getAmountLt().isPresent()) {
        _httpUrlBuilder.addQueryParameter("amount__lt", request.getAmountLt().get());
      }
      if (request.getAmountLte().isPresent()) {
        _httpUrlBuilder.addQueryParameter("amount__lte", request.getAmountLte().get());
      }
      if (request.getAmountRange().isPresent()) {
        _httpUrlBuilder.addQueryParameter("amount__range", request.getAmountRange().get());
      }
      HttpUrl _httpUrl = _httpUrlBuilder.build()
          ;
      RequestBody _requestBody = null;
      Request.Builder _requestBuilder = new Request.Builder()
        .url(_httpUrl)
        .method("GET", _requestBody)
        .headers(Headers.of(clientOptions.headers()))
        .addHeader("Content-Type", "application/json");
      Request _request = _requestBuilder.build();
      try {
        Response _response = clientOptions.httpClient().newCall(_request).execute();
        if (_response.isSuccessful()) {
          return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), PaymentsTransactionsPaginatedResponse.class);
        }
        throw new RuntimeException();
      }
      catch (Exception e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public PaymentTransaction detailPaymentTransactions(String id) {
      HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
        .addPathSegment("/payments/transactions/")
        .addPathSegment(id)
        .build();Request _request = new Request.Builder()
        .url(_httpUrl)
        .method("GET", null)
        .headers(Headers.of(clientOptions.headers()))
        .addHeader("Content-Type", "application/json")
        .build();
      try {
        Response _response = clientOptions.httpClient().newCall(_request).execute();
        if (_response.isSuccessful()) {
          return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), PaymentTransaction.class);
        }
        throw new RuntimeException();
      }
      catch (Exception e) {
        throw new RuntimeException(e);
      }
    }
  }
