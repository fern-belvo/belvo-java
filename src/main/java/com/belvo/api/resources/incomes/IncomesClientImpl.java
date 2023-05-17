package com.belvo.api.resources.incomes;

import com.belvo.api.core.ClientOptions;
import com.belvo.api.core.ObjectMappers;
import com.belvo.api.resources.incomes.requests.DetailIncomeRequest;
import com.belvo.api.resources.incomes.requests.IncomesRequest;
import com.belvo.api.resources.incomes.requests.ListIncomesRequest;
import com.belvo.api.resources.incomes.requests.PatchIncomesRequest;
import com.belvo.api.types.Income;
import com.belvo.api.types.IncomesPaginatedResponse;
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

public final class IncomesClientImpl implements IncomesClient {
  private final ClientOptions clientOptions;

  public IncomesClientImpl(ClientOptions clientOptions) {
    this.clientOptions = clientOptions;
  }

  @Override
  public IncomesPaginatedResponse listIncomes(ListIncomesRequest request) {
    HttpUrl.Builder _httpUrlBuilder = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
      .addPathSegment("/api/incomes")
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
      if (request.getAccount().isPresent()) {
        _httpUrlBuilder.addQueryParameter("account", request.getAccount().get());
      }
      if (request.getAccountIn().isPresent()) {
        _httpUrlBuilder.addQueryParameter("account__in", request.getAccountIn().get());
      }
      if (request.getLink().isPresent()) {
        _httpUrlBuilder.addQueryParameter("link", request.getLink().get());
      }
      if (request.getLinkIn().isPresent()) {
        _httpUrlBuilder.addQueryParameter("link__in", request.getLinkIn().get());
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
          return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), IncomesPaginatedResponse.class);
        }
        throw new RuntimeException();
      }
      catch (Exception e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public Income retrieveIncome(IncomesRequest request) {
      HttpUrl.Builder _httpUrlBuilder = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
        .addPathSegment("/api/incomes")
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
        _requestBodyProperties.put("allowed_income_types", request.getAllowedIncomeTypes());
        _requestBodyProperties.put("minimum_confidence_level", request.getMinimumConfidenceLevel());
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
            return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Income.class);
          }
          throw new RuntimeException();
        }
        catch (Exception e) {
          throw new RuntimeException(e);
        }
      }

      @Override
      public List<Income> patchIncomes(PatchIncomesRequest request) {
        HttpUrl.Builder _httpUrlBuilder = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
          .addPathSegment("/api/incomes")
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
              return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), new TypeReference<List<Income>>() {});
            }
            throw new RuntimeException();
          }
          catch (Exception e) {
            throw new RuntimeException(e);
          }
        }

        @Override
        public List<Income> detailIncome(String id, DetailIncomeRequest request) {
          HttpUrl.Builder _httpUrlBuilder = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
            .addPathSegment("/api/incomes/")
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
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), new TypeReference<List<Income>>() {});
              }
              throw new RuntimeException();
            }
            catch (Exception e) {
              throw new RuntimeException(e);
            }
          }

          @Override
          public void destroyIncomes(String id) {
            HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
              .addPathSegment("/api/incomes/")
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
