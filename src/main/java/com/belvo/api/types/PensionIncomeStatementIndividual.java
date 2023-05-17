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
    builder = PensionIncomeStatementIndividual.Builder.class
)
public final class PensionIncomeStatementIndividual {
  private final double netPensionIncome;

  private final double netTaxablePensionIncome;

  private int _cachedHashCode;

  PensionIncomeStatementIndividual(double netPensionIncome, double netTaxablePensionIncome) {
    this.netPensionIncome = netPensionIncome;
    this.netTaxablePensionIncome = netTaxablePensionIncome;
  }

  /**
   * @return The total net pension of the taxpayer.
   */
  @JsonProperty("net_pension_income")
  public double getNetPensionIncome() {
    return netPensionIncome;
  }

  /**
   * @return The total taxable pension income of the taxpayer.
   */
  @JsonProperty("net_taxable_pension_income")
  public double getNetTaxablePensionIncome() {
    return netTaxablePensionIncome;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof PensionIncomeStatementIndividual && equalTo((PensionIncomeStatementIndividual) other);
  }

  private boolean equalTo(PensionIncomeStatementIndividual other) {
    return netPensionIncome == other.netPensionIncome && netTaxablePensionIncome == other.netTaxablePensionIncome;
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.netPensionIncome, this.netTaxablePensionIncome);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "PensionIncomeStatementIndividual{" + "netPensionIncome: " + netPensionIncome + ", netTaxablePensionIncome: " + netTaxablePensionIncome + "}";
  }

  public static NetPensionIncomeStage builder() {
    return new Builder();
  }

  public interface NetPensionIncomeStage {
    NetTaxablePensionIncomeStage netPensionIncome(double netPensionIncome);

    Builder from(PensionIncomeStatementIndividual other);
  }

  public interface NetTaxablePensionIncomeStage {
    _FinalStage netTaxablePensionIncome(double netTaxablePensionIncome);
  }

  public interface _FinalStage {
    PensionIncomeStatementIndividual build();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements NetPensionIncomeStage, NetTaxablePensionIncomeStage, _FinalStage {
    private double netPensionIncome;

    private double netTaxablePensionIncome;

    private Builder() {
    }

    @Override
    public Builder from(PensionIncomeStatementIndividual other) {
      netPensionIncome(other.getNetPensionIncome());
      netTaxablePensionIncome(other.getNetTaxablePensionIncome());
      return this;
    }

    /**
     * <p>The total net pension of the taxpayer.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("net_pension_income")
    public NetTaxablePensionIncomeStage netPensionIncome(double netPensionIncome) {
      this.netPensionIncome = netPensionIncome;
      return this;
    }

    /**
     * <p>The total taxable pension income of the taxpayer.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("net_taxable_pension_income")
    public _FinalStage netTaxablePensionIncome(double netTaxablePensionIncome) {
      this.netTaxablePensionIncome = netTaxablePensionIncome;
      return this;
    }

    @Override
    public PensionIncomeStatementIndividual build() {
      return new PensionIncomeStatementIndividual(netPensionIncome, netTaxablePensionIncome);
    }
  }
}
