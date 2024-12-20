/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;


import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.drdeesw.commons.accounting.models.entities.AccountProviderHolderEntity;
import org.drdeesw.commons.organization.models.Organization;
import org.drdeesw.commons.organization.models.OrganizationMember;
import org.drdeesw.commons.organization.models.OrganizationRole;
import org.drdeesw.commons.organization.models.OrganizationStatus;
import org.drdeesw.commons.organization.models.OrganizationType;


/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "organizations")
@Inheritance(strategy = InheritanceType.JOINED)
@AttributeOverride(name = "id", column = @Column(name = "organization_id"))
public class OrganizationEntity extends AccountProviderHolderEntity implements Organization
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


  @Override
  public Set<Organization> getChildren()
  {
    // TODO Auto-generated method stub
    return null;
  }


  @Override
  public Set<OrganizationMember> getMembers()
  {
    // TODO Auto-generated method stub
    return null;
  }


  @Override
  public Set<OrganizationRole> getRoles()
  {
    // TODO Auto-generated method stub
    return null;
  }


  @Override
  public OrganizationStatus getStatus()
  {
    // TODO Auto-generated method stub
    return null;
  }


  @Override
  public OrganizationType getType()
  {
    // TODO Auto-generated method stub
    return null;
  }


  @Override
  public void setChildren(
    Set<Organization> children)
  {
    // TODO Auto-generated method stub
    
  }


  @Override
  public void setMembers(
    Set<OrganizationMember> members)
  {
    // TODO Auto-generated method stub
    
  }


  @Override
  public void setRoles(
    Set<OrganizationRole> roles)
  {
    // TODO Auto-generated method stub
    
  }


  @Override
  public void setStatus(
    OrganizationStatus status)
  {
    // TODO Auto-generated method stub
    
  }


  @Override
  public void setType(
    OrganizationType type)
  {
    // TODO Auto-generated method stub
    
  }

}
