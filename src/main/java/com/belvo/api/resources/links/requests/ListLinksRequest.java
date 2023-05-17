package com.belvo.api.resources.links.requests;

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
    builder = ListLinksRequest.Builder.class
)
public final class ListLinksRequest {
  private final Optional<Integer> page;

  private final Optional<Integer> pageSize;

  private final Optional<String> omit;

  private final Optional<String> fields;

  private final Optional<String> accessMode;

  private final Optional<String> createdAt;

  private final Optional<String> createdAtGt;

  private final Optional<String> createdAtGte;

  private final Optional<String> createdAtLt;

  private final Optional<String> createdAtLte;

  private final Optional<String> createdAtRange;

  private final Optional<String> createdByNotIn;

  private final Optional<String> externalId;

  private final Optional<String> externalIdIn;

  private final Optional<String> id;

  private final Optional<String> idIn;

  private final Optional<String> institution;

  private final Optional<String> institutionIn;

  private final Optional<String> institutionUserId;

  private final Optional<String> institutionUserIdIn;

  private final Optional<String> refreshRate;

  private final Optional<String> status;

  private final Optional<String> statusIn;

  private int _cachedHashCode;

  ListLinksRequest(Optional<Integer> page, Optional<Integer> pageSize, Optional<String> omit,
      Optional<String> fields, Optional<String> accessMode, Optional<String> createdAt,
      Optional<String> createdAtGt, Optional<String> createdAtGte, Optional<String> createdAtLt,
      Optional<String> createdAtLte, Optional<String> createdAtRange,
      Optional<String> createdByNotIn, Optional<String> externalId, Optional<String> externalIdIn,
      Optional<String> id, Optional<String> idIn, Optional<String> institution,
      Optional<String> institutionIn, Optional<String> institutionUserId,
      Optional<String> institutionUserIdIn, Optional<String> refreshRate, Optional<String> status,
      Optional<String> statusIn) {
    this.page = page;
    this.pageSize = pageSize;
    this.omit = omit;
    this.fields = fields;
    this.accessMode = accessMode;
    this.createdAt = createdAt;
    this.createdAtGt = createdAtGt;
    this.createdAtGte = createdAtGte;
    this.createdAtLt = createdAtLt;
    this.createdAtLte = createdAtLte;
    this.createdAtRange = createdAtRange;
    this.createdByNotIn = createdByNotIn;
    this.externalId = externalId;
    this.externalIdIn = externalIdIn;
    this.id = id;
    this.idIn = idIn;
    this.institution = institution;
    this.institutionIn = institutionIn;
    this.institutionUserId = institutionUserId;
    this.institutionUserIdIn = institutionUserIdIn;
    this.refreshRate = refreshRate;
    this.status = status;
    this.statusIn = statusIn;
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
   * @return Return links only with this access mode. Can be either <code>single</code> or <code>recurrent</code>.
   */
  @JsonProperty("access_mode")
  public Optional<String> getAccessMode() {
    return accessMode;
  }

  /**
   * @return Return links that were last updated in Belvo's database on this date (<code>YYYY-MM-DD</code> or full <code>ISO-8601</code> timestamp).
   */
  @JsonProperty("created_at")
  public Optional<String> getCreatedAt() {
    return createdAt;
  }

  /**
   * @return Return links that were last updated in Belvo's database after this date (<code>YYYY-MM-DD</code> or full <code>ISO-8601</code> timestamp).
   */
  @JsonProperty("created_at__gt")
  public Optional<String> getCreatedAtGt() {
    return createdAtGt;
  }

  /**
   * @return Return links that were last updated in Belvo's database after or on this date (<code>YYYY-MM-DD</code> or full <code>ISO-8601</code> timestamp).
   */
  @JsonProperty("created_at__gte")
  public Optional<String> getCreatedAtGte() {
    return createdAtGte;
  }

  /**
   * @return Return links that were last updated in Belvo's database before this date (<code>YYYY-MM-DD</code> or full <code>ISO-8601</code> timestamp).
   */
  @JsonProperty("created_at__lt")
  public Optional<String> getCreatedAtLt() {
    return createdAtLt;
  }

  /**
   * @return Return links that were last updated in Belvo's database before or on this date (<code>YYYY-MM-DD</code> or full <code>ISO-8601</code> timestamp).
   */
  @JsonProperty("created_at__lte")
  public Optional<String> getCreatedAtLte() {
    return createdAtLte;
  }

  /**
   * @return Return links that were last updated in Belvo's database between two dates (<code>YYYY-MM-DD</code> or full <code>ISO-8601</code> timestamp).
   */
  @JsonProperty("created_at__range")
  public Optional<String> getCreatedAtRange() {
    return createdAtRange;
  }

  /**
   * @return Return links that were not created by these Belvo users.
   */
  @JsonProperty("created_by__not_in")
  public Optional<String> getCreatedByNotIn() {
    return createdByNotIn;
  }

  /**
   * @return Return links with this external ID.
   */
  @JsonProperty("external_id")
  public Optional<String> getExternalId() {
    return externalId;
  }

  /**
   * @return Return links with these external IDs.
   */
  @JsonProperty("external_id__in")
  public Optional<String> getExternalIdIn() {
    return externalIdIn;
  }

  /**
   * @return Return information only for this <code>link.id</code>.
   */
  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
  }

