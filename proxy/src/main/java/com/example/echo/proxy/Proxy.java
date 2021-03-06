/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2018-10-08 17:45:39 UTC)
 * on 2018-11-19 at 02:19:22 UTC 
 * Modify at your own risk.
 */

package com.example.echo.proxy;

/**
 * Service definition for Proxy (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link ProxyRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Proxy extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.25.0 of the proxy library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://proyectsoftwareii.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "proxy/v1/";

  /**
   * The default encoded batch path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.23
   */
  public static final String DEFAULT_BATCH_PATH = "batch";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Proxy(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Proxy(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the ProxyOperations collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code Proxy proxy = new Proxy(...);}
   *   {@code Proxy.ProxyOperations.List request = proxy.proxy().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public ProxyOperations proxy() {
    return new ProxyOperations();
  }

  /**
   * The "proxy" collection of methods.
   */
  public class ProxyOperations {

    /**
     * Create a request for the method "proxy.rellenarUsuarios".
     *
     * This request holds the parameters needed by the proxy server.  After setting any optional
     * parameters, call the {@link RellenarUsuarios#execute()} method to invoke the remote operation.
     *
     * @return the request
     */
    public RellenarUsuarios rellenarUsuarios() throws java.io.IOException {
      RellenarUsuarios result = new RellenarUsuarios();
      initialize(result);
      return result;
    }

    public class RellenarUsuarios extends ProxyRequest<Void> {

      private static final String REST_PATH = "rellenarUsuarios";

      /**
       * Create a request for the method "proxy.rellenarUsuarios".
       *
       * This request holds the parameters needed by the the proxy server.  After setting any optional
       * parameters, call the {@link RellenarUsuarios#execute()} method to invoke the remote operation.
       * <p> {@link RellenarUsuarios#initialize(com.google.api.client.googleapis.services.AbstractGoogle
       * ClientRequest)} must be called to initialize this instance immediately after invoking the
       * constructor. </p>
       *
       * @since 1.13
       */
      protected RellenarUsuarios() {
        super(Proxy.this, "POST", REST_PATH, null, Void.class);
      }

      @Override
      public RellenarUsuarios setAlt(java.lang.String alt) {
        return (RellenarUsuarios) super.setAlt(alt);
      }

      @Override
      public RellenarUsuarios setFields(java.lang.String fields) {
        return (RellenarUsuarios) super.setFields(fields);
      }

      @Override
      public RellenarUsuarios setKey(java.lang.String key) {
        return (RellenarUsuarios) super.setKey(key);
      }

      @Override
      public RellenarUsuarios setOauthToken(java.lang.String oauthToken) {
        return (RellenarUsuarios) super.setOauthToken(oauthToken);
      }

      @Override
      public RellenarUsuarios setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (RellenarUsuarios) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public RellenarUsuarios setQuotaUser(java.lang.String quotaUser) {
        return (RellenarUsuarios) super.setQuotaUser(quotaUser);
      }

      @Override
      public RellenarUsuarios setUserIp(java.lang.String userIp) {
        return (RellenarUsuarios) super.setUserIp(userIp);
      }

      @Override
      public RellenarUsuarios set(String parameterName, Object value) {
        return (RellenarUsuarios) super.set(parameterName, value);
      }
    }
    /**
     * Create a request for the method "proxy.verificarUsuario".
     *
     * This request holds the parameters needed by the proxy server.  After setting any optional
     * parameters, call the {@link VerificarUsuario#execute()} method to invoke the remote operation.
     *
     * @param correo
     * @param password
     * @return the request
     */
    public VerificarUsuario verificarUsuario(java.lang.String correo, java.lang.String password) throws java.io.IOException {
      VerificarUsuario result = new VerificarUsuario(correo, password);
      initialize(result);
      return result;
    }

    public class VerificarUsuario extends ProxyRequest<com.example.echo.proxy.model.TipoUsuario> {

      private static final String REST_PATH = "verificarUsuario/{correo}/{password}";

      /**
       * Create a request for the method "proxy.verificarUsuario".
       *
       * This request holds the parameters needed by the the proxy server.  After setting any optional
       * parameters, call the {@link VerificarUsuario#execute()} method to invoke the remote operation.
       * <p> {@link VerificarUsuario#initialize(com.google.api.client.googleapis.services.AbstractGoogle
       * ClientRequest)} must be called to initialize this instance immediately after invoking the
       * constructor. </p>
       *
       * @param correo
       * @param password
       * @since 1.13
       */
      protected VerificarUsuario(java.lang.String correo, java.lang.String password) {
        super(Proxy.this, "POST", REST_PATH, null, com.example.echo.proxy.model.TipoUsuario.class);
        this.correo = com.google.api.client.util.Preconditions.checkNotNull(correo, "Required parameter correo must be specified.");
        this.password = com.google.api.client.util.Preconditions.checkNotNull(password, "Required parameter password must be specified.");
      }

      @Override
      public VerificarUsuario setAlt(java.lang.String alt) {
        return (VerificarUsuario) super.setAlt(alt);
      }

      @Override
      public VerificarUsuario setFields(java.lang.String fields) {
        return (VerificarUsuario) super.setFields(fields);
      }

      @Override
      public VerificarUsuario setKey(java.lang.String key) {
        return (VerificarUsuario) super.setKey(key);
      }

      @Override
      public VerificarUsuario setOauthToken(java.lang.String oauthToken) {
        return (VerificarUsuario) super.setOauthToken(oauthToken);
      }

      @Override
      public VerificarUsuario setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (VerificarUsuario) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public VerificarUsuario setQuotaUser(java.lang.String quotaUser) {
        return (VerificarUsuario) super.setQuotaUser(quotaUser);
      }

      @Override
      public VerificarUsuario setUserIp(java.lang.String userIp) {
        return (VerificarUsuario) super.setUserIp(userIp);
      }

      @com.google.api.client.util.Key
      private java.lang.String correo;

      /**

       */
      public java.lang.String getCorreo() {
        return correo;
      }

      public VerificarUsuario setCorreo(java.lang.String correo) {
        this.correo = correo;
        return this;
      }

      @com.google.api.client.util.Key
      private java.lang.String password;

      /**

       */
      public java.lang.String getPassword() {
        return password;
      }

      public VerificarUsuario setPassword(java.lang.String password) {
        this.password = password;
        return this;
      }

      @Override
      public VerificarUsuario set(String parameterName, Object value) {
        return (VerificarUsuario) super.set(parameterName, value);
      }
    }

  }

  /**
   * Create a request for the method "iniciarsesion".
   *
   * This request holds the parameters needed by the proxy server.  After setting any optional
   * parameters, call the {@link Iniciarsesion#execute()} method to invoke the remote operation.
   *
   * @param correo
   * @param password
   * @return the request
   */
  public Iniciarsesion iniciarsesion(java.lang.String correo, java.lang.String password) throws java.io.IOException {
    Iniciarsesion result = new Iniciarsesion(correo, password);
    initialize(result);
    return result;
  }

  public class Iniciarsesion extends ProxyRequest<com.example.echo.proxy.model.Sesion> {

    private static final String REST_PATH = "iniciarSesion/{correo}/{password}";

    /**
     * Create a request for the method "iniciarsesion".
     *
     * This request holds the parameters needed by the the proxy server.  After setting any optional
     * parameters, call the {@link Iniciarsesion#execute()} method to invoke the remote operation. <p>
     * {@link Iniciarsesion#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientR
     * equest)} must be called to initialize this instance immediately after invoking the constructor.
     * </p>
     *
     * @param correo
     * @param password
     * @since 1.13
     */
    protected Iniciarsesion(java.lang.String correo, java.lang.String password) {
      super(Proxy.this, "POST", REST_PATH, null, com.example.echo.proxy.model.Sesion.class);
      this.correo = com.google.api.client.util.Preconditions.checkNotNull(correo, "Required parameter correo must be specified.");
      this.password = com.google.api.client.util.Preconditions.checkNotNull(password, "Required parameter password must be specified.");
    }

    @Override
    public Iniciarsesion setAlt(java.lang.String alt) {
      return (Iniciarsesion) super.setAlt(alt);
    }

    @Override
    public Iniciarsesion setFields(java.lang.String fields) {
      return (Iniciarsesion) super.setFields(fields);
    }

    @Override
    public Iniciarsesion setKey(java.lang.String key) {
      return (Iniciarsesion) super.setKey(key);
    }

    @Override
    public Iniciarsesion setOauthToken(java.lang.String oauthToken) {
      return (Iniciarsesion) super.setOauthToken(oauthToken);
    }

    @Override
    public Iniciarsesion setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (Iniciarsesion) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public Iniciarsesion setQuotaUser(java.lang.String quotaUser) {
      return (Iniciarsesion) super.setQuotaUser(quotaUser);
    }

    @Override
    public Iniciarsesion setUserIp(java.lang.String userIp) {
      return (Iniciarsesion) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String correo;

    /**

     */
    public java.lang.String getCorreo() {
      return correo;
    }

    public Iniciarsesion setCorreo(java.lang.String correo) {
      this.correo = correo;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.String password;

    /**

     */
    public java.lang.String getPassword() {
      return password;
    }

    public Iniciarsesion setPassword(java.lang.String password) {
      this.password = password;
      return this;
    }

    @Override
    public Iniciarsesion set(String parameterName, Object value) {
      return (Iniciarsesion) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link Proxy}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
      setBatchPath(DEFAULT_BATCH_PATH);
    }

    /** Builds a new instance of {@link Proxy}. */
    @Override
    public Proxy build() {
      return new Proxy(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setBatchPath(String batchPath) {
      return (Builder) super.setBatchPath(batchPath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link ProxyRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setProxyRequestInitializer(
        ProxyRequestInitializer proxyRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(proxyRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
