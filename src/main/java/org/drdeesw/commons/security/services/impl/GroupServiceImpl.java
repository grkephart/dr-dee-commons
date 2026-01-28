/**
 * 
 */
package org.drdeesw.commons.security.services.impl;


import javax.annotation.PostConstruct;

import org.drdeesw.commons.common.services.impl.AbstractJpaCrudServiceImpl;
import org.drdeesw.commons.security.models.entities.GroupEntity;
import org.drdeesw.commons.security.models.pojos.GroupPojo;
import org.drdeesw.commons.security.repositories.GroupRepository;
import org.drdeesw.commons.security.services.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 
 */
@Service
public class GroupServiceImpl
    extends AbstractJpaCrudServiceImpl<GroupPojo, GroupEntity, Long>
    implements GroupService
{

  @Autowired
  private GroupRepository groupRepository;

  /**
   * 
   */
  protected GroupServiceImpl()
  {
    super(GroupPojo.class, GroupEntity.class);
  }


  /**
   * 
   */
  @PostConstruct
  public void init()
  {
    super.init(this.groupRepository);
  }

}
