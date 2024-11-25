package org.drdeesw.commons.security.models.pojos;


import org.drdeesw.commons.common.models.pojos.AbstractNamedUniquePojo;
import org.drdeesw.commons.security.models.Group;


/**
 * Structured to work with JdbcUserDetailsManager.
 * 
 * @author gary_kephart
 *
 */
@SuppressWarnings("serial")
public class GroupPojo extends AbstractNamedUniquePojo<Long> implements Group
{

  private boolean enabled;

  @Override
  public boolean isEnabled()
  {
    return this.enabled;
  }

  @Override
  public void setEnabled(
    boolean enabled)
  {
    this.enabled = enabled;
  }

}
