/**
 * 
 */
package org.drdeesw.commons.modules.common.services.impl;


import java.io.Serializable;

import org.drdeesw.commons.modules.common.models.pojos.UniquePojo;
import org.drdeesw.commons.modules.common.services.CrudService;


/**
 *  
 */
public abstract class AbstractWebCrudServiceImpl<P extends UniquePojo<ID>, ID extends Serializable>
    extends AbstractService implements CrudService<P, ID>
{
  private Class<P> pojoClass;

  protected AbstractWebCrudServiceImpl(Class<P> pojoClass)
  {
    this.pojoClass = pojoClass;
  }


  /**
   * @return the pojoClass
   */
  public Class<P> getPojoClass()
  {
    return pojoClass;
  }
}
