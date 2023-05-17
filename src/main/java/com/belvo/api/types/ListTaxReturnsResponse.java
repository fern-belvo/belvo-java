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
    using = ListTaxReturnsResponse.Deserializer.class
)
public final class ListTaxReturnsResponse {
  private final Object value;

  private final int type;

  private ListTaxReturnsResponse(Object value, int type) {
    this.value = value;
    this.type = type;
  }

  @JsonValue
  public Object get() {
    return this.value;
  }

  public <T> T visit(Visitor<T> visitor) {
    if(this.type == 0) {
      return visitor.visit((TaxReturnsPersonalPaginated) this.value);
    } else if(this.type == 1) {
      return visitor.visit((TaxReturnsPersonalMonthlyPaginated) this.value);
    } else if(this.type == 2) {
      return visitor.visit((TaxReturnsBusinessPaginated) this.value);
    } else if(this.type == 3) {
      return visitor.visit((TaxReturnsBusinessMonthlyPaginated) this.value);
    }
    throw new IllegalStateException("Failed to visit value. This should never happen.");
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof ListTaxReturnsResponse && equalTo((ListTaxReturnsResponse) other);
  }

  private boolean equalTo(ListTaxReturnsResponse other) {
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

  public static ListTaxReturnsResponse of(TaxReturnsPersonalPaginated value) {
    return new ListTaxReturnsResponse(value, 0);
  }

  public static ListTaxReturnsResponse of(TaxReturnsPersonalMonthlyPaginated value) {
    return new ListTaxReturnsResponse(value, 1);
  }

  public static ListTaxReturnsResponse of(TaxReturnsBusinessPaginated value) {
    return new ListTaxReturnsResponse(value, 2);
  }

  public static ListTaxReturnsResponse of(TaxReturnsBusinessMonthlyPaginated value) {
    return new ListTaxReturnsResponse(value, 3);
  }

  public interface Visitor<T> {
    T visit(TaxReturnsPersonalPaginated value);

    T visit(TaxReturnsPersonalMonthlyPaginated value);

    T visit(TaxReturnsBusinessPaginated value);

    T visit(TaxReturnsBusinessMonthlyPaginated value);
  }

  static final class Deserializer extends StdDeserializer<ListTaxReturnsResponse> {
    Deserializer() {
      super(ListTaxReturnsResponse.class);
    }

    @Override
    public ListTaxReturnsResponse deserialize(JsonParser p, DeserializationContext ctxt) throws
        IOException {
      Object value = p.readValueAs(Object.class);
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, TaxReturnsPersonalPaginated.class));
      } catch(IllegalArgumentException e) {
      }
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, TaxReturnsPersonalMonthlyPaginated.class));
      } catch(IllegalArgumentException e) {
      }
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, TaxReturnsBusinessPaginated.class));
      } catch(IllegalArgumentException e) {
      }
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, TaxReturnsBusinessMonthlyPaginated.class));
      } catch(IllegalArgumentException e) {
      }
      throw new JsonParseException(p, "Failed to deserialize");
    }
  }
}
