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
@Table(name = "organization_roles")
@AttributeOverride(name = "id", column = @Column(name = "organization_role_id"))
public class OrganizationRoleEntity extends AbstractOrganizationRoleEntity
{
}
