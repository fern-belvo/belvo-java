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
    builder = AnnualIncomeStatementBusiness.Builder.class
)
public final class AnnualIncomeStatementBusiness {
  private final double grossIncomeFromOrdinaryActivities;

  private final double dividends;

  private final double otherIncome;

  private final double totalGrossIncome;

  private final double returnsRebatesAndDiscountsOnSales;

  private final double totalNetIncome;

  private int _cachedHashCode;

  AnnualIncomeStatementBusiness(double grossIncomeFromOrdinaryActivities, double dividends,
      double otherIncome, double totalGrossIncome, double returnsRebatesAndDiscountsOnSales,
      double totalNetIncome) {
    this.grossIncomeFromOrdinaryActivities = grossIncomeFromOrdinaryActivities;
    this.dividends = dividends;
    this.otherIncome = otherIncome;
    this.totalGrossIncome = totalGrossIncome;
    this.returnsRebatesAndDiscountsOnSales = returnsRebatesAndDiscountsOnSales;
    this.totalNetIncome = totalNetIncome;
  }

  /**
   * @return Total gross income that the company generated from their main economic activity.
   */
  @JsonProperty("gross_income_from_ordinary_activities")
  public double getGrossIncomeFromOrdinaryActivities() {
    return grossIncomeFromOrdinaryActivities;
  }

  /**
   * @return Total income that the company generated from dividends.
   */
  @JsonProperty("dividends")
  public double getDividends() {
    return dividends;
  }

  /**
   * @return Total income that the company generated from activities not associated with their main economic activity.
   */
  @JsonProperty("other_income")
  public double getOtherIncome() {
    return otherIncome;
  }

  /**
   * @return Total gross income the company generated.
   */
  @JsonProperty("total_gross_income")
  public double getTotalGrossIncome() {
    return totalGrossIncome;
  }

  /**
   * @return Total value of cancelled orders, corrected invoices, or similar, that can be discounted from the <code>total_gross_income</code>.
   */
  @JsonProperty("returns_rebates_and_discounts_on_sales")
  public double getReturnsRebatesAndDiscountsOnSales() {
    return returnsRebatesAndDiscountsOnSales;
  }

  /**
   * @return Total net income of the company, taking into account <code>returns_rebates_and_discounts_on_sales</code>.
   */
  @JsonProperty("total_net_income")
  public double getTotalNetIncome() {
    return totalNetIncome;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof AnnualIncomeStatementBusiness && equalTo((AnnualIncomeStatementBusiness) other);
  }

