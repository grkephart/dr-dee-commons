/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;


import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "organization_types")
@AttributeOverride(name = "id", column = @Column(name = "organization_type_id"))
public class OrganizationTypeEntity extends AbstractOrganizationTypeEntity
{
}
