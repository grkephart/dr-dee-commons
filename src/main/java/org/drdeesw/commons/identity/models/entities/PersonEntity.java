/**
 * 
 */
package org.drdeesw.commons.identity.models.entities;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "persons")
@AttributeOverride(name = "id", column = @Column(name = "person_id"))
public class PersonEntity extends AbstractPersonEntity
{

}
