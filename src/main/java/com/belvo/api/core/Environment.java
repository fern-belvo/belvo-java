package com.belvo.api.core;

import java.lang.String;

public final class Environment {
  public static final Environment PRODUCTION = new Environment("https://api.belvo.com");

  public static final Environment SANDBOX = new Environment("https://sandbox.belvo.com");

  public static final Environment DEVELOPMENT = new Environment("https://development.belvo.com");

  private final String url;

  private Environment(String url) {
    this.url = url;
  }

  public String getUrl() {
    return this.url;
  }

  public static Environment custom(String url) {
    return new Environment(url);
  }
}
