package org.drdeesw.commons.security.models;


import org.drdeesw.commons.common.models.Enableable;
import org.drdeesw.commons.common.models.NamedLongUniqueObject;


/**
 * Represents a named collection of Users used to assign Authorities in bulk.
 *
 * A Group is not an atomic security primitive. It is a structural mechanism
 * for assigning Authorities to multiple users at once.
 *
 * In Spring Security's JDBC model, Groups are stored in {@code groups}
 * and connected to Users and Authorities via join tables.
 *
 * Groups are commonly used to model teams, departments, or organizational units.
 *
 * Examples:
 * <ul>
 *   <li>Accounting</li>
 *   <li>IT</li>
 *   <li>HR</li>
 *   <li>Exec Board</li>
 *   <li>Finance Committee</li>
 *   <li>Membership Committee</li>
 * </ul>
 * 
 * Structured to work with JdbcUserDetailsManager.
 * 
 * @author gary_kephart
 *
 */
public interface Group extends NamedLongUniqueObject, Enableable
{

}
