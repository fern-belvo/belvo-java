package com.belvo.api.resources.incomes;

import com.belvo.api.resources.incomes.requests.DetailIncomeRequest;
import com.belvo.api.resources.incomes.requests.IncomesRequest;
import com.belvo.api.resources.incomes.requests.ListIncomesRequest;
import com.belvo.api.resources.incomes.requests.PatchIncomesRequest;
import com.belvo.api.types.Income;
import com.belvo.api.types.IncomesPaginatedResponse;
import java.lang.String;
import java.util.List;

public interface IncomesClient {
  IncomesPaginatedResponse listIncomes(ListIncomesRequest request);

  Income retrieveIncome(IncomesRequest request);

  List<Income> patchIncomes(PatchIncomesRequest request);

  List<Income> detailIncome(String id, DetailIncomeRequest request);

  void destroyIncomes(String id);
}
