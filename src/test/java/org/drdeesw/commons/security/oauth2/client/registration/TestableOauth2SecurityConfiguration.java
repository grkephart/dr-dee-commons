/**
 * 
 */
package org.drdeesw.commons.security.oauth2.client.registration;


import org.springframework.core.env.Environment;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;


/**
 * 
 */
public class TestableOauth2SecurityConfiguration extends Oauth2SecurityConfiguration
{

  /**
   * 
   */
  public TestableOauth2SecurityConfiguration()
  {
    super();
  }


  /**
   * @param env
   */
  public TestableOauth2SecurityConfiguration(Environment env)
  {
    super(env);
  }

  
  public ClientRegistrationRepository getClientRegistrationRepository()
  {
    return super.clientRegistrationRepository();
  }
}
