/**
 * 
 */
package org.drdeesw.commons.organization.models.pojos;

import java.util.HashSet;
import java.util.Set;

import org.drdeesw.commons.organization.models.OrganizationAccount;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccount;
import org.drdeesw.commons.serviceproviders.models.pojos.ServiceProviderAccountPojo;
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
    Set<OrganizationAccount> accounts = new HashSet<OrganizationAccount>();
    OrganizationAccount account1 = new OrganizationAccountPojo();
    ServiceProviderAccount account2 = new ServiceProviderAccountPojo();
   
    account1.setOrganization(org);
    account2.setOrganization(org);
    
    accounts.add(account1);
    accounts.add(account2);
    
    org.setParent(parent);
    org.setAccounts(accounts);
  }

}
