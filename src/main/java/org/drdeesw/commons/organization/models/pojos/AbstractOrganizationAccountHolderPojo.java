package org.drdeesw.commons.organization.models.pojos;

import org.drdeesw.commons.accounting.models.pojos.AbstractAccountHolderPojo;
import org.drdeesw.commons.security.models.pojos.UserPojo;

@SuppressWarnings("serial")
public abstract class AbstractOrganizationAccountHolderPojo<
    U extends UserPojo<?>, 
    A extends AbstractOrganizationAccountPojo<U, ?, ?>>
    extends AbstractAccountHolderPojo<U, A>
{
  protected AbstractOrganizationAccountHolderPojo() {
    super();
  }
}
