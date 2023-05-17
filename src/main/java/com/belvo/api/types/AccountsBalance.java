package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = AccountsBalance.Builder.class
)
public final class AccountsBalance {
  private final Optional<Double> current;

  private final Optional<Double> available;

  private int _cachedHashCode;

  AccountsBalance(Optional<Double> current, Optional<Double> available) {
    this.current = current;
    this.available = available;
  }

  /**
   * @return The current balance is calculated differently according to the type of account.
   * <ul>
   * <li><strong>💰 Checking and saving accounts</strong>:</li>
   * </ul>
   * <p>The user's account balance at the <code>collected_at</code> timestamp.</p>
   * <ul>
   * <li><strong>💳 Credit cards</strong>:</li>
   * </ul>
   * <p>The amount the user has spent in the current card billing period (see <code>credit_data.cutting_date</code> for information on when the current billing period finishes).</p>
   * <ul>
   * <li><strong>🏡 Loan accounts</strong>:</li>
   * </ul>
   * <p>The amount remaining to pay on the users's loan (same as <code>loan_data.outstanding_balance</code>).</p>
   */
  @JsonProperty("current")
  public Optional<Double> getCurrent() {
    return current;
  }

  /**
   * @return The balance that the account owner can use.
   * <ul>
   * <li><strong>💰 Checking and saving accounts</strong>:</li>
   * </ul>
   * <p>The available balance may be different to the <code>current</code> balance due to pending transactions.</p>
   * <ul>
   * <li><strong>💳 Credit cards</strong>:</li>
   * </ul>
   * <p>The credit amount the user still has available for the current period. The <code>available</code> balance may be different to the <code>current</code> balance due to pending transactions or future instalments.</p>
   * <ul>
   * <li><strong>🏡 Loan accounts</strong>:</li>
   * </ul>
   * <p>The present value required to pay off the loan, as provided by the institution.</p>
   * <p><strong>Note:</strong> If the institution does not provide this value, we return <code>null</code>.</p>
   */
  @JsonProperty("available")
  public Optional<Double> getAvailable() {
    return available;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AccountsBalance && equalTo((AccountsBalance) other);
  }

  private boolean equalTo(AccountsBalance other) {
    return current.equals(other.current) && available.equals(other.available);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.current, this.available);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AccountsBalance{" + "current: " + current + ", available: " + available + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<Double> current = Optional.empty();

    private Optional<Double> available = Optional.empty();

    private Builder() {
    }

    public Builder from(AccountsBalance other) {
      current(other.getCurrent());
      available(other.getAvailable());
      return this;
    }

    @JsonSetter(
        value = "current",
        nulls = Nulls.SKIP
    )
    public Builder current(Optional<Double> current) {
      this.current = current;
      return this;
    }

    public Builder current(Double current) {
      this.current = Optional.of(current);
      return this;
    }

    @JsonSetter(
        value = "available",
        nulls = Nulls.SKIP
    )
    public Builder available(Optional<Double> available) {
      this.available = available;
      return this;
    }

    public Builder available(Double available) {
      this.available = Optional.of(available);
      return this;
    }

    public AccountsBalance build() {
      return new AccountsBalance(current, available);
    }
  }
}
