/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models.entities;


import javax.persistence.Entity;
import javax.persistence.Table;

import org.drdeesw.commons.common.models.entities.AbstractNamedLongUniqueEntity;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderType;


@SuppressWarnings("serial")
@Entity
@Table(name = "service_provider_types")
public class ServiceProviderTypeEntity extends AbstractNamedLongUniqueEntity
    implements ServiceProviderType
{

}
