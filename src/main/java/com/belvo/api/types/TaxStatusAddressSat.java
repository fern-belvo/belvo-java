package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = TaxStatusAddressSat.Builder.class
)
public final class TaxStatusAddressSat {
  private final Optional<String> postalCode;

  private final Optional<String> streetType;

  private final Optional<String> street;

  private final Optional<String> exteriorNumber;

  private final Optional<String> interiorNumber;

  private final Optional<String> suburb;

  private final Optional<String> locality;

  private final Optional<String> municipality;

  private final Optional<String> state;

  private final Optional<List<TaxStatusAddressBetweenStreetSat>> betweenStreet;

  private int _cachedHashCode;

  TaxStatusAddressSat(Optional<String> postalCode, Optional<String> streetType,
      Optional<String> street, Optional<String> exteriorNumber, Optional<String> interiorNumber,
      Optional<String> suburb, Optional<String> locality, Optional<String> municipality,
      Optional<String> state, Optional<List<TaxStatusAddressBetweenStreetSat>> betweenStreet) {
    this.postalCode = postalCode;
    this.streetType = streetType;
    this.street = street;
    this.exteriorNumber = exteriorNumber;
    this.interiorNumber = interiorNumber;
    this.suburb = suburb;
    this.locality = locality;
    this.municipality = municipality;
    this.state = state;
    this.betweenStreet = betweenStreet;
  }

  /**
   * @return The postcode of the address.
   */
  @JsonProperty("postal_code")
  public Optional<String> getPostalCode() {
    return postalCode;
  }

  /**
   * @return The <code>street</code> type.
   */
  @JsonProperty("street_type")
  public Optional<String> getStreetType() {
    return streetType;
  }

  /**
   * @return The tax payers street.
   */
  @JsonProperty("street")
  public Optional<String> getStreet() {
    return street;
  }

  /**
   * @return The street number.
   */
  @JsonProperty("exterior_number")
  public Optional<String> getExteriorNumber() {
    return exteriorNumber;
  }

  /**
   * @return Additional address information.
   */
  @JsonProperty("interior_number")
  public Optional<String> getInteriorNumber() {
    return interiorNumber;
  }

  /**
   * @return The suburb of the tax payer.
   */
  @JsonProperty("suburb")
  public Optional<String> getSuburb() {
    return suburb;
  }

  /**
   * @return The locality of the address.
   */
  @JsonProperty("locality")
  public Optional<String> getLocality() {
    return locality;
  }

  /**
   * @return The municipality of the address.
   */
  @JsonProperty("municipality")
  public Optional<String> getMunicipality() {
    return municipality;
  }

  /**
   * @return The state that the address is in.
   */
  @JsonProperty("state")
  public Optional<String> getState() {
    return state;
  }

  /**
   * @return Additional information about where the <code>street</code> is located.
   */
  @JsonProperty("between_street")
  public Optional<List<TaxStatusAddressBetweenStreetSat>> getBetweenStreet() {
    return betweenStreet;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof TaxStatusAddressSat && equalTo((TaxStatusAddressSat) other);
  }

  private boolean equalTo(TaxStatusAddressSat other) {
    return postalCode.equals(other.postalCode) && streetType.equals(other.streetType) && street.equals(other.street) && exteriorNumber.equals(other.exteriorNumber) && interiorNumber.equals(other.interiorNumber) && suburb.equals(other.suburb) && locality.equals(other.locality) && municipality.equals(other.municipality) && state.equals(other.state) && betweenStreet.equals(other.betweenStreet);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.postalCode, this.streetType, this.street, this.exteriorNumber, this.interiorNumber, this.suburb, this.locality, this.municipality, this.state, this.betweenStreet);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "TaxStatusAddressSat{" + "postalCode: " + postalCode + ", streetType: " + streetType + ", street: " + street + ", exteriorNumber: " + exteriorNumber + ", interiorNumber: " + interiorNumber + ", suburb: " + suburb + ", locality: " + locality + ", municipality: " + municipality + ", state: " + state + ", betweenStreet: " + betweenStreet + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> postalCode = Optional.empty();

    private Optional<String> streetType = Optional.empty();

    private Optional<String> street = Optional.empty();

    private Optional<String> exteriorNumber = Optional.empty();

    private Optional<String> interiorNumber = Optional.empty();

