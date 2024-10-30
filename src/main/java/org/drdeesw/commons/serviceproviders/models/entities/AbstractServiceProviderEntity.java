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


  /**
   * @return the authenticationType
   */
  public AuthenticationType getAuthenticationType()
  {
    return authenticationType;
  }


  /**
   * @return the description
   */
  public String getDescription()
  {
    return description;
  }


  /**
   * @return the type
   */
  @Override
  public ServiceProviderType getType()
  {
    return type;
  }


  /**
   * @param authenticationType the authenticationType to set
   */
  public void setAuthenticationType(
    AuthenticationType authenticationType)
  {
    this.authenticationType = authenticationType;
  }


  /**
   * @param description the description to set
   */
  public void setDescription(
    String description)
  {
    this.description = description;
  }


  /**
   * @param type the type to set
   */
  @Override
  public void setType(
    ServiceProviderType type)
  {
    this.type = (ServiceProviderTypeEntity)type;
  }

}
