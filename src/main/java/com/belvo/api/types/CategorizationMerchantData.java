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
    builder = CategorizationMerchantData.Builder.class
)
public final class CategorizationMerchantData {
  private final Optional<String> logo;

  private final Optional<String> website;

  private final Optional<String> merchantName;

  private int _cachedHashCode;

  CategorizationMerchantData(Optional<String> logo, Optional<String> website,
      Optional<String> merchantName) {
    this.logo = logo;
    this.website = website;
    this.merchantName = merchantName;
  }

  /**
   * @return The URL to the merchant's logo.
   */
  @JsonProperty("logo")
  public Optional<String> getLogo() {
    return logo;
  }

  /**
   * @return The URL to the merchant's website.
   */
  @JsonProperty("website")
  public Optional<String> getWebsite() {
    return website;
  }

  /**
   * @return The name of the merchant.
   */
  @JsonProperty("merchant_name")
  public Optional<String> getMerchantName() {
    return merchantName;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof CategorizationMerchantData && equalTo((CategorizationMerchantData) other);
  }

  private boolean equalTo(CategorizationMerchantData other) {
    return logo.equals(other.logo) && website.equals(other.website) && merchantName.equals(other.merchantName);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.logo, this.website, this.merchantName);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "CategorizationMerchantData{" + "logo: " + logo + ", website: " + website + ", merchantName: " + merchantName + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> logo = Optional.empty();

    private Optional<String> website = Optional.empty();

    private Optional<String> merchantName = Optional.empty();

    private Builder() {
    }

    public Builder from(CategorizationMerchantData other) {
      logo(other.getLogo());
      website(other.getWebsite());
      merchantName(other.getMerchantName());
      return this;
    }

    @JsonSetter(
        value = "logo",
        nulls = Nulls.SKIP
    )
    public Builder logo(Optional<String> logo) {
      this.logo = logo;
      return this;
    }

    public Builder logo(String logo) {
      this.logo = Optional.of(logo);
      return this;
    }

    @JsonSetter(
        value = "website",
        nulls = Nulls.SKIP
    )
    public Builder website(Optional<String> website) {
      this.website = website;
      return this;
    }

    public Builder website(String website) {
      this.website = Optional.of(website);
      return this;
    }

    @JsonSetter(
        value = "merchant_name",
        nulls = Nulls.SKIP
    )
    public Builder merchantName(Optional<String> merchantName) {
      this.merchantName = merchantName;
      return this;
    }

    public Builder merchantName(String merchantName) {
      this.merchantName = Optional.of(merchantName);
      return this;
    }

    public CategorizationMerchantData build() {
      return new CategorizationMerchantData(logo, website, merchantName);
    }
  }
}
