/**
 * 
 */
package org.drdeesw.commons.security.services.impl;


import javax.annotation.PostConstruct;

import org.drdeesw.commons.common.services.impl.AbstractJpaCrudServiceImpl;
import org.drdeesw.commons.security.models.entities.SystemAuthorityEntity;
import org.drdeesw.commons.security.models.pojos.SystemAuthorityPojo;
import org.drdeesw.commons.security.repositories.SystemAuthorityRepository;
import org.drdeesw.commons.security.services.SystemAuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 
 */
@Service
public class SystemAuthorityServiceImpl
    extends AbstractJpaCrudServiceImpl<SystemAuthorityPojo, SystemAuthorityEntity, Long>
    implements SystemAuthorityService
{

  @Autowired
  private SystemAuthorityRepository systemAuthorityRepository;

  /**
   * 
   */
  protected SystemAuthorityServiceImpl()
  {
    super(SystemAuthorityPojo.class, SystemAuthorityEntity.class);
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
