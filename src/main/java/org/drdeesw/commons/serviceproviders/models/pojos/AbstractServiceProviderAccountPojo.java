package org.drdeesw.commons.serviceproviders.models.pojos;


import org.drdeesw.commons.accounting.models.pojos.AbstractAccountPojo;
import org.drdeesw.commons.security.models.pojos.BaseUserPojo;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccountTokenHolder;


/**
 * @param <U>
 * @param <H>
 * @param <P>
 */
@SuppressWarnings("serial")
public abstract class AbstractServiceProviderAccountPojo<//
    U extends BaseUserPojo<?>, //
    H extends BaseServiceProviderAccountHolderPojo<U, ?>, //
    P extends BaseServiceProviderAccountProviderPojo<U, ?>> //
    extends AbstractAccountPojo<U, H, P> implements BaseServiceProviderAccountPojo<U, H, P>
{
  private ServiceProviderAccountTokenHolderPojo tokenHolder;

  /**
   * 
   */
  protected AbstractServiceProviderAccountPojo()
  {
  }


  /**
   * @param serviceProvider the service provider
   * @param internalId the internal id
   */
  protected AbstractServiceProviderAccountPojo(H serviceProvider, String internalId)
  {
    super(serviceProvider, internalId);
  }

  //  @Override
  //  public ServiceProviderPojo getServiceProvider()
  //  {
  //    return (ServiceProviderPojo)super.getProvider();
  //  }


  @Override
  public ServiceProviderAccountTokenHolderPojo getTokenHolder()
  {
    return tokenHolder;
  }


  @Override
  public void setTokenHolder(
    ServiceProviderAccountTokenHolder<?> tokenHolder)
  {
    this.tokenHolder = (ServiceProviderAccountTokenHolderPojo)tokenHolder;
  }

}
