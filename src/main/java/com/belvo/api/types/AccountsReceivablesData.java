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
    builder = AccountsReceivablesData.Builder.class
)
public final class AccountsReceivablesData {
  private final Optional<Double> current;

  private final Optional<Double> available;

  private final Optional<Double> anticipated;

  private final String collectedAt;

  private int _cachedHashCode;

  AccountsReceivablesData(Optional<Double> current, Optional<Double> available,
      Optional<Double> anticipated, String collectedAt) {
    this.current = current;
    this.available = available;
    this.anticipated = anticipated;
    this.collectedAt = collectedAt;
  }

  /**
   * @return The total sum of all receivables (<code>available</code> + <code>anticipated</code>)
   */
  @JsonProperty("current")
  public Optional<Double> getCurrent() {
    return current;
  }

  /**
   * @return The amount that the owner of the account will receive according to an established date.
   */
  @JsonProperty("available")
  public Optional<Double> getAvailable() {
    return available;
  }

  /**
   * @return The amount that the owner of the account received earlier than contracted.
   */
  @JsonProperty("anticipated")
  public Optional<Double> getAnticipated() {
    return anticipated;
  }

  /**
   * @return The ISO-8601 timestamp when the data point was collected.
   */
  @JsonProperty("collected_at")
  public String getCollectedAt() {
    return collectedAt;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AccountsReceivablesData && equalTo((AccountsReceivablesData) other);
  }

  private boolean equalTo(AccountsReceivablesData other) {
    return current.equals(other.current) && available.equals(other.available) && anticipated.equals(other.anticipated) && collectedAt.equals(other.collectedAt);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.current, this.available, this.anticipated, this.collectedAt);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AccountsReceivablesData{" + "current: " + current + ", available: " + available + ", anticipated: " + anticipated + ", collectedAt: " + collectedAt + "}";
  }

  public static CollectedAtStage builder() {
    return new Builder();
  }

  public interface CollectedAtStage {
    _FinalStage collectedAt(String collectedAt);

    Builder from(AccountsReceivablesData other);
  }

  public interface _FinalStage {
    AccountsReceivablesData build();

    _FinalStage current(Optional<Double> current);

    _FinalStage current(Double current);

    _FinalStage available(Optional<Double> available);

    _FinalStage available(Double available);

    _FinalStage anticipated(Optional<Double> anticipated);

    _FinalStage anticipated(Double anticipated);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements CollectedAtStage, _FinalStage {
    private String collectedAt;

    private Optional<Double> anticipated = Optional.empty();

    private Optional<Double> available = Optional.empty();

    private Optional<Double> current = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(AccountsReceivablesData other) {
      current(other.getCurrent());
      available(other.getAvailable());
      anticipated(other.getAnticipated());
      collectedAt(other.getCollectedAt());
      return this;
    }

    /**
     * <p>The ISO-8601 timestamp when the data point was collected.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("collected_at")
    public _FinalStage collectedAt(String collectedAt) {
      this.collectedAt = collectedAt;
      return this;
    }

    /**
     * <p>The amount that the owner of the account received earlier than contracted.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage anticipated(Double anticipated) {
      this.anticipated = Optional.of(anticipated);
      return this;
    }

    @Override
    @JsonSetter(
        value = "anticipated",
        nulls = Nulls.SKIP
    )
    public _FinalStage anticipated(Optional<Double> anticipated) {
      this.anticipated = anticipated;
      return this;
    }

    /**
     * <p>The amount that the owner of the account will receive according to an established date.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage available(Double available) {
      this.available = Optional.of(available);
      return this;
    }

    @Override
    @JsonSetter(
        value = "available",
        nulls = Nulls.SKIP
    )
    public _FinalStage available(Optional<Double> available) {
      this.available = available;
      return this;
    }

    /**
     * <p>The total sum of all receivables (<code>available</code> + <code>anticipated</code>)</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage current(Double current) {
      this.current = Optional.of(current);
      return this;
    }

    @Override
    @JsonSetter(
        value = "current",
        nulls = Nulls.SKIP
    )
    public _FinalStage current(Optional<Double> current) {
      this.current = current;
      return this;
    }

    @Override
    public AccountsReceivablesData build() {
      return new AccountsReceivablesData(current, available, anticipated, collectedAt);
    }
  }
}
