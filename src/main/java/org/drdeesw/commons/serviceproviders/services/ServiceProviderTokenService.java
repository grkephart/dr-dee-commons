package org.drdeesw.commons.serviceproviders.services;


import org.drdeesw.commons.serviceproviders.models.pojos.ServiceProviderAccountPojo;


public interface ServiceProviderTokenService
{

  /**
   * Refresh the token for the given account.
   * 
   * @param account the account to refresh the token for
   */
  void refreshToken(
    ServiceProviderAccountPojo account);

}