package org.drdeesw.commons.organization.models.pojos;


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
public abstract class AbstractOrganizationAccountProviderPojo<//
    U extends BaseUserPojo<?>, //
    H extends BaseOrganizationAccountHolderPojo<U, ?>, //
    P extends BaseOrganizationAccountProviderPojo<U, ?>, //
    PA extends BaseOrganizationAccountPojo<U, H, P>> //
    extends AbstractAccountProviderPojo<U, PA> implements BaseOrganizationAccountProviderPojo<U, PA>
{
  protected AbstractOrganizationAccountProviderPojo()
  {
  }
}
