package org.drdeesw.commons.organization.models.pojos;


import org.drdeesw.commons.accounting.models.pojos.AbstractAccountPojo;
import org.drdeesw.commons.organization.models.OrganizationAccount;
import org.drdeesw.commons.organization.models.OrganizationAccountHolder;
import org.drdeesw.commons.security.models.pojos.AbstractUserPojo;


/**
 * @param <U>
 * @param <H>
 * @param <P>
 */
@SuppressWarnings("serial")
public abstract class AbstractOrganizationAccountPojo<//
    U extends AbstractUserPojo<?>, //
    H extends OrganizationAccountHolder<U, ?>, //
    P extends AbstractOrganizationAccountProviderPojo<U, ?, ?, ?>> //
    extends AbstractAccountPojo<U, H, P> implements OrganizationAccount<U, H, P>
{
  protected AbstractOrganizationAccountPojo()
  {
  }


  protected AbstractOrganizationAccountPojo(H holder, String internalId)
  {
    super(holder, internalId);
  }
}
