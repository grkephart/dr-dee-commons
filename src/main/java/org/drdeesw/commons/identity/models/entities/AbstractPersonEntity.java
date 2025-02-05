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
public abstract class AbstractPersonEntity<A extends Account<?, ?, ?>, U extends User<?>>
    extends AbstractAccountHolderEntity<A, U> implements Person<A, U>
{

  /**
   * Hibernate constructor
   */
  protected AbstractPersonEntity()
  {

  }

}
