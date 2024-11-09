/**
 * 
 */
package org.drdeesw.commons.serviceproviders.controllers;

import javax.annotation.PostConstruct;
import javax.validation.Valid;

import org.drdeesw.commons.common.controllers.AbstractCrudController;
import org.drdeesw.commons.common.queries.QueryResults;
import org.drdeesw.commons.serviceproviders.models.pojos.ServiceProviderTypePojo;
import org.drdeesw.commons.serviceproviders.services.ServiceProviderTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.util.MultiValueMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *  Service Provider Type Controller
 */
public class ServiceProviderControllerType extends AbstractCrudController<ServiceProviderTypePojo, Long>
{
  private static final String SECURE_PREFIX         = "/secure";
  private static final String MAPPING_PREFIX        = "/serviceprovidertypes";
  private static final String SECURE_MAPPING_PREFIX = SECURE_PREFIX + MAPPING_PREFIX;
  @Autowired
  private ServiceProviderTypeService service;

  /**
   * Create a new service provider type.
   * 
   * @param type  the service provider type
   * @param bindingResult the binding result
   */
  @PostMapping(value = SECURE_MAPPING_PREFIX, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
  public ResponseEntity<?> create(
    @Valid
    ServiceProviderTypePojo type,
    BindingResult bindingResult) throws Exception
  {
    return super.create(type, bindingResult);
  }


  /**
   * 
   */
  @PostConstruct
  public void init()
  {
    super.init(this.service);
  }


  /**
   * Find all service provider types by query.
   * 
   * @param allRequestParams the request parameters
   * @param authentication the authentication token
   * @return the results
   * @throws Exception
   */
  @GetMapping("/dt" + SECURE_MAPPING_PREFIX)
  public QueryResults<ServiceProviderTypePojo> findByQuery(
    @RequestParam
    MultiValueMap<String, String> allRequestParams,
    OAuth2AuthenticationToken authentication) throws Exception
  {
    return super.findByQuery(allRequestParams);
  }


  /**
   * Get the service provider type with the given id.
   * 
   * @param id the id of the service provider type
   * @return the service provider with the given id
   */
  @GetMapping(value = SECURE_MAPPING_PREFIX + "/{id}")
  public ResponseEntity<ServiceProviderTypePojo> get(
    @PathVariable
    Long id)
  {
    return super.get(id);
  }

}
