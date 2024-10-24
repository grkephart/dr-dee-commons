package org.drdeesw.commons.serviceproviders.services.impl;


import java.util.List;

import org.drdeesw.commons.security.models.User;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccount;


public interface ServiceProviderAccountService<U extends User>
{
  /**
   * @return
   */
  List<ServiceProviderAccount<U>> getAllAccounts();


  /**
   * @param account
   */
  void saveAccount(
    ServiceProviderAccount<U> account);
}