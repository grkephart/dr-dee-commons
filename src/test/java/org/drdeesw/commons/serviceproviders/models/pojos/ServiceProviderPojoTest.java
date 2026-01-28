/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models.pojos;

import java.util.HashSet;
import java.util.Set;

import org.drdeesw.commons.accounting.models.Account;
import org.drdeesw.commons.accounting.models.pojos.AccountPojo;
import org.drdeesw.commons.identity.models.Person;
import org.drdeesw.commons.identity.models.pojos.PersonPojo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */
class ServiceProviderPojoTest
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
    ServiceProviderPojo serviceProvider = new ServiceProviderPojo();
    Set<ServiceProviderAccountPojo> providedAccounts = new HashSet<ServiceProviderAccountPojo>();
    ServiceProviderAccountPojo providedAccount = new ServiceProviderAccountPojo();
    PersonPojo person = new PersonPojo();
    
    providedAccount.setHolder(person);
    providedAccount.setProvider(serviceProvider);
    
    providedAccounts.add(providedAccount);
    
    serviceProvider.setProvidedAccounts(providedAccounts);
  }

}
