package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = NextStepDisplayCustomerBankAccountsPse.Builder.class
)
public final class NextStepDisplayCustomerBankAccountsPse {
  private final Optional<NextStepDisplayCustomerBankAccountsPseType> type;

  private final Optional<DisplayCustomerBankAccountsContentPse> pseDisplayCustomerBankAccounts;

  private final Optional<Boolean> readyToConfirm;

  private int _cachedHashCode;

  NextStepDisplayCustomerBankAccountsPse(Optional<NextStepDisplayCustomerBankAccountsPseType> type,
      Optional<DisplayCustomerBankAccountsContentPse> pseDisplayCustomerBankAccounts,
      Optional<Boolean> readyToConfirm) {
    this.type = type;
    this.pseDisplayCustomerBankAccounts = pseDisplayCustomerBankAccounts;
    this.readyToConfirm = readyToConfirm;
  }

  /**
   * @return The type of <code>next_step</code> you need to follow.
   */
  @JsonProperty("type")
  public Optional<NextStepDisplayCustomerBankAccountsPseType> getType() {
    return type;
  }

  @JsonProperty("pse_display_customer_bank_accounts")
  public Optional<DisplayCustomerBankAccountsContentPse> getPseDisplayCustomerBankAccounts() {
    return pseDisplayCustomerBankAccounts;
  }

  /**
   * @return Boolean that indicates whether the payment intent is ready to be confirmed.
   * <p><strong>Note:</strong> When the value is <code>true</code>, you'll need to make a PATCH request sending through <code>confirm: true</code> to confirm the payment.</p>
   */
  @JsonProperty("ready_to_confirm")
  public Optional<Boolean> getReadyToConfirm() {
    return readyToConfirm;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof NextStepDisplayCustomerBankAccountsPse && equalTo((NextStepDisplayCustomerBankAccountsPse) other);
  }

  private boolean equalTo(NextStepDisplayCustomerBankAccountsPse other) {
    return type.equals(other.type) && pseDisplayCustomerBankAccounts.equals(other.pseDisplayCustomerBankAccounts) && readyToConfirm.equals(other.readyToConfirm);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.type, this.pseDisplayCustomerBankAccounts, this.readyToConfirm);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "NextStepDisplayCustomerBankAccountsPse{" + "type: " + type + ", pseDisplayCustomerBankAccounts: " + pseDisplayCustomerBankAccounts + ", readyToConfirm: " + readyToConfirm + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<NextStepDisplayCustomerBankAccountsPseType> type = Optional.empty();

    private Optional<DisplayCustomerBankAccountsContentPse> pseDisplayCustomerBankAccounts = Optional.empty();

    private Optional<Boolean> readyToConfirm = Optional.empty();

    private Builder() {
    }

    public Builder from(NextStepDisplayCustomerBankAccountsPse other) {
      type(other.getType());
      pseDisplayCustomerBankAccounts(other.getPseDisplayCustomerBankAccounts());
      readyToConfirm(other.getReadyToConfirm());
      return this;
    }

    @JsonSetter(
        value = "type",
        nulls = Nulls.SKIP
    )
    public Builder type(Optional<NextStepDisplayCustomerBankAccountsPseType> type) {
      this.type = type;
      return this;
    }

    public Builder type(NextStepDisplayCustomerBankAccountsPseType type) {
      this.type = Optional.of(type);
      return this;
    }

    @JsonSetter(
        value = "pse_display_customer_bank_accounts",
        nulls = Nulls.SKIP
    )
    public Builder pseDisplayCustomerBankAccounts(
        Optional<DisplayCustomerBankAccountsContentPse> pseDisplayCustomerBankAccounts) {
      this.pseDisplayCustomerBankAccounts = pseDisplayCustomerBankAccounts;
      return this;
    }

    public Builder pseDisplayCustomerBankAccounts(
        DisplayCustomerBankAccountsContentPse pseDisplayCustomerBankAccounts) {
      this.pseDisplayCustomerBankAccounts = Optional.of(pseDisplayCustomerBankAccounts);
      return this;
    }

    @JsonSetter(
        value = "ready_to_confirm",
        nulls = Nulls.SKIP
    )
    public Builder readyToConfirm(Optional<Boolean> readyToConfirm) {
      this.readyToConfirm = readyToConfirm;
      return this;
    }

    public Builder readyToConfirm(Boolean readyToConfirm) {
      this.readyToConfirm = Optional.of(readyToConfirm);
      return this;
    }

    public NextStepDisplayCustomerBankAccountsPse build() {
      return new NextStepDisplayCustomerBankAccountsPse(type, pseDisplayCustomerBankAccounts, readyToConfirm);
    }
  }
}