  /**
   * @return Return information only for these <code>link.id</code>s.
   */
  @JsonProperty("id__in")
  public Optional<String> getIdIn() {
    return idIn;
  }

  /**
   * @return Return links created for this institution (use the Belvo-designated name, such as <code>erebor_mx_retail</code>).
   */
  @JsonProperty("institution")
  public Optional<String> getInstitution() {
    return institution;
  }

  /**
   * @return Return links created for these institutions (use the Belvo-designated name, such as <code>erebor_mx_retail</code> and <code>gringotts_co_retail</code>).
   */
  @JsonProperty("institution__in")
  public Optional<String> getInstitutionIn() {
    return institutionIn;
  }

  /**
   * @return Return links with this specific institution user ID.
   */
  @JsonProperty("institution_user_id")
  public Optional<String> getInstitutionUserId() {
    return institutionUserId;
  }

  /**
   * @return Return links with these institution user IDs.
   */
  @JsonProperty("institution_user_id__in")
  public Optional<String> getInstitutionUserIdIn() {
    return institutionUserIdIn;
  }

  /**
   * @return Return links with this refresh rate. Choose between <code>6h</code>, <code>12h</code>, <code>24h</code>, <code>7d</code>, or <code>30d</code>.
   */
  @JsonProperty("refresh_rate")
  public Optional<String> getRefreshRate() {
    return refreshRate;
  }

  /**
   * @return Return links with this status. Choose between <code>valid</code>, <code>invalid</code>, <code>unconfirmed</code>, or <code>token_required</code>.
   */
  @JsonProperty("status")
  public Optional<String> getStatus() {
    return status;
  }

  /**
   * @return Return links with these statuses. Choose between <code>valid</code>, <code>invalid</code>, <code>unconfirmed</code>, or <code>token_required</code>.
   */
  @JsonProperty("status__in")
  public Optional<String> getStatusIn() {
    return statusIn;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof ListLinksRequest && equalTo((ListLinksRequest) other);
  }

  private boolean equalTo(ListLinksRequest other) {
    return page.equals(other.page) && pageSize.equals(other.pageSize) && omit.equals(other.omit) && fields.equals(other.fields) && accessMode.equals(other.accessMode) && createdAt.equals(other.createdAt) && createdAtGt.equals(other.createdAtGt) && createdAtGte.equals(other.createdAtGte) && createdAtLt.equals(other.createdAtLt) && createdAtLte.equals(other.createdAtLte) && createdAtRange.equals(other.createdAtRange) && createdByNotIn.equals(other.createdByNotIn) && externalId.equals(other.externalId) && externalIdIn.equals(other.externalIdIn) && id.equals(other.id) && idIn.equals(other.idIn) && institution.equals(other.institution) && institutionIn.equals(other.institutionIn) && institutionUserId.equals(other.institutionUserId) && institutionUserIdIn.equals(other.institutionUserIdIn) && refreshRate.equals(other.refreshRate) && status.equals(other.status) && statusIn.equals(other.statusIn);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.page, this.pageSize, this.omit, this.fields, this.accessMode, this.createdAt, this.createdAtGt, this.createdAtGte, this.createdAtLt, this.createdAtLte, this.createdAtRange, this.createdByNotIn, this.externalId, this.externalIdIn, this.id, this.idIn, this.institution, this.institutionIn, this.institutionUserId, this.institutionUserIdIn, this.refreshRate, this.status, this.statusIn);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "ListLinksRequest{" + "page: " + page + ", pageSize: " + pageSize + ", omit: " + omit + ", fields: " + fields + ", accessMode: " + accessMode + ", createdAt: " + createdAt + ", createdAtGt: " + createdAtGt + ", createdAtGte: " + createdAtGte + ", createdAtLt: " + createdAtLt + ", createdAtLte: " + createdAtLte + ", createdAtRange: " + createdAtRange + ", createdByNotIn: " + createdByNotIn + ", externalId: " + externalId + ", externalIdIn: " + externalIdIn + ", id: " + id + ", idIn: " + idIn + ", institution: " + institution + ", institutionIn: " + institutionIn + ", institutionUserId: " + institutionUserId + ", institutionUserIdIn: " + institutionUserIdIn + ", refreshRate: " + refreshRate + ", status: " + status + ", statusIn: " + statusIn + "}";
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

