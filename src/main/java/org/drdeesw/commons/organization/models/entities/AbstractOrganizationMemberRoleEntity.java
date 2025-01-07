/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import org.drdeesw.commons.common.models.entities.AbstractNamedLongUniqueEntity;
import org.drdeesw.commons.organization.models.OrganizationMember;
import org.drdeesw.commons.organization.models.OrganizationMemberRole;
import org.drdeesw.commons.organization.models.OrganizationRole;


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class AbstractOrganizationMemberRoleEntity extends AbstractNamedLongUniqueEntity
    implements OrganizationMemberRole
{
  @ManyToOne
  @JoinColumn(name = "role_id")
  private OrganizationRoleEntity   role;
  @ManyToOne
  @JoinColumn(name = "member_id")
  private OrganizationMemberEntity member;

  /**
   * 
   */
  protected AbstractOrganizationMemberRoleEntity()
  {
    super();
  }


  @Override
  public OrganizationRole getRole()
  {
    return this.role;
  }


  @Override
  public OrganizationMember getMember()
  {
    return this.member;
  }


  @Override
  public void setRole(
    OrganizationRole role)
  {
    this.role = (OrganizationRoleEntity)role;
  }


  @Override
  public void setMember(
    OrganizationMember member)
  {
    this.member = (OrganizationMemberEntity)member;
  }

}
