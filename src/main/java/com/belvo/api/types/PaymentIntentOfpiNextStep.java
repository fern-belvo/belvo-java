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
    using = PaymentIntentOfpiNextStep.Deserializer.class
)
public final class PaymentIntentOfpiNextStep {
  private final Object value;

  private final int type;

  private PaymentIntentOfpiNextStep(Object value, int type) {
    this.value = value;
    this.type = type;
  }

  @JsonValue
  public Object get() {
    return this.value;
  }

  public <T> T visit(Visitor<T> visitor) {
    if(this.type == 0) {
      return visitor.visit((NextStepDisplayPaymentMethodInformation) this.value);
    } else if(this.type == 1) {
      return visitor.visit((NextStepNeedsRedirect) this.value);
    } else if(this.type == 2) {
      return visitor.visit((NextStepDisplayConfirmationRequiredOfpi) this.value);
    } else if(this.type == 3) {
      return visitor.visit((NextStepDisplayPaymentProcessing) this.value);
    } else if(this.type == 4) {
      return visitor.visit((NextStepDisplayPaymentSucceeded) this.value);
    } else if(this.type == 5) {
      return visitor.visit((NextStepDisplayPaymentFailed) this.value);
    }
    throw new IllegalStateException("Failed to visit value. This should never happen.");
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof PaymentIntentOfpiNextStep && equalTo((PaymentIntentOfpiNextStep) other);
  }

  private boolean equalTo(PaymentIntentOfpiNextStep other) {
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

  public static PaymentIntentOfpiNextStep of(NextStepDisplayPaymentMethodInformation value) {
    return new PaymentIntentOfpiNextStep(value, 0);
  }

  public static PaymentIntentOfpiNextStep of(NextStepNeedsRedirect value) {
    return new PaymentIntentOfpiNextStep(value, 1);
  }

  public static PaymentIntentOfpiNextStep of(NextStepDisplayConfirmationRequiredOfpi value) {
    return new PaymentIntentOfpiNextStep(value, 2);
  }

  public static PaymentIntentOfpiNextStep of(NextStepDisplayPaymentProcessing value) {
    return new PaymentIntentOfpiNextStep(value, 3);
  }

  public static PaymentIntentOfpiNextStep of(NextStepDisplayPaymentSucceeded value) {
    return new PaymentIntentOfpiNextStep(value, 4);
  }

  public static PaymentIntentOfpiNextStep of(NextStepDisplayPaymentFailed value) {
    return new PaymentIntentOfpiNextStep(value, 5);
  }

  public interface Visitor<T> {
    T visit(NextStepDisplayPaymentMethodInformation value);

    T visit(NextStepNeedsRedirect value);

    T visit(NextStepDisplayConfirmationRequiredOfpi value);

    T visit(NextStepDisplayPaymentProcessing value);

    T visit(NextStepDisplayPaymentSucceeded value);

    T visit(NextStepDisplayPaymentFailed value);
  }

  static final class Deserializer extends StdDeserializer<PaymentIntentOfpiNextStep> {
    Deserializer() {
      super(PaymentIntentOfpiNextStep.class);
    }

    @Override
    public PaymentIntentOfpiNextStep deserialize(JsonParser p, DeserializationContext ctxt) throws
        IOException {
      Object value = p.readValueAs(Object.class);
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, NextStepDisplayPaymentMethodInformation.class));
      } catch(IllegalArgumentException e) {
      }
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, NextStepNeedsRedirect.class));
      } catch(IllegalArgumentException e) {
      }
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, NextStepDisplayConfirmationRequiredOfpi.class));
      } catch(IllegalArgumentException e) {
      }
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, NextStepDisplayPaymentProcessing.class));
      } catch(IllegalArgumentException e) {
      }
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, NextStepDisplayPaymentSucceeded.class));
      } catch(IllegalArgumentException e) {
      }
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, NextStepDisplayPaymentFailed.class));
      } catch(IllegalArgumentException e) {
      }
      throw new JsonParseException(p, "Failed to deserialize");
    }
  }
}
