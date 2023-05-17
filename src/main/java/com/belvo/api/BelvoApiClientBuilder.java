package com.belvo.api;

import com.belvo.api.core.ClientOptions;
import com.belvo.api.core.Environment;
import java.lang.String;
import java.util.Base64;

public final class BelvoApiClientBuilder {
  private ClientOptions.Builder clientOptionsBuilder = ClientOptions.builder();

  private Environment environment = Environment.PRODUCTION;

  public BelvoApiClientBuilder credentials(String username, String password) {
    String unencodedToken = username + ":" + password;
    String encodedToken = Base64.getEncoder().encodeToString(unencodedToken.getBytes());
    this.clientOptionsBuilder.addHeader("Authorization", "Basic " + encodedToken);
    return this;
  }

  public BelvoApiClientBuilder environment(Environment environment) {
    this.environment = environment;
    return this;
  }

  public BelvoApiClientBuilder url(String url) {
    this.environment = Environment.custom(url);
    return this;
  }

  public BelvoApiClient build() {
    clientOptionsBuilder.environment(this.environment);
    return new BelvoApiClientImpl(clientOptionsBuilder.build());
  }
}
