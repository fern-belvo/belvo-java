package com.belvo.api.resources.secretkeys;

import com.belvo.api.core.ClientOptions;
import com.belvo.api.core.ObjectMappers;
import com.belvo.api.types.SecretKeys;
import com.belvo.api.types.SecretKeysPaginatedResponse;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Exception;
import java.lang.Override;
import java.lang.RuntimeException;
import java.util.List;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;

public final class SecretKeysClientImpl implements SecretKeysClient {
  private final ClientOptions clientOptions;

  public SecretKeysClientImpl(ClientOptions clientOptions) {
    this.clientOptions = clientOptions;
  }

  @Override
  public SecretKeysPaginatedResponse listSecretKeys() {
    HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
      .addPathSegment("/payments/secret-keys")
      .build();Request _request = new Request.Builder()
      .url(_httpUrl)
      .method("GET", null)
      .headers(Headers.of(clientOptions.headers()))
      .addHeader("Content-Type", "application/json")
      .build();
    try {
      Response _response = clientOptions.httpClient().newCall(_request).execute();
      if (_response.isSuccessful()) {
        return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), SecretKeysPaginatedResponse.class);
      }
      throw new RuntimeException();
    }
    catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public List<SecretKeys> createSecretKeys() {
    HttpUrl _httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl()).newBuilder()
      .addPathSegment("/payments/secret-keys")
      .build();Request _request = new Request.Builder()
      .url(_httpUrl)
      .method("POST", null)
      .headers(Headers.of(clientOptions.headers()))
      .addHeader("Content-Type", "application/json")
      .build();
    try {
      Response _response = clientOptions.httpClient().newCall(_request).execute();
      if (_response.isSuccessful()) {
        return ObjectMappers.JSON_MAPPER.readValue(_response.body().string(), new TypeReference<List<SecretKeys>>() {});
      }
      throw new RuntimeException();
    }
    catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
