/**
 * 
 */
package org.drdeesw.commons.security.services.impl;


import javax.annotation.PostConstruct;

import org.drdeesw.commons.common.services.impl.AbstractJpaCrudServiceImpl;
import org.drdeesw.commons.security.models.entities.SystemUserEntity;
import org.drdeesw.commons.security.models.pojos.SystemUserPojo;
import org.drdeesw.commons.security.oauth2.client.registration.Oauth2SecurityConfiguration;
import org.drdeesw.commons.security.repositories.SystemUserRepository;
import org.drdeesw.commons.security.services.SystemUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 
 */
@Service
public class SystemUserServiceImpl extends
    AbstractJpaCrudServiceImpl<SystemUserPojo, SystemUserEntity, Long> implements SystemUserService
{

  @Autowired
  private Oauth2SecurityConfiguration securityConfiguration;

  @Autowired
  private SystemUserRepository        systemUserRepository;

  /**
   * 
   */
  protected SystemUserServiceImpl()
  {
    super(SystemUserPojo.class, SystemUserEntity.class);
  }


  @Override
  public SystemUserPojo findByUsername(
    String username)
  {
    return convertEntityToPojo(this.systemUserRepository.findByUsername(username));
  }


  /**
   *
   */
  @Override
  public SystemUserPojo getCurrentUser()
  {
    SystemUserPojo user = null;
    String principalId = this.securityConfiguration.getPrincipalId();

    if (principalId != null)
    {
      user = convertEntityToPojo(this.systemUserRepository.findByUsername(principalId));
    }

    return user;
  }


  /**
   * 
   */
  @PostConstruct
  public void init()
  {
    super.init(this.systemUserRepository);
  }

}
