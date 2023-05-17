package com.belvo.api.resources.bankaccounts;

import com.belvo.api.resources.bankaccounts.requests.ListBankAccountRequest;
import com.belvo.api.types.BankAccountPaginatedResponse;
import com.belvo.api.types.CreateBankAccountRequest;
import com.belvo.api.types.CreateBankAccountResponse;
import com.belvo.api.types.DetailBankAccountResponse;
import java.lang.String;

public interface BankAccountsClient {
  BankAccountPaginatedResponse listBankAccount(ListBankAccountRequest request);

  CreateBankAccountResponse createBankAccount(CreateBankAccountRequest request);

  DetailBankAccountResponse detailBankAccount(String id);
}
