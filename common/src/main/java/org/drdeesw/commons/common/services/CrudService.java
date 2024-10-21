/**
 * 
 */
package org.drdeesw.commons.common.services;


import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import org.drdeesw.commons.common.models.pojos.UniquePojo;
import org.drdeesw.commons.common.queries.JpqlQuery;
import org.drdeesw.commons.common.queries.QueryResults;
import org.springframework.util.MultiValueMap;


/**
 * 
 * @author gary_kephart
 *
 * @param <P> the POJO class
 * @param <ID> the ID class of the POJO
 */
public interface CrudService<P extends UniquePojo<ID>, ID extends Serializable>
    extends BusinessService
{
  /**
   * @param pojos
   * @return
   */
  List<P> create(
    Collection<P> pojos) throws Exception;


  /**
   * @param obj
   * @return
   * @throws Exception 
   */
  P create(
    P obj) throws Exception;


  /**
   * @param pojos
   * @return
   */
  List<P> createAndFlush(
    Collection<P> pojos);


  /**
   * @param obj
   * @return
   */
  P createAndFlush(
    P obj);


  /**
   * @param obj
   */
  void delete(
    P obj);


  /**
   * @param id
   * @return
   */
  Optional<P> findById(
    ID id);


  /**
   * @param parameterMap
   * @return
   */
  QueryResults<P> findByQuery(
    MultiValueMap<String, String> parameterMap);


  /**
   * @param query
   * @return
   */
  <Q extends JpqlQuery<P>> QueryResults<P> findByQuery(
    Q query);


  /**
   * @param id
   * @return
   */
  P get(
    ID id);


  /**
   * @param ids
   * @return
   */
  QueryResults<P> get(
    Set<ID> ids);


  /**
   * @param ids
   * @return
   */
  Map<ID, P> getMap(
    Set<ID> ids);


  /**
   * @param obj
   * @return
   */
  P update(
    P obj);

}
