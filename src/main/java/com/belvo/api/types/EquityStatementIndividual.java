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
    builder = EquityStatementIndividual.Builder.class
)
public final class EquityStatementIndividual {
  private final double totalGrossEquity;

  private final double totalDebts;

  private final double totalNetEquity;

  private int _cachedHashCode;

  EquityStatementIndividual(double totalGrossEquity, double totalDebts, double totalNetEquity) {
    this.totalGrossEquity = totalGrossEquity;
    this.totalDebts = totalDebts;
    this.totalNetEquity = totalNetEquity;
  }

  /**
   * @return The total gross equity of the tax payer.
   */
  @JsonProperty("total_gross_equity")
  public double getTotalGrossEquity() {
    return totalGrossEquity;
  }

  /**
   * @return The total debts of the tax_payer
   */
  @JsonProperty("total_debts")
  public double getTotalDebts() {
    return totalDebts;
  }

  /**
   * @return The total net equity value of the taxpayer.
   */
  @JsonProperty("total_net_equity")
  public double getTotalNetEquity() {
    return totalNetEquity;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof EquityStatementIndividual && equalTo((EquityStatementIndividual) other);
  }

  private boolean equalTo(EquityStatementIndividual other) {
    return totalGrossEquity == other.totalGrossEquity && totalDebts == other.totalDebts && totalNetEquity == other.totalNetEquity;
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.totalGrossEquity, this.totalDebts, this.totalNetEquity);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "EquityStatementIndividual{" + "totalGrossEquity: " + totalGrossEquity + ", totalDebts: " + totalDebts + ", totalNetEquity: " + totalNetEquity + "}";
  }

  public static TotalGrossEquityStage builder() {
    return new Builder();
  }

  public interface TotalGrossEquityStage {
    TotalDebtsStage totalGrossEquity(double totalGrossEquity);

    Builder from(EquityStatementIndividual other);
  }

  public interface TotalDebtsStage {
    TotalNetEquityStage totalDebts(double totalDebts);
  }

  public interface TotalNetEquityStage {
    _FinalStage totalNetEquity(double totalNetEquity);
  }

  public interface _FinalStage {
    EquityStatementIndividual build();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements TotalGrossEquityStage, TotalDebtsStage, TotalNetEquityStage, _FinalStage {
    private double totalGrossEquity;

    private double totalDebts;

    private double totalNetEquity;

    private Builder() {
    }

    @Override
    public Builder from(EquityStatementIndividual other) {
      totalGrossEquity(other.getTotalGrossEquity());
      totalDebts(other.getTotalDebts());
      totalNetEquity(other.getTotalNetEquity());
      return this;
    }

    /**
     * <p>The total gross equity of the tax payer.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("total_gross_equity")
    public TotalDebtsStage totalGrossEquity(double totalGrossEquity) {
      this.totalGrossEquity = totalGrossEquity;
      return this;
    }

    /**
     * <p>The total debts of the tax_payer</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("total_debts")
    public TotalNetEquityStage totalDebts(double totalDebts) {
      this.totalDebts = totalDebts;
      return this;
    }

    /**
     * <p>The total net equity value of the taxpayer.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("total_net_equity")
    public _FinalStage totalNetEquity(double totalNetEquity) {
      this.totalNetEquity = totalNetEquity;
      return this;
    }

    @Override
    public EquityStatementIndividual build() {
      return new EquityStatementIndividual(totalGrossEquity, totalDebts, totalNetEquity);
    }
  }
}
