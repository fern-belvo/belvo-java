package com.belvo.api.resources.employmentrecords;

import com.belvo.api.core.ClientOptions;
import com.belvo.api.core.ObjectMappers;
import com.belvo.api.resources.employmentrecords.requests.DetailEmploymentRecordRequest;
import com.belvo.api.resources.employmentrecords.requests.EmploymentRecordRequest;
import com.belvo.api.resources.employmentrecords.requests.ListEmploymentRecordsRequest;
import com.belvo.api.types.EmploymentRecord;
import com.belvo.api.types.EmploymentRecordsPaginatedResponse;
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

public final class EmploymentRecordsClientImpl implements EmploymentRecordsClient {
  private final ClientOptions clientOptions;

  public EmploymentRecordsClientImpl(ClientOptions clientOptions) {
    this.clientOptions = clientOptions;
  }

  @Override
  public EmploymentRecordsPaginatedResponse listEmploymentRecords(
      ListEmploymentRecordsRequest request) {
    HttpUrl.Builder _httpUrlBuilder = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
      .addPathSegment("/api/employment-records")
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
          return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), EmploymentRecordsPaginatedResponse.class);
        }
        throw new RuntimeException();
      }
      catch (Exception e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public List<EmploymentRecord> retrieveEmploymentRecordDetails(EmploymentRecordRequest request) {
      HttpUrl.Builder _httpUrlBuilder = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
        .addPathSegment("/api/employment-records")
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
        _requestBodyProperties.put("attach_pdf", request.getAttachPdf());
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
            return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), new TypeReference<List<EmploymentRecord>>() {});
          }
          throw new RuntimeException();
        }
        catch (Exception e) {
          throw new RuntimeException(e);
        }
      }

      @Override
      public EmploymentRecord detailEmploymentRecord(String id,
          DetailEmploymentRecordRequest request) {
        HttpUrl.Builder _httpUrlBuilder = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
          .addPathSegment("/api/employment-records/")
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
              return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), EmploymentRecord.class);
            }
            throw new RuntimeException();
          }
          catch (Exception e) {
            throw new RuntimeException(e);
          }
        }

        @Override
        public void destroyEmploymentRecord(String id) {
          HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
            .addPathSegment("/api/employment-records/")
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
