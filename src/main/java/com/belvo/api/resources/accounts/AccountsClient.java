package com.belvo.api.resources.accounts;

import com.belvo.api.resources.accounts.requests.DetailAccountRequest;
import com.belvo.api.resources.accounts.requests.ListAccountsRequest;
import com.belvo.api.resources.accounts.requests.PatchAccountsRequest;
import com.belvo.api.resources.accounts.requests.RetrieveAccountsRequest;
import com.belvo.api.types.Account;
import com.belvo.api.types.AccountsPaginatedResponse;
import java.lang.String;
import java.util.List;
import java.util.Optional;

public interface AccountsClient {
  AccountsPaginatedResponse listAccounts(ListAccountsRequest request);

  List<Optional<Account>> retrieveAccounts(RetrieveAccountsRequest request);

  List<Optional<Account>> patchAccounts(PatchAccountsRequest request);

  Optional<Account> detailAccount(String id, DetailAccountRequest request);

  void destroyAccount(String id);
}
