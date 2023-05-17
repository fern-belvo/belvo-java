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
    builder = TaxReturnsMonthlyRequest.Builder.class
)
public final class TaxReturnsMonthlyRequest {
  private final String link;

  private final Optional<Boolean> attachPdf;

  private final Optional<Boolean> saveData;

  private final String type;

  private final String dateFrom;

  private final String dateTo;

  private int _cachedHashCode;

  TaxReturnsMonthlyRequest(String link, Optional<Boolean> attachPdf, Optional<Boolean> saveData,
      String type, String dateFrom, String dateTo) {
    this.link = link;
    this.attachPdf = attachPdf;
    this.saveData = saveData;
    this.type = type;
    this.dateFrom = dateFrom;
    this.dateTo = dateTo;
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
   * @return The type of tax return to return. For monthly tax returns, this field must be set to <code>monthly</code>.
   */
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  /**
   * @return The starting date you want to get tax returns for, in <code>YYYY-MM-DD</code> format.
   * <p>⚠️ The value of <code>date_from</code> cannot be greater than <code>date_to</code>.</p>
   */
  @JsonProperty("date_from")
  public String getDateFrom() {
    return dateFrom;
  }

  /**
   * @return The date you want to stop getting tax returns for, in <code>YYYY-MM-DD</code> format.
   * <p>⚠️ The value of <code>date_to</code> cannot be greater than today's date (in other words, no future dates).</p>
   */
  @JsonProperty("date_to")
  public String getDateTo() {
    return dateTo;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof TaxReturnsMonthlyRequest && equalTo((TaxReturnsMonthlyRequest) other);
  }

  private boolean equalTo(TaxReturnsMonthlyRequest other) {
    return link.equals(other.link) && attachPdf.equals(other.attachPdf) && saveData.equals(other.saveData) && type.equals(other.type) && dateFrom.equals(other.dateFrom) && dateTo.equals(other.dateTo);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.link, this.attachPdf, this.saveData, this.type, this.dateFrom, this.dateTo);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "TaxReturnsMonthlyRequest{" + "link: " + link + ", attachPdf: " + attachPdf + ", saveData: " + saveData + ", type: " + type + ", dateFrom: " + dateFrom + ", dateTo: " + dateTo + "}";
  }

  public static LinkStage builder() {
    return new Builder();
  }

  public interface LinkStage {
    TypeStage link(String link);

    Builder from(TaxReturnsMonthlyRequest other);
  }

  public interface TypeStage {
    DateFromStage type(String type);
  }

  public interface DateFromStage {
    DateToStage dateFrom(String dateFrom);
  }

  public interface DateToStage {
    _FinalStage dateTo(String dateTo);
  }

  public interface _FinalStage {
    TaxReturnsMonthlyRequest build();

    _FinalStage attachPdf(Optional<Boolean> attachPdf);

    _FinalStage attachPdf(Boolean attachPdf);

    _FinalStage saveData(Optional<Boolean> saveData);

    _FinalStage saveData(Boolean saveData);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements LinkStage, TypeStage, DateFromStage, DateToStage, _FinalStage {
    private String link;

    private String type;

    private String dateFrom;

    private String dateTo;

    private Optional<Boolean> saveData = Optional.empty();

    private Optional<Boolean> attachPdf = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(TaxReturnsMonthlyRequest other) {
      link(other.getLink());
      attachPdf(other.getAttachPdf());
      saveData(other.getSaveData());
      type(other.getType());
      dateFrom(other.getDateFrom());
      dateTo(other.getDateTo());
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
     * <p>The type of tax return to return. For monthly tax returns, this field must be set to <code>monthly</code>.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("type")
    public DateFromStage type(String type) {
      this.type = type;
      return this;
    }

    /**
     * <p>The starting date you want to get tax returns for, in <code>YYYY-MM-DD</code> format.</p>
     * <p>⚠️ The value of <code>date_from</code> cannot be greater than <code>date_to</code>.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("date_from")
    public DateToStage dateFrom(String dateFrom) {
      this.dateFrom = dateFrom;
      return this;
    }

    /**
     * <p>The date you want to stop getting tax returns for, in <code>YYYY-MM-DD</code> format.</p>
     * <p>⚠️ The value of <code>date_to</code> cannot be greater than today's date (in other words, no future dates).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("date_to")
    public _FinalStage dateTo(String dateTo) {
      this.dateTo = dateTo;
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
    public TaxReturnsMonthlyRequest build() {
      return new TaxReturnsMonthlyRequest(link, attachPdf, saveData, type, dateFrom, dateTo);
    }
  }
}
