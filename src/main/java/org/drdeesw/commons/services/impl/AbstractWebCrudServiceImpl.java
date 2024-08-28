/**
 * 
 */
package org.drdeesw.commons.services.impl;


import java.io.Serializable;

import org.drdeesw.commons.models.base.pojos.UniquePojo;
import org.drdeesw.commons.services.CrudService;


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
