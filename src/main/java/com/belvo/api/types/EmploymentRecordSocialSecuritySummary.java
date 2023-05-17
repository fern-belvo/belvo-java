package com.belvo.api.types;

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
    builder = EmploymentRecordSocialSecuritySummary.Builder.class
)
public final class EmploymentRecordSocialSecuritySummary {
  private final Optional<Integer> weeksRedeemed;

  private final Optional<Integer> weeksReinstated;

  private final Optional<Integer> weeksContributed;

  private int _cachedHashCode;

  EmploymentRecordSocialSecuritySummary(Optional<Integer> weeksRedeemed,
      Optional<Integer> weeksReinstated, Optional<Integer> weeksContributed) {
    this.weeksRedeemed = weeksRedeemed;
    this.weeksReinstated = weeksReinstated;
    this.weeksContributed = weeksContributed;
  }

  /**
   * @return Number of weeks the individual needed to take out of their pension.
   */
  @JsonProperty("weeks_redeemed")
  public Optional<Integer> getWeeksRedeemed() {
    return weeksRedeemed;
  }

  /**
   * @return Number of weeks the individual has paid back into their pension (<em>AFORE</em>), after having redeemed them previously.
   */
  @JsonProperty("weeks_reinstated")
  public Optional<Integer> getWeeksReinstated() {
    return weeksReinstated;
  }

  /**
   * @return Number of weeks the individual has contributed to their social security, based on the number of weeks the individual has worked according to IMSS.
   */
  @JsonProperty("weeks_contributed")
  public Optional<Integer> getWeeksContributed() {
    return weeksContributed;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof EmploymentRecordSocialSecuritySummary && equalTo((EmploymentRecordSocialSecuritySummary) other);
  }

  private boolean equalTo(EmploymentRecordSocialSecuritySummary other) {
    return weeksRedeemed.equals(other.weeksRedeemed) && weeksReinstated.equals(other.weeksReinstated) && weeksContributed.equals(other.weeksContributed);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.weeksRedeemed, this.weeksReinstated, this.weeksContributed);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "EmploymentRecordSocialSecuritySummary{" + "weeksRedeemed: " + weeksRedeemed + ", weeksReinstated: " + weeksReinstated + ", weeksContributed: " + weeksContributed + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<Integer> weeksRedeemed = Optional.empty();

    private Optional<Integer> weeksReinstated = Optional.empty();

    private Optional<Integer> weeksContributed = Optional.empty();

    private Builder() {
    }

    public Builder from(EmploymentRecordSocialSecuritySummary other) {
      weeksRedeemed(other.getWeeksRedeemed());
      weeksReinstated(other.getWeeksReinstated());
      weeksContributed(other.getWeeksContributed());
      return this;
    }

    @JsonSetter(
        value = "weeks_redeemed",
        nulls = Nulls.SKIP
    )
    public Builder weeksRedeemed(Optional<Integer> weeksRedeemed) {
      this.weeksRedeemed = weeksRedeemed;
      return this;
    }

    public Builder weeksRedeemed(Integer weeksRedeemed) {
      this.weeksRedeemed = Optional.of(weeksRedeemed);
      return this;
    }

    @JsonSetter(
        value = "weeks_reinstated",
        nulls = Nulls.SKIP
    )
    public Builder weeksReinstated(Optional<Integer> weeksReinstated) {
      this.weeksReinstated = weeksReinstated;
      return this;
    }

    public Builder weeksReinstated(Integer weeksReinstated) {
      this.weeksReinstated = Optional.of(weeksReinstated);
      return this;
    }

    @JsonSetter(
        value = "weeks_contributed",
        nulls = Nulls.SKIP
    )
    public Builder weeksContributed(Optional<Integer> weeksContributed) {
      this.weeksContributed = weeksContributed;
      return this;
    }

    public Builder weeksContributed(Integer weeksContributed) {
      this.weeksContributed = Optional.of(weeksContributed);
      return this;
    }

    public EmploymentRecordSocialSecuritySummary build() {
      return new EmploymentRecordSocialSecuritySummary(weeksRedeemed, weeksReinstated, weeksContributed);
    }
  }
}
