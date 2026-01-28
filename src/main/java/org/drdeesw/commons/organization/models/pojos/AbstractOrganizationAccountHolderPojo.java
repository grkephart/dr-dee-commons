package org.drdeesw.commons.organization.models.pojos;


import org.drdeesw.commons.accounting.models.pojos.AbstractAccountHolderPojo;
import org.drdeesw.commons.security.models.pojos.BaseUserPojo;


@SuppressWarnings("serial")
public abstract class AbstractOrganizationAccountHolderPojo<//
    U extends BaseUserPojo<?>, //
    HA extends BaseOrganizationAccountPojo<U, ?, ?>> //
    extends AbstractAccountHolderPojo<U, HA> implements BaseOrganizationAccountHolderPojo<U, HA>
{
  protected AbstractOrganizationAccountHolderPojo()
  {
    super();
  }
}
