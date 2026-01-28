/**
 * 
 */
package org.drdeesw.commons.security.services.impl;


import javax.annotation.PostConstruct;

import org.drdeesw.commons.common.services.impl.AbstractJpaCrudServiceImpl;
import org.drdeesw.commons.security.models.entities.UserEntity;
import org.drdeesw.commons.security.models.pojos.UserPojo;
import org.drdeesw.commons.security.oauth2.client.registration.Oauth2SecurityConfiguration;
import org.drdeesw.commons.security.repositories.UserRepository;
import org.drdeesw.commons.security.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 
 */
@Service
public class UserServiceImpl extends
    AbstractJpaCrudServiceImpl<UserPojo, UserEntity, Long> implements UserService
{

  @Autowired
  private Oauth2SecurityConfiguration securityConfiguration;

  @Autowired
  private UserRepository        userRepository;

  /**
   * 
   */
  protected UserServiceImpl()
  {
    super(UserPojo.class, UserEntity.class);
  }


  @Override
  public UserPojo findByUsername(
    String username)
  {
    return convertEntityToPojo(this.userRepository.findByUsername(username));
  }


  /**
   *
   */
  @Override
  public UserPojo getCurrentUser()
  {
    UserPojo user = null;
    String principalId = this.securityConfiguration.getPrincipalId();

    if (principalId != null)
    {
      user = convertEntityToPojo(this.userRepository.findByUsername(principalId));
    }

    return user;
  }


  /**
   * 
   */
  @PostConstruct
  public void init()
  {
    super.init(this.userRepository);
  }

}
