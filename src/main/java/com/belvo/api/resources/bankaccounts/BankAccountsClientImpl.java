package com.belvo.api.resources.bankaccounts;

import com.belvo.api.core.ClientOptions;
import com.belvo.api.core.ObjectMappers;
import com.belvo.api.resources.bankaccounts.requests.ListBankAccountRequest;
import com.belvo.api.types.BankAccountPaginatedResponse;
import com.belvo.api.types.CreateBankAccountRequest;
import com.belvo.api.types.CreateBankAccountResponse;
import com.belvo.api.types.DetailBankAccountResponse;
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

public final class BankAccountsClientImpl implements BankAccountsClient {
  private final ClientOptions clientOptions;

  public BankAccountsClientImpl(ClientOptions clientOptions) {
    this.clientOptions = clientOptions;
  }

  @Override
  public BankAccountPaginatedResponse listBankAccount(ListBankAccountRequest request) {
    HttpUrl.Builder _httpUrlBuilder = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
      .addPathSegment("/payments/bank-accounts")
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
      if (request.getNumber().isPresent()) {
        _httpUrlBuilder.addQueryParameter("number", request.getNumber().get());
      }
      if (request.getNumberIn().isPresent()) {
        _httpUrlBuilder.addQueryParameter("number__in", request.getNumberIn().get());
      }
      if (request.getCustomer().isPresent()) {
        _httpUrlBuilder.addQueryParameter("customer", request.getCustomer().get());
      }
      if (request.getInstitution().isPresent()) {
        _httpUrlBuilder.addQueryParameter("institution", request.getInstitution().get());
      }
      if (request.getHolderType().isPresent()) {
        _httpUrlBuilder.addQueryParameter("holder__type", request.getHolderType().get());
      }
      if (request.getHolderTypeIn().isPresent()) {
        _httpUrlBuilder.addQueryParameter("holder__type__in", request.getHolderTypeIn().get());
      }
      if (request.getProviders().isPresent()) {
        _httpUrlBuilder.addQueryParameter("providers", request.getProviders().get());
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
          return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), BankAccountPaginatedResponse.class);
        }
        throw new RuntimeException();
      }
      catch (Exception e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public CreateBankAccountResponse createBankAccount(CreateBankAccountRequest request) {
      HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
        .addPathSegment("/payments/bank-accounts")
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
          return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), CreateBankAccountResponse.class);
        }
        throw new RuntimeException();
      }
      catch (Exception e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public DetailBankAccountResponse detailBankAccount(String id) {
      HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
        .addPathSegment("/payments/bank-accounts/")
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
          return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), DetailBankAccountResponse.class);
        }
        throw new RuntimeException();
      }
      catch (Exception e) {
        throw new RuntimeException(e);
      }
    }
  }
