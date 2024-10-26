/**
 * 
 */
package org.drdeesw.commons.security.services.impl;


import javax.annotation.PostConstruct;

import org.drdeesw.commons.common.services.impl.AbstractJpaCrudServiceImpl;
import org.drdeesw.commons.security.models.entities.SystemGroupMemberEntity;
import org.drdeesw.commons.security.models.pojos.SystemGroupMemberPojo;
import org.drdeesw.commons.security.repositories.SystemGroupMemberRepository;
import org.drdeesw.commons.security.services.SystemGroupMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 
 */
@Service
public class SystemGroupMemberServiceImpl
    extends AbstractJpaCrudServiceImpl<SystemGroupMemberPojo, SystemGroupMemberEntity, Long>
    implements SystemGroupMemberService
{

  @Autowired
  private SystemGroupMemberRepository systemGroupMemberRepository;

  /**
   * 
   */
  protected SystemGroupMemberServiceImpl()
  {
    super(SystemGroupMemberPojo.class, SystemGroupMemberEntity.class);
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
