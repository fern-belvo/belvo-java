package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = NextStepNeedsRedirect.Builder.class
)
public final class NextStepNeedsRedirect {
  private final Optional<NextStepNeedsRedirectType> type;

  private final Optional<NeedsRedirectContent> openFinanceDisplayNeedsRedirect;

  private final Optional<Boolean> readyToConfirm;

  private int _cachedHashCode;

  NextStepNeedsRedirect(Optional<NextStepNeedsRedirectType> type,
      Optional<NeedsRedirectContent> openFinanceDisplayNeedsRedirect,
      Optional<Boolean> readyToConfirm) {
    this.type = type;
    this.openFinanceDisplayNeedsRedirect = openFinanceDisplayNeedsRedirect;
    this.readyToConfirm = readyToConfirm;
  }

  /**
   * @return The type of <code>next_step</code> you need to follow.
   */
  @JsonProperty("type")
  public Optional<NextStepNeedsRedirectType> getType() {
    return type;
  }

  @JsonProperty("open_finance_display_needs_redirect")
  public Optional<NeedsRedirectContent> getOpenFinanceDisplayNeedsRedirect() {
    return openFinanceDisplayNeedsRedirect;
  }

  /**
   * @return Boolean that indicates whether the payment intent is ready to be confirmed.
   * <p><strong>Note:</strong> When set to <code>true</code>, you need to confirm the payment by making a PATCH request sending through <code>confirm: true</code>.</p>
   */
  @JsonProperty("ready_to_confirm")
  public Optional<Boolean> getReadyToConfirm() {
    return readyToConfirm;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof NextStepNeedsRedirect && equalTo((NextStepNeedsRedirect) other);
  }

  private boolean equalTo(NextStepNeedsRedirect other) {
    return type.equals(other.type) && openFinanceDisplayNeedsRedirect.equals(other.openFinanceDisplayNeedsRedirect) && readyToConfirm.equals(other.readyToConfirm);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.type, this.openFinanceDisplayNeedsRedirect, this.readyToConfirm);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "NextStepNeedsRedirect{" + "type: " + type + ", openFinanceDisplayNeedsRedirect: " + openFinanceDisplayNeedsRedirect + ", readyToConfirm: " + readyToConfirm + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<NextStepNeedsRedirectType> type = Optional.empty();

    private Optional<NeedsRedirectContent> openFinanceDisplayNeedsRedirect = Optional.empty();

    private Optional<Boolean> readyToConfirm = Optional.empty();

    private Builder() {
    }

    public Builder from(NextStepNeedsRedirect other) {
      type(other.getType());
      openFinanceDisplayNeedsRedirect(other.getOpenFinanceDisplayNeedsRedirect());
      readyToConfirm(other.getReadyToConfirm());
      return this;
    }

    @JsonSetter(
        value = "type",
        nulls = Nulls.SKIP
    )
    public Builder type(Optional<NextStepNeedsRedirectType> type) {
      this.type = type;
      return this;
    }

    public Builder type(NextStepNeedsRedirectType type) {
      this.type = Optional.of(type);
      return this;
    }

    @JsonSetter(
        value = "open_finance_display_needs_redirect",
        nulls = Nulls.SKIP
    )
    public Builder openFinanceDisplayNeedsRedirect(
        Optional<NeedsRedirectContent> openFinanceDisplayNeedsRedirect) {
      this.openFinanceDisplayNeedsRedirect = openFinanceDisplayNeedsRedirect;
      return this;
    }

    public Builder openFinanceDisplayNeedsRedirect(
        NeedsRedirectContent openFinanceDisplayNeedsRedirect) {
      this.openFinanceDisplayNeedsRedirect = Optional.of(openFinanceDisplayNeedsRedirect);
      return this;
    }

    @JsonSetter(
        value = "ready_to_confirm",
        nulls = Nulls.SKIP
    )
    public Builder readyToConfirm(Optional<Boolean> readyToConfirm) {
      this.readyToConfirm = readyToConfirm;
      return this;
    }

    public Builder readyToConfirm(Boolean readyToConfirm) {
      this.readyToConfirm = Optional.of(readyToConfirm);
      return this;
    }

    public NextStepNeedsRedirect build() {
      return new NextStepNeedsRedirect(type, openFinanceDisplayNeedsRedirect, readyToConfirm);
    }
  }
}
