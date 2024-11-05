/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import org.drdeesw.commons.common.models.entities.AbstractNamedLongUniqueEntity;
import org.drdeesw.commons.serviceproviders.models.AuthenticationType;
import org.drdeesw.commons.serviceproviders.models.ServiceProvider;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderType;


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class AbstractServiceProviderEntity extends AbstractNamedLongUniqueEntity
    implements ServiceProvider
{
  @Column(name = "authentication_type")
  private AuthenticationType        authenticationType;
  @Column(name = "client_registration_Id")
  private String        clientRegistrationId;
  @Column(name = "description")
  private String                    description;
  @ManyToOne
  @JoinColumn(name = "type_id")
  private ServiceProviderTypeEntity type;

  /**
   * 
   */
  protected AbstractServiceProviderEntity()
  {

  }


  @Override
  public AuthenticationType getAuthenticationType()
  {
    return authenticationType;
  }


  /**
   * @return the clientRegistrationId
   */
  public String getClientRegistrationId()
  {
    return clientRegistrationId;
  }


  @Override
  public String getDescription()
  {
    return description;
  }


  @Override
  public ServiceProviderType getType()
  {
    return type;
  }


  @Override
  public void setAuthenticationType(
    AuthenticationType authenticationType)
  {
    this.authenticationType = authenticationType;
  }


  /**
   * @param clientRegistrationId the clientRegistrationId to set
   */
  public void setClientRegistrationId(
    String clientRegistrationId)
  {
    this.clientRegistrationId = clientRegistrationId;
  }


  @Override
  public void setDescription(
    String description)
  {
    this.description = description;
  }


  @Override
  public void setType(
    ServiceProviderType type)
  {
    this.type = (ServiceProviderTypeEntity)type;
  }


  /**
   * @param type the type to set
   */
  public void setType(
    ServiceProviderTypeEntity type)
  {
    this.type = type;
  }

}
