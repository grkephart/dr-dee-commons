/**
 * 
 */
package org.drdeesw.commons.security.oauth2.client.registration;


import static org.junit.jupiter.api.Assertions.*;

import javax.servlet.http.HttpServletRequest;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.core.env.Environment;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;


/**
 * 
 */
class Oauth2SecurityConfigurationTest
{
  private static final String                 CLIENT_ID           = ".client-id";
  private static final String                 CLIENT_ISSUER       = ".issuer";
  private static final String                 CLIENT_PROPERTY_KEY = "spring.security.oauth2.client.registration.";
  private static final String                 CLIENT_PROVIDER_KEY = "spring.security.oauth2.client.provider.";
  private static final String                 CLIENT_SCOPE        = ".scope";
  private static final String                 CLIENT_SECRET       = ".client-secret";
  private static final String                 CLIENTS_KEY         = "security.oauth2.client.registration.clients";
  private static final String                 COINBASE_CLIENT     = "coinbase";
  private static final String                 FACEBOOK_CLIENT     = "facebook";
  private static final String                 GITHUB_CLIENT       = "github";
  private static final String                 GOOGLE_CLIENT       = "google";
  private static final String                 OKTA_CLIENT         = "okta";
  private Environment                         env;
  private TestableOauth2SecurityConfiguration objectUnderTest;

  /**
   * @throws java.lang.Exception
   */
  @BeforeEach
  void setUp() throws Exception
  {
    this.env = Mockito.mock(Environment.class);

    this.objectUnderTest = new TestableOauth2SecurityConfiguration(this.env);
  }


  /**
   * @throws java.lang.Exception
   */
  @AfterEach
  void tearDown() throws Exception
  {
  }


  @Test
  public void testClientRegistrationRepositoryWithCoinbase()
  {
    String client = COINBASE_CLIENT;
    String clientId = "id-" + client;
    String secret = "secret-" + client;
    String scope = "scope-" + client;

    // Arrange

    Mockito.when(this.env.getProperty(CLIENTS_KEY)).thenReturn(client);
    Mockito.when(this.env.getProperty(CLIENT_PROPERTY_KEY + client + CLIENT_ID))
        .thenReturn(clientId);
    Mockito.when(this.env.getProperty(CLIENT_PROPERTY_KEY + client + CLIENT_SECRET))
        .thenReturn(secret);
    Mockito.when(this.env.getProperty(CLIENT_PROPERTY_KEY + client + CLIENT_SCOPE))
        .thenReturn(scope);

    // Act
    ClientRegistrationRepository repo = this.objectUnderTest.getClientRegistrationRepository();

    // Assert

    ClientRegistration registration = repo.findByRegistrationId(client);
    Assert.assertEquals(clientId, registration.getClientId());
    //Assert.assertEquals(client, registration.getClientName());
    Assert.assertEquals(secret, registration.getClientSecret());
    Assert.assertEquals(scope, registration.getScopes().toArray()[0]);
  }


  @Test
  public void testClientRegistrationRepositoryWithFacebook()
  {
    String client = FACEBOOK_CLIENT;
    String clientId = "id-" + client;
    String secret = "secret-" + client;
    String scope = "public_profile";

    // Arrange

    Mockito.when(this.env.getProperty(CLIENTS_KEY)).thenReturn(client);
    Mockito.when(this.env.getProperty(CLIENT_PROPERTY_KEY + client + CLIENT_ID))
        .thenReturn(clientId);
    Mockito.when(this.env.getProperty(CLIENT_PROPERTY_KEY + client + CLIENT_SECRET))
        .thenReturn(secret);
    Mockito.when(this.env.getProperty(CLIENT_PROPERTY_KEY + client + CLIENT_SCOPE))
        .thenReturn(scope);

    // Act
    ClientRegistrationRepository repo = this.objectUnderTest.getClientRegistrationRepository();

    // Assert

    ClientRegistration registration = repo.findByRegistrationId(client);
    Assert.assertEquals(clientId, registration.getClientId());
    //Assert.assertEquals(client, registration.getClientName());
    Assert.assertEquals(secret, registration.getClientSecret());
    Assert.assertEquals(scope, registration.getScopes().toArray()[0]);
  }


