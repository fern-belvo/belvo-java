package com.belvo.api.resources.riskinsights;

import com.belvo.api.resources.riskinsights.requests.DetailRiskInsightsRequest;
import com.belvo.api.resources.riskinsights.requests.ListRiskInsightsRequest;
import com.belvo.api.resources.riskinsights.requests.PatchRiskInsightsRequest;
import com.belvo.api.resources.riskinsights.requests.RetrieveRiskInsightsRequest;
import com.belvo.api.types.RiskInsights;
import com.belvo.api.types.RiskInsightsPaginatedResponse;
import java.lang.String;
import java.util.List;

public interface RiskInsightsClient {
  RiskInsightsPaginatedResponse listRiskInsights(ListRiskInsightsRequest request);

  List<RiskInsights> retrieveRiskInsights(RetrieveRiskInsightsRequest request);

  List<RiskInsights> patchRiskInsights(PatchRiskInsightsRequest request);

  List<RiskInsights> detailRiskInsights(String id, DetailRiskInsightsRequest request);

  void destroyRiskInsights(String id);
}
