package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = Institution.Builder.class
)
public final class Institution {
  private final Optional<Integer> id;

  private final Optional<String> name;

  private final Optional<EnumInstitutionType> type;

  private final Optional<String> website;

  private final Optional<String> displayName;

  private final Optional<List<String>> countryCodes;

  private final Optional<String> primaryColor;

  private final Optional<String> logo;

  private final Optional<String> iconLogo;

  private final Optional<String> textLogo;

  private final Optional<List<InstitutionsFormField>> formFields;

  private final Optional<List<InstitutionsFeature>> features;

  private final Optional<List<String>> resources;

  private final Optional<EnumInstitutionIntegrationType> integrationType;

  private final Optional<EnumInstitutionStatus> status;

  private int _cachedHashCode;

  Institution(Optional<Integer> id, Optional<String> name, Optional<EnumInstitutionType> type,
      Optional<String> website, Optional<String> displayName, Optional<List<String>> countryCodes,
      Optional<String> primaryColor, Optional<String> logo, Optional<String> iconLogo,
      Optional<String> textLogo, Optional<List<InstitutionsFormField>> formFields,
      Optional<List<InstitutionsFeature>> features, Optional<List<String>> resources,
      Optional<EnumInstitutionIntegrationType> integrationType,
      Optional<EnumInstitutionStatus> status) {
    this.id = id;
    this.name = name;
    this.type = type;
    this.website = website;
    this.displayName = displayName;
    this.countryCodes = countryCodes;
    this.primaryColor = primaryColor;
    this.logo = logo;
    this.iconLogo = iconLogo;
    this.textLogo = textLogo;
    this.formFields = formFields;
    this.features = features;
    this.resources = resources;
    this.integrationType = integrationType;
    this.status = status;
  }

