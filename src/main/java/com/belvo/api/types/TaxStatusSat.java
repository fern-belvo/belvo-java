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
    builder = TaxStatusSat.Builder.class
)
public final class TaxStatusSat {
  private final String id;

  private final String link;

  private final Optional<String> collectedAt;

  private final String createdAt;

  private final Optional<String> placeAndDateOfIssuance;

  private final Optional<String> officialName;

  private final Optional<String> idCif;

  private final Optional<TaxStatusTaxPayerInformationSat> taxPayerInformation;

  private final Optional<TaxStatusAddressSat> address;

  private final Optional<List<TaxStatusEconomicActivitySat>> economicActivity;

  private final Optional<List<TaxStatusRegimensSat>> regimes;

  private final Optional<List<TaxStatusObligationsSat>> obligations;

  private final Optional<String> digitalStamp;

  private final Optional<String> digitalStampChain;

  private final Optional<String> pdf;

  private int _cachedHashCode;

  TaxStatusSat(String id, String link, Optional<String> collectedAt, String createdAt,
      Optional<String> placeAndDateOfIssuance, Optional<String> officialName,
      Optional<String> idCif, Optional<TaxStatusTaxPayerInformationSat> taxPayerInformation,
      Optional<TaxStatusAddressSat> address,
      Optional<List<TaxStatusEconomicActivitySat>> economicActivity,
      Optional<List<TaxStatusRegimensSat>> regimes,
      Optional<List<TaxStatusObligationsSat>> obligations, Optional<String> digitalStamp,
      Optional<String> digitalStampChain, Optional<String> pdf) {
    this.id = id;
    this.link = link;
    this.collectedAt = collectedAt;
    this.createdAt = createdAt;
    this.placeAndDateOfIssuance = placeAndDateOfIssuance;
    this.officialName = officialName;
    this.idCif = idCif;
    this.taxPayerInformation = taxPayerInformation;
    this.address = address;
    this.economicActivity = economicActivity;
    this.regimes = regimes;
    this.obligations = obligations;
    this.digitalStamp = digitalStamp;
    this.digitalStampChain = digitalStampChain;
    this.pdf = pdf;
  }

  /**
   * @return Unique identifier created by Belvo used to reference the current Tax Status.
   */
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * @return The <code>link.id</code> that the tax status is associated with.
   */
  @JsonProperty("link")
  public String getLink() {
    return link;
  }

  /**
   * @return The ISO-8601 timestamp when the data point was collected.
   */
  @JsonProperty("collected_at")
  public Optional<String> getCollectedAt() {
    return collectedAt;
  }

  /**
   * @return The ISO-8601 timestamp of when the data point was last updated in Belvo's database.
   */
  @JsonProperty("created_at")
  public String getCreatedAt() {
    return createdAt;
  }

  /**
   * @return The place and date of that the tax status was issued.
   */
  @JsonProperty("place_and_date_of_issuance")
  public Optional<String> getPlaceAndDateOfIssuance() {
    return placeAndDateOfIssuance;
  }

  /**
   * @return The name of the person or business.
   */
  @JsonProperty("official_name")
  public Optional<String> getOfficialName() {
    return officialName;
  }

  /**
   * @return The taxpayer's <em>Cédula de Identificación Fiscal</em> (CIF) ID.
   */
  @JsonProperty("id_cif")
  public Optional<String> getIdCif() {
    return idCif;
  }

  @JsonProperty("tax_payer_information")
  public Optional<TaxStatusTaxPayerInformationSat> getTaxPayerInformation() {
    return taxPayerInformation;
  }

  @JsonProperty("address")
  public Optional<TaxStatusAddressSat> getAddress() {
    return address;
  }

  /**
   * @return A list of economic activity objects.
   */
  @JsonProperty("economic_activity")
  public Optional<List<TaxStatusEconomicActivitySat>> getEconomicActivity() {
    return economicActivity;
  }

  /**
   * @return A list of regimen objects.
   */
  @JsonProperty("regimes")
  public Optional<List<TaxStatusRegimensSat>> getRegimes() {
    return regimes;
  }

