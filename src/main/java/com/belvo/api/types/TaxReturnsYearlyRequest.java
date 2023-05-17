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
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = TaxReturnsYearlyRequest.Builder.class
)
public final class TaxReturnsYearlyRequest {
  private final String link;

  private final Optional<Boolean> attachPdf;

  private final Optional<Boolean> saveData;

  private final String type;

  private final String yearFrom;

  private final String yearTo;

  private int _cachedHashCode;

  TaxReturnsYearlyRequest(String link, Optional<Boolean> attachPdf, Optional<Boolean> saveData,
      String type, String yearFrom, String yearTo) {
    this.link = link;
    this.attachPdf = attachPdf;
    this.saveData = saveData;
    this.type = type;
    this.yearFrom = yearFrom;
    this.yearTo = yearTo;
  }

  /**
   * @return The fiscal <code>link.id</code> you want specific tax return information for.
   */
  @JsonProperty("link")
  public String getLink() {
    return link;
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

  /**
   * @return The type of tax return to return. For yearly tax returns this must be set to <code>yearly</code>.
   * <p>By default, Belvo returns the yearly (annual) tax returns.</p>
   */
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  /**
   * @return The starting year you want to get tax returns for, in <code>YYYY</code> format.
   */
  @JsonProperty("year_from")
  public String getYearFrom() {
    return yearFrom;
  }

  /**
   * @return The year you want to stop getting tax returns for, in <code>YYYY</code> format.
   */
  @JsonProperty("year_to")
  public String getYearTo() {
    return yearTo;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof TaxReturnsYearlyRequest && equalTo((TaxReturnsYearlyRequest) other);
  }

  private boolean equalTo(TaxReturnsYearlyRequest other) {
    return link.equals(other.link) && attachPdf.equals(other.attachPdf) && saveData.equals(other.saveData) && type.equals(other.type) && yearFrom.equals(other.yearFrom) && yearTo.equals(other.yearTo);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.link, this.attachPdf, this.saveData, this.type, this.yearFrom, this.yearTo);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "TaxReturnsYearlyRequest{" + "link: " + link + ", attachPdf: " + attachPdf + ", saveData: " + saveData + ", type: " + type + ", yearFrom: " + yearFrom + ", yearTo: " + yearTo + "}";
  }

  public static LinkStage builder() {
    return new Builder();
  }

  public interface LinkStage {
    TypeStage link(String link);

    Builder from(TaxReturnsYearlyRequest other);
  }

  public interface TypeStage {
    YearFromStage type(String type);
  }

  public interface YearFromStage {
    YearToStage yearFrom(String yearFrom);
  }

  public interface YearToStage {
    _FinalStage yearTo(String yearTo);
  }

  public interface _FinalStage {
    TaxReturnsYearlyRequest build();

    _FinalStage attachPdf(Optional<Boolean> attachPdf);

    _FinalStage attachPdf(Boolean attachPdf);

    _FinalStage saveData(Optional<Boolean> saveData);

    _FinalStage saveData(Boolean saveData);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements LinkStage, TypeStage, YearFromStage, YearToStage, _FinalStage {
    private String link;

    private String type;

    private String yearFrom;

    private String yearTo;

    private Optional<Boolean> saveData = Optional.empty();

    private Optional<Boolean> attachPdf = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(TaxReturnsYearlyRequest other) {
      link(other.getLink());
      attachPdf(other.getAttachPdf());
      saveData(other.getSaveData());
      type(other.getType());
      yearFrom(other.getYearFrom());
      yearTo(other.getYearTo());
      return this;
    }

    /**
     * <p>The fiscal <code>link.id</code> you want specific tax return information for.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("link")
    public TypeStage link(String link) {
      this.link = link;
      return this;
    }

    /**
     * <p>The type of tax return to return. For yearly tax returns this must be set to <code>yearly</code>.</p>
     * <p>By default, Belvo returns the yearly (annual) tax returns.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("type")
    public YearFromStage type(String type) {
      this.type = type;
      return this;
    }

    /**
     * <p>The starting year you want to get tax returns for, in <code>YYYY</code> format.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("year_from")
    public YearToStage yearFrom(String yearFrom) {
      this.yearFrom = yearFrom;
      return this;
    }

    /**
     * <p>The year you want to stop getting tax returns for, in <code>YYYY</code> format.</p>
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

    @Override
    public TaxReturnsYearlyRequest build() {
      return new TaxReturnsYearlyRequest(link, attachPdf, saveData, type, yearFrom, yearTo);
    }
  }
}
