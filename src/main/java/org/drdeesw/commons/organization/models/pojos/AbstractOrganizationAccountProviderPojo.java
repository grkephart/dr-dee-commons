package org.drdeesw.commons.organization.models.pojos;


import org.drdeesw.commons.accounting.models.pojos.AbstractAccountProviderPojo;
import org.drdeesw.commons.organization.models.OrganizationAccount;
import org.drdeesw.commons.security.models.pojos.AbstractUserPojo;


@SuppressWarnings("serial")
public abstract class AbstractOrganizationAccountProviderPojo<//
    U extends AbstractUserPojo<?>, //
    A extends OrganizationAccount<U, ? extends AbstractOrganizationAccountHolderPojo<U,?>, ? extends AbstractOrganizationAccountProviderPojo<U, ?>>> //
    extends AbstractAccountProviderPojo<U, A>
{
  protected AbstractOrganizationAccountProviderPojo()
  {
  }
}
