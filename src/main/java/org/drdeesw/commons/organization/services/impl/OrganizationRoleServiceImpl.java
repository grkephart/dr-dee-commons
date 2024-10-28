/**
 * 
 */
package org.drdeesw.commons.organization.services.impl;


import javax.annotation.PostConstruct;

import org.drdeesw.commons.common.services.impl.AbstractJpaCrudServiceImpl;
import org.drdeesw.commons.organization.models.entities.OrganizationRoleEntity;
import org.drdeesw.commons.organization.models.pojos.OrganizationRolePojo;
import org.drdeesw.commons.organization.repositories.OrganizationRoleRepository;
import org.drdeesw.commons.organization.services.OrganizationRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 
 */
@Service
public class OrganizationRoleServiceImpl
    extends AbstractJpaCrudServiceImpl<OrganizationRolePojo, OrganizationRoleEntity, Long>
    implements OrganizationRoleService
{

  @Autowired
  private OrganizationRoleRepository organizationRoleRepository;

  /**
   * 
   */
  protected OrganizationRoleServiceImpl()
  {
    super(OrganizationRolePojo.class, OrganizationRoleEntity.class);
  }


  /**
   * 
   */
  @PostConstruct
  public void init()
  {
    super.init(this.organizationRoleRepository);
  }

}
