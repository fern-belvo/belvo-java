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
    using = DetailTaxReturnResponse.Deserializer.class
)
public final class DetailTaxReturnResponse {
  private final Object value;

  private final int type;

  private DetailTaxReturnResponse(Object value, int type) {
    this.value = value;
    this.type = type;
  }

  @JsonValue
  public Object get() {
    return this.value;
  }

  public <T> T visit(Visitor<T> visitor) {
    if(this.type == 0) {
      return visitor.visit((TaxReturnPersonal) this.value);
    } else if(this.type == 1) {
      return visitor.visit((TaxReturnPersonalMonthly) this.value);
    } else if(this.type == 2) {
      return visitor.visit((TaxReturnBusiness) this.value);
    } else if(this.type == 3) {
      return visitor.visit((TaxReturnBusinessMonthly) this.value);
    }
    throw new IllegalStateException("Failed to visit value. This should never happen.");
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof DetailTaxReturnResponse && equalTo((DetailTaxReturnResponse) other);
  }

  private boolean equalTo(DetailTaxReturnResponse other) {
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

  public static DetailTaxReturnResponse of(TaxReturnPersonal value) {
    return new DetailTaxReturnResponse(value, 0);
  }

  public static DetailTaxReturnResponse of(TaxReturnPersonalMonthly value) {
    return new DetailTaxReturnResponse(value, 1);
  }

  public static DetailTaxReturnResponse of(TaxReturnBusiness value) {
    return new DetailTaxReturnResponse(value, 2);
  }

  public static DetailTaxReturnResponse of(TaxReturnBusinessMonthly value) {
    return new DetailTaxReturnResponse(value, 3);
  }

  public interface Visitor<T> {
    T visit(TaxReturnPersonal value);

    T visit(TaxReturnPersonalMonthly value);

    T visit(TaxReturnBusiness value);

    T visit(TaxReturnBusinessMonthly value);
  }

  static final class Deserializer extends StdDeserializer<DetailTaxReturnResponse> {
    Deserializer() {
      super(DetailTaxReturnResponse.class);
    }

    @Override
    public DetailTaxReturnResponse deserialize(JsonParser p, DeserializationContext ctxt) throws
        IOException {
      Object value = p.readValueAs(Object.class);
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, TaxReturnPersonal.class));
      } catch(IllegalArgumentException e) {
      }
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, TaxReturnPersonalMonthly.class));
      } catch(IllegalArgumentException e) {
      }
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, TaxReturnBusiness.class));
      } catch(IllegalArgumentException e) {
      }
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, TaxReturnBusinessMonthly.class));
      } catch(IllegalArgumentException e) {
      }
      throw new JsonParseException(p, "Failed to deserialize");
    }
  }
}
