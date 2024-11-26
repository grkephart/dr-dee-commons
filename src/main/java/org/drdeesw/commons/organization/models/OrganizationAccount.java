/**
 * 
 */
package org.drdeesw.commons.organization.models;


import org.drdeesw.commons.common.models.Describable;
import org.drdeesw.commons.common.models.LongUniqueObject;


/**
 * Represents a organization account. Contains account information and tokens.
 */
public interface OrganizationAccount<O extends Organization<?,?,?>, H extends OrganizationAccountHolder<?>> extends LongUniqueObject, Describable
{
  /**
   * Returns the accountHolder, either an organization or a user.
   * 
   * @return the accountHolder
   */
  H getHolder();


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
  O getOrganization();



  /**
   * Sets the account holder.
   * 
   * @param holder  the account holder to set
   */
  void setHolder(
    H holder);


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
    O organization);

}
