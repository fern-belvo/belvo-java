package com.belvo.api.resources.invoices;

import com.belvo.api.core.ClientOptions;
import com.belvo.api.core.ObjectMappers;
import com.belvo.api.resources.invoices.requests.DetailInvoiceRequest;
import com.belvo.api.resources.invoices.requests.InvoicesRequest;
import com.belvo.api.resources.invoices.requests.ListInvoicesRequest;
import com.belvo.api.resources.invoices.requests.PatchInvoicesRequest;
import com.belvo.api.types.DetailInvoiceResponse;
import com.belvo.api.types.InvoicesResponsePaginatedResponse;
import com.belvo.api.types.PatchInvoicesResponseItem;
import com.belvo.api.types.RetrieveInvoicesResponseItem;
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

public final class InvoicesClientImpl implements InvoicesClient {
  private final ClientOptions clientOptions;

  public InvoicesClientImpl(ClientOptions clientOptions) {
    this.clientOptions = clientOptions;
  }

  @Override
  public InvoicesResponsePaginatedResponse listInvoices(ListInvoicesRequest request) {
    HttpUrl.Builder _httpUrlBuilder = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
      .addPathSegment("/api/invoices")
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
      if (request.getId().isPresent()) {
        _httpUrlBuilder.addQueryParameter("id", request.getId().get());
      }
      if (request.getIdIn().isPresent()) {
        _httpUrlBuilder.addQueryParameter("id__in", request.getIdIn().get());
      }
      if (request.getInvoiceDate().isPresent()) {
        _httpUrlBuilder.addQueryParameter("invoice_date", request.getInvoiceDate().get());
      }
      if (request.getInvoiceDateLt().isPresent()) {
        _httpUrlBuilder.addQueryParameter("invoice_date__lt", request.getInvoiceDateLt().get());
      }
      if (request.getInvoiceDateLte().isPresent()) {
        _httpUrlBuilder.addQueryParameter("invoice_date__lte", request.getInvoiceDateLte().get());
      }
      if (request.getInvoiceDateGt().isPresent()) {
        _httpUrlBuilder.addQueryParameter("invoice_date__gt", request.getInvoiceDateGt().get());
      }
      if (request.getInvoiceDateGte().isPresent()) {
        _httpUrlBuilder.addQueryParameter("invoice_date__gte", request.getInvoiceDateGte().get());
      }
      if (request.getInvoiceDateRange().isPresent()) {
        _httpUrlBuilder.addQueryParameter("invoice_date__range", request.getInvoiceDateRange().get());
      }
      if (request.getInvoiceIdentification().isPresent()) {
        _httpUrlBuilder.addQueryParameter("invoice_identification", request.getInvoiceIdentification().get());
      }
      if (request.getInvoiceIdentificationIn().isPresent()) {
        _httpUrlBuilder.addQueryParameter("invoice_identification__in", request.getInvoiceIdentificationIn().get());
      }
      if (request.getLinkIn().isPresent()) {
        _httpUrlBuilder.addQueryParameter("link__in", request.getLinkIn().get());
      }
      if (request.getStatus().isPresent()) {
        _httpUrlBuilder.addQueryParameter("status", request.getStatus().get());
      }
      if (request.getStatusIn().isPresent()) {
        _httpUrlBuilder.addQueryParameter("status__in", request.getStatusIn().get());
      }
      if (request.getTotalAmount().isPresent()) {
        _httpUrlBuilder.addQueryParameter("total_amount", request.getTotalAmount().get());
      }
      if (request.getTotalAmountLt().isPresent()) {
        _httpUrlBuilder.addQueryParameter("total_amount__lt", request.getTotalAmountLt().get());
      }
      if (request.getTotalAmountLte().isPresent()) {
        _httpUrlBuilder.addQueryParameter("total_amount__lte", request.getTotalAmountLte().get());
      }
      if (request.getTotalAmountGt().isPresent()) {
        _httpUrlBuilder.addQueryParameter("total_amount__gt", request.getTotalAmountGt().get());
      }
      if (request.getTotalAmountGte().isPresent()) {
        _httpUrlBuilder.addQueryParameter("total_amount__gte", request.getTotalAmountGte().get());
      }
      if (request.getTotalAmountRange().isPresent()) {
        _httpUrlBuilder.addQueryParameter("total_amount__range", request.getTotalAmountRange().get());
      }
      if (request.getType().isPresent()) {
        _httpUrlBuilder.addQueryParameter("type", request.getType().get());
      }
      if (request.getTypeIn().isPresent()) {
        _httpUrlBuilder.addQueryParameter("type__in", request.getTypeIn().get());
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
          return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), InvoicesResponsePaginatedResponse.class);
        }
        throw new RuntimeException();
      }
      catch (Exception e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public List<RetrieveInvoicesResponseItem> retrieveInvoices(InvoicesRequest request) {
      HttpUrl.Builder _httpUrlBuilder = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
        .addPathSegment("/api/invoices")
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
        _requestBodyProperties.put("type", request.getType());
        _requestBodyProperties.put("attach_xml", request.getAttachXml());
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
            return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), new TypeReference<List<RetrieveInvoicesResponseItem>>() {});
          }
          throw new RuntimeException();
        }
        catch (Exception e) {
          throw new RuntimeException(e);
        }
      }

      @Override
      public List<PatchInvoicesResponseItem> patchInvoices(PatchInvoicesRequest request) {
        HttpUrl.Builder _httpUrlBuilder = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
          .addPathSegment("/api/invoices")
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
              return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), new TypeReference<List<PatchInvoicesResponseItem>>() {});
            }
            throw new RuntimeException();
          }
          catch (Exception e) {
            throw new RuntimeException(e);
          }
        }

        @Override
        public DetailInvoiceResponse detailInvoice(String id, DetailInvoiceRequest request) {
          HttpUrl.Builder _httpUrlBuilder = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
            .addPathSegment("/api/invoices/")
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
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), DetailInvoiceResponse.class);
              }
              throw new RuntimeException();
            }
            catch (Exception e) {
              throw new RuntimeException(e);
            }
          }

          @Override
          public void destroyInvoice(String id) {
            HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
              .addPathSegment("/api/invoices/")
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
