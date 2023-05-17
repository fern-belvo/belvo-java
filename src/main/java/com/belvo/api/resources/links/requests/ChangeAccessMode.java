package com.belvo.api.resources.links.requests;

import com.belvo.api.types.EnumLinkAccessModeRequest;
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
    builder = ChangeAccessMode.Builder.class
)
public final class ChangeAccessMode {
  private final Optional<String> omit;

  private final Optional<String> fields;

  private final EnumLinkAccessModeRequest accessMode;

  private int _cachedHashCode;

  ChangeAccessMode(Optional<String> omit, Optional<String> fields,
      EnumLinkAccessModeRequest accessMode) {
    this.omit = omit;
    this.fields = fields;
    this.accessMode = accessMode;
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

  @JsonProperty("access_mode")
  public EnumLinkAccessModeRequest getAccessMode() {
    return accessMode;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof ChangeAccessMode && equalTo((ChangeAccessMode) other);
  }

  private boolean equalTo(ChangeAccessMode other) {
    return omit.equals(other.omit) && fields.equals(other.fields) && accessMode.equals(other.accessMode);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.omit, this.fields, this.accessMode);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "ChangeAccessMode{" + "omit: " + omit + ", fields: " + fields + ", accessMode: " + accessMode + "}";
  }

  public static AccessModeStage builder() {
    return new Builder();
  }

  public interface AccessModeStage {
    _FinalStage accessMode(EnumLinkAccessModeRequest accessMode);

    Builder from(ChangeAccessMode other);
  }

  public interface _FinalStage {
    ChangeAccessMode build();

    _FinalStage omit(Optional<String> omit);

    _FinalStage omit(String omit);

    _FinalStage fields(Optional<String> fields);

    _FinalStage fields(String fields);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements AccessModeStage, _FinalStage {
    private EnumLinkAccessModeRequest accessMode;

    private Optional<String> fields = Optional.empty();

    private Optional<String> omit = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(ChangeAccessMode other) {
      omit(other.getOmit());
      fields(other.getFields());
      accessMode(other.getAccessMode());
      return this;
    }

    @Override
    @JsonSetter("access_mode")
    public _FinalStage accessMode(EnumLinkAccessModeRequest accessMode) {
      this.accessMode = accessMode;
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
    public ChangeAccessMode build() {
      return new ChangeAccessMode(omit, fields, accessMode);
    }
  }
}
