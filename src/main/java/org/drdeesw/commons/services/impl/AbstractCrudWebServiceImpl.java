/**
 * 
 */
package org.drdeesw.commons.services.impl;


import java.io.Serializable;

import org.drdeesw.commons.models.pojos.UniquePojo;
import org.drdeesw.commons.services.CrudService;


/**
 *  
 */
public abstract class AbstractCrudWebServiceImpl<P extends UniquePojo<ID>, ID extends Serializable>
    extends AbstractService implements CrudService<P, ID>
{
  private Class<P> pojoClass;

  protected AbstractCrudWebServiceImpl(Class<P> pojoClass)
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
