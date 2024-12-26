/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import org.drdeesw.commons.accounting.models.entities.AbstractAccountableEntity;
import org.drdeesw.commons.serviceproviders.models.ServiceProvider;


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class AbstractServiceProviderEntity extends AbstractAccountableEntity
    implements ServiceProvider
{
  @ManyToOne
  @JoinColumn(name = "token_holder_id")
  private ServiceProviderAccountTokenHolderEntity tokenHolder;

  /**
   * Hibernate constructor
   */
  protected AbstractServiceProviderEntity()
  {

  }

  /**
   * @return the tokenHolder
   */
  public ServiceProviderAccountTokenHolderEntity getTokenHolder()
  {
    return tokenHolder;
  }


  /**
   * @param tokenHolder the tokenHolder to set
   */
  public void setTokenHolder(
    ServiceProviderAccountTokenHolderEntity tokenHolder)
  {
    this.tokenHolder = tokenHolder;
  }

}
