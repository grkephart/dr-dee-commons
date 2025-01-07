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
import javax.persistence.OneToOne;

import org.drdeesw.commons.common.models.entities.AbstractNamedLongUniqueEntity;
import org.drdeesw.commons.security.models.User;
import org.drdeesw.commons.security.models.entities.UserEntity;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccount;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccountTokenHolder;


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class AbstractServiceProviderAccountEntity extends AbstractNamedLongUniqueEntity
    implements ServiceProviderAccount
{

  @Column(name = "is_active", nullable = false)
  private boolean                           active;

  @Column(name = "internal_id")
  private String                            internalId;

  @ManyToOne
  @JoinColumn(name = "token_holder_id", nullable = false)
  private ServiceProviderAccountTokenHolder tokenHolder;

  @OneToOne
  @JoinColumn(name = "user_id")
  private UserEntity                        user;

  /**
   * Hibernate constructor
   */
  protected AbstractServiceProviderAccountEntity()
  {

  }

  @Override
  public String getInternalId()
  {
    return this.internalId;
  }


  @Override
  public ServiceProviderAccountTokenHolder getTokenHolder()
  {
    return this.tokenHolder;
  }


  @Override
  public User getUser()
  {
    return user;
  }


  @Override
  public boolean isActive()
  {
    return this.active;
  }


  @Override
  public void setActive(
    boolean active)
  {
    this.active = active;
  }


  @Override
  public void setInternalId(
    String internalId)
  {
    this.internalId = internalId;
  }


  @Override
  public void setTokenHolder(
    ServiceProviderAccountTokenHolder tokenHolder)
  {
    this.tokenHolder = tokenHolder;
  }


  @Override
  public void setUser(
    User user)
  {
    this.user = (UserEntity)user;
  }

}
