/**
 * 
 */
package org.drdeesw.commons.organization.services.impl;


import javax.annotation.PostConstruct;

import org.drdeesw.commons.common.services.impl.AbstractJpaCrudServiceImpl;
import org.drdeesw.commons.organization.models.entities.OrganizationMemberEntity;
import org.drdeesw.commons.organization.models.pojos.OrganizationMemberPojo;
import org.drdeesw.commons.organization.repositories.OrganizationMemberRepository;
import org.drdeesw.commons.organization.services.OrganizationMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 
 */
@Service
public class OrganizationMemberServiceImpl
    extends AbstractJpaCrudServiceImpl<OrganizationMemberPojo, OrganizationMemberEntity, Long>
    implements OrganizationMemberService
{

  @Autowired
  private OrganizationMemberRepository userOrganizationMembershipRepository;

  /**
   * 
   */
  protected OrganizationMemberServiceImpl()
  {
    super(OrganizationMemberPojo.class, OrganizationMemberEntity.class);
  }


  /**
   * 
   */
  @PostConstruct
  public void init()
  {
    super.init(this.userOrganizationMembershipRepository);
  }

}
