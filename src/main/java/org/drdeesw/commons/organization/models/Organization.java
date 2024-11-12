/**
 * 
 */
package org.drdeesw.commons.organization.models;


import java.util.Set;

import org.drdeesw.commons.common.models.Auditable;
import org.drdeesw.commons.common.models.Describable;
import org.drdeesw.commons.common.models.NamedLongUniqueObject;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccountHolder;


/**
 * 
 */
public interface Organization
    extends NamedLongUniqueObject, ServiceProviderAccountHolder, Auditable, Describable
{

  /**
   * Returns the organization members.
   * 
   * @return the organization members.
   */
  public Set<OrganizationMember> getMembers();


  /**
   * Returns the parent.
   * 
   * @return the parent
   */
  Organization getParent();


  /**
   * Returns the organization roles.
   * 
   * @return the organization roles.
   */
  public Set<OrganizationRole> getRoles();


  /**
   * Returns the status.
   * 
   * @return the status
   */
  OrganizationStatus getStatus();


  /**
   * Returns the type.
   * 
   * @return the type
   */
  OrganizationType getType();


  /**
   * Sets the organization members.
   * 
   * @param members the organization members to set
   */
  public void setMembers(
    Set<OrganizationMember> members);


  /**
   * Sets the parent.
   * 
   * @param parent the parent to set
   */
  void setParent(
    Organization parent);


  /**
   * Sets the organization roles.
   * 
   * @param roles the organization roles to set
   */
  public void setRoles(
    Set<OrganizationRole> roles);


  /**
   * Sets the status.
   * 
   * @param status the status to set
   */
  void setStatus(
    OrganizationStatus status);


  /**
   * Sets the type.
   * 
   * @param type the type to set
   */
  void setType(
    OrganizationType type);

}