  @Test
  public void testClientRegistrationRepositoryWithGithub()
  {
    String client = GITHUB_CLIENT;
    String clientId = "id-" + client;
    String secret = "secret-" + client;
    String scope = "read:user";

    // Arrange

    Mockito.when(this.env.getProperty(CLIENTS_KEY)).thenReturn(client);
    Mockito.when(this.env.getProperty(CLIENT_PROPERTY_KEY + client + CLIENT_ID))
        .thenReturn(clientId);
    Mockito.when(this.env.getProperty(CLIENT_PROPERTY_KEY + client + CLIENT_SECRET))
        .thenReturn(secret);
    Mockito.when(this.env.getProperty(CLIENT_PROPERTY_KEY + client + CLIENT_SCOPE))
        .thenReturn(scope);

    // Act
    ClientRegistrationRepository repo = this.objectUnderTest.getClientRegistrationRepository();

    // Assert

    ClientRegistration registration = repo.findByRegistrationId(client);
    Assert.assertEquals(clientId, registration.getClientId());
    //Assert.assertEquals(client, registration.getClientName());
    Assert.assertEquals(secret, registration.getClientSecret());
    Assert.assertEquals(scope, registration.getScopes().toArray()[0]);
  }


  @Test
  public void testClientRegistrationRepositoryWithGoogle()
  {
    String client = GOOGLE_CLIENT;
    String clientId = "id-" + client;
    String secret = "secret-" + client;
    String scope = "scope-" + client;

    // Arrange

    Mockito.when(this.env.getProperty(CLIENTS_KEY)).thenReturn(client);
    Mockito.when(this.env.getProperty(CLIENT_PROPERTY_KEY + client + CLIENT_ID))
        .thenReturn(clientId);
    Mockito.when(this.env.getProperty(CLIENT_PROPERTY_KEY + client + CLIENT_SECRET))
        .thenReturn(secret);
    Mockito.when(this.env.getProperty(CLIENT_PROPERTY_KEY + client + CLIENT_SCOPE))
        .thenReturn(scope);

    // Act
    ClientRegistrationRepository repo = this.objectUnderTest.getClientRegistrationRepository();

    // Assert

    ClientRegistration registration = repo.findByRegistrationId(client);
    Assert.assertEquals(clientId, registration.getClientId());
    //Assert.assertEquals(client, registration.getClientName());
    Assert.assertEquals(secret, registration.getClientSecret());
    Assert.assertEquals(scope, registration.getScopes().toArray()[0]);
  }


  // TODO @Test
  public void testClientRegistrationRepositoryWithOkta()
  {
    String client = OKTA_CLIENT;
    String clientId = "id-" + client;
    String secret = "secret-" + client;
    String scope = "public_profile";
    String issuer = "https://<redacted>.okta.com/oauth2/default/";

    // Arrange

    Mockito.when(this.env.getProperty(CLIENTS_KEY)).thenReturn(client);
    Mockito.when(this.env.getProperty(CLIENT_PROPERTY_KEY + client + CLIENT_ID))
        .thenReturn(clientId);
    Mockito.when(this.env.getProperty(CLIENT_PROPERTY_KEY + client + CLIENT_SECRET))
        .thenReturn(secret);
    Mockito.when(this.env.getProperty(CLIENT_PROPERTY_KEY + client + CLIENT_SCOPE))
        .thenReturn(scope);
    Mockito.when(this.env.getProperty(CLIENT_PROVIDER_KEY + client + CLIENT_ISSUER))
        .thenReturn(issuer);

    // Act
    ClientRegistrationRepository repo = this.objectUnderTest.getClientRegistrationRepository();

    // Assert

    ClientRegistration registration = repo.findByRegistrationId(client);
    Assert.assertEquals(clientId, registration.getClientId());
    //Assert.assertEquals(client, registration.getClientName());
    Assert.assertEquals(secret, registration.getClientSecret());
    Assert.assertEquals(scope, registration.getScopes().toArray()[0]);
  }


  /**
   * Test method for {@link org.drdeesw.commons.security.oauth2.client.registration.Oauth2SecurityConfiguration#getAccessToken(javax.servlet.http.HttpServletRequest)}.
   */
  @Test
  void testGetAccessToken()
  {
    HttpServletRequest request = Mockito.mock(HttpServletRequest.class);

    // Arrange

    // Act
    String actual = this.objectUnderTest.getAccessToken(request);

    // Assert
    Assert.assertEquals(null, actual);

  }


  /**
   * Test method for {@link org.drdeesw.commons.security.oauth2.client.registration.Oauth2SecurityConfiguration#getPrefixedSessionBearerToken()}.
   */
  // TODO @Test
  void testGetPrefixedSessionBearerToken()
  {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link org.drdeesw.commons.security.oauth2.client.registration.Oauth2SecurityConfiguration#getSessionBearerToken()}.
   */
  // TODO @Test
  void testGetSessionBearerToken()
  {
    HttpServletRequest request = Mockito.mock(HttpServletRequest.class);

    // Arrange

    // Act
    String actual = this.objectUnderTest.getSessionBearerToken();

    // Assert
    Assert.assertEquals(null, actual);

  }

}