    private Optional<String> accessMode = Optional.empty();

    private Optional<String> createdAt = Optional.empty();

    private Optional<String> createdAtGt = Optional.empty();

    private Optional<String> createdAtGte = Optional.empty();

    private Optional<String> createdAtLt = Optional.empty();

    private Optional<String> createdAtLte = Optional.empty();

    private Optional<String> createdAtRange = Optional.empty();

    private Optional<String> createdByNotIn = Optional.empty();

    private Optional<String> externalId = Optional.empty();

    private Optional<String> externalIdIn = Optional.empty();

    private Optional<String> id = Optional.empty();

    private Optional<String> idIn = Optional.empty();

    private Optional<String> institution = Optional.empty();

    private Optional<String> institutionIn = Optional.empty();

    private Optional<String> institutionUserId = Optional.empty();

    private Optional<String> institutionUserIdIn = Optional.empty();

    private Optional<String> refreshRate = Optional.empty();

    private Optional<String> status = Optional.empty();

    private Optional<String> statusIn = Optional.empty();

    private Builder() {
    }

    public Builder from(ListLinksRequest other) {
      page(other.getPage());
      pageSize(other.getPageSize());
      omit(other.getOmit());
      fields(other.getFields());
      accessMode(other.getAccessMode());
      createdAt(other.getCreatedAt());
      createdAtGt(other.getCreatedAtGt());
      createdAtGte(other.getCreatedAtGte());
      createdAtLt(other.getCreatedAtLt());
      createdAtLte(other.getCreatedAtLte());
      createdAtRange(other.getCreatedAtRange());
      createdByNotIn(other.getCreatedByNotIn());
      externalId(other.getExternalId());
      externalIdIn(other.getExternalIdIn());
      id(other.getId());
      idIn(other.getIdIn());
      institution(other.getInstitution());
      institutionIn(other.getInstitutionIn());
      institutionUserId(other.getInstitutionUserId());
      institutionUserIdIn(other.getInstitutionUserIdIn());
      refreshRate(other.getRefreshRate());
      status(other.getStatus());
      statusIn(other.getStatusIn());
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
        value = "access_mode",
        nulls = Nulls.SKIP
    )
    public Builder accessMode(Optional<String> accessMode) {
      this.accessMode = accessMode;
      return this;
    }

    public Builder accessMode(String accessMode) {
      this.accessMode = Optional.of(accessMode);
      return this;
    }

