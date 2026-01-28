package org.drdeesw.commons.serviceproviders.models.pojos;


import org.drdeesw.commons.accounting.models.pojos.AbstractAccountHolderPojo;
import org.drdeesw.commons.security.models.pojos.BaseUserPojo;


@SuppressWarnings("serial")
public abstract class AbstractServiceProviderAccountHolderPojo<//
    U extends BaseUserPojo<?>, //
    HA extends BaseServiceProviderAccountPojo<U, ?, ?>> //
    extends AbstractAccountHolderPojo<U, HA> implements BaseServiceProviderAccountHolderPojo<U, HA>
{
  protected AbstractServiceProviderAccountHolderPojo()
  {
    super();
  }
}
