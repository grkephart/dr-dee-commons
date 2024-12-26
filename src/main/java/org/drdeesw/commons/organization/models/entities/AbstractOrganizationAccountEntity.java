/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

import org.drdeesw.commons.accounting.models.entities.AbstractAccountableEntity;
import org.drdeesw.commons.organization.models.OrganizationAccount;
import org.drdeesw.commons.security.models.User;
import org.drdeesw.commons.security.models.entities.UserEntity;


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class AbstractOrganizationAccountEntity extends AbstractAccountableEntity
    implements OrganizationAccount
{

  @Column(name = "is_active", nullable = false)
  private boolean    active;

  @Column(name = "internal_id")
  private String     internalId;

  @OneToOne
  @JoinColumn(name = "user_id")
  private UserEntity user;

  /**
   * Hibernate constructor
   */
  protected AbstractOrganizationAccountEntity()
  {

  }


  @Override
  public String getInternalId()
  {
    return this.internalId;
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
  public void setUser(
    User user)
  {
    this.user = (UserEntity)user;
  }

}
