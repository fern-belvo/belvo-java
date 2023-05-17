package com.belvo.api.resources.transactions.requests;

import com.belvo.api.types.TransactionsRequest;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = RetrieveTransactionsAsyncRequest.Builder.class
)
public final class RetrieveTransactionsAsyncRequest {
  private final String belvoRequestMode;

  private final Optional<String> omit;

  private final Optional<String> fields;

  private final TransactionsRequest body;

  private int _cachedHashCode;

  RetrieveTransactionsAsyncRequest(String belvoRequestMode, Optional<String> omit,
      Optional<String> fields, TransactionsRequest body) {
    this.belvoRequestMode = belvoRequestMode;
    this.omit = omit;
    this.fields = fields;
    this.body = body;
  }

  @JsonProperty("X-Belvo-Request-Mode")
  public String getBelvoRequestMode() {
    return belvoRequestMode;
  }

  /**
   * @return Omit certain fields from being returned in the response. For more information, see our <a href="https://developers.belvo.com/docs/searching-and-filtering">Filtering responses</a> DevPortal article.
   */
  @JsonProperty("omit")
  public Optional<String> getOmit() {
    return omit;
  }

  /**
   * @return Return only the specified fields in the response. For more information, see our <a href="https://developers.belvo.com/docs/searching-and-filtering">Filtering responses</a> DevPortal article.
   */
  @JsonProperty("fields")
  public Optional<String> getFields() {
    return fields;
  }

  @JsonProperty("body")
  public TransactionsRequest getBody() {
    return body;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof RetrieveTransactionsAsyncRequest && equalTo((RetrieveTransactionsAsyncRequest) other);
  }

  private boolean equalTo(RetrieveTransactionsAsyncRequest other) {
    return belvoRequestMode.equals(other.belvoRequestMode) && omit.equals(other.omit) && fields.equals(other.fields) && body.equals(other.body);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.belvoRequestMode, this.omit, this.fields, this.body);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "RetrieveTransactionsAsyncRequest{" + "belvoRequestMode: " + belvoRequestMode + ", omit: " + omit + ", fields: " + fields + ", body: " + body + "}";
  }

  public static BelvoRequestModeStage builder() {
    return new Builder();
  }

  public interface BelvoRequestModeStage {
    BodyStage belvoRequestMode(String belvoRequestMode);

    Builder from(RetrieveTransactionsAsyncRequest other);
  }

  public interface BodyStage {
    _FinalStage body(TransactionsRequest body);
  }

  public interface _FinalStage {
    RetrieveTransactionsAsyncRequest build();

    _FinalStage omit(Optional<String> omit);

    _FinalStage omit(String omit);

    _FinalStage fields(Optional<String> fields);

    _FinalStage fields(String fields);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements BelvoRequestModeStage, BodyStage, _FinalStage {
    private String belvoRequestMode;

    private TransactionsRequest body;

    private Optional<String> fields = Optional.empty();

    private Optional<String> omit = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(RetrieveTransactionsAsyncRequest other) {
      belvoRequestMode(other.getBelvoRequestMode());
      omit(other.getOmit());
      fields(other.getFields());
      body(other.getBody());
      return this;
    }

    @Override
    @JsonSetter("X-Belvo-Request-Mode")
    public BodyStage belvoRequestMode(String belvoRequestMode) {
      this.belvoRequestMode = belvoRequestMode;
      return this;
    }

    @Override
    @JsonSetter("body")
    public _FinalStage body(TransactionsRequest body) {
      this.body = body;
      return this;
    }

    /**
     * <p>Return only the specified fields in the response. For more information, see our <a href="https://developers.belvo.com/docs/searching-and-filtering">Filtering responses</a> DevPortal article.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage fields(String fields) {
      this.fields = Optional.of(fields);
      return this;
    }

    @Override
    @JsonSetter(
        value = "fields",
        nulls = Nulls.SKIP
    )
    public _FinalStage fields(Optional<String> fields) {
      this.fields = fields;
      return this;
    }

    /**
     * <p>Omit certain fields from being returned in the response. For more information, see our <a href="https://developers.belvo.com/docs/searching-and-filtering">Filtering responses</a> DevPortal article.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage omit(String omit) {
      this.omit = Optional.of(omit);
      return this;
    }

    @Override
    @JsonSetter(
        value = "omit",
        nulls = Nulls.SKIP
    )
    public _FinalStage omit(Optional<String> omit) {
      this.omit = omit;
      return this;
    }

    @Override
    public RetrieveTransactionsAsyncRequest build() {
      return new RetrieveTransactionsAsyncRequest(belvoRequestMode, omit, fields, body);
    }
  }
}
