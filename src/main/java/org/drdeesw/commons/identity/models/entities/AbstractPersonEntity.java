/**
 * 
 */
package org.drdeesw.commons.identity.models.entities;


import java.time.Instant;
import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

import org.drdeesw.commons.accounting.models.Account;
import org.drdeesw.commons.accounting.models.entities.AccountEntity;
import org.drdeesw.commons.common.models.entities.AbstractNamedLongUniqueEntity;
import org.drdeesw.commons.identity.models.Person;
import org.drdeesw.commons.organization.models.OrganizationAccount;
import org.drdeesw.commons.security.models.User;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccount;


/**
 * 
 */
@SuppressWarnings("serial")
@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class AbstractPersonEntity extends AbstractNamedLongUniqueEntity implements Person
{
  @ManyToOne
  @JoinColumn(name = "created_by_id")
  private User               createdBy;
  @Column(name = "creation_date")
  private Instant            creationDate;
  @Column(name = "description")
  private String             description;
  @Column(name = "enabled")
  private boolean            enabled;
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "holder", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<AccountEntity> heldAccounts;
  @Column(name = "last_update_date")
  private Instant            lastUpdateDate;

  @ManyToOne
  @JoinColumn(name = "last_updated_by_id")
  private User               lastUpdatedBy;

  /**
   * Hibernate constructor
   */
  protected AbstractPersonEntity()
  {

  }


  @Override
  public User getCreatedBy()
  {
    return this.createdBy;
  }


  @Override
  public Instant getCreationDate()
  {
    return this.creationDate;
  }


  @Override
  public String getDescription()
  {
    return this.description;
  }


  @Override
  public Set<Account> getHeldAccounts()
  {
    if (this.heldAccounts == null)
    {
      return Collections.emptySet();
    }

    return this.heldAccounts.stream()//
        .map(account -> (Account)account)//
        .collect(Collectors.toSet());
  }


  @Override
  public Set<OrganizationAccount> getHeldOrganizationAccounts()
  {
    // TODO Auto-generated method stub
    return null;
  }


  @Override
  public Set<ServiceProviderAccount> getHeldServiceProviderAccounts()
  {
    // TODO Auto-generated method stub
    return null;
  }


  @Override
  public Instant getLastUpdateDate()
  {
    return this.lastUpdateDate;
  }


  @Override
  public User getLastUpdatedBy()
  {
    return this.lastUpdatedBy;
  }


  @Override
  public boolean isEnabled()
  {
    return this.enabled;
  }


  @Override
  public void setCreatedBy(
    User createdBy)
  {
    this.createdBy = createdBy;
  }


  @Override
  public void setCreationDate(
    Instant creationDate)
  {
    this.creationDate = creationDate;
  }


  @Override
  public void setDescription(
    String description)
  {
    this.description = description;
  }


  @Override
  public void setEnabled(
    boolean enabled)
  {
    this.enabled = enabled;
  }


  @Override
  public void setHeldAccounts(
    Set<Account> accounts)
  {
    this.heldAccounts = accounts.stream()//
        .map(account -> (AccountEntity)account)//
        .collect(Collectors.toSet());
  }


  @Override
  public void setHeldOrganizationAccounts(
    Set<OrganizationAccount> accounts)
  {
    // TODO Auto-generated method stub

  }


  @Override
  public void setHeldServiceProviderAccounts(
    Set<ServiceProviderAccount> accounts)
  {
    // TODO Auto-generated method stub

  }


  @Override
  public void setLastUpdateDate(
    Instant lastUpdateDate)
  {
    this.lastUpdateDate = lastUpdateDate;
  }


  @Override
  public void setLastUpdatedBy(
    User lastUpdatedBy)
  {
    this.lastUpdatedBy = lastUpdatedBy;
  }

}
