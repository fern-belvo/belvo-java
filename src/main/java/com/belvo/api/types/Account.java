package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = Account.Builder.class
)
public final class Account {
  private final Optional<String> id;

  private final Optional<String> link;

  private final Optional<InstitutionAccount> institution;

  private final String collectedAt;

  private final Optional<String> createdAt;

  private final Optional<String> category;

  private final Optional<String> balanceType;

  private final Optional<String> type;

  private final Optional<String> name;

  private final Optional<String> number;

  private final AccountsBalance balance;

  private final Optional<String> currency;

  private final Optional<String> publicIdentificationName;

  private final Optional<String> publicIdentificationValue;

  private final Optional<String> lastAccessedAt;

  private final Optional<AccountsCreditData> creditData;

  private final Optional<AccountsLoanData> loanData;

  private final Optional<List<AccountsFundsData>> fundsData;

  private final Optional<AccountsReceivablesData> receivablesData;

  private final Optional<String> bankProductId;

  private final Optional<String> internalIdentification;

  private int _cachedHashCode;

  Account(Optional<String> id, Optional<String> link, Optional<InstitutionAccount> institution,
      String collectedAt, Optional<String> createdAt, Optional<String> category,
      Optional<String> balanceType, Optional<String> type, Optional<String> name,
      Optional<String> number, AccountsBalance balance, Optional<String> currency,
      Optional<String> publicIdentificationName, Optional<String> publicIdentificationValue,
      Optional<String> lastAccessedAt, Optional<AccountsCreditData> creditData,
      Optional<AccountsLoanData> loanData, Optional<List<AccountsFundsData>> fundsData,
      Optional<AccountsReceivablesData> receivablesData, Optional<String> bankProductId,
      Optional<String> internalIdentification) {
    this.id = id;
    this.link = link;
    this.institution = institution;
    this.collectedAt = collectedAt;
    this.createdAt = createdAt;
    this.category = category;
    this.balanceType = balanceType;
    this.type = type;
    this.name = name;
    this.number = number;
    this.balance = balance;
    this.currency = currency;
    this.publicIdentificationName = publicIdentificationName;
    this.publicIdentificationValue = publicIdentificationValue;
    this.lastAccessedAt = lastAccessedAt;
    this.creditData = creditData;
    this.loanData = loanData;
    this.fundsData = fundsData;
    this.receivablesData = receivablesData;
    this.bankProductId = bankProductId;
    this.internalIdentification = internalIdentification;
  }

