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
    builder = HolderBusinessPse.Builder.class
)
public final class HolderBusinessPse {
  private final EnumBankAccountHolderTypePse type;

  private final HolderInformationBusinessPse information;

  private int _cachedHashCode;

  HolderBusinessPse(EnumBankAccountHolderTypePse type, HolderInformationBusinessPse information) {
    this.type = type;
    this.information = information;
  }

  @JsonProperty("type")
  public EnumBankAccountHolderTypePse getType() {
    return type;
  }

  @JsonProperty("information")
  public HolderInformationBusinessPse getInformation() {
    return information;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof HolderBusinessPse && equalTo((HolderBusinessPse) other);
  }

  private boolean equalTo(HolderBusinessPse other) {
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
    return "HolderBusinessPse{" + "type: " + type + ", information: " + information + "}";
  }

  public static TypeStage builder() {
    return new Builder();
  }

  public interface TypeStage {
    InformationStage type(EnumBankAccountHolderTypePse type);

    Builder from(HolderBusinessPse other);
  }

  public interface InformationStage {
    _FinalStage information(HolderInformationBusinessPse information);
  }

  public interface _FinalStage {
    HolderBusinessPse build();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements TypeStage, InformationStage, _FinalStage {
    private EnumBankAccountHolderTypePse type;

    private HolderInformationBusinessPse information;

    private Builder() {
    }

    @Override
    public Builder from(HolderBusinessPse other) {
      type(other.getType());
      information(other.getInformation());
      return this;
    }

    @Override
    @JsonSetter("type")
    public InformationStage type(EnumBankAccountHolderTypePse type) {
      this.type = type;
      return this;
    }

    @Override
    @JsonSetter("information")
    public _FinalStage information(HolderInformationBusinessPse information) {
      this.information = information;
      return this;
    }

    @Override
    public HolderBusinessPse build() {
      return new HolderBusinessPse(type, information);
    }
  }
}
