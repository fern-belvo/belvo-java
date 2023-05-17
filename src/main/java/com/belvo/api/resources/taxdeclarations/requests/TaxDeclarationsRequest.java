package com.belvo.api.resources.taxdeclarations.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = TaxDeclarationsRequest.Builder.class
)
public final class TaxDeclarationsRequest {
  private final Optional<String> omit;

  private final Optional<String> fields;

  private final String link;

  private final String yearFrom;

  private final String yearTo;

  private final Optional<Boolean> attachPdf;

  private final Optional<Boolean> saveData;

  private int _cachedHashCode;

  TaxDeclarationsRequest(Optional<String> omit, Optional<String> fields, String link,
      String yearFrom, String yearTo, Optional<Boolean> attachPdf, Optional<Boolean> saveData) {
    this.omit = omit;
    this.fields = fields;
    this.link = link;
    this.yearFrom = yearFrom;
    this.yearTo = yearTo;
    this.attachPdf = attachPdf;
    this.saveData = saveData;
  }

  /**
   * @return Omit certain fields from being returned in the response. For more information, see our <a href="https://developers.belvo.com/docs/searching-and-filtering">Filtering responses</a> DevPortal article.
   */
  @JsonProperty("omit")
  public Optional<String> getOmit() {
    return omit;
  }

  /**
   * @return Return only the specified fields in the response. For more information, see our <a href="https://developers.belvo.com/docs/searching-and-filtering">Filtering responses</a> DevPortal article.
   */
  @JsonProperty("fields")
  public Optional<String> getFields() {
    return fields;
  }

  /**
   * @return The fiscal <code>link.id</code> you want specific tax declaration information for.
   */
  @JsonProperty("link")
  public String getLink() {
    return link;
  }

  /**
   * @return The starting year you want to get tax declaration for, in <code>YYYY</code> format.
   */
  @JsonProperty("year_from")
  public String getYearFrom() {
    return yearFrom;
  }

  /**
   * @return The year you want to stop getting tax declaration for, in <code>YYYY</code> format.
   */
  @JsonProperty("year_to")
  public String getYearTo() {
    return yearTo;
  }

  /**
   * @return When this is set to <code>true</code>, you will receive the PDF as a binary string in the response.
   */
  @JsonProperty("attach_pdf")
  public Optional<Boolean> getAttachPdf() {
    return attachPdf;
  }

  /**
   * @return Indicates whether or not to persist the data in Belvo. By default, this is set to <code>true</code> and we return a 201 Created response.
   * When set to <code>false</code>, the data won't be persisted and we return a 200 OK response.
   */
  @JsonProperty("save_data")
  public Optional<Boolean> getSaveData() {
    return saveData;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof TaxDeclarationsRequest && equalTo((TaxDeclarationsRequest) other);
  }

