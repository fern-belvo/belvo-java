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
    builder = InstitutionsFeature.Builder.class
)
public final class InstitutionsFeature {
  private final Optional<String> name;

  private final Optional<String> description;

  private int _cachedHashCode;

  InstitutionsFeature(Optional<String> name, Optional<String> description) {
    this.name = name;
    this.description = description;
  }

  /**
   * @return The name of the feature.
   */
  @JsonProperty("name")
  public Optional<String> getName() {
    return name;
  }

  /**
   * @return The description of the feature.
   */
  @JsonProperty("description")
  public Optional<String> getDescription() {
    return description;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof InstitutionsFeature && equalTo((InstitutionsFeature) other);
  }

  private boolean equalTo(InstitutionsFeature other) {
    return name.equals(other.name) && description.equals(other.description);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.name, this.description);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "InstitutionsFeature{" + "name: " + name + ", description: " + description + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> name = Optional.empty();

    private Optional<String> description = Optional.empty();

    private Builder() {
    }

    public Builder from(InstitutionsFeature other) {
      name(other.getName());
      description(other.getDescription());
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
        value = "description",
        nulls = Nulls.SKIP
    )
    public Builder description(Optional<String> description) {
      this.description = description;
      return this;
    }

    public Builder description(String description) {
      this.description = Optional.of(description);
      return this;
    }

    public InstitutionsFeature build() {
      return new InstitutionsFeature(name, description);
    }
  }
}
