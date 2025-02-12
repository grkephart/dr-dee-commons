package org.drdeesw.commons.organization.models.pojos;

import org.drdeesw.commons.accounting.models.pojos.AbstractAccountProviderPojo;
import org.drdeesw.commons.security.models.pojos.UserPojo;

@SuppressWarnings("serial")
public abstract class AbstractOrganizationAccountProviderPojo<//
    U extends UserPojo<?>, // 
    A extends AbstractOrganizationAccountPojo<U, ? extends AbstractOrganizationAccountHolderPojo<U>, ? extends AbstractOrganizationAccountProviderPojo<U>>> //
    extends AbstractAccountProviderPojo<U, A>
{
  protected AbstractOrganizationAccountProviderPojo()
  {
  }
}
