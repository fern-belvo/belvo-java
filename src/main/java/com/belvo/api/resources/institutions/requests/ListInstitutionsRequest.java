package com.belvo.api.resources.institutions.requests;

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
    builder = ListInstitutionsRequest.Builder.class
)
public final class ListInstitutionsRequest {
  private final Optional<Integer> page;

  private final Optional<Integer> pageSize;

  private final Optional<String> omit;

  private final Optional<String> fields;

  private final Optional<String> countryCode;

  private final Optional<String> countryCodeIn;

  private final Optional<String> displayName;

  private final Optional<String> name;

  private final Optional<String> nameIn;

  private final Optional<String> resourcesAllin;

  private final Optional<String> status;

  private final Optional<String> statusIn;

  private final Optional<String> type;

  private final Optional<String> typeIn;

  private final Optional<String> website;

  private int _cachedHashCode;

  ListInstitutionsRequest(Optional<Integer> page, Optional<Integer> pageSize, Optional<String> omit,
      Optional<String> fields, Optional<String> countryCode, Optional<String> countryCodeIn,
      Optional<String> displayName, Optional<String> name, Optional<String> nameIn,
      Optional<String> resourcesAllin, Optional<String> status, Optional<String> statusIn,
      Optional<String> type, Optional<String> typeIn, Optional<String> website) {
    this.page = page;
    this.pageSize = pageSize;
    this.omit = omit;
    this.fields = fields;
    this.countryCode = countryCode;
    this.countryCodeIn = countryCodeIn;
    this.displayName = displayName;
    this.name = name;
    this.nameIn = nameIn;
    this.resourcesAllin = resourcesAllin;
    this.status = status;
    this.statusIn = statusIn;
    this.type = type;
    this.typeIn = typeIn;
    this.website = website;
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

  /**
   * @return Return institutions only for this two-letter country code.
   */
  @JsonProperty("country_code")
  public Optional<String> getCountryCode() {
    return countryCode;
  }

  /**
   * @return Return institutions only for these two-letter country codes.
   */
  @JsonProperty("country_code__in")
  public Optional<String> getCountryCodeIn() {
    return countryCodeIn;
  }

  /**
   * @return Return institutions that partially match this display name.
   */
  @JsonProperty("display_name")
  public Optional<String> getDisplayName() {
    return displayName;
  }

  @JsonProperty("name")
  public Optional<String> getName() {
    return name;
  }

  /**
   * @return Return institutions with one or more of these Belvo-designated names.
   */
  @JsonProperty("name__in")
  public Optional<String> getNameIn() {
    return nameIn;
  }

  /**
   * @return Return institutions that support these resources.
   */
  @JsonProperty("resources__allin")
  public Optional<String> getResourcesAllin() {
    return resourcesAllin;
  }

  /**
   * @return Return institutions with the given status. You can choose between <code>healthy</code> or <code>down</code>.
   */
  @JsonProperty("status")
  public Optional<String> getStatus() {
    return status;
  }

  /**
   * @return Return institutions with one of the given statuses. You can choose between <code>healthy</code> or <code>down</code>.
   */
  @JsonProperty("status__in")
  public Optional<String> getStatusIn() {
    return statusIn;
  }

  /**
   * @return Return institutions of this type. You can choose between <code>bank</code> or <code>fiscal</code>.
   */
  @JsonProperty("type")
  public Optional<String> getType() {
    return type;
  }

  /**
   * @return Return institutions of one of these types. You can choose between <code>bank</code> or <code>fiscal</code>.
   */
  @JsonProperty("type__in")
  public Optional<String> getTypeIn() {
    return typeIn;
  }

  /**
   * @return Return institutions with this website URL.
   */
  @JsonProperty("website")
  public Optional<String> getWebsite() {
    return website;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof ListInstitutionsRequest && equalTo((ListInstitutionsRequest) other);
  }

  private boolean equalTo(ListInstitutionsRequest other) {
    return page.equals(other.page) && pageSize.equals(other.pageSize) && omit.equals(other.omit) && fields.equals(other.fields) && countryCode.equals(other.countryCode) && countryCodeIn.equals(other.countryCodeIn) && displayName.equals(other.displayName) && name.equals(other.name) && nameIn.equals(other.nameIn) && resourcesAllin.equals(other.resourcesAllin) && status.equals(other.status) && statusIn.equals(other.statusIn) && type.equals(other.type) && typeIn.equals(other.typeIn) && website.equals(other.website);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.page, this.pageSize, this.omit, this.fields, this.countryCode, this.countryCodeIn, this.displayName, this.name, this.nameIn, this.resourcesAllin, this.status, this.statusIn, this.type, this.typeIn, this.website);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "ListInstitutionsRequest{" + "page: " + page + ", pageSize: " + pageSize + ", omit: " + omit + ", fields: " + fields + ", countryCode: " + countryCode + ", countryCodeIn: " + countryCodeIn + ", displayName: " + displayName + ", name: " + name + ", nameIn: " + nameIn + ", resourcesAllin: " + resourcesAllin + ", status: " + status + ", statusIn: " + statusIn + ", type: " + type + ", typeIn: " + typeIn + ", website: " + website + "}";
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

    private Optional<String> countryCode = Optional.empty();

    private Optional<String> countryCodeIn = Optional.empty();

    private Optional<String> displayName = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Optional<String> nameIn = Optional.empty();

    private Optional<String> resourcesAllin = Optional.empty();

    private Optional<String> status = Optional.empty();

    private Optional<String> statusIn = Optional.empty();

    private Optional<String> type = Optional.empty();

    private Optional<String> typeIn = Optional.empty();

    private Optional<String> website = Optional.empty();

    private Builder() {
    }

    public Builder from(ListInstitutionsRequest other) {
      page(other.getPage());
      pageSize(other.getPageSize());
      omit(other.getOmit());
      fields(other.getFields());
      countryCode(other.getCountryCode());
      countryCodeIn(other.getCountryCodeIn());
      displayName(other.getDisplayName());
      name(other.getName());
      nameIn(other.getNameIn());
      resourcesAllin(other.getResourcesAllin());
      status(other.getStatus());
      statusIn(other.getStatusIn());
      type(other.getType());
      typeIn(other.getTypeIn());
      website(other.getWebsite());
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

    @JsonSetter(
        value = "country_code",
        nulls = Nulls.SKIP
    )
    public Builder countryCode(Optional<String> countryCode) {
      this.countryCode = countryCode;
      return this;
    }

    public Builder countryCode(String countryCode) {
      this.countryCode = Optional.of(countryCode);
      return this;
    }

    @JsonSetter(
        value = "country_code__in",
        nulls = Nulls.SKIP
    )
    public Builder countryCodeIn(Optional<String> countryCodeIn) {
      this.countryCodeIn = countryCodeIn;
      return this;
    }

    public Builder countryCodeIn(String countryCodeIn) {
      this.countryCodeIn = Optional.of(countryCodeIn);
      return this;
    }

    @JsonSetter(
        value = "display_name",
        nulls = Nulls.SKIP
    )
    public Builder displayName(Optional<String> displayName) {
      this.displayName = displayName;
      return this;
    }

    public Builder displayName(String displayName) {
      this.displayName = Optional.of(displayName);
      return this;
    }

    @JsonSetter(
        value = "name",
        nulls = Nulls.SKIP
    )
    public Builder name(Optional<String> name) {
      this.name = name;
      return this;
    }

    public Builder name(String name) {
      this.name = Optional.of(name);
      return this;
    }

    @JsonSetter(
        value = "name__in",
        nulls = Nulls.SKIP
    )
    public Builder nameIn(Optional<String> nameIn) {
      this.nameIn = nameIn;
      return this;
    }

    public Builder nameIn(String nameIn) {
      this.nameIn = Optional.of(nameIn);
      return this;
    }

    @JsonSetter(
        value = "resources__allin",
        nulls = Nulls.SKIP
    )
    public Builder resourcesAllin(Optional<String> resourcesAllin) {
      this.resourcesAllin = resourcesAllin;
      return this;
    }

    public Builder resourcesAllin(String resourcesAllin) {
      this.resourcesAllin = Optional.of(resourcesAllin);
      return this;
    }

    @JsonSetter(
        value = "status",
        nulls = Nulls.SKIP
    )
    public Builder status(Optional<String> status) {
      this.status = status;
      return this;
    }

    public Builder status(String status) {
      this.status = Optional.of(status);
      return this;
    }

    @JsonSetter(
        value = "status__in",
        nulls = Nulls.SKIP
    )
    public Builder statusIn(Optional<String> statusIn) {
      this.statusIn = statusIn;
      return this;
    }

    public Builder statusIn(String statusIn) {
      this.statusIn = Optional.of(statusIn);
      return this;
    }

    @JsonSetter(
        value = "type",
        nulls = Nulls.SKIP
    )
    public Builder type(Optional<String> type) {
      this.type = type;
      return this;
    }

    public Builder type(String type) {
      this.type = Optional.of(type);
      return this;
    }

    @JsonSetter(
        value = "type__in",
        nulls = Nulls.SKIP
    )
    public Builder typeIn(Optional<String> typeIn) {
      this.typeIn = typeIn;
      return this;
    }

    public Builder typeIn(String typeIn) {
      this.typeIn = Optional.of(typeIn);
      return this;
    }

    @JsonSetter(
        value = "website",
        nulls = Nulls.SKIP
    )
    public Builder website(Optional<String> website) {
      this.website = website;
      return this;
    }

    public Builder website(String website) {
      this.website = Optional.of(website);
      return this;
    }

    public ListInstitutionsRequest build() {
      return new ListInstitutionsRequest(page, pageSize, omit, fields, countryCode, countryCodeIn, displayName, name, nameIn, resourcesAllin, status, statusIn, type, typeIn, website);
    }
  }
}
