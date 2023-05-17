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
    builder = TaxStatusDian.Builder.class
)
public final class TaxStatusDian {
  private final String id;

  private final String link;

  private final Optional<String> collectedAt;

  private final String createdAt;

  private final Optional<String> placeAndDateOfIssuance;

  private final Optional<String> officialName;

  private final Optional<String> idCif;

  private final TaxStatusTaxPayerInformationDian taxPayerInformation;

  private final TaxStatusAddressDian address;

  private final Optional<List<TaxStatusEconomicActivityDian>> economicActivity;

  private final Optional<List<TaxStatusRegimensDian>> regimes;

  private final Optional<List<TaxStatusObligationsDian>> obligations;

  private final Optional<String> digitalStamp;

  private final Optional<String> digitalStampChain;

  private final Optional<String> pdf;

  private int _cachedHashCode;

  TaxStatusDian(String id, String link, Optional<String> collectedAt, String createdAt,
      Optional<String> placeAndDateOfIssuance, Optional<String> officialName,
      Optional<String> idCif, TaxStatusTaxPayerInformationDian taxPayerInformation,
      TaxStatusAddressDian address, Optional<List<TaxStatusEconomicActivityDian>> economicActivity,
      Optional<List<TaxStatusRegimensDian>> regimes,
      Optional<List<TaxStatusObligationsDian>> obligations, Optional<String> digitalStamp,
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
   * @return The date when the tax status was issued. For example, <code>2020-08-05/18:55:16</code>.
   */
  @JsonProperty("place_and_date_of_issuance")
  public Optional<String> getPlaceAndDateOfIssuance() {
    return placeAndDateOfIssuance;
  }

  /**
   * @return The name of the business.
   * <p>Note: For individuals in Colombia, this field will return <code>null</code>.</p>
   */
  @JsonProperty("official_name")
  public Optional<String> getOfficialName() {
    return officialName;
  }

  /**
   * @return The taxpayer's <em>Cédula de ciudadanía</em> (CC) ID. Only applicable for individuals.
   */
  @JsonProperty("id_cif")
  public Optional<String> getIdCif() {
    return idCif;
  }

  @JsonProperty("tax_payer_information")
  public TaxStatusTaxPayerInformationDian getTaxPayerInformation() {
    return taxPayerInformation;
  }

  @JsonProperty("address")
  public TaxStatusAddressDian getAddress() {
    return address;
  }

  /**
   * @return A list of economic activity objects.
   */
  @JsonProperty("economic_activity")
  public Optional<List<TaxStatusEconomicActivityDian>> getEconomicActivity() {
    return economicActivity;
  }

  /**
   * @return A list of regimen objects.
   */
  @JsonProperty("regimes")
  public Optional<List<TaxStatusRegimensDian>> getRegimes() {
    return regimes;
  }

  /**
   * @return Details regarding a business's obligations.
   * <p>ℹ️ For non-business accounts, this field will return empty.</p>
   */
  @JsonProperty("obligations")
  public Optional<List<TaxStatusObligationsDian>> getObligations() {
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
   * @return <strong>Note</strong>: This field is not applicable for DIAN Colombia and will return <code>null</code>.
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
    return other instanceof TaxStatusDian && equalTo((TaxStatusDian) other);
  }

  private boolean equalTo(TaxStatusDian other) {
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
    return "TaxStatusDian{" + "id: " + id + ", link: " + link + ", collectedAt: " + collectedAt + ", createdAt: " + createdAt + ", placeAndDateOfIssuance: " + placeAndDateOfIssuance + ", officialName: " + officialName + ", idCif: " + idCif + ", taxPayerInformation: " + taxPayerInformation + ", address: " + address + ", economicActivity: " + economicActivity + ", regimes: " + regimes + ", obligations: " + obligations + ", digitalStamp: " + digitalStamp + ", digitalStampChain: " + digitalStampChain + ", pdf: " + pdf + "}";
  }

  public static IdStage builder() {
    return new Builder();
  }

  public interface IdStage {
    LinkStage id(String id);

    Builder from(TaxStatusDian other);
  }

  public interface LinkStage {
    CreatedAtStage link(String link);
  }

  public interface CreatedAtStage {
    TaxPayerInformationStage createdAt(String createdAt);
  }

  public interface TaxPayerInformationStage {
    AddressStage taxPayerInformation(TaxStatusTaxPayerInformationDian taxPayerInformation);
  }

  public interface AddressStage {
    _FinalStage address(TaxStatusAddressDian address);
  }

  public interface _FinalStage {
    TaxStatusDian build();

    _FinalStage collectedAt(Optional<String> collectedAt);

    _FinalStage collectedAt(String collectedAt);

    _FinalStage placeAndDateOfIssuance(Optional<String> placeAndDateOfIssuance);

    _FinalStage placeAndDateOfIssuance(String placeAndDateOfIssuance);

    _FinalStage officialName(Optional<String> officialName);

    _FinalStage officialName(String officialName);

    _FinalStage idCif(Optional<String> idCif);

    _FinalStage idCif(String idCif);

    _FinalStage economicActivity(Optional<List<TaxStatusEconomicActivityDian>> economicActivity);

    _FinalStage economicActivity(List<TaxStatusEconomicActivityDian> economicActivity);

    _FinalStage regimes(Optional<List<TaxStatusRegimensDian>> regimes);

    _FinalStage regimes(List<TaxStatusRegimensDian> regimes);

    _FinalStage obligations(Optional<List<TaxStatusObligationsDian>> obligations);

    _FinalStage obligations(List<TaxStatusObligationsDian> obligations);

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
  public static final class Builder implements IdStage, LinkStage, CreatedAtStage, TaxPayerInformationStage, AddressStage, _FinalStage {
    private String id;

    private String link;

    private String createdAt;

    private TaxStatusTaxPayerInformationDian taxPayerInformation;

    private TaxStatusAddressDian address;

    private Optional<String> pdf = Optional.empty();

    private Optional<String> digitalStampChain = Optional.empty();

    private Optional<String> digitalStamp = Optional.empty();

    private Optional<List<TaxStatusObligationsDian>> obligations = Optional.empty();

    private Optional<List<TaxStatusRegimensDian>> regimes = Optional.empty();

    private Optional<List<TaxStatusEconomicActivityDian>> economicActivity = Optional.empty();

    private Optional<String> idCif = Optional.empty();

    private Optional<String> officialName = Optional.empty();

    private Optional<String> placeAndDateOfIssuance = Optional.empty();

    private Optional<String> collectedAt = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(TaxStatusDian other) {
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
    public TaxPayerInformationStage createdAt(String createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    @Override
    @JsonSetter("tax_payer_information")
    public AddressStage taxPayerInformation(TaxStatusTaxPayerInformationDian taxPayerInformation) {
      this.taxPayerInformation = taxPayerInformation;
      return this;
    }

    @Override
    @JsonSetter("address")
    public _FinalStage address(TaxStatusAddressDian address) {
      this.address = address;
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
     * <p><strong>Note</strong>: This field is not applicable for DIAN Colombia and will return <code>null</code>.</p>
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
    public _FinalStage obligations(List<TaxStatusObligationsDian> obligations) {
      this.obligations = Optional.of(obligations);
      return this;
    }

    @Override
    @JsonSetter(
        value = "obligations",
        nulls = Nulls.SKIP
    )
    public _FinalStage obligations(Optional<List<TaxStatusObligationsDian>> obligations) {
      this.obligations = obligations;
      return this;
    }

    /**
     * <p>A list of regimen objects.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage regimes(List<TaxStatusRegimensDian> regimes) {
      this.regimes = Optional.of(regimes);
      return this;
    }

    @Override
    @JsonSetter(
        value = "regimes",
        nulls = Nulls.SKIP
    )
    public _FinalStage regimes(Optional<List<TaxStatusRegimensDian>> regimes) {
      this.regimes = regimes;
      return this;
    }

    /**
     * <p>A list of economic activity objects.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage economicActivity(List<TaxStatusEconomicActivityDian> economicActivity) {
      this.economicActivity = Optional.of(economicActivity);
      return this;
    }

    @Override
    @JsonSetter(
        value = "economic_activity",
        nulls = Nulls.SKIP
    )
    public _FinalStage economicActivity(
        Optional<List<TaxStatusEconomicActivityDian>> economicActivity) {
      this.economicActivity = economicActivity;
      return this;
    }

    /**
     * <p>The taxpayer's <em>Cédula de ciudadanía</em> (CC) ID. Only applicable for individuals.</p>
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
     * <p>The name of the business.</p>
     * <p>Note: For individuals in Colombia, this field will return <code>null</code>.</p>
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
     * <p>The date when the tax status was issued. For example, <code>2020-08-05/18:55:16</code>.</p>
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
    public TaxStatusDian build() {
      return new TaxStatusDian(id, link, collectedAt, createdAt, placeAndDateOfIssuance, officialName, idCif, taxPayerInformation, address, economicActivity, regimes, obligations, digitalStamp, digitalStampChain, pdf);
    }
  }
}
