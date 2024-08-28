package org.drdeesw.commons.models.security.pojos;


import org.drdeesw.commons.models.base.pojos.AbstractNamedUniquePojo;
import org.drdeesw.commons.models.security.Group;


/**
 * Structured to work with JdbcUserDetailsManager.
 * 
 * @author gary_kephart
 *
 */
@SuppressWarnings("serial")
public class GroupPojo extends AbstractNamedUniquePojo<Long> implements Group
{

}
