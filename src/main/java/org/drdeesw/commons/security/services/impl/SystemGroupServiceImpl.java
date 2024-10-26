/**
 * 
 */
package org.drdeesw.commons.security.services.impl;


import javax.annotation.PostConstruct;

import org.drdeesw.commons.common.services.impl.AbstractJpaCrudServiceImpl;
import org.drdeesw.commons.security.models.entities.SystemGroupEntity;
import org.drdeesw.commons.security.models.pojos.SystemGroupPojo;
import org.drdeesw.commons.security.repositories.SystemGroupRepository;
import org.drdeesw.commons.security.services.SystemGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 
 */
@Service
public class SystemGroupServiceImpl
    extends AbstractJpaCrudServiceImpl<SystemGroupPojo, SystemGroupEntity, Long>
    implements SystemGroupService
{

  @Autowired
  private SystemGroupRepository systemGroupRepository;

  /**
   * 
   */
  protected SystemGroupServiceImpl()
  {
    super(SystemGroupPojo.class, SystemGroupEntity.class);
  }


  /**
   * 
   */
  @PostConstruct
  public void init()
  {
    super.init(this.systemGroupRepository);
  }

}
