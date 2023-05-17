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
    builder = TaxDeclarationBusiness.Builder.class
)
public final class TaxDeclarationBusiness {
  private final String id;

  private final String link;

  private final String collectedAt;

  private final String createdAt;

  private final DocumentInformationBusiness documentInformation;

  private final TaxPayerInformationBusiness taxPayerInformation;

  private final EquityStatementBusiness equityStatement;

  private final AnnualIncomeStatementBusiness annualIncomeStatement;

  private final AnnualCostsAndDeductionsStatementBusiness annualCostsAndDeductionsStatement;

  private final TaxAssessmentBusiness taxAssessment;

  private final String dateIssued;

  private final Optional<String> pdf;

  private int _cachedHashCode;

  TaxDeclarationBusiness(String id, String link, String collectedAt, String createdAt,
      DocumentInformationBusiness documentInformation,
      TaxPayerInformationBusiness taxPayerInformation, EquityStatementBusiness equityStatement,
      AnnualIncomeStatementBusiness annualIncomeStatement,
      AnnualCostsAndDeductionsStatementBusiness annualCostsAndDeductionsStatement,
      TaxAssessmentBusiness taxAssessment, String dateIssued, Optional<String> pdf) {
    this.id = id;
    this.link = link;
    this.collectedAt = collectedAt;
    this.createdAt = createdAt;
    this.documentInformation = documentInformation;
    this.taxPayerInformation = taxPayerInformation;
    this.equityStatement = equityStatement;
    this.annualIncomeStatement = annualIncomeStatement;
    this.annualCostsAndDeductionsStatement = annualCostsAndDeductionsStatement;
    this.taxAssessment = taxAssessment;
    this.dateIssued = dateIssued;
    this.pdf = pdf;
  }

  /**
   * @return Belvo's unique ID for the current tax declaration.
   */
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * @return Belvo's unique ID of the user that this tax declaration is associated with.
   */
  @JsonProperty("link")
  public String getLink() {
    return link;
  }

  /**
   * @return The ISO-8601 timestamp when the data point was collected.
   */
  @JsonProperty("collected_at")
  public String getCollectedAt() {
    return collectedAt;
  }

  /**
   * @return The ISO-8601 timestamp of when the data point was last updated in Belvo's database.
   */
  @JsonProperty("created_at")
  public String getCreatedAt() {
    return createdAt;
  }

  @JsonProperty("document_information")
  public DocumentInformationBusiness getDocumentInformation() {
    return documentInformation;
  }

  @JsonProperty("tax_payer_information")
  public TaxPayerInformationBusiness getTaxPayerInformation() {
    return taxPayerInformation;
  }

  @JsonProperty("equity_statement")
  public EquityStatementBusiness getEquityStatement() {
    return equityStatement;
  }

  @JsonProperty("annual_income_statement")
  public AnnualIncomeStatementBusiness getAnnualIncomeStatement() {
    return annualIncomeStatement;
  }

  @JsonProperty("annual_costs_and_deductions_statement")
  public AnnualCostsAndDeductionsStatementBusiness getAnnualCostsAndDeductionsStatement() {
    return annualCostsAndDeductionsStatement;
  }

  @JsonProperty("tax_assessment")
  public TaxAssessmentBusiness getTaxAssessment() {
    return taxAssessment;
  }

  /**
   * @return The date the tax declaration was issued by the fiscal institution.
   */
  @JsonProperty("date_issued")
  public String getDateIssued() {
    return dateIssued;
  }

  /**
   * @return The PDF of the tax declaration, as a binary string.
   */
  @JsonProperty("pdf")
  public Optional<String> getPdf() {
    return pdf;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof TaxDeclarationBusiness && equalTo((TaxDeclarationBusiness) other);
  }

