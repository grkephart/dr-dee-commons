package org.drdeesw.commons.serviceproviders.services.impl;


import java.util.List;

import org.drdeesw.commons.common.services.impl.AbstractJpaCrudServiceImpl;
import org.drdeesw.commons.serviceproviders.models.entities.ServiceProviderAccountEntity;
import org.drdeesw.commons.serviceproviders.models.pojos.ServiceProviderAccountPojo;
import org.drdeesw.commons.serviceproviders.services.ServiceProviderAccountService;
import org.springframework.stereotype.Service;


@Service
public class ServiceProviderAccountServiceImpl extends
    AbstractJpaCrudServiceImpl<ServiceProviderAccountPojo, ServiceProviderAccountEntity, Long>
    implements ServiceProviderAccountService
{
  protected ServiceProviderAccountServiceImpl()
  {
    super(ServiceProviderAccountPojo.class, ServiceProviderAccountEntity.class);
  }


  @Override
  public List<ServiceProviderAccountPojo> getAllAccounts()
  {
    // Retrieve all service provider accounts from the database

    return null;
  }

}
