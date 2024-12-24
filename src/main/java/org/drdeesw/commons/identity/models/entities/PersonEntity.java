/**
 * 
 */
package org.drdeesw.commons.identity.models.entities;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.drdeesw.commons.accounting.models.entities.AccountHolderEntity;
import org.drdeesw.commons.identity.models.Person;

/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "persons")
@AttributeOverride(name = "id", column = @Column(name = "person_id"))
public class PersonEntity extends AccountHolderEntity implements Person
{

}