    private Optional<String> suburb = Optional.empty();

    private Optional<String> locality = Optional.empty();

    private Optional<String> municipality = Optional.empty();

    private Optional<String> state = Optional.empty();

    private Optional<List<TaxStatusAddressBetweenStreetSat>> betweenStreet = Optional.empty();

    private Builder() {
    }

    public Builder from(TaxStatusAddressSat other) {
      postalCode(other.getPostalCode());
      streetType(other.getStreetType());
      street(other.getStreet());
      exteriorNumber(other.getExteriorNumber());
      interiorNumber(other.getInteriorNumber());
      suburb(other.getSuburb());
      locality(other.getLocality());
      municipality(other.getMunicipality());
      state(other.getState());
      betweenStreet(other.getBetweenStreet());
      return this;
    }

    @JsonSetter(
        value = "postal_code",
        nulls = Nulls.SKIP
    )
    public Builder postalCode(Optional<String> postalCode) {
      this.postalCode = postalCode;
      return this;
    }

    public Builder postalCode(String postalCode) {
      this.postalCode = Optional.of(postalCode);
      return this;
    }

    @JsonSetter(
        value = "street_type",
        nulls = Nulls.SKIP
    )
    public Builder streetType(Optional<String> streetType) {
      this.streetType = streetType;
      return this;
    }

    public Builder streetType(String streetType) {
      this.streetType = Optional.of(streetType);
      return this;
    }

    @JsonSetter(
        value = "street",
        nulls = Nulls.SKIP
    )
    public Builder street(Optional<String> street) {
      this.street = street;
      return this;
    }

    public Builder street(String street) {
      this.street = Optional.of(street);
      return this;
    }

    @JsonSetter(
        value = "exterior_number",
        nulls = Nulls.SKIP
    )
    public Builder exteriorNumber(Optional<String> exteriorNumber) {
      this.exteriorNumber = exteriorNumber;
      return this;
    }

    public Builder exteriorNumber(String exteriorNumber) {
      this.exteriorNumber = Optional.of(exteriorNumber);
      return this;
    }

    @JsonSetter(
        value = "interior_number",
        nulls = Nulls.SKIP
    )
    public Builder interiorNumber(Optional<String> interiorNumber) {
      this.interiorNumber = interiorNumber;
      return this;
    }

    public Builder interiorNumber(String interiorNumber) {
      this.interiorNumber = Optional.of(interiorNumber);
      return this;
    }

    @JsonSetter(
        value = "suburb",
        nulls = Nulls.SKIP
    )
    public Builder suburb(Optional<String> suburb) {
      this.suburb = suburb;
      return this;
    }

    public Builder suburb(String suburb) {
      this.suburb = Optional.of(suburb);
      return this;
    }

    @JsonSetter(
        value = "locality",
        nulls = Nulls.SKIP
    )
    public Builder locality(Optional<String> locality) {
      this.locality = locality;
      return this;
    }

    public Builder locality(String locality) {
      this.locality = Optional.of(locality);
      return this;
    }

    @JsonSetter(
        value = "municipality",
        nulls = Nulls.SKIP
    )
    public Builder municipality(Optional<String> municipality) {
      this.municipality = municipality;
      return this;
    }

    public Builder municipality(String municipality) {
      this.municipality = Optional.of(municipality);
      return this;
    }

    @JsonSetter(
        value = "state",
        nulls = Nulls.SKIP
    )
    public Builder state(Optional<String> state) {
      this.state = state;
      return this;
    }

    public Builder state(String state) {
      this.state = Optional.of(state);
      return this;
    }

    @JsonSetter(
        value = "between_street",
        nulls = Nulls.SKIP
    )
    public Builder betweenStreet(Optional<List<TaxStatusAddressBetweenStreetSat>> betweenStreet) {
      this.betweenStreet = betweenStreet;
      return this;
    }

    public Builder betweenStreet(List<TaxStatusAddressBetweenStreetSat> betweenStreet) {
      this.betweenStreet = Optional.of(betweenStreet);
      return this;
    }

    public TaxStatusAddressSat build() {
      return new TaxStatusAddressSat(postalCode, streetType, street, exteriorNumber, interiorNumber, suburb, locality, municipality, state, betweenStreet);
    }
  }
}
