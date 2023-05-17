package com.belvo.api.resources.receivabletransactions;

import com.belvo.api.core.ClientOptions;
import com.belvo.api.core.ObjectMappers;
import com.belvo.api.resources.receivabletransactions.requests.DetailReceivableTransactionRequest;
import com.belvo.api.resources.receivabletransactions.requests.ListReceivableTransactionsRequest;
import com.belvo.api.resources.receivabletransactions.requests.ReceivableTransactionRequest;
import com.belvo.api.types.ReceivablesTransaction;
import com.belvo.api.types.ReceivablesTransactionsPaginatedResponse;
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

public final class ReceivableTransactionsClientImpl implements ReceivableTransactionsClient {
  private final ClientOptions clientOptions;

  public ReceivableTransactionsClientImpl(ClientOptions clientOptions) {
    this.clientOptions = clientOptions;
  }

  @Override
  public ReceivablesTransactionsPaginatedResponse listReceivableTransactions(
      ListReceivableTransactionsRequest request) {
    HttpUrl.Builder _httpUrlBuilder = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
      .addPathSegment("/receivables/transactions")
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
          return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), ReceivablesTransactionsPaginatedResponse.class);
        }
        throw new RuntimeException();
      }
      catch (Exception e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public ReceivablesTransaction retrieveReceivableTransactions(
        ReceivableTransactionRequest request) {
      HttpUrl.Builder _httpUrlBuilder = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
        .addPathSegment("/receivables/transactions")
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
            return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), ReceivablesTransaction.class);
          }
          throw new RuntimeException();
        }
        catch (Exception e) {
          throw new RuntimeException(e);
        }
      }

      @Override
      public ReceivablesTransaction detailReceivableTransaction(String id,
          DetailReceivableTransactionRequest request) {
        HttpUrl.Builder _httpUrlBuilder = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
          .addPathSegment("/receivables/transactions/")
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
              return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), ReceivablesTransaction.class);
            }
            throw new RuntimeException();
          }
          catch (Exception e) {
            throw new RuntimeException(e);
          }
        }

        @Override
        public void destroyReceivableTransaction(String id) {
          HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
            .addPathSegment("/receivables/transactions/")
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
