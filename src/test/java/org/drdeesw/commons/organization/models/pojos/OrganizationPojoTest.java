/**
 * 
 */
package org.drdeesw.commons.organization.models.pojos;

import java.util.HashSet;
import java.util.Set;

import org.drdeesw.commons.accounting.models.pojos.AccountPojo;
import org.drdeesw.commons.identity.models.pojos.PersonPojo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */
class OrganizationPojoTest
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
    OrganizationPojo parent = new OrganizationPojo();
    OrganizationPojo org = new OrganizationPojo();
    Set<AccountPojo> heldAccounts = new HashSet<AccountPojo>();
    OrganizationAccountPojo heldAccount1 = new OrganizationAccountPojo();
    Set<OrganizationAccountPojo> providedAccounts = new HashSet<OrganizationAccountPojo>();
    OrganizationAccountPojo providedAccounts1 = new OrganizationAccountPojo();
    PersonPojo  person = new PersonPojo();
    
    heldAccount1.setHolder(person);
    heldAccount1.setProvider(org);
    
    heldAccounts.add(heldAccount1);
    
    providedAccounts1.setHolder(person);
    providedAccounts1.setProvider(org);
    
    providedAccounts.add(providedAccounts1);
    
    org.setParent(parent);
    org.setHeldAccounts(heldAccounts);
    org.setProvidedAccounts(providedAccounts);
  }

}
