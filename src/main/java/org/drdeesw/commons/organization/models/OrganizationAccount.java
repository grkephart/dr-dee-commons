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
   * Returns the organization's internal ID of the account.
   * It could be an account number or a username or email or GUID.
   * 
   * @return  the organization's internal ID of the account
   */
  String getInternalId();


  /**
   * Returns the organization.
   * 
   * @return the organization
   */
  Organization getOrganization();



  /**
   * Sets the organization's internal ID of the account.
   * It could be an account number or a username or email or GUID.
   * 
   * @param internalId the organization's internal ID of the account to set
   */
  void setInternalId(
    String internalId);


  /**
   * Sets the organization.
   * 
   * @param organization the organization to set
   */
  void setOrganization(
    Organization organization);

}
