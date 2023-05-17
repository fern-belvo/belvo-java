package com.belvo.api;

import com.belvo.api.core.ClientOptions;
import com.belvo.api.core.Suppliers;
import com.belvo.api.resources.accounts.AccountsClient;
import com.belvo.api.resources.accounts.AccountsClientImpl;
import com.belvo.api.resources.balances.BalancesClient;
import com.belvo.api.resources.balances.BalancesClientImpl;
import com.belvo.api.resources.bankaccounts.BankAccountsClient;
import com.belvo.api.resources.bankaccounts.BankAccountsClientImpl;
import com.belvo.api.resources.categorization.CategorizationClient;
import com.belvo.api.resources.categorization.CategorizationClientImpl;
import com.belvo.api.resources.customers.CustomersClient;
import com.belvo.api.resources.customers.CustomersClientImpl;
import com.belvo.api.resources.employmentrecords.EmploymentRecordsClient;
import com.belvo.api.resources.employmentrecords.EmploymentRecordsClientImpl;
import com.belvo.api.resources.incomes.IncomesClient;
import com.belvo.api.resources.incomes.IncomesClientImpl;
import com.belvo.api.resources.incomeverification.IncomeVerificationClient;
import com.belvo.api.resources.incomeverification.IncomeVerificationClientImpl;
import com.belvo.api.resources.institutions.InstitutionsClient;
import com.belvo.api.resources.institutions.InstitutionsClientImpl;
import com.belvo.api.resources.investmentportfolios.InvestmentPortfoliosClient;
import com.belvo.api.resources.investmentportfolios.InvestmentPortfoliosClientImpl;
import com.belvo.api.resources.invoices.InvoicesClient;
import com.belvo.api.resources.invoices.InvoicesClientImpl;
import com.belvo.api.resources.links.LinksClient;
import com.belvo.api.resources.links.LinksClientImpl;
import com.belvo.api.resources.owners.OwnersClient;
import com.belvo.api.resources.owners.OwnersClientImpl;
import com.belvo.api.resources.paymentinstitutions.PaymentInstitutionsClient;
import com.belvo.api.resources.paymentinstitutions.PaymentInstitutionsClientImpl;
import com.belvo.api.resources.paymentintents.PaymentIntentsClient;
import com.belvo.api.resources.paymentintents.PaymentIntentsClientImpl;
import com.belvo.api.resources.paymentlinks.PaymentLinksClient;
import com.belvo.api.resources.paymentlinks.PaymentLinksClientImpl;
import com.belvo.api.resources.paymenttransactions.PaymentTransactionsClient;
import com.belvo.api.resources.paymenttransactions.PaymentTransactionsClientImpl;
import com.belvo.api.resources.paymentwebhooks.PaymentWebhooksClient;
import com.belvo.api.resources.paymentwebhooks.PaymentWebhooksClientImpl;
import com.belvo.api.resources.receivabletransactions.ReceivableTransactionsClient;
import com.belvo.api.resources.receivabletransactions.ReceivableTransactionsClientImpl;
import com.belvo.api.resources.recurringexpenses.RecurringExpensesClient;
import com.belvo.api.resources.recurringexpenses.RecurringExpensesClientImpl;
import com.belvo.api.resources.riskinsights.RiskInsightsClient;
import com.belvo.api.resources.riskinsights.RiskInsightsClientImpl;
import com.belvo.api.resources.secretkeys.SecretKeysClient;
import com.belvo.api.resources.secretkeys.SecretKeysClientImpl;
import com.belvo.api.resources.taxcompliancestatus.TaxComplianceStatusClient;
import com.belvo.api.resources.taxcompliancestatus.TaxComplianceStatusClientImpl;
import com.belvo.api.resources.taxdeclarations.TaxDeclarationsClient;
import com.belvo.api.resources.taxdeclarations.TaxDeclarationsClientImpl;
import com.belvo.api.resources.taxretentions.TaxRetentionsClient;
import com.belvo.api.resources.taxretentions.TaxRetentionsClientImpl;
import com.belvo.api.resources.taxreturns.TaxReturnsClient;
import com.belvo.api.resources.taxreturns.TaxReturnsClientImpl;
import com.belvo.api.resources.taxstatus.TaxStatusClient;
import com.belvo.api.resources.taxstatus.TaxStatusClientImpl;
import com.belvo.api.resources.transactions.TransactionsClient;
import com.belvo.api.resources.transactions.TransactionsClientImpl;
import java.lang.Override;
import java.util.function.Supplier;