  /**
   * @return The unique identifier created by Belvo used to reference the current account.
   */
  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
  }

  /**
   * @return The <code>link.id</code> the account belongs to.
   */
  @JsonProperty("link")
  public Optional<String> getLink() {
    return link;
  }

  @JsonProperty("institution")
  public Optional<InstitutionAccount> getInstitution() {
    return institution;
  }

  /**
   * @return The ISO-8601 timestamp when the data point was collected.
   */
  @JsonProperty("collected_at")
  public String getCollectedAt() {
    return collectedAt;
  }

  /**
   * @return The ISO-8601 timestamp of when the data point was last updated in Belvo's database.
   */
  @JsonProperty("created_at")
  public Optional<String> getCreatedAt() {
    return createdAt;
  }

  @JsonProperty("category")
  public Optional<String> getCategory() {
    return category;
  }

  /**
   * @return Indicates whether this account is either an <code>ASSET</code> or a <code>LIABILITY</code>. You can consider the balance of an <code>ASSET</code> as being positive, while the balance of a <code>LIABILITY</code> as negative.
   */
  @JsonProperty("balance_type")
  public Optional<String> getBalanceType() {
    return balanceType;
  }

  /**
   * @return The account type, as designated by the institution.
   */
  @JsonProperty("type")
  public Optional<String> getType() {
    return type;
  }

  /**
   * @return The account name, as given by the institution.
   */
  @JsonProperty("name")
  public Optional<String> getName() {
    return name;
  }

  /**
   * @return The account number, as designated by the institution.
   */
  @JsonProperty("number")
  public Optional<String> getNumber() {
    return number;
  }

  @JsonProperty("balance")
  public AccountsBalance getBalance() {
    return balance;
  }

  /**
   * @return The currency of the account. For example:
   * <ul>
   * <li>🇧🇷 BRL (Brazilian Real)</li>
   * <li>🇨🇴 COP (Colombian Peso)</li>
   * <li>🇲🇽 MXN (Mexican Peso)</li>
   * </ul>
   * <p>Please note that other currencies other than in the list above may be returned.</p>
   */
  @JsonProperty("currency")
  public Optional<String> getCurrency() {
    return currency;
  }

  /**
   * @return The public name for the type of identification. For example: <code>&quot;CLABE&quot;</code>.
   * <p>ℹ️ For 🇧🇷 Brazilian savings and checking accounts, this field will be <code>AGENCY/ACCOUNT</code>.</p>
   */
  @JsonProperty("public_identification_name")
  public Optional<String> getPublicIdentificationName() {
    return publicIdentificationName;
  }

  /**
   * @return The value for the <code>public_identification_name</code>.
   * <p>ℹ️ For 🇧🇷 Brazilian savings and checking accounts, this field will be the agency and bank account number, separated by a slash.
   * For example: <code>0444/45722-0</code>.</p>
   */
  @JsonProperty("public_identification_value")
  public Optional<String> getPublicIdentificationValue() {
    return publicIdentificationValue;
  }

  /**
   * @return The ISO-8601 timestamp of Belvo's most recent successful access to the institution for the given link.
   */
  @JsonProperty("last_accessed_at")
  public Optional<String> getLastAccessedAt() {
    return lastAccessedAt;
  }

  @JsonProperty("credit_data")
  public Optional<AccountsCreditData> getCreditData() {
    return creditData;
  }

  @JsonProperty("loan_data")
  public Optional<AccountsLoanData> getLoanData() {
    return loanData;
  }

  /**
   * @return One or more funds that contribute to the the pension account.
   */
  @JsonProperty("funds_data")
  public Optional<List<AccountsFundsData>> getFundsData() {
    return fundsData;
  }

  @JsonProperty("receivables_data")
  public Optional<AccountsReceivablesData> getReceivablesData() {
    return receivablesData;
  }

  /**
   * @return <em>This field has been deprecated.</em>
   * <p><em>The institution's product ID for the account type.</em></p>
   */
  @JsonProperty("bank_product_id")
  public Optional<String> getBankProductId() {
    return bankProductId;
  }

  /**
   * @return <em>This field has been deprecated.</em>
   * <p><em>The institution's internal identification for the account.</em></p>
   */
  @JsonProperty("internal_identification")
  public Optional<String> getInternalIdentification() {
    return internalIdentification;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof Account && equalTo((Account) other);
  }

  private boolean equalTo(Account other) {
    return id.equals(other.id) && link.equals(other.link) && institution.equals(other.institution) && collectedAt.equals(other.collectedAt) && createdAt.equals(other.createdAt) && category.equals(other.category) && balanceType.equals(other.balanceType) && type.equals(other.type) && name.equals(other.name) && number.equals(other.number) && balance.equals(other.balance) && currency.equals(other.currency) && publicIdentificationName.equals(other.publicIdentificationName) && publicIdentificationValue.equals(other.publicIdentificationValue) && lastAccessedAt.equals(other.lastAccessedAt) && creditData.equals(other.creditData) && loanData.equals(other.loanData) && fundsData.equals(other.fundsData) && receivablesData.equals(other.receivablesData) && bankProductId.equals(other.bankProductId) && internalIdentification.equals(other.internalIdentification);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.id, this.link, this.institution, this.collectedAt, this.createdAt, this.category, this.balanceType, this.type, this.name, this.number, this.balance, this.currency, this.publicIdentificationName, this.publicIdentificationValue, this.lastAccessedAt, this.creditData, this.loanData, this.fundsData, this.receivablesData, this.bankProductId, this.internalIdentification);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "Account{" + "id: " + id + ", link: " + link + ", institution: " + institution + ", collectedAt: " + collectedAt + ", createdAt: " + createdAt + ", category: " + category + ", balanceType: " + balanceType + ", type: " + type + ", name: " + name + ", number: " + number + ", balance: " + balance + ", currency: " + currency + ", publicIdentificationName: " + publicIdentificationName + ", publicIdentificationValue: " + publicIdentificationValue + ", lastAccessedAt: " + lastAccessedAt + ", creditData: " + creditData + ", loanData: " + loanData + ", fundsData: " + fundsData + ", receivablesData: " + receivablesData + ", bankProductId: " + bankProductId + ", internalIdentification: " + internalIdentification + "}";
  }

  public static CollectedAtStage builder() {
    return new Builder();
  }

  public interface CollectedAtStage {
    BalanceStage collectedAt(String collectedAt);

    Builder from(Account other);
  }

  public interface BalanceStage {
    _FinalStage balance(AccountsBalance balance);
  }

  public interface _FinalStage {
    Account build();

    _FinalStage id(Optional<String> id);

    _FinalStage id(String id);

    _FinalStage link(Optional<String> link);

    _FinalStage link(String link);

    _FinalStage institution(Optional<InstitutionAccount> institution);

    _FinalStage institution(InstitutionAccount institution);

    _FinalStage createdAt(Optional<String> createdAt);

    _FinalStage createdAt(String createdAt);

    _FinalStage category(Optional<String> category);

    _FinalStage category(String category);

    _FinalStage balanceType(Optional<String> balanceType);

    _FinalStage balanceType(String balanceType);

    _FinalStage type(Optional<String> type);

    _FinalStage type(String type);

    _FinalStage name(Optional<String> name);

    _FinalStage name(String name);

    _FinalStage number(Optional<String> number);

    _FinalStage number(String number);

    _FinalStage currency(Optional<String> currency);

    _FinalStage currency(String currency);

    _FinalStage publicIdentificationName(Optional<String> publicIdentificationName);

    _FinalStage publicIdentificationName(String publicIdentificationName);

    _FinalStage publicIdentificationValue(Optional<String> publicIdentificationValue);

    _FinalStage publicIdentificationValue(String publicIdentificationValue);

    _FinalStage lastAccessedAt(Optional<String> lastAccessedAt);

    _FinalStage lastAccessedAt(String lastAccessedAt);

    _FinalStage creditData(Optional<AccountsCreditData> creditData);

    _FinalStage creditData(AccountsCreditData creditData);

    _FinalStage loanData(Optional<AccountsLoanData> loanData);

    _FinalStage loanData(AccountsLoanData loanData);

    _FinalStage fundsData(Optional<List<AccountsFundsData>> fundsData);

    _FinalStage fundsData(List<AccountsFundsData> fundsData);

    _FinalStage receivablesData(Optional<AccountsReceivablesData> receivablesData);

    _FinalStage receivablesData(AccountsReceivablesData receivablesData);

    _FinalStage bankProductId(Optional<String> bankProductId);

    _FinalStage bankProductId(String bankProductId);

    _FinalStage internalIdentification(Optional<String> internalIdentification);

    _FinalStage internalIdentification(String internalIdentification);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements CollectedAtStage, BalanceStage, _FinalStage {
    private String collectedAt;

    private AccountsBalance balance;

    private Optional<String> internalIdentification = Optional.empty();

    private Optional<String> bankProductId = Optional.empty();

    private Optional<AccountsReceivablesData> receivablesData = Optional.empty();

    private Optional<List<AccountsFundsData>> fundsData = Optional.empty();

    private Optional<AccountsLoanData> loanData = Optional.empty();

    private Optional<AccountsCreditData> creditData = Optional.empty();

    private Optional<String> lastAccessedAt = Optional.empty();

    private Optional<String> publicIdentificationValue = Optional.empty();

    private Optional<String> publicIdentificationName = Optional.empty();

    private Optional<String> currency = Optional.empty();

    private Optional<String> number = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Optional<String> type = Optional.empty();

    private Optional<String> balanceType = Optional.empty();

    private Optional<String> category = Optional.empty();

    private Optional<String> createdAt = Optional.empty();

    private Optional<InstitutionAccount> institution = Optional.empty();

    private Optional<String> link = Optional.empty();

    private Optional<String> id = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(Account other) {
      id(other.getId());
      link(other.getLink());
      institution(other.getInstitution());
      collectedAt(other.getCollectedAt());
      createdAt(other.getCreatedAt());
      category(other.getCategory());
      balanceType(other.getBalanceType());
      type(other.getType());
      name(other.getName());
      number(other.getNumber());
      balance(other.getBalance());
      currency(other.getCurrency());
      publicIdentificationName(other.getPublicIdentificationName());
      publicIdentificationValue(other.getPublicIdentificationValue());
      lastAccessedAt(other.getLastAccessedAt());
      creditData(other.getCreditData());
      loanData(other.getLoanData());
      fundsData(other.getFundsData());
      receivablesData(other.getReceivablesData());
      bankProductId(other.getBankProductId());
      internalIdentification(other.getInternalIdentification());
      return this;
    }

    /**
     * <p>The ISO-8601 timestamp when the data point was collected.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("collected_at")
    public BalanceStage collectedAt(String collectedAt) {
      this.collectedAt = collectedAt;
      return this;
    }

    @Override
    @JsonSetter("balance")
    public _FinalStage balance(AccountsBalance balance) {
      this.balance = balance;
      return this;
    }

    /**
     * <p><em>This field has been deprecated.</em></p>
     * <p><em>The institution's internal identification for the account.</em></p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage internalIdentification(String internalIdentification) {
      this.internalIdentification = Optional.of(internalIdentification);
      return this;
    }

    @Override
    @JsonSetter(
        value = "internal_identification",
        nulls = Nulls.SKIP
    )
    public _FinalStage internalIdentification(Optional<String> internalIdentification) {
      this.internalIdentification = internalIdentification;
      return this;
    }

    /**
     * <p><em>This field has been deprecated.</em></p>
     * <p><em>The institution's product ID for the account type.</em></p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage bankProductId(String bankProductId) {
      this.bankProductId = Optional.of(bankProductId);
      return this;
    }

    @Override
    @JsonSetter(
        value = "bank_product_id",
        nulls = Nulls.SKIP
    )
    public _FinalStage bankProductId(Optional<String> bankProductId) {
      this.bankProductId = bankProductId;
      return this;
    }

    @Override
    public _FinalStage receivablesData(AccountsReceivablesData receivablesData) {
      this.receivablesData = Optional.of(receivablesData);
      return this;
    }

    @Override
    @JsonSetter(
        value = "receivables_data",
        nulls = Nulls.SKIP
    )
    public _FinalStage receivablesData(Optional<AccountsReceivablesData> receivablesData) {
      this.receivablesData = receivablesData;
      return this;
    }

    /**
     * <p>One or more funds that contribute to the the pension account.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage fundsData(List<AccountsFundsData> fundsData) {
      this.fundsData = Optional.of(fundsData);
      return this;
    }

    @Override
    @JsonSetter(
        value = "funds_data",
        nulls = Nulls.SKIP
    )
    public _FinalStage fundsData(Optional<List<AccountsFundsData>> fundsData) {
      this.fundsData = fundsData;
      return this;
    }

    @Override
    public _FinalStage loanData(AccountsLoanData loanData) {
      this.loanData = Optional.of(loanData);
      return this;
    }

    @Override
    @JsonSetter(
        value = "loan_data",
        nulls = Nulls.SKIP
    )
    public _FinalStage loanData(Optional<AccountsLoanData> loanData) {
      this.loanData = loanData;
      return this;
    }

    @Override
    public _FinalStage creditData(AccountsCreditData creditData) {
      this.creditData = Optional.of(creditData);
      return this;
    }

    @Override
    @JsonSetter(
        value = "credit_data",
        nulls = Nulls.SKIP
    )
    public _FinalStage creditData(Optional<AccountsCreditData> creditData) {
      this.creditData = creditData;
      return this;
    }

    /**
     * <p>The ISO-8601 timestamp of Belvo's most recent successful access to the institution for the given link.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage lastAccessedAt(String lastAccessedAt) {
      this.lastAccessedAt = Optional.of(lastAccessedAt);
      return this;
    }

    @Override
    @JsonSetter(
        value = "last_accessed_at",
        nulls = Nulls.SKIP
    )
    public _FinalStage lastAccessedAt(Optional<String> lastAccessedAt) {
      this.lastAccessedAt = lastAccessedAt;
      return this;
    }

    /**
     * <p>The value for the <code>public_identification_name</code>.</p>
     * <p>ℹ️ For 🇧🇷 Brazilian savings and checking accounts, this field will be the agency and bank account number, separated by a slash.
     * For example: <code>0444/45722-0</code>.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage publicIdentificationValue(String publicIdentificationValue) {
      this.publicIdentificationValue = Optional.of(publicIdentificationValue);
      return this;
    }

    @Override
    @JsonSetter(
        value = "public_identification_value",
        nulls = Nulls.SKIP
    )
    public _FinalStage publicIdentificationValue(Optional<String> publicIdentificationValue) {
      this.publicIdentificationValue = publicIdentificationValue;
      return this;
    }

    /**
     * <p>The public name for the type of identification. For example: <code>&quot;CLABE&quot;</code>.</p>
     * <p>ℹ️ For 🇧🇷 Brazilian savings and checking accounts, this field will be <code>AGENCY/ACCOUNT</code>.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage publicIdentificationName(String publicIdentificationName) {
      this.publicIdentificationName = Optional.of(publicIdentificationName);
      return this;
    }

    @Override
    @JsonSetter(
        value = "public_identification_name",
        nulls = Nulls.SKIP
    )
    public _FinalStage publicIdentificationName(Optional<String> publicIdentificationName) {
      this.publicIdentificationName = publicIdentificationName;
      return this;
    }

    /**
     * <p>The currency of the account. For example:</p>
     * <ul>
     * <li>🇧🇷 BRL (Brazilian Real)</li>
     * <li>🇨🇴 COP (Colombian Peso)</li>
     * <li>🇲🇽 MXN (Mexican Peso)</li>
     * </ul>
     * <p>Please note that other currencies other than in the list above may be returned.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage currency(String currency) {
      this.currency = Optional.of(currency);
      return this;
    }

    @Override
    @JsonSetter(
        value = "currency",
        nulls = Nulls.SKIP
    )
    public _FinalStage currency(Optional<String> currency) {
      this.currency = currency;
      return this;
    }

    /**
     * <p>The account number, as designated by the institution.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage number(String number) {
      this.number = Optional.of(number);
      return this;
    }

    @Override
    @JsonSetter(
        value = "number",
        nulls = Nulls.SKIP
    )
    public _FinalStage number(Optional<String> number) {
      this.number = number;
      return this;
    }

    /**
     * <p>The account name, as given by the institution.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage name(String name) {
      this.name = Optional.of(name);
      return this;
    }

    @Override
    @JsonSetter(
        value = "name",
        nulls = Nulls.SKIP
    )
    public _FinalStage name(Optional<String> name) {
      this.name = name;
      return this;
    }

    /**
     * <p>The account type, as designated by the institution.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage type(String type) {
      this.type = Optional.of(type);
      return this;
    }

    @Override
    @JsonSetter(
        value = "type",
        nulls = Nulls.SKIP
    )
    public _FinalStage type(Optional<String> type) {
      this.type = type;
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

    @Override
    public _FinalStage category(String category) {
      this.category = Optional.of(category);
      return this;
    }

    @Override
    @JsonSetter(
        value = "category",
        nulls = Nulls.SKIP
    )
    public _FinalStage category(Optional<String> category) {
      this.category = category;
      return this;
    }

    /**
     * <p>The ISO-8601 timestamp of when the data point was last updated in Belvo's database.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage createdAt(String createdAt) {
      this.createdAt = Optional.of(createdAt);
      return this;
    }

    @Override
    @JsonSetter(
        value = "created_at",
        nulls = Nulls.SKIP
    )
    public _FinalStage createdAt(Optional<String> createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    @Override
    public _FinalStage institution(InstitutionAccount institution) {
      this.institution = Optional.of(institution);
      return this;
    }

    @Override
    @JsonSetter(
        value = "institution",
        nulls = Nulls.SKIP
    )
    public _FinalStage institution(Optional<InstitutionAccount> institution) {
      this.institution = institution;
      return this;
    }

    /**
     * <p>The <code>link.id</code> the account belongs to.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage link(String link) {
      this.link = Optional.of(link);
      return this;
    }

    @Override
    @JsonSetter(
        value = "link",
        nulls = Nulls.SKIP
    )
    public _FinalStage link(Optional<String> link) {
      this.link = link;
      return this;
    }

    /**
     * <p>The unique identifier created by Belvo used to reference the current account.</p>
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
    public Account build() {
      return new Account(id, link, institution, collectedAt, createdAt, category, balanceType, type, name, number, balance, currency, publicIdentificationName, publicIdentificationValue, lastAccessedAt, creditData, loanData, fundsData, receivablesData, bankProductId, internalIdentification);
    }
  }
}
