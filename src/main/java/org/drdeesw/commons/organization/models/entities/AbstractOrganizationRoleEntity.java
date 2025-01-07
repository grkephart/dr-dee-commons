/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;


import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

import org.drdeesw.commons.common.models.entities.AbstractNamedLongUniqueEntity;
import org.drdeesw.commons.organization.models.Organization;
import org.drdeesw.commons.organization.models.OrganizationMemberRole;
import org.drdeesw.commons.organization.models.OrganizationRole;


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class AbstractOrganizationRoleEntity extends AbstractNamedLongUniqueEntity
    implements OrganizationRole
{
  @ManyToOne
  @JoinColumn(name = "organization_id")
  private OrganizationEntity                organization;
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "member")
  private Set<OrganizationMemberRoleEntity> memberRoles;

  /**
   * 
   */
  protected AbstractOrganizationRoleEntity()
  {

  }


  @Override
  public Organization getOrganization()
  {
    return (Organization)organization;
  }


  @Override
  public Set<OrganizationMemberRole> getMemberRoles()
  {
    return this.memberRoles.stream()//
        .map(member -> (OrganizationMemberRole)member)//
        .collect(Collectors.toSet());
  }


  @Override
  public void setOrganization(
    Organization organization)
  {
    this.organization = (OrganizationEntity)organization;
  }


  @Override
  public void setMemberRoles(
    Set<OrganizationMemberRole> members)
  {
    this.memberRoles = members.stream()//
        .map(member -> (OrganizationMemberRoleEntity)member)//
        .collect(Collectors.toSet());
  }
}
