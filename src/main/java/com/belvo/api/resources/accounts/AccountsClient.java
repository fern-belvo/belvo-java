package com.belvo.api.resources.accounts;

import com.belvo.api.resources.accounts.requests.DetailAccountRequest;
import com.belvo.api.resources.accounts.requests.ListAccountsRequest;
import com.belvo.api.resources.accounts.requests.PatchAccountsRequest;
import com.belvo.api.resources.accounts.requests.RetrieveAccountsRequest;
import com.belvo.api.types.Account;
import com.belvo.api.types.AccountsPaginatedResponse;
import java.lang.String;
import java.util.List;

public interface AccountsClient {
  AccountsPaginatedResponse listAccounts(ListAccountsRequest request);

  List<Account> retrieveAccounts(RetrieveAccountsRequest request);

  List<Account> patchAccounts(PatchAccountsRequest request);

  Account detailAccount(String id, DetailAccountRequest request);

  void destroyAccount(String id);
}
