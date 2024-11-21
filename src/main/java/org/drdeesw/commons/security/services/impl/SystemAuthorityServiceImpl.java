/**
 * 
 */
package org.drdeesw.commons.security.services.impl;


import javax.annotation.PostConstruct;

import org.drdeesw.commons.common.services.impl.AbstractJpaCrudServiceImpl;
import org.drdeesw.commons.security.models.entities.AuthorityEntity;
import org.drdeesw.commons.security.models.pojos.AuthorityPojo;
import org.drdeesw.commons.security.repositories.SystemAuthorityRepository;
import org.drdeesw.commons.security.services.SystemAuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 
 */
@Service
public class SystemAuthorityServiceImpl
    extends AbstractJpaCrudServiceImpl<AuthorityPojo, AuthorityEntity, Long>
    implements SystemAuthorityService
{

  @Autowired
  private SystemAuthorityRepository systemAuthorityRepository;

  /**
   * 
   */
  protected SystemAuthorityServiceImpl()
  {
    super(AuthorityPojo.class, AuthorityEntity.class);
  }


  /**
   * 
   */
  @PostConstruct
  public void init()
  {
    super.init(this.systemAuthorityRepository);
  }

}
