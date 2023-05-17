package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = BankAccountBusinessPse.Builder.class
)
public final class BankAccountBusinessPse {
  private final String id;

  private final String createdAt;

  private final String createdBy;

  private final Optional<String> customer;

  private final Optional<String> institution;

  private final String number;

  private final HolderBusinessResponsePse holder;

  private final Map<String, Object> details;

  private final Optional<Map<String, Object>> metadata;

  private int _cachedHashCode;

  BankAccountBusinessPse(String id, String createdAt, String createdBy, Optional<String> customer,
      Optional<String> institution, String number, HolderBusinessResponsePse holder,
      Map<String, Object> details, Optional<Map<String, Object>> metadata) {
    this.id = id;
    this.createdAt = createdAt;
    this.createdBy = createdBy;
    this.customer = customer;
    this.institution = institution;
    this.number = number;
    this.holder = holder;
    this.details = details;
    this.metadata = metadata;
  }

  /**
   * @return Belvo's unique ID for the current bank account.
   */
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * @return The ISO-8601 timestamp of when the data point was first created in Belvo's database.
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

  /**
   * @return The bank account number of the payment beneficiary.
   */
  @JsonProperty("number")
  public String getNumber() {
    return number;
  }

  @JsonProperty("holder")
  public HolderBusinessResponsePse getHolder() {
    return holder;
  }

  /**
   * @return For PSE, this field will return an empty object.
   */
  @JsonProperty("details")
  public Map<String, Object> getDetails() {
    return details;
  }

  /**
   * @return Optional and customizable object where you can provide any additional key-value pairs for your internal purposes. For example, an internal reference number for the payment intent.
   * <p>⚠️ <strong>Note</strong>: You can only provide up to 50 keys (keys can have up to 50 characters each and each value can be up to 500 characters). We do not support nested objects, only ASCII values.</p>
   */
  @JsonProperty("metadata")
  public Optional<Map<String, Object>> getMetadata() {
    return metadata;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof BankAccountBusinessPse && equalTo((BankAccountBusinessPse) other);
  }

  private boolean equalTo(BankAccountBusinessPse other) {
    return id.equals(other.id) && createdAt.equals(other.createdAt) && createdBy.equals(other.createdBy) && customer.equals(other.customer) && institution.equals(other.institution) && number.equals(other.number) && holder.equals(other.holder) && details.equals(other.details) && metadata.equals(other.metadata);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.id, this.createdAt, this.createdBy, this.customer, this.institution, this.number, this.holder, this.details, this.metadata);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "BankAccountBusinessPse{" + "id: " + id + ", createdAt: " + createdAt + ", createdBy: " + createdBy + ", customer: " + customer + ", institution: " + institution + ", number: " + number + ", holder: " + holder + ", details: " + details + ", metadata: " + metadata + "}";
  }

  public static IdStage builder() {
    return new Builder();
  }

  public interface IdStage {
    CreatedAtStage id(String id);

    Builder from(BankAccountBusinessPse other);
  }

  public interface CreatedAtStage {
    CreatedByStage createdAt(String createdAt);
  }

  public interface CreatedByStage {
    NumberStage createdBy(String createdBy);
  }

  public interface NumberStage {
    HolderStage number(String number);
  }

  public interface HolderStage {
    _FinalStage holder(HolderBusinessResponsePse holder);
  }

  public interface _FinalStage {
    BankAccountBusinessPse build();

    _FinalStage customer(Optional<String> customer);

    _FinalStage customer(String customer);

    _FinalStage institution(Optional<String> institution);

    _FinalStage institution(String institution);

    _FinalStage details(Map<String, Object> details);

    _FinalStage putAllDetails(Map<String, Object> details);

    _FinalStage details(String key, Object value);

    _FinalStage metadata(Optional<Map<String, Object>> metadata);

    _FinalStage metadata(Map<String, Object> metadata);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements IdStage, CreatedAtStage, CreatedByStage, NumberStage, HolderStage, _FinalStage {
    private String id;

    private String createdAt;

    private String createdBy;

    private String number;

    private HolderBusinessResponsePse holder;

    private Optional<Map<String, Object>> metadata = Optional.empty();

    private Map<String, Object> details = new LinkedHashMap<>();

    private Optional<String> institution = Optional.empty();

    private Optional<String> customer = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(BankAccountBusinessPse other) {
      id(other.getId());
      createdAt(other.getCreatedAt());
      createdBy(other.getCreatedBy());
      customer(other.getCustomer());
      institution(other.getInstitution());
      number(other.getNumber());
      holder(other.getHolder());
      details(other.getDetails());
      metadata(other.getMetadata());
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
     * <p>The ISO-8601 timestamp of when the data point was first created in Belvo's database.</p>
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
    public NumberStage createdBy(String createdBy) {
      this.createdBy = createdBy;
      return this;
    }

    /**
     * <p>The bank account number of the payment beneficiary.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("number")
    public HolderStage number(String number) {
      this.number = number;
      return this;
    }

    @Override
    @JsonSetter("holder")
    public _FinalStage holder(HolderBusinessResponsePse holder) {
      this.holder = holder;
      return this;
    }

    /**
     * <p>Optional and customizable object where you can provide any additional key-value pairs for your internal purposes. For example, an internal reference number for the payment intent.</p>
     * <p>⚠️ <strong>Note</strong>: You can only provide up to 50 keys (keys can have up to 50 characters each and each value can be up to 500 characters). We do not support nested objects, only ASCII values.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage metadata(Map<String, Object> metadata) {
      this.metadata = Optional.of(metadata);
      return this;
    }

    @Override
    @JsonSetter(
        value = "metadata",
        nulls = Nulls.SKIP
    )
    public _FinalStage metadata(Optional<Map<String, Object>> metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     * <p>For PSE, this field will return an empty object.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage details(String key, Object value) {
      this.details.put(key, value);
      return this;
    }

    /**
     * <p>For PSE, this field will return an empty object.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage putAllDetails(Map<String, Object> details) {
      this.details.putAll(details);
      return this;
    }

    @Override
    @JsonSetter(
        value = "details",
        nulls = Nulls.SKIP
    )
    public _FinalStage details(Map<String, Object> details) {
      this.details.clear();
      this.details.putAll(details);
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
    public BankAccountBusinessPse build() {
      return new BankAccountBusinessPse(id, createdAt, createdBy, customer, institution, number, holder, details, metadata);
    }
  }
}
