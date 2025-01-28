/**
 * 
 */
package org.drdeesw.commons.organization.models;


import java.util.Set;

import org.drdeesw.commons.accounting.models.Account;
import org.drdeesw.commons.accounting.models.AccountHolder;
import org.drdeesw.commons.accounting.models.AccountProvider;


/**
 * An organization is a group of people with a common purpose or goal. 
 * The organization can have a parent organization and children organizations. 
 * The organization can have members and roles. 
 * The organization can provide accounts and hold accounts.
 * 
 */
public interface Organization<A extends Account<?, ?, ?>, M extends OrganizationMember<?,?,?>, R extends OrganizationRole<?,?>>
    extends AccountProvider<A>, AccountHolder<A>
{
  /**
   * Returns the children organizations.
   * 
   * @return the children organizations.
   */
  Set<Organization<?,?,?>> getChildren();


  /**
   * Returns the organization members.
   * 
   * @return the organization members.
   */
  Set<M> getMembers();


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
  Set<R> getRoles();


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
   * Sets the children organizations.
   * 
   * @param children the children organizations to set
   */
  void setChildren(
    Set<Organization<?,?,?>> children);


  /**
   * Sets the organization members.
   * 
   * @param members the organization members to set
   */
  void setMembers(
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
  void setRoles(
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
