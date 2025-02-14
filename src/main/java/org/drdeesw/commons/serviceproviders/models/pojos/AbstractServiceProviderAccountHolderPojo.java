package org.drdeesw.commons.serviceproviders.models.pojos;


import org.drdeesw.commons.accounting.models.pojos.AbstractAccountHolderPojo;
import org.drdeesw.commons.security.models.pojos.AbstractUserPojo;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccountHolder;


@SuppressWarnings("serial")
public abstract class AbstractServiceProviderAccountHolderPojo<//
    U extends AbstractUserPojo<?>, //
    HA extends AbstractServiceProviderAccountPojo<U, ?, ?>> //
    extends AbstractAccountHolderPojo<U, HA> implements ServiceProviderAccountHolder<U, HA>
{
  protected AbstractServiceProviderAccountHolderPojo()
  {
    super();
  }
}
