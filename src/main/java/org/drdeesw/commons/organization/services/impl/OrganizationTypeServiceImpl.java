/**
 * 
 */
package org.drdeesw.commons.organization.services.impl;


import javax.annotation.PostConstruct;

import org.drdeesw.commons.common.services.impl.AbstractJpaCrudServiceImpl;
import org.drdeesw.commons.organization.models.entities.OrganizationTypeEntity;
import org.drdeesw.commons.organization.models.pojos.OrganizationTypePojo;
import org.drdeesw.commons.organization.repositories.OrganizationTypeRepository;
import org.drdeesw.commons.organization.services.OrganizationTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 
 */
@Service
public class OrganizationTypeServiceImpl
    extends AbstractJpaCrudServiceImpl<OrganizationTypePojo, OrganizationTypeEntity, Long>
    implements OrganizationTypeService
{

  @Autowired
  private OrganizationTypeRepository organizationTypeRepository;

  /**
   * 
   */
  protected OrganizationTypeServiceImpl()
  {
    super(OrganizationTypePojo.class, OrganizationTypeEntity.class);
  }


  /**
   * 
   */
  @PostConstruct
  public void init()
  {
    super.init(this.organizationTypeRepository);
  }

}
