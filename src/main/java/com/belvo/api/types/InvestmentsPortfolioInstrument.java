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
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = InvestmentsPortfolioInstrument.Builder.class
)
public final class InvestmentsPortfolioInstrument {
  private final Optional<String> id;

  private final Optional<List<InvestmentsPortfolioInstrumentPublicId>> publicId;

  private final EnumInvestmentPortfolioInstrumentType type;

  private final Optional<String> subtype;

  private final String name;

  private final String currency;

  private final Optional<Double> price;

  private final Optional<Double> quantity;

  private final Optional<Double> balanceGross;

  private final Optional<Double> balanceNet;

  private final Optional<Double> averageAcquisitionPrice;

  private final Optional<Double> profit;

  private final Optional<String> openDate;

  private final Optional<List<InvestmentsPortfolioInstrumentRedemptionConditions>> redemptionConditions;

  private final Optional<List<InvestmentsPortfolioInstrumentFees>> fees;

  private final Optional<List<InvestmentsPortfolioInstrumentInterestRate>> interestRates;

  private int _cachedHashCode;

  InvestmentsPortfolioInstrument(Optional<String> id,
      Optional<List<InvestmentsPortfolioInstrumentPublicId>> publicId,
      EnumInvestmentPortfolioInstrumentType type, Optional<String> subtype, String name,
      String currency, Optional<Double> price, Optional<Double> quantity,
      Optional<Double> balanceGross, Optional<Double> balanceNet,
      Optional<Double> averageAcquisitionPrice, Optional<Double> profit, Optional<String> openDate,
      Optional<List<InvestmentsPortfolioInstrumentRedemptionConditions>> redemptionConditions,
      Optional<List<InvestmentsPortfolioInstrumentFees>> fees,
      Optional<List<InvestmentsPortfolioInstrumentInterestRate>> interestRates) {
    this.id = id;
    this.publicId = publicId;
    this.type = type;
    this.subtype = subtype;
    this.name = name;
    this.currency = currency;
    this.price = price;
    this.quantity = quantity;
    this.balanceGross = balanceGross;
    this.balanceNet = balanceNet;
    this.averageAcquisitionPrice = averageAcquisitionPrice;
    this.profit = profit;
    this.openDate = openDate;
    this.redemptionConditions = redemptionConditions;
    this.fees = fees;
    this.interestRates = interestRates;
  }

