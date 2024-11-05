package org.drdeesw.commons.serviceproviders.services.impl;


import org.drdeesw.commons.common.services.impl.AbstractJpaCrudServiceImpl;
import org.drdeesw.commons.serviceproviders.models.entities.ServiceProviderTypeEntity;
import org.drdeesw.commons.serviceproviders.models.pojos.ServiceProviderTypePojo;
import org.drdeesw.commons.serviceproviders.services.ServiceProviderTypeService;
import org.springframework.stereotype.Service;


@Service
public class ServiceProviderTypeServiceImpl extends
    AbstractJpaCrudServiceImpl<ServiceProviderTypePojo, ServiceProviderTypeEntity, Long>
    implements ServiceProviderTypeService
{
  protected ServiceProviderTypeServiceImpl()
  {
    super(ServiceProviderTypePojo.class, ServiceProviderTypeEntity.class);
  }


}
