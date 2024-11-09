/**
 * 
 */
package org.drdeesw.commons.serviceproviders.controllers;

import javax.annotation.PostConstruct;
import javax.validation.Valid;

import org.drdeesw.commons.common.controllers.AbstractCrudController;
import org.drdeesw.commons.common.queries.QueryResults;
import org.drdeesw.commons.serviceproviders.models.pojos.ServiceProviderAccountPojo;
import org.drdeesw.commons.serviceproviders.services.ServiceProviderAccountService;
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
 * The controller for the service provider accounts
 */
public class ServiceProviderAccountController extends AbstractCrudController<ServiceProviderAccountPojo, Long>
{
  private static final String SECURE_PREFIX         = "/secure";
  private static final String MAPPING_PREFIX        = "/serviceprovideraccounts";
  private static final String SECURE_MAPPING_PREFIX = SECURE_PREFIX + MAPPING_PREFIX;
  @Autowired
  private ServiceProviderAccountService service;

  /**
   * Creates a new service provider account
   * 
   * @param serviceProviderAccount the service provider account 
   * @param bindingResult the validation binding result
   */
  @PostMapping(value = SECURE_MAPPING_PREFIX, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
  public ResponseEntity<?> create(
    @Valid
    ServiceProviderAccountPojo serviceProviderAccount,
    BindingResult bindingResult) throws Exception
  {
    return super.create(serviceProviderAccount, bindingResult);
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
   * Finds the service provider accounts by query.
   * 
   * @param allRequestParams the request parameters
   * @param authentication the authentication token
   * @return the results
   * @throws Exception
   */
  @GetMapping("/dt" + SECURE_MAPPING_PREFIX)
  public QueryResults<ServiceProviderAccountPojo> findByQuery(
    @RequestParam
    MultiValueMap<String, String> allRequestParams,
    OAuth2AuthenticationToken authentication) throws Exception
  {
    return super.findByQuery(allRequestParams);
  }


  /**
   * Gets the service provider account with the given id
   * 
   * @param id  the id of the service provider account
   * @return the service provider account with the given id
   */
  @GetMapping(value = SECURE_MAPPING_PREFIX + "/{id}")
  public ResponseEntity<ServiceProviderAccountPojo> get(
    @PathVariable
    Long id)
  {
    return super.get(id);
  }

}
