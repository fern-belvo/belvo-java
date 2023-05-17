package com.belvo.api.resources.links.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = LinksPutRequest.Builder.class
)
public final class LinksPutRequest {
  private final Optional<String> omit;

  private final Optional<String> fields;

  private final String password;

  private final Optional<String> password2;

  private final Optional<String> token;

  private final Optional<String> usernameType;

  private final Optional<String> certificate;

  private final Optional<String> privateKey;

  private int _cachedHashCode;

  LinksPutRequest(Optional<String> omit, Optional<String> fields, String password,
      Optional<String> password2, Optional<String> token, Optional<String> usernameType,
      Optional<String> certificate, Optional<String> privateKey) {
    this.omit = omit;
    this.fields = fields;
    this.password = password;
    this.password2 = password2;
    this.token = token;
    this.usernameType = usernameType;
    this.certificate = certificate;
    this.privateKey = privateKey;
  }

  /**
   * @return Omit certain fields from being returned in the response. For more information, see our <a href="https://developers.belvo.com/docs/searching-and-filtering">Filtering responses</a> DevPortal article.
   */
  @JsonProperty("omit")
  public Optional<String> getOmit() {
    return omit;
  }

  /**
   * @return Return only the specified fields in the response. For more information, see our <a href="https://developers.belvo.com/docs/searching-and-filtering">Filtering responses</a> DevPortal article.
   */
  @JsonProperty("fields")
  public Optional<String> getFields() {
    return fields;
  }

  /**
   * @return The end-user's password used to log in to the institution.
   */
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  /**
   * @return The end-user's second password used to log in to the institution.
   * <p>ℹ️ This is only required by some institutions. To know which institutions require a second password, get the <a href="https://developers.belvo.com/reference/detailinstitution">details</a> for the institution and check the <code>form_fields</code> array in the response.</p>
   */
  @JsonProperty("password2")
  public Optional<String> getPassword2() {
    return password2;
  }

  /**
   * @return The MFA token required by the bank to log in.
   */
  @JsonProperty("token")
  public Optional<String> getToken() {
    return token;
  }

  /**
   * @return Type of document to be used as a username.
   * <p>Some banking institutions accept different documents to be used as the <code>username</code> to login. For example, the <em>Cédula de Ciudadanía</em>, <em>Cédula de Extranjería</em>, <em>Pasaporte'</em>, and so on.</p>
   * <p>For banks that require a document to log in, you <strong>must</strong> provide the <code>username_type</code> parameter to specify which document is used when creating the link.</p>
   * <p>ℹ️ To know which institutions require the <code>username_type</code> parameter, get the <a href="https://developers.belvo.com/reference/detailinstitution">details</a> for the institution and check the <code>form_fields</code> array in the response.</p>
   * <p>For a list of standards codes, see the table below.</p>
   * <p>| Code | Description |
   * |-----------|-------|
   * | <code>001</code> | Cédula de Ciudadanía |
   * | <code>002</code> | Cédula de Extranjería |
   * | <code>003</code> | Pasaporte |
   * | <code>004</code> | Tarjeta de Identidad |
   * | <code>005</code> | Registro Civil |
   * | <code>006</code> | Número Identificación Personal |
   * | <code>020</code> | NIT |
   * | <code>021</code> | NIT Persona Natural |
   * | <code>022</code> | NIT Persona Extranjera |
   * | <code>023</code> | NIT Persona Jurídica |
   * | <code>024</code> | NIT Menores |
   * | <code>025</code> | NIT Desasociado |
   * | <code>030</code> | Trj. Seguro Social Extranjero |
   * | <code>031</code> | Sociedad Extranjera sin NIT en Colombia |
   * | <code>032</code> | Fideicomiso |
   * | <code>033</code> | RIF Venezuela |
   * | <code>034</code> | CIF |
   * | <code>035</code> | Número de Identidad |
   * | <code>036</code> | RTN |
   * | <code>037</code> | Cédula de Identidad |
   * | <code>038</code> | DIMEX |
   * | <code>039</code> | CED |
   * | <code>040</code> | PAS |
   * | <code>041</code> | Documento Único de Identidad |
   * | <code>042</code> | NIT Salvadoreño |
   * | <code>100</code> | Agência e conta |
   * | <code>101</code> | Código do operador |
   * | <code>102</code> | Cartão de crédito |
   * | <code>103</code> | CPF |</p>
   */
  @JsonProperty("username_type")
  public Optional<String> getUsernameType() {
    return usernameType;
  }