public final class BelvoApiClientImpl implements BelvoApiClient {
  private final ClientOptions clientOptions;

  private final Supplier<LinksClient> linksClient;

  private final Supplier<AccountsClient> accountsClient;

  private final Supplier<TransactionsClient> transactionsClient;

  private final Supplier<BalancesClient> balancesClient;

  private final Supplier<InstitutionsClient> institutionsClient;

  private final Supplier<OwnersClient> ownersClient;

  private final Supplier<InvoicesClient> invoicesClient;

  private final Supplier<TaxReturnsClient> taxReturnsClient;

  private final Supplier<TaxStatusClient> taxStatusClient;

  private final Supplier<TaxComplianceStatusClient> taxComplianceStatusClient;

  private final Supplier<IncomesClient> incomesClient;

  private final Supplier<RecurringExpensesClient> recurringExpensesClient;

  private final Supplier<InvestmentPortfoliosClient> investmentPortfoliosClient;

  private final Supplier<ReceivableTransactionsClient> receivableTransactionsClient;

  private final Supplier<RiskInsightsClient> riskInsightsClient;

  private final Supplier<TaxRetentionsClient> taxRetentionsClient;

  private final Supplier<TaxDeclarationsClient> taxDeclarationsClient;

  private final Supplier<EmploymentRecordsClient> employmentRecordsClient;

  private final Supplier<IncomeVerificationClient> incomeVerificationClient;

  private final Supplier<CategorizationClient> categorizationClient;

  private final Supplier<SecretKeysClient> secretKeysClient;

  private final Supplier<PaymentWebhooksClient> paymentWebhooksClient;

  private final Supplier<PaymentInstitutionsClient> paymentInstitutionsClient;

  private final Supplier<CustomersClient> customersClient;

  private final Supplier<BankAccountsClient> bankAccountsClient;

  private final Supplier<PaymentLinksClient> paymentLinksClient;

  private final Supplier<PaymentIntentsClient> paymentIntentsClient;

  private final Supplier<PaymentTransactionsClient> paymentTransactionsClient;

  public BelvoApiClientImpl(ClientOptions clientOptions) {
    this.clientOptions = clientOptions;
    this.linksClient = Suppliers.memoize(() -> new LinksClientImpl(clientOptions));
    this.accountsClient = Suppliers.memoize(() -> new AccountsClientImpl(clientOptions));
    this.transactionsClient = Suppliers.memoize(() -> new TransactionsClientImpl(clientOptions));
    this.balancesClient = Suppliers.memoize(() -> new BalancesClientImpl(clientOptions));
    this.institutionsClient = Suppliers.memoize(() -> new InstitutionsClientImpl(clientOptions));
    this.ownersClient = Suppliers.memoize(() -> new OwnersClientImpl(clientOptions));
    this.invoicesClient = Suppliers.memoize(() -> new InvoicesClientImpl(clientOptions));
    this.taxReturnsClient = Suppliers.memoize(() -> new TaxReturnsClientImpl(clientOptions));
    this.taxStatusClient = Suppliers.memoize(() -> new TaxStatusClientImpl(clientOptions));
    this.taxComplianceStatusClient = Suppliers.memoize(() -> new TaxComplianceStatusClientImpl(clientOptions));
    this.incomesClient = Suppliers.memoize(() -> new IncomesClientImpl(clientOptions));
    this.recurringExpensesClient = Suppliers.memoize(() -> new RecurringExpensesClientImpl(clientOptions));
    this.investmentPortfoliosClient = Suppliers.memoize(() -> new InvestmentPortfoliosClientImpl(clientOptions));
    this.receivableTransactionsClient = Suppliers.memoize(() -> new ReceivableTransactionsClientImpl(clientOptions));
    this.riskInsightsClient = Suppliers.memoize(() -> new RiskInsightsClientImpl(clientOptions));
    this.taxRetentionsClient = Suppliers.memoize(() -> new TaxRetentionsClientImpl(clientOptions));
    this.taxDeclarationsClient = Suppliers.memoize(() -> new TaxDeclarationsClientImpl(clientOptions));
    this.employmentRecordsClient = Suppliers.memoize(() -> new EmploymentRecordsClientImpl(clientOptions));
    this.incomeVerificationClient = Suppliers.memoize(() -> new IncomeVerificationClientImpl(clientOptions));
    this.categorizationClient = Suppliers.memoize(() -> new CategorizationClientImpl(clientOptions));
    this.secretKeysClient = Suppliers.memoize(() -> new SecretKeysClientImpl(clientOptions));
    this.paymentWebhooksClient = Suppliers.memoize(() -> new PaymentWebhooksClientImpl(clientOptions));
    this.paymentInstitutionsClient = Suppliers.memoize(() -> new PaymentInstitutionsClientImpl(clientOptions));
    this.customersClient = Suppliers.memoize(() -> new CustomersClientImpl(clientOptions));
    this.bankAccountsClient = Suppliers.memoize(() -> new BankAccountsClientImpl(clientOptions));
    this.paymentLinksClient = Suppliers.memoize(() -> new PaymentLinksClientImpl(clientOptions));
    this.paymentIntentsClient = Suppliers.memoize(() -> new PaymentIntentsClientImpl(clientOptions));
    this.paymentTransactionsClient = Suppliers.memoize(() -> new PaymentTransactionsClientImpl(clientOptions));
  }

