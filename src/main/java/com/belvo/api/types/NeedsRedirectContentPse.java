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
    builder = NeedsRedirectContentPse.Builder.class
)
public final class NeedsRedirectContentPse {
  private final Optional<InstitutionFormField> payerInstitution;

  private int _cachedHashCode;

  NeedsRedirectContentPse(Optional<InstitutionFormField> payerInstitution) {
    this.payerInstitution = payerInstitution;
  }

  @JsonProperty("payer_institution")
  public Optional<InstitutionFormField> getPayerInstitution() {
    return payerInstitution;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof NeedsRedirectContentPse && equalTo((NeedsRedirectContentPse) other);
  }

  private boolean equalTo(NeedsRedirectContentPse other) {
    return payerInstitution.equals(other.payerInstitution);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.payerInstitution);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "NeedsRedirectContentPse{" + "payerInstitution: " + payerInstitution + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<InstitutionFormField> payerInstitution = Optional.empty();

    private Builder() {
    }

    public Builder from(NeedsRedirectContentPse other) {
      payerInstitution(other.getPayerInstitution());
      return this;
    }

    @JsonSetter(
        value = "payer_institution",
        nulls = Nulls.SKIP
    )
    public Builder payerInstitution(Optional<InstitutionFormField> payerInstitution) {
      this.payerInstitution = payerInstitution;
      return this;
    }

    public Builder payerInstitution(InstitutionFormField payerInstitution) {
      this.payerInstitution = Optional.of(payerInstitution);
      return this;
    }

    public NeedsRedirectContentPse build() {
      return new NeedsRedirectContentPse(payerInstitution);
    }
  }
}
