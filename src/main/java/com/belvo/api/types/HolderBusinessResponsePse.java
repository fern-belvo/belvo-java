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
    builder = HolderBusinessResponsePse.Builder.class
)
public final class HolderBusinessResponsePse {
  private final EnumBankAccountHolderTypePse type;

  private final Optional<HolderInformationBusinessPseResponse> information;

  private int _cachedHashCode;

  HolderBusinessResponsePse(EnumBankAccountHolderTypePse type,
      Optional<HolderInformationBusinessPseResponse> information) {
    this.type = type;
    this.information = information;
  }

  @JsonProperty("type")
  public EnumBankAccountHolderTypePse getType() {
    return type;
  }

  @JsonProperty("Information")
  public Optional<HolderInformationBusinessPseResponse> getInformation() {
    return information;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof HolderBusinessResponsePse && equalTo((HolderBusinessResponsePse) other);
  }

  private boolean equalTo(HolderBusinessResponsePse other) {
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
    return "HolderBusinessResponsePse{" + "type: " + type + ", information: " + information + "}";
  }

  public static TypeStage builder() {
    return new Builder();
  }

  public interface TypeStage {
    _FinalStage type(EnumBankAccountHolderTypePse type);

    Builder from(HolderBusinessResponsePse other);
  }

  public interface _FinalStage {
    HolderBusinessResponsePse build();

    _FinalStage information(Optional<HolderInformationBusinessPseResponse> information);

    _FinalStage information(HolderInformationBusinessPseResponse information);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements TypeStage, _FinalStage {
    private EnumBankAccountHolderTypePse type;

    private Optional<HolderInformationBusinessPseResponse> information = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(HolderBusinessResponsePse other) {
      type(other.getType());
      information(other.getInformation());
      return this;
    }

    @Override
    @JsonSetter("type")
    public _FinalStage type(EnumBankAccountHolderTypePse type) {
      this.type = type;
      return this;
    }

    @Override
    public _FinalStage information(HolderInformationBusinessPseResponse information) {
      this.information = Optional.of(information);
      return this;
    }

    @Override
    @JsonSetter(
        value = "Information",
        nulls = Nulls.SKIP
    )
    public _FinalStage information(Optional<HolderInformationBusinessPseResponse> information) {
      this.information = information;
      return this;
    }

    @Override
    public HolderBusinessResponsePse build() {
      return new HolderBusinessResponsePse(type, information);
    }
  }
}
