/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;


import java.time.Instant;
import java.util.Set;

import org.drdeesw.commons.accounting.models.entities.AccountEntity;
import org.drdeesw.commons.common.models.EmbeddedAuditable;
import org.drdeesw.commons.organization.models.Organization;
import org.drdeesw.commons.organization.models.OrganizationMember;
import org.drdeesw.commons.organization.models.OrganizationRole;
import org.drdeesw.commons.organization.models.OrganizationStatus;
import org.drdeesw.commons.security.models.entities.UserEntity;
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
    EmbeddedAuditable<UserEntity> audit = new EmbeddedAuditable<UserEntity>();
    OrganizationEntity parent = new OrganizationEntity();
    OrganizationEntity organization = new OrganizationEntity(audit);
    Set<OrganizationEntity> children = Set.of(organization);
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
    organization.setHeldAccounts(null);
    organization.setLastUpdatedBy(lastUpdatedBy);
    organization.setLastUpdateDate(lastUpdateDate);
    organization.setMembers(null);
    organization.setName(name);
    organization.setParent(parent);
    organization.setProvidedAccounts(null);
    organization.setRoles(null);
    organization.setStatus(status);
    organization.setType(type);

    organization.getChildren();
    organization.getCreatedBy();
    organization.getCreationDate();
    organization.getDescription();
    organization.isEnabled();
    organization.getHeldAccounts();
    organization.getLastUpdateDate();
    organization.getLastUpdatedBy();
    organization.getMembers();
    organization.getName();
    organization.getParent();
    organization.getProvidedAccounts();
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
    EmbeddedAuditable<UserEntity> audit = new EmbeddedAuditable<UserEntity>();
    UserEntity createdBy = new UserEntity();
    Instant creationDate = Instant.now();
    String description = "toy7 o56ybo7yo  hkghgy";
    boolean enabled = true;
    UserEntity lastUpdatedBy = new UserEntity();
    Instant lastUpdateDate = Instant.now();
    OrganizationMemberEntity member = new OrganizationMemberEntity();
    Set<OrganizationMemberEntity> members = Set.of(member);
    OrganizationEntity parent = new OrganizationEntity();
    OrganizationEntity organization = new OrganizationEntity(audit);
    Set<OrganizationEntity> children = Set.of(organization);
    String name = "tjttkyyryju6";
    OrganizationAccountEntity heldAccount = new OrganizationAccountEntity();
    Set<OrganizationAccountEntity> heldAccounts = Set.of(heldAccount);
    OrganizationAccountEntity providedAccount = new OrganizationAccountEntity();
    Set<OrganizationAccountEntity> providedAccounts = Set.of(providedAccount);
    OrganizationRoleEntity role = new OrganizationRoleEntity();
    Set<OrganizationRoleEntity> roles = Set.of(role);
    OrganizationStatus status = OrganizationStatus.ACTIVE;
    OrganizationTypeEntity type = new OrganizationTypeEntity();

    organization.setChildren(children);
    organization.setCreatedBy(createdBy);
    organization.setCreationDate(creationDate);
    organization.setDescription(description);
    organization.setEnabled(enabled);
    organization.setHeldAccounts(heldAccounts);
    organization.setLastUpdatedBy(lastUpdatedBy);
    organization.setLastUpdateDate(lastUpdateDate);
    organization.setMembers(members);
    organization.setName(name);
    organization.setParent(parent);
    organization.setProvidedAccounts(providedAccounts);
    organization.setRoles(roles);
    organization.setStatus(status);
    organization.setType(type);

    organization.getChildren();
    organization.getCreatedBy();
    organization.getCreationDate();
    organization.getDescription();
    organization.isEnabled();
    organization.getHeldAccounts();
    organization.getLastUpdateDate();
    organization.getLastUpdatedBy();
    organization.getMembers();
    organization.getName();
    organization.getParent();
    organization.getProvidedAccounts();
    organization.getRoles();
    organization.getStatus();
    organization.getType();
  }

}
