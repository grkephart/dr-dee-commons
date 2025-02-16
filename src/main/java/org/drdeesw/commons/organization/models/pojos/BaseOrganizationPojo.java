/**
 * 
 */
package org.drdeesw.commons.organization.models.pojos;

import org.drdeesw.commons.accounting.models.pojos.BaseAccountPojo;
import org.drdeesw.commons.organization.models.Organization;
import org.drdeesw.commons.security.models.pojos.BaseUserPojo;

/**
 * 
 */
public interface BaseOrganizationPojo<//
    U extends BaseUserPojo<?>, //
    PC extends BaseOrganizationPojo<U, ?, HA, PA, M, R>, // Flexible, prevents excessive recursion
    HA extends BaseAccountPojo<U, ?, ?>, //
    PA extends BaseOrganizationAccountPojo<U, ?, ?>, //
    M extends BaseOrganizationMemberPojo<U, ?, ?>, //
    R extends BaseOrganizationRolePojo<U, ?, ?>> extends Organization<U, PC, HA, PA, M, R>
{

}
