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
    builder = RecevablesTransactionFees.Builder.class
)
public final class RecevablesTransactionFees {
  private final Optional<EnumReceivableTransactionFeeType> type;

  private final double value;

  private int _cachedHashCode;

  RecevablesTransactionFees(Optional<EnumReceivableTransactionFeeType> type, double value) {
    this.type = type;
    this.value = value;
  }

  @JsonProperty("type")
  public Optional<EnumReceivableTransactionFeeType> getType() {
    return type;
  }

  /**
   * @return The value of <code>fees.type</code>.
   */
  @JsonProperty("value")
  public double getValue() {
    return value;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof RecevablesTransactionFees && equalTo((RecevablesTransactionFees) other);
  }

  private boolean equalTo(RecevablesTransactionFees other) {
    return type.equals(other.type) && value == other.value;
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
    return "RecevablesTransactionFees{" + "type: " + type + ", value: " + value + "}";
  }

  public static ValueStage builder() {
    return new Builder();
  }

  public interface ValueStage {
    _FinalStage value(double value);

    Builder from(RecevablesTransactionFees other);
  }

  public interface _FinalStage {
    RecevablesTransactionFees build();

    _FinalStage type(Optional<EnumReceivableTransactionFeeType> type);

    _FinalStage type(EnumReceivableTransactionFeeType type);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements ValueStage, _FinalStage {
    private double value;

    private Optional<EnumReceivableTransactionFeeType> type = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(RecevablesTransactionFees other) {
      type(other.getType());
      value(other.getValue());
      return this;
    }

    /**
     * <p>The value of <code>fees.type</code>.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("value")
    public _FinalStage value(double value) {
      this.value = value;
      return this;
    }

    @Override
    public _FinalStage type(EnumReceivableTransactionFeeType type) {
      this.type = Optional.of(type);
      return this;
    }

    @Override
    @JsonSetter(
        value = "type",
        nulls = Nulls.SKIP
    )
    public _FinalStage type(Optional<EnumReceivableTransactionFeeType> type) {
      this.type = type;
      return this;
    }

    @Override
    public RecevablesTransactionFees build() {
      return new RecevablesTransactionFees(type, value);
    }
  }
}
