/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models.entities;


import java.time.Instant;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.drdeesw.commons.accounting.models.entities.AbstractAccountProviderEntity;
import org.drdeesw.commons.common.models.EmbeddedAuditable;
import org.drdeesw.commons.security.models.User;
import org.drdeesw.commons.security.models.pojos.UserPojo;
import org.drdeesw.commons.serviceproviders.models.AuthenticationType;
import org.drdeesw.commons.serviceproviders.models.ServiceProvider;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccount;


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.PROPERTY)
public abstract class AbstractServiceProviderEntity<A extends ServiceProviderAccount<?, ?, ?>>
    extends AbstractAccountProviderEntity<A>
    /*AbstractNamedLongUniqueEntity*/ implements ServiceProvider<A>
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
  protected AbstractServiceProviderEntity(EmbeddedAuditable audit)
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


  @Override
  public void setLastUpdatedBy(
    User<?> lastUpdateId)
  {
    // TODO Auto-generated method stub
    
  }


  @Override
  public void setLastUpdateDate(
    Instant lastUpdateDate)
  {
    // TODO Auto-generated method stub
    
  }


  @Override
  public void setEnabled(
    boolean enabled)
  {
    // TODO Auto-generated method stub
    
  }


  @Override
  public void setCreationDate(
    Instant creationDate)
  {
    // TODO Auto-generated method stub
    
  }


  @Override
  public void setCreatedBy(
    User<?> createdBy)
  {
    // TODO Auto-generated method stub
    
  }


  @Override
  public boolean isEnabled()
  {
    // TODO Auto-generated method stub
    return false;
  }


  @Override
  public UserPojo getLastUpdatedBy()
  {
    // TODO Auto-generated method stub
    return null;
  }


  @Override
  public Instant getLastUpdateDate()
  {
    // TODO Auto-generated method stub
    return null;
  }


  @Override
  public Instant getCreationDate()
  {
    // TODO Auto-generated method stub
    return null;
  }


  @Override
  public UserPojo getCreatedBy()
  {
    // TODO Auto-generated method stub
    return null;
  }

}
