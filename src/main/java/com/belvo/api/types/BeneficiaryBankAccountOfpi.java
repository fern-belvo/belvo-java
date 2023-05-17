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
    builder = BeneficiaryBankAccountOfpi.Builder.class
)
public final class BeneficiaryBankAccountOfpi {
  private final String id;

  private final String createdAt;

  private final String createdBy;

  private final PaymentInstitution institution;

  private final Optional<BeneficiaryBankAccountOfpiDetails> details;

  private final HolderResponseOfpi holder;

  private int _cachedHashCode;

  BeneficiaryBankAccountOfpi(String id, String createdAt, String createdBy,
      PaymentInstitution institution, Optional<BeneficiaryBankAccountOfpiDetails> details,
      HolderResponseOfpi holder) {
    this.id = id;
    this.createdAt = createdAt;
    this.createdBy = createdBy;
    this.institution = institution;
    this.details = details;
    this.holder = holder;
  }

  /**
   * @return Belvo's unique ID for the beneficiary bank account.
   */
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * @return The ISO-8601 timestamp of when the data point was last updated in Belvo's database.
   */
  @JsonProperty("created_at")
  public String getCreatedAt() {
    return createdAt;
  }

  /**
   * @return Belvo's unique ID for the user that created the bank account.
   */
  @JsonProperty("created_by")
  public String getCreatedBy() {
    return createdBy;
  }

  @JsonProperty("institution")
  public PaymentInstitution getInstitution() {
    return institution;
  }

  @JsonProperty("details")
  public Optional<BeneficiaryBankAccountOfpiDetails> getDetails() {
    return details;
  }

  @JsonProperty("holder")
  public HolderResponseOfpi getHolder() {
    return holder;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof BeneficiaryBankAccountOfpi && equalTo((BeneficiaryBankAccountOfpi) other);
  }

  private boolean equalTo(BeneficiaryBankAccountOfpi other) {
    return id.equals(other.id) && createdAt.equals(other.createdAt) && createdBy.equals(other.createdBy) && institution.equals(other.institution) && details.equals(other.details) && holder.equals(other.holder);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.id, this.createdAt, this.createdBy, this.institution, this.details, this.holder);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "BeneficiaryBankAccountOfpi{" + "id: " + id + ", createdAt: " + createdAt + ", createdBy: " + createdBy + ", institution: " + institution + ", details: " + details + ", holder: " + holder + "}";
  }

  public static IdStage builder() {
    return new Builder();
  }

  public interface IdStage {
    CreatedAtStage id(String id);

    Builder from(BeneficiaryBankAccountOfpi other);
  }

  public interface CreatedAtStage {
    CreatedByStage createdAt(String createdAt);
  }

  public interface CreatedByStage {
    InstitutionStage createdBy(String createdBy);
  }

  public interface InstitutionStage {
    HolderStage institution(PaymentInstitution institution);
  }

  public interface HolderStage {
    _FinalStage holder(HolderResponseOfpi holder);
  }

  public interface _FinalStage {
    BeneficiaryBankAccountOfpi build();

    _FinalStage details(Optional<BeneficiaryBankAccountOfpiDetails> details);

    _FinalStage details(BeneficiaryBankAccountOfpiDetails details);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements IdStage, CreatedAtStage, CreatedByStage, InstitutionStage, HolderStage, _FinalStage {
    private String id;

    private String createdAt;

    private String createdBy;

    private PaymentInstitution institution;

    private HolderResponseOfpi holder;

    private Optional<BeneficiaryBankAccountOfpiDetails> details = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(BeneficiaryBankAccountOfpi other) {
      id(other.getId());
      createdAt(other.getCreatedAt());
      createdBy(other.getCreatedBy());
      institution(other.getInstitution());
      details(other.getDetails());
      holder(other.getHolder());
      return this;
    }

    /**
     * <p>Belvo's unique ID for the beneficiary bank account.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("id")
    public CreatedAtStage id(String id) {
      this.id = id;
      return this;
    }

    /**
     * <p>The ISO-8601 timestamp of when the data point was last updated in Belvo's database.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("created_at")
    public CreatedByStage createdAt(String createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * <p>Belvo's unique ID for the user that created the bank account.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("created_by")
    public InstitutionStage createdBy(String createdBy) {
      this.createdBy = createdBy;
      return this;
    }

    @Override
    @JsonSetter("institution")
    public HolderStage institution(PaymentInstitution institution) {
      this.institution = institution;
      return this;
    }

    @Override
    @JsonSetter("holder")
    public _FinalStage holder(HolderResponseOfpi holder) {
      this.holder = holder;
      return this;
    }

    @Override
    public _FinalStage details(BeneficiaryBankAccountOfpiDetails details) {
      this.details = Optional.of(details);
      return this;
    }

    @Override
    @JsonSetter(
        value = "details",
        nulls = Nulls.SKIP
    )
    public _FinalStage details(Optional<BeneficiaryBankAccountOfpiDetails> details) {
      this.details = details;
      return this;
    }

    @Override
    public BeneficiaryBankAccountOfpi build() {
      return new BeneficiaryBankAccountOfpi(id, createdAt, createdBy, institution, details, holder);
    }
  }
}
