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
    using = TransactionBankAccountPse.Deserializer.class
)
public final class TransactionBankAccountPse {
  private final Object value;

  private final int type;

  private TransactionBankAccountPse(Object value, int type) {
    this.value = value;
    this.type = type;
  }

  @JsonValue
  public Object get() {
    return this.value;
  }

  public <T> T visit(Visitor<T> visitor) {
    if(this.type == 0) {
      return visitor.visit((TransactionBankAccountBodyPse) this.value);
    } else if(this.type == 1) {
      return visitor.visit((BankAccountInformationPse) this.value);
    }
    throw new IllegalStateException("Failed to visit value. This should never happen.");
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof TransactionBankAccountPse && equalTo((TransactionBankAccountPse) other);
  }

  private boolean equalTo(TransactionBankAccountPse other) {
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

  public static TransactionBankAccountPse of(TransactionBankAccountBodyPse value) {
    return new TransactionBankAccountPse(value, 0);
  }

  public static TransactionBankAccountPse of(BankAccountInformationPse value) {
    return new TransactionBankAccountPse(value, 1);
  }

  public interface Visitor<T> {
    T visit(TransactionBankAccountBodyPse value);

    T visit(BankAccountInformationPse value);
  }

  static final class Deserializer extends StdDeserializer<TransactionBankAccountPse> {
    Deserializer() {
      super(TransactionBankAccountPse.class);
    }

    @Override
    public TransactionBankAccountPse deserialize(JsonParser p, DeserializationContext ctxt) throws
        IOException {
      Object value = p.readValueAs(Object.class);
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, TransactionBankAccountBodyPse.class));
      } catch(IllegalArgumentException e) {
      }
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, BankAccountInformationPse.class));
      } catch(IllegalArgumentException e) {
      }
      throw new JsonParseException(p, "Failed to deserialize");
    }
  }
}
