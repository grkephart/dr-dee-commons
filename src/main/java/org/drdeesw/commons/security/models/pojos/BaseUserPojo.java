/**
 * 
 */
package org.drdeesw.commons.security.models.pojos;


import org.drdeesw.commons.accounting.models.pojos.BaseAccountPojo;
import org.drdeesw.commons.common.models.pojos.NamedLongUniquePojo;
import org.drdeesw.commons.security.models.User;


/**
 * 
 */
public interface BaseUserPojo<//
    A extends BaseAccountPojo<?, ?, ?>> //
    extends User<A>, NamedLongUniquePojo
{

}