package com.belvo.api.types;

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
    builder = Link.Builder.class
)
public final class Link {
  private final Optional<String> id;

  private final Optional<String> institution;

  private final Optional<String> accessMode;

  private final Optional<String> lastAccessedAt;

  private final Optional<String> createdAt;

  private final Optional<String> externalId;

  private final Optional<String> institutionUserId;

  private final Optional<EnumLinkStatus> status;

  private final Optional<String> createdBy;

  private final Optional<String> refreshRate;

  private int _cachedHashCode;

  Link(Optional<String> id, Optional<String> institution, Optional<String> accessMode,
      Optional<String> lastAccessedAt, Optional<String> createdAt, Optional<String> externalId,
      Optional<String> institutionUserId, Optional<EnumLinkStatus> status,
      Optional<String> createdBy, Optional<String> refreshRate) {
    this.id = id;
    this.institution = institution;
    this.accessMode = accessMode;
    this.lastAccessedAt = lastAccessedAt;
    this.createdAt = createdAt;
    this.externalId = externalId;
    this.institutionUserId = institutionUserId;
    this.status = status;
    this.createdBy = createdBy;
    this.refreshRate = refreshRate;
  }

  /**
   * @return Belvo's unique ID for the current Link.
   */
  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
  }

  /**
   * @return Belvo's name for the institution.
   */
  @JsonProperty("institution")
  public Optional<String> getInstitution() {
    return institution;
  }

  @JsonProperty("access_mode")
  public Optional<String> getAccessMode() {
    return accessMode;
  }

  /**
   * @return The ISO-8601 timestamp of Belvo's most recent successful access to the institution for the given link.
   */
  @JsonProperty("last_accessed_at")
  public Optional<String> getLastAccessedAt() {
    return lastAccessedAt;
  }

  /**
   * @return The ISO-8601 timestamp of when the data point was last updated in Belvo's database.
   */
  @JsonProperty("created_at")
  public Optional<String> getCreatedAt() {
    return createdAt;
  }

  /**
   * @return The <code>external_id</code> you provided as an additional identifier for the link. For more information, see our <a href="https://developers.belvo.com/docs/link-creation-best-practices#adding-your-own-identifier">Link creation article</a>.
   */
  @JsonProperty("external_id")
  public Optional<String> getExternalId() {
    return externalId;
  }

  /**
   * @return <p>&lt;div style=&quot;background-color:#f4f6f8; border-left: 6px solid #0663F9;padding: 12px;margin-left: 25px; border-radius: 4px; margin-right: 25px&quot;&gt; &lt;strong&gt;Info:&lt;/strong&gt; Only applicable for links created &lt;b&gt;after 08-02-2022&lt;/b&gt;. &lt;/div&gt;</p>
   * A unique 44-character string that can be used to identify a user at a given institution.
   * <p>📚 Check out our <a href="https://developers.belvo.com/docs/link-creation-best-practices#avoiding-duplicated-links">Avoiding duplicated links</a> DevPortal article for more information and tips on how to use it.</p>
   */
  @JsonProperty("institution_user_id")
  public Optional<String> getInstitutionUserId() {
    return institutionUserId;
  }

  @JsonProperty("status")
  public Optional<EnumLinkStatus> getStatus() {
    return status;
  }

  /**
   * @return The unique ID for the user that created this link.
   */
  @JsonProperty("created_by")
  public Optional<String> getCreatedBy() {
    return createdBy;
  }

  @JsonProperty("refresh_rate")
  public Optional<String> getRefreshRate() {
    return refreshRate;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof Link && equalTo((Link) other);
  }

  private boolean equalTo(Link other) {
    return id.equals(other.id) && institution.equals(other.institution) && accessMode.equals(other.accessMode) && lastAccessedAt.equals(other.lastAccessedAt) && createdAt.equals(other.createdAt) && externalId.equals(other.externalId) && institutionUserId.equals(other.institutionUserId) && status.equals(other.status) && createdBy.equals(other.createdBy) && refreshRate.equals(other.refreshRate);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.id, this.institution, this.accessMode, this.lastAccessedAt, this.createdAt, this.externalId, this.institutionUserId, this.status, this.createdBy, this.refreshRate);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "Link{" + "id: " + id + ", institution: " + institution + ", accessMode: " + accessMode + ", lastAccessedAt: " + lastAccessedAt + ", createdAt: " + createdAt + ", externalId: " + externalId + ", institutionUserId: " + institutionUserId + ", status: " + status + ", createdBy: " + createdBy + ", refreshRate: " + refreshRate + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> id = Optional.empty();

    private Optional<String> institution = Optional.empty();

    private Optional<String> accessMode = Optional.empty();

    private Optional<String> lastAccessedAt = Optional.empty();

    private Optional<String> createdAt = Optional.empty();

    private Optional<String> externalId = Optional.empty();

    private Optional<String> institutionUserId = Optional.empty();

    private Optional<EnumLinkStatus> status = Optional.empty();

    private Optional<String> createdBy = Optional.empty();

    private Optional<String> refreshRate = Optional.empty();

    private Builder() {
    }

    public Builder from(Link other) {
      id(other.getId());
      institution(other.getInstitution());
      accessMode(other.getAccessMode());
      lastAccessedAt(other.getLastAccessedAt());
      createdAt(other.getCreatedAt());
      externalId(other.getExternalId());
      institutionUserId(other.getInstitutionUserId());
      status(other.getStatus());
      createdBy(other.getCreatedBy());
      refreshRate(other.getRefreshRate());
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
        value = "last_accessed_at",
        nulls = Nulls.SKIP
    )
    public Builder lastAccessedAt(Optional<String> lastAccessedAt) {
      this.lastAccessedAt = lastAccessedAt;
      return this;
    }

    public Builder lastAccessedAt(String lastAccessedAt) {
      this.lastAccessedAt = Optional.of(lastAccessedAt);
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
        value = "status",
        nulls = Nulls.SKIP
    )
    public Builder status(Optional<EnumLinkStatus> status) {
      this.status = status;
      return this;
    }

    public Builder status(EnumLinkStatus status) {
      this.status = Optional.of(status);
      return this;
    }

    @JsonSetter(
        value = "created_by",
        nulls = Nulls.SKIP
    )
    public Builder createdBy(Optional<String> createdBy) {
      this.createdBy = createdBy;
      return this;
    }

    public Builder createdBy(String createdBy) {
      this.createdBy = Optional.of(createdBy);
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

    public Link build() {
      return new Link(id, institution, accessMode, lastAccessedAt, createdAt, externalId, institutionUserId, status, createdBy, refreshRate);
    }
  }
}
