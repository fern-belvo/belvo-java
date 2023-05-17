package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = PaymentInstitution.Builder.class
)
public final class PaymentInstitution {
  private final Optional<String> id;

  private final Optional<Boolean> active;

  private final Optional<String> name;

  private final Optional<String> displayName;

  private final Optional<String> legalEntityName;

  private final Optional<String> website;

  private final Optional<String> logo;

  private final Optional<String> iconLogo;

  private final Optional<String> textLogo;

  private final Optional<String> primaryColor;

  private final Optional<EnumPaymentsCountry> country;

  private final Optional<List<InstitutionFormField>> formFields;

  private int _cachedHashCode;

  PaymentInstitution(Optional<String> id, Optional<Boolean> active, Optional<String> name,
      Optional<String> displayName, Optional<String> legalEntityName, Optional<String> website,
      Optional<String> logo, Optional<String> iconLogo, Optional<String> textLogo,
      Optional<String> primaryColor, Optional<EnumPaymentsCountry> country,
      Optional<List<InstitutionFormField>> formFields) {
    this.id = id;
    this.active = active;
    this.name = name;
    this.displayName = displayName;
    this.legalEntityName = legalEntityName;
    this.website = website;
    this.logo = logo;
    this.iconLogo = iconLogo;
    this.textLogo = textLogo;
    this.primaryColor = primaryColor;
    this.country = country;
    this.formFields = formFields;
  }