  /**
   * @return The ID of the institution as designated by Belvo.
   */
  @JsonProperty("id")
  public Optional<Integer> getId() {
    return id;
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

  /**
   * @return The URL of the institution's website.
   */
  @JsonProperty("website")
  public Optional<String> getWebsite() {
    return website;
  }

  /**
   * @return The customer-facing name of the institution.
   */
  @JsonProperty("display_name")
  public Optional<String> getDisplayName() {
    return displayName;
  }

  /**
   * @return The country codes where the institution is available, for example:
   * <ul>
   * <li>🇧🇷 BR (Brazil)</li>
   * <li>🇨🇴 CO (Colombia)</li>
   * <li>🇲🇽 MX (Mexico)</li>
   * </ul>
   */
  @JsonProperty("country_codes")
  public Optional<List<String>> getCountryCodes() {
    return countryCodes;
  }

  /**
   * @return The primary color on the institution's website.
   */
  @JsonProperty("primary_color")
  public Optional<String> getPrimaryColor() {
    return primaryColor;
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

  @JsonProperty("form_fields")
  public Optional<List<InstitutionsFormField>> getFormFields() {
    return formFields;
  }

  /**
   * @return The features that the institution supports. If the institution has no special features, then Belvo returns an empty array.
   * <p>Here is a list of the available features:</p>
   * <ul>
   * <li><code>token_required</code> indicates that the institution may require a token during link creation or when making any other requests.</li>
   * </ul>
   */
  @JsonProperty("features")
  public Optional<List<InstitutionsFeature>> getFeatures() {
    return features;
  }

  /**
   * @return A list of Belvo resources that you can use with the institution. This list includes one or more of the following resources:
   * <ul>
   * <li><code>ACCOUNTS</code></li>
   * <li><code>BALANCES</code></li>
   * <li><code>INCOMES</code></li>
   * <li><code>INVESTMENTS_PORTFOLIOS</code></li>
   * <li><code>INVESTMENTS_TRANSACTIONS</code> <em>This field has been deprecated.</em></li>
   * <li><code>INVOICES</code></li>
   * <li><code>OWNERS</code></li>
   * <li><code>RECURRING_EXPENSES</code></li>
   * <li><code>RISK_INSIGHTS</code></li>
   * <li><code>TRANSACTIONS</code></li>
   * <li><code>TAX_COMPLIANCE_STATUS</code></li>
   * <li><code>TAX_STATUS</code></li>
   * <li><code>TAX_RETURNS</code></li>
   * </ul>
   */
  @JsonProperty("resources")
  public Optional<List<String>> getResources() {
    return resources;
  }

  @JsonProperty("integration_type")
  public Optional<EnumInstitutionIntegrationType> getIntegrationType() {
    return integrationType;
  }

  @JsonProperty("status")
  public Optional<EnumInstitutionStatus> getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof Institution && equalTo((Institution) other);
  }

  private boolean equalTo(Institution other) {
    return id.equals(other.id) && name.equals(other.name) && type.equals(other.type) && website.equals(other.website) && displayName.equals(other.displayName) && countryCodes.equals(other.countryCodes) && primaryColor.equals(other.primaryColor) && logo.equals(other.logo) && iconLogo.equals(other.iconLogo) && textLogo.equals(other.textLogo) && formFields.equals(other.formFields) && features.equals(other.features) && resources.equals(other.resources) && integrationType.equals(other.integrationType) && status.equals(other.status);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.id, this.name, this.type, this.website, this.displayName, this.countryCodes, this.primaryColor, this.logo, this.iconLogo, this.textLogo, this.formFields, this.features, this.resources, this.integrationType, this.status);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "Institution{" + "id: " + id + ", name: " + name + ", type: " + type + ", website: " + website + ", displayName: " + displayName + ", countryCodes: " + countryCodes + ", primaryColor: " + primaryColor + ", logo: " + logo + ", iconLogo: " + iconLogo + ", textLogo: " + textLogo + ", formFields: " + formFields + ", features: " + features + ", resources: " + resources + ", integrationType: " + integrationType + ", status: " + status + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<Integer> id = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Optional<EnumInstitutionType> type = Optional.empty();

    private Optional<String> website = Optional.empty();

    private Optional<String> displayName = Optional.empty();

    private Optional<List<String>> countryCodes = Optional.empty();

    private Optional<String> primaryColor = Optional.empty();

    private Optional<String> logo = Optional.empty();

    private Optional<String> iconLogo = Optional.empty();

    private Optional<String> textLogo = Optional.empty();

    private Optional<List<InstitutionsFormField>> formFields = Optional.empty();

    private Optional<List<InstitutionsFeature>> features = Optional.empty();

    private Optional<List<String>> resources = Optional.empty();

    private Optional<EnumInstitutionIntegrationType> integrationType = Optional.empty();

    private Optional<EnumInstitutionStatus> status = Optional.empty();

    private Builder() {
    }

    public Builder from(Institution other) {
      id(other.getId());
      name(other.getName());
      type(other.getType());
      website(other.getWebsite());
      displayName(other.getDisplayName());
      countryCodes(other.getCountryCodes());
      primaryColor(other.getPrimaryColor());
      logo(other.getLogo());
      iconLogo(other.getIconLogo());
      textLogo(other.getTextLogo());
      formFields(other.getFormFields());
      features(other.getFeatures());
      resources(other.getResources());
      integrationType(other.getIntegrationType());
      status(other.getStatus());
      return this;
    }

    @JsonSetter(
        value = "id",
        nulls = Nulls.SKIP
    )
    public Builder id(Optional<Integer> id) {
      this.id = id;
      return this;
    }

    public Builder id(Integer id) {
      this.id = Optional.of(id);
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
        value = "country_codes",
        nulls = Nulls.SKIP
    )
    public Builder countryCodes(Optional<List<String>> countryCodes) {
      this.countryCodes = countryCodes;
      return this;
    }

    public Builder countryCodes(List<String> countryCodes) {
      this.countryCodes = Optional.of(countryCodes);
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
        value = "form_fields",
        nulls = Nulls.SKIP
    )
    public Builder formFields(Optional<List<InstitutionsFormField>> formFields) {
      this.formFields = formFields;
      return this;
    }

    public Builder formFields(List<InstitutionsFormField> formFields) {
      this.formFields = Optional.of(formFields);
      return this;
    }

    @JsonSetter(
        value = "features",
        nulls = Nulls.SKIP
    )
    public Builder features(Optional<List<InstitutionsFeature>> features) {
      this.features = features;
      return this;
    }

    public Builder features(List<InstitutionsFeature> features) {
      this.features = Optional.of(features);
      return this;
    }

    @JsonSetter(
        value = "resources",
        nulls = Nulls.SKIP
    )
    public Builder resources(Optional<List<String>> resources) {
      this.resources = resources;
      return this;
    }

    public Builder resources(List<String> resources) {
      this.resources = Optional.of(resources);
      return this;
    }

    @JsonSetter(
        value = "integration_type",
        nulls = Nulls.SKIP
    )
    public Builder integrationType(Optional<EnumInstitutionIntegrationType> integrationType) {
      this.integrationType = integrationType;
      return this;
    }

    public Builder integrationType(EnumInstitutionIntegrationType integrationType) {
      this.integrationType = Optional.of(integrationType);
      return this;
    }

    @JsonSetter(
        value = "status",
        nulls = Nulls.SKIP
    )
    public Builder status(Optional<EnumInstitutionStatus> status) {
      this.status = status;
      return this;
    }

    public Builder status(EnumInstitutionStatus status) {
      this.status = Optional.of(status);
      return this;
    }

    public Institution build() {
      return new Institution(id, name, type, website, displayName, countryCodes, primaryColor, logo, iconLogo, textLogo, formFields, features, resources, integrationType, status);
    }
  }
}
