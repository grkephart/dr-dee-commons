/**
 * 
 */
package org.drdeesw.commons.modules.common.controllers;


import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.drdeesw.commons.modules.common.models.pojos.UniquePojo;
import org.drdeesw.commons.modules.common.queries.JpqlQuery;
import org.drdeesw.commons.modules.common.queries.QueryResults;
import org.drdeesw.commons.modules.common.services.CrudService;
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
   * @param obj
   * @return
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
   * @param obj
   * @return
   * @throws Exception 
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
   * @param obj
   * @return
   */
  protected ResponseEntity<P> delete(
    P obj)
  {
    this.crudService.delete(obj);

    return ResponseEntity.ok(obj);
  }


  /**
   * @param id
   * @return
   */
  protected ResponseEntity<?> findById(
    ID id)
  {
    return this.crudService.findById(id)//
        .map(ResponseEntity::ok)//
        .orElseGet(() -> ResponseEntity.notFound().build());
  }


  /**
   * @param parameterMap
   * @return
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
   * @param <Q>
   * @param query
   * @return
   */
  protected <Q extends JpqlQuery<P>> QueryResults<P> findByQuery(
    Q query)
  {
    return this.crudService.findByQuery(query);
  }


  /**
   * @param id
   * @return
   */
  protected ResponseEntity<P> get(
    ID id)
  {
    return ResponseEntity.ok(this.crudService.get(id));
  }


  /**
   * @param bindingResult
   * @return
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
   * @param crudService
   */
  protected void init(
    CrudService<P, ID> crudService)
  {
    this.crudService = crudService;
  }


  /**
   * @param obj
   * @return
   */
  protected ResponseEntity<P> update(
    P obj)
  {
    return ResponseEntity.ok(this.crudService.update(obj));
  }


  /**
   * @param obj
   * @param bindingResult
   * @return
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
