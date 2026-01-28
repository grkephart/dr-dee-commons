/**
 * 
 */
package org.drdeesw.commons.organization.models;


import java.util.Set;

import org.drdeesw.commons.accounting.models.Account;
import org.drdeesw.commons.accounting.models.AccountHolder;
import org.drdeesw.commons.security.models.User;


/**
 * ChatGPT's version as of 2025-02-09 9:41 PM PST
 * 
 * An organization is a group of people with a common purpose or goal. 
 * The organization can have a parent organization and children organizations. 
 * The organization can have members and memberRoles. 
 * The organization can provide organization accounts and hold any accounts.
 * 
 * @param <PC> the parent or children organization type
 * @param <HA> the held account type. Is an organization account or a service provider account.
 * @param <PA> the provided account type. Is an organization account.
 * @param <M> the organization member type
 * @param <R> the organization role type
 */
<<<<<<< HEAD
public interface Organization<A extends OrganizationAccount<?, ?>, M extends OrganizationMember<?, ?, ?>, R extends OrganizationRole<?>>
    extends NamedLongUniqueObject, OrganizationAccountHolder<A>, Auditable, Describable
=======
public interface Organization<//
    U extends User<?>, //
    PC extends Organization<U, ?, HA, PA, M, R>, // Flexible, prevents excessive recursion
    HA extends Account<U, ?, ?>, //
    PA extends OrganizationAccount<U, ?, ?>, //
    M extends OrganizationMember<U, ?, ?>, //
    R extends OrganizationRole<U, ?, ?>> //
    extends OrganizationAccountProvider<U, PA>, AccountHolder<U, HA>
>>>>>>> branch 'master' of https://github.com/grkephart/dr-dee-commons.git
{
  /**
   * Returns the children organizations.
   * 
   * @return the children organizations.
   */
  Set<PC> getChildren();


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
  PC getParent();


  /**
   * Returns the organization memberRoles.
   * 
   * @return the organization memberRoles.
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
    Set<PC> children);


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
    PC parent);


  /**
   * Sets the organization memberRoles.
   * 
   * @param memberRoles the organization memberRoles to set
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
