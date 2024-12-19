/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;


import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.drdeesw.commons.organization.models.Organization;


/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "organizations")
@AttributeOverride(name = "id", column = @Column(name = "organization_id"))
public class OrganizationEntity extends AbstractOrganizationEntity implements Organization
{

  @ManyToOne
  @JoinColumn(name = "parent_id")
  private OrganizationEntity parent;

  @Override
  public Organization getParent()
  {
    return parent;
  }


  @Override
  public void setParent(
    Organization parent)
  {
    this.parent = (OrganizationEntity)parent;
  }

}
