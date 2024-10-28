/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.drdeesw.commons.common.models.entities.AbstractNamedLongUniqueEntity;
import org.drdeesw.commons.organization.models.OrganizationType;


/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "organization_types")
@AttributeOverride(name = "id", column = @Column(name = "organization_type_id"))
@Access(AccessType.FIELD)
public class OrganizationTypeEntity extends AbstractNamedLongUniqueEntity implements OrganizationType
{
}
