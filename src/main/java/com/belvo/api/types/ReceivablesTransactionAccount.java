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
    builder = ReceivablesTransactionAccount.Builder.class
)
public final class ReceivablesTransactionAccount {
  private final String id;

  private final InstitutionAccount institution;

  private int _cachedHashCode;

  ReceivablesTransactionAccount(String id, InstitutionAccount institution) {
    this.id = id;
    this.institution = institution;
  }

  /**
   * @return Belvo's unique ID for the account associated with the transaction.
   */
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("institution")
  public InstitutionAccount getInstitution() {
    return institution;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof ReceivablesTransactionAccount && equalTo((ReceivablesTransactionAccount) other);
  }

  private boolean equalTo(ReceivablesTransactionAccount other) {
    return id.equals(other.id) && institution.equals(other.institution);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.id, this.institution);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "ReceivablesTransactionAccount{" + "id: " + id + ", institution: " + institution + "}";
  }

  public static IdStage builder() {
    return new Builder();
  }

  public interface IdStage {
    InstitutionStage id(String id);

    Builder from(ReceivablesTransactionAccount other);
  }

  public interface InstitutionStage {
    _FinalStage institution(InstitutionAccount institution);
  }

  public interface _FinalStage {
    ReceivablesTransactionAccount build();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements IdStage, InstitutionStage, _FinalStage {
    private String id;

    private InstitutionAccount institution;

    private Builder() {
    }

    @Override
    public Builder from(ReceivablesTransactionAccount other) {
      id(other.getId());
      institution(other.getInstitution());
      return this;
    }

    /**
     * <p>Belvo's unique ID for the account associated with the transaction.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("id")
    public InstitutionStage id(String id) {
      this.id = id;
      return this;
    }

    @Override
    @JsonSetter("institution")
    public _FinalStage institution(InstitutionAccount institution) {
      this.institution = institution;
      return this;
    }

    @Override
    public ReceivablesTransactionAccount build() {
      return new ReceivablesTransactionAccount(id, institution);
    }
  }
}
