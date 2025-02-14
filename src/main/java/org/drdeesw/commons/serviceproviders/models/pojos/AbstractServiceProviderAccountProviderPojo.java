package org.drdeesw.commons.serviceproviders.models.pojos;


import org.drdeesw.commons.accounting.models.pojos.AbstractAccountProviderPojo;
import org.drdeesw.commons.security.models.pojos.AbstractUserPojo;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccountProvider;


/**
 * Abstract base class for organization account providers.
 * 
 * @param <U> 
 * @param <H> 
 * @param <P>
 * @param <PA>
 */
@SuppressWarnings("serial")
public abstract class AbstractServiceProviderAccountProviderPojo<//
    U extends AbstractUserPojo<?>, //
    H extends AbstractServiceProviderAccountHolderPojo<U, ?>, //
    P extends AbstractServiceProviderAccountProviderPojo<U, ?, ?, ?>, //
    PA extends AbstractServiceProviderAccountPojo<U, H, P>> //
    extends AbstractAccountProviderPojo<U, PA> implements ServiceProviderAccountProvider<U, PA>
{
  protected AbstractServiceProviderAccountProviderPojo()
  {
  }
}
