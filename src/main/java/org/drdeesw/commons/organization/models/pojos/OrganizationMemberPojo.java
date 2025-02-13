/**
 * 
 */
package org.drdeesw.commons.organization.models.pojos;


import org.drdeesw.commons.security.models.pojos.UserPojo;


/**
 * 
 */
@SuppressWarnings("serial")
public class OrganizationMemberPojo extends AbstractOrganizationMemberPojo<//
    UserPojo, // Uses standard UserPojo
    OrganizationPojo, // Uses standard OrganizationPojo
    OrganizationMemberRolePojo> // Uses standard OrganizationMemberRolePojo
{
  public OrganizationMemberPojo()
  {
  }
}
