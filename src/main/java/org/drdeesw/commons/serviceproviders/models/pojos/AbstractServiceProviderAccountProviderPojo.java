package org.drdeesw.commons.serviceproviders.models.pojos;


import org.drdeesw.commons.accounting.models.pojos.AbstractAccountProviderPojo;
import org.drdeesw.commons.security.models.pojos.BaseUserPojo;


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
    U extends BaseUserPojo<?>, //
    H extends BaseServiceProviderAccountHolderPojo<U, ?>, //
    P extends BaseServiceProviderAccountProviderPojo<U, ?>, //
    PA extends BaseServiceProviderAccountPojo<U, H, P>> //
    extends AbstractAccountProviderPojo<U, PA> implements BaseServiceProviderAccountProviderPojo<U, PA>
{
  protected AbstractServiceProviderAccountProviderPojo()
  {
  }
}
