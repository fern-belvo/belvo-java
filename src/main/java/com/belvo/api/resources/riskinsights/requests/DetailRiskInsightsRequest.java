package com.belvo.api.resources.riskinsights.requests;

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
    builder = DetailRiskInsightsRequest.Builder.class
)
public final class DetailRiskInsightsRequest {
  private final Optional<String> omit;

  private final Optional<String> fields;

  private int _cachedHashCode;

  DetailRiskInsightsRequest(Optional<String> omit, Optional<String> fields) {
    this.omit = omit;
    this.fields = fields;
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

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof DetailRiskInsightsRequest && equalTo((DetailRiskInsightsRequest) other);
  }

  private boolean equalTo(DetailRiskInsightsRequest other) {
    return omit.equals(other.omit) && fields.equals(other.fields);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.omit, this.fields);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "DetailRiskInsightsRequest{" + "omit: " + omit + ", fields: " + fields + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> omit = Optional.empty();

    private Optional<String> fields = Optional.empty();

    private Builder() {
    }

    public Builder from(DetailRiskInsightsRequest other) {
      omit(other.getOmit());
      fields(other.getFields());
      return this;
    }

    @JsonSetter(
        value = "omit",
        nulls = Nulls.SKIP
    )
    public Builder omit(Optional<String> omit) {
      this.omit = omit;
      return this;
    }

    public Builder omit(String omit) {
      this.omit = Optional.of(omit);
      return this;
    }

    @JsonSetter(
        value = "fields",
        nulls = Nulls.SKIP
    )
    public Builder fields(Optional<String> fields) {
      this.fields = fields;
      return this;
    }

    public Builder fields(String fields) {
      this.fields = Optional.of(fields);
      return this;
    }

    public DetailRiskInsightsRequest build() {
      return new DetailRiskInsightsRequest(omit, fields);
    }
  }
}