package org.drdeesw.commons.security.models.pojos;


import org.drdeesw.commons.common.models.pojos.AbstractNamedUniquePojo;
import org.drdeesw.commons.security.models.GroupAuthority;


/**
 * Structured to work with JdbcUserDetailsManager.
 * 
 * @author gary_kephart
 *
 */
@SuppressWarnings("serial")
public class GroupAuthorityPojo<G extends BaseGroupPojo> extends AbstractNamedUniquePojo<Long>
    implements GroupAuthority<G>
{
  private String authority;
  private G      group;

  /**
   * Hibernate
   */
  protected GroupAuthorityPojo()
  {
  }


  protected GroupAuthorityPojo(Long id)
  {
    super(id);
  }


  @Override
  public String getAuthority()
  {
    return this.authority;
  }


  @Override
  public G getGroup()
  {
    return this.group;
  }


  @Override
  public void setAuthority(
    String authority)
  {
    this.authority = authority;
  }


  @Override
  public void setGroup(
    G group)
  {
    this.group = group;
  }

}