  @Override
  public LinksClient links() {
    return this.linksClient.get();
  }

  @Override
  public AccountsClient accounts() {
    return this.accountsClient.get();
  }

  @Override
  public TransactionsClient transactions() {
    return this.transactionsClient.get();
  }

  @Override
  public BalancesClient balances() {
    return this.balancesClient.get();
  }

  @Override
  public InstitutionsClient institutions() {
    return this.institutionsClient.get();
  }

  @Override
  public OwnersClient owners() {
    return this.ownersClient.get();
  }

  @Override
  public InvoicesClient invoices() {
    return this.invoicesClient.get();
  }

  @Override
  public TaxReturnsClient taxReturns() {
    return this.taxReturnsClient.get();
  }

  @Override
  public TaxStatusClient taxStatus() {
    return this.taxStatusClient.get();
  }

  @Override
  public TaxComplianceStatusClient taxComplianceStatus() {
    return this.taxComplianceStatusClient.get();
  }

  @Override
  public IncomesClient incomes() {
    return this.incomesClient.get();
  }

  @Override
  public RecurringExpensesClient recurringExpenses() {
    return this.recurringExpensesClient.get();
  }

  @Override
  public InvestmentPortfoliosClient investmentPortfolios() {
    return this.investmentPortfoliosClient.get();
  }

  @Override
  public ReceivableTransactionsClient receivableTransactions() {
    return this.receivableTransactionsClient.get();
  }

  @Override
  public RiskInsightsClient riskInsights() {
    return this.riskInsightsClient.get();
  }

  @Override
  public TaxRetentionsClient taxRetentions() {
    return this.taxRetentionsClient.get();
  }

  @Override
  public TaxDeclarationsClient taxDeclarations() {
    return this.taxDeclarationsClient.get();
  }

  @Override
  public EmploymentRecordsClient employmentRecords() {
    return this.employmentRecordsClient.get();
  }

  @Override
  public IncomeVerificationClient incomeVerification() {
    return this.incomeVerificationClient.get();
  }

  @Override
  public CategorizationClient categorization() {
    return this.categorizationClient.get();
  }

  @Override
  public SecretKeysClient secretKeys() {
    return this.secretKeysClient.get();
  }

  @Override
  public PaymentWebhooksClient paymentWebhooks() {
    return this.paymentWebhooksClient.get();
  }

  @Override
  public PaymentInstitutionsClient paymentInstitutions() {
    return this.paymentInstitutionsClient.get();
  }

  @Override
  public CustomersClient customers() {
    return this.customersClient.get();
  }

  @Override
  public BankAccountsClient bankAccounts() {
    return this.bankAccountsClient.get();
  }

  @Override
  public PaymentLinksClient paymentLinks() {
    return this.paymentLinksClient.get();
  }

  @Override
  public PaymentIntentsClient paymentIntents() {
    return this.paymentIntentsClient.get();
  }

  @Override
  public PaymentTransactionsClient paymentTransactions() {
    return this.paymentTransactionsClient.get();
  }
}
