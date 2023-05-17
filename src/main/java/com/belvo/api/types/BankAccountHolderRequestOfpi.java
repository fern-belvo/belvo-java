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
    builder = BankAccountHolderRequestOfpi.Builder.class
)
public final class BankAccountHolderRequestOfpi {
  private final EnumBankAccountHolderTypeOfpi type;

  private final BankAccountHolderRequestOfpiInformation information;

  private int _cachedHashCode;

  BankAccountHolderRequestOfpi(EnumBankAccountHolderTypeOfpi type,
      BankAccountHolderRequestOfpiInformation information) {
    this.type = type;
    this.information = information;
  }

  @JsonProperty("type")
  public EnumBankAccountHolderTypeOfpi getType() {
    return type;
  }

  @JsonProperty("information")
  public BankAccountHolderRequestOfpiInformation getInformation() {
    return information;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof BankAccountHolderRequestOfpi && equalTo((BankAccountHolderRequestOfpi) other);
  }

  private boolean equalTo(BankAccountHolderRequestOfpi other) {
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
    return "BankAccountHolderRequestOfpi{" + "type: " + type + ", information: " + information + "}";
  }

  public static TypeStage builder() {
    return new Builder();
  }

  public interface TypeStage {
    InformationStage type(EnumBankAccountHolderTypeOfpi type);

    Builder from(BankAccountHolderRequestOfpi other);
  }

  public interface InformationStage {
    _FinalStage information(BankAccountHolderRequestOfpiInformation information);
  }

  public interface _FinalStage {
    BankAccountHolderRequestOfpi build();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements TypeStage, InformationStage, _FinalStage {
    private EnumBankAccountHolderTypeOfpi type;

    private BankAccountHolderRequestOfpiInformation information;

    private Builder() {
    }

    @Override
    public Builder from(BankAccountHolderRequestOfpi other) {
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
    public _FinalStage information(BankAccountHolderRequestOfpiInformation information) {
      this.information = information;
      return this;
    }

    @Override
    public BankAccountHolderRequestOfpi build() {
      return new BankAccountHolderRequestOfpi(type, information);
    }
  }
}