  /**
   * @return Belvo's unique ID for the current instrument.
   */
  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
  }

  /**
   * @return The public identifiers for the instrument.
   */
  @JsonProperty("public_id")
  public Optional<List<InvestmentsPortfolioInstrumentPublicId>> getPublicId() {
    return publicId;
  }

  @JsonProperty("type")
  public EnumInvestmentPortfolioInstrumentType getType() {
    return type;
  }

  /**
   * @return The subtype for the instrument, as given by the institution.
   */
  @JsonProperty("subtype")
  public Optional<String> getSubtype() {
    return subtype;
  }

  /**
   * @return The name of the instrument, as given by the institution.
   */
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * @return The currency of the instrument. For example:
   * <ul>
   * <li>🇧🇷 BRL (Brazilian Real)</li>
   * <li>🇨🇴 COP (Colombian Peso)</li>
   * <li>🇲🇽 MXN (Mexican Peso)</li>
   * <li>🇺🇸 USD (US Dollar)</li>
   * </ul>
   * <p>Please note that other currencies other than in the list above may be returned.</p>
   */
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }

  /**
   * @return The current price of one share in the instrument.
   */
  @JsonProperty("price")
  public Optional<Double> getPrice() {
    return price;
  }

  /**
   * @return The total amount of shares owned in the instrument.
   */
  @JsonProperty("quantity")
  public Optional<Double> getQuantity() {
    return quantity;
  }

  /**
   * @return The total gross value of the instrument (including taxes).
   */
  @JsonProperty("balance_gross")
  public Optional<Double> getBalanceGross() {
    return balanceGross;
  }

  /**
   * @return The total net value of the instrument (excluding taxes).
   */
  @JsonProperty("balance_net")
  public Optional<Double> getBalanceNet() {
    return balanceNet;
  }

  /**
   * @return The average price of each share acquired in the instrument.
   */
  @JsonProperty("average_acquisition_price")
  public Optional<Double> getAverageAcquisitionPrice() {
    return averageAcquisitionPrice;
  }

  /**
   * @return The current profit earned in the instrument.
   */
  @JsonProperty("profit")
  public Optional<Double> getProfit() {
    return profit;
  }

  /**
   * @return The start date of the instrument. Only applicable for instruments of type <code>bond</code> or <code>savings</code>.
   */
  @JsonProperty("open_date")
  public Optional<String> getOpenDate() {
    return openDate;
  }

  /**
   * @return An array of conditions that apply to the instrument in order to retrieve the final value.
   * <p>For example, the due date, the liquidity date, the previdencia type, and so on.</p>
   */
  @JsonProperty("redemption_conditions")
  public Optional<List<InvestmentsPortfolioInstrumentRedemptionConditions>> getRedemptionConditions(
      ) {
    return redemptionConditions;
  }

  /**
   * @return An array of fees that apply to the instrument.
   */
  @JsonProperty("fees")
  public Optional<List<InvestmentsPortfolioInstrumentFees>> getFees() {
    return fees;
  }

  /**
   * @return An array of interest rates that apply to the instrument.
   */
  @JsonProperty("interest_rates")
  public Optional<List<InvestmentsPortfolioInstrumentInterestRate>> getInterestRates() {
    return interestRates;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof InvestmentsPortfolioInstrument && equalTo((InvestmentsPortfolioInstrument) other);
  }

  private boolean equalTo(InvestmentsPortfolioInstrument other) {
    return id.equals(other.id) && publicId.equals(other.publicId) && type.equals(other.type) && subtype.equals(other.subtype) && name.equals(other.name) && currency.equals(other.currency) && price.equals(other.price) && quantity.equals(other.quantity) && balanceGross.equals(other.balanceGross) && balanceNet.equals(other.balanceNet) && averageAcquisitionPrice.equals(other.averageAcquisitionPrice) && profit.equals(other.profit) && openDate.equals(other.openDate) && redemptionConditions.equals(other.redemptionConditions) && fees.equals(other.fees) && interestRates.equals(other.interestRates);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.id, this.publicId, this.type, this.subtype, this.name, this.currency, this.price, this.quantity, this.balanceGross, this.balanceNet, this.averageAcquisitionPrice, this.profit, this.openDate, this.redemptionConditions, this.fees, this.interestRates);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "InvestmentsPortfolioInstrument{" + "id: " + id + ", publicId: " + publicId + ", type: " + type + ", subtype: " + subtype + ", name: " + name + ", currency: " + currency + ", price: " + price + ", quantity: " + quantity + ", balanceGross: " + balanceGross + ", balanceNet: " + balanceNet + ", averageAcquisitionPrice: " + averageAcquisitionPrice + ", profit: " + profit + ", openDate: " + openDate + ", redemptionConditions: " + redemptionConditions + ", fees: " + fees + ", interestRates: " + interestRates + "}";
  }

  public static TypeStage builder() {
    return new Builder();
  }

  public interface TypeStage {
    NameStage type(EnumInvestmentPortfolioInstrumentType type);

    Builder from(InvestmentsPortfolioInstrument other);
  }

  public interface NameStage {
    CurrencyStage name(String name);
  }

  public interface CurrencyStage {
    _FinalStage currency(String currency);
  }

  public interface _FinalStage {
    InvestmentsPortfolioInstrument build();

    _FinalStage id(Optional<String> id);

    _FinalStage id(String id);

    _FinalStage publicId(Optional<List<InvestmentsPortfolioInstrumentPublicId>> publicId);

    _FinalStage publicId(List<InvestmentsPortfolioInstrumentPublicId> publicId);

    _FinalStage subtype(Optional<String> subtype);

    _FinalStage subtype(String subtype);

    _FinalStage price(Optional<Double> price);

    _FinalStage price(Double price);

    _FinalStage quantity(Optional<Double> quantity);

    _FinalStage quantity(Double quantity);

    _FinalStage balanceGross(Optional<Double> balanceGross);

    _FinalStage balanceGross(Double balanceGross);

    _FinalStage balanceNet(Optional<Double> balanceNet);

    _FinalStage balanceNet(Double balanceNet);

    _FinalStage averageAcquisitionPrice(Optional<Double> averageAcquisitionPrice);

    _FinalStage averageAcquisitionPrice(Double averageAcquisitionPrice);

    _FinalStage profit(Optional<Double> profit);

    _FinalStage profit(Double profit);

    _FinalStage openDate(Optional<String> openDate);

    _FinalStage openDate(String openDate);

    _FinalStage redemptionConditions(
        Optional<List<InvestmentsPortfolioInstrumentRedemptionConditions>> redemptionConditions);

    _FinalStage redemptionConditions(
        List<InvestmentsPortfolioInstrumentRedemptionConditions> redemptionConditions);

    _FinalStage fees(Optional<List<InvestmentsPortfolioInstrumentFees>> fees);

    _FinalStage fees(List<InvestmentsPortfolioInstrumentFees> fees);

    _FinalStage interestRates(
        Optional<List<InvestmentsPortfolioInstrumentInterestRate>> interestRates);

    _FinalStage interestRates(List<InvestmentsPortfolioInstrumentInterestRate> interestRates);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements TypeStage, NameStage, CurrencyStage, _FinalStage {
    private EnumInvestmentPortfolioInstrumentType type;

    private String name;

    private String currency;

    private Optional<List<InvestmentsPortfolioInstrumentInterestRate>> interestRates = Optional.empty();

    private Optional<List<InvestmentsPortfolioInstrumentFees>> fees = Optional.empty();

    private Optional<List<InvestmentsPortfolioInstrumentRedemptionConditions>> redemptionConditions = Optional.empty();

    private Optional<String> openDate = Optional.empty();

    private Optional<Double> profit = Optional.empty();

    private Optional<Double> averageAcquisitionPrice = Optional.empty();

    private Optional<Double> balanceNet = Optional.empty();

    private Optional<Double> balanceGross = Optional.empty();

    private Optional<Double> quantity = Optional.empty();

    private Optional<Double> price = Optional.empty();

    private Optional<String> subtype = Optional.empty();

    private Optional<List<InvestmentsPortfolioInstrumentPublicId>> publicId = Optional.empty();

    private Optional<String> id = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(InvestmentsPortfolioInstrument other) {
      id(other.getId());
      publicId(other.getPublicId());
      type(other.getType());
      subtype(other.getSubtype());
      name(other.getName());
      currency(other.getCurrency());
      price(other.getPrice());
      quantity(other.getQuantity());
      balanceGross(other.getBalanceGross());
      balanceNet(other.getBalanceNet());
      averageAcquisitionPrice(other.getAverageAcquisitionPrice());
      profit(other.getProfit());
      openDate(other.getOpenDate());
      redemptionConditions(other.getRedemptionConditions());
      fees(other.getFees());
      interestRates(other.getInterestRates());
      return this;
    }

    @Override
    @JsonSetter("type")
    public NameStage type(EnumInvestmentPortfolioInstrumentType type) {
      this.type = type;
      return this;
    }

    /**
     * <p>The name of the instrument, as given by the institution.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("name")
    public CurrencyStage name(String name) {
      this.name = name;
      return this;
    }

    /**
     * <p>The currency of the instrument. For example:</p>
     * <ul>
     * <li>🇧🇷 BRL (Brazilian Real)</li>
     * <li>🇨🇴 COP (Colombian Peso)</li>
     * <li>🇲🇽 MXN (Mexican Peso)</li>
     * <li>🇺🇸 USD (US Dollar)</li>
     * </ul>
     * <p>Please note that other currencies other than in the list above may be returned.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("currency")
    public _FinalStage currency(String currency) {
      this.currency = currency;
      return this;
    }

    /**
     * <p>An array of interest rates that apply to the instrument.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage interestRates(
        List<InvestmentsPortfolioInstrumentInterestRate> interestRates) {
      this.interestRates = Optional.of(interestRates);
      return this;
    }

    @Override
    @JsonSetter(
        value = "interest_rates",
        nulls = Nulls.SKIP
    )
    public _FinalStage interestRates(
        Optional<List<InvestmentsPortfolioInstrumentInterestRate>> interestRates) {
      this.interestRates = interestRates;
      return this;
    }

    /**
     * <p>An array of fees that apply to the instrument.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage fees(List<InvestmentsPortfolioInstrumentFees> fees) {
      this.fees = Optional.of(fees);
      return this;
    }

    @Override
    @JsonSetter(
        value = "fees",
        nulls = Nulls.SKIP
    )
    public _FinalStage fees(Optional<List<InvestmentsPortfolioInstrumentFees>> fees) {
      this.fees = fees;
      return this;
    }

    /**
     * <p>An array of conditions that apply to the instrument in order to retrieve the final value.</p>
     * <p>For example, the due date, the liquidity date, the previdencia type, and so on.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage redemptionConditions(
        List<InvestmentsPortfolioInstrumentRedemptionConditions> redemptionConditions) {
      this.redemptionConditions = Optional.of(redemptionConditions);
      return this;
    }

    @Override
    @JsonSetter(
        value = "redemption_conditions",
        nulls = Nulls.SKIP
    )
    public _FinalStage redemptionConditions(
        Optional<List<InvestmentsPortfolioInstrumentRedemptionConditions>> redemptionConditions) {
      this.redemptionConditions = redemptionConditions;
      return this;
    }

    /**
     * <p>The start date of the instrument. Only applicable for instruments of type <code>bond</code> or <code>savings</code>.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage openDate(String openDate) {
      this.openDate = Optional.of(openDate);
      return this;
    }

    @Override
    @JsonSetter(
        value = "open_date",
        nulls = Nulls.SKIP
    )
    public _FinalStage openDate(Optional<String> openDate) {
      this.openDate = openDate;
      return this;
    }

    /**
     * <p>The current profit earned in the instrument.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage profit(Double profit) {
      this.profit = Optional.of(profit);
      return this;
    }

    @Override
    @JsonSetter(
        value = "profit",
        nulls = Nulls.SKIP
    )
    public _FinalStage profit(Optional<Double> profit) {
      this.profit = profit;
      return this;
    }

    /**
     * <p>The average price of each share acquired in the instrument.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage averageAcquisitionPrice(Double averageAcquisitionPrice) {
      this.averageAcquisitionPrice = Optional.of(averageAcquisitionPrice);
      return this;
    }

    @Override
    @JsonSetter(
        value = "average_acquisition_price",
        nulls = Nulls.SKIP
    )
    public _FinalStage averageAcquisitionPrice(Optional<Double> averageAcquisitionPrice) {
      this.averageAcquisitionPrice = averageAcquisitionPrice;
      return this;
    }

    /**
     * <p>The total net value of the instrument (excluding taxes).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage balanceNet(Double balanceNet) {
      this.balanceNet = Optional.of(balanceNet);
      return this;
    }

    @Override
    @JsonSetter(
        value = "balance_net",
        nulls = Nulls.SKIP
    )
    public _FinalStage balanceNet(Optional<Double> balanceNet) {
      this.balanceNet = balanceNet;
      return this;
    }

    /**
     * <p>The total gross value of the instrument (including taxes).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage balanceGross(Double balanceGross) {
      this.balanceGross = Optional.of(balanceGross);
      return this;
    }

    @Override
    @JsonSetter(
        value = "balance_gross",
        nulls = Nulls.SKIP
    )
    public _FinalStage balanceGross(Optional<Double> balanceGross) {
      this.balanceGross = balanceGross;
      return this;
    }

    /**
     * <p>The total amount of shares owned in the instrument.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage quantity(Double quantity) {
      this.quantity = Optional.of(quantity);
      return this;
    }

    @Override
    @JsonSetter(
        value = "quantity",
        nulls = Nulls.SKIP
    )
    public _FinalStage quantity(Optional<Double> quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * <p>The current price of one share in the instrument.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage price(Double price) {
      this.price = Optional.of(price);
      return this;
    }

    @Override
    @JsonSetter(
        value = "price",
        nulls = Nulls.SKIP
    )
    public _FinalStage price(Optional<Double> price) {
      this.price = price;
      return this;
    }

    /**
     * <p>The subtype for the instrument, as given by the institution.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage subtype(String subtype) {
      this.subtype = Optional.of(subtype);
      return this;
    }

    @Override
    @JsonSetter(
        value = "subtype",
        nulls = Nulls.SKIP
    )
    public _FinalStage subtype(Optional<String> subtype) {
      this.subtype = subtype;
      return this;
    }

    /**
     * <p>The public identifiers for the instrument.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage publicId(List<InvestmentsPortfolioInstrumentPublicId> publicId) {
      this.publicId = Optional.of(publicId);
      return this;
    }

    @Override
    @JsonSetter(
        value = "public_id",
        nulls = Nulls.SKIP
    )
    public _FinalStage publicId(Optional<List<InvestmentsPortfolioInstrumentPublicId>> publicId) {
      this.publicId = publicId;
      return this;
    }

    /**
     * <p>Belvo's unique ID for the current instrument.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage id(String id) {
      this.id = Optional.of(id);
      return this;
    }

    @Override
    @JsonSetter(
        value = "id",
        nulls = Nulls.SKIP
    )
    public _FinalStage id(Optional<String> id) {
      this.id = id;
      return this;
    }

    @Override
    public InvestmentsPortfolioInstrument build() {
      return new InvestmentsPortfolioInstrument(id, publicId, type, subtype, name, currency, price, quantity, balanceGross, balanceNet, averageAcquisitionPrice, profit, openDate, redemptionConditions, fees, interestRates);
    }
  }
}
