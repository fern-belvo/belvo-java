package com.belvo.api.resources.investmentportfolios;

import com.belvo.api.resources.investmentportfolios.requests.DetailPortfolioRequest;
import com.belvo.api.resources.investmentportfolios.requests.ListPortfolioRequest;
import com.belvo.api.resources.investmentportfolios.requests.PatchPortfolioRequest;
import com.belvo.api.resources.investmentportfolios.requests.RetrievePortfolioRequest;
import com.belvo.api.types.InvestmentsPortfolio;
import com.belvo.api.types.InvestmentsPortfoliosPaginatedResponse;
import java.lang.String;

public interface InvestmentPortfoliosClient {
  InvestmentsPortfoliosPaginatedResponse listPortfolio(ListPortfolioRequest request);

  InvestmentsPortfolio retrievePortfolio(RetrievePortfolioRequest request);

  InvestmentsPortfolio patchPortfolio(PatchPortfolioRequest request);

  InvestmentsPortfolio detailPortfolio(String id, DetailPortfolioRequest request);

  void destroyPortfolio(String id);
}
