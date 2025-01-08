/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;


import javax.persistence.AttributeOverride;
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
@Inheritance(strategy = InheritanceType.JOINED)
@AttributeOverride(name = "id", column = @Column(name = "organization_id"))
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

}
