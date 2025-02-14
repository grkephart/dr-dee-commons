package org.drdeesw.commons.organization.models.pojos;


import org.drdeesw.commons.accounting.models.pojos.AbstractAccountProviderPojo;
import org.drdeesw.commons.organization.models.OrganizationAccountProvider;
import org.drdeesw.commons.security.models.pojos.AbstractUserPojo;


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
    U extends AbstractUserPojo<?>, //
    H extends AbstractOrganizationAccountHolderPojo<U,?>,//
    P extends AbstractOrganizationAccountProviderPojo<U, ?, ?, ?>,//
    PA extends AbstractOrganizationAccountPojo<U, H, P>> //
    extends AbstractAccountProviderPojo<U, PA> implements OrganizationAccountProvider<U, PA>
{
  protected AbstractOrganizationAccountProviderPojo()
  {
  }
}
