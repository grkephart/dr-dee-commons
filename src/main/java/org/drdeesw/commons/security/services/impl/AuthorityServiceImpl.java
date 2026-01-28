/**
 * 
 */
package org.drdeesw.commons.security.services.impl;


import javax.annotation.PostConstruct;

import org.drdeesw.commons.common.services.impl.AbstractJpaCrudServiceImpl;
import org.drdeesw.commons.security.models.entities.AuthorityEntity;
import org.drdeesw.commons.security.models.pojos.AuthorityPojo;
import org.drdeesw.commons.security.repositories.AuthorityRepository;
import org.drdeesw.commons.security.services.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 
 */
@Service
public class AuthorityServiceImpl
    extends AbstractJpaCrudServiceImpl<AuthorityPojo, AuthorityEntity, Long>
    implements AuthorityService
{

  @Autowired
  private AuthorityRepository authorityRepository;

  /**
   * 
   */
  protected AuthorityServiceImpl()
  {
    super(AuthorityPojo.class, AuthorityEntity.class);
  }


  /**
   * 
   */
  @PostConstruct
  public void init()
  {
    super.init(this.authorityRepository);
  }

}
