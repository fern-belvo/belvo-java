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
    builder = TaxPayerInformationIndividual.Builder.class
)
public final class TaxPayerInformationIndividual {
  private final String firstLastName;

  private final String secondLastName;

  private final String firstName;

  private final String otherNames;

  private final String mainEconomicActivity;

  private final DocumentIdIndividual documentId;

  private final ReportingId reportingId;

  private int _cachedHashCode;

  TaxPayerInformationIndividual(String firstLastName, String secondLastName, String firstName,
      String otherNames, String mainEconomicActivity, DocumentIdIndividual documentId,
      ReportingId reportingId) {
    this.firstLastName = firstLastName;
    this.secondLastName = secondLastName;
    this.firstName = firstName;
    this.otherNames = otherNames;
    this.mainEconomicActivity = mainEconomicActivity;
    this.documentId = documentId;
    this.reportingId = reportingId;
  }

  /**
   * @return The tax payer's first last name.
   */
  @JsonProperty("first_last_name")
  public String getFirstLastName() {
    return firstLastName;
  }

  /**
   * @return The tax payer's second last name.
   */
  @JsonProperty("second_last_name")
  public String getSecondLastName() {
    return secondLastName;
  }

  /**
   * @return The tax payer's first name.
   */
  @JsonProperty("first_name")
  public String getFirstName() {
    return firstName;
  }

  /**
   * @return Additional names of the tax payer.
   */
  @JsonProperty("other_names")
  public String getOtherNames() {
    return otherNames;
  }

  /**
   * @return The main economic activity the tax payer is involved in.
   */
  @JsonProperty("main_economic_activity")
  public String getMainEconomicActivity() {
    return mainEconomicActivity;
  }

  @JsonProperty("document_id")
  public DocumentIdIndividual getDocumentId() {
    return documentId;
  }

  @JsonProperty("reporting_id")
  public ReportingId getReportingId() {
    return reportingId;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof TaxPayerInformationIndividual && equalTo((TaxPayerInformationIndividual) other);
  }

  private boolean equalTo(TaxPayerInformationIndividual other) {
    return firstLastName.equals(other.firstLastName) && secondLastName.equals(other.secondLastName) && firstName.equals(other.firstName) && otherNames.equals(other.otherNames) && mainEconomicActivity.equals(other.mainEconomicActivity) && documentId.equals(other.documentId) && reportingId.equals(other.reportingId);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.firstLastName, this.secondLastName, this.firstName, this.otherNames, this.mainEconomicActivity, this.documentId, this.reportingId);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "TaxPayerInformationIndividual{" + "firstLastName: " + firstLastName + ", secondLastName: " + secondLastName + ", firstName: " + firstName + ", otherNames: " + otherNames + ", mainEconomicActivity: " + mainEconomicActivity + ", documentId: " + documentId + ", reportingId: " + reportingId + "}";
  }

  public static FirstLastNameStage builder() {
    return new Builder();
  }

  public interface FirstLastNameStage {
    SecondLastNameStage firstLastName(String firstLastName);

    Builder from(TaxPayerInformationIndividual other);
  }

  public interface SecondLastNameStage {
    FirstNameStage secondLastName(String secondLastName);
  }

  public interface FirstNameStage {
    OtherNamesStage firstName(String firstName);
  }

  public interface OtherNamesStage {
    MainEconomicActivityStage otherNames(String otherNames);
  }

  public interface MainEconomicActivityStage {
    DocumentIdStage mainEconomicActivity(String mainEconomicActivity);
  }

  public interface DocumentIdStage {
    ReportingIdStage documentId(DocumentIdIndividual documentId);
  }

  public interface ReportingIdStage {
    _FinalStage reportingId(ReportingId reportingId);
  }

  public interface _FinalStage {
    TaxPayerInformationIndividual build();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements FirstLastNameStage, SecondLastNameStage, FirstNameStage, OtherNamesStage, MainEconomicActivityStage, DocumentIdStage, ReportingIdStage, _FinalStage {
    private String firstLastName;

    private String secondLastName;

    private String firstName;

    private String otherNames;

    private String mainEconomicActivity;

    private DocumentIdIndividual documentId;

    private ReportingId reportingId;

    private Builder() {
    }

    @Override
    public Builder from(TaxPayerInformationIndividual other) {
      firstLastName(other.getFirstLastName());
      secondLastName(other.getSecondLastName());
      firstName(other.getFirstName());
      otherNames(other.getOtherNames());
      mainEconomicActivity(other.getMainEconomicActivity());
      documentId(other.getDocumentId());
      reportingId(other.getReportingId());
      return this;
    }

    /**
     * <p>The tax payer's first last name.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("first_last_name")
    public SecondLastNameStage firstLastName(String firstLastName) {
      this.firstLastName = firstLastName;
      return this;
    }

    /**
     * <p>The tax payer's second last name.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("second_last_name")
    public FirstNameStage secondLastName(String secondLastName) {
      this.secondLastName = secondLastName;
      return this;
    }

    /**
     * <p>The tax payer's first name.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("first_name")
    public OtherNamesStage firstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    /**
     * <p>Additional names of the tax payer.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("other_names")
    public MainEconomicActivityStage otherNames(String otherNames) {
      this.otherNames = otherNames;
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
    public ReportingIdStage documentId(DocumentIdIndividual documentId) {
      this.documentId = documentId;
      return this;
    }

    @Override
    @JsonSetter("reporting_id")
    public _FinalStage reportingId(ReportingId reportingId) {
      this.reportingId = reportingId;
      return this;
    }

    @Override
    public TaxPayerInformationIndividual build() {
      return new TaxPayerInformationIndividual(firstLastName, secondLastName, firstName, otherNames, mainEconomicActivity, documentId, reportingId);
    }
  }
}
