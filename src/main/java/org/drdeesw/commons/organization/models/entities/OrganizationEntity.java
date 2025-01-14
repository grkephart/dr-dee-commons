/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.drdeesw.commons.common.models.EmbeddedAuditable;


/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "organizations")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class OrganizationEntity extends AbstractOrganizationEntity
{

  /**
   * Hibernate constructor
   */
  public OrganizationEntity()
  {

  }


  /**
   * Unit test constructor
   */
  public OrganizationEntity(EmbeddedAuditable audit)
  {
    super(audit);
  }


  @Override
  @Column(name = "organization_id")
  public Long getId()
  {
    return super.getId();
  }

}
