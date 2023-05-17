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
    builder = TaxStatusObligationsDian.Builder.class
)
public final class TaxStatusObligationsDian {
  private final Optional<String> obligation;

  private final Optional<String> expiration;

  private final Optional<String> initialDate;

  private final Optional<String> endDate;

  private int _cachedHashCode;

  TaxStatusObligationsDian(Optional<String> obligation, Optional<String> expiration,
      Optional<String> initialDate, Optional<String> endDate) {
    this.obligation = obligation;
    this.expiration = expiration;
    this.initialDate = initialDate;
    this.endDate = endDate;
  }

  /**
   * @return <strong>Note</strong>: This field is not applicable for DIAN Colombia and will return <code>null</code>.
   */
  @JsonProperty("obligation")
  public Optional<String> getObligation() {
    return obligation;
  }

  /**
   * @return <strong>Note</strong>: This field is not applicable for DIAN Colombia and will return <code>null</code>.
   */
  @JsonProperty("expiration")
  public Optional<String> getExpiration() {
    return expiration;
  }

  /**
   * @return <strong>Note</strong>: This field is not applicable for DIAN Colombia and will return <code>null</code>.
   */
  @JsonProperty("initial_date")
  public Optional<String> getInitialDate() {
    return initialDate;
  }

  /**
   * @return <strong>Note</strong>: This field is not applicable for DIAN Colombia and will return <code>null</code>.
   */
  @JsonProperty("end_date")
  public Optional<String> getEndDate() {
    return endDate;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof TaxStatusObligationsDian && equalTo((TaxStatusObligationsDian) other);
  }

  private boolean equalTo(TaxStatusObligationsDian other) {
    return obligation.equals(other.obligation) && expiration.equals(other.expiration) && initialDate.equals(other.initialDate) && endDate.equals(other.endDate);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.obligation, this.expiration, this.initialDate, this.endDate);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "TaxStatusObligationsDian{" + "obligation: " + obligation + ", expiration: " + expiration + ", initialDate: " + initialDate + ", endDate: " + endDate + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> obligation = Optional.empty();

    private Optional<String> expiration = Optional.empty();

    private Optional<String> initialDate = Optional.empty();

    private Optional<String> endDate = Optional.empty();

    private Builder() {
    }

    public Builder from(TaxStatusObligationsDian other) {
      obligation(other.getObligation());
      expiration(other.getExpiration());
      initialDate(other.getInitialDate());
      endDate(other.getEndDate());
      return this;
    }

    @JsonSetter(
        value = "obligation",
        nulls = Nulls.SKIP
    )
    public Builder obligation(Optional<String> obligation) {
      this.obligation = obligation;
      return this;
    }

    public Builder obligation(String obligation) {
      this.obligation = Optional.of(obligation);
      return this;
    }

    @JsonSetter(
        value = "expiration",
        nulls = Nulls.SKIP
    )
    public Builder expiration(Optional<String> expiration) {
      this.expiration = expiration;
      return this;
    }

    public Builder expiration(String expiration) {
      this.expiration = Optional.of(expiration);
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

    public TaxStatusObligationsDian build() {
      return new TaxStatusObligationsDian(obligation, expiration, initialDate, endDate);
    }
  }
}
