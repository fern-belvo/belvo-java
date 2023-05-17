package com.belvo.api.resources.institutions;

import com.belvo.api.core.ClientOptions;
import com.belvo.api.core.ObjectMappers;
import com.belvo.api.resources.institutions.requests.DetailInstitutionRequest;
import com.belvo.api.resources.institutions.requests.ListInstitutionsRequest;
import com.belvo.api.types.Institution;
import com.belvo.api.types.InstitutionsPaginatedResponse;
import java.lang.Exception;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public final class InstitutionsClientImpl implements InstitutionsClient {
  private final ClientOptions clientOptions;

  public InstitutionsClientImpl(ClientOptions clientOptions) {
    this.clientOptions = clientOptions;
  }

  @Override
  public InstitutionsPaginatedResponse listInstitutions(ListInstitutionsRequest request) {
    HttpUrl.Builder _httpUrlBuilder = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
      .addPathSegment("/api/institutions")
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
      if (request.getCountryCode().isPresent()) {
        _httpUrlBuilder.addQueryParameter("country_code", request.getCountryCode().get());
      }
      if (request.getCountryCodeIn().isPresent()) {
        _httpUrlBuilder.addQueryParameter("country_code__in", request.getCountryCodeIn().get());
      }
      if (request.getDisplayName().isPresent()) {
        _httpUrlBuilder.addQueryParameter("display_name", request.getDisplayName().get());
      }
      if (request.getName().isPresent()) {
        _httpUrlBuilder.addQueryParameter("name", request.getName().get());
      }
      if (request.getNameIn().isPresent()) {
        _httpUrlBuilder.addQueryParameter("name__in", request.getNameIn().get());
      }
      if (request.getResourcesAllin().isPresent()) {
        _httpUrlBuilder.addQueryParameter("resources__allin", request.getResourcesAllin().get());
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
      if (request.getWebsite().isPresent()) {
        _httpUrlBuilder.addQueryParameter("website", request.getWebsite().get());
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
          return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), InstitutionsPaginatedResponse.class);
        }
        throw new RuntimeException();
      }
      catch (Exception e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public Institution detailInstitution(String id, DetailInstitutionRequest request) {
      HttpUrl.Builder _httpUrlBuilder = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
        .addPathSegment("/api/institutions/")
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
            return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Institution.class);
          }
          throw new RuntimeException();
        }
        catch (Exception e) {
          throw new RuntimeException(e);
        }
      }
    }
