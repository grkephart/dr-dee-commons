/**
 * 
 */
package main.java.org.drdeesw.commons.modules.security.services.impl;


import org.drdeesw.commons.modules.common.services.impl.AbstractJpaCrudServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import main.java.org.drdeesw.commons.modules.security.models.entities.UserEntity;
import main.java.org.drdeesw.commons.modules.security.models.pojos.UserPojo;
import main.java.org.drdeesw.commons.modules.security.oauth2.client.registration.Oauth2SecurityConfiguration;
import main.java.org.drdeesw.commons.modules.security.repositories.UserRepository;
import main.java.org.drdeesw.commons.modules.security.services.UserService;


/**
 * 
 */
public abstract class AbstractUserServiceImpl<P extends UserPojo, E extends UserEntity, UR extends UserRepository<E>>
    extends AbstractJpaCrudServiceImpl<P, E, Long> implements UserService<P>
{

  @Autowired
  private UR                          repository;

  @Autowired
  private Oauth2SecurityConfiguration securityConfiguration;

  /**
   * @param pojoClass
   * @param entityClass
   */
  protected AbstractUserServiceImpl(Class<P> pojoClass, Class<E> entityClass)
  {
    super(pojoClass, entityClass);
  }


  /**
   *
   */
  @Override
  public P getCurrentUser()
  {
    P user = null;
    String principalId = this.securityConfiguration.getPrincipalId();

    if (principalId != null)
    {
      user = convertEntityToPojo(this.repository.findByUsername(principalId));
    }

    return user;
  }

}
