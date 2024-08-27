package org.drdeesw.commons.models.security;


import org.drdeesw.commons.models.base.NamedUniqueObject;


/**
 * A role is an authority with a ROLE_ prefix. 
 * So a role called ADMIN is the same as an authority called ROLE_ADMIN.
 * Structured to work with JdbcUserDetailsManager.
 * 
 * @author gary_kephart
 *
 */
public interface Role extends NamedUniqueObject<Long>
{
  /* (non-Javadoc)
   * @see org.drdeesw.reactrax.dto.general.AbstractRenameableObject#getName()
   */
  @Override
  public String getName();


}
