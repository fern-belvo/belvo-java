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
    builder = InvestmentsPortfolio.Builder.class
)
public final class InvestmentsPortfolio {
  private final Optional<String> id;

  private final String name;

  private final EnumInvestmentPortfolioType type;

  private final Optional<String> balanceType;

  private final Optional<Double> balanceGross;

  private final Optional<Double> balanceNet;

  private final String currency;

  private final Optional<List<Optional<InvestmentsPortfolioInstrument>>> instruments;

  private int _cachedHashCode;

  InvestmentsPortfolio(Optional<String> id, String name, EnumInvestmentPortfolioType type,
      Optional<String> balanceType, Optional<Double> balanceGross, Optional<Double> balanceNet,
      String currency, Optional<List<Optional<InvestmentsPortfolioInstrument>>> instruments) {
    this.id = id;
    this.name = name;
    this.type = type;
    this.balanceType = balanceType;
    this.balanceGross = balanceGross;
    this.balanceNet = balanceNet;
    this.currency = currency;
    this.instruments = instruments;
  }

  /**
   * @return Belvo's unique ID for the current portfolio.
   */
  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
  }

  /**
   * @return The name of the portfolio, as given in the institution.
   */
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("type")
  public EnumInvestmentPortfolioType getType() {
    return type;
  }

  /**
   * @return Indicates whether this account is either an <code>ASSET</code> or a <code>LIABILITY</code>. You can consider the balance of an <code>ASSET</code> as being positive, while the balance of a <code>LIABILITY</code> as negative.
   */
  @JsonProperty("balance_type")
  public Optional<String> getBalanceType() {
    return balanceType;
  }

  /**
   * @return The current gross total value of the entire portfolio and all its underlying instruments, as given by the institution.
   */
  @JsonProperty("balance_gross")
  public Optional<Double> getBalanceGross() {
    return balanceGross;
  }

  /**
   * @return The total current value of the entire portfolio and all its underlying instruments, as given by the institution.
   * <p>ℹ️ <strong>Note:</strong> In Brazil, this is usually calculated based on the net value (that is, not including tax).</p>
   */
  @JsonProperty("balance_net")
  public Optional<Double> getBalanceNet() {
    return balanceNet;
  }

  /**
   * @return The currency of the portfolio. For example:
   * <ul>
   * <li>🇧🇷 BRL (Brazilian Real)</li>
   * <li>🇨🇴 COP (Colombian Peso)</li>
   * <li>🇲🇽 MXN (Mexican Peso)</li>
   * </ul>
   * <p>Please note that other currencies other than in the list above may be returned.</p>
   */
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }

  /**
   * @return An array of instruments that fall into the investment portfolio.
   */
  @JsonProperty("instruments")
  public Optional<List<Optional<InvestmentsPortfolioInstrument>>> getInstruments() {
    return instruments;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof InvestmentsPortfolio && equalTo((InvestmentsPortfolio) other);
  }

  private boolean equalTo(InvestmentsPortfolio other) {
    return id.equals(other.id) && name.equals(other.name) && type.equals(other.type) && balanceType.equals(other.balanceType) && balanceGross.equals(other.balanceGross) && balanceNet.equals(other.balanceNet) && currency.equals(other.currency) && instruments.equals(other.instruments);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.id, this.name, this.type, this.balanceType, this.balanceGross, this.balanceNet, this.currency, this.instruments);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "InvestmentsPortfolio{" + "id: " + id + ", name: " + name + ", type: " + type + ", balanceType: " + balanceType + ", balanceGross: " + balanceGross + ", balanceNet: " + balanceNet + ", currency: " + currency + ", instruments: " + instruments + "}";
  }

  public static NameStage builder() {
    return new Builder();
  }

  public interface NameStage {
    TypeStage name(String name);

    Builder from(InvestmentsPortfolio other);
  }

  public interface TypeStage {
    CurrencyStage type(EnumInvestmentPortfolioType type);
  }

  public interface CurrencyStage {
    _FinalStage currency(String currency);
  }

  public interface _FinalStage {
    InvestmentsPortfolio build();

    _FinalStage id(Optional<String> id);

    _FinalStage id(String id);

    _FinalStage balanceType(Optional<String> balanceType);

    _FinalStage balanceType(String balanceType);

    _FinalStage balanceGross(Optional<Double> balanceGross);

    _FinalStage balanceGross(Double balanceGross);

    _FinalStage balanceNet(Optional<Double> balanceNet);

    _FinalStage balanceNet(Double balanceNet);

    _FinalStage instruments(Optional<List<Optional<InvestmentsPortfolioInstrument>>> instruments);

    _FinalStage instruments(List<Optional<InvestmentsPortfolioInstrument>> instruments);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements NameStage, TypeStage, CurrencyStage, _FinalStage {
    private String name;

    private EnumInvestmentPortfolioType type;

    private String currency;

    private Optional<List<Optional<InvestmentsPortfolioInstrument>>> instruments = Optional.empty();

    private Optional<Double> balanceNet = Optional.empty();

    private Optional<Double> balanceGross = Optional.empty();

    private Optional<String> balanceType = Optional.empty();

    private Optional<String> id = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(InvestmentsPortfolio other) {
      id(other.getId());
      name(other.getName());
      type(other.getType());
      balanceType(other.getBalanceType());
      balanceGross(other.getBalanceGross());
      balanceNet(other.getBalanceNet());
      currency(other.getCurrency());
      instruments(other.getInstruments());
      return this;
    }

    /**
     * <p>The name of the portfolio, as given in the institution.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("name")
    public TypeStage name(String name) {
      this.name = name;
      return this;
    }

    @Override
    @JsonSetter("type")
    public CurrencyStage type(EnumInvestmentPortfolioType type) {
      this.type = type;
      return this;
    }

    /**
     * <p>The currency of the portfolio. For example:</p>
     * <ul>
     * <li>🇧🇷 BRL (Brazilian Real)</li>
     * <li>🇨🇴 COP (Colombian Peso)</li>
     * <li>🇲🇽 MXN (Mexican Peso)</li>
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
     * <p>An array of instruments that fall into the investment portfolio.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage instruments(List<Optional<InvestmentsPortfolioInstrument>> instruments) {
      this.instruments = Optional.of(instruments);
      return this;
    }

    @Override
    @JsonSetter(
        value = "instruments",
        nulls = Nulls.SKIP
    )
    public _FinalStage instruments(
        Optional<List<Optional<InvestmentsPortfolioInstrument>>> instruments) {
      this.instruments = instruments;
      return this;
    }

    /**
     * <p>The total current value of the entire portfolio and all its underlying instruments, as given by the institution.</p>
     * <p>ℹ️ <strong>Note:</strong> In Brazil, this is usually calculated based on the net value (that is, not including tax).</p>
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
     * <p>The current gross total value of the entire portfolio and all its underlying instruments, as given by the institution.</p>
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
     * <p>Indicates whether this account is either an <code>ASSET</code> or a <code>LIABILITY</code>. You can consider the balance of an <code>ASSET</code> as being positive, while the balance of a <code>LIABILITY</code> as negative.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage balanceType(String balanceType) {
      this.balanceType = Optional.of(balanceType);
      return this;
    }

    @Override
    @JsonSetter(
        value = "balance_type",
        nulls = Nulls.SKIP
    )
    public _FinalStage balanceType(Optional<String> balanceType) {
      this.balanceType = balanceType;
      return this;
    }

    /**
     * <p>Belvo's unique ID for the current portfolio.</p>
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
    public InvestmentsPortfolio build() {
      return new InvestmentsPortfolio(id, name, type, balanceType, balanceGross, balanceNet, currency, instruments);
    }
  }
}
