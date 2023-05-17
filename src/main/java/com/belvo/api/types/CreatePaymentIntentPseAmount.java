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
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

@JsonDeserialize(
    using = CreatePaymentIntentPseAmount.Deserializer.class
)
public final class CreatePaymentIntentPseAmount {
  private final Object value;

  private final int type;

  private CreatePaymentIntentPseAmount(Object value, int type) {
    this.value = value;
    this.type = type;
  }

  @JsonValue
  public Object get() {
    return this.value;
  }

  public <T> T visit(Visitor<T> visitor) {
    if(this.type == 0) {
      return visitor.visit((String) this.value);
    } else if(this.type == 1) {
      return visitor.visit((int) this.value);
    }
    throw new IllegalStateException("Failed to visit value. This should never happen.");
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof CreatePaymentIntentPseAmount && equalTo((CreatePaymentIntentPseAmount) other);
  }

  private boolean equalTo(CreatePaymentIntentPseAmount other) {
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

  public static CreatePaymentIntentPseAmount of(String value) {
    return new CreatePaymentIntentPseAmount(value, 0);
  }

  public static CreatePaymentIntentPseAmount of(int value) {
    return new CreatePaymentIntentPseAmount(value, 1);
  }

  public interface Visitor<T> {
    T visit(String value);

    T visit(int value);
  }

  static final class Deserializer extends StdDeserializer<CreatePaymentIntentPseAmount> {
    Deserializer() {
      super(CreatePaymentIntentPseAmount.class);
    }

    @Override
    public CreatePaymentIntentPseAmount deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      Object value = p.readValueAs(Object.class);
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, String.class));
      } catch(IllegalArgumentException e) {
      }
      if (value instanceof Integer) {
        return of((Integer) value);
      }
      throw new JsonParseException(p, "Failed to deserialize");
    }
  }
}
