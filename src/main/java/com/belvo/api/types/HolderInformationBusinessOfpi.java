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
    builder = HolderInformationBusinessOfpi.Builder.class
)
public final class HolderInformationBusinessOfpi {
  private final String name;

  private final EnumCustomerIdentifierTypeOfpi identifierType;

  private final String identifier;

  private int _cachedHashCode;

  HolderInformationBusinessOfpi(String name, EnumCustomerIdentifierTypeOfpi identifierType,
      String identifier) {
    this.name = name;
    this.identifierType = identifierType;
    this.identifier = identifier;
  }

  /**
   * @return The bank account holder's first name.
   */
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("identifier_type")
  public EnumCustomerIdentifierTypeOfpi getIdentifierType() {
    return identifierType;
  }

  /**
   * @return The document number of the company's ID.
   */
  @JsonProperty("identifier")
  public String getIdentifier() {
    return identifier;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof HolderInformationBusinessOfpi && equalTo((HolderInformationBusinessOfpi) other);
  }

  private boolean equalTo(HolderInformationBusinessOfpi other) {
    return name.equals(other.name) && identifierType.equals(other.identifierType) && identifier.equals(other.identifier);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.name, this.identifierType, this.identifier);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "HolderInformationBusinessOfpi{" + "name: " + name + ", identifierType: " + identifierType + ", identifier: " + identifier + "}";
  }

  public static NameStage builder() {
    return new Builder();
  }

  public interface NameStage {
    IdentifierTypeStage name(String name);

    Builder from(HolderInformationBusinessOfpi other);
  }

  public interface IdentifierTypeStage {
    IdentifierStage identifierType(EnumCustomerIdentifierTypeOfpi identifierType);
  }

  public interface IdentifierStage {
    _FinalStage identifier(String identifier);
  }

  public interface _FinalStage {
    HolderInformationBusinessOfpi build();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements NameStage, IdentifierTypeStage, IdentifierStage, _FinalStage {
    private String name;

    private EnumCustomerIdentifierTypeOfpi identifierType;

    private String identifier;

    private Builder() {
    }

    @Override
    public Builder from(HolderInformationBusinessOfpi other) {
      name(other.getName());
      identifierType(other.getIdentifierType());
      identifier(other.getIdentifier());
      return this;
    }

    /**
     * <p>The bank account holder's first name.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("name")
    public IdentifierTypeStage name(String name) {
      this.name = name;
      return this;
    }

    @Override
    @JsonSetter("identifier_type")
    public IdentifierStage identifierType(EnumCustomerIdentifierTypeOfpi identifierType) {
      this.identifierType = identifierType;
      return this;
    }

    /**
     * <p>The document number of the company's ID.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("identifier")
    public _FinalStage identifier(String identifier) {
      this.identifier = identifier;
      return this;
    }

    @Override
    public HolderInformationBusinessOfpi build() {
      return new HolderInformationBusinessOfpi(name, identifierType, identifier);
    }
  }
}
