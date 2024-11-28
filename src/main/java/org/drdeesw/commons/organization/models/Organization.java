/**
 * 
 */
package org.drdeesw.commons.organization.models;


import java.util.Set;

import org.drdeesw.commons.common.models.Auditable;
import org.drdeesw.commons.common.models.Describable;
import org.drdeesw.commons.common.models.NamedLongUniqueObject;


/**
 * An organization is a group of people with a common purpose or goal. 
 * The organization can have a parent organization and children organizations. 
 * The organization can have members and roles. 
 * The organization can have accounts.
 * 
 * A design choice was made to ensure that all related organizations (parent and children) manage the same type of account
 * instead of having different types of accounts for different related organizations.
 * This maintains type safety and consistency within the hierarchy at the cost of flexibility.
 */
public interface Organization
    extends NamedLongUniqueObject, OrganizationAccountHolder, Auditable, Describable
{

  /**
   * Returns the children organizations.
   * 
   * @return the children organizations.
   */
  Set<Organization> getChildren();


  /**
   * Returns the organization members.
   * 
   * @return the organization members.
   */
  Set<OrganizationMember> getMembers();


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
  Set<OrganizationRole> getRoles();


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
    Set<Organization> children);


  /**
   * Sets the organization members.
   * 
   * @param members the organization members to set
   */
  void setMembers(
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
  void setRoles(
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
