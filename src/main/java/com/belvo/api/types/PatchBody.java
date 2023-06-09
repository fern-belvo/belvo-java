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
    builder = PatchBody.Builder.class
)
public final class PatchBody {
  private final String session;

  private final Optional<String> token;

  private final String link;

  private final Optional<Boolean> saveData;

  private int _cachedHashCode;

  PatchBody(String session, Optional<String> token, String link, Optional<Boolean> saveData) {
    this.session = session;
    this.token = token;
    this.link = link;
    this.saveData = saveData;
  }

  /**
   * @return The session you want to resume. You need to use the <code>session</code> value that is provided in the 428 Token Required response that you receive after you make your POST request.
   */
  @JsonProperty("session")
  public String getSession() {
    return session;
  }

  /**
   * @return The MFA token generated by the institution and required to continue a session.
   */
  @JsonProperty("token")
  public Optional<String> getToken() {
    return token;
  }

  /**
   * @return The <code>link.id</code> you want to resume. Must be the same <code>link.id</code> as the one you receive in the 428 Token Required response that contains the <code>session</code> ID.
   */
  @JsonProperty("link")
  public String getLink() {
    return link;
  }

  /**
   * @return Indicates whether or not to persist the data in Belvo. By default, this is set to <code>true</code> and we return a 201 Created response.
   * When set to <code>false</code>, the data won't be persisted and we return a 200 OK response.
   */
  @JsonProperty("save_data")
  public Optional<Boolean> getSaveData() {
    return saveData;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof PatchBody && equalTo((PatchBody) other);
  }

  private boolean equalTo(PatchBody other) {
    return session.equals(other.session) && token.equals(other.token) && link.equals(other.link) && saveData.equals(other.saveData);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.session, this.token, this.link, this.saveData);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "PatchBody{" + "session: " + session + ", token: " + token + ", link: " + link + ", saveData: " + saveData + "}";
  }

  public static SessionStage builder() {
    return new Builder();
  }

  public interface SessionStage {
    LinkStage session(String session);

    Builder from(PatchBody other);
  }

  public interface LinkStage {
    _FinalStage link(String link);
  }

  public interface _FinalStage {
    PatchBody build();

    _FinalStage token(Optional<String> token);

    _FinalStage token(String token);

    _FinalStage saveData(Optional<Boolean> saveData);

    _FinalStage saveData(Boolean saveData);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements SessionStage, LinkStage, _FinalStage {
    private String session;

    private String link;

    private Optional<Boolean> saveData = Optional.empty();

    private Optional<String> token = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(PatchBody other) {
      session(other.getSession());
      token(other.getToken());
      link(other.getLink());
      saveData(other.getSaveData());
      return this;
    }

    /**
     * <p>The session you want to resume. You need to use the <code>session</code> value that is provided in the 428 Token Required response that you receive after you make your POST request.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("session")
    public LinkStage session(String session) {
      this.session = session;
      return this;
    }

    /**
     * <p>The <code>link.id</code> you want to resume. Must be the same <code>link.id</code> as the one you receive in the 428 Token Required response that contains the <code>session</code> ID.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("link")
    public _FinalStage link(String link) {
      this.link = link;
      return this;
    }

    /**
     * <p>Indicates whether or not to persist the data in Belvo. By default, this is set to <code>true</code> and we return a 201 Created response.
     * When set to <code>false</code>, the data won't be persisted and we return a 200 OK response.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage saveData(Boolean saveData) {
      this.saveData = Optional.of(saveData);
      return this;
    }

    @Override
    @JsonSetter(
        value = "save_data",
        nulls = Nulls.SKIP
    )
    public _FinalStage saveData(Optional<Boolean> saveData) {
      this.saveData = saveData;
      return this;
    }

    /**
     * <p>The MFA token generated by the institution and required to continue a session.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage token(String token) {
      this.token = Optional.of(token);
      return this;
    }

    @Override
    @JsonSetter(
        value = "token",
        nulls = Nulls.SKIP
    )
    public _FinalStage token(Optional<String> token) {
      this.token = token;
      return this;
    }

    @Override
    public PatchBody build() {
      return new PatchBody(session, token, link, saveData);
    }
  }
}