  private boolean equalTo(TaxDeclarationBusiness other) {
    return id.equals(other.id) && link.equals(other.link) && collectedAt.equals(other.collectedAt) && createdAt.equals(other.createdAt) && documentInformation.equals(other.documentInformation) && taxPayerInformation.equals(other.taxPayerInformation) && equityStatement.equals(other.equityStatement) && annualIncomeStatement.equals(other.annualIncomeStatement) && annualCostsAndDeductionsStatement.equals(other.annualCostsAndDeductionsStatement) && taxAssessment.equals(other.taxAssessment) && dateIssued.equals(other.dateIssued) && pdf.equals(other.pdf);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.id, this.link, this.collectedAt, this.createdAt, this.documentInformation, this.taxPayerInformation, this.equityStatement, this.annualIncomeStatement, this.annualCostsAndDeductionsStatement, this.taxAssessment, this.dateIssued, this.pdf);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "TaxDeclarationBusiness{" + "id: " + id + ", link: " + link + ", collectedAt: " + collectedAt + ", createdAt: " + createdAt + ", documentInformation: " + documentInformation + ", taxPayerInformation: " + taxPayerInformation + ", equityStatement: " + equityStatement + ", annualIncomeStatement: " + annualIncomeStatement + ", annualCostsAndDeductionsStatement: " + annualCostsAndDeductionsStatement + ", taxAssessment: " + taxAssessment + ", dateIssued: " + dateIssued + ", pdf: " + pdf + "}";
  }

  public static IdStage builder() {
    return new Builder();
  }

  public interface IdStage {
    LinkStage id(String id);

    Builder from(TaxDeclarationBusiness other);
  }

  public interface LinkStage {
    CollectedAtStage link(String link);
  }

  public interface CollectedAtStage {
    CreatedAtStage collectedAt(String collectedAt);
  }

  public interface CreatedAtStage {
    DocumentInformationStage createdAt(String createdAt);
  }

  public interface DocumentInformationStage {
    TaxPayerInformationStage documentInformation(DocumentInformationBusiness documentInformation);
  }

  public interface TaxPayerInformationStage {
    EquityStatementStage taxPayerInformation(TaxPayerInformationBusiness taxPayerInformation);
  }

  public interface EquityStatementStage {
    AnnualIncomeStatementStage equityStatement(EquityStatementBusiness equityStatement);
  }

  public interface AnnualIncomeStatementStage {
    AnnualCostsAndDeductionsStatementStage annualIncomeStatement(
        AnnualIncomeStatementBusiness annualIncomeStatement);
  }

  public interface AnnualCostsAndDeductionsStatementStage {
    TaxAssessmentStage annualCostsAndDeductionsStatement(
        AnnualCostsAndDeductionsStatementBusiness annualCostsAndDeductionsStatement);
  }

  public interface TaxAssessmentStage {
    DateIssuedStage taxAssessment(TaxAssessmentBusiness taxAssessment);
  }

  public interface DateIssuedStage {
    _FinalStage dateIssued(String dateIssued);
  }

  public interface _FinalStage {
    TaxDeclarationBusiness build();

    _FinalStage pdf(Optional<String> pdf);

    _FinalStage pdf(String pdf);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements IdStage, LinkStage, CollectedAtStage, CreatedAtStage, DocumentInformationStage, TaxPayerInformationStage, EquityStatementStage, AnnualIncomeStatementStage, AnnualCostsAndDeductionsStatementStage, TaxAssessmentStage, DateIssuedStage, _FinalStage {
    private String id;

    private String link;

    private String collectedAt;

    private String createdAt;

    private DocumentInformationBusiness documentInformation;

    private TaxPayerInformationBusiness taxPayerInformation;

    private EquityStatementBusiness equityStatement;

    private AnnualIncomeStatementBusiness annualIncomeStatement;

    private AnnualCostsAndDeductionsStatementBusiness annualCostsAndDeductionsStatement;

    private TaxAssessmentBusiness taxAssessment;

    private String dateIssued;

    private Optional<String> pdf = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(TaxDeclarationBusiness other) {
      id(other.getId());
      link(other.getLink());
      collectedAt(other.getCollectedAt());
      createdAt(other.getCreatedAt());
      documentInformation(other.getDocumentInformation());
      taxPayerInformation(other.getTaxPayerInformation());
      equityStatement(other.getEquityStatement());
      annualIncomeStatement(other.getAnnualIncomeStatement());
      annualCostsAndDeductionsStatement(other.getAnnualCostsAndDeductionsStatement());
      taxAssessment(other.getTaxAssessment());
      dateIssued(other.getDateIssued());
      pdf(other.getPdf());
      return this;
    }

    /**
     * <p>Belvo's unique ID for the current tax declaration.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("id")
    public LinkStage id(String id) {
      this.id = id;
      return this;
    }

    /**
     * <p>Belvo's unique ID of the user that this tax declaration is associated with.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("link")
    public CollectedAtStage link(String link) {
      this.link = link;
      return this;
    }

    /**
     * <p>The ISO-8601 timestamp when the data point was collected.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("collected_at")
    public CreatedAtStage collectedAt(String collectedAt) {
      this.collectedAt = collectedAt;
      return this;
    }

    /**
     * <p>The ISO-8601 timestamp of when the data point was last updated in Belvo's database.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("created_at")
    public DocumentInformationStage createdAt(String createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    @Override
    @JsonSetter("document_information")
    public TaxPayerInformationStage documentInformation(
        DocumentInformationBusiness documentInformation) {
      this.documentInformation = documentInformation;
      return this;
    }

    @Override
    @JsonSetter("tax_payer_information")
    public EquityStatementStage taxPayerInformation(
        TaxPayerInformationBusiness taxPayerInformation) {
      this.taxPayerInformation = taxPayerInformation;
      return this;
    }

    @Override
    @JsonSetter("equity_statement")
    public AnnualIncomeStatementStage equityStatement(EquityStatementBusiness equityStatement) {
      this.equityStatement = equityStatement;
      return this;
    }

    @Override
    @JsonSetter("annual_income_statement")
    public AnnualCostsAndDeductionsStatementStage annualIncomeStatement(
        AnnualIncomeStatementBusiness annualIncomeStatement) {
      this.annualIncomeStatement = annualIncomeStatement;
      return this;
    }

    @Override
    @JsonSetter("annual_costs_and_deductions_statement")
    public TaxAssessmentStage annualCostsAndDeductionsStatement(
        AnnualCostsAndDeductionsStatementBusiness annualCostsAndDeductionsStatement) {
      this.annualCostsAndDeductionsStatement = annualCostsAndDeductionsStatement;
      return this;
    }

    @Override
    @JsonSetter("tax_assessment")
    public DateIssuedStage taxAssessment(TaxAssessmentBusiness taxAssessment) {
      this.taxAssessment = taxAssessment;
      return this;
    }

    /**
     * <p>The date the tax declaration was issued by the fiscal institution.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("date_issued")
    public _FinalStage dateIssued(String dateIssued) {
      this.dateIssued = dateIssued;
      return this;
    }

    /**
     * <p>The PDF of the tax declaration, as a binary string.</p>
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

    @Override
    public TaxDeclarationBusiness build() {
      return new TaxDeclarationBusiness(id, link, collectedAt, createdAt, documentInformation, taxPayerInformation, equityStatement, annualIncomeStatement, annualCostsAndDeductionsStatement, taxAssessment, dateIssued, pdf);
    }
  }
}
