package com.belvo.api.resources.links;

import com.belvo.api.resources.links.requests.ChangeAccessMode;
import com.belvo.api.resources.links.requests.DetailLinkRequest;
import com.belvo.api.resources.links.requests.LinksPutRequest;
import com.belvo.api.resources.links.requests.LinksRequest;
import com.belvo.api.resources.links.requests.ListLinksRequest;
import com.belvo.api.resources.links.requests.PatchLinksRequest;
import com.belvo.api.types.Link;
import com.belvo.api.types.PaginatedResponseLink;
import java.lang.String;

public interface LinksClient {
  PaginatedResponseLink listLinks(ListLinksRequest request);

  Link registerLink(LinksRequest request);

  Link patchLinks(PatchLinksRequest request);

  Link detailLink(String id, DetailLinkRequest request);

  Link updateLink(String id, LinksPutRequest request);

  Link changeLinkAccessMode(String id, ChangeAccessMode request);

  void destroyLink(String id);
}
