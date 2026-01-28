/**
 * 
 */
package org.drdeesw.commons.identity.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.MappedSuperclass;

import org.drdeesw.commons.accounting.models.entities.AbstractAccountEntity;
import org.drdeesw.commons.accounting.models.entities.AbstractAccountHolderEntity;
import org.drdeesw.commons.identity.models.Person;
import org.drdeesw.commons.security.models.entities.AbstractUserEntity;


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.PROPERTY)
public abstract class AbstractPersonEntity<//
    U extends AbstractUserEntity<?>, //
    A extends AbstractAccountEntity<U, ?, ?>> //
    extends AbstractAccountHolderEntity<U, A> implements Person<U, A>
{

  /**
   * Hibernate constructor
   */
  protected AbstractPersonEntity()
  {

  }

}
