/**
 * 
 */
package org.drdeesw.commons.common.repositories.impl;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.drdeesw.commons.common.models.UniqueObject;
import org.drdeesw.commons.common.queries.JpqlQuery;
import org.drdeesw.commons.common.queries.QueryResults;
import org.drdeesw.commons.common.repositories.QueryRepository;


/**
 * @author gary_kephart
 *
 */
public class QueryRepositoryImpl<T extends UniqueObject<ID>, ID extends Serializable>
    /*extends SimpleJpaRepository<T, ID>*/ implements QueryRepository<T, ID>
{
  @PersistenceContext
  private EntityManager em;

  /**
   * 
   */
  public QueryRepositoryImpl()
  {

  }


  /**
   * Unit testing.
   * 
   * @param em EntityManager
   */
  public QueryRepositoryImpl(EntityManager em)
  {
    this.em = em;
  }


  /**
   *
   */
  @Override
  @Transactional
  @SuppressWarnings("unchecked")
  public <Q extends JpqlQuery<T>> QueryResults<T> findByQuery(
    Q query)
  {
    List<T> resultList = null;
    int totalRecords = 0;

    if (query.isPerformCount())
    {
      javax.persistence.Query cq = this.em.createQuery(query.toCountJpql());
      Object singleResult = cq.getSingleResult();

      totalRecords = ((Long)singleResult).intValue();
    }

    if (totalRecords > 0 || !query.isPerformCount())
    {
      String jpql = query.toJpql();
      javax.persistence.Query q = this.em.createQuery(jpql);

      q.setFirstResult(query.getStart(0))//
          .setMaxResults(query.getMaxResults(1000));

      resultList = q.getResultList(); // SuppressWarnings("unchecked")
    }
    else
      resultList = new ArrayList<T>();

    return new QueryResults<T>(resultList, totalRecords, query);
  }
}
