/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;

import java.util.HashSet;
import java.util.Set;

import org.drdeesw.commons.accounting.models.Account;
import org.drdeesw.commons.identity.models.entities.PersonEntity;
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


  @Test
  void testConstruction()
  {
    OrganizationEntity parent = new OrganizationEntity();
    OrganizationEntity providerOrg = new OrganizationEntity();
    OrganizationEntity holderOrg = new OrganizationEntity();
    Set<Account> heldAccounts = new HashSet<Account>();
    OrganizationAccountEntity heldAccount1 = new OrganizationAccountEntity();
    OrganizationAccountEntity heldAccount2 = new OrganizationAccountEntity();
    Set<Account> providedAccounts = new HashSet<Account>();
    OrganizationAccountEntity providedAccounts1 = new OrganizationAccountEntity();
    PersonEntity person = new PersonEntity();
    UserEntity user= new UserEntity();
    
    //heldAccount1.setHolder(person);
    heldAccount1.setProvider(providerOrg); // TODO java.lang.ClassCastException: class OrganizationEntity cannot be cast to class AccountProviderEntity

    heldAccount1.setUser(user);
    
    //heldAccount2.setHolder(holderOrg); // TODO class OrganizationEntity cannot be cast to class AbstractAccountHolderEntity. but can be cast to AbstractAccountProviderHolderEntity
    heldAccount2.setProvider(providerOrg); // TODO java.lang.ClassCastException: class OrganizationEntity cannot be cast to class AccountProviderEntity
    heldAccount2.setUser(user);
    
    user.setAccount(heldAccount1);
    user.setAccount(heldAccount2);
    
    heldAccounts.add(heldAccount1);
    heldAccounts.add(heldAccount2);
    
    providedAccounts1.setHolder(person);
    //providedAccounts1.setProvider(providerOrg); // TODO java.lang.ClassCastException: class OrganizationEntity cannot be cast to class AccountProviderEntity
    
    providedAccounts.add(providedAccounts1);
    
    providerOrg.setParent(parent);
    providerOrg.setHeldAccounts(heldAccounts);
    providerOrg.setProvidedAccounts(providedAccounts);
  }

}
