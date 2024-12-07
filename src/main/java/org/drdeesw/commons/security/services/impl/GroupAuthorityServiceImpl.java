/**
 * 
 */
package org.drdeesw.commons.security.services.impl;


import javax.annotation.PostConstruct;

import org.drdeesw.commons.common.services.impl.AbstractJpaCrudServiceImpl;
import org.drdeesw.commons.security.models.entities.GroupAuthorityEntity;
import org.drdeesw.commons.security.models.pojos.GroupAuthorityPojo;
import org.drdeesw.commons.security.repositories.GroupAuthorityRepository;
import org.drdeesw.commons.security.services.GroupAuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 
 */
@Service
public class GroupAuthorityServiceImpl
    extends AbstractJpaCrudServiceImpl<GroupAuthorityPojo, GroupAuthorityEntity, Long>
    implements GroupAuthorityService
{

  @Autowired
  private GroupAuthorityRepository groupAuthorityRepository;

  /**
   * 
   */
  protected GroupAuthorityServiceImpl()
  {
    super(GroupAuthorityPojo.class, GroupAuthorityEntity.class);
  }


  /**
   * 
   */
  @PostConstruct
  public void init()
  {
    super.init(this.groupAuthorityRepository);
  }

}
