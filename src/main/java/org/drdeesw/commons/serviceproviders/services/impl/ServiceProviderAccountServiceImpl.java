package org.drdeesw.commons.serviceproviders.services.impl;


import java.util.List;

import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccount;
import org.springframework.stereotype.Service;


@Service
public class ServiceProviderAccountServiceImpl implements ServiceProviderAccountService
{
  public List<ServiceProviderAccount> getAllAccounts()
  {
    // Retrieve all service provider accounts from the database
    
    return null;
  }


  public void saveAccount(
    ServiceProviderAccount account)
  {
    // Save the updated account details to the database
  }
}
