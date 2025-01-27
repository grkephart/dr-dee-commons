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
@Table(name = "organization_members")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Access(AccessType.PROPERTY)
public class OrganizationMemberEntity extends
    AbstractOrganizationMemberEntity<OrganizationMemberRoleEntity, OrganizationEntity, UserEntity>
{

  private Set<OrganizationMemberRoleEntity> memberRoles;
  private OrganizationEntity                organization;
  private UserEntity                        user;

  @Override
  @Column(name = "organization_member_id")
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
  @JoinColumn(name = "organization_id", nullable = false)
  public OrganizationEntity getOrganization()
  {
    return this.organization;
  }


  @Override
  @ManyToOne
  @JoinColumn(name = "user_id", nullable = false)
  public UserEntity getUser()
  {
    return this.user;
  }


  @Override
  public void setMemberRoles(
    Set<OrganizationMemberRoleEntity> roles)
  {
    this.memberRoles = roles;
  }


  @Override
  public void setOrganization(
    OrganizationEntity organization)
  {
    this.organization = organization;
  }


  @Override
  public void setUser(
    UserEntity user)
  {
    this.user = user;
  }

}