  private boolean equalTo(AnnualIncomeStatementBusiness other) {
    return grossIncomeFromOrdinaryActivities == other.grossIncomeFromOrdinaryActivities && dividends == other.dividends && otherIncome == other.otherIncome && totalGrossIncome == other.totalGrossIncome && returnsRebatesAndDiscountsOnSales == other.returnsRebatesAndDiscountsOnSales && totalNetIncome == other.totalNetIncome;
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.grossIncomeFromOrdinaryActivities, this.dividends, this.otherIncome, this.totalGrossIncome, this.returnsRebatesAndDiscountsOnSales, this.totalNetIncome);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "AnnualIncomeStatementBusiness{" + "grossIncomeFromOrdinaryActivities: " + grossIncomeFromOrdinaryActivities + ", dividends: " + dividends + ", otherIncome: " + otherIncome + ", totalGrossIncome: " + totalGrossIncome + ", returnsRebatesAndDiscountsOnSales: " + returnsRebatesAndDiscountsOnSales + ", totalNetIncome: " + totalNetIncome + "}";
  }

  public static GrossIncomeFromOrdinaryActivitiesStage builder() {
    return new Builder();
  }

  public interface GrossIncomeFromOrdinaryActivitiesStage {
    DividendsStage grossIncomeFromOrdinaryActivities(double grossIncomeFromOrdinaryActivities);

    Builder from(AnnualIncomeStatementBusiness other);
  }

  public interface DividendsStage {
    OtherIncomeStage dividends(double dividends);
  }

  public interface OtherIncomeStage {
    TotalGrossIncomeStage otherIncome(double otherIncome);
  }

  public interface TotalGrossIncomeStage {
    ReturnsRebatesAndDiscountsOnSalesStage totalGrossIncome(double totalGrossIncome);
  }

  public interface ReturnsRebatesAndDiscountsOnSalesStage {
    TotalNetIncomeStage returnsRebatesAndDiscountsOnSales(double returnsRebatesAndDiscountsOnSales);
  }

  public interface TotalNetIncomeStage {
    _FinalStage totalNetIncome(double totalNetIncome);
  }

  public interface _FinalStage {
    AnnualIncomeStatementBusiness build();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements GrossIncomeFromOrdinaryActivitiesStage, DividendsStage, OtherIncomeStage, TotalGrossIncomeStage, ReturnsRebatesAndDiscountsOnSalesStage, TotalNetIncomeStage, _FinalStage {
    private double grossIncomeFromOrdinaryActivities;

    private double dividends;

    private double otherIncome;

    private double totalGrossIncome;

    private double returnsRebatesAndDiscountsOnSales;

    private double totalNetIncome;

    private Builder() {
    }

    @Override
    public Builder from(AnnualIncomeStatementBusiness other) {
      grossIncomeFromOrdinaryActivities(other.getGrossIncomeFromOrdinaryActivities());
      dividends(other.getDividends());
      otherIncome(other.getOtherIncome());
      totalGrossIncome(other.getTotalGrossIncome());
      returnsRebatesAndDiscountsOnSales(other.getReturnsRebatesAndDiscountsOnSales());
      totalNetIncome(other.getTotalNetIncome());
      return this;
    }

    /**
     * <p>Total gross income that the company generated from their main economic activity.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("gross_income_from_ordinary_activities")
    public DividendsStage grossIncomeFromOrdinaryActivities(
        double grossIncomeFromOrdinaryActivities) {
      this.grossIncomeFromOrdinaryActivities = grossIncomeFromOrdinaryActivities;
      return this;
    }

    /**
     * <p>Total income that the company generated from dividends.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("dividends")
    public OtherIncomeStage dividends(double dividends) {
      this.dividends = dividends;
      return this;
    }

    /**
     * <p>Total income that the company generated from activities not associated with their main economic activity.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("other_income")
    public TotalGrossIncomeStage otherIncome(double otherIncome) {
      this.otherIncome = otherIncome;
      return this;
    }

    /**
     * <p>Total gross income the company generated.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("total_gross_income")
    public ReturnsRebatesAndDiscountsOnSalesStage totalGrossIncome(double totalGrossIncome) {
      this.totalGrossIncome = totalGrossIncome;
      return this;
    }

    /**
     * <p>Total value of cancelled orders, corrected invoices, or similar, that can be discounted from the <code>total_gross_income</code>.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("returns_rebates_and_discounts_on_sales")
    public TotalNetIncomeStage returnsRebatesAndDiscountsOnSales(
        double returnsRebatesAndDiscountsOnSales) {
      this.returnsRebatesAndDiscountsOnSales = returnsRebatesAndDiscountsOnSales;
      return this;
    }

    /**
     * <p>Total net income of the company, taking into account <code>returns_rebates_and_discounts_on_sales</code>.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("total_net_income")
    public _FinalStage totalNetIncome(double totalNetIncome) {
      this.totalNetIncome = totalNetIncome;
      return this;
    }

    @Override
    public AnnualIncomeStatementBusiness build() {
      return new AnnualIncomeStatementBusiness(grossIncomeFromOrdinaryActivities, dividends, otherIncome, totalGrossIncome, returnsRebatesAndDiscountsOnSales, totalNetIncome);
    }
  }
}
