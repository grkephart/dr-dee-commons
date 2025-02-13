package org.drdeesw.commons.security.models;


import org.drdeesw.commons.common.models.Enableable;
import org.drdeesw.commons.common.models.NamedLongUniqueObject;


/**
 * A collection of users, typically used for organizing users with similar memberRoles or access requirements. 
 * Structured to work with JdbcUserDetailsManager.
 * 
 * @author gary_kephart
 *
 */
public interface Group extends NamedLongUniqueObject, Enableable
{

}
