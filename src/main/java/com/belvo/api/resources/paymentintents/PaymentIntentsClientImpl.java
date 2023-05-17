package com.belvo.api.resources.paymentintents;

import com.belvo.api.core.ClientOptions;
import com.belvo.api.core.ObjectMappers;
import com.belvo.api.resources.paymentintents.requests.ListPaymentIntentsRequest;
import com.belvo.api.resources.paymentintents.requests.PatchPaymentIntentPse;
import com.belvo.api.types.CreatePaymentIntentPse;
import com.belvo.api.types.PaymentIntentPaginatedResponse;
import com.belvo.api.types.PaymentIntentPse;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public final class PaymentIntentsClientImpl implements PaymentIntentsClient {
  private final ClientOptions clientOptions;

  public PaymentIntentsClientImpl(ClientOptions clientOptions) {
    this.clientOptions = clientOptions;
  }

  @Override
  public PaymentIntentPaginatedResponse listPaymentIntents(ListPaymentIntentsRequest request) {
    HttpUrl.Builder _httpUrlBuilder = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
      .addPathSegment("/payments/payment-intents")
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
      if (request.getProvider().isPresent()) {
        _httpUrlBuilder.addQueryParameter("provider", request.getProvider().get());
      }
      if (request.getPaymentMethodType().isPresent()) {
        _httpUrlBuilder.addQueryParameter("payment_method_type", request.getPaymentMethodType().get());
      }
      if (request.getCustomer().isPresent()) {
        _httpUrlBuilder.addQueryParameter("customer", request.getCustomer().get());
      }
      if (request.getCustomerIn().isPresent()) {
        _httpUrlBuilder.addQueryParameter("customer__in", request.getCustomerIn().get());
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
      if (request.getStatus().isPresent()) {
        _httpUrlBuilder.addQueryParameter("status", request.getStatus().get());
      }
      if (request.getStatusIn().isPresent()) {
        _httpUrlBuilder.addQueryParameter("status__in", request.getStatusIn().get());
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
          return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), PaymentIntentPaginatedResponse.class);
        }
        throw new RuntimeException();
      }
      catch (Exception e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public PaymentIntentPse createPaymentIntent(CreatePaymentIntentPse request) {
      HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
        .addPathSegment("/payments/payment-intents")
        .build();
      RequestBody _requestBody;
      try {
        _requestBody = RequestBody.create(ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaType.parse("application/json"));
      }
      catch(Exception e) {
        throw new RuntimeException(e);
      }
      Request _request = new Request.Builder()
        .url(_httpUrl)
        .method("POST", _requestBody)
        .headers(Headers.of(clientOptions.headers()))
        .addHeader("Content-Type", "application/json")
        .build();
      try {
        Response _response = clientOptions.httpClient().newCall(_request).execute();
        if (_response.isSuccessful()) {
          return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), PaymentIntentPse.class);
        }
        throw new RuntimeException();
      }
      catch (Exception e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public PaymentIntentPse detailPaymentIntent(String id) {
      HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
        .addPathSegment("/payments/payment-intents/")
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
          return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), PaymentIntentPse.class);
        }
        throw new RuntimeException();
      }
      catch (Exception e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public PaymentIntentPse patchPaymentIntent(String id, PatchPaymentIntentPse request) {
      HttpUrl.Builder _httpUrlBuilder = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
        .addPathSegment("/payments/payment-intents/")
        .addPathSegment(id)
        ;HttpUrl _httpUrl = _httpUrlBuilder.build()
            ;
        Map<String, Object> _requestBodyProperties = new HashMap<>();
        _requestBodyProperties.put("payment_method_details", request.getPaymentMethodDetails());
        _requestBodyProperties.put("confirm", request.getConfirm());
        RequestBody _requestBody;
        try {
          _requestBody = RequestBody.create(ObjectMappers.JSON_MAPPER.writeValueAsBytes(_requestBodyProperties), MediaType.parse("application/json"));
        }
        catch(Exception e) {
          throw new RuntimeException(e);
        }
        Request.Builder _requestBuilder = new Request.Builder()
          .url(_httpUrl)
          .method("PATCH", _requestBody)
          .headers(Headers.of(clientOptions.headers()))
          .addHeader("Content-Type", "application/json");
        Request _request = _requestBuilder.build();
        try {
          Response _response = clientOptions.httpClient().newCall(_request).execute();
          if (_response.isSuccessful()) {
            return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), PaymentIntentPse.class);
          }
          throw new RuntimeException();
        }
        catch (Exception e) {
          throw new RuntimeException(e);
        }
      }
    }
