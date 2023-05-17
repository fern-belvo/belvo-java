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
    builder = HolderInformationBusinessPseResponse.Builder.class
)
public final class HolderInformationBusinessPseResponse {
  private final String name;

  private int _cachedHashCode;

  HolderInformationBusinessPseResponse(String name) {
    this.name = name;
  }

  /**
   * @return The business name. This value is obfuscated.
   * <p>Note, this is only applicable if the <code>holder.type</code> is set to <code>BUSINESS</code>.</p>
   */
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof HolderInformationBusinessPseResponse && equalTo((HolderInformationBusinessPseResponse) other);
  }

  private boolean equalTo(HolderInformationBusinessPseResponse other) {
    return name.equals(other.name);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.name);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "HolderInformationBusinessPseResponse{" + "name: " + name + "}";
  }

  public static NameStage builder() {
    return new Builder();
  }

  public interface NameStage {
    _FinalStage name(String name);

    Builder from(HolderInformationBusinessPseResponse other);
  }

  public interface _FinalStage {
    HolderInformationBusinessPseResponse build();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements NameStage, _FinalStage {
    private String name;

    private Builder() {
    }

    @Override
    public Builder from(HolderInformationBusinessPseResponse other) {
      name(other.getName());
      return this;
    }

    /**
     * <p>The business name. This value is obfuscated.</p>
     * <p>Note, this is only applicable if the <code>holder.type</code> is set to <code>BUSINESS</code>.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("name")
    public _FinalStage name(String name) {
      this.name = name;
      return this;
    }

    @Override
    public HolderInformationBusinessPseResponse build() {
      return new HolderInformationBusinessPseResponse(name);
    }
  }
}
