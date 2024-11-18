/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.drdeesw.commons.organization.models.entities.AbstractOrganizationEntity;
import org.drdeesw.commons.serviceproviders.models.AuthenticationType;
import org.drdeesw.commons.serviceproviders.models.ServiceProvider;


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class AbstractServiceProviderEntity extends AbstractOrganizationEntity
    implements ServiceProvider
{
  @Column(name = "authentication_type")
  private AuthenticationType authenticationType;
  @Column(name = "client_registration_Id")
  private String             clientRegistrationId;
  @Column(name = "description")
  private String             description;

  /**
   * 
   */
  protected AbstractServiceProviderEntity()
  {

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

}