    @JsonSetter(
        value = "created_at",
        nulls = Nulls.SKIP
    )
    public Builder createdAt(Optional<String> createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    public Builder createdAt(String createdAt) {
      this.createdAt = Optional.of(createdAt);
      return this;
    }

    @JsonSetter(
        value = "created_at__gt",
        nulls = Nulls.SKIP
    )
    public Builder createdAtGt(Optional<String> createdAtGt) {
      this.createdAtGt = createdAtGt;
      return this;
    }

    public Builder createdAtGt(String createdAtGt) {
      this.createdAtGt = Optional.of(createdAtGt);
      return this;
    }

    @JsonSetter(
        value = "created_at__gte",
        nulls = Nulls.SKIP
    )
    public Builder createdAtGte(Optional<String> createdAtGte) {
      this.createdAtGte = createdAtGte;
      return this;
    }

    public Builder createdAtGte(String createdAtGte) {
      this.createdAtGte = Optional.of(createdAtGte);
      return this;
    }

    @JsonSetter(
        value = "created_at__lt",
        nulls = Nulls.SKIP
    )
    public Builder createdAtLt(Optional<String> createdAtLt) {
      this.createdAtLt = createdAtLt;
      return this;
    }

    public Builder createdAtLt(String createdAtLt) {
      this.createdAtLt = Optional.of(createdAtLt);
      return this;
    }

    @JsonSetter(
        value = "created_at__lte",
        nulls = Nulls.SKIP
    )
    public Builder createdAtLte(Optional<String> createdAtLte) {
      this.createdAtLte = createdAtLte;
      return this;
    }

    public Builder createdAtLte(String createdAtLte) {
      this.createdAtLte = Optional.of(createdAtLte);
      return this;
    }

    @JsonSetter(
        value = "created_at__range",
        nulls = Nulls.SKIP
    )
    public Builder createdAtRange(Optional<String> createdAtRange) {
      this.createdAtRange = createdAtRange;
      return this;
    }

    public Builder createdAtRange(String createdAtRange) {
      this.createdAtRange = Optional.of(createdAtRange);
      return this;
    }

    @JsonSetter(
        value = "created_by__not_in",
        nulls = Nulls.SKIP
    )
    public Builder createdByNotIn(Optional<String> createdByNotIn) {
      this.createdByNotIn = createdByNotIn;
      return this;
    }

    public Builder createdByNotIn(String createdByNotIn) {
      this.createdByNotIn = Optional.of(createdByNotIn);
      return this;
    }

    @JsonSetter(
        value = "external_id",
        nulls = Nulls.SKIP
    )
    public Builder externalId(Optional<String> externalId) {
      this.externalId = externalId;
      return this;
    }

    public Builder externalId(String externalId) {
      this.externalId = Optional.of(externalId);
      return this;
    }

    @JsonSetter(
        value = "external_id__in",
        nulls = Nulls.SKIP
    )
    public Builder externalIdIn(Optional<String> externalIdIn) {
      this.externalIdIn = externalIdIn;
      return this;
    }

    public Builder externalIdIn(String externalIdIn) {
      this.externalIdIn = Optional.of(externalIdIn);
      return this;
    }

    @JsonSetter(
        value = "id",
        nulls = Nulls.SKIP
    )
    public Builder id(Optional<String> id) {
      this.id = id;
      return this;
    }

    public Builder id(String id) {
      this.id = Optional.of(id);
      return this;
    }

    @JsonSetter(
        value = "id__in",
        nulls = Nulls.SKIP
    )
    public Builder idIn(Optional<String> idIn) {
      this.idIn = idIn;
      return this;
    }

    public Builder idIn(String idIn) {
      this.idIn = Optional.of(idIn);
      return this;
    }

    @JsonSetter(
        value = "institution",
        nulls = Nulls.SKIP
    )
    public Builder institution(Optional<String> institution) {
      this.institution = institution;
      return this;
    }

    public Builder institution(String institution) {
      this.institution = Optional.of(institution);
      return this;
    }

    @JsonSetter(
        value = "institution__in",
        nulls = Nulls.SKIP
    )
    public Builder institutionIn(Optional<String> institutionIn) {
      this.institutionIn = institutionIn;
      return this;
    }

    public Builder institutionIn(String institutionIn) {
      this.institutionIn = Optional.of(institutionIn);
      return this;
    }

    @JsonSetter(
        value = "institution_user_id",
        nulls = Nulls.SKIP
    )
    public Builder institutionUserId(Optional<String> institutionUserId) {
      this.institutionUserId = institutionUserId;
      return this;
    }

    public Builder institutionUserId(String institutionUserId) {
      this.institutionUserId = Optional.of(institutionUserId);
      return this;
    }

    @JsonSetter(
        value = "institution_user_id__in",
        nulls = Nulls.SKIP
    )
    public Builder institutionUserIdIn(Optional<String> institutionUserIdIn) {
      this.institutionUserIdIn = institutionUserIdIn;
      return this;
    }

    public Builder institutionUserIdIn(String institutionUserIdIn) {
      this.institutionUserIdIn = Optional.of(institutionUserIdIn);
      return this;
    }

    @JsonSetter(
        value = "refresh_rate",
        nulls = Nulls.SKIP
    )
    public Builder refreshRate(Optional<String> refreshRate) {
      this.refreshRate = refreshRate;
      return this;
    }

    public Builder refreshRate(String refreshRate) {
      this.refreshRate = Optional.of(refreshRate);
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

    public ListLinksRequest build() {
      return new ListLinksRequest(page, pageSize, omit, fields, accessMode, createdAt, createdAtGt, createdAtGte, createdAtLt, createdAtLte, createdAtRange, createdByNotIn, externalId, externalIdIn, id, idIn, institution, institutionIn, institutionUserId, institutionUserIdIn, refreshRate, status, statusIn);
    }
  }
}
