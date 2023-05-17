package com.belvo.api.types;

import com.belvo.api.core.ObjectMappers;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.io.IOException;
import java.lang.IllegalArgumentException;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

@JsonDeserialize(
    using = BadRequestErrorBodyItem.Deserializer.class
)
public final class BadRequestErrorBodyItem {
  private final Object value;

  private final int type;

  private BadRequestErrorBodyItem(Object value, int type) {
    this.value = value;
    this.type = type;
  }

  @JsonValue
  public Object get() {
    return this.value;
  }

  public <T> T visit(Visitor<T> visitor) {
    if(this.type == 0) {
      return visitor.visit((InvalidAccessMode) this.value);
    } else if(this.type == 1) {
      return visitor.visit((TooManySessionsError) this.value);
    } else if(this.type == 2) {
      return visitor.visit((LoginError) this.value);
    } else if(this.type == 3) {
      return visitor.visit((SessionExpiredError) this.value);
    } else if(this.type == 4) {
      return visitor.visit((ValidationError) this.value);
    } else if(this.type == 5) {
      return visitor.visit((InstitutionDownError) this.value);
    } else if(this.type == 6) {
      return visitor.visit((InstitutionUnavailableError) this.value);
    } else if(this.type == 7) {
      return visitor.visit((InstitutionInactiveError) this.value);
    } else if(this.type == 8) {
      return visitor.visit((UnsupportedOperationError) this.value);
    } else if(this.type == 9) {
      return visitor.visit((InvalidLinkError) this.value);
    } else if(this.type == 10) {
      return visitor.visit((UnconfirmedLinkError) this.value);
    }
    throw new IllegalStateException("Failed to visit value. This should never happen.");
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof BadRequestErrorBodyItem && equalTo((BadRequestErrorBodyItem) other);
  }

  private boolean equalTo(BadRequestErrorBodyItem other) {
    return value.equals(other.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.value);
  }

  @Override
  public String toString() {
    return this.value.toString();
  }

  public static BadRequestErrorBodyItem of(InvalidAccessMode value) {
    return new BadRequestErrorBodyItem(value, 0);
  }

  public static BadRequestErrorBodyItem of(TooManySessionsError value) {
    return new BadRequestErrorBodyItem(value, 1);
  }

  public static BadRequestErrorBodyItem of(LoginError value) {
    return new BadRequestErrorBodyItem(value, 2);
  }

  public static BadRequestErrorBodyItem of(SessionExpiredError value) {
    return new BadRequestErrorBodyItem(value, 3);
  }

  public static BadRequestErrorBodyItem of(ValidationError value) {
    return new BadRequestErrorBodyItem(value, 4);
  }

  public static BadRequestErrorBodyItem of(InstitutionDownError value) {
    return new BadRequestErrorBodyItem(value, 5);
  }

  public static BadRequestErrorBodyItem of(InstitutionUnavailableError value) {
    return new BadRequestErrorBodyItem(value, 6);
  }

  public static BadRequestErrorBodyItem of(InstitutionInactiveError value) {
    return new BadRequestErrorBodyItem(value, 7);
  }

  public static BadRequestErrorBodyItem of(UnsupportedOperationError value) {
    return new BadRequestErrorBodyItem(value, 8);
  }

  public static BadRequestErrorBodyItem of(InvalidLinkError value) {
    return new BadRequestErrorBodyItem(value, 9);
  }

  public static BadRequestErrorBodyItem of(UnconfirmedLinkError value) {
    return new BadRequestErrorBodyItem(value, 10);
  }

  public interface Visitor<T> {
    T visit(InvalidAccessMode value);

    T visit(TooManySessionsError value);

    T visit(LoginError value);

    T visit(SessionExpiredError value);

    T visit(ValidationError value);

    T visit(InstitutionDownError value);

    T visit(InstitutionUnavailableError value);

    T visit(InstitutionInactiveError value);

    T visit(UnsupportedOperationError value);

    T visit(InvalidLinkError value);

    T visit(UnconfirmedLinkError value);
  }

  static final class Deserializer extends StdDeserializer<BadRequestErrorBodyItem> {
    Deserializer() {
      super(BadRequestErrorBodyItem.class);
    }

    @Override
    public BadRequestErrorBodyItem deserialize(JsonParser p, DeserializationContext ctxt) throws
        IOException {
      Object value = p.readValueAs(Object.class);
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, InvalidAccessMode.class));
      } catch(IllegalArgumentException e) {
      }
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, TooManySessionsError.class));
      } catch(IllegalArgumentException e) {
      }
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, LoginError.class));
      } catch(IllegalArgumentException e) {
      }
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, SessionExpiredError.class));
      } catch(IllegalArgumentException e) {
      }
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, ValidationError.class));
      } catch(IllegalArgumentException e) {
      }
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, InstitutionDownError.class));
      } catch(IllegalArgumentException e) {
      }
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, InstitutionUnavailableError.class));
      } catch(IllegalArgumentException e) {
      }
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, InstitutionInactiveError.class));
      } catch(IllegalArgumentException e) {
      }
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, UnsupportedOperationError.class));
      } catch(IllegalArgumentException e) {
      }
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, InvalidLinkError.class));
      } catch(IllegalArgumentException e) {
      }
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, UnconfirmedLinkError.class));
      } catch(IllegalArgumentException e) {
      }
      throw new JsonParseException(p, "Failed to deserialize");
    }
  }
}
