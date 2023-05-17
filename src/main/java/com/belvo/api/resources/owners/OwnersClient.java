package com.belvo.api.resources.owners;

import com.belvo.api.resources.owners.requests.DetailOwnerRequest;
import com.belvo.api.resources.owners.requests.ListOwnersRequest;
import com.belvo.api.resources.owners.requests.PatchOwnersRequest;
import com.belvo.api.resources.owners.requests.RetrieveOwnersRequest;
import com.belvo.api.types.Owner;
import com.belvo.api.types.OwnersPaginatedResponse;
import java.lang.String;
import java.util.List;

public interface OwnersClient {
  OwnersPaginatedResponse listOwners(ListOwnersRequest request);

  List<Owner> retrieveOwners(RetrieveOwnersRequest request);

  List<Owner> patchOwners(PatchOwnersRequest request);

  Owner detailOwner(String id, DetailOwnerRequest request);

  void destroyOwner(String id);
}
