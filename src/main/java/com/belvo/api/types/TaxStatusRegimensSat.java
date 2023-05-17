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
    builder = TaxStatusRegimensSat.Builder.class
)
public final class TaxStatusRegimensSat {
  private final Optional<String> endDate;

  private final Optional<String> initialDate;

  private final Optional<String> regimen;

  private int _cachedHashCode;

  TaxStatusRegimensSat(Optional<String> endDate, Optional<String> initialDate,
      Optional<String> regimen) {
    this.endDate = endDate;
    this.initialDate = initialDate;
    this.regimen = regimen;
  }

  /**
   * @return The end date of the regimen.
   */
  @JsonProperty("end_date")
  public Optional<String> getEndDate() {
    return endDate;
  }

  /**
   * @return The start date of the regimen.
   */
  @JsonProperty("initial_date")
  public Optional<String> getInitialDate() {
    return initialDate;
  }

  /**
   * @return The description of the regimen.
   */
  @JsonProperty("regimen")
  public Optional<String> getRegimen() {
    return regimen;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof TaxStatusRegimensSat && equalTo((TaxStatusRegimensSat) other);
  }

  private boolean equalTo(TaxStatusRegimensSat other) {
    return endDate.equals(other.endDate) && initialDate.equals(other.initialDate) && regimen.equals(other.regimen);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.endDate, this.initialDate, this.regimen);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "TaxStatusRegimensSat{" + "endDate: " + endDate + ", initialDate: " + initialDate + ", regimen: " + regimen + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> endDate = Optional.empty();

    private Optional<String> initialDate = Optional.empty();

    private Optional<String> regimen = Optional.empty();

    private Builder() {
    }

    public Builder from(TaxStatusRegimensSat other) {
      endDate(other.getEndDate());
      initialDate(other.getInitialDate());
      regimen(other.getRegimen());
      return this;
    }

    @JsonSetter(
        value = "end_date",
        nulls = Nulls.SKIP
    )
    public Builder endDate(Optional<String> endDate) {
      this.endDate = endDate;
      return this;
    }

    public Builder endDate(String endDate) {
      this.endDate = Optional.of(endDate);
      return this;
    }

    @JsonSetter(
        value = "initial_date",
        nulls = Nulls.SKIP
    )
    public Builder initialDate(Optional<String> initialDate) {
      this.initialDate = initialDate;
      return this;
    }

    public Builder initialDate(String initialDate) {
      this.initialDate = Optional.of(initialDate);
      return this;
    }

    @JsonSetter(
        value = "regimen",
        nulls = Nulls.SKIP
    )
    public Builder regimen(Optional<String> regimen) {
      this.regimen = regimen;
      return this;
    }

    public Builder regimen(String regimen) {
      this.regimen = Optional.of(regimen);
      return this;
    }

    public TaxStatusRegimensSat build() {
      return new TaxStatusRegimensSat(endDate, initialDate, regimen);
    }
  }
}
