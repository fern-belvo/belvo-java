package com.belvo.api.resources.transactions;

import com.belvo.api.core.ClientOptions;
import com.belvo.api.core.ObjectMappers;
import com.belvo.api.resources.transactions.requests.DetailTransactionRequest;
import com.belvo.api.resources.transactions.requests.ListTransactionsRequest;
import com.belvo.api.resources.transactions.requests.PatchTransactionsRequest;
import com.belvo.api.resources.transactions.requests.RetrieveTransactionsAsyncRequest;
import com.belvo.api.resources.transactions.requests.RetrieveTransactionsRequest;
import com.belvo.api.types.AsynchronousAccepted202;
import com.belvo.api.types.Transaction;
import com.belvo.api.types.TransactionsPaginatedResponse;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Exception;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.List;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public final class TransactionsClientImpl implements TransactionsClient {
  private final ClientOptions clientOptions;

  public TransactionsClientImpl(ClientOptions clientOptions) {
    this.clientOptions = clientOptions;
  }

  @Override
  public TransactionsPaginatedResponse listTransactions(ListTransactionsRequest request) {
    HttpUrl.Builder _httpUrlBuilder = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
      .addPathSegment("/api/transactions")
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
      _httpUrlBuilder.addQueryParameter("link", request.getLink());
      if (request.getAccount().isPresent()) {
        _httpUrlBuilder.addQueryParameter("account", request.getAccount().get());
      }
      if (request.getAccountBalanceAvailable().isPresent()) {
        _httpUrlBuilder.addQueryParameter("account__balance__available", request.getAccountBalanceAvailable().get());
      }
      if (request.getAccountBalanceAvailableLt().isPresent()) {
        _httpUrlBuilder.addQueryParameter("account__balance__available__lt", request.getAccountBalanceAvailableLt().get());
      }
      if (request.getAccountBalanceAvailableLte().isPresent()) {
        _httpUrlBuilder.addQueryParameter("account__balance__available__lte", request.getAccountBalanceAvailableLte().get());
      }
      if (request.getAccountBalanceAvailableRange().isPresent()) {
        _httpUrlBuilder.addQueryParameter("account__balance__available__range", request.getAccountBalanceAvailableRange().get());
      }
      if (request.getAccountBalanceCurrent().isPresent()) {
        _httpUrlBuilder.addQueryParameter("account__balance__current", request.getAccountBalanceCurrent().get());
      }
      if (request.getAccountBalanceCurrentGt().isPresent()) {
        _httpUrlBuilder.addQueryParameter("account__balance__current__gt", request.getAccountBalanceCurrentGt().get());
      }
      if (request.getAccountBalanceCurrentGte().isPresent()) {
        _httpUrlBuilder.addQueryParameter("account__balance__current__gte", request.getAccountBalanceCurrentGte().get());
      }
      if (request.getAccountBalanceCurrentLt().isPresent()) {
        _httpUrlBuilder.addQueryParameter("account__balance__current__lt", request.getAccountBalanceCurrentLt().get());
      }
      if (request.getAccountBalanceCurrentLte().isPresent()) {
        _httpUrlBuilder.addQueryParameter("account__balance__current__lte", request.getAccountBalanceCurrentLte().get());
      }
      if (request.getAccountBalanceCurrentRange().isPresent()) {
        _httpUrlBuilder.addQueryParameter("account__balance__current__range", request.getAccountBalanceCurrentRange().get());
      }
      if (request.getAccountIn().isPresent()) {
        _httpUrlBuilder.addQueryParameter("account__in", request.getAccountIn().get());
      }
      if (request.getAccountType().isPresent()) {
        _httpUrlBuilder.addQueryParameter("account_type", request.getAccountType().get());
      }
      if (request.getAccountTypeIn().isPresent()) {
        _httpUrlBuilder.addQueryParameter("account_type__in", request.getAccountTypeIn().get());
      }
      if (request.getAccountingDate().isPresent()) {
        _httpUrlBuilder.addQueryParameter("accounting_date", request.getAccountingDate().get());
      }
      if (request.getAccountingDateGt().isPresent()) {
        _httpUrlBuilder.addQueryParameter("accounting_date__gt", request.getAccountingDateGt().get());
      }
      if (request.getAccountingDateGte().isPresent()) {
        _httpUrlBuilder.addQueryParameter("accounting_date__gte", request.getAccountingDateGte().get());
      }
      if (request.getAccountingDateLt().isPresent()) {
        _httpUrlBuilder.addQueryParameter("accounting_date__lt", request.getAccountingDateLt().get());
      }
      if (request.getAccountingDateLte().isPresent()) {
        _httpUrlBuilder.addQueryParameter("accounting_date__lte", request.getAccountingDateLte().get());
      }
      if (request.getAccountingDateRange().isPresent()) {
        _httpUrlBuilder.addQueryParameter("accounting_date__range", request.getAccountingDateRange().get());
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
      if (request.getCollectedAt().isPresent()) {
        _httpUrlBuilder.addQueryParameter("collected_at", request.getCollectedAt().get());
      }
      if (request.getCollectedAtGt().isPresent()) {
        _httpUrlBuilder.addQueryParameter("collected_at__gt", request.getCollectedAtGt().get());
      }
      if (request.getCollectedAtGte().isPresent()) {
        _httpUrlBuilder.addQueryParameter("collected_at__gte", request.getCollectedAtGte().get());
      }
      if (request.getCollectedAtLt().isPresent()) {
        _httpUrlBuilder.addQueryParameter("collected_at__lt", request.getCollectedAtLt().get());
      }
      if (request.getCollectedAtLte().isPresent()) {
        _httpUrlBuilder.addQueryParameter("collected_at__lte", request.getCollectedAtLte().get());
      }
      if (request.getCollectedAtRange().isPresent()) {
        _httpUrlBuilder.addQueryParameter("collected_at__range", request.getCollectedAtRange().get());
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
      if (request.getCreditCardDataBillNameIn().isPresent()) {
        _httpUrlBuilder.addQueryParameter("credit_card_data__bill_name__in", request.getCreditCardDataBillNameIn().get());
      }
      if (request.getCurrency().isPresent()) {
        _httpUrlBuilder.addQueryParameter("currency", request.getCurrency().get());
      }
      if (request.getCurrencyIn().isPresent()) {
        _httpUrlBuilder.addQueryParameter("currency__in", request.getCurrencyIn().get());
      }
      if (request.getReference().isPresent()) {
        _httpUrlBuilder.addQueryParameter("reference", request.getReference().get());
      }
      if (request.getReferenceIn().isPresent()) {
        _httpUrlBuilder.addQueryParameter("reference__in", request.getReferenceIn().get());
      }
      if (request.getStatus().isPresent()) {
        _httpUrlBuilder.addQueryParameter("status", request.getStatus().get());
      }
      if (request.getStatusIn().isPresent()) {
        _httpUrlBuilder.addQueryParameter("status__in", request.getStatusIn().get());
      }
      if (request.getType().isPresent()) {
        _httpUrlBuilder.addQueryParameter("type", request.getType().get());
      }
      if (request.getTypeIn().isPresent()) {
        _httpUrlBuilder.addQueryParameter("type__in", request.getTypeIn().get());
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
          return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), TransactionsPaginatedResponse.class);
        }
        throw new RuntimeException();
      }
      catch (Exception e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public List<Transaction> retrieveTransactions(RetrieveTransactionsRequest request) {
      HttpUrl.Builder _httpUrlBuilder = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
        .addPathSegment("/api/transactions")
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
            return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), new TypeReference<List<Transaction>>() {});
          }
          throw new RuntimeException();
        }
        catch (Exception e) {
          throw new RuntimeException(e);
        }
      }

      @Override
      public AsynchronousAccepted202 retrieveTransactionsAsync(
          RetrieveTransactionsAsyncRequest request) {
        HttpUrl.Builder _httpUrlBuilder = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
          .addPathSegment("/api/transactions")
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
          _requestBuilder.addHeader("X-Belvo-Request-Mode", request.getBelvoRequestMode());
          Request _request = _requestBuilder.build();
          try {
            Response _response = clientOptions.httpClient().newCall(_request).execute();
            if (_response.isSuccessful()) {
              return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), AsynchronousAccepted202.class);
            }
            throw new RuntimeException();
          }
          catch (Exception e) {
            throw new RuntimeException(e);
          }
        }

        @Override
        public List<Transaction> patchTransactions(PatchTransactionsRequest request) {
          HttpUrl.Builder _httpUrlBuilder = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
            .addPathSegment("/api/transactions")
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
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), new TypeReference<List<Transaction>>() {});
              }
              throw new RuntimeException();
            }
            catch (Exception e) {
              throw new RuntimeException(e);
            }
          }

          @Override
          public Transaction detailTransaction(String id, DetailTransactionRequest request) {
            HttpUrl.Builder _httpUrlBuilder = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
              .addPathSegment("/api/transactions/")
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
                  return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Transaction.class);
                }
                throw new RuntimeException();
              }
              catch (Exception e) {
                throw new RuntimeException(e);
              }
            }

            @Override
            public void destroyTransaction(String id) {
              HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
                .addPathSegment("/api/transactions/")
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
