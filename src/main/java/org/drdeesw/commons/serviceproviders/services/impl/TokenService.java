package org.drdeesw.commons.serviceproviders.services.impl;


import org.drdeesw.commons.security.models.User;
import org.drdeesw.commons.serviceproviders.models.pojos.ServiceProviderAccountPojo;


public interface TokenService<U extends User>
{

  /**
   * @param account
   */
  void refreshToken(
    ServiceProviderAccountPojo<U> account);

}