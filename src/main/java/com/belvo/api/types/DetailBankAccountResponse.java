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
    using = DetailBankAccountResponse.Deserializer.class
)
public final class DetailBankAccountResponse {
  private final Object value;

  private final int type;

  private DetailBankAccountResponse(Object value, int type) {
    this.value = value;
    this.type = type;
  }

  @JsonValue
  public Object get() {
    return this.value;
  }

  public <T> T visit(Visitor<T> visitor) {
    if(this.type == 0) {
      return visitor.visit((BankAccountOfpiResponse) this.value);
    } else if(this.type == 1) {
      return visitor.visit((BankAccountBusinessPse) this.value);
    }
    throw new IllegalStateException("Failed to visit value. This should never happen.");
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof DetailBankAccountResponse && equalTo((DetailBankAccountResponse) other);
  }

  private boolean equalTo(DetailBankAccountResponse other) {
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

  public static DetailBankAccountResponse of(BankAccountOfpiResponse value) {
    return new DetailBankAccountResponse(value, 0);
  }

  public static DetailBankAccountResponse of(BankAccountBusinessPse value) {
    return new DetailBankAccountResponse(value, 1);
  }

  public interface Visitor<T> {
    T visit(BankAccountOfpiResponse value);

    T visit(BankAccountBusinessPse value);
  }

  static final class Deserializer extends StdDeserializer<DetailBankAccountResponse> {
    Deserializer() {
      super(DetailBankAccountResponse.class);
    }

    @Override
    public DetailBankAccountResponse deserialize(JsonParser p, DeserializationContext ctxt) throws
        IOException {
      Object value = p.readValueAs(Object.class);
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, BankAccountOfpiResponse.class));
      } catch(IllegalArgumentException e) {
      }
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, BankAccountBusinessPse.class));
      } catch(IllegalArgumentException e) {
      }
      throw new JsonParseException(p, "Failed to deserialize");
    }
  }
}
