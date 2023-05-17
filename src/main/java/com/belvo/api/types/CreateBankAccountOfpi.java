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
    builder = CreateBankAccountOfpi.Builder.class
)
public final class CreateBankAccountOfpi {
  private final String institution;

  private final BankAccountHolderRequestOfpi holder;

  private final CreateBankAccountOfpiDetails details;

  private int _cachedHashCode;

  CreateBankAccountOfpi(String institution, BankAccountHolderRequestOfpi holder,
      CreateBankAccountOfpiDetails details) {
    this.institution = institution;
    this.holder = holder;
    this.details = details;
  }

  /**
   * @return Belvo's unique ID for the institution that the bank account is created in.
   */
  @JsonProperty("institution")
  public String getInstitution() {
    return institution;
  }

  /**
   * @return Information regarding the individual bank account holder.
   */
  @JsonProperty("holder")
  public BankAccountHolderRequestOfpi getHolder() {
    return holder;
  }

  /**
   * @return Information regarding the bank account.
   */
  @JsonProperty("details")
  public CreateBankAccountOfpiDetails getDetails() {
    return details;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof CreateBankAccountOfpi && equalTo((CreateBankAccountOfpi) other);
  }

  private boolean equalTo(CreateBankAccountOfpi other) {
    return institution.equals(other.institution) && holder.equals(other.holder) && details.equals(other.details);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.institution, this.holder, this.details);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "CreateBankAccountOfpi{" + "institution: " + institution + ", holder: " + holder + ", details: " + details + "}";
  }

  public static InstitutionStage builder() {
    return new Builder();
  }

  public interface InstitutionStage {
    HolderStage institution(String institution);

    Builder from(CreateBankAccountOfpi other);
  }

  public interface HolderStage {
    DetailsStage holder(BankAccountHolderRequestOfpi holder);
  }

  public interface DetailsStage {
    _FinalStage details(CreateBankAccountOfpiDetails details);
  }

  public interface _FinalStage {
    CreateBankAccountOfpi build();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements InstitutionStage, HolderStage, DetailsStage, _FinalStage {
    private String institution;

    private BankAccountHolderRequestOfpi holder;

    private CreateBankAccountOfpiDetails details;

    private Builder() {
    }

    @Override
    public Builder from(CreateBankAccountOfpi other) {
      institution(other.getInstitution());
      holder(other.getHolder());
      details(other.getDetails());
      return this;
    }

    /**
     * <p>Belvo's unique ID for the institution that the bank account is created in.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("institution")
    public HolderStage institution(String institution) {
      this.institution = institution;
      return this;
    }

    /**
     * <p>Information regarding the individual bank account holder.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("holder")
    public DetailsStage holder(BankAccountHolderRequestOfpi holder) {
      this.holder = holder;
      return this;
    }

    /**
     * <p>Information regarding the bank account.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("details")
    public _FinalStage details(CreateBankAccountOfpiDetails details) {
      this.details = details;
      return this;
    }

    @Override
    public CreateBankAccountOfpi build() {
      return new CreateBankAccountOfpi(institution, holder, details);
    }
  }
}
