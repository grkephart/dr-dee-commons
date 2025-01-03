package org.drdeesw.commons.security.models;


import org.drdeesw.commons.common.models.Enableable;
import org.drdeesw.commons.common.models.NamedUniqueObject;


/**
 * A collection of users, typically used for organizing users with similar roles or access requirements. 
 * Structured to work with JdbcUserDetailsManager.
 * 
 * @author gary_kephart
 *
 */
public interface Group extends NamedUniqueObject<Long>, Enableable
{

}
