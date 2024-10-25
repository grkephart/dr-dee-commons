/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models.pojos;

import org.drdeesw.commons.common.models.pojos.AbstractNamedLongUniquePojo;
import org.drdeesw.commons.serviceproviders.models.ServiceProvider;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderType;

/**
 * 
 */
@SuppressWarnings("serial")
public class ServiceProviderPojo extends AbstractNamedLongUniquePojo implements ServiceProvider
{
  ServiceProviderTypePojo type;

  /**
   * @return the type
   */
  @Override
  public ServiceProviderTypePojo getType()
  {
    return type;
  }

  /**
   * @param type the type to set
   */
  @Override
  public void setType(
    ServiceProviderType type)
  {
    this.type = (ServiceProviderTypePojo)type;
  }
}
