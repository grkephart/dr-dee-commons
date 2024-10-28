/**
 * 
 */
package org.drdeesw.commons.organization.services.impl;


import javax.annotation.PostConstruct;

import org.drdeesw.commons.common.services.impl.AbstractJpaCrudServiceImpl;
import org.drdeesw.commons.organization.models.entities.OrganizationRoleMemberEntity;
import org.drdeesw.commons.organization.models.pojos.OrganizationRoleMemberPojo;
import org.drdeesw.commons.organization.repositories.OrganizationRoleMemberRepository;
import org.drdeesw.commons.organization.services.OrganizationRoleMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 
 */
@Service
public class OrganizationRoleMemberServiceImpl
    extends AbstractJpaCrudServiceImpl<OrganizationRoleMemberPojo, OrganizationRoleMemberEntity, Long>
    implements OrganizationRoleMemberService
{

  @Autowired
  private OrganizationRoleMemberRepository userOrganizationRoleMembershipRepository;

  /**
   * 
   */
  protected OrganizationRoleMemberServiceImpl()
  {
    super(OrganizationRoleMemberPojo.class, OrganizationRoleMemberEntity.class);
  }


  /**
   * 
   */
  @PostConstruct
  public void init()
  {
    super.init(this.userOrganizationRoleMembershipRepository);
  }

}
