/**
 * 
 */
package org.drdeesw.commons.repositories;


import java.io.Serializable;

import org.drdeesw.commons.models.base.UniqueObject;
import org.drdeesw.commons.queries.JpqlQuery;
import org.drdeesw.commons.queries.QueryResults;


/**
 * @author gary_kephart
 *
 */
public interface QueryRepository<T extends UniqueObject<ID>, ID extends Serializable>
{
  /**
   * Remember to add this to @EnableJpaRepositories(basePackages = { "org.drdeesw.commons.repositories", ...})
   *
   * @param query
   * @return
   */
  <Q extends JpqlQuery<T>> QueryResults<T> findByQuery(Q query);
}
