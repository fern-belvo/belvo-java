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
    builder = BeneficiaryBankAccountPse.Builder.class
)
public final class BeneficiaryBankAccountPse {
  private final Optional<String> id;

  private final Optional<String> institution;

  private final Optional<String> number;

  private final Optional<HolderBusinessResponsePse> holder;

  private int _cachedHashCode;

  BeneficiaryBankAccountPse(Optional<String> id, Optional<String> institution,
      Optional<String> number, Optional<HolderBusinessResponsePse> holder) {
    this.id = id;
    this.institution = institution;
    this.number = number;
    this.holder = holder;
  }

  /**
   * @return Belvo's unique ID for the beneficiary bank account.
   */
  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
  }

  /**
   * @return Belvo's unique ID for the institution that the bank account is created in.
   */
  @JsonProperty("institution")
  public Optional<String> getInstitution() {
    return institution;
  }

  /**
   * @return The bank account number.
   */
  @JsonProperty("number")
  public Optional<String> getNumber() {
    return number;
  }

  @JsonProperty("holder")
  public Optional<HolderBusinessResponsePse> getHolder() {
    return holder;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof BeneficiaryBankAccountPse && equalTo((BeneficiaryBankAccountPse) other);
  }

  private boolean equalTo(BeneficiaryBankAccountPse other) {
    return id.equals(other.id) && institution.equals(other.institution) && number.equals(other.number) && holder.equals(other.holder);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.id, this.institution, this.number, this.holder);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "BeneficiaryBankAccountPse{" + "id: " + id + ", institution: " + institution + ", number: " + number + ", holder: " + holder + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> id = Optional.empty();

    private Optional<String> institution = Optional.empty();

    private Optional<String> number = Optional.empty();

    private Optional<HolderBusinessResponsePse> holder = Optional.empty();

    private Builder() {
    }

    public Builder from(BeneficiaryBankAccountPse other) {
      id(other.getId());
      institution(other.getInstitution());
      number(other.getNumber());
      holder(other.getHolder());
      return this;
    }

    @JsonSetter(
        value = "id",
        nulls = Nulls.SKIP
    )
    public Builder id(Optional<String> id) {
      this.id = id;
      return this;
    }

    public Builder id(String id) {
      this.id = Optional.of(id);
      return this;
    }

    @JsonSetter(
        value = "institution",
        nulls = Nulls.SKIP
    )
    public Builder institution(Optional<String> institution) {
      this.institution = institution;
      return this;
    }

    public Builder institution(String institution) {
      this.institution = Optional.of(institution);
      return this;
    }

    @JsonSetter(
        value = "number",
        nulls = Nulls.SKIP
    )
    public Builder number(Optional<String> number) {
      this.number = number;
      return this;
    }

    public Builder number(String number) {
      this.number = Optional.of(number);
      return this;
    }

    @JsonSetter(
        value = "holder",
        nulls = Nulls.SKIP
    )
    public Builder holder(Optional<HolderBusinessResponsePse> holder) {
      this.holder = holder;
      return this;
    }

    public Builder holder(HolderBusinessResponsePse holder) {
      this.holder = Optional.of(holder);
      return this;
    }

    public BeneficiaryBankAccountPse build() {
      return new BeneficiaryBankAccountPse(id, institution, number, holder);
    }
  }
}
