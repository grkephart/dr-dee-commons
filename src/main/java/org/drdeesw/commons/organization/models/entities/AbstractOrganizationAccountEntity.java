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
public abstract class AbstractOrganizationAccountEntity<//
    U extends User<?>, //
    H extends AccountHolder<U, ?>, //
    P extends AccountProvider<U, ?>>
    extends AbstractAccountEntity<U, H, P> /*AbstractNamedLongUniqueEntity*/
    implements OrganizationAccount<U, H, P>
{

  /**
   * Hibernate constructor
   */
  protected AbstractOrganizationAccountEntity()
  {

  }

}
