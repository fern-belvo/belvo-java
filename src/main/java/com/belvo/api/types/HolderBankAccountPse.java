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
    builder = HolderBankAccountPse.Builder.class
)
public final class HolderBankAccountPse {
  private final Optional<EnumPaymentIntentHolderTypePse> type;

  private final Optional<HolderBankAccountInformationPse> information;

  private int _cachedHashCode;

  HolderBankAccountPse(Optional<EnumPaymentIntentHolderTypePse> type,
      Optional<HolderBankAccountInformationPse> information) {
    this.type = type;
    this.information = information;
  }

  @JsonProperty("type")
  public Optional<EnumPaymentIntentHolderTypePse> getType() {
    return type;
  }

  @JsonProperty("information")
  public Optional<HolderBankAccountInformationPse> getInformation() {
    return information;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof HolderBankAccountPse && equalTo((HolderBankAccountPse) other);
  }

  private boolean equalTo(HolderBankAccountPse other) {
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
    return "HolderBankAccountPse{" + "type: " + type + ", information: " + information + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<EnumPaymentIntentHolderTypePse> type = Optional.empty();

    private Optional<HolderBankAccountInformationPse> information = Optional.empty();

    private Builder() {
    }

    public Builder from(HolderBankAccountPse other) {
      type(other.getType());
      information(other.getInformation());
      return this;
    }

    @JsonSetter(
        value = "type",
        nulls = Nulls.SKIP
    )
    public Builder type(Optional<EnumPaymentIntentHolderTypePse> type) {
      this.type = type;
      return this;
    }

    public Builder type(EnumPaymentIntentHolderTypePse type) {
      this.type = Optional.of(type);
      return this;
    }

    @JsonSetter(
        value = "information",
        nulls = Nulls.SKIP
    )
    public Builder information(Optional<HolderBankAccountInformationPse> information) {
      this.information = information;
      return this;
    }

    public Builder information(HolderBankAccountInformationPse information) {
      this.information = Optional.of(information);
      return this;
    }

    public HolderBankAccountPse build() {
      return new HolderBankAccountPse(type, information);
    }
  }
}
