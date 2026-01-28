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

import org.drdeesw.commons.security.models.entities.UserEntity;


/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "organization_member_roles")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Access(AccessType.PROPERTY)
public class OrganizationMemberRoleEntity extends
    AbstractOrganizationMemberRoleEntity<UserEntity, OrganizationMemberEntity, OrganizationRoleEntity>
{

  @Override
  @Column(name = "organization_role_member_id")
  public Long getId()
  {
    return super.getId();
  }


}
