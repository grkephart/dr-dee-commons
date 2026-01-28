/**
 * 
 */
package org.drdeesw.commons.security.services.impl;


import javax.annotation.PostConstruct;

import org.drdeesw.commons.common.services.impl.AbstractJpaCrudServiceImpl;
import org.drdeesw.commons.security.models.entities.GroupMemberEntity;
import org.drdeesw.commons.security.models.pojos.GroupMemberPojo;
import org.drdeesw.commons.security.repositories.GroupMemberRepository;
import org.drdeesw.commons.security.services.GroupMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 
 */
@Service
public class GroupMemberServiceImpl
    extends AbstractJpaCrudServiceImpl<GroupMemberPojo, GroupMemberEntity, Long>
    implements GroupMemberService
{

  @Autowired
  private GroupMemberRepository groupMemberRepository;

  /**
   * 
   */
  protected GroupMemberServiceImpl()
  {
    super(GroupMemberPojo.class, GroupMemberEntity.class);
  }


  /**
   * 
   */
  @PostConstruct
  public void init()
  {
    super.init(this.groupMemberRepository);
  }

}
