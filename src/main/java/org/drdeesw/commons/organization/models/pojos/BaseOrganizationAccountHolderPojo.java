/**
 * 
 */
package org.drdeesw.commons.organization.models.pojos;


import org.drdeesw.commons.organization.models.OrganizationAccountHolder;
import org.drdeesw.commons.security.models.pojos.BaseUserPojo;


/**
 * 
 */
public interface BaseOrganizationAccountHolderPojo<//
    U extends BaseUserPojo<?>, //
    HA extends BaseOrganizationAccountPojo<U, ?, ?>> extends OrganizationAccountHolder<U, HA>
{

}
