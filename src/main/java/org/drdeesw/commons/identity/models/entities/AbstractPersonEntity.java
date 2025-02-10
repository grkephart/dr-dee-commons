/**
 * 
 */
package org.drdeesw.commons.identity.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.MappedSuperclass;

import org.drdeesw.commons.accounting.models.Account;
import org.drdeesw.commons.accounting.models.entities.AbstractAccountHolderEntity;
import org.drdeesw.commons.identity.models.Person;
import org.drdeesw.commons.security.models.User;


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.PROPERTY)
public abstract class AbstractPersonEntity<//
    U extends User<?>, //
    A extends Account<U, ?, ?>> //
    extends AbstractAccountHolderEntity<U, A> implements Person<U, A>
{

  /**
   * Hibernate constructor
   */
  protected AbstractPersonEntity()
  {

  }

}
