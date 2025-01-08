/**
 * 
 */
package org.drdeesw.commons.identity.models.pojos;


import java.time.Instant;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.drdeesw.commons.accounting.models.Account;
import org.drdeesw.commons.accounting.models.pojos.AccountPojo;
import org.drdeesw.commons.common.models.pojos.AbstractNamedLongUniquePojo;
import org.drdeesw.commons.identity.models.Person;
import org.drdeesw.commons.organization.models.OrganizationAccount;
import org.drdeesw.commons.organization.models.pojos.OrganizationAccountPojo;
import org.drdeesw.commons.security.models.User;
import org.drdeesw.commons.security.models.pojos.UserPojo;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccount;
import org.drdeesw.commons.serviceproviders.models.pojos.ServiceProviderAccountPojo;


/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "persons")
public class PersonPojo extends AbstractNamedLongUniquePojo implements Person
{
  private UserPojo                        createdBy;
  private Instant                         creationDate;
  private String                          description;
  private boolean                         enabled;
  private Set<AccountPojo>                heldAccounts;
  private Set<OrganizationAccountPojo>    heldOrganizationAccounts;
  private Set<ServiceProviderAccountPojo> heldServiceProviderAccounts;
  private Instant                         lastUpdateDate;
  private UserPojo                        lastUpdatedBy;

  /**
   * @return the createdBy
   */
  public User getCreatedBy()
  {
    return createdBy;
  }


  /**
   * @return the creationDate
   */
  public Instant getCreationDate()
  {
    return creationDate;
  }


  /**
   * @return the description
   */
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
    return this.heldOrganizationAccounts.stream()//
        .map(account -> (OrganizationAccount)account)//
        .collect(Collectors.toSet());
  }


  @Override
  public Set<ServiceProviderAccount> getHeldServiceProviderAccounts()
  {
    return this.heldServiceProviderAccounts.stream()//
        .map(account -> (ServiceProviderAccount)account)//
        .collect(Collectors.toSet());
  }


  /**
   * @return the lastUpdateDate
   */
  public Instant getLastUpdateDate()
  {
    return lastUpdateDate;
  }


  /**
   * @return the lastUpdatedBy
   */
  public User getLastUpdatedBy()
  {
    return lastUpdatedBy;
  }


  /**
   * @return the enabled
   */
  public boolean isEnabled()
  {
    return enabled;
  }


  /**
   * @param createdBy the createdBy to set
   */
  public void setCreatedBy(
    User createdBy)
  {
    this.createdBy = (UserPojo)createdBy;
  }


  /**
   * @param creationDate the creationDate to set
   */
  public void setCreationDate(
    Instant creationDate)
  {
    this.creationDate = creationDate;
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
   * @param enabled the enabled to set
   */
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
    this.heldOrganizationAccounts = accounts.stream()//
        .map(account -> (OrganizationAccountPojo)account)//
        .collect(Collectors.toSet());
  }


  @Override
  public void setHeldServiceProviderAccounts(
    Set<ServiceProviderAccount> accounts)
  {
    this.heldServiceProviderAccounts = accounts.stream()//
        .map(account -> (ServiceProviderAccountPojo)account)//
        .collect(Collectors.toSet());
  }


  /**
   * @param lastUpdateDate the lastUpdateDate to set
   */
  public void setLastUpdateDate(
    Instant lastUpdateDate)
  {
    this.lastUpdateDate = lastUpdateDate;
  }


  /**
   * @param lastUpdatedBy the lastUpdatedBy to set
   */
  public void setLastUpdatedBy(
    User lastUpdatedBy)
  {
    this.lastUpdatedBy = (UserPojo)lastUpdatedBy;
  }

}
