/**
 * 
 */
package org.drdeesw.commons.security.models.entities;


import org.drdeesw.commons.accounting.models.entities.BaseAccountEntity;
import org.drdeesw.commons.common.models.entities.NamedLongUniqueEntity;
import org.drdeesw.commons.security.models.User;


/**
 * 
 */
public interface BaseUserEntity<//
    A extends BaseAccountEntity<?, ?, ?>> //
    extends User<A>, NamedLongUniqueEntity
{

}