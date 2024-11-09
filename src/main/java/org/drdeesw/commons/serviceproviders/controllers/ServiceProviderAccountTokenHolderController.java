/**
 * 
 */
package org.drdeesw.commons.serviceproviders.controllers;

import javax.annotation.PostConstruct;
import javax.validation.Valid;

import org.drdeesw.commons.common.controllers.AbstractCrudController;
import org.drdeesw.commons.common.queries.QueryResults;
import org.drdeesw.commons.serviceproviders.models.pojos.ServiceProviderAccountTokenHolderPojo;
import org.drdeesw.commons.serviceproviders.services.ServiceProviderAccountTokenHolderService;
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
 * The controller for service provider account token holder
 */
public class ServiceProviderAccountTokenHolderController extends AbstractCrudController<ServiceProviderAccountTokenHolderPojo, Long>
{
  private static final String SECURE_PREFIX         = "/secure";
  private static final String MAPPING_PREFIX        = "/serviceprovideraccounttokenholders";
  private static final String SECURE_MAPPING_PREFIX = SECURE_PREFIX + MAPPING_PREFIX;
  @Autowired
  private ServiceProviderAccountTokenHolderService service;

  /**
   * Creates a new instance of ServiceProviderAccountTokenHolderController.
   *
   * @param serviceProviderAccountTokenHolder the service provider account token holder to create
   * @param bindingResult the binding result
   */
  @PostMapping(value = SECURE_MAPPING_PREFIX, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
  public ResponseEntity<?> create(
    @Valid
    ServiceProviderAccountTokenHolderPojo serviceProviderAccountTokenHolder,
    BindingResult bindingResult) throws Exception
  {
    return super.create(serviceProviderAccountTokenHolder, bindingResult);
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
   * Finds all service provider account token holders by query.
   * 
   * @param allRequestParams the request parameters
   * @param authentication the authentication token
   * @return the results
   * @throws Exception
   */
  @GetMapping("/dt" + SECURE_MAPPING_PREFIX)
  public QueryResults<ServiceProviderAccountTokenHolderPojo> findByQuery(
    @RequestParam
    MultiValueMap<String, String> allRequestParams,
    OAuth2AuthenticationToken authentication) throws Exception
  {
    return super.findByQuery(allRequestParams);
  }


  /**
   * Gets the service provider account token holder with the given id.
   * 
   * @param id  the id
   * @return the service provider account token holder with the given id
   */
  @GetMapping(value = SECURE_MAPPING_PREFIX + "/{id}")
  public ResponseEntity<ServiceProviderAccountTokenHolderPojo> get(
    @PathVariable
    Long id)
  {
    return super.get(id);
  }

}
