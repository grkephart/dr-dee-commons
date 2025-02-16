/**
 * 
 */
package org.drdeesw.commons.organization.models.pojos;

import org.drdeesw.commons.organization.models.OrganizationMember;
import org.drdeesw.commons.security.models.pojos.BaseUserPojo;

/**
 * 
 */
public interface BaseOrganizationMemberPojo<//
    U extends BaseUserPojo<?>, //
    O extends BaseOrganizationPojo<U, ?, ?, ?, ?, ?>, //
    MR extends BaseOrganizationMemberRolePojo<U, ?, ?>> extends OrganizationMember<U, O, MR>
{

}
