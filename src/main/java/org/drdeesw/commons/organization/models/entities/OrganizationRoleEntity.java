/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;


import java.util.Set;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.drdeesw.commons.security.models.entities.UserEntity;


/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "organization_roles")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Access(AccessType.PROPERTY)
public class OrganizationRoleEntity
    extends AbstractOrganizationRoleEntity<UserEntity, OrganizationEntity, OrganizationMemberRoleEntity>
{
  private Set<OrganizationMemberRoleEntity> memberRoles;
  private OrganizationEntity                organization;

  @Override
  @Column(name = "organization_role_id")
  public Long getId()
  {
    return super.getId();
  }


  @Override
  @OneToMany(mappedBy = "member", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
  public Set<OrganizationMemberRoleEntity> getMemberRoles()
  {
    return memberRoles;
  }


  @Override
  @ManyToOne
  @JoinColumn(name = "organization_id")
  public OrganizationEntity getOrganization()
  {
    return organization;
  }


  @Override
  public void setMemberRoles(
    Set<OrganizationMemberRoleEntity> memberRoles)
  {
    this.memberRoles = memberRoles;
  }


  @Override
  public void setOrganization(
    OrganizationEntity organization)
  {
    this.organization = organization;
  }

}
