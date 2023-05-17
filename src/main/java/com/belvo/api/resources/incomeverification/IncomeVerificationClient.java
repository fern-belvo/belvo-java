package com.belvo.api.resources.incomeverification;

import com.belvo.api.resources.incomeverification.requests.EyodIncomeVerificationRequest;
import com.belvo.api.types.Income;
import java.util.List;

public interface IncomeVerificationClient {
  List<Income> verifyIncome(EyodIncomeVerificationRequest request);
}
