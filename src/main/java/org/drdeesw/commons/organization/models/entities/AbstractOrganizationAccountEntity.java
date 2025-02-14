/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.MappedSuperclass;

import org.drdeesw.commons.accounting.models.entities.AbstractAccountEntity;
import org.drdeesw.commons.organization.models.OrganizationAccount;
import org.drdeesw.commons.security.models.entities.AbstractUserEntity;


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.PROPERTY)
public abstract class AbstractOrganizationAccountEntity<//
    U extends AbstractUserEntity<?>, //
    H extends AbstractOrganizationAccountHolderEntity<U, ?>, //
    P extends AbstractOrganizationAccountProviderEntity<U, ?>> //
    extends AbstractAccountEntity<U, H, P> implements OrganizationAccount<U, H, P>
{

  /**
   * Hibernate constructor
   */
  protected AbstractOrganizationAccountEntity()
  {

  }

}
