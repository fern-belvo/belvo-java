package com.belvo.api.resources.categorization;

import com.belvo.api.resources.categorization.requests.CategorizationRequest;
import com.belvo.api.types.Categorization;

public interface CategorizationClient {
  Categorization categorizeTransactions(CategorizationRequest request);
}
