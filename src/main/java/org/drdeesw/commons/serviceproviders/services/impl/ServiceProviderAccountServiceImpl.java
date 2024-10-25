package org.drdeesw.commons.serviceproviders.services.impl;


import java.util.List;

import org.drdeesw.commons.common.services.impl.AbstractJpaCrudServiceImpl;
import org.drdeesw.commons.security.models.User;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccount;
import org.drdeesw.commons.serviceproviders.models.entities.ServiceProviderAccountEntity;
import org.drdeesw.commons.serviceproviders.models.pojos.ServiceProviderAccountPojo;
import org.drdeesw.commons.serviceproviders.services.ServiceProviderAccountService;
import org.springframework.stereotype.Service;


@Service
public class ServiceProviderAccountServiceImpl<U extends User> extends AbstractJpaCrudServiceImpl<ServiceProviderAccountPojo<U>, ServiceProviderAccountEntity<U>, Long>
    implements ServiceProviderAccountService<U>
{
  protected ServiceProviderAccountServiceImpl()
  {
    super(ServiceProviderAccountPojo.class, ServiceProviderAccountEntity.class);
  }

  @Override
  public List<ServiceProviderAccountPojo<U>> getAllAccounts()
  {
    // Retrieve all service provider accounts from the database

    return null;
  }

}
