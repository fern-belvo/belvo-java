package com.belvo.api.resources.links;

import com.belvo.api.core.ClientOptions;
import com.belvo.api.core.ObjectMappers;
import com.belvo.api.resources.links.requests.ChangeAccessMode;
import com.belvo.api.resources.links.requests.DetailLinkRequest;
import com.belvo.api.resources.links.requests.LinksPutRequest;
import com.belvo.api.resources.links.requests.LinksRequest;
import com.belvo.api.resources.links.requests.ListLinksRequest;
import com.belvo.api.resources.links.requests.PatchLinksRequest;
import com.belvo.api.types.Link;
import com.belvo.api.types.PaginatedResponseLink;
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

public final class LinksClientImpl implements LinksClient {
  private final ClientOptions clientOptions;

  public LinksClientImpl(ClientOptions clientOptions) {
    this.clientOptions = clientOptions;
  }

  @Override
  public PaginatedResponseLink listLinks(ListLinksRequest request) {
    HttpUrl.Builder _httpUrlBuilder = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
      .addPathSegment("/api/links")
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
      if (request.getAccessMode().isPresent()) {
        _httpUrlBuilder.addQueryParameter("access_mode", request.getAccessMode().get());
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
      if (request.getCreatedByNotIn().isPresent()) {
        _httpUrlBuilder.addQueryParameter("created_by__not_in", request.getCreatedByNotIn().get());
      }
      if (request.getExternalId().isPresent()) {
        _httpUrlBuilder.addQueryParameter("external_id", request.getExternalId().get());
      }
      if (request.getExternalIdIn().isPresent()) {
        _httpUrlBuilder.addQueryParameter("external_id__in", request.getExternalIdIn().get());
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
      if (request.getInstitutionUserId().isPresent()) {
        _httpUrlBuilder.addQueryParameter("institution_user_id", request.getInstitutionUserId().get());
      }
      if (request.getInstitutionUserIdIn().isPresent()) {
        _httpUrlBuilder.addQueryParameter("institution_user_id__in", request.getInstitutionUserIdIn().get());
      }
      if (request.getRefreshRate().isPresent()) {
        _httpUrlBuilder.addQueryParameter("refresh_rate", request.getRefreshRate().get());
      }
      if (request.getStatus().isPresent()) {
        _httpUrlBuilder.addQueryParameter("status", request.getStatus().get());
      }
      if (request.getStatusIn().isPresent()) {
        _httpUrlBuilder.addQueryParameter("status__in", request.getStatusIn().get());
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
          return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), PaginatedResponseLink.class);
        }
        throw new RuntimeException();
      }
      catch (Exception e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public Link registerLink(LinksRequest request) {
      HttpUrl.Builder _httpUrlBuilder = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
        .addPathSegment("/api/links")
        ;if (request.getOmit().isPresent()) {
          _httpUrlBuilder.addQueryParameter("omit", request.getOmit().get());
        }
        if (request.getFields().isPresent()) {
          _httpUrlBuilder.addQueryParameter("fields", request.getFields().get());
        }
        HttpUrl _httpUrl = _httpUrlBuilder.build()
            ;
        Map<String, Object> _requestBodyProperties = new HashMap<>();
        _requestBodyProperties.put("institution", request.getInstitution());
        _requestBodyProperties.put("username", request.getUsername());
        _requestBodyProperties.put("password", request.getPassword());
        _requestBodyProperties.put("external_id", request.getExternalId());
        _requestBodyProperties.put("username2", request.getUsername2());
        _requestBodyProperties.put("username3", request.getUsername3());
        _requestBodyProperties.put("password2", request.getPassword2());
        _requestBodyProperties.put("token", request.getToken());
        _requestBodyProperties.put("access_mode", request.getAccessMode());
        _requestBodyProperties.put("fetch_historical", request.getFetchHistorical());
        _requestBodyProperties.put("credentials_storage", request.getCredentialsStorage());
        _requestBodyProperties.put("username_type", request.getUsernameType());
        _requestBodyProperties.put("certificate", request.getCertificate());
        _requestBodyProperties.put("private_key", request.getPrivateKey());
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
            return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Link.class);
          }
          throw new RuntimeException();
        }
        catch (Exception e) {
          throw new RuntimeException(e);
        }
      }

      @Override
      public Link patchLinks(PatchLinksRequest request) {
        HttpUrl.Builder _httpUrlBuilder = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
          .addPathSegment("/api/links")
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
              return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Link.class);
            }
            throw new RuntimeException();
          }
          catch (Exception e) {
            throw new RuntimeException(e);
          }
        }

        @Override
        public Link detailLink(String id, DetailLinkRequest request) {
          HttpUrl.Builder _httpUrlBuilder = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
            .addPathSegment("/api/links/")
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
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Link.class);
              }
              throw new RuntimeException();
            }
            catch (Exception e) {
              throw new RuntimeException(e);
            }
          }

          @Override
          public Link updateLink(String id, LinksPutRequest request) {
            HttpUrl.Builder _httpUrlBuilder = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
              .addPathSegment("/api/links/")
              .addPathSegment(id)
              ;if (request.getOmit().isPresent()) {
                _httpUrlBuilder.addQueryParameter("omit", request.getOmit().get());
              }
              if (request.getFields().isPresent()) {
                _httpUrlBuilder.addQueryParameter("fields", request.getFields().get());
              }
              HttpUrl _httpUrl = _httpUrlBuilder.build()
                  ;
              Map<String, Object> _requestBodyProperties = new HashMap<>();
              _requestBodyProperties.put("password", request.getPassword());
              _requestBodyProperties.put("password2", request.getPassword2());
              _requestBodyProperties.put("token", request.getToken());
              _requestBodyProperties.put("username_type", request.getUsernameType());
              _requestBodyProperties.put("certificate", request.getCertificate());
              _requestBodyProperties.put("private_key", request.getPrivateKey());
              RequestBody _requestBody;
              try {
                _requestBody = RequestBody.create(ObjectMappers.JSON_MAPPER.writeValueAsBytes(_requestBodyProperties), MediaType.parse("application/json"));
              }
              catch(Exception e) {
                throw new RuntimeException(e);
              }
              Request.Builder _requestBuilder = new Request.Builder()
                .url(_httpUrl)
                .method("PUT", _requestBody)
                .headers(Headers.of(clientOptions.headers()))
                .addHeader("Content-Type", "application/json");
              Request _request = _requestBuilder.build();
              try {
                Response _response = clientOptions.httpClient().newCall(_request).execute();
                if (_response.isSuccessful()) {
                  return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Link.class);
                }
                throw new RuntimeException();
              }
              catch (Exception e) {
                throw new RuntimeException(e);
              }
            }

            @Override
            public Link changeLinkAccessMode(String id, ChangeAccessMode request) {
              HttpUrl.Builder _httpUrlBuilder = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
                .addPathSegment("/api/links/")
                .addPathSegment(id)
                ;if (request.getOmit().isPresent()) {
                  _httpUrlBuilder.addQueryParameter("omit", request.getOmit().get());
                }
                if (request.getFields().isPresent()) {
                  _httpUrlBuilder.addQueryParameter("fields", request.getFields().get());
                }
                HttpUrl _httpUrl = _httpUrlBuilder.build()
                    ;
                Map<String, Object> _requestBodyProperties = new HashMap<>();
                _requestBodyProperties.put("access_mode", request.getAccessMode());
                RequestBody _requestBody;
                try {
                  _requestBody = RequestBody.create(ObjectMappers.JSON_MAPPER.writeValueAsBytes(_requestBodyProperties), MediaType.parse("application/json"));
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
                    return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), Link.class);
                  }
                  throw new RuntimeException();
                }
                catch (Exception e) {
                  throw new RuntimeException(e);
                }
              }

              @Override
              public void destroyLink(String id) {
                HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
                  .addPathSegment("/api/links/")
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
