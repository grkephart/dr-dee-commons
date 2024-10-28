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
   * @param pojos the list of POJOs to create
   * @return the list of created POJOs
   */
  List<P> create(
    Collection<P> pojos) throws Exception;


  /**
   * @param obj the POJO to create
   * @return the created POJO
   * @throws Exception 
   */
  P create(
    P obj) throws Exception;


  /**
   * @param pojos the list of POJOs to create
   * @return the list of created POJOs
   */
  List<P> createAndFlush(
    Collection<P> pojos);


  /**
   * @param obj the POJO to create
   * @return the created POJO
   */
  P createAndFlush(
    P obj);


  /**
   * @param obj the POJO to delete
   */
  void delete(
    P obj);


  /**
   * @param id the ID of the POJO to find
   *
   * @return the POJO
   */
  Optional<P> findById(
    ID id);


  /**
   * @param parameterMap the map of parameters to use in the query
   * @return the results of the query
   */
  QueryResults<P> findByQuery(
    MultiValueMap<String, String> parameterMap);


  /**
   * @param query the query to use
   * @return the results of the query
   */
  <Q extends JpqlQuery<P>> QueryResults<P> findByQuery(
    Q query);


  /**
   * @param id the ID of the POJO to find
   * @return the POJO
   */
  P get(
    ID id);


  /**
   * @param ids the IDs of the POJOs to find
   * @return the POJOs
   */
  QueryResults<P> get(
    Set<ID> ids);


  /**
   * @param ids the IDs of the POJOs to find
   * @return the POJOs in a map
   */
  Map<ID, P> getMap(
    Set<ID> ids);


  /**
   * @param obj the POJO to update
   * @return the updated POJO
   */
  P update(
    P obj);

}
