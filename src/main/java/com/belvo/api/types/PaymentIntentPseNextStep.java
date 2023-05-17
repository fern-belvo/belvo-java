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
    using = PaymentIntentPseNextStep.Deserializer.class
)
public final class PaymentIntentPseNextStep {
  private final Object value;

  private final int type;

  private PaymentIntentPseNextStep(Object value, int type) {
    this.value = value;
    this.type = type;
  }

  @JsonValue
  public Object get() {
    return this.value;
  }

  public <T> T visit(Visitor<T> visitor) {
    if(this.type == 0) {
      return visitor.visit((NextStepDisplayPaymentMethodInformationPse) this.value);
    } else if(this.type == 1) {
      return visitor.visit((NextStepDisplayCredentialsRequiredPse) this.value);
    } else if(this.type == 2) {
      return visitor.visit((NextStepDisplayNeedsRedirectPse) this.value);
    } else if(this.type == 3) {
      return visitor.visit((NextStepDisplayTokenRequiredPse) this.value);
    } else if(this.type == 4) {
      return visitor.visit((NextStepDisplayCustomerBankAccountsPse) this.value);
    } else if(this.type == 5) {
      return visitor.visit((NextStepDisplayConfirmationRequiredPse) this.value);
    }
    throw new IllegalStateException("Failed to visit value. This should never happen.");
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof PaymentIntentPseNextStep && equalTo((PaymentIntentPseNextStep) other);
  }

  private boolean equalTo(PaymentIntentPseNextStep other) {
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

  public static PaymentIntentPseNextStep of(NextStepDisplayPaymentMethodInformationPse value) {
    return new PaymentIntentPseNextStep(value, 0);
  }

  public static PaymentIntentPseNextStep of(NextStepDisplayCredentialsRequiredPse value) {
    return new PaymentIntentPseNextStep(value, 1);
  }

  public static PaymentIntentPseNextStep of(NextStepDisplayNeedsRedirectPse value) {
    return new PaymentIntentPseNextStep(value, 2);
  }

  public static PaymentIntentPseNextStep of(NextStepDisplayTokenRequiredPse value) {
    return new PaymentIntentPseNextStep(value, 3);
  }

  public static PaymentIntentPseNextStep of(NextStepDisplayCustomerBankAccountsPse value) {
    return new PaymentIntentPseNextStep(value, 4);
  }

  public static PaymentIntentPseNextStep of(NextStepDisplayConfirmationRequiredPse value) {
    return new PaymentIntentPseNextStep(value, 5);
  }

  public interface Visitor<T> {
    T visit(NextStepDisplayPaymentMethodInformationPse value);

    T visit(NextStepDisplayCredentialsRequiredPse value);

    T visit(NextStepDisplayNeedsRedirectPse value);

    T visit(NextStepDisplayTokenRequiredPse value);

    T visit(NextStepDisplayCustomerBankAccountsPse value);

    T visit(NextStepDisplayConfirmationRequiredPse value);
  }

  static final class Deserializer extends StdDeserializer<PaymentIntentPseNextStep> {
    Deserializer() {
      super(PaymentIntentPseNextStep.class);
    }

    @Override
    public PaymentIntentPseNextStep deserialize(JsonParser p, DeserializationContext ctxt) throws
        IOException {
      Object value = p.readValueAs(Object.class);
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, NextStepDisplayPaymentMethodInformationPse.class));
      } catch(IllegalArgumentException e) {
      }
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, NextStepDisplayCredentialsRequiredPse.class));
      } catch(IllegalArgumentException e) {
      }
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, NextStepDisplayNeedsRedirectPse.class));
      } catch(IllegalArgumentException e) {
      }
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, NextStepDisplayTokenRequiredPse.class));
      } catch(IllegalArgumentException e) {
      }
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, NextStepDisplayCustomerBankAccountsPse.class));
      } catch(IllegalArgumentException e) {
      }
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, NextStepDisplayConfirmationRequiredPse.class));
      } catch(IllegalArgumentException e) {
      }
      throw new JsonParseException(p, "Failed to deserialize");
    }
  }
}
