package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

@JsonDeserialize(
    builder = BankAccountDetailsOpenFinancePix.Builder.class
)
public final class BankAccountDetailsOpenFinancePix {
  private final EnumPaymentsCountry country;

  private final String pixKey;

  private int _cachedHashCode;

  BankAccountDetailsOpenFinancePix(EnumPaymentsCountry country, String pixKey) {
    this.country = country;
    this.pixKey = pixKey;
  }

  @JsonProperty("country")
  public EnumPaymentsCountry getCountry() {
    return country;
  }

  /**
   * @return The PIX key identifier of the bank account.
   */
  @JsonProperty("pix_key")
  public String getPixKey() {
    return pixKey;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof BankAccountDetailsOpenFinancePix && equalTo((BankAccountDetailsOpenFinancePix) other);
  }

  private boolean equalTo(BankAccountDetailsOpenFinancePix other) {
    return country.equals(other.country) && pixKey.equals(other.pixKey);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.country, this.pixKey);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "BankAccountDetailsOpenFinancePix{" + "country: " + country + ", pixKey: " + pixKey + "}";
  }

  public static CountryStage builder() {
    return new Builder();
  }

  public interface CountryStage {
    PixKeyStage country(EnumPaymentsCountry country);

    Builder from(BankAccountDetailsOpenFinancePix other);
  }

  public interface PixKeyStage {
    _FinalStage pixKey(String pixKey);
  }

  public interface _FinalStage {
    BankAccountDetailsOpenFinancePix build();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements CountryStage, PixKeyStage, _FinalStage {
    private EnumPaymentsCountry country;

    private String pixKey;

    private Builder() {
    }

    @Override
    public Builder from(BankAccountDetailsOpenFinancePix other) {
      country(other.getCountry());
      pixKey(other.getPixKey());
      return this;
    }

    @Override
    @JsonSetter("country")
    public PixKeyStage country(EnumPaymentsCountry country) {
      this.country = country;
      return this;
    }

    /**
     * <p>The PIX key identifier of the bank account.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("pix_key")
    public _FinalStage pixKey(String pixKey) {
      this.pixKey = pixKey;
      return this;
    }

    @Override
    public BankAccountDetailsOpenFinancePix build() {
      return new BankAccountDetailsOpenFinancePix(country, pixKey);
    }
  }
}
