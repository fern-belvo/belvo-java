package com.belvo.api.resources.institutions;

import com.belvo.api.resources.institutions.requests.DetailInstitutionRequest;
import com.belvo.api.resources.institutions.requests.ListInstitutionsRequest;
import com.belvo.api.types.Institution;
import com.belvo.api.types.InstitutionsPaginatedResponse;
import java.lang.String;

public interface InstitutionsClient {
  InstitutionsPaginatedResponse listInstitutions(ListInstitutionsRequest request);

  Institution detailInstitution(String id, DetailInstitutionRequest request);
}
