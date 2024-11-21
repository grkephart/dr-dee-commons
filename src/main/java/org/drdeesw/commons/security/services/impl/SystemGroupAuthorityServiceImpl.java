/**
 * 
 */
package org.drdeesw.commons.security.services.impl;


import javax.annotation.PostConstruct;

import org.drdeesw.commons.common.services.impl.AbstractJpaCrudServiceImpl;
import org.drdeesw.commons.security.models.entities.GroupAuthorityEntity;
import org.drdeesw.commons.security.models.pojos.GroupAuthorityPojo;
import org.drdeesw.commons.security.repositories.SystemGroupAuthorityRepository;
import org.drdeesw.commons.security.services.SystemGroupAuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 
 */
@Service
public class SystemGroupAuthorityServiceImpl
    extends AbstractJpaCrudServiceImpl<GroupAuthorityPojo, GroupAuthorityEntity, Long>
    implements SystemGroupAuthorityService
{

  @Autowired
  private SystemGroupAuthorityRepository systemGroupAuthorityRepository;

  /**
   * 
   */
  protected SystemGroupAuthorityServiceImpl()
  {
    super(GroupAuthorityPojo.class, GroupAuthorityEntity.class);
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
