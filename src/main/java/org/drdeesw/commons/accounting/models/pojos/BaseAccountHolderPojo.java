/**
 * 
 */
package org.drdeesw.commons.accounting.models.pojos;


import org.drdeesw.commons.accounting.models.AccountHolder;
import org.drdeesw.commons.security.models.pojos.BaseUserPojo;


/**
 * The POJO version of AccountHolder.
 */
public interface BaseAccountHolderPojo<//
    U extends BaseUserPojo<?>, //
    HA extends BaseAccountPojo<U, ?, ?>> extends AccountHolder<U, HA>
{

}
