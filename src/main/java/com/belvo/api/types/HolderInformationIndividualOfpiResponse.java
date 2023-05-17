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
    builder = HolderInformationIndividualOfpiResponse.Builder.class
)
public final class HolderInformationIndividualOfpiResponse {
  private final String firstName;

  private final String lastName;

  private final EnumCustomerIdentifierTypeOfpi identifierType;

  private final String identifier;

  private int _cachedHashCode;

  HolderInformationIndividualOfpiResponse(String firstName, String lastName,
      EnumCustomerIdentifierTypeOfpi identifierType, String identifier) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.identifierType = identifierType;
    this.identifier = identifier;
  }

  /**
   * @return The bank account holder's first name.
   */
  @JsonProperty("first_name")
  public String getFirstName() {
    return firstName;
  }

  /**
   * @return The bank account holder's last name.
   */
  @JsonProperty("last_name")
  public String getLastName() {
    return lastName;
  }

  @JsonProperty("identifier_type")
  public EnumCustomerIdentifierTypeOfpi getIdentifierType() {
    return identifierType;
  }

  /**
   * @return The document number of the customer's ID.
   */
  @JsonProperty("identifier")
  public String getIdentifier() {
    return identifier;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof HolderInformationIndividualOfpiResponse && equalTo((HolderInformationIndividualOfpiResponse) other);
  }

  private boolean equalTo(HolderInformationIndividualOfpiResponse other) {
    return firstName.equals(other.firstName) && lastName.equals(other.lastName) && identifierType.equals(other.identifierType) && identifier.equals(other.identifier);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.firstName, this.lastName, this.identifierType, this.identifier);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "HolderInformationIndividualOfpiResponse{" + "firstName: " + firstName + ", lastName: " + lastName + ", identifierType: " + identifierType + ", identifier: " + identifier + "}";
  }

  public static FirstNameStage builder() {
    return new Builder();
  }

  public interface FirstNameStage {
    LastNameStage firstName(String firstName);

    Builder from(HolderInformationIndividualOfpiResponse other);
  }

  public interface LastNameStage {
    IdentifierTypeStage lastName(String lastName);
  }

  public interface IdentifierTypeStage {
    IdentifierStage identifierType(EnumCustomerIdentifierTypeOfpi identifierType);
  }

  public interface IdentifierStage {
    _FinalStage identifier(String identifier);
  }

  public interface _FinalStage {
    HolderInformationIndividualOfpiResponse build();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements FirstNameStage, LastNameStage, IdentifierTypeStage, IdentifierStage, _FinalStage {
    private String firstName;

    private String lastName;

    private EnumCustomerIdentifierTypeOfpi identifierType;

    private String identifier;

    private Builder() {
    }

    @Override
    public Builder from(HolderInformationIndividualOfpiResponse other) {
      firstName(other.getFirstName());
      lastName(other.getLastName());
      identifierType(other.getIdentifierType());
      identifier(other.getIdentifier());
      return this;
    }

    /**
     * <p>The bank account holder's first name.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("first_name")
    public LastNameStage firstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    /**
     * <p>The bank account holder's last name.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("last_name")
    public IdentifierTypeStage lastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    @Override
    @JsonSetter("identifier_type")
    public IdentifierStage identifierType(EnumCustomerIdentifierTypeOfpi identifierType) {
      this.identifierType = identifierType;
      return this;
    }

    /**
     * <p>The document number of the customer's ID.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("identifier")
    public _FinalStage identifier(String identifier) {
      this.identifier = identifier;
      return this;
    }

    @Override
    public HolderInformationIndividualOfpiResponse build() {
      return new HolderInformationIndividualOfpiResponse(firstName, lastName, identifierType, identifier);
    }
  }
}
