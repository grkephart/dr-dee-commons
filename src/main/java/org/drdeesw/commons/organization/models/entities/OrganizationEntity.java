/**
 * 
 */
package org.drdeesw.commons.organization.models.entities;


import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.drdeesw.commons.organization.models.Organization;
import org.drdeesw.commons.organization.models.OrganizationMember;
import org.drdeesw.commons.organization.models.OrganizationRole;


/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "organizations")
@AttributeOverride(name = "id", column = @Column(name = "organization_id"))
public class OrganizationEntity extends AbstractOrganizationEntity implements Organization
{
}