  /**
   * @return For certain fiscal institutions, it is possible to log in using a certificate and a private key, which enables a faster connection to the institution.
   * <p>Belvo supports a base64 encoded <code>certificate</code>. If the <code>certificate</code> parameter is used, you <em>must</em> also provide the <code>private_key</code> parameter.</p>
   */
  @JsonProperty("certificate")
  public Optional<String> getCertificate() {
    return certificate;
  }

  /**
   * @return For certain fiscal institutions, it is possible to log in using a certificate and a private key, which enables a faster connection to the institution.
   * <p>Belvo supports a base64 encoded <code>private_key</code>. If the <code>private_key</code> parameter is used, you <em>must</em> also provide the <code>certificate</code> parameter.</p>
   */
  @JsonProperty("private_key")
  public Optional<String> getPrivateKey() {
    return privateKey;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof LinksPutRequest && equalTo((LinksPutRequest) other);
  }

  private boolean equalTo(LinksPutRequest other) {
    return omit.equals(other.omit) && fields.equals(other.fields) && password.equals(other.password) && password2.equals(other.password2) && token.equals(other.token) && usernameType.equals(other.usernameType) && certificate.equals(other.certificate) && privateKey.equals(other.privateKey);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.omit, this.fields, this.password, this.password2, this.token, this.usernameType, this.certificate, this.privateKey);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "LinksPutRequest{" + "omit: " + omit + ", fields: " + fields + ", password: " + password + ", password2: " + password2 + ", token: " + token + ", usernameType: " + usernameType + ", certificate: " + certificate + ", privateKey: " + privateKey + "}";
  }

  public static PasswordStage builder() {
    return new Builder();
  }

  public interface PasswordStage {
    _FinalStage password(String password);

    Builder from(LinksPutRequest other);
  }

  public interface _FinalStage {
    LinksPutRequest build();

    _FinalStage omit(Optional<String> omit);

    _FinalStage omit(String omit);

    _FinalStage fields(Optional<String> fields);

    _FinalStage fields(String fields);

    _FinalStage password2(Optional<String> password2);

    _FinalStage password2(String password2);

    _FinalStage token(Optional<String> token);

    _FinalStage token(String token);

    _FinalStage usernameType(Optional<String> usernameType);

    _FinalStage usernameType(String usernameType);

    _FinalStage certificate(Optional<String> certificate);

    _FinalStage certificate(String certificate);

    _FinalStage privateKey(Optional<String> privateKey);

    _FinalStage privateKey(String privateKey);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements PasswordStage, _FinalStage {
    private String password;

    private Optional<String> privateKey = Optional.empty();

    private Optional<String> certificate = Optional.empty();

    private Optional<String> usernameType = Optional.empty();

    private Optional<String> token = Optional.empty();

    private Optional<String> password2 = Optional.empty();

    private Optional<String> fields = Optional.empty();

    private Optional<String> omit = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(LinksPutRequest other) {
      omit(other.getOmit());
      fields(other.getFields());
      password(other.getPassword());
      password2(other.getPassword2());
      token(other.getToken());
      usernameType(other.getUsernameType());
      certificate(other.getCertificate());
      privateKey(other.getPrivateKey());
      return this;
    }

    /**
     * <p>The end-user's password used to log in to the institution.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("password")
    public _FinalStage password(String password) {
      this.password = password;
      return this;
    }

    /**
     * <p>For certain fiscal institutions, it is possible to log in using a certificate and a private key, which enables a faster connection to the institution.</p>
     * <p>Belvo supports a base64 encoded <code>private_key</code>. If the <code>private_key</code> parameter is used, you <em>must</em> also provide the <code>certificate</code> parameter.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage privateKey(String privateKey) {
      this.privateKey = Optional.of(privateKey);
      return this;
    }

    @Override
    @JsonSetter(
        value = "private_key",
        nulls = Nulls.SKIP
    )
    public _FinalStage privateKey(Optional<String> privateKey) {
      this.privateKey = privateKey;
      return this;
    }

    /**
     * <p>For certain fiscal institutions, it is possible to log in using a certificate and a private key, which enables a faster connection to the institution.</p>
     * <p>Belvo supports a base64 encoded <code>certificate</code>. If the <code>certificate</code> parameter is used, you <em>must</em> also provide the <code>private_key</code> parameter.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage certificate(String certificate) {
      this.certificate = Optional.of(certificate);
      return this;
    }

    @Override
    @JsonSetter(
        value = "certificate",
        nulls = Nulls.SKIP
    )
    public _FinalStage certificate(Optional<String> certificate) {
      this.certificate = certificate;
      return this;
    }

    /**
     * <p>Type of document to be used as a username.</p>
     * <p>Some banking institutions accept different documents to be used as the <code>username</code> to login. For example, the <em>Cédula de Ciudadanía</em>, <em>Cédula de Extranjería</em>, <em>Pasaporte'</em>, and so on.</p>
     * <p>For banks that require a document to log in, you <strong>must</strong> provide the <code>username_type</code> parameter to specify which document is used when creating the link.</p>
     * <p>ℹ️ To know which institutions require the <code>username_type</code> parameter, get the <a href="https://developers.belvo.com/reference/detailinstitution">details</a> for the institution and check the <code>form_fields</code> array in the response.</p>
     * <p>For a list of standards codes, see the table below.</p>
     * <p>| Code | Description |
     * |-----------|-------|
     * | <code>001</code> | Cédula de Ciudadanía |
     * | <code>002</code> | Cédula de Extranjería |
     * | <code>003</code> | Pasaporte |
     * | <code>004</code> | Tarjeta de Identidad |
     * | <code>005</code> | Registro Civil |
     * | <code>006</code> | Número Identificación Personal |
     * | <code>020</code> | NIT |
     * | <code>021</code> | NIT Persona Natural |
     * | <code>022</code> | NIT Persona Extranjera |
     * | <code>023</code> | NIT Persona Jurídica |
     * | <code>024</code> | NIT Menores |
     * | <code>025</code> | NIT Desasociado |
     * | <code>030</code> | Trj. Seguro Social Extranjero |
     * | <code>031</code> | Sociedad Extranjera sin NIT en Colombia |
     * | <code>032</code> | Fideicomiso |
     * | <code>033</code> | RIF Venezuela |
     * | <code>034</code> | CIF |
     * | <code>035</code> | Número de Identidad |
     * | <code>036</code> | RTN |
     * | <code>037</code> | Cédula de Identidad |
     * | <code>038</code> | DIMEX |
     * | <code>039</code> | CED |
     * | <code>040</code> | PAS |
     * | <code>041</code> | Documento Único de Identidad |
     * | <code>042</code> | NIT Salvadoreño |
     * | <code>100</code> | Agência e conta |
     * | <code>101</code> | Código do operador |
     * | <code>102</code> | Cartão de crédito |
     * | <code>103</code> | CPF |</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage usernameType(String usernameType) {
      this.usernameType = Optional.of(usernameType);
      return this;
    }

    @Override
    @JsonSetter(
        value = "username_type",
        nulls = Nulls.SKIP
    )
    public _FinalStage usernameType(Optional<String> usernameType) {
      this.usernameType = usernameType;
      return this;
    }

    /**
     * <p>The MFA token required by the bank to log in.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage token(String token) {
      this.token = Optional.of(token);
      return this;
    }

    @Override
    @JsonSetter(
        value = "token",
        nulls = Nulls.SKIP
    )
    public _FinalStage token(Optional<String> token) {
      this.token = token;
      return this;
    }

    /**
     * <p>The end-user's second password used to log in to the institution.</p>
     * <p>ℹ️ This is only required by some institutions. To know which institutions require a second password, get the <a href="https://developers.belvo.com/reference/detailinstitution">details</a> for the institution and check the <code>form_fields</code> array in the response.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage password2(String password2) {
      this.password2 = Optional.of(password2);
      return this;
    }

    @Override
    @JsonSetter(
        value = "password2",
        nulls = Nulls.SKIP
    )
    public _FinalStage password2(Optional<String> password2) {
      this.password2 = password2;
      return this;
    }

    /**
     * <p>Return only the specified fields in the response. For more information, see our <a href="https://developers.belvo.com/docs/searching-and-filtering">Filtering responses</a> DevPortal article.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage fields(String fields) {
      this.fields = Optional.of(fields);
      return this;
    }

    @Override
    @JsonSetter(
        value = "fields",
        nulls = Nulls.SKIP
    )
    public _FinalStage fields(Optional<String> fields) {
      this.fields = fields;
      return this;
    }

    /**
     * <p>Omit certain fields from being returned in the response. For more information, see our <a href="https://developers.belvo.com/docs/searching-and-filtering">Filtering responses</a> DevPortal article.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage omit(String omit) {
      this.omit = Optional.of(omit);
      return this;
    }

    @Override
    @JsonSetter(
        value = "omit",
        nulls = Nulls.SKIP
    )
    public _FinalStage omit(Optional<String> omit) {
      this.omit = omit;
      return this;
    }

    @Override
    public LinksPutRequest build() {
      return new LinksPutRequest(omit, fields, password, password2, token, usernameType, certificate, privateKey);
    }
  }
}
