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
    builder = EquityStatementBusiness.Builder.class
)
public final class EquityStatementBusiness {
  private final double cashAndCashEquivalents;

  private final double investmentsAndDerivativeFinancialInstruments;

  private final double accountsDocumentsAndFinanceLeasesReceivable;

  private final double inventory;

  private final double propertyPlantAndEquipmentInvestmentProperties;

  private final double totalGrossEquity;

  private final double debts;

  private final double totalNetEquity;

  private int _cachedHashCode;

  EquityStatementBusiness(double cashAndCashEquivalents,
      double investmentsAndDerivativeFinancialInstruments,
      double accountsDocumentsAndFinanceLeasesReceivable, double inventory,
      double propertyPlantAndEquipmentInvestmentProperties, double totalGrossEquity, double debts,
      double totalNetEquity) {
    this.cashAndCashEquivalents = cashAndCashEquivalents;
    this.investmentsAndDerivativeFinancialInstruments = investmentsAndDerivativeFinancialInstruments;
    this.accountsDocumentsAndFinanceLeasesReceivable = accountsDocumentsAndFinanceLeasesReceivable;
    this.inventory = inventory;
    this.propertyPlantAndEquipmentInvestmentProperties = propertyPlantAndEquipmentInvestmentProperties;
    this.totalGrossEquity = totalGrossEquity;
    this.debts = debts;
    this.totalNetEquity = totalNetEquity;
  }

  /**
   * @return Total cash (or cash equivalents) that the business currently holds at the end of the fiscal year.
   */
  @JsonProperty("cash_and_cash_equivalents")
  public double getCashAndCashEquivalents() {
    return cashAndCashEquivalents;
  }

  /**
   * @return Total value of all investments, stocks, or similar, that the company has.
   */
  @JsonProperty("investments_and_derivative_financial_instruments")
  public double getInvestmentsAndDerivativeFinancialInstruments() {
    return investmentsAndDerivativeFinancialInstruments;
  }

  /**
   * @return Total of all payments the company expects to receive (for example, from partial invoices that have not been paid yet).
   */
  @JsonProperty("accounts_documents_and_finance_leases_receivable")
  public double getAccountsDocumentsAndFinanceLeasesReceivable() {
    return accountsDocumentsAndFinanceLeasesReceivable;
  }

  /**
   * @return Total financial value of the company's sellable inventory.
   */
  @JsonProperty("inventory")
  public double getInventory() {
    return inventory;
  }

  /**
   * @return Total value of real estate, plant infrastructure, or equipment that has been purchased.
   */
  @JsonProperty("property_plant_and_equipment_investment_properties")
  public double getPropertyPlantAndEquipmentInvestmentProperties() {
    return propertyPlantAndEquipmentInvestmentProperties;
  }

  /**
   * @return Total gross equity.
   */
  @JsonProperty("total_gross_equity")
  public double getTotalGrossEquity() {
    return totalGrossEquity;
  }

  /**
   * @return Total debts that the company currently has.
   */
  @JsonProperty("debts")
  public double getDebts() {
    return debts;
  }

  /**
   * @return The total net equity of the company (<code>total_gross_equity</code> - <code>debts</code>).
   */
  @JsonProperty("total_net_equity")
  public double getTotalNetEquity() {
    return totalNetEquity;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof EquityStatementBusiness && equalTo((EquityStatementBusiness) other);
  }

