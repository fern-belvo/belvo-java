package com.belvo.api.resources.recurringexpenses.requests;

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
    builder = RecurringExpensesRequest.Builder.class
)
public final class RecurringExpensesRequest {
  private final Optional<String> omit;

  private final Optional<String> fields;

  private final String link;

  private final Optional<String> token;

  private final Optional<Boolean> saveData;

  private final Optional<String> dateFrom;

  private final Optional<String> dateTo;

  private int _cachedHashCode;

  RecurringExpensesRequest(Optional<String> omit, Optional<String> fields, String link,
      Optional<String> token, Optional<Boolean> saveData, Optional<String> dateFrom,
      Optional<String> dateTo) {
    this.omit = omit;
    this.fields = fields;
    this.link = link;
    this.token = token;
    this.saveData = saveData;
    this.dateFrom = dateFrom;
    this.dateTo = dateTo;
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
   * @return The <code>link.id</code> that you want to get information for.
   */
  @JsonProperty("link")
  public String getLink() {
    return link;
  }

  /**
   * @return The OTP token generated by the bank.
   */
  @JsonProperty("token")
  public Optional<String> getToken() {
    return token;
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
   * @return The date from which you want to start getting recurring expenses for, in <code>YYYY-MM-DD</code> format, within the last 365 days. When you use this parameter, you must also send <code>date_to</code>.
   * <p>⚠️ The value of <code>date_from</code> cannot be greater than <code>date_to</code>.</p>
   */
  @JsonProperty("date_from")
  public Optional<String> getDateFrom() {
    return dateFrom;
  }

  /**
   * @return The date you want to stop getting recurring expenses for, in <code>YYYY-MM-DD</code> format, within the last 365 days. When you use this parameter, you must also send <code>date_from</code>.
   * <p>⚠️ The value of <code>date_to</code> cannot be greater than today's date (in other words, no future dates).</p>
   */
  @JsonProperty("date_to")
  public Optional<String> getDateTo() {
    return dateTo;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof RecurringExpensesRequest && equalTo((RecurringExpensesRequest) other);
  }

  private boolean equalTo(RecurringExpensesRequest other) {
    return omit.equals(other.omit) && fields.equals(other.fields) && link.equals(other.link) && token.equals(other.token) && saveData.equals(other.saveData) && dateFrom.equals(other.dateFrom) && dateTo.equals(other.dateTo);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.omit, this.fields, this.link, this.token, this.saveData, this.dateFrom, this.dateTo);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "RecurringExpensesRequest{" + "omit: " + omit + ", fields: " + fields + ", link: " + link + ", token: " + token + ", saveData: " + saveData + ", dateFrom: " + dateFrom + ", dateTo: " + dateTo + "}";
  }

  public static LinkStage builder() {
    return new Builder();
  }

  public interface LinkStage {
    _FinalStage link(String link);

    Builder from(RecurringExpensesRequest other);
  }

  public interface _FinalStage {
    RecurringExpensesRequest build();

    _FinalStage omit(Optional<String> omit);

    _FinalStage omit(String omit);

    _FinalStage fields(Optional<String> fields);

    _FinalStage fields(String fields);

    _FinalStage token(Optional<String> token);

    _FinalStage token(String token);

    _FinalStage saveData(Optional<Boolean> saveData);

    _FinalStage saveData(Boolean saveData);

    _FinalStage dateFrom(Optional<String> dateFrom);

    _FinalStage dateFrom(String dateFrom);

    _FinalStage dateTo(Optional<String> dateTo);

    _FinalStage dateTo(String dateTo);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements LinkStage, _FinalStage {
    private String link;

    private Optional<String> dateTo = Optional.empty();

    private Optional<String> dateFrom = Optional.empty();

    private Optional<Boolean> saveData = Optional.empty();

    private Optional<String> token = Optional.empty();

    private Optional<String> fields = Optional.empty();

    private Optional<String> omit = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(RecurringExpensesRequest other) {
      omit(other.getOmit());
      fields(other.getFields());
      link(other.getLink());
      token(other.getToken());
      saveData(other.getSaveData());
      dateFrom(other.getDateFrom());
      dateTo(other.getDateTo());
      return this;
    }

    /**
     * <p>The <code>link.id</code> that you want to get information for.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("link")
    public _FinalStage link(String link) {
      this.link = link;
      return this;
    }

    /**
     * <p>The date you want to stop getting recurring expenses for, in <code>YYYY-MM-DD</code> format, within the last 365 days. When you use this parameter, you must also send <code>date_from</code>.</p>
     * <p>⚠️ The value of <code>date_to</code> cannot be greater than today's date (in other words, no future dates).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage dateTo(String dateTo) {
      this.dateTo = Optional.of(dateTo);
      return this;
    }

    @Override
    @JsonSetter(
        value = "date_to",
        nulls = Nulls.SKIP
    )
    public _FinalStage dateTo(Optional<String> dateTo) {
      this.dateTo = dateTo;
      return this;
    }

    /**
     * <p>The date from which you want to start getting recurring expenses for, in <code>YYYY-MM-DD</code> format, within the last 365 days. When you use this parameter, you must also send <code>date_to</code>.</p>
     * <p>⚠️ The value of <code>date_from</code> cannot be greater than <code>date_to</code>.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage dateFrom(String dateFrom) {
      this.dateFrom = Optional.of(dateFrom);
      return this;
    }

    @Override
    @JsonSetter(
        value = "date_from",
        nulls = Nulls.SKIP
    )
    public _FinalStage dateFrom(Optional<String> dateFrom) {
      this.dateFrom = dateFrom;
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
     * <p>The OTP token generated by the bank.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage token(String token) {
      this.token = Optional.of(token);
      return this;
    }

    @Override
    @JsonSetter(
        value = "token",
        nulls = Nulls.SKIP
    )
    public _FinalStage token(Optional<String> token) {
      this.token = token;
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
    public RecurringExpensesRequest build() {
      return new RecurringExpensesRequest(omit, fields, link, token, saveData, dateFrom, dateTo);
    }
  }
}
