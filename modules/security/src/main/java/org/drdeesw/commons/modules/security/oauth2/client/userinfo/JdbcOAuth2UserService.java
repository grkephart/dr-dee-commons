/**
 * 
 */
package org.drdeesw.commons.modules.security.oauth2.client.userinfo;


import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserService;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.DefaultOAuth2User;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.security.provisioning.JdbcUserDetailsManager;


/**
 * 
 */
public class JdbcOAuth2UserService implements OAuth2UserService<OAuth2UserRequest, OAuth2User>
{
  private final JdbcUserDetailsManager userDetailsManager;

  public JdbcOAuth2UserService(JdbcUserDetailsManager userDetailsManager)
  {
    this.userDetailsManager = userDetailsManager;
  }


  @Override
  public OAuth2User loadUser(
    OAuth2UserRequest userRequest) throws OAuth2AuthenticationException
  {
    OAuth2User oAuth2User = new CustomOAuth2UserService().loadUser(userRequest);
    String username = oAuth2User.getName(); // Use email or ID depending on OAuth2 provider

    // Check if user exists in database
    if (!this.userDetailsManager.userExists(username))
    {
      // Create a new user in the database if not already present
      UserDetails user = User.withUsername(username).password("{noop}") // No password since OAuth2 handles authentication
          .roles("USER") // Default role. Not "ROLE_USER" since it is automatically prefixed
          .build();
      this.userDetailsManager.createUser(user);
    }

    // Optionally, update roles or authorities based on OAuth2 attributes
    Collection<? extends GrantedAuthority> authorities = oAuth2User.getAuthorities();

    return new DefaultOAuth2User(authorities, oAuth2User.getAttributes(), "name");
  }
}