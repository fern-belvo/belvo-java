package com.belvo.api.resources.accounts;

import com.belvo.api.core.ClientOptions;
import com.belvo.api.core.ObjectMappers;
import com.belvo.api.resources.accounts.requests.DetailAccountRequest;
import com.belvo.api.resources.accounts.requests.ListAccountsRequest;
import com.belvo.api.resources.accounts.requests.PatchAccountsRequest;
import com.belvo.api.resources.accounts.requests.RetrieveAccountsRequest;
import com.belvo.api.types.Account;
import com.belvo.api.types.AccountsPaginatedResponse;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Exception;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public final class AccountsClientImpl implements AccountsClient {
  private final ClientOptions clientOptions;

  public AccountsClientImpl(ClientOptions clientOptions) {
    this.clientOptions = clientOptions;
  }

  @Override
  public AccountsPaginatedResponse listAccounts(ListAccountsRequest request) {
    HttpUrl.Builder _httpUrlBuilder = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
      .addPathSegment("/api/accounts")
      ;if (request.getPage().isPresent()) {
        _httpUrlBuilder.addQueryParameter("page", request.getPage().get().toString());
      }
      if (request.getPageSize().isPresent()) {
        _httpUrlBuilder.addQueryParameter("page_size", request.getPageSize().get().toString());
      }
      if (request.getOmit().isPresent()) {
        _httpUrlBuilder.addQueryParameter("omit", request.getOmit().get());
      }
      if (request.getFields().isPresent()) {
        _httpUrlBuilder.addQueryParameter("fields", request.getFields().get());
      }
      if (request.getLink().isPresent()) {
        _httpUrlBuilder.addQueryParameter("link", request.getLink().get());
      }
      if (request.getBalanceAvailable().isPresent()) {
        _httpUrlBuilder.addQueryParameter("balance__available", request.getBalanceAvailable().get());
      }
      if (request.getBalanceAvailableLt().isPresent()) {
        _httpUrlBuilder.addQueryParameter("balance__available__lt", request.getBalanceAvailableLt().get());
      }
      if (request.getBalanceAvailableLte().isPresent()) {
        _httpUrlBuilder.addQueryParameter("balance__available__lte", request.getBalanceAvailableLte().get());
      }
      if (request.getBalanceAvailableGt().isPresent()) {
        _httpUrlBuilder.addQueryParameter("balance__available__gt", request.getBalanceAvailableGt().get());
      }
      if (request.getBalanceAvailableGte().isPresent()) {
        _httpUrlBuilder.addQueryParameter("balance__available__gte", request.getBalanceAvailableGte().get());
      }
      if (request.getBalanceAvailableRange().isPresent()) {
        _httpUrlBuilder.addQueryParameter("balance__available__range", request.getBalanceAvailableRange().get());
      }
      if (request.getBalanceCurrent().isPresent()) {
        _httpUrlBuilder.addQueryParameter("balance__current", request.getBalanceCurrent().get());
      }
      if (request.getBalanceCurrentLt().isPresent()) {
        _httpUrlBuilder.addQueryParameter("balance__current__lt", request.getBalanceCurrentLt().get());
      }
      if (request.getBalanceCurrentLte().isPresent()) {
        _httpUrlBuilder.addQueryParameter("balance__current__lte", request.getBalanceCurrentLte().get());
      }
      if (request.getBalanceCurrentGt().isPresent()) {
        _httpUrlBuilder.addQueryParameter("balance__current__gt", request.getBalanceCurrentGt().get());
      }
      if (request.getBalanceCurrentGte().isPresent()) {
        _httpUrlBuilder.addQueryParameter("balance__current__gte", request.getBalanceCurrentGte().get());
      }
      if (request.getBalanceCurrentRange().isPresent()) {
        _httpUrlBuilder.addQueryParameter("balance__current__range", request.getBalanceCurrentRange().get());
      }
      if (request.getCategory().isPresent()) {
        _httpUrlBuilder.addQueryParameter("category", request.getCategory().get());
      }
      if (request.getCategoryIn().isPresent()) {
        _httpUrlBuilder.addQueryParameter("category__in", request.getCategoryIn().get());
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
      if (request.getCurrency().isPresent()) {
        _httpUrlBuilder.addQueryParameter("currency", request.getCurrency().get());
      }
      if (request.getCurrencyIn().isPresent()) {
        _httpUrlBuilder.addQueryParameter("currency__in", request.getCurrencyIn().get());
      }
      if (request.getId().isPresent()) {
        _httpUrlBuilder.addQueryParameter("id", request.getId().get());
      }
      if (request.getIdIn().isPresent()) {
        _httpUrlBuilder.addQueryParameter("id__in", request.getIdIn().get());
      }
      if (request.getInstitution().isPresent()) {
        _httpUrlBuilder.addQueryParameter("institution", request.getInstitution().get());
      }
      if (request.getInstitutionIn().isPresent()) {
        _httpUrlBuilder.addQueryParameter("institution__in", request.getInstitutionIn().get());
      }
      if (request.getLinkIn().isPresent()) {
        _httpUrlBuilder.addQueryParameter("link__in", request.getLinkIn().get());
      }
      if (request.getName().isPresent()) {
        _httpUrlBuilder.addQueryParameter("name", request.getName().get());
      }
      if (request.getNameIcontains().isPresent()) {
        _httpUrlBuilder.addQueryParameter("name__icontains", request.getNameIcontains().get());
      }
      if (request.getNumber().isPresent()) {
        _httpUrlBuilder.addQueryParameter("number", request.getNumber().get());
      }
      if (request.getNumberIn().isPresent()) {
        _httpUrlBuilder.addQueryParameter("number__in", request.getNumberIn().get());
      }
      if (request.getPublicIdentificationName().isPresent()) {
        _httpUrlBuilder.addQueryParameter("public_identification_name", request.getPublicIdentificationName().get());
      }
      if (request.getPublicIdentificationValue().isPresent()) {
        _httpUrlBuilder.addQueryParameter("public_identification_value", request.getPublicIdentificationValue().get());
      }
      if (request.getType().isPresent()) {
        _httpUrlBuilder.addQueryParameter("type", request.getType().get());
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
          return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), AccountsPaginatedResponse.class);
        }
        throw new RuntimeException();
      }
      catch (Exception e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public List<Optional<Account>> retrieveAccounts(RetrieveAccountsRequest request) {
      HttpUrl.Builder _httpUrlBuilder = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
        .addPathSegment("/api/accounts")
        ;if (request.getOmit().isPresent()) {
          _httpUrlBuilder.addQueryParameter("omit", request.getOmit().get());
        }
        if (request.getFields().isPresent()) {
          _httpUrlBuilder.addQueryParameter("fields", request.getFields().get());
        }
        HttpUrl _httpUrl = _httpUrlBuilder.build()
            ;
        RequestBody _requestBody;
        try {
          _requestBody = RequestBody.create(ObjectMappers.JSON_MAPPER.writeValueAsBytes(request.getBody()), MediaType.parse("application/json"));
        }
        catch(Exception e) {
          throw new RuntimeException(e);
        }
        Request.Builder _requestBuilder = new Request.Builder()
          .url(_httpUrl)
          .method("POST", _requestBody)
          .headers(Headers.of(clientOptions.headers()))
          .addHeader("Content-Type", "application/json");
        Request _request = _requestBuilder.build();
        try {
          Response _response = clientOptions.httpClient().newCall(_request).execute();
          if (_response.isSuccessful()) {
            return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), new TypeReference<List<Optional<Account>>>() {});
          }
          throw new RuntimeException();
        }
        catch (Exception e) {
          throw new RuntimeException(e);
        }
      }

      @Override
      public List<Optional<Account>> patchAccounts(PatchAccountsRequest request) {
        HttpUrl.Builder _httpUrlBuilder = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
          .addPathSegment("/api/accounts")
          ;if (request.getOmit().isPresent()) {
            _httpUrlBuilder.addQueryParameter("omit", request.getOmit().get());
          }
          if (request.getFields().isPresent()) {
            _httpUrlBuilder.addQueryParameter("fields", request.getFields().get());
          }
          HttpUrl _httpUrl = _httpUrlBuilder.build()
              ;
          RequestBody _requestBody;
          try {
            _requestBody = RequestBody.create(ObjectMappers.JSON_MAPPER.writeValueAsBytes(request.getBody()), MediaType.parse("application/json"));
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
              return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), new TypeReference<List<Optional<Account>>>() {});
            }
            throw new RuntimeException();
          }
          catch (Exception e) {
            throw new RuntimeException(e);
          }
        }

        @Override
        public Optional<Account> detailAccount(String id, DetailAccountRequest request) {
          HttpUrl.Builder _httpUrlBuilder = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
            .addPathSegment("/api/accounts/")
            .addPathSegment(id)
            ;if (request.getOmit().isPresent()) {
              _httpUrlBuilder.addQueryParameter("omit", request.getOmit().get());
            }
            if (request.getFields().isPresent()) {
              _httpUrlBuilder.addQueryParameter("fields", request.getFields().get());
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
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), new TypeReference<Optional<Account>>() {});
              }
              throw new RuntimeException();
            }
            catch (Exception e) {
              throw new RuntimeException(e);
            }
          }

          @Override
          public void destroyAccount(String id) {
            HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
              .addPathSegment("/api/accounts/")
              .addPathSegment(id)
              .build();Request _request = new Request.Builder()
              .url(_httpUrl)
              .method("DELETE", null)
              .headers(Headers.of(clientOptions.headers()))
              .build();
            try {
              Response _response = clientOptions.httpClient().newCall(_request).execute();
              if (_response.isSuccessful()) {
                return;
              }
              throw new RuntimeException();
            }
            catch (Exception e) {
              throw new RuntimeException(e);
            }
          }
        }
