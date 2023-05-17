package com.belvo.api.resources.links.requests;

import com.belvo.api.types.EnumLinkAccessModeRequest;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(
    builder = LinksRequest.Builder.class
)
public final class LinksRequest {
  private final Optional<String> omit;

  private final Optional<String> fields;

  private final String institution;

  private final String username;

  private final Optional<String> password;

  private final Optional<String> externalId;

  private final Optional<String> username2;

  private final Optional<String> username3;

  private final Optional<String> password2;

  private final Optional<String> token;

  private final Optional<EnumLinkAccessModeRequest> accessMode;

  private final Optional<Boolean> fetchHistorical;

  private final Optional<String> credentialsStorage;

  private final Optional<String> usernameType;

  private final Optional<String> certificate;

  private final Optional<String> privateKey;

  private int _cachedHashCode;

  LinksRequest(Optional<String> omit, Optional<String> fields, String institution, String username,
      Optional<String> password, Optional<String> externalId, Optional<String> username2,
      Optional<String> username3, Optional<String> password2, Optional<String> token,
      Optional<EnumLinkAccessModeRequest> accessMode, Optional<Boolean> fetchHistorical,
      Optional<String> credentialsStorage, Optional<String> usernameType,
      Optional<String> certificate, Optional<String> privateKey) {
    this.omit = omit;
    this.fields = fields;
    this.institution = institution;
    this.username = username;
    this.password = password;
    this.externalId = externalId;
    this.username2 = username2;
    this.username3 = username3;
    this.password2 = password2;
    this.token = token;
    this.accessMode = accessMode;
    this.fetchHistorical = fetchHistorical;
    this.credentialsStorage = credentialsStorage;
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
   * @return The Belvo name for the institution.
   */
  @JsonProperty("institution")
  public String getInstitution() {
    return institution;
  }

  /**
   * @return The end-user's username (or ID) used to log in to the institution.
   */
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  /**
   * @return The end-user's password used to log in to the institution.
   * <p>ℹ️ <strong>Note</strong>: You must send through a password for all institutions except for IMSS (<code>imss_mx_employment</code>).</p>
   */
  @JsonProperty("password")
  public Optional<String> getPassword() {
    return password;
  }

  /**
   * @return An additional identifier for the link, provided by you, to store in the Belvo database. <strong>Cannot</strong> include any Personal Identifiable Information (PII). <strong>Must</strong> be at least three characters long.
   * <p>If we identify that the identifier contains PII, we will force a <code>null</code> value. For more information, see our <a href="https://developers.belvo.com/docs/link-creation-best-practices#adding-your-own-identifier">Link creation article</a>.</p>
   */
  @JsonProperty("external_id")
  public Optional<String> getExternalId() {
    return externalId;
  }

  /**
   * @return The end-user's second username (or email address) used to log in to the institution.
   * <p>ℹ️ This is only required by some institutions. To know which institutions require a second username, get the <a href="https://developers.belvo.com/reference/detailinstitution">details</a> for the institution and check the <code>form_fields</code> array in the response.</p>
   */
  @JsonProperty("username2")
  public Optional<String> getUsername2() {
    return username2;
  }

  /**
   * @return The end-user's third username used to log in to the institution.
   * <p>ℹ️ This is only required by some institutions. To know which institutions require a third username, get the <a href="https://developers.belvo.com/reference/detailinstitution">details</a> for the institution and check the <code>form_fields</code> array in the response.</p>
   */
  @JsonProperty("username3")
  public Optional<String> getUsername3() {
    return username3;
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
   * <p>We do not recommend sending the authentication token in the same request as registering the user. See our <a href="https://developers.belvo.com/docs/handling-2-factor-authentication">Handling multi-factor authentication</a> article for more information and best practices.</p>
   */
  @JsonProperty("token")
  public Optional<String> getToken() {
    return token;
  }

  @JsonProperty("access_mode")
  public Optional<EnumLinkAccessModeRequest> getAccessMode() {
    return accessMode;
  }

  /**
   * @return Indicates whether or not to retrieve historical information for the link or not. For links where <code>access_mode=single</code>, the default is <code>false</code>. For links where <code>access_mode=recurrent</code> this is hardcoded to <code>true</code>.
   */
  @JsonProperty("fetch_historical")
  public Optional<Boolean> getFetchHistorical() {
    return fetchHistorical;
  }

  /**
   * @return Indicates whether or not to store credentials (and the duration for which to store the credentials). By default, this is set to <code>store</code>. For links where <code>access_mode=recurrent</code>, this must be set to <code>store</code>.
   * <p>Choose either:</p>
   * <ul>
   * <li><code>store</code> to store credentials</li>
   * <li><code>nostore</code> to not store credentials</li>
   * <li><code>30d</code> to store credentials only for 30 days</li>
   * </ul>
   */
  @JsonProperty("credentials_storage")
  public Optional<String> getCredentialsStorage() {
    return credentialsStorage;
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
    return other instanceof LinksRequest && equalTo((LinksRequest) other);
  }

  private boolean equalTo(LinksRequest other) {
    return omit.equals(other.omit) && fields.equals(other.fields) && institution.equals(other.institution) && username.equals(other.username) && password.equals(other.password) && externalId.equals(other.externalId) && username2.equals(other.username2) && username3.equals(other.username3) && password2.equals(other.password2) && token.equals(other.token) && accessMode.equals(other.accessMode) && fetchHistorical.equals(other.fetchHistorical) && credentialsStorage.equals(other.credentialsStorage) && usernameType.equals(other.usernameType) && certificate.equals(other.certificate) && privateKey.equals(other.privateKey);
  }

  @Override
  public int hashCode() {
    if (_cachedHashCode == 0) {
      _cachedHashCode = Objects.hash(this.omit, this.fields, this.institution, this.username, this.password, this.externalId, this.username2, this.username3, this.password2, this.token, this.accessMode, this.fetchHistorical, this.credentialsStorage, this.usernameType, this.certificate, this.privateKey);
    }
    return _cachedHashCode;
  }

  @Override
  public String toString() {
    return "LinksRequest{" + "omit: " + omit + ", fields: " + fields + ", institution: " + institution + ", username: " + username + ", password: " + password + ", externalId: " + externalId + ", username2: " + username2 + ", username3: " + username3 + ", password2: " + password2 + ", token: " + token + ", accessMode: " + accessMode + ", fetchHistorical: " + fetchHistorical + ", credentialsStorage: " + credentialsStorage + ", usernameType: " + usernameType + ", certificate: " + certificate + ", privateKey: " + privateKey + "}";
  }

  public static InstitutionStage builder() {
    return new Builder();
  }

  public interface InstitutionStage {
    UsernameStage institution(String institution);

    Builder from(LinksRequest other);
  }

  public interface UsernameStage {
    _FinalStage username(String username);
  }

  public interface _FinalStage {
    LinksRequest build();

    _FinalStage omit(Optional<String> omit);

    _FinalStage omit(String omit);

    _FinalStage fields(Optional<String> fields);

    _FinalStage fields(String fields);

    _FinalStage password(Optional<String> password);

    _FinalStage password(String password);

    _FinalStage externalId(Optional<String> externalId);

    _FinalStage externalId(String externalId);

    _FinalStage username2(Optional<String> username2);

    _FinalStage username2(String username2);

    _FinalStage username3(Optional<String> username3);

    _FinalStage username3(String username3);

    _FinalStage password2(Optional<String> password2);

    _FinalStage password2(String password2);

    _FinalStage token(Optional<String> token);

    _FinalStage token(String token);

    _FinalStage accessMode(Optional<EnumLinkAccessModeRequest> accessMode);

    _FinalStage accessMode(EnumLinkAccessModeRequest accessMode);

    _FinalStage fetchHistorical(Optional<Boolean> fetchHistorical);

    _FinalStage fetchHistorical(Boolean fetchHistorical);

    _FinalStage credentialsStorage(Optional<String> credentialsStorage);

    _FinalStage credentialsStorage(String credentialsStorage);

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
  public static final class Builder implements InstitutionStage, UsernameStage, _FinalStage {
    private String institution;

    private String username;

    private Optional<String> privateKey = Optional.empty();

    private Optional<String> certificate = Optional.empty();

    private Optional<String> usernameType = Optional.empty();

    private Optional<String> credentialsStorage = Optional.empty();

    private Optional<Boolean> fetchHistorical = Optional.empty();

    private Optional<EnumLinkAccessModeRequest> accessMode = Optional.empty();

    private Optional<String> token = Optional.empty();

    private Optional<String> password2 = Optional.empty();

    private Optional<String> username3 = Optional.empty();

    private Optional<String> username2 = Optional.empty();

    private Optional<String> externalId = Optional.empty();

    private Optional<String> password = Optional.empty();

    private Optional<String> fields = Optional.empty();

    private Optional<String> omit = Optional.empty();

    private Builder() {
    }

    @Override
    public Builder from(LinksRequest other) {
      omit(other.getOmit());
      fields(other.getFields());
      institution(other.getInstitution());
      username(other.getUsername());
      password(other.getPassword());
      externalId(other.getExternalId());
      username2(other.getUsername2());
      username3(other.getUsername3());
      password2(other.getPassword2());
      token(other.getToken());
      accessMode(other.getAccessMode());
      fetchHistorical(other.getFetchHistorical());
      credentialsStorage(other.getCredentialsStorage());
      usernameType(other.getUsernameType());
      certificate(other.getCertificate());
      privateKey(other.getPrivateKey());
      return this;
    }

    /**
     * <p>The Belvo name for the institution.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("institution")
    public UsernameStage institution(String institution) {
      this.institution = institution;
      return this;
    }

    /**
     * <p>The end-user's username (or ID) used to log in to the institution.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    @JsonSetter("username")
    public _FinalStage username(String username) {
      this.username = username;
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
     * <p>Indicates whether or not to store credentials (and the duration for which to store the credentials). By default, this is set to <code>store</code>. For links where <code>access_mode=recurrent</code>, this must be set to <code>store</code>.</p>
     * <p>Choose either:</p>
     * <ul>
     * <li><code>store</code> to store credentials</li>
     * <li><code>nostore</code> to not store credentials</li>
     * <li><code>30d</code> to store credentials only for 30 days</li>
     * </ul>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage credentialsStorage(String credentialsStorage) {
      this.credentialsStorage = Optional.of(credentialsStorage);
      return this;
    }

    @Override
    @JsonSetter(
        value = "credentials_storage",
        nulls = Nulls.SKIP
    )
    public _FinalStage credentialsStorage(Optional<String> credentialsStorage) {
      this.credentialsStorage = credentialsStorage;
      return this;
    }

    /**
     * <p>Indicates whether or not to retrieve historical information for the link or not. For links where <code>access_mode=single</code>, the default is <code>false</code>. For links where <code>access_mode=recurrent</code> this is hardcoded to <code>true</code>.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage fetchHistorical(Boolean fetchHistorical) {
      this.fetchHistorical = Optional.of(fetchHistorical);
      return this;
    }

    @Override
    @JsonSetter(
        value = "fetch_historical",
        nulls = Nulls.SKIP
    )
    public _FinalStage fetchHistorical(Optional<Boolean> fetchHistorical) {
      this.fetchHistorical = fetchHistorical;
      return this;
    }

    @Override
    public _FinalStage accessMode(EnumLinkAccessModeRequest accessMode) {
      this.accessMode = Optional.of(accessMode);
      return this;
    }

    @Override
    @JsonSetter(
        value = "access_mode",
        nulls = Nulls.SKIP
    )
    public _FinalStage accessMode(Optional<EnumLinkAccessModeRequest> accessMode) {
      this.accessMode = accessMode;
      return this;
    }

    /**
     * <p>The MFA token required by the bank to log in.</p>
     * <p>We do not recommend sending the authentication token in the same request as registering the user. See our <a href="https://developers.belvo.com/docs/handling-2-factor-authentication">Handling multi-factor authentication</a> article for more information and best practices.</p>
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
     * <p>The end-user's third username used to log in to the institution.</p>
     * <p>ℹ️ This is only required by some institutions. To know which institutions require a third username, get the <a href="https://developers.belvo.com/reference/detailinstitution">details</a> for the institution and check the <code>form_fields</code> array in the response.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage username3(String username3) {
      this.username3 = Optional.of(username3);
      return this;
    }

    @Override
    @JsonSetter(
        value = "username3",
        nulls = Nulls.SKIP
    )
    public _FinalStage username3(Optional<String> username3) {
      this.username3 = username3;
      return this;
    }

    /**
     * <p>The end-user's second username (or email address) used to log in to the institution.</p>
     * <p>ℹ️ This is only required by some institutions. To know which institutions require a second username, get the <a href="https://developers.belvo.com/reference/detailinstitution">details</a> for the institution and check the <code>form_fields</code> array in the response.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage username2(String username2) {
      this.username2 = Optional.of(username2);
      return this;
    }

    @Override
    @JsonSetter(
        value = "username2",
        nulls = Nulls.SKIP
    )
    public _FinalStage username2(Optional<String> username2) {
      this.username2 = username2;
      return this;
    }

    /**
     * <p>An additional identifier for the link, provided by you, to store in the Belvo database. <strong>Cannot</strong> include any Personal Identifiable Information (PII). <strong>Must</strong> be at least three characters long.</p>
     * <p>If we identify that the identifier contains PII, we will force a <code>null</code> value. For more information, see our <a href="https://developers.belvo.com/docs/link-creation-best-practices#adding-your-own-identifier">Link creation article</a>.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage externalId(String externalId) {
      this.externalId = Optional.of(externalId);
      return this;
    }

    @Override
    @JsonSetter(
        value = "external_id",
        nulls = Nulls.SKIP
    )
    public _FinalStage externalId(Optional<String> externalId) {
      this.externalId = externalId;
      return this;
    }

    /**
     * <p>The end-user's password used to log in to the institution.</p>
     * <p>ℹ️ <strong>Note</strong>: You must send through a password for all institutions except for IMSS (<code>imss_mx_employment</code>).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @Override
    public _FinalStage password(String password) {
      this.password = Optional.of(password);
      return this;
    }

    @Override
    @JsonSetter(
        value = "password",
        nulls = Nulls.SKIP
    )
    public _FinalStage password(Optional<String> password) {
      this.password = password;
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
    public LinksRequest build() {
      return new LinksRequest(omit, fields, institution, username, password, externalId, username2, username3, password2, token, accessMode, fetchHistorical, credentialsStorage, usernameType, certificate, privateKey);
    }
  }
}
