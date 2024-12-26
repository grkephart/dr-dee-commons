/**
 * 
 */
package org.drdeesw.commons.identity.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.MappedSuperclass;

import org.drdeesw.commons.accounting.models.entities.AbstractAccountHolderEntity;
import org.drdeesw.commons.identity.models.Person;


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class AbstractPersonEntity extends AbstractAccountHolderEntity implements Person
{

}
