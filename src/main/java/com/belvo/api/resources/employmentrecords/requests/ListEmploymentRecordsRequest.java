package com.belvo.api.resources.employmentrecords.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = ListEmploymentRecordsRequest.Builder.class
)
public final class ListEmploymentRecordsRequest {
  private final Optional<Integer> page;

  private final Optional<Integer> pageSize;

  private final Optional<String> omit;

  private final Optional<String> fields;

  private int _cachedHashCode;

  ListEmploymentRecordsRequest(Optional<Integer> page, Optional<Integer> pageSize,
      Optional<String> omit, Optional<String> fields) {
    this.page = page;
    this.pageSize = pageSize;
    this.omit = omit;
    this.fields = fields;
  }

  /**
   * @return A page number within the paginated result set.
   */
  @JsonProperty("page")
  public Optional<Integer> getPage() {
    return page;
  }

  /**
   * @return Indicates how many results to return per page. By default we return 100 results per page.
   * <p>ℹ️ The minimum number of results returned per page is 1 and the maximum is 1000. If you enter a value greater than 1000, our API will default to the maximum value (1000).</p>
   */
  @JsonProperty("page_size")
  public Optional<Integer> getPageSize() {
    return pageSize;
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
    return other instanceof ListEmploymentRecordsRequest && equalTo((ListEmploymentRecordsRequest) other);
  }

  private boolean equalTo(ListEmploymentRecordsRequest other) {
    return page.equals(other.page) && pageSize.equals(other.pageSize) && omit.equals(other.omit) && fields.equals(other.fields);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.page, this.pageSize, this.omit, this.fields);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "ListEmploymentRecordsRequest{" + "page: " + page + ", pageSize: " + pageSize + ", omit: " + omit + ", fields: " + fields + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<Integer> page = Optional.empty();

    private Optional<Integer> pageSize = Optional.empty();

    private Optional<String> omit = Optional.empty();

    private Optional<String> fields = Optional.empty();

    private Builder() {
    }

    public Builder from(ListEmploymentRecordsRequest other) {
      page(other.getPage());
      pageSize(other.getPageSize());
      omit(other.getOmit());
      fields(other.getFields());
      return this;
    }

    @JsonSetter(
        value = "page",
        nulls = Nulls.SKIP
    )
    public Builder page(Optional<Integer> page) {
      this.page = page;
      return this;
    }

    public Builder page(Integer page) {
      this.page = Optional.of(page);
      return this;
    }

    @JsonSetter(
        value = "page_size",
        nulls = Nulls.SKIP
    )
    public Builder pageSize(Optional<Integer> pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    public Builder pageSize(Integer pageSize) {
      this.pageSize = Optional.of(pageSize);
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

    public ListEmploymentRecordsRequest build() {
      return new ListEmploymentRecordsRequest(page, pageSize, omit, fields);
    }
  }
}
