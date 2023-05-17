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
    builder = InvestmentsPortfolioInstrumentPublicId.Builder.class
)
public final class InvestmentsPortfolioInstrumentPublicId {
  private final String type;

  private final String value;

  private int _cachedHashCode;

  InvestmentsPortfolioInstrumentPublicId(String type, String value) {
    this.type = type;
    this.value = value;
  }

  /**
   * @return The type of public identifier for the instrument.
   */
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  /**
   * @return The value of the <code>public_id.type</code>.
   */
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof InvestmentsPortfolioInstrumentPublicId && equalTo((InvestmentsPortfolioInstrumentPublicId) other);
  }

  private boolean equalTo(InvestmentsPortfolioInstrumentPublicId other) {
    return type.equals(other.type) && value.equals(other.value);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.type, this.value);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "InvestmentsPortfolioInstrumentPublicId{" + "type: " + type + ", value: " + value + "}";
  }

  public static TypeStage builder() {
    return new Builder();
  }

  public interface TypeStage {
    ValueStage type(String type);

    Builder from(InvestmentsPortfolioInstrumentPublicId other);
  }

  public interface ValueStage {
    _FinalStage value(String value);
  }

  public interface _FinalStage {
    InvestmentsPortfolioInstrumentPublicId build();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements TypeStage, ValueStage, _FinalStage {
    private String type;

    private String value;

    private Builder() {
    }

    @Override
    public Builder from(InvestmentsPortfolioInstrumentPublicId other) {
      type(other.getType());
      value(other.getValue());
      return this;
    }

    /**
     * <p>The type of public identifier for the instrument.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("type")
    public ValueStage type(String type) {
      this.type = type;
      return this;
    }

    /**
     * <p>The value of the <code>public_id.type</code>.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("value")
    public _FinalStage value(String value) {
      this.value = value;
      return this;
    }

    @Override
    public InvestmentsPortfolioInstrumentPublicId build() {
      return new InvestmentsPortfolioInstrumentPublicId(type, value);
    }
  }
}
