package com.belvo.api.resources.invoices.requests;

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
    builder = InvoicesRequest.Builder.class
)
public final class InvoicesRequest {
  private final Optional<String> omit;

  private final Optional<String> fields;

  private final String link;

  private final String dateFrom;

  private final String dateTo;

  private final Optional<String> type;

  private final Optional<Boolean> attachXml;

  private final Optional<Boolean> saveData;

  private int _cachedHashCode;

  InvoicesRequest(Optional<String> omit, Optional<String> fields, String link, String dateFrom,
      String dateTo, Optional<String> type, Optional<Boolean> attachXml,
      Optional<Boolean> saveData) {
    this.omit = omit;
    this.fields = fields;
    this.link = link;
    this.dateFrom = dateFrom;
    this.dateTo = dateTo;
    this.type = type;
    this.attachXml = attachXml;
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
   * @return The fiscal <code>link.id</code> to use.
   */
  @JsonProperty("link")
  public String getLink() {
    return link;
  }

  /**
   * @return The date from which you want to start getting invoices for, in <code>YYYY-MM-DD</code> format.
   * <p>⚠️ The value of <code>date_from</code> cannot be greater than <code>date_to</code>.</p>
   */
  @JsonProperty("date_from")
  public String getDateFrom() {
    return dateFrom;
  }

  /**
   * @return The date you want to stop getting invoices for, in <code>YYYY-MM-DD</code> format.
   * <p>⚠️ The number of days between <code>date_from</code> and <code>date_to</code> cannot be over 365.</p>
   * <p>⚠️ The value of <code>date_to</code> cannot be greater than today's date (in other words, no future dates).</p>
   */
  @JsonProperty("date_to")
  public String getDateTo() {
    return dateTo;
  }

  @JsonProperty("type")
  public Optional<String> getType() {
    return type;
  }

  /**
   * @return When set to <code>true</code>, you will receive the XML invoice in the response.
   */
  @JsonProperty("attach_xml")
  public Optional<Boolean> getAttachXml() {
    return attachXml;
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
    return other instanceof InvoicesRequest && equalTo((InvoicesRequest) other);
  }

  private boolean equalTo(InvoicesRequest other) {
    return omit.equals(other.omit) && fields.equals(other.fields) && link.equals(other.link) && dateFrom.equals(other.dateFrom) && dateTo.equals(other.dateTo) && type.equals(other.type) && attachXml.equals(other.attachXml) && saveData.equals(other.saveData);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.omit, this.fields, this.link, this.dateFrom, this.dateTo, this.type, this.attachXml, this.saveData);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "InvoicesRequest{" + "omit: " + omit + ", fields: " + fields + ", link: " + link + ", dateFrom: " + dateFrom + ", dateTo: " + dateTo + ", type: " + type + ", attachXml: " + attachXml + ", saveData: " + saveData + "}";
  }

  public static LinkStage builder() {
    return new Builder();
  }

  public interface LinkStage {
    DateFromStage link(String link);

    Builder from(InvoicesRequest other);
  }

  public interface DateFromStage {
    DateToStage dateFrom(String dateFrom);
  }

  public interface DateToStage {
    _FinalStage dateTo(String dateTo);
  }

  public interface _FinalStage {
    InvoicesRequest build();

    _FinalStage omit(Optional<String> omit);

    _FinalStage omit(String omit);

    _FinalStage fields(Optional<String> fields);

    _FinalStage fields(String fields);

    _FinalStage type(Optional<String> type);

    _FinalStage type(String type);

    _FinalStage attachXml(Optional<Boolean> attachXml);

    _FinalStage attachXml(Boolean attachXml);

    _FinalStage saveData(Optional<Boolean> saveData);

    _FinalStage saveData(Boolean saveData);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements LinkStage, DateFromStage, DateToStage, _FinalStage {
    private String link;

    private String dateFrom;

    private String dateTo;

    private Optional<Boolean> saveData = Optional.empty();

    private Optional<Boolean> attachXml = Optional.empty();

    private Optional<String> type = Optional.empty();

    private Optional<String> fields = Optional.empty();

    private Optional<String> omit = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(InvoicesRequest other) {
      omit(other.getOmit());
      fields(other.getFields());
      link(other.getLink());
      dateFrom(other.getDateFrom());
      dateTo(other.getDateTo());
      type(other.getType());
      attachXml(other.getAttachXml());
      saveData(other.getSaveData());
      return this;
    }

    /**
     * <p>The fiscal <code>link.id</code> to use.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("link")
    public DateFromStage link(String link) {
      this.link = link;
      return this;
    }

    /**
     * <p>The date from which you want to start getting invoices for, in <code>YYYY-MM-DD</code> format.</p>
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
     * <p>The date you want to stop getting invoices for, in <code>YYYY-MM-DD</code> format.</p>
     * <p>⚠️ The number of days between <code>date_from</code> and <code>date_to</code> cannot be over 365.</p>
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
     * <p>When set to <code>true</code>, you will receive the XML invoice in the response.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage attachXml(Boolean attachXml) {
      this.attachXml = Optional.of(attachXml);
      return this;
    }

    @Override
    @JsonSetter(
        value = "attach_xml",
        nulls = Nulls.SKIP
    )
    public _FinalStage attachXml(Optional<Boolean> attachXml) {
      this.attachXml = attachXml;
      return this;
    }

    @Override
    public _FinalStage type(String type) {
      this.type = Optional.of(type);
      return this;
    }

    @Override
    @JsonSetter(
        value = "type",
        nulls = Nulls.SKIP
    )
    public _FinalStage type(Optional<String> type) {
      this.type = type;
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
    public InvoicesRequest build() {
      return new InvoicesRequest(omit, fields, link, dateFrom, dateTo, type, attachXml, saveData);
    }
  }
}
