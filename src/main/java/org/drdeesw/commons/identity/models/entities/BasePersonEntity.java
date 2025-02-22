/**
 * 
 */
package org.drdeesw.commons.identity.models.entities;


import org.drdeesw.commons.accounting.models.entities.BaseAccountEntity;
import org.drdeesw.commons.accounting.models.entities.BaseAccountHolderEntity;
import org.drdeesw.commons.common.models.entities.NamedLongUniqueEntity;
import org.drdeesw.commons.identity.models.Person;
import org.drdeesw.commons.security.models.entities.BaseUserEntity;


/**
 * 
 */
public interface BasePersonEntity<//
    U extends BaseUserEntity<?>, //
    HA extends BaseAccountEntity<U, ?, ?>> extends Person<U, HA>, NamedLongUniqueEntity, BaseAccountHolderEntity<U, HA>
{

}
