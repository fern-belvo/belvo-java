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
    builder = Owner.Builder.class
)
public final class Owner {
  private final Optional<String> id;

  private final Optional<String> link;

  private final Optional<String> internalIdentification;

  private final Optional<String> collectedAt;

  private final Optional<String> createdAt;

  private final Optional<String> displayName;

  private final Optional<String> email;

  private final Optional<String> phoneNumber;

  private final Optional<String> address;

  private final Optional<OwnerDocumentId> documentId;

  private final Optional<String> firstName;

  private final Optional<String> lastName;

  private final Optional<String> secondLastName;

  private int _cachedHashCode;

  Owner(Optional<String> id, Optional<String> link, Optional<String> internalIdentification,
      Optional<String> collectedAt, Optional<String> createdAt, Optional<String> displayName,
      Optional<String> email, Optional<String> phoneNumber, Optional<String> address,
      Optional<OwnerDocumentId> documentId, Optional<String> firstName, Optional<String> lastName,
      Optional<String> secondLastName) {
    this.id = id;
    this.link = link;
    this.internalIdentification = internalIdentification;
    this.collectedAt = collectedAt;
    this.createdAt = createdAt;
    this.displayName = displayName;
    this.email = email;
    this.phoneNumber = phoneNumber;
    this.address = address;
    this.documentId = documentId;
    this.firstName = firstName;
    this.lastName = lastName;
    this.secondLastName = secondLastName;
  }

