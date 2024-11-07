package org.drdeesw.commons.serviceproviders.services.impl;


import java.util.Optional;

import javax.annotation.PostConstruct;

import org.drdeesw.commons.common.services.impl.AbstractJpaCrudServiceImpl;
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
  public Optional<ServiceProviderPojo> findByClientRegistrationId(
    String clientRegistrationId)
  {
    Optional<ServiceProviderEntity> serviceProviderEntity = this.serviceProviderRepository
        .findByClientRegistrationId(clientRegistrationId);

    return serviceProviderEntity.map(this::convertEntityToPojo);
  }


  @PostConstruct
  protected void init()
  {
    super.init(this.serviceProviderRepository);
  }

}
