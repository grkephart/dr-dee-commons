/**
 * 
 */
package org.drdeesw.commons.security.models.pojos;


import org.drdeesw.commons.common.models.pojos.AbstractNamedLongUniquePojo;


@SuppressWarnings("serial")
public abstract class AbstractGroupPojo//
    extends AbstractNamedLongUniquePojo implements BaseGroupPojo
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
