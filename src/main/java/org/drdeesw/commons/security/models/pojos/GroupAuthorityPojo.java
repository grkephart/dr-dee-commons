package org.drdeesw.commons.security.models.pojos;


import org.drdeesw.commons.common.models.pojos.AbstractNamedUniquePojo;


/**
 * Structured to work with JdbcUserDetailsManager.
 * 
 * @author gary_kephart
 *
 */
@SuppressWarnings("serial")
public class GroupAuthorityPojo extends AbstractNamedUniquePojo<Long>
    implements BaseGroupAuthorityPojo<GroupPojo>
{
  private String    authority;
  private GroupPojo group;

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
  public GroupPojo getGroup()
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
    GroupPojo group)
  {
    this.group = group;
  }

}
