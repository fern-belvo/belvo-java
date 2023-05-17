package com.belvo.api.resources.incomes.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = ListIncomesRequest.Builder.class
)
public final class ListIncomesRequest {
  private final Optional<Integer> page;

  private final Optional<Integer> pageSize;

  private final Optional<String> omit;

  private final Optional<String> fields;

  private final Optional<String> account;

  private final Optional<String> accountIn;

  private final Optional<String> link;

  private final Optional<String> linkIn;

  private int _cachedHashCode;

  ListIncomesRequest(Optional<Integer> page, Optional<Integer> pageSize, Optional<String> omit,
      Optional<String> fields, Optional<String> account, Optional<String> accountIn,
      Optional<String> link, Optional<String> linkIn) {
    this.page = page;
    this.pageSize = pageSize;
    this.omit = omit;
    this.fields = fields;
    this.account = account;
    this.accountIn = accountIn;
    this.link = link;
    this.linkIn = linkIn;
  }

  /**
   * @return A page number within the paginated result set.
   */
  @JsonProperty("page")
  public Optional<Integer> getPage() {
    return page;
  }

  /**
   * @return Indicates how many results to return per page. By default we return 100 results per page.
   * <p>ℹ️ The minimum number of results returned per page is 1 and the maximum is 1000. If you enter a value greater than 1000, our API will default to the maximum value (1000).</p>
   */
  @JsonProperty("page_size")
  public Optional<Integer> getPageSize() {
    return pageSize;
  }

  /**
   * @return Omit certain fields from being returned in the response. For more information, see our <a href="https://developers.belvo.com/docs/searching-and-filtering">Filtering responses</a> DevPortal article.
   */
  @JsonProperty("omit")
  public Optional<String> getOmit() {
    return omit;
  }

  /**
   * @return Return only the specified fields in the response. For more information, see our <a href="https://developers.belvo.com/docs/searching-and-filtering">Filtering responses</a> DevPortal article.
   */
  @JsonProperty("fields")
  public Optional<String> getFields() {
    return fields;
  }

  /**
   * @return The <code>account.id</code> you want to filter by.
   * <p>ℹ️ We highly recommend adding the <code>account.id</code> filter in order to improve your performance.</p>
   */
  @JsonProperty("account")
  public Optional<String> getAccount() {
    return account;
  }

  /**
   * @return Return incomes for these <code>account.id</code>s.
   */
  @JsonProperty("account__in")
  public Optional<String> getAccountIn() {
    return accountIn;
  }

  /**
   * @return The <code>link.id</code> you want to filter by.
   * <p>ℹ️ We highly recommend adding either the <code>link.id</code> or the <code>account.id</code> filters in order to improve your performance.</p>
   */
  @JsonProperty("link")
  public Optional<String> getLink() {
    return link;
  }

  /**
   * @return Return incomes only for these <code>link.id</code>s.
   */
  @JsonProperty("link__in")
  public Optional<String> getLinkIn() {
    return linkIn;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof ListIncomesRequest && equalTo((ListIncomesRequest) other);
  }

  private boolean equalTo(ListIncomesRequest other) {
    return page.equals(other.page) && pageSize.equals(other.pageSize) && omit.equals(other.omit) && fields.equals(other.fields) && account.equals(other.account) && accountIn.equals(other.accountIn) && link.equals(other.link) && linkIn.equals(other.linkIn);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.page, this.pageSize, this.omit, this.fields, this.account, this.accountIn, this.link, this.linkIn);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "ListIncomesRequest{" + "page: " + page + ", pageSize: " + pageSize + ", omit: " + omit + ", fields: " + fields + ", account: " + account + ", accountIn: " + accountIn + ", link: " + link + ", linkIn: " + linkIn + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<Integer> page = Optional.empty();

    private Optional<Integer> pageSize = Optional.empty();

    private Optional<String> omit = Optional.empty();

    private Optional<String> fields = Optional.empty();

    private Optional<String> account = Optional.empty();

    private Optional<String> accountIn = Optional.empty();

    private Optional<String> link = Optional.empty();

    private Optional<String> linkIn = Optional.empty();

    private Builder() {
    }

    public Builder from(ListIncomesRequest other) {
      page(other.getPage());
      pageSize(other.getPageSize());
      omit(other.getOmit());
      fields(other.getFields());
      account(other.getAccount());
      accountIn(other.getAccountIn());
      link(other.getLink());
      linkIn(other.getLinkIn());
      return this;
    }

    @JsonSetter(
        value = "page",
        nulls = Nulls.SKIP
    )
    public Builder page(Optional<Integer> page) {
      this.page = page;
      return this;
    }

    public Builder page(Integer page) {
      this.page = Optional.of(page);
      return this;
    }

    @JsonSetter(
        value = "page_size",
        nulls = Nulls.SKIP
    )
    public Builder pageSize(Optional<Integer> pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    public Builder pageSize(Integer pageSize) {
      this.pageSize = Optional.of(pageSize);
      return this;
    }

    @JsonSetter(
        value = "omit",
        nulls = Nulls.SKIP
    )
    public Builder omit(Optional<String> omit) {
      this.omit = omit;
      return this;
    }

    public Builder omit(String omit) {
      this.omit = Optional.of(omit);
      return this;
    }

    @JsonSetter(
        value = "fields",
        nulls = Nulls.SKIP
    )
    public Builder fields(Optional<String> fields) {
      this.fields = fields;
      return this;
    }

    public Builder fields(String fields) {
      this.fields = Optional.of(fields);
      return this;
    }

    @JsonSetter(
        value = "account",
        nulls = Nulls.SKIP
    )
    public Builder account(Optional<String> account) {
      this.account = account;
      return this;
    }

    public Builder account(String account) {
      this.account = Optional.of(account);
      return this;
    }

    @JsonSetter(
        value = "account__in",
        nulls = Nulls.SKIP
    )
    public Builder accountIn(Optional<String> accountIn) {
      this.accountIn = accountIn;
      return this;
    }

    public Builder accountIn(String accountIn) {
      this.accountIn = Optional.of(accountIn);
      return this;
    }

    @JsonSetter(
        value = "link",
        nulls = Nulls.SKIP
    )
    public Builder link(Optional<String> link) {
      this.link = link;
      return this;
    }

    public Builder link(String link) {
      this.link = Optional.of(link);
      return this;
    }

    @JsonSetter(
        value = "link__in",
        nulls = Nulls.SKIP
    )
    public Builder linkIn(Optional<String> linkIn) {
      this.linkIn = linkIn;
      return this;
    }

    public Builder linkIn(String linkIn) {
      this.linkIn = Optional.of(linkIn);
      return this;
    }

    public ListIncomesRequest build() {
      return new ListIncomesRequest(page, pageSize, omit, fields, account, accountIn, link, linkIn);
    }
  }
}
