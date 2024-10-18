package org.drdeesw.commons.modules.security.models.pojos;


import org.drdeesw.commons.modules.common.models.pojos.AbstractNamedUniquePojo;
import org.drdeesw.commons.modules.security.models.Group;


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
