/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "organization_roles")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Access(AccessType.PROPERTY)
public class OrganizationRoleEntity extends AbstractOrganizationRoleEntity
{

  @Override
  @Column(name = "organization_role_id")
  public Long getId()
  {
    return super.getId();
  }

}
