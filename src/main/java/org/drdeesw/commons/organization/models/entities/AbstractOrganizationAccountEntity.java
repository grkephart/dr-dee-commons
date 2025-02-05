/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.MappedSuperclass;

import org.drdeesw.commons.accounting.models.AccountHolder;
import org.drdeesw.commons.accounting.models.AccountProvider;
import org.drdeesw.commons.accounting.models.entities.AbstractAccountEntity;
import org.drdeesw.commons.organization.models.OrganizationAccount;
import org.drdeesw.commons.security.models.User;


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.PROPERTY)
public abstract class AbstractOrganizationAccountEntity<H extends AccountHolder<?,U>, P extends AccountProvider<?,U>, U extends User<?>>
    extends AbstractAccountEntity<H, P, U> /*AbstractNamedLongUniqueEntity*/
    implements OrganizationAccount<H, P, U>
{

  /**
   * Hibernate constructor
   */
  protected AbstractOrganizationAccountEntity()
  {

  }

}
