package org.drdeesw.commons.serviceproviders.services.impl;


import java.util.Optional;

import org.drdeesw.commons.common.services.impl.AbstractJpaCrudServiceImpl;
import org.drdeesw.commons.serviceproviders.models.entities.ServiceProviderAccountTokenHolderEntity;
import org.drdeesw.commons.serviceproviders.models.pojos.ServiceProviderAccountPojo;
import org.drdeesw.commons.serviceproviders.models.pojos.ServiceProviderAccountTokenHolderPojo;
import org.drdeesw.commons.serviceproviders.services.ServiceProviderAccountService;
import org.drdeesw.commons.serviceproviders.services.ServiceProviderAccountTokenHolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ServiceProviderAccountTokenHolderServiceImpl extends
    AbstractJpaCrudServiceImpl<ServiceProviderAccountTokenHolderPojo, ServiceProviderAccountTokenHolderEntity, Long>
    implements ServiceProviderAccountTokenHolderService
{
  @Autowired
  private ServiceProviderAccountService serviceProviderAccountService;

  /**
   * 
   */
  protected ServiceProviderAccountTokenHolderServiceImpl()
  {
    super(ServiceProviderAccountTokenHolderPojo.class, ServiceProviderAccountTokenHolderEntity.class);
  }


  /**
   *
   */
  @Override
  public Optional<ServiceProviderAccountTokenHolderPojo> find(
    String clientRegistrationId,
    String principalName)
  {
    Optional<ServiceProviderAccountPojo> serviceProviderAccount = this.serviceProviderAccountService
        .find(clientRegistrationId, principalName);

    return serviceProviderAccount.map(account -> Optional.of(account.getTokenHolder()))
        .orElse(Optional.empty());
  }


  /**
   * @throws Exception 
   *
   */
  @Override
  public ServiceProviderAccountTokenHolderPojo findOrCreate(
    String clientRegistrationId,
    String principalName) throws Exception
  {
    ServiceProviderAccountPojo serviceProviderAccount = this.serviceProviderAccountService
        .findOrCreate(clientRegistrationId, principalName);
    ServiceProviderAccountTokenHolderPojo tokenHolder = serviceProviderAccount.getTokenHolder();
    
    if (serviceProviderAccount.getTokenHolder() == null)
    {
      tokenHolder = new ServiceProviderAccountTokenHolderPojo();
      
      tokenHolder.setAccount(serviceProviderAccount);
      serviceProviderAccount.setTokenHolder(tokenHolder);
      
      tokenHolder = super.create(tokenHolder);
    }
    
    return tokenHolder;
  }

}
