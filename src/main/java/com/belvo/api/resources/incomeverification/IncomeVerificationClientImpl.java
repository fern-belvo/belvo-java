package com.belvo.api.resources.incomeverification;

import com.belvo.api.core.ClientOptions;
import com.belvo.api.core.ObjectMappers;
import com.belvo.api.resources.incomeverification.requests.EyodIncomeVerificationRequest;
import com.belvo.api.types.Income;
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

public final class IncomeVerificationClientImpl implements IncomeVerificationClient {
  private final ClientOptions clientOptions;

  public IncomeVerificationClientImpl(ClientOptions clientOptions) {
    this.clientOptions = clientOptions;
  }

  @Override
  public List<Income> verifyIncome(EyodIncomeVerificationRequest request) {
    HttpUrl.Builder _httpUrlBuilder = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
      .addPathSegment("/api/enrich/incomes")
      ;HttpUrl _httpUrl = _httpUrlBuilder.build()
          ;
      Map<String, Object> _requestBodyProperties = new HashMap<>();
      _requestBodyProperties.put("language", request.getLanguage());
      _requestBodyProperties.put("transactions", request.getTransactions());
      _requestBodyProperties.put("date_from", request.getDateFrom());
      _requestBodyProperties.put("date_to", request.getDateTo());
      _requestBodyProperties.put("allowed_income_types", request.getAllowedIncomeTypes());
      _requestBodyProperties.put("minimum_confidence_level", request.getMinimumConfidenceLevel());
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
          return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), new TypeReference<List<Income>>() {});
        }
        throw new RuntimeException();
      }
      catch (Exception e) {
        throw new RuntimeException(e);
      }
    }
  }
