/**
 * 
 */
package org.drdeesw.commons.common.repositories;


import java.io.Serializable;

import org.drdeesw.commons.common.models.UniqueObject;
import org.drdeesw.commons.common.queries.JpqlQuery;
import org.drdeesw.commons.common.queries.QueryResults;


/**
 * @author gary_kephart
 *
 */
public interface QueryRepository<T extends UniqueObject<ID>, ID extends Serializable>
{
  /**
   * Remember to add this to @EnableJpaRepositories(basePackages = { "org.drdeesw.commons.repositories", ...})
   *
   * @param <Q> The type of query to execute
   * @param query The query to execute
   * @return The results of the query
   */
  <Q extends JpqlQuery<T>> QueryResults<T> findByQuery(Q query);
}
