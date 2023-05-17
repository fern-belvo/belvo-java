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
    using = CreateBankAccountResponse.Deserializer.class
)
public final class CreateBankAccountResponse {
  private final Object value;

  private final int type;

  private CreateBankAccountResponse(Object value, int type) {
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
    return other instanceof CreateBankAccountResponse && equalTo((CreateBankAccountResponse) other);
  }

  private boolean equalTo(CreateBankAccountResponse other) {
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

  public static CreateBankAccountResponse of(BankAccountOfpiResponse value) {
    return new CreateBankAccountResponse(value, 0);
  }

  public static CreateBankAccountResponse of(BankAccountBusinessPse value) {
    return new CreateBankAccountResponse(value, 1);
  }

  public interface Visitor<T> {
    T visit(BankAccountOfpiResponse value);

    T visit(BankAccountBusinessPse value);
  }

  static final class Deserializer extends StdDeserializer<CreateBankAccountResponse> {
    Deserializer() {
      super(CreateBankAccountResponse.class);
    }

    @Override
    public CreateBankAccountResponse deserialize(JsonParser p, DeserializationContext ctxt) throws
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
