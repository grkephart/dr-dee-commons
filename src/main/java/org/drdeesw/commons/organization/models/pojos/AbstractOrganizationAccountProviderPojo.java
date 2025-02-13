package org.drdeesw.commons.organization.models.pojos;


import org.drdeesw.commons.accounting.models.pojos.AbstractAccountProviderPojo;
import org.drdeesw.commons.organization.models.OrganizationAccount;
import org.drdeesw.commons.security.models.pojos.AbstractUserPojo;


@SuppressWarnings("serial")
public abstract class AbstractOrganizationAccountProviderPojo<//
    U extends AbstractUserPojo<?>, //
    H extends AbstractOrganizationAccountHolderPojo<U,?>,//
    P extends AbstractOrganizationAccountProviderPojo<U, ?, ?, ?>,//
    PA extends OrganizationAccount<U, H, P>> //
    extends AbstractAccountProviderPojo<U, PA>
{
  protected AbstractOrganizationAccountProviderPojo()
  {
  }
}
