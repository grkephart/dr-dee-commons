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
public interface Organization<A extends OrganizationAccount<?, ?>, M extends OrganizationMember<?, ?, ?>, R extends OrganizationRole<?>>
    extends NamedLongUniqueObject, OrganizationAccountHolder<A>, Auditable, Describable
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
  public Set<M> getMembers();


  /**
   * Returns the parent.
   * 
   * @return the parent
   */
  Organization<?,?,?> getParent();


  /**
   * Returns the organization roles.
   * 
   * @return the organization roles.
   */
  public Set<R> getRoles();


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
    Set<M> members);


  /**
   * Sets the parent.
   * 
   * @param parent the parent to set
   */
  void setParent(
    Organization<?,?,?> parent);


  /**
   * Sets the organization roles.
   * 
   * @param roles the organization roles to set
   */
  public void setRoles(
    Set<R> roles);


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
