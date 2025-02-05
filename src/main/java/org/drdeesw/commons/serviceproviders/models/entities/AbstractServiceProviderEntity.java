/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.drdeesw.commons.accounting.models.entities.AbstractAccountProviderEntity;
import org.drdeesw.commons.common.models.EmbeddedAuditable;
import org.drdeesw.commons.security.models.User;
import org.drdeesw.commons.serviceproviders.models.AuthenticationType;
import org.drdeesw.commons.serviceproviders.models.ServiceProvider;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccount;


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.PROPERTY)
public abstract class AbstractServiceProviderEntity<A extends ServiceProviderAccount<?, ?, ?>, U extends User<?>>
    extends AbstractAccountProviderEntity<A, U> implements ServiceProvider<A, U>
{
  private AuthenticationType authenticationType;
  private String             clientRegistrationId;

  /**
   * Hibernate constructor
   */
  protected AbstractServiceProviderEntity()
  {

  }


  /**
   * Unit testing constructor.
   * 
   * @param audit
   */
  protected AbstractServiceProviderEntity(EmbeddedAuditable<U> audit)
  {
    super(audit);
  }


  @Override
  @Column(name = "authentication_type")
  public AuthenticationType getAuthenticationType()
  {
    return this.authenticationType;
  }


  @Override
  @Column(name = "client_registration_id", length = 255)
  public String getClientRegistrationId()
  {
    return this.clientRegistrationId;
  }


  @Override
  public void setAuthenticationType(
    AuthenticationType authenticationType)
  {
    this.authenticationType = authenticationType;
  }


  @Override
  public void setClientRegistrationId(
    String clientRegistrationId)
  {
    this.clientRegistrationId = clientRegistrationId;
  }

}