  private boolean equalTo(EquityStatementBusiness other) {
    return cashAndCashEquivalents == other.cashAndCashEquivalents && investmentsAndDerivativeFinancialInstruments == other.investmentsAndDerivativeFinancialInstruments && accountsDocumentsAndFinanceLeasesReceivable == other.accountsDocumentsAndFinanceLeasesReceivable && inventory == other.inventory && propertyPlantAndEquipmentInvestmentProperties == other.propertyPlantAndEquipmentInvestmentProperties && totalGrossEquity == other.totalGrossEquity && debts == other.debts && totalNetEquity == other.totalNetEquity;
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.cashAndCashEquivalents, this.investmentsAndDerivativeFinancialInstruments, this.accountsDocumentsAndFinanceLeasesReceivable, this.inventory, this.propertyPlantAndEquipmentInvestmentProperties, this.totalGrossEquity, this.debts, this.totalNetEquity);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "EquityStatementBusiness{" + "cashAndCashEquivalents: " + cashAndCashEquivalents + ", investmentsAndDerivativeFinancialInstruments: " + investmentsAndDerivativeFinancialInstruments + ", accountsDocumentsAndFinanceLeasesReceivable: " + accountsDocumentsAndFinanceLeasesReceivable + ", inventory: " + inventory + ", propertyPlantAndEquipmentInvestmentProperties: " + propertyPlantAndEquipmentInvestmentProperties + ", totalGrossEquity: " + totalGrossEquity + ", debts: " + debts + ", totalNetEquity: " + totalNetEquity + "}";
  }

  public static CashAndCashEquivalentsStage builder() {
    return new Builder();
  }

  public interface CashAndCashEquivalentsStage {
    InvestmentsAndDerivativeFinancialInstrumentsStage cashAndCashEquivalents(
        double cashAndCashEquivalents);

    Builder from(EquityStatementBusiness other);
  }

  public interface InvestmentsAndDerivativeFinancialInstrumentsStage {
    AccountsDocumentsAndFinanceLeasesReceivableStage investmentsAndDerivativeFinancialInstruments(
        double investmentsAndDerivativeFinancialInstruments);
  }

  public interface AccountsDocumentsAndFinanceLeasesReceivableStage {
    InventoryStage accountsDocumentsAndFinanceLeasesReceivable(
        double accountsDocumentsAndFinanceLeasesReceivable);
  }

  public interface InventoryStage {
    PropertyPlantAndEquipmentInvestmentPropertiesStage inventory(double inventory);
  }

  public interface PropertyPlantAndEquipmentInvestmentPropertiesStage {
    TotalGrossEquityStage propertyPlantAndEquipmentInvestmentProperties(
        double propertyPlantAndEquipmentInvestmentProperties);
  }

  public interface TotalGrossEquityStage {
    DebtsStage totalGrossEquity(double totalGrossEquity);
  }

  public interface DebtsStage {
    TotalNetEquityStage debts(double debts);
  }

  public interface TotalNetEquityStage {
    _FinalStage totalNetEquity(double totalNetEquity);
  }

  public interface _FinalStage {
    EquityStatementBusiness build();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements CashAndCashEquivalentsStage, InvestmentsAndDerivativeFinancialInstrumentsStage, AccountsDocumentsAndFinanceLeasesReceivableStage, InventoryStage, PropertyPlantAndEquipmentInvestmentPropertiesStage, TotalGrossEquityStage, DebtsStage, TotalNetEquityStage, _FinalStage {
    private double cashAndCashEquivalents;

    private double investmentsAndDerivativeFinancialInstruments;

    private double accountsDocumentsAndFinanceLeasesReceivable;

    private double inventory;

    private double propertyPlantAndEquipmentInvestmentProperties;

    private double totalGrossEquity;

    private double debts;

    private double totalNetEquity;

    private Builder() {
    }

    @Override
    public Builder from(EquityStatementBusiness other) {
      cashAndCashEquivalents(other.getCashAndCashEquivalents());
      investmentsAndDerivativeFinancialInstruments(other.getInvestmentsAndDerivativeFinancialInstruments());
      accountsDocumentsAndFinanceLeasesReceivable(other.getAccountsDocumentsAndFinanceLeasesReceivable());
      inventory(other.getInventory());
      propertyPlantAndEquipmentInvestmentProperties(other.getPropertyPlantAndEquipmentInvestmentProperties());
      totalGrossEquity(other.getTotalGrossEquity());
      debts(other.getDebts());
      totalNetEquity(other.getTotalNetEquity());
      return this;
    }

    /**
     * <p>Total cash (or cash equivalents) that the business currently holds at the end of the fiscal year.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("cash_and_cash_equivalents")
    public InvestmentsAndDerivativeFinancialInstrumentsStage cashAndCashEquivalents(
        double cashAndCashEquivalents) {
      this.cashAndCashEquivalents = cashAndCashEquivalents;
      return this;
    }

    /**
     * <p>Total value of all investments, stocks, or similar, that the company has.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("investments_and_derivative_financial_instruments")
    public AccountsDocumentsAndFinanceLeasesReceivableStage investmentsAndDerivativeFinancialInstruments(
        double investmentsAndDerivativeFinancialInstruments) {
      this.investmentsAndDerivativeFinancialInstruments = investmentsAndDerivativeFinancialInstruments;
      return this;
    }

    /**
     * <p>Total of all payments the company expects to receive (for example, from partial invoices that have not been paid yet).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("accounts_documents_and_finance_leases_receivable")
    public InventoryStage accountsDocumentsAndFinanceLeasesReceivable(
        double accountsDocumentsAndFinanceLeasesReceivable) {
      this.accountsDocumentsAndFinanceLeasesReceivable = accountsDocumentsAndFinanceLeasesReceivable;
      return this;
    }

    /**
     * <p>Total financial value of the company's sellable inventory.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("inventory")
    public PropertyPlantAndEquipmentInvestmentPropertiesStage inventory(double inventory) {
      this.inventory = inventory;
      return this;
    }

    /**
     * <p>Total value of real estate, plant infrastructure, or equipment that has been purchased.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("property_plant_and_equipment_investment_properties")
    public TotalGrossEquityStage propertyPlantAndEquipmentInvestmentProperties(
        double propertyPlantAndEquipmentInvestmentProperties) {
      this.propertyPlantAndEquipmentInvestmentProperties = propertyPlantAndEquipmentInvestmentProperties;
      return this;
    }

    /**
     * <p>Total gross equity.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("total_gross_equity")
    public DebtsStage totalGrossEquity(double totalGrossEquity) {
      this.totalGrossEquity = totalGrossEquity;
      return this;
    }

    /**
     * <p>Total debts that the company currently has.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("debts")
    public TotalNetEquityStage debts(double debts) {
      this.debts = debts;
      return this;
    }

    /**
     * <p>The total net equity of the company (<code>total_gross_equity</code> - <code>debts</code>).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("total_net_equity")
    public _FinalStage totalNetEquity(double totalNetEquity) {
      this.totalNetEquity = totalNetEquity;
      return this;
    }

    @Override
    public EquityStatementBusiness build() {
      return new EquityStatementBusiness(cashAndCashEquivalents, investmentsAndDerivativeFinancialInstruments, accountsDocumentsAndFinanceLeasesReceivable, inventory, propertyPlantAndEquipmentInvestmentProperties, totalGrossEquity, debts, totalNetEquity);
    }
  }
}
