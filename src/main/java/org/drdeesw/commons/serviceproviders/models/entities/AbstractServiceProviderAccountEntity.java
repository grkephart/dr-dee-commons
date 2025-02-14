/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.MappedSuperclass;

import org.drdeesw.commons.accounting.models.entities.AbstractAccountEntity;
import org.drdeesw.commons.accounting.models.entities.AbstractAccountHolderEntity;
import org.drdeesw.commons.security.models.entities.AbstractUserEntity;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccount;


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.PROPERTY)
public abstract class AbstractServiceProviderAccountEntity<//
    U extends AbstractUserEntity<?>, //
    H extends AbstractAccountHolderEntity<U, ?>, //
    P extends AbstractServiceProviderEntity<U, ?>> //
    extends AbstractAccountEntity<U, H, P> implements ServiceProviderAccount<U, H, P>
{

  /**
   * Hibernate constructor
   */
  protected AbstractServiceProviderAccountEntity()
  {

  }

}
