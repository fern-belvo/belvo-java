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
    builder = BankAccountOfpiResponse.Builder.class
)
public final class BankAccountOfpiResponse {
  private final String id;

  private final String createdAt;

  private final String createdBy;

  private final Optional<String> customer;

  private final Optional<String> institution;

  private final BankAccountOfpiResponseDetails details;

  private final HolderResponseOfpi holder;

  private int _cachedHashCode;

  BankAccountOfpiResponse(String id, String createdAt, String createdBy, Optional<String> customer,
      Optional<String> institution, BankAccountOfpiResponseDetails details,
      HolderResponseOfpi holder) {
    this.id = id;
    this.createdAt = createdAt;
    this.createdBy = createdBy;
    this.customer = customer;
    this.institution = institution;
    this.details = details;
    this.holder = holder;
  }

  /**
   * @return Belvo's unique ID for the current bank account.
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

  /**
   * @return Belvo's unique ID for the customer associated with the bank account.
   * For <code>BUSINESS</code> bank accounts, this field is <code>null</code>.
   */
  @JsonProperty("customer")
  public Optional<String> getCustomer() {
    return customer;
  }

  /**
   * @return Belvo's unique ID for the institution that the bank account is created in.
   * For <code>BUSINESS</code> bank accounts that Belvo creates for organizations, this field is <code>null</code>.
   */
  @JsonProperty("institution")
  public Optional<String> getInstitution() {
    return institution;
  }

  @JsonProperty("details")
  public BankAccountOfpiResponseDetails getDetails() {
    return details;
  }

  @JsonProperty("holder")
  public HolderResponseOfpi getHolder() {
    return holder;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof BankAccountOfpiResponse && equalTo((BankAccountOfpiResponse) other);
  }

  private boolean equalTo(BankAccountOfpiResponse other) {
    return id.equals(other.id) && createdAt.equals(other.createdAt) && createdBy.equals(other.createdBy) && customer.equals(other.customer) && institution.equals(other.institution) && details.equals(other.details) && holder.equals(other.holder);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.id, this.createdAt, this.createdBy, this.customer, this.institution, this.details, this.holder);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "BankAccountOfpiResponse{" + "id: " + id + ", createdAt: " + createdAt + ", createdBy: " + createdBy + ", customer: " + customer + ", institution: " + institution + ", details: " + details + ", holder: " + holder + "}";
  }

  public static IdStage builder() {
    return new Builder();
  }

  public interface IdStage {
    CreatedAtStage id(String id);

    Builder from(BankAccountOfpiResponse other);
  }

  public interface CreatedAtStage {
    CreatedByStage createdAt(String createdAt);
  }

  public interface CreatedByStage {
    DetailsStage createdBy(String createdBy);
  }

  public interface DetailsStage {
    HolderStage details(BankAccountOfpiResponseDetails details);
  }

  public interface HolderStage {
    _FinalStage holder(HolderResponseOfpi holder);
  }

  public interface _FinalStage {
    BankAccountOfpiResponse build();

    _FinalStage customer(Optional<String> customer);

    _FinalStage customer(String customer);

    _FinalStage institution(Optional<String> institution);

    _FinalStage institution(String institution);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements IdStage, CreatedAtStage, CreatedByStage, DetailsStage, HolderStage, _FinalStage {
    private String id;

    private String createdAt;

    private String createdBy;

    private BankAccountOfpiResponseDetails details;

    private HolderResponseOfpi holder;

    private Optional<String> institution = Optional.empty();

    private Optional<String> customer = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(BankAccountOfpiResponse other) {
      id(other.getId());
      createdAt(other.getCreatedAt());
      createdBy(other.getCreatedBy());
      customer(other.getCustomer());
      institution(other.getInstitution());
      details(other.getDetails());
      holder(other.getHolder());
      return this;
    }

    /**
     * <p>Belvo's unique ID for the current bank account.</p>
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
    public DetailsStage createdBy(String createdBy) {
      this.createdBy = createdBy;
      return this;
    }

    @Override
    @JsonSetter("details")
    public HolderStage details(BankAccountOfpiResponseDetails details) {
      this.details = details;
      return this;
    }

    @Override
    @JsonSetter("holder")
    public _FinalStage holder(HolderResponseOfpi holder) {
      this.holder = holder;
      return this;
    }

    /**
     * <p>Belvo's unique ID for the institution that the bank account is created in.
     * For <code>BUSINESS</code> bank accounts that Belvo creates for organizations, this field is <code>null</code>.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage institution(String institution) {
      this.institution = Optional.of(institution);
      return this;
    }

    @Override
    @JsonSetter(
        value = "institution",
        nulls = Nulls.SKIP
    )
    public _FinalStage institution(Optional<String> institution) {
      this.institution = institution;
      return this;
    }

    /**
     * <p>Belvo's unique ID for the customer associated with the bank account.
     * For <code>BUSINESS</code> bank accounts, this field is <code>null</code>.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage customer(String customer) {
      this.customer = Optional.of(customer);
      return this;
    }

    @Override
    @JsonSetter(
        value = "customer",
        nulls = Nulls.SKIP
    )
    public _FinalStage customer(Optional<String> customer) {
      this.customer = customer;
      return this;
    }

    @Override
    public BankAccountOfpiResponse build() {
      return new BankAccountOfpiResponse(id, createdAt, createdBy, customer, institution, details, holder);
    }
  }
}
