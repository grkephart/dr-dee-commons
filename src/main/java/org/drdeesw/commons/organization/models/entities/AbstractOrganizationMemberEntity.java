/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;


import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

import org.drdeesw.commons.accounting.models.entities.AbstractAccountableEntity;
import org.drdeesw.commons.organization.models.Organization;
import org.drdeesw.commons.organization.models.OrganizationMember;
import org.drdeesw.commons.organization.models.OrganizationMemberRole;
import org.drdeesw.commons.security.models.User;
import org.drdeesw.commons.security.models.entities.UserEntity;


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class AbstractOrganizationMemberEntity extends AbstractAccountableEntity
    implements OrganizationMember
{
  @ManyToOne
  @JoinColumn(name = "organization_id", nullable = false)
  private OrganizationEntity                organization;
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "member", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<OrganizationMemberRoleEntity> memberRoles;
  @ManyToOne
  @JoinColumn(name = "user_id", nullable = false)
  private UserEntity                        user;

  /**
   * 
   */
  protected AbstractOrganizationMemberEntity()
  {
    super();
  }


  @Override
  public Organization getOrganization()
  {
    return (Organization)this.organization;
  }


  @Override
  public Set<OrganizationMemberRole> getMemberRoles()
  {
    return this.memberRoles.stream()//
        .map(member -> (OrganizationMemberRole)member)//
        .collect(Collectors.toSet());
  }


  @Override
  public User getUser()
  {
    return (User)this.user;
  }


  @Override
  public void setOrganization(
    Organization organization)
  {
    this.organization = (OrganizationEntity)organization;
  }


  @Override
  public void setMemberRoles(
    Set<OrganizationMemberRole> roles)
  {
    this.memberRoles = roles.stream()//
        .map(role -> (OrganizationMemberRoleEntity)role)//
        .collect(Collectors.toSet());
  }


  @Override
  public void setUser(
    User user)
  {
    this.user = (UserEntity)user;
  }

}
