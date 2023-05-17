package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

@JsonDeserialize(
    builder = SecretKeys.Builder.class
)
public final class SecretKeys {
  private final String id;

  private final String password;

  private final String createdAt;

  private final String lastUsed;

  private int _cachedHashCode;

  SecretKeys(String id, String password, String createdAt, String lastUsed) {
    this.id = id;
    this.password = password;
    this.createdAt = createdAt;
    this.lastUsed = lastUsed;
  }

  /**
   * @return Belvo's unique ID for the Payments API <code>secretId</code>.
   */
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * @return Your Payments API <code>secretPassword</code>. This value is obfuscated.
   */
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  /**
   * @return The ISO-8601 timestamp of when the secret key was created.
   */
  @JsonProperty("created_at")
  public String getCreatedAt() {
    return createdAt;
  }

  /**
   * @return The ISO-8601 timestamp of when the secret key was last used.
   */
  @JsonProperty("last_used")
  public String getLastUsed() {
    return lastUsed;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SecretKeys && equalTo((SecretKeys) other);
  }

  private boolean equalTo(SecretKeys other) {
    return id.equals(other.id) && password.equals(other.password) && createdAt.equals(other.createdAt) && lastUsed.equals(other.lastUsed);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.id, this.password, this.createdAt, this.lastUsed);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "SecretKeys{" + "id: " + id + ", password: " + password + ", createdAt: " + createdAt + ", lastUsed: " + lastUsed + "}";
  }

  public static IdStage builder() {
    return new Builder();
  }

  public interface IdStage {
    PasswordStage id(String id);

    Builder from(SecretKeys other);
  }

  public interface PasswordStage {
    CreatedAtStage password(String password);
  }

  public interface CreatedAtStage {
    LastUsedStage createdAt(String createdAt);
  }

  public interface LastUsedStage {
    _FinalStage lastUsed(String lastUsed);
  }

  public interface _FinalStage {
    SecretKeys build();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements IdStage, PasswordStage, CreatedAtStage, LastUsedStage, _FinalStage {
    private String id;

    private String password;

    private String createdAt;

    private String lastUsed;

    private Builder() {
    }

    @Override
    public Builder from(SecretKeys other) {
      id(other.getId());
      password(other.getPassword());
      createdAt(other.getCreatedAt());
      lastUsed(other.getLastUsed());
      return this;
    }

    /**
     * <p>Belvo's unique ID for the Payments API <code>secretId</code>.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("id")
    public PasswordStage id(String id) {
      this.id = id;
      return this;
    }

    /**
     * <p>Your Payments API <code>secretPassword</code>. This value is obfuscated.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("password")
    public CreatedAtStage password(String password) {
      this.password = password;
      return this;
    }

    /**
     * <p>The ISO-8601 timestamp of when the secret key was created.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("created_at")
    public LastUsedStage createdAt(String createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * <p>The ISO-8601 timestamp of when the secret key was last used.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("last_used")
    public _FinalStage lastUsed(String lastUsed) {
      this.lastUsed = lastUsed;
      return this;
    }

    @Override
    public SecretKeys build() {
      return new SecretKeys(id, password, createdAt, lastUsed);
    }
  }
}
