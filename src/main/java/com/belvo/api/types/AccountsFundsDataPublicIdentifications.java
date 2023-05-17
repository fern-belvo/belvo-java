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
    builder = AccountsFundsDataPublicIdentifications.Builder.class
)
public final class AccountsFundsDataPublicIdentifications {
  private final String name;

  private final Optional<String> value;

  private int _cachedHashCode;

  AccountsFundsDataPublicIdentifications(String name, Optional<String> value) {
    this.name = name;
    this.value = value;
  }

  /**
   * @return The type of identification number for the fund.
   */
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * @return The fund's identification number.
   */
  @JsonProperty("value")
  public Optional<String> getValue() {
    return value;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AccountsFundsDataPublicIdentifications && equalTo((AccountsFundsDataPublicIdentifications) other);
  }

  private boolean equalTo(AccountsFundsDataPublicIdentifications other) {
    return name.equals(other.name) && value.equals(other.value);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.name, this.value);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AccountsFundsDataPublicIdentifications{" + "name: " + name + ", value: " + value + "}";
  }

  public static NameStage builder() {
    return new Builder();
  }

  public interface NameStage {
    _FinalStage name(String name);

    Builder from(AccountsFundsDataPublicIdentifications other);
  }

  public interface _FinalStage {
    AccountsFundsDataPublicIdentifications build();

    _FinalStage value(Optional<String> value);

    _FinalStage value(String value);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements NameStage, _FinalStage {
    private String name;

    private Optional<String> value = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(AccountsFundsDataPublicIdentifications other) {
      name(other.getName());
      value(other.getValue());
      return this;
    }

    /**
     * <p>The type of identification number for the fund.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("name")
    public _FinalStage name(String name) {
      this.name = name;
      return this;
    }

    /**
     * <p>The fund's identification number.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage value(String value) {
      this.value = Optional.of(value);
      return this;
    }

    @Override
    @JsonSetter(
        value = "value",
        nulls = Nulls.SKIP
    )
    public _FinalStage value(Optional<String> value) {
      this.value = value;
      return this;
    }

    @Override
    public AccountsFundsDataPublicIdentifications build() {
      return new AccountsFundsDataPublicIdentifications(name, value);
    }
  }
}
