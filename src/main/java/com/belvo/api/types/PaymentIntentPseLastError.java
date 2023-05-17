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
    using = PaymentIntentPseLastError.Deserializer.class
)
public final class PaymentIntentPseLastError {
  private final Object value;

  private final int type;

  private PaymentIntentPseLastError(Object value, int type) {
    this.value = value;
    this.type = type;
  }

  @JsonValue
  public Object get() {
    return this.value;
  }

  public <T> T visit(Visitor<T> visitor) {
    if(this.type == 0) {
      return visitor.visit((LastErrorInvalidCredentials) this.value);
    } else if(this.type == 1) {
      return visitor.visit((LastErrorInvalidToken) this.value);
    } else if(this.type == 2) {
      return visitor.visit((LastErrorLoginError) this.value);
    } else if(this.type == 3) {
      return visitor.visit((LastErrorTwoFactor) this.value);
    } else if(this.type == 4) {
      return visitor.visit((LastErrorPaymentError) this.value);
    } else if(this.type == 5) {
      return visitor.visit((LastErrorSessionExpired) this.value);
    }
    throw new IllegalStateException("Failed to visit value. This should never happen.");
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof PaymentIntentPseLastError && equalTo((PaymentIntentPseLastError) other);
  }

  private boolean equalTo(PaymentIntentPseLastError other) {
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

  public static PaymentIntentPseLastError of(LastErrorInvalidCredentials value) {
    return new PaymentIntentPseLastError(value, 0);
  }

  public static PaymentIntentPseLastError of(LastErrorInvalidToken value) {
    return new PaymentIntentPseLastError(value, 1);
  }

  public static PaymentIntentPseLastError of(LastErrorLoginError value) {
    return new PaymentIntentPseLastError(value, 2);
  }

  public static PaymentIntentPseLastError of(LastErrorTwoFactor value) {
    return new PaymentIntentPseLastError(value, 3);
  }

  public static PaymentIntentPseLastError of(LastErrorPaymentError value) {
    return new PaymentIntentPseLastError(value, 4);
  }

  public static PaymentIntentPseLastError of(LastErrorSessionExpired value) {
    return new PaymentIntentPseLastError(value, 5);
  }

  public interface Visitor<T> {
    T visit(LastErrorInvalidCredentials value);

    T visit(LastErrorInvalidToken value);

    T visit(LastErrorLoginError value);

    T visit(LastErrorTwoFactor value);

    T visit(LastErrorPaymentError value);

    T visit(LastErrorSessionExpired value);
  }

  static final class Deserializer extends StdDeserializer<PaymentIntentPseLastError> {
    Deserializer() {
      super(PaymentIntentPseLastError.class);
    }

    @Override
    public PaymentIntentPseLastError deserialize(JsonParser p, DeserializationContext ctxt) throws
        IOException {
      Object value = p.readValueAs(Object.class);
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, LastErrorInvalidCredentials.class));
      } catch(IllegalArgumentException e) {
      }
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, LastErrorInvalidToken.class));
      } catch(IllegalArgumentException e) {
      }
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, LastErrorLoginError.class));
      } catch(IllegalArgumentException e) {
      }
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, LastErrorTwoFactor.class));
      } catch(IllegalArgumentException e) {
      }
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, LastErrorPaymentError.class));
      } catch(IllegalArgumentException e) {
      }
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, LastErrorSessionExpired.class));
      } catch(IllegalArgumentException e) {
      }
      throw new JsonParseException(p, "Failed to deserialize");
    }
  }
}
