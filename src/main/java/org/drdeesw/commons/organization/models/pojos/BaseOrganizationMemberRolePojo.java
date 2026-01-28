/**
 * 
 */
package org.drdeesw.commons.organization.models.pojos;

import org.drdeesw.commons.organization.models.OrganizationMemberRole;
import org.drdeesw.commons.security.models.pojos.BaseUserPojo;

/**
 * 
 */
public interface BaseOrganizationMemberRolePojo<//
    U extends BaseUserPojo<?>, //
    M extends BaseOrganizationMemberPojo<U, ?, ?>, //
    R extends BaseOrganizationRolePojo<U, ?, ?>> extends OrganizationMemberRole<U, M, R>
{

}
