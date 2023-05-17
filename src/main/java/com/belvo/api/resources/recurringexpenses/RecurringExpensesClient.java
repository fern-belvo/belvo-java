package com.belvo.api.resources.recurringexpenses;

import com.belvo.api.resources.recurringexpenses.requests.DetailRecurringExpenseRequest;
import com.belvo.api.resources.recurringexpenses.requests.ListRecurringExpensesRequest;
import com.belvo.api.resources.recurringexpenses.requests.PatchRecurringExpensesRequest;
import com.belvo.api.resources.recurringexpenses.requests.RecurringExpensesRequest;
import com.belvo.api.types.RecurringExpenses;
import com.belvo.api.types.RecurringExpensesPaginatedResponse;
import java.lang.String;
import java.util.List;

public interface RecurringExpensesClient {
  RecurringExpensesPaginatedResponse listRecurringExpenses(ListRecurringExpensesRequest request);

  List<RecurringExpenses> retrieveRecurringExpenses(RecurringExpensesRequest request);

  List<RecurringExpenses> patchRecurringExpenses(PatchRecurringExpensesRequest request);

  List<RecurringExpenses> detailRecurringExpense(String id, DetailRecurringExpenseRequest request);

  void destroyRecurringExpense(String id);
}
