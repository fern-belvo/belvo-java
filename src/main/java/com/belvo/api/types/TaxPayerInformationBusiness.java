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
    builder = TaxPayerInformationBusiness.Builder.class
)
public final class TaxPayerInformationBusiness {
  private final Optional<String> firstLastName;

  private final Optional<String> secondLastName;

  private final Optional<String> firstName;

  private final Optional<String> otherNames;

  private final String companyName;

  private final String mainEconomicActivity;

  private final DocumentIdBusiness documentId;

  private final ReportingId reportingId;

  private int _cachedHashCode;

  TaxPayerInformationBusiness(Optional<String> firstLastName, Optional<String> secondLastName,
      Optional<String> firstName, Optional<String> otherNames, String companyName,
      String mainEconomicActivity, DocumentIdBusiness documentId, ReportingId reportingId) {
    this.firstLastName = firstLastName;
    this.secondLastName = secondLastName;
    this.firstName = firstName;
    this.otherNames = otherNames;
    this.companyName = companyName;
    this.mainEconomicActivity = mainEconomicActivity;
    this.documentId = documentId;
    this.reportingId = reportingId;
  }

  /**
   * @return The tax payer's first last name.
   */
  @JsonProperty("first_last_name")
  public Optional<String> getFirstLastName() {
    return firstLastName;
  }

  /**
   * @return The tax payer's second last name.
   */
  @JsonProperty("second_last_name")
  public Optional<String> getSecondLastName() {
    return secondLastName;
  }

  /**
   * @return The tax payer's first name.
   */
  @JsonProperty("first_name")
  public Optional<String> getFirstName() {
    return firstName;
  }

  /**
   * @return Additional names of the tax payer.
   */
  @JsonProperty("other_names")
  public Optional<String> getOtherNames() {
    return otherNames;
  }

  /**
   * @return The name of the company, as registered at the institution.
   */
  @JsonProperty("company_name")
  public String getCompanyName() {
    return companyName;
  }

  /**
   * @return The main economic activity the tax payer is involved in.
   */
  @JsonProperty("main_economic_activity")
  public String getMainEconomicActivity() {
    return mainEconomicActivity;
  }

  @JsonProperty("document_id")
  public DocumentIdBusiness getDocumentId() {
    return documentId;
  }

  @JsonProperty("reporting_id")
  public ReportingId getReportingId() {
    return reportingId;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof TaxPayerInformationBusiness && equalTo((TaxPayerInformationBusiness) other);
  }

