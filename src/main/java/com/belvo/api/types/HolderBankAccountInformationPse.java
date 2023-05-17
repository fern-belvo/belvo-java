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
    builder = HolderBankAccountInformationPse.Builder.class
)
public final class HolderBankAccountInformationPse {
  private final Optional<String> firstName;

  private final Optional<String> lastName;

  private int _cachedHashCode;

  HolderBankAccountInformationPse(Optional<String> firstName, Optional<String> lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  /**
   * @return The account holder's first name.
   */
  @JsonProperty("first_name")
  public Optional<String> getFirstName() {
    return firstName;
  }

  /**
   * @return The account holder's last name.
   */
  @JsonProperty("last_name")
  public Optional<String> getLastName() {
    return lastName;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof HolderBankAccountInformationPse && equalTo((HolderBankAccountInformationPse) other);
  }

  private boolean equalTo(HolderBankAccountInformationPse other) {
    return firstName.equals(other.firstName) && lastName.equals(other.lastName);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.firstName, this.lastName);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "HolderBankAccountInformationPse{" + "firstName: " + firstName + ", lastName: " + lastName + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> firstName = Optional.empty();

    private Optional<String> lastName = Optional.empty();

    private Builder() {
    }

    public Builder from(HolderBankAccountInformationPse other) {
      firstName(other.getFirstName());
      lastName(other.getLastName());
      return this;
    }

    @JsonSetter(
        value = "first_name",
        nulls = Nulls.SKIP
    )
    public Builder firstName(Optional<String> firstName) {
      this.firstName = firstName;
      return this;
    }

    public Builder firstName(String firstName) {
      this.firstName = Optional.of(firstName);
      return this;
    }

    @JsonSetter(
        value = "last_name",
        nulls = Nulls.SKIP
    )
    public Builder lastName(Optional<String> lastName) {
      this.lastName = lastName;
      return this;
    }

    public Builder lastName(String lastName) {
      this.lastName = Optional.of(lastName);
      return this;
    }

    public HolderBankAccountInformationPse build() {
      return new HolderBankAccountInformationPse(firstName, lastName);
    }
  }
}
