package com.belvo.api.resources.paymentlinks;

import com.belvo.api.core.ClientOptions;
import com.belvo.api.core.ObjectMappers;
import com.belvo.api.resources.paymentlinks.requests.ListPaymentLinksRequest;
import com.belvo.api.types.CreatePaymentlinkRequest;
import com.belvo.api.types.CreatePaymentlinkResponse;
import com.belvo.api.types.DetailCreatePaymentlinkResponse;
import com.belvo.api.types.PaymentLinkPaginatedResponse;
import java.lang.Exception;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public final class PaymentLinksClientImpl implements PaymentLinksClient {
  private final ClientOptions clientOptions;

  public PaymentLinksClientImpl(ClientOptions clientOptions) {
    this.clientOptions = clientOptions;
  }

  @Override
  public PaymentLinkPaginatedResponse listPaymentLinks(ListPaymentLinksRequest request) {
    HttpUrl.Builder _httpUrlBuilder = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
      .addPathSegment("/payments/payment-links")
      ;if (request.getPage().isPresent()) {
        _httpUrlBuilder.addQueryParameter("page", request.getPage().get().toString());
      }
      if (request.getPageSize().isPresent()) {
        _httpUrlBuilder.addQueryParameter("page_size", request.getPageSize().get().toString());
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
      if (request.getStatus().isPresent()) {
        _httpUrlBuilder.addQueryParameter("status", request.getStatus().get().toString());
      }
      if (request.getOrdering().isPresent()) {
        _httpUrlBuilder.addQueryParameter("ordering", request.getOrdering().get().toString());
      }
      if (request.getSearch().isPresent()) {
        _httpUrlBuilder.addQueryParameter("search", request.getSearch().get());
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
          return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), PaymentLinkPaginatedResponse.class);
        }
        throw new RuntimeException();
      }
      catch (Exception e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public CreatePaymentlinkResponse createPaymentlink(CreatePaymentlinkRequest request) {
      HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
        .addPathSegment("/payments/payment-links")
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
          return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), CreatePaymentlinkResponse.class);
        }
        throw new RuntimeException();
      }
      catch (Exception e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public DetailCreatePaymentlinkResponse detailCreatePaymentlink(String accessToken) {
      HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
        .addPathSegment("/payments/payment-links/")
        .addPathSegment(accessToken)
        .build();Request _request = new Request.Builder()
        .url(_httpUrl)
        .method("GET", null)
        .headers(Headers.of(clientOptions.headers()))
        .addHeader("Content-Type", "application/json")
        .build();
      try {
        Response _response = clientOptions.httpClient().newCall(_request).execute();
        if (_response.isSuccessful()) {
          return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), DetailCreatePaymentlinkResponse.class);
        }
        throw new RuntimeException();
      }
      catch (Exception e) {
        throw new RuntimeException(e);
      }
    }
  }
