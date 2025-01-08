/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models.entities;

import java.time.Instant;
import java.util.Set;

import org.drdeesw.commons.common.models.EmbeddedAuditable;
import org.drdeesw.commons.organization.models.OrganizationAccount;
import org.drdeesw.commons.organization.models.entities.OrganizationAccountEntity;
import org.drdeesw.commons.security.models.entities.UserEntity;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccount;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */
class ServiceProviderEntityTest
{

  /**
   * @throws java.lang.Exception
   */
  @BeforeEach
  void setUp() throws Exception
  {
  }


  /**
   * @throws java.lang.Exception
   */
  @AfterEach
  void tearDown() throws Exception
  {
  }


  /**
   * 
   */
  @Test
  void testConstructionWithNullSets()
  {
    EmbeddedAuditable audit = new EmbeddedAuditable();
    ServiceProviderEntity serviceProvider = new ServiceProviderEntity(audit);
    UserEntity createdBy = new UserEntity();
    Instant creationDate = Instant.now();
    String description = "toy7 o56ybo7yo  hkghgy";
    boolean enabled = true;
    UserEntity lastUpdatedBy = new UserEntity();
    Instant lastUpdateDate = Instant.now();
    String name = "tjttkyyryju6";

    serviceProvider.setCreatedBy(createdBy);
    serviceProvider.setCreationDate(creationDate);
    serviceProvider.setDescription(description);
    serviceProvider.setEnabled(enabled);
    serviceProvider.setLastUpdatedBy(lastUpdatedBy);
    serviceProvider.setLastUpdateDate(lastUpdateDate);
    serviceProvider.setName(name);
    //serviceProvider.setProvidedAccounts(null);
    serviceProvider.setProvidedOrganizationAccounts(null);
    serviceProvider.setProvidedServiceProviderAccounts(null);

    serviceProvider.getCreatedBy();
    serviceProvider.getCreationDate();
    serviceProvider.getDescription();
    serviceProvider.isEnabled();
    serviceProvider.getLastUpdateDate();
    serviceProvider.getLastUpdatedBy();
    serviceProvider.getName();
    //serviceProvider.getProvidedAccounts();
    serviceProvider.getProvidedOrganizationAccounts();
    serviceProvider.getProvidedServiceProviderAccounts();
  }


  /**
   * 
   */
  @Test
  void testConstructionWithBasicSets()
  {
    EmbeddedAuditable audit = new EmbeddedAuditable();
    UserEntity createdBy = new UserEntity();
    Instant creationDate = Instant.now();
    String description = "toy7 o56ybo7yo  hkghgy";
    boolean enabled = true;
    UserEntity lastUpdatedBy = new UserEntity();
    Instant lastUpdateDate = Instant.now();
    ServiceProviderEntity serviceProvider = new ServiceProviderEntity(audit);
    String name = "tjttkyyryju6";
    //AccountEntity providedAccount = new AccountEntity();
    //Set<Account> providedAccounts = Set.of(providedAccount);
    OrganizationAccountEntity providedOrganizationAccount = new OrganizationAccountEntity();
    Set<OrganizationAccount> providedOrganizationAccounts = Set.of(providedOrganizationAccount);
    ServiceProviderAccountEntity providedServiceProviderAccount = new ServiceProviderAccountEntity();
    Set<ServiceProviderAccount> providedServiceProviderAccounts = Set.of(providedServiceProviderAccount);

    serviceProvider.setCreatedBy(createdBy);
    serviceProvider.setCreationDate(creationDate);
    serviceProvider.setDescription(description);
    serviceProvider.setEnabled(enabled);
    serviceProvider.setLastUpdatedBy(lastUpdatedBy);
    serviceProvider.setLastUpdateDate(lastUpdateDate);
    serviceProvider.setName(name);
    //serviceProvider.setProvidedAccounts(providedAccounts);
    serviceProvider.setProvidedOrganizationAccounts(providedOrganizationAccounts);
    serviceProvider.setProvidedServiceProviderAccounts(providedServiceProviderAccounts);

    serviceProvider.getCreatedBy();
    serviceProvider.getCreationDate();
    serviceProvider.getDescription();
    serviceProvider.isEnabled();
    serviceProvider.getLastUpdateDate();
    serviceProvider.getLastUpdatedBy();
    serviceProvider.getName();
    //serviceProvider.getProvidedAccounts();
    serviceProvider.getProvidedOrganizationAccounts();
    serviceProvider.getProvidedServiceProviderAccounts();
  }

}
