/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.MappedSuperclass;

import org.drdeesw.commons.accounting.models.AccountHolder;
import org.drdeesw.commons.accounting.models.entities.AbstractAccountEntity;
import org.drdeesw.commons.security.models.User;
import org.drdeesw.commons.serviceproviders.models.ServiceProvider;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccount;


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.PROPERTY)
public abstract class AbstractServiceProviderAccountEntity<H extends AccountHolder<?, U>, P extends ServiceProvider<?,U>, U extends User<?>>
    extends AbstractAccountEntity<H, P, U> implements ServiceProviderAccount<H, P, U>
{

  /**
   * Hibernate constructor
   */
  protected AbstractServiceProviderAccountEntity()
  {

  }

}
