/**
 * 
 */
package org.drdeesw.commons.identity.models.pojos;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.drdeesw.commons.common.models.pojos.AbstractNamedLongUniquePojo;
import org.drdeesw.commons.identity.models.Person;

/**
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "organizations")
public class PersonPojo extends AbstractNamedLongUniquePojo implements Person
{

}