  /**
   * @return Belvo's unique ID to reference the institution.
   */
  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
  }

  /**
   * @return Indicates whether this institution is available for use or not.
   */
  @JsonProperty("active")
  public Optional<Boolean> getActive() {
    return active;
  }

  /**
   * @return The name of the institution, as designated by Belvo.
   */
  @JsonProperty("name")
  public Optional<String> getName() {
    return name;
  }

  /**
   * @return The customer-facing name of the institution.
   */
  @JsonProperty("display_name")
  public Optional<String> getDisplayName() {
    return displayName;
  }

  /**
   * @return The name of the legal entity of the institution, as registered with the relevant regulatory authority. Only applicable for 🇧🇷 Brazil OFPI.
   */
  @JsonProperty("legal_entity_name")
  public Optional<String> getLegalEntityName() {
    return legalEntityName;
  }

  /**
   * @return The URL of the institution's website.
   */
  @JsonProperty("website")
  public Optional<String> getWebsite() {
    return website;
  }

  /**
   * @return The URL of the institution's logo.
   */
  @JsonProperty("logo")
  public Optional<String> getLogo() {
    return logo;
  }

  /**
   * @return The URL of the institution's icon logo.
   */
  @JsonProperty("icon_logo")
  public Optional<String> getIconLogo() {
    return iconLogo;
  }

  /**
   * @return The URL of the institution's text logo.
   */
  @JsonProperty("text_logo")
  public Optional<String> getTextLogo() {
    return textLogo;
  }

  /**
   * @return The primary color on the institution's website.
   */
  @JsonProperty("primary_color")
  public Optional<String> getPrimaryColor() {
    return primaryColor;
  }

  @JsonProperty("country")
  public Optional<EnumPaymentsCountry> getCountry() {
    return country;
  }

  @JsonProperty("form_fields")
  public Optional<List<InstitutionFormField>> getFormFields() {
    return formFields;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof PaymentInstitution && equalTo((PaymentInstitution) other);
  }

  private boolean equalTo(PaymentInstitution other) {
    return id.equals(other.id) && active.equals(other.active) && name.equals(other.name) && displayName.equals(other.displayName) && legalEntityName.equals(other.legalEntityName) && website.equals(other.website) && logo.equals(other.logo) && iconLogo.equals(other.iconLogo) && textLogo.equals(other.textLogo) && primaryColor.equals(other.primaryColor) && country.equals(other.country) && formFields.equals(other.formFields);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.id, this.active, this.name, this.displayName, this.legalEntityName, this.website, this.logo, this.iconLogo, this.textLogo, this.primaryColor, this.country, this.formFields);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "PaymentInstitution{" + "id: " + id + ", active: " + active + ", name: " + name + ", displayName: " + displayName + ", legalEntityName: " + legalEntityName + ", website: " + website + ", logo: " + logo + ", iconLogo: " + iconLogo + ", textLogo: " + textLogo + ", primaryColor: " + primaryColor + ", country: " + country + ", formFields: " + formFields + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> id = Optional.empty();

    private Optional<Boolean> active = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Optional<String> displayName = Optional.empty();

    private Optional<String> legalEntityName = Optional.empty();

    private Optional<String> website = Optional.empty();

    private Optional<String> logo = Optional.empty();

    private Optional<String> iconLogo = Optional.empty();

    private Optional<String> textLogo = Optional.empty();

    private Optional<String> primaryColor = Optional.empty();

    private Optional<EnumPaymentsCountry> country = Optional.empty();

    private Optional<List<InstitutionFormField>> formFields = Optional.empty();

    private Builder() {
    }

    public Builder from(PaymentInstitution other) {
      id(other.getId());
      active(other.getActive());
      name(other.getName());
      displayName(other.getDisplayName());
      legalEntityName(other.getLegalEntityName());
      website(other.getWebsite());
      logo(other.getLogo());
      iconLogo(other.getIconLogo());
      textLogo(other.getTextLogo());
      primaryColor(other.getPrimaryColor());
      country(other.getCountry());
      formFields(other.getFormFields());
      return this;
    }

    @JsonSetter(
        value = "id",
        nulls = Nulls.SKIP
    )
    public Builder id(Optional<String> id) {
      this.id = id;
      return this;
    }

    public Builder id(String id) {
      this.id = Optional.of(id);
      return this;
    }

    @JsonSetter(
        value = "active",
        nulls = Nulls.SKIP
    )
    public Builder active(Optional<Boolean> active) {
      this.active = active;
      return this;
    }

    public Builder active(Boolean active) {
      this.active = Optional.of(active);
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
        value = "display_name",
        nulls = Nulls.SKIP
    )
    public Builder displayName(Optional<String> displayName) {
      this.displayName = displayName;
      return this;
    }

    public Builder displayName(String displayName) {
      this.displayName = Optional.of(displayName);
      return this;
    }

    @JsonSetter(
        value = "legal_entity_name",
        nulls = Nulls.SKIP
    )
    public Builder legalEntityName(Optional<String> legalEntityName) {
      this.legalEntityName = legalEntityName;
      return this;
    }

    public Builder legalEntityName(String legalEntityName) {
      this.legalEntityName = Optional.of(legalEntityName);
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
        value = "icon_logo",
        nulls = Nulls.SKIP
    )
    public Builder iconLogo(Optional<String> iconLogo) {
      this.iconLogo = iconLogo;
      return this;
    }

    public Builder iconLogo(String iconLogo) {
      this.iconLogo = Optional.of(iconLogo);
      return this;
    }

    @JsonSetter(
        value = "text_logo",
        nulls = Nulls.SKIP
    )
    public Builder textLogo(Optional<String> textLogo) {
      this.textLogo = textLogo;
      return this;
    }

    public Builder textLogo(String textLogo) {
      this.textLogo = Optional.of(textLogo);
      return this;
    }

    @JsonSetter(
        value = "primary_color",
        nulls = Nulls.SKIP
    )
    public Builder primaryColor(Optional<String> primaryColor) {
      this.primaryColor = primaryColor;
      return this;
    }

    public Builder primaryColor(String primaryColor) {
      this.primaryColor = Optional.of(primaryColor);
      return this;
    }

    @JsonSetter(
        value = "country",
        nulls = Nulls.SKIP
    )
    public Builder country(Optional<EnumPaymentsCountry> country) {
      this.country = country;
      return this;
    }

    public Builder country(EnumPaymentsCountry country) {
      this.country = Optional.of(country);
      return this;
    }

    @JsonSetter(
        value = "form_fields",
        nulls = Nulls.SKIP
    )
    public Builder formFields(Optional<List<InstitutionFormField>> formFields) {
      this.formFields = formFields;
      return this;
    }

    public Builder formFields(List<InstitutionFormField> formFields) {
      this.formFields = Optional.of(formFields);
      return this;
    }

    public PaymentInstitution build() {
      return new PaymentInstitution(id, active, name, displayName, legalEntityName, website, logo, iconLogo, textLogo, primaryColor, country, formFields);
    }
  }
}
