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
    builder = TaxStatusAddressBetweenStreetSat.Builder.class
)
public final class TaxStatusAddressBetweenStreetSat {
  private final Optional<String> streetOne;

  private final Optional<String> streetTwo;

  private int _cachedHashCode;

  TaxStatusAddressBetweenStreetSat(Optional<String> streetOne, Optional<String> streetTwo) {
    this.streetOne = streetOne;
    this.streetTwo = streetTwo;
  }

  /**
   * @return The first street that <code>street</code> is located between.
   */
  @JsonProperty("street_one")
  public Optional<String> getStreetOne() {
    return streetOne;
  }

  /**
   * @return The second street that <code>street</code> is located between.
   */
  @JsonProperty("street_two")
  public Optional<String> getStreetTwo() {
    return streetTwo;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof TaxStatusAddressBetweenStreetSat && equalTo((TaxStatusAddressBetweenStreetSat) other);
  }

  private boolean equalTo(TaxStatusAddressBetweenStreetSat other) {
    return streetOne.equals(other.streetOne) && streetTwo.equals(other.streetTwo);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.streetOne, this.streetTwo);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "TaxStatusAddressBetweenStreetSat{" + "streetOne: " + streetOne + ", streetTwo: " + streetTwo + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> streetOne = Optional.empty();

    private Optional<String> streetTwo = Optional.empty();

    private Builder() {
    }

    public Builder from(TaxStatusAddressBetweenStreetSat other) {
      streetOne(other.getStreetOne());
      streetTwo(other.getStreetTwo());
      return this;
    }

    @JsonSetter(
        value = "street_one",
        nulls = Nulls.SKIP
    )
    public Builder streetOne(Optional<String> streetOne) {
      this.streetOne = streetOne;
      return this;
    }

    public Builder streetOne(String streetOne) {
      this.streetOne = Optional.of(streetOne);
      return this;
    }

    @JsonSetter(
        value = "street_two",
        nulls = Nulls.SKIP
    )
    public Builder streetTwo(Optional<String> streetTwo) {
      this.streetTwo = streetTwo;
      return this;
    }

    public Builder streetTwo(String streetTwo) {
      this.streetTwo = Optional.of(streetTwo);
      return this;
    }

    public TaxStatusAddressBetweenStreetSat build() {
      return new TaxStatusAddressBetweenStreetSat(streetOne, streetTwo);
    }
  }
}
