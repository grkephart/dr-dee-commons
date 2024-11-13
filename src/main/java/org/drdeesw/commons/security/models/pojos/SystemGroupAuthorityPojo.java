package org.drdeesw.commons.security.models.pojos;


import org.drdeesw.commons.common.models.pojos.AbstractNamedUniquePojo;
import org.drdeesw.commons.security.models.SystemGroup;
import org.drdeesw.commons.security.models.SystemGroupAuthority;


/**
 * Structured to work with JdbcUserDetailsManager.
 * 
 * @author gary_kephart
 *
 */
@SuppressWarnings("serial")
public class SystemGroupAuthorityPojo extends AbstractNamedUniquePojo<Long>
    implements SystemGroupAuthority
{
  private String          authority;
  private SystemGroupPojo systemGroup;

  /**
   * Hibernate
   */
  protected SystemGroupAuthorityPojo()
  {
  }


  protected SystemGroupAuthorityPojo(Long id)
  {
    super(id);
  }


  @Override
  public String getAuthority()
  {
    return this.authority;
  }


  @Override
  public SystemGroup getSystemGroup()
  {
    return this.systemGroup;
  }


  @Override
  public void setAuthority(
    String authority)
  {
    this.authority = authority;
  }


  @Override
  public void setSystemGroup(
    SystemGroup systemGroup)
  {
    this.systemGroup = (SystemGroupPojo)systemGroup;
  }

}
