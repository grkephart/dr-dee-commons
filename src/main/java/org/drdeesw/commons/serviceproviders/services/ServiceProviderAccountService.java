package org.drdeesw.commons.serviceproviders.services;


import java.util.List;

import org.drdeesw.commons.common.services.CrudService;
import org.drdeesw.commons.serviceproviders.models.pojos.ServiceProviderAccountPojo;


public interface ServiceProviderAccountService extends CrudService<ServiceProviderAccountPojo, Long>
{
  /**
   * @return
   */
  List<ServiceProviderAccountPojo> getAllAccounts();

}