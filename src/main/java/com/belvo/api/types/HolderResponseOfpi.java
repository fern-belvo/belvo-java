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
    builder = HolderResponseOfpi.Builder.class
)
public final class HolderResponseOfpi {
  private final EnumBankAccountHolderTypeOfpi type;

  private final HolderResponseOfpiInformation information;

  private int _cachedHashCode;

  HolderResponseOfpi(EnumBankAccountHolderTypeOfpi type,
      HolderResponseOfpiInformation information) {
    this.type = type;
    this.information = information;
  }

  @JsonProperty("type")
  public EnumBankAccountHolderTypeOfpi getType() {
    return type;
  }

  @JsonProperty("information")
  public HolderResponseOfpiInformation getInformation() {
    return information;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof HolderResponseOfpi && equalTo((HolderResponseOfpi) other);
  }

  private boolean equalTo(HolderResponseOfpi other) {
    return type.equals(other.type) && information.equals(other.information);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.type, this.information);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "HolderResponseOfpi{" + "type: " + type + ", information: " + information + "}";
  }

  public static TypeStage builder() {
    return new Builder();
  }

  public interface TypeStage {
    InformationStage type(EnumBankAccountHolderTypeOfpi type);

    Builder from(HolderResponseOfpi other);
  }

  public interface InformationStage {
    _FinalStage information(HolderResponseOfpiInformation information);
  }

  public interface _FinalStage {
    HolderResponseOfpi build();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements TypeStage, InformationStage, _FinalStage {
    private EnumBankAccountHolderTypeOfpi type;

    private HolderResponseOfpiInformation information;

    private Builder() {
    }

    @Override
    public Builder from(HolderResponseOfpi other) {
      type(other.getType());
      information(other.getInformation());
      return this;
    }

    @Override
    @JsonSetter("type")
    public InformationStage type(EnumBankAccountHolderTypeOfpi type) {
      this.type = type;
      return this;
    }

    @Override
    @JsonSetter("information")
    public _FinalStage information(HolderResponseOfpiInformation information) {
      this.information = information;
      return this;
    }

    @Override
    public HolderResponseOfpi build() {
      return new HolderResponseOfpi(type, information);
    }
  }
}
