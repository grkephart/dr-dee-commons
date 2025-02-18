/**
 * 
 */
package org.drdeesw.commons.identity.models.pojos;


import org.drdeesw.commons.accounting.models.pojos.BaseAccountHolderPojo;
import org.drdeesw.commons.accounting.models.pojos.BaseAccountPojo;
import org.drdeesw.commons.common.models.pojos.NamedLongUniquePojo;
import org.drdeesw.commons.identity.models.Person;
import org.drdeesw.commons.security.models.pojos.BaseUserPojo;


/**
 * 
 */
public interface BasePersonPojo<//
    U extends BaseUserPojo<?>, //
    HA extends BaseAccountPojo<U, ?, ?>> extends Person<U, HA>, NamedLongUniquePojo, BaseAccountHolderPojo<U, HA>
{

}
