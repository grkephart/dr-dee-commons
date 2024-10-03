/**
 * 
 */
package org.drdeesw.commons.modules.security.config.oauth2.client;


import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistration.Builder;
import org.springframework.security.oauth2.core.AuthorizationGrantType;
import org.springframework.security.oauth2.core.ClientAuthenticationMethod;


/**
 * 
 * @see org.springframework.security.config.oauth2.client.CommonOAuth2Provider
 */
public enum UncommonOAuth2Provider {

  COINBASE {

    @Override
    public Builder getBuilder(
      String registrationId)
    {
      String redirectUri = DEFAULT_REDIRECT_URL.replace("{action}", "login");
      ClientRegistration.Builder builder = getBuilder(registrationId,
        ClientAuthenticationMethod.CLIENT_SECRET_BASIC, redirectUri)//
            .authorizationUri(CB_AUTHORIZATION_URI)//
            .tokenUri(CB_TOKEN_URI)//
            .userInfoUri(CB_USER_INFO_URI)//
            .userNameAttributeName(CB_USER_NAME_ATTRIBUTE_NAME)//
            .clientName(CB_CLIENT_NAME);

      return builder;
    }

  },
  ETRADE {

    @Override
    public Builder getBuilder(
      String registrationId)
    {
      ClientRegistration.Builder builder = getBuilder(registrationId,
        ClientAuthenticationMethod.CLIENT_SECRET_BASIC, DEFAULT_REDIRECT_URL)//
            .authorizationUri(ETRADE_AUTHORIZATION_URI)//
            .tokenUri(ETRADE_TOKEN_URI)//
            .userInfoUri(ETRADE_USER_INFO_URI)//
            .userNameAttributeName(ETRADE_USER_NAME_ATTRIBUTE_NAME)//
            .clientName(ETRADE_CLIENT_NAME);

      return builder;
    }

  };

  private static final String CB_AUTHORIZATION_URI            = "https://login.coinbase.com/oauth2/auth";
  private static final String CB_CLIENT_NAME                  = "Coinbase";
  private static final String CB_TOKEN_URI                    = "https://login.coinbase.com/oauth2/token";
  private static final String CB_USER_INFO_URI                = "https://api.coinbase.com/v2/user";
  private static final String CB_USER_NAME_ATTRIBUTE_NAME     = "name";

  private static final String ETRADE_AUTHORIZATION_URI        = "https://login.etrade.com/oauth2/auth";
  private static final String ETRADE_CLIENT_NAME              = "E*Trade";
  private static final String ETRADE_TOKEN_URI                = "https://login.etrade.com/oauth2/token";
  private static final String ETRADE_USER_INFO_URI            = "https://api.etrade.com/v2/user";
  private static final String ETRADE_USER_NAME_ATTRIBUTE_NAME = "name";

  private static final String DEFAULT_REDIRECT_URL            = "{baseUrl}/{action}/oauth2/code/{registrationId}";

  /**
   * Create a new
   * {@link org.springframework.security.oauth2.client.registration.ClientRegistration.Builder
   * ClientRegistration.Builder} pre-configured with provider defaults.
   * @param registrationId the registration-id used with the new builder
   * @return a builder instance
   */
  public abstract ClientRegistration.Builder getBuilder(
    String registrationId);


  protected final ClientRegistration.Builder getBuilder(
    String registrationId,
    ClientAuthenticationMethod method,
    String redirectUri)
  {
    ClientRegistration.Builder builder = ClientRegistration.withRegistrationId(registrationId)//
        .clientAuthenticationMethod(method)//
        .authorizationGrantType(AuthorizationGrantType.AUTHORIZATION_CODE)//
        .redirectUri(redirectUri);

    return builder;
  }

}
