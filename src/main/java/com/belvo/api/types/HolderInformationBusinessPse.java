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
    builder = HolderInformationBusinessPse.Builder.class
)
public final class HolderInformationBusinessPse {
  private final String name;

  private int _cachedHashCode;

  HolderInformationBusinessPse(String name) {
    this.name = name;
  }

  /**
   * @return The business name.
   * <p>Note, this is only applicable if the <code>holder.type</code> is set to <code>BUSINESS</code>.</p>
   */
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof HolderInformationBusinessPse && equalTo((HolderInformationBusinessPse) other);
  }

  private boolean equalTo(HolderInformationBusinessPse other) {
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
    return "HolderInformationBusinessPse{" + "name: " + name + "}";
  }

  public static NameStage builder() {
    return new Builder();
  }

  public interface NameStage {
    _FinalStage name(String name);

    Builder from(HolderInformationBusinessPse other);
  }

  public interface _FinalStage {
    HolderInformationBusinessPse build();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements NameStage, _FinalStage {
    private String name;

    private Builder() {
    }

    @Override
    public Builder from(HolderInformationBusinessPse other) {
      name(other.getName());
      return this;
    }

    /**
     * <p>The business name.</p>
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
    public HolderInformationBusinessPse build() {
      return new HolderInformationBusinessPse(name);
    }
  }
}
