/**
 * 
 */
package org.drdeesw.commons.common.controllers;


import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.drdeesw.commons.common.models.pojos.UniquePojo;
import org.drdeesw.commons.common.queries.JpqlQuery;
import org.drdeesw.commons.common.queries.QueryResults;
import org.drdeesw.commons.common.services.CrudService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.validation.BindingResult;


/**
 * @author gary_kephart
 *
 */
public abstract class AbstractCrudController<P extends UniquePojo<ID>, ID extends Serializable>
    extends AbstractController
{
  private static final Log   log = LogFactory.getLog(AbstractCrudController.class);
  private CrudService<P, ID> crudService;

  /**
   * 
   */
  protected AbstractCrudController()
  {
  }


  /**
   * Create a new object.
   * 
   * @param obj the object to create
   * @return the created object
   */
  protected ResponseEntity<P> create(
    P obj)
  {
    try
    {
      return ResponseEntity.ok(this.crudService.create(obj));
    }
    catch (Exception e)
    {
      return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
  }


  /**
   * Create a new object if there are no binding errors.
   * 
   * @param obj the object to create
   * @param bindingResult the binding result
   * @return the created object
   * @throws Exception if the object cannot be created
   */
  protected ResponseEntity<?> create(
    P obj,
    BindingResult bindingResult) throws Exception
  {
    if (bindingResult.hasErrors())
    {
      return handleBindingResultErrors(bindingResult);
    }
    else
    {
      try
      {
        return ResponseEntity.ok(this.crudService.create(obj));
      }
      catch (Exception e)
      {
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
      }
    }
  }


  /**
   * Delete an object.
   * 
   * @param obj the object to delete
   * @return the deleted object
   */
  protected ResponseEntity<P> delete(
    P obj)
  {
    this.crudService.delete(obj);

    return ResponseEntity.ok(obj);
  }


  /**
   * Finds an object by its ID.
   * 
   * @param id the ID of the object to find
   * @return the object
   */
  protected ResponseEntity<?> findById(
    ID id)
  {
    return this.crudService.findById(id)//
        .map(ResponseEntity::ok)//
        .orElseGet(() -> ResponseEntity.notFound().build());
  }


  /**
   * Find objects by a query.
   * 
   * @param parameterMap the query parameters
   * @return the objects
   */
  protected QueryResults<P> findByQuery(
    MultiValueMap<String, String> parameterMap)
  {
    try
    {
      return this.crudService.findByQuery(parameterMap);
    }
    catch (Exception e)
    {
      log.error("[findByQuery]", e);
      throw e;
    }
  }


  /**
   * Find objects by a query.
   * 
   * @param <Q> the query type
   * @param query the query
   * @return the objects
   */
  protected <Q extends JpqlQuery<P>> QueryResults<P> findByQuery(
    Q query)
  {
    return this.crudService.findByQuery(query);
  }


  /**
   * Gets an object by its ID.
   * 
   * @param id the ID of the object to get
   * @return the object
   */
  protected ResponseEntity<P> get(
    ID id)
  {
    return ResponseEntity.ok(this.crudService.get(id));
  }


  /**
   * Handles binding result errors.
   * 
   * @param bindingResult the binding result
   * @return the response entity
   */
  private ResponseEntity<?> handleBindingResultErrors(
    BindingResult bindingResult)
  {
    Map<String, String> errors = new HashMap<>();

    bindingResult.getFieldErrors()
        .forEach(error -> errors.put(error.getField(), error.getDefaultMessage()));

    return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
  }


  /**
   * Initializes the controller.
   * 
   * @param crudService the CRUD service
   */
  protected void init(
    CrudService<P, ID> crudService)
  {
    this.crudService = crudService;
  }


  /**
   * Updates an object.
   * 
   * @param obj the object to update
   * @return the updated object
   */
  protected ResponseEntity<P> update(
    P obj)
  {
    return ResponseEntity.ok(this.crudService.update(obj));
  }


  /**
   * Updates an object if there are no binding errors.
   * 
   * @param obj the object to update
   * @param bindingResult the binding result
   * @return the updated object
   */
  protected ResponseEntity<?> update(
    P obj,
    BindingResult bindingResult)
  {
    if (bindingResult.hasErrors())
    {
      return handleBindingResultErrors(bindingResult);
    }
    else
    {
      return ResponseEntity.ok(this.crudService.update(obj));
    }
  }
}
