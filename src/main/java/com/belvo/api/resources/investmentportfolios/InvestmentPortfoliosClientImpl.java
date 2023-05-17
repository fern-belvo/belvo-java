package com.belvo.api.resources.investmentportfolios;

import com.belvo.api.core.ClientOptions;
import com.belvo.api.core.ObjectMappers;
import com.belvo.api.resources.investmentportfolios.requests.DetailPortfolioRequest;
import com.belvo.api.resources.investmentportfolios.requests.ListPortfolioRequest;
import com.belvo.api.resources.investmentportfolios.requests.PatchPortfolioRequest;
import com.belvo.api.resources.investmentportfolios.requests.RetrievePortfolioRequest;
import com.belvo.api.types.InvestmentsPortfolio;
import com.belvo.api.types.InvestmentsPortfoliosPaginatedResponse;
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

public final class InvestmentPortfoliosClientImpl implements InvestmentPortfoliosClient {
  private final ClientOptions clientOptions;

  public InvestmentPortfoliosClientImpl(ClientOptions clientOptions) {
    this.clientOptions = clientOptions;
  }

  @Override
  public InvestmentsPortfoliosPaginatedResponse listPortfolio(ListPortfolioRequest request) {
    HttpUrl.Builder _httpUrlBuilder = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
      .addPathSegment("/investments/portfolios")
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
          return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), InvestmentsPortfoliosPaginatedResponse.class);
        }
        throw new RuntimeException();
      }
      catch (Exception e) {
        throw new RuntimeException(e);
      }
    }

    @Override
    public InvestmentsPortfolio retrievePortfolio(RetrievePortfolioRequest request) {
      HttpUrl.Builder _httpUrlBuilder = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
        .addPathSegment("/investments/portfolios")
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
            return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), InvestmentsPortfolio.class);
          }
          throw new RuntimeException();
        }
        catch (Exception e) {
          throw new RuntimeException(e);
        }
      }

      @Override
      public InvestmentsPortfolio patchPortfolio(PatchPortfolioRequest request) {
        HttpUrl.Builder _httpUrlBuilder = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
          .addPathSegment("/investments/portfolios")
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
              return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), InvestmentsPortfolio.class);
            }
            throw new RuntimeException();
          }
          catch (Exception e) {
            throw new RuntimeException(e);
          }
        }

        @Override
        public InvestmentsPortfolio detailPortfolio(String id, DetailPortfolioRequest request) {
          HttpUrl.Builder _httpUrlBuilder = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
            .addPathSegment("/investments/portfolios/")
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
                return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), InvestmentsPortfolio.class);
              }
              throw new RuntimeException();
            }
            catch (Exception e) {
              throw new RuntimeException(e);
            }
          }

          @Override
          public void destroyPortfolio(String id) {
            HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
              .addPathSegment("/investments/portfolios/")
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
