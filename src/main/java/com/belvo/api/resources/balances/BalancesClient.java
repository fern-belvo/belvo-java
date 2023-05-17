package com.belvo.api.resources.balances;

import com.belvo.api.resources.balances.requests.BalancesRequest;
import com.belvo.api.resources.balances.requests.DetailBalanceRequest;
import com.belvo.api.resources.balances.requests.ListBalancesRequest;
import com.belvo.api.resources.balances.requests.PatchBalancesRequest;
import com.belvo.api.types.Balance;
import com.belvo.api.types.BalancesPaginatedResponse;
import java.lang.String;
import java.util.List;

public interface BalancesClient {
  BalancesPaginatedResponse listBalances(ListBalancesRequest request);

  List<Balance> retrieveBalances(BalancesRequest request);

  List<Balance> patchBalances(PatchBalancesRequest request);

  Balance detailBalance(String id, DetailBalanceRequest request);

  void destroyBalance(String id);
}
