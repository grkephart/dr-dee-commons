/**
 * 
 */
package org.drdeesw.commons.security.services.impl;


import javax.annotation.PostConstruct;

import org.drdeesw.commons.common.services.impl.AbstractJpaCrudServiceImpl;
import org.drdeesw.commons.security.models.entities.SystemGroupAuthorityEntity;
import org.drdeesw.commons.security.models.pojos.SystemGroupAuthorityPojo;
import org.drdeesw.commons.security.repositories.SystemGroupAuthorityRepository;
import org.drdeesw.commons.security.services.SystemGroupAuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 
 */
@Service
public class SystemGroupAuthorityServiceImpl
    extends AbstractJpaCrudServiceImpl<SystemGroupAuthorityPojo, SystemGroupAuthorityEntity, Long>
    implements SystemGroupAuthorityService
{

  @Autowired
  private SystemGroupAuthorityRepository systemGroupAuthorityRepository;

  /**
   * 
   */
  protected SystemGroupAuthorityServiceImpl()
  {
    super(SystemGroupAuthorityPojo.class, SystemGroupAuthorityEntity.class);
  }


  /**
   * 
   */
  @PostConstruct
  public void init()
  {
    super.init(this.systemGroupAuthorityRepository);
  }

}
