/**
 * 
 */
package org.drdeesw.commons.organization.models;


import java.util.Set;

import org.drdeesw.commons.common.models.Auditable;
import org.drdeesw.commons.common.models.Describable;
import org.drdeesw.commons.common.models.NamedLongUniqueObject;


/**
 * 
 */
public interface Organization<A extends OrganizationAccount>
    extends NamedLongUniqueObject, OrganizationAccountHolder, Auditable, Describable
{

  /**
   * Returns the accounts.
   * 
   * @return the accounts
   */
  Set<A> getAccounts();


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
  Organization<A> getParent();


  /**
   * Returns the organization roles.
   * 
   * @return the organization roles.
   */
  public Set<A> getRoles();


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
   * Sets the accounts.
   * 
   * @param accounts the accounts to set
   */
  void setAccounts(
    Set<A> accounts);


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
    Organization<A> parent);


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
