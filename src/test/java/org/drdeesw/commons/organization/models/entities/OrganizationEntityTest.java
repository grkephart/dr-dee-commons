/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;


import java.time.Instant;
import java.util.Set;

import org.drdeesw.commons.common.models.EmbeddedAuditable;
import org.drdeesw.commons.organization.models.Organization;
import org.drdeesw.commons.organization.models.OrganizationAccount;
import org.drdeesw.commons.organization.models.OrganizationMember;
import org.drdeesw.commons.organization.models.OrganizationRole;
import org.drdeesw.commons.organization.models.OrganizationStatus;
import org.drdeesw.commons.security.models.entities.UserEntity;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccount;
import org.drdeesw.commons.serviceproviders.models.entities.ServiceProviderAccountEntity;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/**
 * 
 */
class OrganizationEntityTest
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
    OrganizationEntity parent = new OrganizationEntity();
    OrganizationEntity organization = new OrganizationEntity(audit);
    Set<Organization> children = Set.of(organization);
    UserEntity createdBy = new UserEntity();
    Instant creationDate = Instant.now();
    String description = "toy7 o56ybo7yo  hkghgy";
    boolean enabled = true;
    UserEntity lastUpdatedBy = new UserEntity();
    Instant lastUpdateDate = Instant.now();
    String name = "tjttkyyryju6";
    OrganizationStatus status = OrganizationStatus.ACTIVE;
    OrganizationTypeEntity type = new OrganizationTypeEntity();

    organization.setChildren(children);
    organization.setCreatedBy(createdBy);
    organization.setCreationDate(creationDate);
    organization.setDescription(description);
    organization.setEnabled(enabled);
    //organization.setHeldAccounts(null);
    organization.setHeldOrganizationAccounts(null);
    organization.setHeldServiceProviderAccounts(null);
    organization.setLastUpdatedBy(lastUpdatedBy);
    organization.setLastUpdateDate(lastUpdateDate);
    organization.setMembers(null);
    organization.setName(name);
    organization.setParent(parent);
    organization.setProvidedAccounts(null);
    organization.setProvidedOrganizationAccounts(null);
    organization.setProvidedServiceProviderAccounts(null);
    organization.setRoles(null);
    organization.setStatus(status);
    organization.setType(type);

    organization.getChildren();
    organization.getCreatedBy();
    organization.getCreationDate();
    organization.getDescription();
    organization.isEnabled();
    organization.getHeldAccounts();
    organization.getHeldOrganizationAccounts();
    organization.getHeldServiceProviderAccounts();
    organization.getLastUpdateDate();
    organization.getLastUpdatedBy();
    organization.getMembers();
    organization.getName();
    organization.getParent();
    //organization.getProvidedAccounts();
    organization.getProvidedOrganizationAccounts();
    organization.getProvidedServiceProviderAccounts();
    organization.getRoles();
    organization.getStatus();
    organization.getType();
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
    OrganizationMemberEntity member = new OrganizationMemberEntity();
    Set<OrganizationMember> members = Set.of(member);
    OrganizationEntity parent = new OrganizationEntity();
    OrganizationEntity organization = new OrganizationEntity(audit);
    Set<Organization> children = Set.of(organization);
    String name = "tjttkyyryju6";
    OrganizationAccountEntity heldOrganizationAccount = new OrganizationAccountEntity();
    Set<OrganizationAccount> heldOrganizationAccounts = Set.of(heldOrganizationAccount);
    ServiceProviderAccountEntity heldServiceProviderAccount = new ServiceProviderAccountEntity();
    Set<ServiceProviderAccount> heldServiceProviderAccounts = Set.of(heldServiceProviderAccount);
    //AccountEntity heldAccount = new AccountEntity();
    //Set<Account> heldAccounts = Set.of(heldAccount, heldOrganizationAccount, heldServiceProviderAccount);
    //AccountEntity providedAccount = new AccountEntity();
    //Set<Account> providedAccounts = Set.of(providedAccount);
    OrganizationAccountEntity providedOrganizationAccount = new OrganizationAccountEntity();
    Set<OrganizationAccount> providedOrganizationAccounts = Set.of(providedOrganizationAccount);
    ServiceProviderAccountEntity providedServiceProviderAccount = new ServiceProviderAccountEntity();
    Set<ServiceProviderAccount> providedServiceProviderAccounts = Set.of(providedServiceProviderAccount);
    OrganizationRoleEntity role = new OrganizationRoleEntity();
    Set<OrganizationRole> roles = Set.of(role);
    OrganizationStatus status = OrganizationStatus.ACTIVE;
    OrganizationTypeEntity type = new OrganizationTypeEntity();

    organization.setChildren(children);
    organization.setCreatedBy(createdBy);
    organization.setCreationDate(creationDate);
    organization.setDescription(description);
    organization.setEnabled(enabled);
    //organization.setHeldAccounts(heldAccounts);
    organization.setHeldOrganizationAccounts(heldOrganizationAccounts);
    organization.setHeldServiceProviderAccounts(heldServiceProviderAccounts);
    organization.setLastUpdatedBy(lastUpdatedBy);
    organization.setLastUpdateDate(lastUpdateDate);
    organization.setMembers(members);
    organization.setName(name);
    organization.setParent(parent);
    //organization.setProvidedAccounts(providedAccounts);
    organization.setProvidedOrganizationAccounts(providedOrganizationAccounts);
    organization.setProvidedServiceProviderAccounts(providedServiceProviderAccounts);
    organization.setRoles(roles);
    organization.setStatus(status);
    organization.setType(type);

    organization.getChildren();
    organization.getCreatedBy();
    organization.getCreationDate();
    organization.getDescription();
    organization.isEnabled();
    //organization.getHeldAccounts();
    organization.getHeldOrganizationAccounts();
    organization.getHeldServiceProviderAccounts();
    organization.getLastUpdateDate();
    organization.getLastUpdatedBy();
    organization.getMembers();
    organization.getName();
    organization.getParent();
    //organization.getProvidedAccounts();
    organization.getProvidedOrganizationAccounts();
    organization.getProvidedServiceProviderAccounts();
    organization.getRoles();
    organization.getStatus();
    organization.getType();
  }

}
