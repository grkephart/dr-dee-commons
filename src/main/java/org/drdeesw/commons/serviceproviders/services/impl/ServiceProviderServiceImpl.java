package org.drdeesw.commons.serviceproviders.services.impl;


import javax.annotation.PostConstruct;

import org.drdeesw.commons.common.services.impl.AbstractJpaCrudServiceImpl;
import org.drdeesw.commons.serviceproviders.models.ServiceProvider;
import org.drdeesw.commons.serviceproviders.models.entities.ServiceProviderEntity;
import org.drdeesw.commons.serviceproviders.models.pojos.ServiceProviderPojo;
import org.drdeesw.commons.serviceproviders.repositories.ServiceProviderRepository;
import org.drdeesw.commons.serviceproviders.services.ServiceProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ServiceProviderServiceImpl
    extends AbstractJpaCrudServiceImpl<ServiceProviderPojo, ServiceProviderEntity, Long>
    implements ServiceProviderService
{
  @Autowired
  private ServiceProviderRepository serviceProviderRepository;
  /**
   * 
   */
  public ServiceProviderServiceImpl()
  {
    super(ServiceProviderPojo.class, ServiceProviderEntity.class);
  }


  @Override
  public ServiceProvider findByClientRegistrationId(
    String clientRegistrationId)
  {
    return this.serviceProviderRepository.findByClientRegistrationId(clientRegistrationId);
  }


  @PostConstruct
  protected void init()
  {
    super.init(this.serviceProviderRepository);
  }

}
