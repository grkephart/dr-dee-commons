/**
 * 
 */
package org.drdeesw.commons.organization.models.pojos;


import org.drdeesw.commons.organization.models.OrganizationRole;
import org.drdeesw.commons.security.models.pojos.BaseUserPojo;


/**
 * 
 */
public interface BaseOrganizationRolePojo<//
    U extends BaseUserPojo<?>, //
    O extends BaseOrganizationPojo<U, ?, ?, ?, ?, ?>, //
    MR extends BaseOrganizationMemberRolePojo<U, ?, ?>> extends OrganizationRole<U, O, MR>
{

}
