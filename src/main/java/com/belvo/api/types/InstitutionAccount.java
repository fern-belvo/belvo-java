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
    builder = InstitutionAccount.Builder.class
)
public final class InstitutionAccount {
  private final Optional<String> name;

  private final Optional<EnumInstitutionType> type;

  private int _cachedHashCode;

  InstitutionAccount(Optional<String> name, Optional<EnumInstitutionType> type) {
    this.name = name;
    this.type = type;
  }

  /**
   * @return The name of the institution, as designated by Belvo.
   * Please see our <a href="https://developers.belvo.com/docs/institution">Institutions</a> DevPortal article for a detailed list of institution names.
   */
  @JsonProperty("name")
  public Optional<String> getName() {
    return name;
  }

  @JsonProperty("type")
  public Optional<EnumInstitutionType> getType() {
    return type;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof InstitutionAccount && equalTo((InstitutionAccount) other);
  }

  private boolean equalTo(InstitutionAccount other) {
    return name.equals(other.name) && type.equals(other.type);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.name, this.type);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "InstitutionAccount{" + "name: " + name + ", type: " + type + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> name = Optional.empty();

    private Optional<EnumInstitutionType> type = Optional.empty();

    private Builder() {
    }

    public Builder from(InstitutionAccount other) {
      name(other.getName());
      type(other.getType());
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
        value = "type",
        nulls = Nulls.SKIP
    )
    public Builder type(Optional<EnumInstitutionType> type) {
      this.type = type;
      return this;
    }

    public Builder type(EnumInstitutionType type) {
      this.type = Optional.of(type);
      return this;
    }

    public InstitutionAccount build() {
      return new InstitutionAccount(name, type);
    }
  }
}
