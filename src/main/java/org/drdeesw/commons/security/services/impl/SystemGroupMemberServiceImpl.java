/**
 * 
 */
package org.drdeesw.commons.security.services.impl;


import javax.annotation.PostConstruct;

import org.drdeesw.commons.common.services.impl.AbstractJpaCrudServiceImpl;
import org.drdeesw.commons.security.models.entities.GroupMemberEntity;
import org.drdeesw.commons.security.models.pojos.GroupMemberPojo;
import org.drdeesw.commons.security.repositories.SystemGroupMemberRepository;
import org.drdeesw.commons.security.services.SystemGroupMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 
 */
@Service
public class SystemGroupMemberServiceImpl
    extends AbstractJpaCrudServiceImpl<GroupMemberPojo, GroupMemberEntity, Long>
    implements SystemGroupMemberService
{

  @Autowired
  private SystemGroupMemberRepository systemGroupMemberRepository;

  /**
   * 
   */
  protected SystemGroupMemberServiceImpl()
  {
    super(GroupMemberPojo.class, GroupMemberEntity.class);
  }


  /**
   * 
   */
  @PostConstruct
  public void init()
  {
    super.init(this.systemGroupMemberRepository);
  }

}
