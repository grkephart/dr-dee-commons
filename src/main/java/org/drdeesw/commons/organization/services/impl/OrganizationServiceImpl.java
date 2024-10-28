/**
 * 
 */
package org.drdeesw.commons.organization.services.impl;


import javax.annotation.PostConstruct;

import org.drdeesw.commons.common.services.impl.AbstractJpaCrudServiceImpl;
import org.drdeesw.commons.organization.models.entities.OrganizationEntity;
import org.drdeesw.commons.organization.models.pojos.OrganizationPojo;
import org.drdeesw.commons.organization.repositories.OrganizationRepository;
import org.drdeesw.commons.organization.services.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 
 */
@Service
public class OrganizationServiceImpl
    extends AbstractJpaCrudServiceImpl<OrganizationPojo, OrganizationEntity, Long>
    implements OrganizationService
{

  @Autowired
  private OrganizationRepository organizationRepository;

  /**
   * 
   */
  protected OrganizationServiceImpl()
  {
    super(OrganizationPojo.class, OrganizationEntity.class);
  }


  /**
   * 
   */
  @PostConstruct
  public void init()
  {
    super.init(this.organizationRepository);
  }

}
