package org.drdeesw.commons.serviceproviders.services.impl;


import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.drdeesw.commons.common.services.impl.AbstractJpaCrudServiceImpl;
import org.drdeesw.commons.serviceproviders.models.entities.ServiceProviderAccountEntity;
import org.drdeesw.commons.serviceproviders.models.pojos.ServiceProviderAccountPojo;
import org.drdeesw.commons.serviceproviders.models.pojos.ServiceProviderAccountTokenHolderPojo;
import org.drdeesw.commons.serviceproviders.models.pojos.ServiceProviderPojo;
import org.drdeesw.commons.serviceproviders.repositories.ServiceProviderAccountRepository;
import org.drdeesw.commons.serviceproviders.services.ServiceProviderAccountService;
import org.drdeesw.commons.serviceproviders.services.ServiceProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ServiceProviderAccountServiceImpl extends
    AbstractJpaCrudServiceImpl<ServiceProviderAccountPojo, ServiceProviderAccountEntity, Long>
    implements ServiceProviderAccountService
{
  @Autowired
  private ServiceProviderAccountRepository serviceProviderAccountRepository;

  @Autowired
  private ServiceProviderService serviceProviderService;

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


  @Override
  public Optional<ServiceProviderAccountPojo> find(
    ServiceProviderPojo serviceProvider,
    String principalName)
  {
    return this.serviceProviderAccountRepository.findByServiceProviderAndPrincipalName(serviceProvider, principalName);
  }


  @Override
  public Optional<ServiceProviderAccountPojo> find(
    String clientRegistrationId,
    String principalName)
  {
    return this.serviceProviderAccountRepository.findByClientRegistrationIdAndPrincipalName(clientRegistrationId, principalName);
  }


  @Override
  public ServiceProviderAccountPojo findOrCreate(
    String clientRegistrationId,
    String principalName)
  {
    ServiceProviderPojo serviceProvider = this.serviceProviderService
        .findOrCreate(clientRegistrationId);
    Optional<ServiceProviderAccountPojo> serviceProviderAccountOpt = this.serviceProviderAccountRepository.findByServiceProviderAndPrincipalName(serviceProvider, principalName);
    ServiceProviderAccountPojo serviceProviderAccount;
    
    if (serviceProviderAccountOpt.isEmpty())
    {
      serviceProviderAccount = new ServiceProviderAccountPojo();

      serviceProviderAccount.setPrincipalName(principalName);
      serviceProviderAccount.setServiceProvider(serviceProvider);

      serviceProviderAccount = super.create(serviceProviderAccount);
    }
    else
    {
      serviceProviderAccount = serviceProviderAccountOpt.get();
    }
    
    return serviceProviderAccount;
  }


  @PostConstruct
  protected void init()
  {
    super.init(this.serviceProviderAccountRepository);
  }

}
