/**
 * 
 */
package org.drdeesw.commons.organization.models;

/**
 * Represents a organization account. Contains account information and tokens.
 */
public interface OrganizationAccount extends Account
{


  /**
   * Returns the organization.
   * 
   * @return the organization
   */
  Organization getOrganization();


  /**
   * Sets the organization.
   * 
   * @param organization the organization to set
   */
  void setOrganization(
    Organization organization);

}
