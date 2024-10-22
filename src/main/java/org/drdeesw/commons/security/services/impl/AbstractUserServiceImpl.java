/**
 * 
 */
package org.drdeesw.commons.security.services.impl;


import org.drdeesw.commons.common.services.impl.AbstractJpaCrudServiceImpl;
import org.drdeesw.commons.security.models.entities.UserEntity;
import org.drdeesw.commons.security.models.pojos.UserPojo;
import org.drdeesw.commons.security.oauth2.client.registration.Oauth2SecurityConfiguration;
import org.drdeesw.commons.security.repositories.UserRepository;
import org.drdeesw.commons.security.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;


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
