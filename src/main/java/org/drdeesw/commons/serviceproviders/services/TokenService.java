package org.drdeesw.commons.serviceproviders.services;


import org.drdeesw.commons.serviceproviders.models.pojos.ServiceProviderAccountPojo;


public interface TokenService
{

  /**
   * @param account
   */
  void refreshToken(
    ServiceProviderAccountPojo account);

}