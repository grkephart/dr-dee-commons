/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models.pojos;


import java.time.Instant;
import java.util.Set;

import org.drdeesw.commons.common.models.pojos.AbstractNamedLongUniquePojo;
import org.drdeesw.commons.security.models.pojos.BaseUserPojo;
import org.drdeesw.commons.serviceproviders.models.AuthenticationType;


/**
 * 
 */
@SuppressWarnings("serial")
public class AbstractServiceProviderPojo<//
    U extends BaseUserPojo<?>, //
    PA extends BaseServiceProviderAccountPojo<U, ?, ?>> //
    extends AbstractNamedLongUniquePojo implements BaseServiceProviderPojo<U, PA>
{
  private AuthenticationType authenticationType;
  private String             clientRegistrationId;
  private U                createdBy;
  private Instant          creationDate;
  private String           description;
  private boolean          enabled;
  private Instant          lastUpdateDate;
  private U                lastUpdatedBy;
  private Set<PA>          providedAccounts;

  @Override
  public AuthenticationType getAuthenticationType()
  {
    return authenticationType;
  }


  @Override
  public String getClientRegistrationId()
  {
    return this.clientRegistrationId;
  }


  @Override
  public U getCreatedBy()
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
    return description;
  }


  @Override
  public Instant getLastUpdateDate()
  {
    return this.lastUpdateDate;
  }


  @Override
  public U getLastUpdatedBy()
  {
    return this.lastUpdatedBy;
  }


  @Override
  public Set<PA> getProvidedAccounts()
  {
    return this.providedAccounts;
  }


  @Override
  public boolean isEnabled()
  {
    return this.enabled;
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
  public void setCreatedBy(
    U createdBy)
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
  public void setLastUpdateDate(
    Instant lastUpdateDate)
  {
    this.lastUpdateDate = lastUpdateDate;
  }


  @Override
  public void setLastUpdatedBy(
    U lastUpdatedBy)
  {
    this.lastUpdatedBy = lastUpdatedBy;
  }


  @Override
  public void setProvidedAccounts(
    Set<PA> accounts)
  {
    this.providedAccounts = accounts;
  }

}
