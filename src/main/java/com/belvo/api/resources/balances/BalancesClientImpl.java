package com.belvo.api.resources.balances;

import com.belvo.api.core.ClientOptions;
import com.belvo.api.core.ObjectMappers;
import com.belvo.api.resources.balances.requests.BalancesRequest;
import com.belvo.api.resources.balances.requests.DetailBalanceRequest;
import com.belvo.api.resources.balances.requests.ListBalancesRequest;
import com.belvo.api.resources.balances.requests.PatchBalancesRequest;
import com.belvo.api.types.Balance;
import com.belvo.api.types.BalancesPaginatedResponse;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public final class BalancesClientImpl implements BalancesClient {
  private final ClientOptions clientOptions;

  public BalancesClientImpl(ClientOptions clientOptions) {
    this.clientOptions = clientOptions;
  }

  @Override
  public BalancesPaginatedResponse listBalances(ListBalancesRequest request) {
    HttpUrl.Builder _httpUrlBuilder = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
      .addPathSegment("/api/balances")
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
      if (request.getAccount().isPresent()) {
        _httpUrlBuilder.addQueryParameter("account", request.getAccount().get());
      }
      if (request.getAccountIn().isPresent()) {
        _httpUrlBuilder.addQueryParameter("account__in", request.getAccountIn().get());
      }
      if (request.getAccountType().isPresent()) {
        _httpUrlBuilder.addQueryParameter("account__type", request.getAccountType().get());
      }
      if (request.getAccountTypeIn().isPresent()) {
        _httpUrlBuilder.addQueryParameter("account__type__in", request.getAccountTypeIn().get());
      }
      if (request.getBalance().isPresent()) {
        _httpUrlBuilder.addQueryParameter("balance", request.getBalance().get());
      }
      if (request.getBalanceLt().isPresent()) {
        _httpUrlBuilder.addQueryParameter("balance__lt", request.getBalanceLt().get());
      }
      if (request.getBalanceLte().isPresent()) {
        _httpUrlBuilder.addQueryParameter("balance__lte", request.getBalanceLte().get());
      }
      if (request.getBalanceGt().isPresent()) {
        _httpUrlBuilder.addQueryParameter("balance__gt", request.getBalanceGt().get());
      }
      if (request.getBalanceGte().isPresent()) {
        _httpUrlBuilder.addQueryParameter("balance__gte", request.getBalanceGte().get());
      }
      if (request.getBalanceRange().isPresent()) {
        _httpUrlBuilder.addQueryParameter("balance__range", request.getBalanceRange().get());
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
      if (request.getValueDate().isPresent()) {
        _httpUrlBuilder.addQueryParameter("value_date", request.getValueDate().get());
      }
      if (request.getValueDateGt().isPresent()) {
        _httpUrlBuilder.addQueryParameter("value_date__gt", request.getValueDateGt().get());
      }
      if (request.getValueDateGte().isPresent()) {
        _httpUrlBuilder.addQueryParameter("value_date__gte", request.getValueDateGte().get());
      }
      if (request.getValueDateLt().isPresent()) {
        _httpUrlBuilder.addQueryParameter("value_date__lt", request.getValueDateLt().get());
      }
      if (request.getValueDateLte().isPresent()) {
        _httpUrlBuilder.addQueryParameter("value_date__lte", request.getValueDateLte().get());
      }
      if (request.getValueDateRange().isPresent()) {
        _httpUrlBuilder.addQueryParameter("value_date__range", request.getValueDateRange().get());
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
          return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), BalancesPaginatedResponse.class);
        }
        throw new RuntimeException();
      }
      catch (Exception e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public List<Balance> retrieveBalances(BalancesRequest request) {
      HttpUrl.Builder _httpUrlBuilder = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
        .addPathSegment("/api/balances")
        ;if (request.getOmit().isPresent()) {
          _httpUrlBuilder.addQueryParameter("omit", request.getOmit().get());
        }
        if (request.getFields().isPresent()) {
          _httpUrlBuilder.addQueryParameter("fields", request.getFields().get());
        }
        HttpUrl _httpUrl = _httpUrlBuilder.build()
            ;
        Map<String, Object> _requestBodyProperties = new HashMap<>();
        _requestBodyProperties.put("link", request.getLink());
        _requestBodyProperties.put("account", request.getAccount());
        _requestBodyProperties.put("date_from", request.getDateFrom());
        _requestBodyProperties.put("date_to", request.getDateTo());
        _requestBodyProperties.put("token", request.getToken());
        _requestBodyProperties.put("save_data", request.getSaveData());
        RequestBody _requestBody;
        try {
          _requestBody = RequestBody.create(ObjectMappers.JSON_MAPPER.writeValueAsBytes(_requestBodyProperties), MediaType.parse("application/json"));
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
            return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), new TypeReference<List<Balance>>() {});
          }
          throw new RuntimeException();
        }
        catch (Exception e) {
          throw new RuntimeException(e);
        }
      }

      @Override
      public List<Balance> patchBalances(PatchBalancesRequest request) {
        HttpUrl.Builder _httpUrlBuilder = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
          .addPathSegment("/api/balances")
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
              return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), new TypeReference<List<Balance>>() {});
            }
            throw new RuntimeException();
          }
          catch (Exception e) {
            throw new RuntimeException(e);
          }
        }

        @Override
        public Balance detailBalance(String id, DetailBalanceRequest request) {
          HttpUrl.Builder _httpUrlBuilder = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
            .addPathSegment("/api/balances/")
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
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Balance.class);
              }
              throw new RuntimeException();
            }
            catch (Exception e) {
              throw new RuntimeException(e);
            }
          }

          @Override
          public void destroyBalance(String id) {
            HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
              .addPathSegment("/api/balances/")
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
