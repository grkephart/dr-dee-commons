package org.drdeesw.commons.organization.models.pojos;


import org.drdeesw.commons.accounting.models.pojos.AbstractAccountPojo;
import org.drdeesw.commons.organization.models.OrganizationAccount;
import org.drdeesw.commons.security.models.pojos.UserPojo;


@SuppressWarnings("serial")
public abstract class AbstractOrganizationAccountPojo<//
    U extends UserPojo<?>, //
    H extends AbstractOrganizationAccountHolderPojo<U, ? extends AbstractOrganizationAccountPojo<U, H, P>>, //
    P extends AbstractOrganizationAccountProviderPojo<U, ? extends AbstractOrganizationAccountPojo<U, H, P>>> //
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
