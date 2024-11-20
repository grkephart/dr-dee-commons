/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models.pojos;

import java.util.HashSet;
import java.util.Set;

import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccount;
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
    Set<ServiceProviderAccount> accounts = new HashSet<ServiceProviderAccount>();
    ServiceProviderAccount account = new ServiceProviderAccountPojo();
   
    account.setServiceProvider(serviceProvider);
    
    accounts.add(account);
    
    serviceProvider.setAccounts(accounts);
  }

}
