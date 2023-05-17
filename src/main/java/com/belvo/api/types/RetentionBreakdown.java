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
    builder = RetentionBreakdown.Builder.class
)
public final class RetentionBreakdown {
  private final Optional<Double> baseAmount;

  private final Optional<String> taxType;

  private final Optional<Double> retainedAmount;

  private final EnumTaxRetentionPaymentStatus paymentStatus;

  private int _cachedHashCode;

  RetentionBreakdown(Optional<Double> baseAmount, Optional<String> taxType,
      Optional<Double> retainedAmount, EnumTaxRetentionPaymentStatus paymentStatus) {
    this.baseAmount = baseAmount;
    this.taxType = taxType;
    this.retainedAmount = retainedAmount;
    this.paymentStatus = paymentStatus;
  }

  /**
   * @return The base amount that was used to calculate the tax retention.
   */
  @JsonProperty("base_amount")
  public Optional<Double> getBaseAmount() {
    return baseAmount;
  }

  /**
   * @return Optional attribute to indicate the type of tax withheld for the period or year according to the <a href="https://developers.belvo.com/docs/sat-catalogs#retention-code">SAT catalog</a>.
   */
  @JsonProperty("tax_type")
  public Optional<String> getTaxType() {
    return taxType;
  }

  /**
   * @return The amount retained.
   */
  @JsonProperty("retained_amount")
  public Optional<Double> getRetainedAmount() {
    return retainedAmount;
  }

  @JsonProperty("payment_status")
  public EnumTaxRetentionPaymentStatus getPaymentStatus() {
    return paymentStatus;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof RetentionBreakdown && equalTo((RetentionBreakdown) other);
  }

  private boolean equalTo(RetentionBreakdown other) {
    return baseAmount.equals(other.baseAmount) && taxType.equals(other.taxType) && retainedAmount.equals(other.retainedAmount) && paymentStatus.equals(other.paymentStatus);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.baseAmount, this.taxType, this.retainedAmount, this.paymentStatus);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "RetentionBreakdown{" + "baseAmount: " + baseAmount + ", taxType: " + taxType + ", retainedAmount: " + retainedAmount + ", paymentStatus: " + paymentStatus + "}";
  }

  public static PaymentStatusStage builder() {
    return new Builder();
  }

  public interface PaymentStatusStage {
    _FinalStage paymentStatus(EnumTaxRetentionPaymentStatus paymentStatus);

    Builder from(RetentionBreakdown other);
  }

  public interface _FinalStage {
    RetentionBreakdown build();

    _FinalStage baseAmount(Optional<Double> baseAmount);

    _FinalStage baseAmount(Double baseAmount);

    _FinalStage taxType(Optional<String> taxType);

    _FinalStage taxType(String taxType);

    _FinalStage retainedAmount(Optional<Double> retainedAmount);

    _FinalStage retainedAmount(Double retainedAmount);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements PaymentStatusStage, _FinalStage {
    private EnumTaxRetentionPaymentStatus paymentStatus;

    private Optional<Double> retainedAmount = Optional.empty();

    private Optional<String> taxType = Optional.empty();

    private Optional<Double> baseAmount = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(RetentionBreakdown other) {
      baseAmount(other.getBaseAmount());
      taxType(other.getTaxType());
      retainedAmount(other.getRetainedAmount());
      paymentStatus(other.getPaymentStatus());
      return this;
    }

    @Override
    @JsonSetter("payment_status")
    public _FinalStage paymentStatus(EnumTaxRetentionPaymentStatus paymentStatus) {
      this.paymentStatus = paymentStatus;
      return this;
    }

    /**
     * <p>The amount retained.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage retainedAmount(Double retainedAmount) {
      this.retainedAmount = Optional.of(retainedAmount);
      return this;
    }

    @Override
    @JsonSetter(
        value = "retained_amount",
        nulls = Nulls.SKIP
    )
    public _FinalStage retainedAmount(Optional<Double> retainedAmount) {
      this.retainedAmount = retainedAmount;
      return this;
    }

    /**
     * <p>Optional attribute to indicate the type of tax withheld for the period or year according to the <a href="https://developers.belvo.com/docs/sat-catalogs#retention-code">SAT catalog</a>.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage taxType(String taxType) {
      this.taxType = Optional.of(taxType);
      return this;
    }

    @Override
    @JsonSetter(
        value = "tax_type",
        nulls = Nulls.SKIP
    )
    public _FinalStage taxType(Optional<String> taxType) {
      this.taxType = taxType;
      return this;
    }

    /**
     * <p>The base amount that was used to calculate the tax retention.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage baseAmount(Double baseAmount) {
      this.baseAmount = Optional.of(baseAmount);
      return this;
    }

    @Override
    @JsonSetter(
        value = "base_amount",
        nulls = Nulls.SKIP
    )
    public _FinalStage baseAmount(Optional<Double> baseAmount) {
      this.baseAmount = baseAmount;
      return this;
    }

    @Override
    public RetentionBreakdown build() {
      return new RetentionBreakdown(baseAmount, taxType, retainedAmount, paymentStatus);
    }
  }
}
