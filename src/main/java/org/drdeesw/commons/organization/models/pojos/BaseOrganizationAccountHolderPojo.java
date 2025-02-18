/**
 * 
 */
package org.drdeesw.commons.organization.models.pojos;


import org.drdeesw.commons.accounting.models.pojos.BaseAccountHolderPojo;
import org.drdeesw.commons.organization.models.OrganizationAccountHolder;
import org.drdeesw.commons.security.models.pojos.BaseUserPojo;


/**
 * 
 */
public interface BaseOrganizationAccountHolderPojo<//
    U extends BaseUserPojo<?>, //
    HA extends BaseOrganizationAccountPojo<U, ?, ?>> extends BaseAccountHolderPojo<U, HA>, OrganizationAccountHolder<U, HA>
{

}
