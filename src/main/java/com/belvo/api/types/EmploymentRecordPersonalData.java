package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = EmploymentRecordPersonalData.Builder.class
)
public final class EmploymentRecordPersonalData {
  private final Optional<String> officialName;

  private final Optional<String> firstName;

  private final Optional<String> lastName;

  private final Optional<String> email;

  private final Optional<String> birthDate;

  private final Optional<EmploymentRecordEntitlement> entitlements;

  private final Optional<List<EmploymentRecordDocumentId>> documentIds;

  private int _cachedHashCode;

  EmploymentRecordPersonalData(Optional<String> officialName, Optional<String> firstName,
      Optional<String> lastName, Optional<String> email, Optional<String> birthDate,
      Optional<EmploymentRecordEntitlement> entitlements,
      Optional<List<EmploymentRecordDocumentId>> documentIds) {
    this.officialName = officialName;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.birthDate = birthDate;
    this.entitlements = entitlements;
    this.documentIds = documentIds;
  }

  /**
   * @return The legal name of the individual
   */
  @JsonProperty("official_name")
  public Optional<String> getOfficialName() {
    return officialName;
  }

  /**
   * @return The first name of the individual.
   */
  @JsonProperty("first_name")
  public Optional<String> getFirstName() {
    return firstName;
  }

  /**
   * @return The last name of the individual.
   */
  @JsonProperty("last_name")
  public Optional<String> getLastName() {
    return lastName;
  }

  /**
   * @return The email address of the individual (as provided in the initial POST request).
   */
  @JsonProperty("email")
  public Optional<String> getEmail() {
    return email;
  }

  /**
   * @return The date of the birth of the individual, in <code>YYYY-MM-DD</code> format.
   */
  @JsonProperty("birth_date")
  public Optional<String> getBirthDate() {
    return birthDate;
  }

  @JsonProperty("entitlements")
  public Optional<EmploymentRecordEntitlement> getEntitlements() {
    return entitlements;
  }

  /**
   * @return Details regarding the individual's ID documents.
   */
  @JsonProperty("document_ids")
  public Optional<List<EmploymentRecordDocumentId>> getDocumentIds() {
    return documentIds;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof EmploymentRecordPersonalData && equalTo((EmploymentRecordPersonalData) other);
  }

  private boolean equalTo(EmploymentRecordPersonalData other) {
    return officialName.equals(other.officialName) && firstName.equals(other.firstName) && lastName.equals(other.lastName) && email.equals(other.email) && birthDate.equals(other.birthDate) && entitlements.equals(other.entitlements) && documentIds.equals(other.documentIds);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.officialName, this.firstName, this.lastName, this.email, this.birthDate, this.entitlements, this.documentIds);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "EmploymentRecordPersonalData{" + "officialName: " + officialName + ", firstName: " + firstName + ", lastName: " + lastName + ", email: " + email + ", birthDate: " + birthDate + ", entitlements: " + entitlements + ", documentIds: " + documentIds + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> officialName = Optional.empty();

    private Optional<String> firstName = Optional.empty();

    private Optional<String> lastName = Optional.empty();

    private Optional<String> email = Optional.empty();

    private Optional<String> birthDate = Optional.empty();

    private Optional<EmploymentRecordEntitlement> entitlements = Optional.empty();

    private Optional<List<EmploymentRecordDocumentId>> documentIds = Optional.empty();

    private Builder() {
    }

    public Builder from(EmploymentRecordPersonalData other) {
      officialName(other.getOfficialName());
      firstName(other.getFirstName());
      lastName(other.getLastName());
      email(other.getEmail());
      birthDate(other.getBirthDate());
      entitlements(other.getEntitlements());
      documentIds(other.getDocumentIds());
      return this;
    }

    @JsonSetter(
        value = "official_name",
        nulls = Nulls.SKIP
    )
    public Builder officialName(Optional<String> officialName) {
      this.officialName = officialName;
      return this;
    }

    public Builder officialName(String officialName) {
      this.officialName = Optional.of(officialName);
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

    @JsonSetter(
        value = "email",
        nulls = Nulls.SKIP
    )
    public Builder email(Optional<String> email) {
      this.email = email;
      return this;
    }

    public Builder email(String email) {
      this.email = Optional.of(email);
      return this;
    }

    @JsonSetter(
        value = "birth_date",
        nulls = Nulls.SKIP
    )
    public Builder birthDate(Optional<String> birthDate) {
      this.birthDate = birthDate;
      return this;
    }

    public Builder birthDate(String birthDate) {
      this.birthDate = Optional.of(birthDate);
      return this;
    }

    @JsonSetter(
        value = "entitlements",
        nulls = Nulls.SKIP
    )
    public Builder entitlements(Optional<EmploymentRecordEntitlement> entitlements) {
      this.entitlements = entitlements;
      return this;
    }

    public Builder entitlements(EmploymentRecordEntitlement entitlements) {
      this.entitlements = Optional.of(entitlements);
      return this;
    }

    @JsonSetter(
        value = "document_ids",
        nulls = Nulls.SKIP
    )
    public Builder documentIds(Optional<List<EmploymentRecordDocumentId>> documentIds) {
      this.documentIds = documentIds;
      return this;
    }

    public Builder documentIds(List<EmploymentRecordDocumentId> documentIds) {
      this.documentIds = Optional.of(documentIds);
      return this;
    }

    public EmploymentRecordPersonalData build() {
      return new EmploymentRecordPersonalData(officialName, firstName, lastName, email, birthDate, entitlements, documentIds);
    }
  }
}
