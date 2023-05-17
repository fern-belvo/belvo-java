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
    builder = NextStepDisplayNeedsRedirectPse.Builder.class
)
public final class NextStepDisplayNeedsRedirectPse {
  private final Optional<NextStepDisplayNeedsRedirectPseType> type;

  private final Optional<NeedsRedirectContentPse> pseDisplayNeedsRedirect;

  private final Optional<Boolean> readyToConfirm;

  private int _cachedHashCode;

  NextStepDisplayNeedsRedirectPse(Optional<NextStepDisplayNeedsRedirectPseType> type,
      Optional<NeedsRedirectContentPse> pseDisplayNeedsRedirect, Optional<Boolean> readyToConfirm) {
    this.type = type;
    this.pseDisplayNeedsRedirect = pseDisplayNeedsRedirect;
    this.readyToConfirm = readyToConfirm;
  }

  /**
   * @return The type of <code>next_step</code> you need to follow.
   */
  @JsonProperty("type")
  public Optional<NextStepDisplayNeedsRedirectPseType> getType() {
    return type;
  }

  @JsonProperty("pse_display_needs_redirect")
  public Optional<NeedsRedirectContentPse> getPseDisplayNeedsRedirect() {
    return pseDisplayNeedsRedirect;
  }

  /**
   * @return Boolean that indicates whether the payment intent is ready to be confirmed.
   * <p><strong>Note:</strong> When the value is <code>true</code>, you'll need to make a PATCH request sending through <code>confirm: true</code> to confirm the payment.</p>
   */
  @JsonProperty("ready_to_confirm")
  public Optional<Boolean> getReadyToConfirm() {
    return readyToConfirm;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof NextStepDisplayNeedsRedirectPse && equalTo((NextStepDisplayNeedsRedirectPse) other);
  }

  private boolean equalTo(NextStepDisplayNeedsRedirectPse other) {
    return type.equals(other.type) && pseDisplayNeedsRedirect.equals(other.pseDisplayNeedsRedirect) && readyToConfirm.equals(other.readyToConfirm);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.type, this.pseDisplayNeedsRedirect, this.readyToConfirm);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "NextStepDisplayNeedsRedirectPse{" + "type: " + type + ", pseDisplayNeedsRedirect: " + pseDisplayNeedsRedirect + ", readyToConfirm: " + readyToConfirm + "}";
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<NextStepDisplayNeedsRedirectPseType> type = Optional.empty();

    private Optional<NeedsRedirectContentPse> pseDisplayNeedsRedirect = Optional.empty();

    private Optional<Boolean> readyToConfirm = Optional.empty();

    private Builder() {
    }

    public Builder from(NextStepDisplayNeedsRedirectPse other) {
      type(other.getType());
      pseDisplayNeedsRedirect(other.getPseDisplayNeedsRedirect());
      readyToConfirm(other.getReadyToConfirm());
      return this;
    }

    @JsonSetter(
        value = "type",
        nulls = Nulls.SKIP
    )
    public Builder type(Optional<NextStepDisplayNeedsRedirectPseType> type) {
      this.type = type;
      return this;
    }

    public Builder type(NextStepDisplayNeedsRedirectPseType type) {
      this.type = Optional.of(type);
      return this;
    }

    @JsonSetter(
        value = "pse_display_needs_redirect",
        nulls = Nulls.SKIP
    )
    public Builder pseDisplayNeedsRedirect(
        Optional<NeedsRedirectContentPse> pseDisplayNeedsRedirect) {
      this.pseDisplayNeedsRedirect = pseDisplayNeedsRedirect;
      return this;
    }

    public Builder pseDisplayNeedsRedirect(NeedsRedirectContentPse pseDisplayNeedsRedirect) {
      this.pseDisplayNeedsRedirect = Optional.of(pseDisplayNeedsRedirect);
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

    public NextStepDisplayNeedsRedirectPse build() {
      return new NextStepDisplayNeedsRedirectPse(type, pseDisplayNeedsRedirect, readyToConfirm);
    }
  }
}
