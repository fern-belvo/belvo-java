package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = CreateBankAccountPse.Builder.class
)
public final class CreateBankAccountPse {
  private final HolderBusinessPse holder;

  private final ProvidersPse providers;

  private final String number;

  private final Optional<Map<String, Object>> metadata;

  private int _cachedHashCode;

  CreateBankAccountPse(HolderBusinessPse holder, ProvidersPse providers, String number,
      Optional<Map<String, Object>> metadata) {
    this.holder = holder;
    this.providers = providers;
    this.number = number;
    this.metadata = metadata;
  }

  /**
   * @return Information regarding the business bank account holder.
   */
  @JsonProperty("holder")
  public HolderBusinessPse getHolder() {
    return holder;
  }

  /**
   * @return Information about the payment service provider, required in order to establish a connection and process requests. For PSE, the value must be <code>payments_way</code>.
   */
  @JsonProperty("providers")
  public ProvidersPse getProviders() {
    return providers;
  }

  /**
   * @return The bank account number of the payment beneficiary.
   */
  @JsonProperty("number")
  public String getNumber() {
    return number;
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
    return other instanceof CreateBankAccountPse && equalTo((CreateBankAccountPse) other);
  }

  private boolean equalTo(CreateBankAccountPse other) {
    return holder.equals(other.holder) && providers.equals(other.providers) && number.equals(other.number) && metadata.equals(other.metadata);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.holder, this.providers, this.number, this.metadata);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "CreateBankAccountPse{" + "holder: " + holder + ", providers: " + providers + ", number: " + number + ", metadata: " + metadata + "}";
  }

  public static HolderStage builder() {
    return new Builder();
  }

  public interface HolderStage {
    ProvidersStage holder(HolderBusinessPse holder);

    Builder from(CreateBankAccountPse other);
  }

  public interface ProvidersStage {
    NumberStage providers(ProvidersPse providers);
  }

  public interface NumberStage {
    _FinalStage number(String number);
  }

  public interface _FinalStage {
    CreateBankAccountPse build();

    _FinalStage metadata(Optional<Map<String, Object>> metadata);

    _FinalStage metadata(Map<String, Object> metadata);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements HolderStage, ProvidersStage, NumberStage, _FinalStage {
    private HolderBusinessPse holder;

    private ProvidersPse providers;

    private String number;

    private Optional<Map<String, Object>> metadata = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(CreateBankAccountPse other) {
      holder(other.getHolder());
      providers(other.getProviders());
      number(other.getNumber());
      metadata(other.getMetadata());
      return this;
    }

    /**
     * <p>Information regarding the business bank account holder.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("holder")
    public ProvidersStage holder(HolderBusinessPse holder) {
      this.holder = holder;
      return this;
    }

    /**
     * <p>Information about the payment service provider, required in order to establish a connection and process requests. For PSE, the value must be <code>payments_way</code>.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("providers")
    public NumberStage providers(ProvidersPse providers) {
      this.providers = providers;
      return this;
    }

    /**
     * <p>The bank account number of the payment beneficiary.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("number")
    public _FinalStage number(String number) {
      this.number = number;
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

    @Override
    public CreateBankAccountPse build() {
      return new CreateBankAccountPse(holder, providers, number, metadata);
    }
  }
}
