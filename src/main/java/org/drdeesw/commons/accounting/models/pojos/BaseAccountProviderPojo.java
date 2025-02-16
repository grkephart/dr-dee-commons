/**
 * 
 */
package org.drdeesw.commons.accounting.models.pojos;


import org.drdeesw.commons.accounting.models.AccountProvider;
import org.drdeesw.commons.security.models.pojos.BaseUserPojo;


/**
 * The POJO version of AccountProvider.
 */
public interface BaseAccountProviderPojo<//
    U extends BaseUserPojo<?>, //
    PA extends BaseAccountPojo<U, ?, ?>> extends AccountProvider<U, PA>
{

}
