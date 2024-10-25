package org.drdeesw.commons.serviceproviders.services;


import java.util.List;

import org.drdeesw.commons.common.services.CrudService;
import org.drdeesw.commons.security.models.pojos.UserPojo;
import org.drdeesw.commons.serviceproviders.models.pojos.ServiceProviderAccountPojo;


public interface ServiceProviderAccountService<U extends UserPojo>
    extends CrudService<ServiceProviderAccountPojo<U>, Long>
{
  /**
   * @return
   */
  List<ServiceProviderAccountPojo<U>> getAllAccounts();

}