  private boolean equalTo(TaxPayerInformationBusiness other) {
    return firstLastName.equals(other.firstLastName) && secondLastName.equals(other.secondLastName) && firstName.equals(other.firstName) && otherNames.equals(other.otherNames) && companyName.equals(other.companyName) && mainEconomicActivity.equals(other.mainEconomicActivity) && documentId.equals(other.documentId) && reportingId.equals(other.reportingId);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.firstLastName, this.secondLastName, this.firstName, this.otherNames, this.companyName, this.mainEconomicActivity, this.documentId, this.reportingId);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "TaxPayerInformationBusiness{" + "firstLastName: " + firstLastName + ", secondLastName: " + secondLastName + ", firstName: " + firstName + ", otherNames: " + otherNames + ", companyName: " + companyName + ", mainEconomicActivity: " + mainEconomicActivity + ", documentId: " + documentId + ", reportingId: " + reportingId + "}";
  }

  public static CompanyNameStage builder() {
    return new Builder();
  }

  public interface CompanyNameStage {
    MainEconomicActivityStage companyName(String companyName);

    Builder from(TaxPayerInformationBusiness other);
  }

  public interface MainEconomicActivityStage {
    DocumentIdStage mainEconomicActivity(String mainEconomicActivity);
  }

  public interface DocumentIdStage {
    ReportingIdStage documentId(DocumentIdBusiness documentId);
  }

  public interface ReportingIdStage {
    _FinalStage reportingId(ReportingId reportingId);
  }

  public interface _FinalStage {
    TaxPayerInformationBusiness build();

    _FinalStage firstLastName(Optional<String> firstLastName);

    _FinalStage firstLastName(String firstLastName);

    _FinalStage secondLastName(Optional<String> secondLastName);

    _FinalStage secondLastName(String secondLastName);

    _FinalStage firstName(Optional<String> firstName);

    _FinalStage firstName(String firstName);

    _FinalStage otherNames(Optional<String> otherNames);

    _FinalStage otherNames(String otherNames);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements CompanyNameStage, MainEconomicActivityStage, DocumentIdStage, ReportingIdStage, _FinalStage {
    private String companyName;

    private String mainEconomicActivity;

    private DocumentIdBusiness documentId;

    private ReportingId reportingId;

    private Optional<String> otherNames = Optional.empty();

    private Optional<String> firstName = Optional.empty();

    private Optional<String> secondLastName = Optional.empty();

    private Optional<String> firstLastName = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(TaxPayerInformationBusiness other) {
      firstLastName(other.getFirstLastName());
      secondLastName(other.getSecondLastName());
      firstName(other.getFirstName());
      otherNames(other.getOtherNames());
      companyName(other.getCompanyName());
      mainEconomicActivity(other.getMainEconomicActivity());
      documentId(other.getDocumentId());
      reportingId(other.getReportingId());
      return this;
    }

    /**
     * <p>The name of the company, as registered at the institution.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("company_name")
    public MainEconomicActivityStage companyName(String companyName) {
      this.companyName = companyName;
      return this;
    }

    /**
     * <p>The main economic activity the tax payer is involved in.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("main_economic_activity")
    public DocumentIdStage mainEconomicActivity(String mainEconomicActivity) {
      this.mainEconomicActivity = mainEconomicActivity;
      return this;
    }

    @Override
    @JsonSetter("document_id")
    public ReportingIdStage documentId(DocumentIdBusiness documentId) {
      this.documentId = documentId;
      return this;
    }

    @Override
    @JsonSetter("reporting_id")
    public _FinalStage reportingId(ReportingId reportingId) {
      this.reportingId = reportingId;
      return this;
    }

    /**
     * <p>Additional names of the tax payer.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage otherNames(String otherNames) {
      this.otherNames = Optional.of(otherNames);
      return this;
    }

    @Override
    @JsonSetter(
        value = "other_names",
        nulls = Nulls.SKIP
    )
    public _FinalStage otherNames(Optional<String> otherNames) {
      this.otherNames = otherNames;
      return this;
    }

    /**
     * <p>The tax payer's first name.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage firstName(String firstName) {
      this.firstName = Optional.of(firstName);
      return this;
    }

    @Override
    @JsonSetter(
        value = "first_name",
        nulls = Nulls.SKIP
    )
    public _FinalStage firstName(Optional<String> firstName) {
      this.firstName = firstName;
      return this;
    }

    /**
     * <p>The tax payer's second last name.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage secondLastName(String secondLastName) {
      this.secondLastName = Optional.of(secondLastName);
      return this;
    }

    @Override
    @JsonSetter(
        value = "second_last_name",
        nulls = Nulls.SKIP
    )
    public _FinalStage secondLastName(Optional<String> secondLastName) {
      this.secondLastName = secondLastName;
      return this;
    }

    /**
     * <p>The tax payer's first last name.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage firstLastName(String firstLastName) {
      this.firstLastName = Optional.of(firstLastName);
      return this;
    }

    @Override
    @JsonSetter(
        value = "first_last_name",
        nulls = Nulls.SKIP
    )
    public _FinalStage firstLastName(Optional<String> firstLastName) {
      this.firstLastName = firstLastName;
      return this;
    }

    @Override
    public TaxPayerInformationBusiness build() {
      return new TaxPayerInformationBusiness(firstLastName, secondLastName, firstName, otherNames, companyName, mainEconomicActivity, documentId, reportingId);
    }
  }
}
