package com.belvo.api.resources.incomes.requests;

import com.belvo.api.types.PatchBody;
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
    builder = PatchIncomesRequest.Builder.class
)
public final class PatchIncomesRequest {
  private final Optional<String> omit;

  private final Optional<String> fields;

  private final PatchBody body;

  private int _cachedHashCode;

  PatchIncomesRequest(Optional<String> omit, Optional<String> fields, PatchBody body) {
    this.omit = omit;
    this.fields = fields;
    this.body = body;
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

  /**
   * @return A JSON object containing a session UUID and a MFA token
   */
  @JsonProperty("body")
  public PatchBody getBody() {
    return body;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof PatchIncomesRequest && equalTo((PatchIncomesRequest) other);
  }

  private boolean equalTo(PatchIncomesRequest other) {
    return omit.equals(other.omit) && fields.equals(other.fields) && body.equals(other.body);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.omit, this.fields, this.body);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "PatchIncomesRequest{" + "omit: " + omit + ", fields: " + fields + ", body: " + body + "}";
  }

  public static BodyStage builder() {
    return new Builder();
  }

  public interface BodyStage {
    _FinalStage body(PatchBody body);

    Builder from(PatchIncomesRequest other);
  }

  public interface _FinalStage {
    PatchIncomesRequest build();

    _FinalStage omit(Optional<String> omit);

    _FinalStage omit(String omit);

    _FinalStage fields(Optional<String> fields);

    _FinalStage fields(String fields);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements BodyStage, _FinalStage {
    private PatchBody body;

    private Optional<String> fields = Optional.empty();

    private Optional<String> omit = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(PatchIncomesRequest other) {
      omit(other.getOmit());
      fields(other.getFields());
      body(other.getBody());
      return this;
    }

    /**
     * <p>A JSON object containing a session UUID and a MFA token</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("body")
    public _FinalStage body(PatchBody body) {
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
    public PatchIncomesRequest build() {
      return new PatchIncomesRequest(omit, fields, body);
    }
  }
}