  /**
   * @return Belvo's unique identifier used to reference the current owner.
   */
  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
  }

  /**
   * @return Belvo's unique ID for the current Link.
   */
  @JsonProperty("link")
  public Optional<String> getLink() {
    return link;
  }

  /**
   * @return The institution's internal identifier for the owner.
   */
  @JsonProperty("internal_identification")
  public Optional<String> getInternalIdentification() {
    return internalIdentification;
  }

  /**
   * @return The ISO-8601 timestamp when the data point was collected.
   */
  @JsonProperty("collected_at")
  public Optional<String> getCollectedAt() {
    return collectedAt;
  }

  /**
   * @return The ISO-8601 timestamp of when the data point was last updated in Belvo's database.
   */
  @JsonProperty("created_at")
  public Optional<String> getCreatedAt() {
    return createdAt;
  }

  /**
   * @return The full name of the owner, as provided by the bank.
   */
  @JsonProperty("display_name")
  public Optional<String> getDisplayName() {
    return displayName;
  }

  /**
   * @return The account owner's registered email address.
   */
  @JsonProperty("email")
  public Optional<String> getEmail() {
    return email;
  }

  /**
   * @return The account owner's registered phone number.
   */
  @JsonProperty("phone_number")
  public Optional<String> getPhoneNumber() {
    return phoneNumber;
  }

  /**
   * @return The accounts owners registered address.
   */
  @JsonProperty("address")
  public Optional<String> getAddress() {
    return address;
  }

  @JsonProperty("document_id")
  public Optional<OwnerDocumentId> getDocumentId() {
    return documentId;
  }

  /**
   * @return <em>This field has been deprecated.</em>
   * <p><em>The first name of the account owner.</em></p>
   */
  @JsonProperty("first_name")
  public Optional<String> getFirstName() {
    return firstName;
  }

  /**
   * @return <em>This field has been deprecated.</em>
   * <p><em>The last name of the account owner.</em></p>
   */
  @JsonProperty("last_name")
  public Optional<String> getLastName() {
    return lastName;
  }

  /**
   * @return <em>This field has been deprecated.</em>
   * <p><em>The second last name of the account owner.</em></p>
   */
  @JsonProperty("second_last_name")
  public Optional<String> getSecondLastName() {
    return secondLastName;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof Owner && equalTo((Owner) other);
  }

  private boolean equalTo(Owner other) {
    return id.equals(other.id) && link.equals(other.link) && internalIdentification.equals(other.internalIdentification) && collectedAt.equals(other.collectedAt) && createdAt.equals(other.createdAt) && displayName.equals(other.displayName) && email.equals(other.email) && phoneNumber.equals(other.phoneNumber) && address.equals(other.address) && documentId.equals(other.documentId) && firstName.equals(other.firstName) && lastName.equals(other.lastName) && secondLastName.equals(other.secondLastName);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.id, this.link, this.internalIdentification, this.collectedAt, this.createdAt, this.displayName, this.email, this.phoneNumber, this.address, this.documentId, this.firstName, this.lastName, this.secondLastName);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "Owner{" + "id: " + id + ", link: " + link + ", internalIdentification: " + internalIdentification + ", collectedAt: " + collectedAt + ", createdAt: " + createdAt + ", displayName: " + displayName + ", email: " + email + ", phoneNumber: " + phoneNumber + ", address: " + address + ", documentId: " + documentId + ", firstName: " + firstName + ", lastName: " + lastName + ", secondLastName: " + secondLastName + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> id = Optional.empty();

    private Optional<String> link = Optional.empty();

    private Optional<String> internalIdentification = Optional.empty();

    private Optional<String> collectedAt = Optional.empty();

    private Optional<String> createdAt = Optional.empty();

    private Optional<String> displayName = Optional.empty();

    private Optional<String> email = Optional.empty();

    private Optional<String> phoneNumber = Optional.empty();

    private Optional<String> address = Optional.empty();

    private Optional<OwnerDocumentId> documentId = Optional.empty();

    private Optional<String> firstName = Optional.empty();

    private Optional<String> lastName = Optional.empty();

    private Optional<String> secondLastName = Optional.empty();

    private Builder() {
    }

    public Builder from(Owner other) {
      id(other.getId());
      link(other.getLink());
      internalIdentification(other.getInternalIdentification());
      collectedAt(other.getCollectedAt());
      createdAt(other.getCreatedAt());
      displayName(other.getDisplayName());
      email(other.getEmail());
      phoneNumber(other.getPhoneNumber());
      address(other.getAddress());
      documentId(other.getDocumentId());
      firstName(other.getFirstName());
      lastName(other.getLastName());
      secondLastName(other.getSecondLastName());
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
        value = "link",
        nulls = Nulls.SKIP
    )
    public Builder link(Optional<String> link) {
      this.link = link;
      return this;
    }

    public Builder link(String link) {
      this.link = Optional.of(link);
      return this;
    }

    @JsonSetter(
        value = "internal_identification",
        nulls = Nulls.SKIP
    )
    public Builder internalIdentification(Optional<String> internalIdentification) {
      this.internalIdentification = internalIdentification;
      return this;
    }

    public Builder internalIdentification(String internalIdentification) {
      this.internalIdentification = Optional.of(internalIdentification);
      return this;
    }

    @JsonSetter(
        value = "collected_at",
        nulls = Nulls.SKIP
    )
    public Builder collectedAt(Optional<String> collectedAt) {
      this.collectedAt = collectedAt;
      return this;
    }

    public Builder collectedAt(String collectedAt) {
      this.collectedAt = Optional.of(collectedAt);
      return this;
    }

    @JsonSetter(
        value = "created_at",
        nulls = Nulls.SKIP
    )
    public Builder createdAt(Optional<String> createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    public Builder createdAt(String createdAt) {
      this.createdAt = Optional.of(createdAt);
      return this;
    }

    @JsonSetter(
        value = "display_name",
        nulls = Nulls.SKIP
    )
    public Builder displayName(Optional<String> displayName) {
      this.displayName = displayName;
      return this;
    }

    public Builder displayName(String displayName) {
      this.displayName = Optional.of(displayName);
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
        value = "phone_number",
        nulls = Nulls.SKIP
    )
    public Builder phoneNumber(Optional<String> phoneNumber) {
      this.phoneNumber = phoneNumber;
      return this;
    }

    public Builder phoneNumber(String phoneNumber) {
      this.phoneNumber = Optional.of(phoneNumber);
      return this;
    }

    @JsonSetter(
        value = "address",
        nulls = Nulls.SKIP
    )
    public Builder address(Optional<String> address) {
      this.address = address;
      return this;
    }

    public Builder address(String address) {
      this.address = Optional.of(address);
      return this;
    }

    @JsonSetter(
        value = "document_id",
        nulls = Nulls.SKIP
    )
    public Builder documentId(Optional<OwnerDocumentId> documentId) {
      this.documentId = documentId;
      return this;
    }

    public Builder documentId(OwnerDocumentId documentId) {
      this.documentId = Optional.of(documentId);
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
        value = "second_last_name",
        nulls = Nulls.SKIP
    )
    public Builder secondLastName(Optional<String> secondLastName) {
      this.secondLastName = secondLastName;
      return this;
    }

    public Builder secondLastName(String secondLastName) {
      this.secondLastName = Optional.of(secondLastName);
      return this;
    }

    public Owner build() {
      return new Owner(id, link, internalIdentification, collectedAt, createdAt, displayName, email, phoneNumber, address, documentId, firstName, lastName, secondLastName);
    }
  }
}