  /**
   * @return Details regarding a business's obligations.
   * <p>ℹ️ For non-business accounts, this field will return empty.</p>
   */
  @JsonProperty("obligations")
  public Optional<List<TaxStatusObligationsSat>> getObligations() {
    return obligations;
  }

  /**
   * @return The validation certificate of the document.
   */
  @JsonProperty("digital_stamp")
  public Optional<String> getDigitalStamp() {
    return digitalStamp;
  }

  /**
   * @return A data chain containing the basic structure of a fiscal digital check. For Mexico, this is the <em>Comprobante Fiscal Digital por Internet</em> (CFDI).
   */
  @JsonProperty("digital_stamp_chain")
  public Optional<String> getDigitalStampChain() {
    return digitalStampChain;
  }

  /**
   * @return Tax status PDF as a binary string.
   */
  @JsonProperty("pdf")
  public Optional<String> getPdf() {
    return pdf;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof TaxStatusSat && equalTo((TaxStatusSat) other);
  }

  private boolean equalTo(TaxStatusSat other) {
    return id.equals(other.id) && link.equals(other.link) && collectedAt.equals(other.collectedAt) && createdAt.equals(other.createdAt) && placeAndDateOfIssuance.equals(other.placeAndDateOfIssuance) && officialName.equals(other.officialName) && idCif.equals(other.idCif) && taxPayerInformation.equals(other.taxPayerInformation) && address.equals(other.address) && economicActivity.equals(other.economicActivity) && regimes.equals(other.regimes) && obligations.equals(other.obligations) && digitalStamp.equals(other.digitalStamp) && digitalStampChain.equals(other.digitalStampChain) && pdf.equals(other.pdf);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.id, this.link, this.collectedAt, this.createdAt, this.placeAndDateOfIssuance, this.officialName, this.idCif, this.taxPayerInformation, this.address, this.economicActivity, this.regimes, this.obligations, this.digitalStamp, this.digitalStampChain, this.pdf);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "TaxStatusSat{" + "id: " + id + ", link: " + link + ", collectedAt: " + collectedAt + ", createdAt: " + createdAt + ", placeAndDateOfIssuance: " + placeAndDateOfIssuance + ", officialName: " + officialName + ", idCif: " + idCif + ", taxPayerInformation: " + taxPayerInformation + ", address: " + address + ", economicActivity: " + economicActivity + ", regimes: " + regimes + ", obligations: " + obligations + ", digitalStamp: " + digitalStamp + ", digitalStampChain: " + digitalStampChain + ", pdf: " + pdf + "}";
  }

  public static IdStage builder() {
    return new Builder();
  }

  public interface IdStage {
    LinkStage id(String id);

    Builder from(TaxStatusSat other);
  }

  public interface LinkStage {
    CreatedAtStage link(String link);
  }

  public interface CreatedAtStage {
    _FinalStage createdAt(String createdAt);
  }

  public interface _FinalStage {
    TaxStatusSat build();

    _FinalStage collectedAt(Optional<String> collectedAt);

    _FinalStage collectedAt(String collectedAt);

    _FinalStage placeAndDateOfIssuance(Optional<String> placeAndDateOfIssuance);

    _FinalStage placeAndDateOfIssuance(String placeAndDateOfIssuance);

    _FinalStage officialName(Optional<String> officialName);

    _FinalStage officialName(String officialName);

    _FinalStage idCif(Optional<String> idCif);

    _FinalStage idCif(String idCif);

    _FinalStage taxPayerInformation(Optional<TaxStatusTaxPayerInformationSat> taxPayerInformation);

    _FinalStage taxPayerInformation(TaxStatusTaxPayerInformationSat taxPayerInformation);

    _FinalStage address(Optional<TaxStatusAddressSat> address);

    _FinalStage address(TaxStatusAddressSat address);

    _FinalStage economicActivity(Optional<List<TaxStatusEconomicActivitySat>> economicActivity);

    _FinalStage economicActivity(List<TaxStatusEconomicActivitySat> economicActivity);

    _FinalStage regimes(Optional<List<TaxStatusRegimensSat>> regimes);

    _FinalStage regimes(List<TaxStatusRegimensSat> regimes);

    _FinalStage obligations(Optional<List<TaxStatusObligationsSat>> obligations);

    _FinalStage obligations(List<TaxStatusObligationsSat> obligations);

    _FinalStage digitalStamp(Optional<String> digitalStamp);

    _FinalStage digitalStamp(String digitalStamp);

    _FinalStage digitalStampChain(Optional<String> digitalStampChain);

    _FinalStage digitalStampChain(String digitalStampChain);

    _FinalStage pdf(Optional<String> pdf);

    _FinalStage pdf(String pdf);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements IdStage, LinkStage, CreatedAtStage, _FinalStage {
    private String id;

    private String link;

    private String createdAt;

    private Optional<String> pdf = Optional.empty();

    private Optional<String> digitalStampChain = Optional.empty();

    private Optional<String> digitalStamp = Optional.empty();

    private Optional<List<TaxStatusObligationsSat>> obligations = Optional.empty();

    private Optional<List<TaxStatusRegimensSat>> regimes = Optional.empty();

    private Optional<List<TaxStatusEconomicActivitySat>> economicActivity = Optional.empty();

    private Optional<TaxStatusAddressSat> address = Optional.empty();

    private Optional<TaxStatusTaxPayerInformationSat> taxPayerInformation = Optional.empty();

    private Optional<String> idCif = Optional.empty();

    private Optional<String> officialName = Optional.empty();

    private Optional<String> placeAndDateOfIssuance = Optional.empty();

    private Optional<String> collectedAt = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(TaxStatusSat other) {
      id(other.getId());
      link(other.getLink());
      collectedAt(other.getCollectedAt());
      createdAt(other.getCreatedAt());
      placeAndDateOfIssuance(other.getPlaceAndDateOfIssuance());
      officialName(other.getOfficialName());
      idCif(other.getIdCif());
      taxPayerInformation(other.getTaxPayerInformation());
      address(other.getAddress());
      economicActivity(other.getEconomicActivity());
      regimes(other.getRegimes());
      obligations(other.getObligations());
      digitalStamp(other.getDigitalStamp());
      digitalStampChain(other.getDigitalStampChain());
      pdf(other.getPdf());
      return this;
    }

    /**
     * <p>Unique identifier created by Belvo used to reference the current Tax Status.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("id")
    public LinkStage id(String id) {
      this.id = id;
      return this;
    }

    /**
     * <p>The <code>link.id</code> that the tax status is associated with.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("link")
    public CreatedAtStage link(String link) {
      this.link = link;
      return this;
    }

    /**
     * <p>The ISO-8601 timestamp of when the data point was last updated in Belvo's database.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("created_at")
    public _FinalStage createdAt(String createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * <p>Tax status PDF as a binary string.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage pdf(String pdf) {
      this.pdf = Optional.of(pdf);
      return this;
    }

    @Override
    @JsonSetter(
        value = "pdf",
        nulls = Nulls.SKIP
    )
    public _FinalStage pdf(Optional<String> pdf) {
      this.pdf = pdf;
      return this;
    }

    /**
     * <p>A data chain containing the basic structure of a fiscal digital check. For Mexico, this is the <em>Comprobante Fiscal Digital por Internet</em> (CFDI).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage digitalStampChain(String digitalStampChain) {
      this.digitalStampChain = Optional.of(digitalStampChain);
      return this;
    }

    @Override
    @JsonSetter(
        value = "digital_stamp_chain",
        nulls = Nulls.SKIP
    )
    public _FinalStage digitalStampChain(Optional<String> digitalStampChain) {
      this.digitalStampChain = digitalStampChain;
      return this;
    }

    /**
     * <p>The validation certificate of the document.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage digitalStamp(String digitalStamp) {
      this.digitalStamp = Optional.of(digitalStamp);
      return this;
    }

    @Override
    @JsonSetter(
        value = "digital_stamp",
        nulls = Nulls.SKIP
    )
    public _FinalStage digitalStamp(Optional<String> digitalStamp) {
      this.digitalStamp = digitalStamp;
      return this;
    }

    /**
     * <p>Details regarding a business's obligations.</p>
     * <p>ℹ️ For non-business accounts, this field will return empty.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage obligations(List<TaxStatusObligationsSat> obligations) {
      this.obligations = Optional.of(obligations);
      return this;
    }

    @Override
    @JsonSetter(
        value = "obligations",
        nulls = Nulls.SKIP
    )
    public _FinalStage obligations(Optional<List<TaxStatusObligationsSat>> obligations) {
      this.obligations = obligations;
      return this;
    }

    /**
     * <p>A list of regimen objects.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage regimes(List<TaxStatusRegimensSat> regimes) {
      this.regimes = Optional.of(regimes);
      return this;
    }

    @Override
    @JsonSetter(
        value = "regimes",
        nulls = Nulls.SKIP
    )
    public _FinalStage regimes(Optional<List<TaxStatusRegimensSat>> regimes) {
      this.regimes = regimes;
      return this;
    }

    /**
     * <p>A list of economic activity objects.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage economicActivity(List<TaxStatusEconomicActivitySat> economicActivity) {
      this.economicActivity = Optional.of(economicActivity);
      return this;
    }

    @Override
    @JsonSetter(
        value = "economic_activity",
        nulls = Nulls.SKIP
    )
    public _FinalStage economicActivity(
        Optional<List<TaxStatusEconomicActivitySat>> economicActivity) {
      this.economicActivity = economicActivity;
      return this;
    }

    @Override
    public _FinalStage address(TaxStatusAddressSat address) {
      this.address = Optional.of(address);
      return this;
    }

    @Override
    @JsonSetter(
        value = "address",
        nulls = Nulls.SKIP
    )
    public _FinalStage address(Optional<TaxStatusAddressSat> address) {
      this.address = address;
      return this;
    }

    @Override
    public _FinalStage taxPayerInformation(TaxStatusTaxPayerInformationSat taxPayerInformation) {
      this.taxPayerInformation = Optional.of(taxPayerInformation);
      return this;
    }

    @Override
    @JsonSetter(
        value = "tax_payer_information",
        nulls = Nulls.SKIP
    )
    public _FinalStage taxPayerInformation(
        Optional<TaxStatusTaxPayerInformationSat> taxPayerInformation) {
      this.taxPayerInformation = taxPayerInformation;
      return this;
    }

    /**
     * <p>The taxpayer's <em>Cédula de Identificación Fiscal</em> (CIF) ID.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage idCif(String idCif) {
      this.idCif = Optional.of(idCif);
      return this;
    }

    @Override
    @JsonSetter(
        value = "id_cif",
        nulls = Nulls.SKIP
    )
    public _FinalStage idCif(Optional<String> idCif) {
      this.idCif = idCif;
      return this;
    }

    /**
     * <p>The name of the person or business.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage officialName(String officialName) {
      this.officialName = Optional.of(officialName);
      return this;
    }

    @Override
    @JsonSetter(
        value = "official_name",
        nulls = Nulls.SKIP
    )
    public _FinalStage officialName(Optional<String> officialName) {
      this.officialName = officialName;
      return this;
    }

    /**
     * <p>The place and date of that the tax status was issued.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage placeAndDateOfIssuance(String placeAndDateOfIssuance) {
      this.placeAndDateOfIssuance = Optional.of(placeAndDateOfIssuance);
      return this;
    }

    @Override
    @JsonSetter(
        value = "place_and_date_of_issuance",
        nulls = Nulls.SKIP
    )
    public _FinalStage placeAndDateOfIssuance(Optional<String> placeAndDateOfIssuance) {
      this.placeAndDateOfIssuance = placeAndDateOfIssuance;
      return this;
    }

    /**
     * <p>The ISO-8601 timestamp when the data point was collected.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage collectedAt(String collectedAt) {
      this.collectedAt = Optional.of(collectedAt);
      return this;
    }

    @Override
    @JsonSetter(
        value = "collected_at",
        nulls = Nulls.SKIP
    )
    public _FinalStage collectedAt(Optional<String> collectedAt) {
      this.collectedAt = collectedAt;
      return this;
    }

    @Override
    public TaxStatusSat build() {
      return new TaxStatusSat(id, link, collectedAt, createdAt, placeAndDateOfIssuance, officialName, idCif, taxPayerInformation, address, economicActivity, regimes, obligations, digitalStamp, digitalStampChain, pdf);
    }
  }
}
