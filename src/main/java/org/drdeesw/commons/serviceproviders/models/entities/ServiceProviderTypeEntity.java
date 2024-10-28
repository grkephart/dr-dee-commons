/**
 * 
 */
package org.drdeesw.commons.serviceproviders.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.drdeesw.commons.common.models.entities.AbstractNamedLongUniqueEntity;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderType;


@SuppressWarnings("serial")
@Entity
@Table(name = "service_provider_types")
@AttributeOverride(name = "id", column = @Column(name = "service_provider_type_id"))
@Access(AccessType.FIELD)
public class ServiceProviderTypeEntity extends AbstractNamedLongUniqueEntity
    implements ServiceProviderType
{

}
