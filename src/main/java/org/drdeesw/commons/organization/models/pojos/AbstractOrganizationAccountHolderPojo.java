package org.drdeesw.commons.organization.models.pojos;


import org.drdeesw.commons.accounting.models.pojos.AbstractAccountHolderPojo;
import org.drdeesw.commons.organization.models.OrganizationAccount;
import org.drdeesw.commons.organization.models.OrganizationAccountHolder;
import org.drdeesw.commons.security.models.pojos.AbstractUserPojo;


@SuppressWarnings("serial")
public abstract class AbstractOrganizationAccountHolderPojo<//
    U extends AbstractUserPojo<?>, //
    HA extends OrganizationAccount<U, ?, ?>> //
    extends AbstractAccountHolderPojo<U, HA> implements OrganizationAccountHolder<U, HA>
{
  protected AbstractOrganizationAccountHolderPojo()
  {
    super();
  }
}
