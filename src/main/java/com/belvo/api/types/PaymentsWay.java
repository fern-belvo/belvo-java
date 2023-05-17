package com.belvo.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

@JsonDeserialize(
    builder = PaymentsWay.Builder.class
)
public final class PaymentsWay {
  private final int terminalId;

  private final int formId;

  private int _cachedHashCode;

  PaymentsWay(int terminalId, int formId) {
    this.terminalId = terminalId;
    this.formId = formId;
  }

  /**
   * @return Your unique Payments Way terminal ID.
   * <p><strong>Note:</strong> Belvo provides you with the Payments Way terminal ID during your onboarding process. If you don't have one yet, just reach out to us at payments-info@belvo.com and we'll give you a hand with this. 🙂</p>
   */
  @JsonProperty("terminal_id")
  public int getTerminalId() {
    return terminalId;
  }

  /**
   * @return Your unique Payments Way form ID.
   * <p><strong>Note:</strong> Belvo provides you with the Payments Way form ID during your onboarding process. If you don't have one yet, just reach out to us at payments-info@belvo.com and we'll give you a hand with this. 🙂</p>
   */
  @JsonProperty("form_id")
  public int getFormId() {
    return formId;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof PaymentsWay && equalTo((PaymentsWay) other);
  }

  private boolean equalTo(PaymentsWay other) {
    return terminalId == other.terminalId && formId == other.formId;
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.terminalId, this.formId);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "PaymentsWay{" + "terminalId: " + terminalId + ", formId: " + formId + "}";
  }

  public static TerminalIdStage builder() {
    return new Builder();
  }

  public interface TerminalIdStage {
    FormIdStage terminalId(int terminalId);

    Builder from(PaymentsWay other);
  }

  public interface FormIdStage {
    _FinalStage formId(int formId);
  }

  public interface _FinalStage {
    PaymentsWay build();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements TerminalIdStage, FormIdStage, _FinalStage {
    private int terminalId;

    private int formId;

    private Builder() {
    }

    @Override
    public Builder from(PaymentsWay other) {
      terminalId(other.getTerminalId());
      formId(other.getFormId());
      return this;
    }

    /**
     * <p>Your unique Payments Way terminal ID.</p>
     * <p><strong>Note:</strong> Belvo provides you with the Payments Way terminal ID during your onboarding process. If you don't have one yet, just reach out to us at payments-info@belvo.com and we'll give you a hand with this. 🙂</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("terminal_id")
    public FormIdStage terminalId(int terminalId) {
      this.terminalId = terminalId;
      return this;
    }

    /**
     * <p>Your unique Payments Way form ID.</p>
     * <p><strong>Note:</strong> Belvo provides you with the Payments Way form ID during your onboarding process. If you don't have one yet, just reach out to us at payments-info@belvo.com and we'll give you a hand with this. 🙂</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("form_id")
    public _FinalStage formId(int formId) {
      this.formId = formId;
      return this;
    }

    @Override
    public PaymentsWay build() {
      return new PaymentsWay(terminalId, formId);
    }
  }
}
