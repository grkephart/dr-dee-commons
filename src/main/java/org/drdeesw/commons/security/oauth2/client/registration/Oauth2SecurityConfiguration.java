package org.drdeesw.commons.security.oauth2.client.registration;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.drdeesw.commons.security.config.oauth2.client.UncommonOAuth2Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.security.config.oauth2.client.CommonOAuth2Provider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.client.InMemoryOAuth2AuthorizedClientService;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;
import org.springframework.security.oauth2.core.OAuth2AccessToken;


/**
 * This is where to get the OAuth2 ClientRegistrationRepository.
 */
public abstract class Oauth2SecurityConfiguration
{
  private static final String   CLIENT_ID           = ".client-id";
  private static final String   CLIENT_PROPERTY_KEY = "spring.security.oauth2.client.registration.";
  private static final String   CLIENT_SCOPE        = ".scope";
  private static final String   CLIENT_SECRET       = ".client-secret";
  private static final String   CLIENTS_KEY         = "security.oauth2.client.registration.clients";
  protected static final String COINBASE_CLIENT     = "coinbase";
  private static final String   ETRADE_CLIENT       = "etrade";
  protected static final String FACEBOOK_CLIENT     = "facebook";
  protected static final String GITHUB_CLIENT       = "github";
  protected static final String GOOGLE_CLIENT       = "google";
  protected static final String OKTA_CLIENT         = "okta";
  @Autowired
  private Environment           env;

  /**
   * 
   */
  protected Oauth2SecurityConfiguration()
  {

  }


  /**
   * For unit testing.
   * 
   * @param env the environment
   */
  public Oauth2SecurityConfiguration(Environment env)
  {
    this.env = env;
  }


  /**
   * Returns a new instance of OAuth2AuthorizedClientService.
   * 
   * @return a new instance of OAuth2AuthorizedClient
   */
  @Bean
  protected OAuth2AuthorizedClientService authorizedClientService()
  {
    return newOAuth2AuthorizedClientService(clientRegistrationRepository());
  }


  /**
   * Returns a new ClientRegistrationRepository based on the clients defined by the "security.oauth2.client.registration.clients" property.
   * 
   * @return a new ClientRegistrationRepository based on the clients defined by the "security.oauth2.client.registration.clients" property
   */
  @Bean
  protected ClientRegistrationRepository clientRegistrationRepository()
  {
    String clientsValue = env.getProperty(CLIENTS_KEY);
    List<String> clients = Arrays.asList(clientsValue.split(","));
    List<ClientRegistration> registrations = clients.stream()//
        .map(client -> getRegistration(client))//
        .filter(registration -> registration != null)//
        .collect(Collectors.toList());

    return newClientRegistrationRepository(registrations);
  }


  /**
   * Returns the access token from the request.
   * 
   * @param request the request
   * @return the access token from the request
   */
  public String getAccessToken(
    HttpServletRequest request)
  {
    return null; // TODO
  }


  /**
   * Returns the custom client registration.
   * 
   * @param client the client
   * @param clientId the client ID
   * @param clientSecret the client secret
   * @param clientScopes the client scopes
   * @return the custom client registration
   */
  protected ClientRegistration getCustomClientRegistration(
    String client,
    String clientId,
    String clientSecret,
    String[] clientScopes)
  {
    return null;
  }


  /**
   * Returns the principal ID of the user.
   * 
   * @return the principal ID of the user
   */
  public String getPrincipalId()
  {
    String principalId = null;
    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

    if (authentication.isAuthenticated() && authentication instanceof OAuth2AuthenticationToken)
    {
      OAuth2AuthenticationToken oauthToken = (OAuth2AuthenticationToken)authentication;

      principalId = oauthToken.getPrincipal().getAttribute("id");
    }

    return principalId;
  }


  /**
   * Returns the bearer token with "Bearer " prefixed.
   * 
   * @return the bearer token with "Bearer " prefixed
   */
  public String getPrefixedSessionBearerToken()
  {
    return "Bearer " + getSessionBearerToken();
  }


