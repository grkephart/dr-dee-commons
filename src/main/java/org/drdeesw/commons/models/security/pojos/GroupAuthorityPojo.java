package org.drdeesw.commons.models.security.pojos;


import org.drdeesw.commons.models.base.pojos.AbstractNamedUniquePojo;
import org.drdeesw.commons.models.security.GroupAuthority;


/**
 * Structured to work with JdbcUserDetailsManager.
 * 
 * @author gary_kephart
 *
 */
@SuppressWarnings("serial")
public class GroupAuthorityPojo extends AbstractNamedUniquePojo<Long> implements GroupAuthority
{
  private String authority;
  private Long groupId;

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
  public Long getGroupId()
  {
    return this.groupId;
  }


  @Override
  public void setAuthority(
    String authority)
  {
    this.authority = authority;
  }


  @Override
  public void setGroupId(
    Long groupId)
  {
    this.groupId = groupId;
  }

}