  private boolean equalTo(TaxDeclarationsRequest other) {
    return omit.equals(other.omit) && fields.equals(other.fields) && link.equals(other.link) && yearFrom.equals(other.yearFrom) && yearTo.equals(other.yearTo) && attachPdf.equals(other.attachPdf) && saveData.equals(other.saveData);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.omit, this.fields, this.link, this.yearFrom, this.yearTo, this.attachPdf, this.saveData);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "TaxDeclarationsRequest{" + "omit: " + omit + ", fields: " + fields + ", link: " + link + ", yearFrom: " + yearFrom + ", yearTo: " + yearTo + ", attachPdf: " + attachPdf + ", saveData: " + saveData + "}";
  }

  public static LinkStage builder() {
    return new Builder();
  }

  public interface LinkStage {
    YearFromStage link(String link);

    Builder from(TaxDeclarationsRequest other);
  }

  public interface YearFromStage {
    YearToStage yearFrom(String yearFrom);
  }

  public interface YearToStage {
    _FinalStage yearTo(String yearTo);
  }

  public interface _FinalStage {
    TaxDeclarationsRequest build();

    _FinalStage omit(Optional<String> omit);

    _FinalStage omit(String omit);

    _FinalStage fields(Optional<String> fields);

    _FinalStage fields(String fields);

    _FinalStage attachPdf(Optional<Boolean> attachPdf);

    _FinalStage attachPdf(Boolean attachPdf);

    _FinalStage saveData(Optional<Boolean> saveData);

    _FinalStage saveData(Boolean saveData);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements LinkStage, YearFromStage, YearToStage, _FinalStage {
    private String link;

    private String yearFrom;

    private String yearTo;

    private Optional<Boolean> saveData = Optional.empty();

    private Optional<Boolean> attachPdf = Optional.empty();

    private Optional<String> fields = Optional.empty();

    private Optional<String> omit = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(TaxDeclarationsRequest other) {
      omit(other.getOmit());
      fields(other.getFields());
      link(other.getLink());
      yearFrom(other.getYearFrom());
      yearTo(other.getYearTo());
      attachPdf(other.getAttachPdf());
      saveData(other.getSaveData());
      return this;
    }

    /**
     * <p>The fiscal <code>link.id</code> you want specific tax declaration information for.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("link")
    public YearFromStage link(String link) {
      this.link = link;
      return this;
    }

    /**
     * <p>The starting year you want to get tax declaration for, in <code>YYYY</code> format.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("year_from")
    public YearToStage yearFrom(String yearFrom) {
      this.yearFrom = yearFrom;
      return this;
    }

    /**
     * <p>The year you want to stop getting tax declaration for, in <code>YYYY</code> format.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("year_to")
    public _FinalStage yearTo(String yearTo) {
      this.yearTo = yearTo;
      return this;
    }

    /**
     * <p>Indicates whether or not to persist the data in Belvo. By default, this is set to <code>true</code> and we return a 201 Created response.
     * When set to <code>false</code>, the data won't be persisted and we return a 200 OK response.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage saveData(Boolean saveData) {
      this.saveData = Optional.of(saveData);
      return this;
    }

    @Override
    @JsonSetter(
        value = "save_data",
        nulls = Nulls.SKIP
    )
    public _FinalStage saveData(Optional<Boolean> saveData) {
      this.saveData = saveData;
      return this;
    }

    /**
     * <p>When this is set to <code>true</code>, you will receive the PDF as a binary string in the response.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage attachPdf(Boolean attachPdf) {
      this.attachPdf = Optional.of(attachPdf);
      return this;
    }

    @Override
    @JsonSetter(
        value = "attach_pdf",
        nulls = Nulls.SKIP
    )
    public _FinalStage attachPdf(Optional<Boolean> attachPdf) {
      this.attachPdf = attachPdf;
      return this;
    }

    /**
     * <p>Return only the specified fields in the response. For more information, see our <a href="https://developers.belvo.com/docs/searching-and-filtering">Filtering responses</a> DevPortal article.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage fields(String fields) {
      this.fields = Optional.of(fields);
      return this;
    }

    @Override
    @JsonSetter(
        value = "fields",
        nulls = Nulls.SKIP
    )
    public _FinalStage fields(Optional<String> fields) {
      this.fields = fields;
      return this;
    }

    /**
     * <p>Omit certain fields from being returned in the response. For more information, see our <a href="https://developers.belvo.com/docs/searching-and-filtering">Filtering responses</a> DevPortal article.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage omit(String omit) {
      this.omit = Optional.of(omit);
      return this;
    }

    @Override
    @JsonSetter(
        value = "omit",
        nulls = Nulls.SKIP
    )
    public _FinalStage omit(Optional<String> omit) {
      this.omit = omit;
      return this;
    }

    @Override
    public TaxDeclarationsRequest build() {
      return new TaxDeclarationsRequest(omit, fields, link, yearFrom, yearTo, attachPdf, saveData);
    }
  }
}