  /**
   * Returns the registration for the given client.
   * 
   * @param client "coinbase" or "google", etc.
   * @return the registration for the given client.
   */
  private ClientRegistration getRegistration(
    String client)
  {
    String clientId = env.getProperty(CLIENT_PROPERTY_KEY + client + CLIENT_ID);

    if (clientId == null)
    {
      return null;
    }

    String clientSecret = env.getProperty(CLIENT_PROPERTY_KEY + client + CLIENT_SECRET);
    String clientScope = env.getProperty(CLIENT_PROPERTY_KEY + client + CLIENT_SCOPE);
    String[] clientScopes = clientScope.split(",");

    if (client.equals(GOOGLE_CLIENT))
    {
      return CommonOAuth2Provider.GOOGLE.getBuilder(client)//
          .clientId(clientId)//
          .clientSecret(clientSecret)//
          .scope(clientScopes)//
          .build();
    }
    else if (client.equals(GITHUB_CLIENT))
    {
      return CommonOAuth2Provider.GITHUB.getBuilder(client)//
          .clientId(clientId)//
          .clientSecret(clientSecret)//
          .build();
    }
    else if (client.equals(FACEBOOK_CLIENT))
    {
      return CommonOAuth2Provider.FACEBOOK.getBuilder(client)//
          .clientId(clientId)//
          .clientSecret(clientSecret)//
          .build();
    }
    else if (client.equals(OKTA_CLIENT))
    {
      return CommonOAuth2Provider.OKTA.getBuilder(client)//
          .clientId(clientId)//
          .clientSecret(clientSecret)//
          .build();
    }
    else if (client.equals(COINBASE_CLIENT))
    {
      return UncommonOAuth2Provider.COINBASE.getBuilder(client)//
          .clientId(clientId)//
          .clientSecret(clientSecret)//
          .scope(clientScopes)//
          .build();
    }
    else if (client.equals(ETRADE_CLIENT))
    {
      return UncommonOAuth2Provider.ETRADE.getBuilder(client)//
          .clientId(clientId)//
          .clientSecret(clientSecret)//
          .scope(clientScopes)//
          .build();
    }
    else
      return getCustomClientRegistration(client, clientId, clientSecret, clientScopes);
  }


  /**
   * Returns the session bearer token, if it exists, null otherwise.
   * 
   * @return the session bearer token, if it exists, null otherwise
   */
  public String getSessionBearerToken()
  {
    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

    if (authentication.isAuthenticated() && authentication instanceof OAuth2AuthenticationToken)
    {
      OAuth2AuthenticationToken oauthToken = (OAuth2AuthenticationToken)authentication;
      String clientRegistrationId = oauthToken.getAuthorizedClientRegistrationId();
      String principalName = oauthToken.getName();
      OAuth2AuthorizedClient client = authorizedClientService()
          .loadAuthorizedClient(clientRegistrationId, principalName);

      if (client != null)
      {
        OAuth2AccessToken accessToken = client.getAccessToken();

        return accessToken.getTokenValue();
      }
      else
        return null;
    }
    else
      return null;
  }


  /**
   * Returns a new instance of ClientRegistrationRepository; defaults to InMemoryClientRegistrationRepository
   *
   * @param registrations the set of client registrations to use
   * @return a new instance of ClientRegistrationRepository; defaults to InMemoryClientRegistrationRepository
   */
  protected ClientRegistrationRepository newClientRegistrationRepository(
    List<ClientRegistration> registrations)
  {
    return new InMemoryClientRegistrationRepository(registrations);
  }


  /**
   * Returns a new instance of OAuth2AuthorizedClientService; defaults to InMemoryOAuth2AuthorizedClientService.
   * 
   * @param clientRegistrationRepository the client registration repository to use
   * @return a new instance of OAuth2AuthorizedClientService; defaults to InMemoryOAuth2AuthorizedClientService
   */
  protected OAuth2AuthorizedClientService newOAuth2AuthorizedClientService(
    ClientRegistrationRepository clientRegistrationRepository)
  {
    return new InMemoryOAuth2AuthorizedClientService(clientRegistrationRepository);

  }

}
