/**
 * 
 */
package org.drdeesw.commons.serviceproviders.controllers;

import javax.annotation.PostConstruct;
import javax.validation.Valid;

import org.drdeesw.commons.common.controllers.AbstractCrudController;
import org.drdeesw.commons.common.queries.QueryResults;
import org.drdeesw.commons.serviceproviders.models.pojos.ServiceProviderPojo;
import org.drdeesw.commons.serviceproviders.services.ServiceProviderService;
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
 * The service provider controller
 */
public class ServiceProviderController extends AbstractCrudController<ServiceProviderPojo, Long>
{
  static final String MAPPING_PREFIX        = "/serviceproviders";
  @Autowired
  private ServiceProviderService service;

  /**
   * Creates a new instance of the service provider
   *
   * @param serviceProvider the service provider to create
   * @param bindingResult the binding result
   */
  @PostMapping(value = MAPPING_PREFIX, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
  public ResponseEntity<?> create(
    @Valid
    ServiceProviderPojo serviceProvider,
    BindingResult bindingResult) throws Exception
  {
    return super.create(serviceProvider, bindingResult);
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
   * Finds all the service providers by query.
   * 
   * @param allRequestParams the request parameters
   * @param authentication the authentication token
   * @return the results
   * @throws Exception
   */
  @GetMapping("/dt" + MAPPING_PREFIX)
  public QueryResults<ServiceProviderPojo> findByQuery(
    @RequestParam
    MultiValueMap<String, String> allRequestParams,
    OAuth2AuthenticationToken authentication) throws Exception
  {
    return super.findByQuery(allRequestParams);
  }


  /**
   * Gets the service provider with the given id
   * 
   * @param id the id of the service provider
   * @return the service provider with the given id
   */
  @GetMapping(value = MAPPING_PREFIX + "/{id}")
  public ResponseEntity<ServiceProviderPojo> get(
    @PathVariable
    Long id)
  {
    return super.get(id);
  }

}
