package org.drdeesw.commons.organization.models.pojos;


import org.drdeesw.commons.accounting.models.pojos.AbstractAccountPojo;
import org.drdeesw.commons.accounting.models.pojos.BaseAccountHolderPojo;
import org.drdeesw.commons.security.models.pojos.BaseUserPojo;


/**
 * @param <U>
 * @param <H> The type of account holder that owns the account. Set at BaseAccountHolderPojo level to allow for multiple types of account holders (organization or person).
 * @param <P>
 */
@SuppressWarnings("serial")
public abstract class AbstractOrganizationAccountPojo<//
    U extends BaseUserPojo<?>, //
    H extends BaseAccountHolderPojo<U, ?>, //
    P extends BaseOrganizationAccountProviderPojo<U, ?>> //
    extends AbstractAccountPojo<U, H, P> implements BaseOrganizationAccountPojo<U, H, P>
{
  protected AbstractOrganizationAccountPojo()
  {
  }


  protected AbstractOrganizationAccountPojo(H holder, String internalId)
  {
    super(holder, internalId);
  }
}
