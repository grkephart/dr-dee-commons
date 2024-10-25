package org.drdeesw.commons.serviceproviders.services.impl;


import org.drdeesw.commons.security.models.pojos.UserPojo;
import org.drdeesw.commons.serviceproviders.models.pojos.ServiceProviderAccountPojo;


public interface TokenService<U extends UserPojo>
{

  /**
   * @param account
   */
  void refreshToken(
    ServiceProviderAccountPojo<U> account);

}