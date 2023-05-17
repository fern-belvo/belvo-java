package com.belvo.api;

import com.belvo.api.resources.accounts.AccountsClient;
import com.belvo.api.resources.balances.BalancesClient;
import com.belvo.api.resources.bankaccounts.BankAccountsClient;
import com.belvo.api.resources.categorization.CategorizationClient;
import com.belvo.api.resources.customers.CustomersClient;
import com.belvo.api.resources.employmentrecords.EmploymentRecordsClient;
import com.belvo.api.resources.incomes.IncomesClient;
import com.belvo.api.resources.incomeverification.IncomeVerificationClient;
import com.belvo.api.resources.institutions.InstitutionsClient;
import com.belvo.api.resources.investmentportfolios.InvestmentPortfoliosClient;
import com.belvo.api.resources.invoices.InvoicesClient;
import com.belvo.api.resources.links.LinksClient;
import com.belvo.api.resources.owners.OwnersClient;
import com.belvo.api.resources.paymentinstitutions.PaymentInstitutionsClient;
import com.belvo.api.resources.paymentintents.PaymentIntentsClient;
import com.belvo.api.resources.paymentlinks.PaymentLinksClient;
import com.belvo.api.resources.paymenttransactions.PaymentTransactionsClient;
import com.belvo.api.resources.paymentwebhooks.PaymentWebhooksClient;
import com.belvo.api.resources.receivabletransactions.ReceivableTransactionsClient;
import com.belvo.api.resources.recurringexpenses.RecurringExpensesClient;
import com.belvo.api.resources.riskinsights.RiskInsightsClient;
import com.belvo.api.resources.secretkeys.SecretKeysClient;
import com.belvo.api.resources.taxcompliancestatus.TaxComplianceStatusClient;
import com.belvo.api.resources.taxdeclarations.TaxDeclarationsClient;
import com.belvo.api.resources.taxretentions.TaxRetentionsClient;
import com.belvo.api.resources.taxreturns.TaxReturnsClient;
import com.belvo.api.resources.taxstatus.TaxStatusClient;
import com.belvo.api.resources.transactions.TransactionsClient;

public interface BelvoApiClient {
  LinksClient links();

  AccountsClient accounts();

  TransactionsClient transactions();

  BalancesClient balances();

  InstitutionsClient institutions();

  OwnersClient owners();

  InvoicesClient invoices();

  TaxReturnsClient taxReturns();

  TaxStatusClient taxStatus();

  TaxComplianceStatusClient taxComplianceStatus();

  IncomesClient incomes();

  RecurringExpensesClient recurringExpenses();

  InvestmentPortfoliosClient investmentPortfolios();

  ReceivableTransactionsClient receivableTransactions();

  RiskInsightsClient riskInsights();

  TaxRetentionsClient taxRetentions();

  TaxDeclarationsClient taxDeclarations();

  EmploymentRecordsClient employmentRecords();

  IncomeVerificationClient incomeVerification();

  CategorizationClient categorization();

  SecretKeysClient secretKeys();

  PaymentWebhooksClient paymentWebhooks();

  PaymentInstitutionsClient paymentInstitutions();

  CustomersClient customers();

  BankAccountsClient bankAccounts();

  PaymentLinksClient paymentLinks();

  PaymentIntentsClient paymentIntents();

  PaymentTransactionsClient paymentTransactions();

  static BelvoApiClientBuilder builder() {
    return new BelvoApiClientBuilder();
  }
}
