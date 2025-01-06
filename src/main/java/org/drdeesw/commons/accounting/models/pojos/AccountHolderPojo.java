/**
 * 
 */
package org.drdeesw.commons.accounting.models.pojos;


import java.time.Instant;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.drdeesw.commons.accounting.models.Account;
import org.drdeesw.commons.accounting.models.AccountHolder;
import org.drdeesw.commons.common.models.pojos.AbstractNamedLongUniquePojo;
import org.drdeesw.commons.organization.models.OrganizationAccount;
import org.drdeesw.commons.security.models.User;
import org.drdeesw.commons.security.models.entities.UserEntity;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccount;


/**
 * 
 */
@SuppressWarnings("serial")
public class AccountHolderPojo extends AbstractNamedLongUniquePojo implements AccountHolder
{
  @ManyToOne
  @JoinColumn(name = "created_by", nullable = false)
  private UserEntity                  createdBy;

  @Column(name = "creation_date", nullable = false)
  private Instant                     creationDate;

  @Column(name = "description", nullable = false)
  private String                      description;

  @Column(name = "is_enabled", nullable = false)
  private boolean                     enabled;

  private Set<AccountPojo>            heldAccounts;

  private Set<OrganizationAccount>    heldOrganizationAccounts;

  private Set<ServiceProviderAccount> heldServiceProviderAccounts;

  @Column(name = "last_update_date", nullable = false)
  private Instant                     lastUpdateDate;

  @ManyToOne
  @JoinColumn(name = "last_updated_by", nullable = false)
  private UserEntity                  lastUpdatedBy;

  public AccountHolderPojo()
  {
    super();
  }


  public AccountHolderPojo(Long id)
  {
    super(id);
  }


  @Override
  public UserEntity getCreatedBy()
  {
    return createdBy;
  }


  @Override
  public Instant getCreationDate()
  {
    return creationDate;
  }


  @Override
  public String getDescription()
  {
    return description;
  }


  @Override
  public Set<Account> getHeldAccounts()
  {
    return this.heldAccounts.stream()//
        .map(account -> (Account)account)//
        .collect(Collectors.toSet());
  }


  @Override
  public Set<OrganizationAccount> getHeldOrganizationAccounts()
  {
    return this.heldOrganizationAccounts;
  }


  @Override
  public Set<ServiceProviderAccount> getHeldServiceProviderAccounts()
  {
    return this.heldServiceProviderAccounts;
  }


  @Override
  public Instant getLastUpdateDate()
  {
    return lastUpdateDate;
  }


  @Override
  public UserEntity getLastUpdatedBy()
  {
    return lastUpdatedBy;
  }


  @Override
  public boolean isEnabled()
  {
    return enabled;
  }


  @Override
  public void setCreatedBy(
    User createdBy)
  {
    this.createdBy = (UserEntity)createdBy;
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
        .map(account -> (AccountPojo)account)//
        .collect(Collectors.toSet());
  }


  @Override
  public void setHeldOrganizationAccounts(
    Set<OrganizationAccount> accounts)
  {
    this.heldOrganizationAccounts = accounts;
  }


  @Override
  public void setHeldServiceProviderAccounts(
    Set<ServiceProviderAccount> accounts)
  {
    this.heldServiceProviderAccounts = accounts;
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
    this.lastUpdatedBy = (UserEntity)lastUpdatedBy;
  }

}
