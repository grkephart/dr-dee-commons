/**
 * 
 */
package org.drdeesw.commons.organization.controllers;


import javax.annotation.PostConstruct;
import javax.validation.Valid;

import org.drdeesw.commons.common.controllers.AbstractCrudController;
import org.drdeesw.commons.common.queries.QueryResults;
import org.drdeesw.commons.organization.models.pojos.OrganizationPojo;
import org.drdeesw.commons.organization.services.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.util.MultiValueMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * 
 */
@RestController
@Validated
public class OrganizationController extends AbstractCrudController<OrganizationPojo, Long>
{
  private static final String SECURE_PREFIX         = "/secure";
  private static final String MAPPING_PREFIX        = "/organizations";
  private static final String SECURE_MAPPING_PREFIX = SECURE_PREFIX + MAPPING_PREFIX;
  @Autowired
  private OrganizationService service;

  /**
   * @param order 
   * @param bindingResult
   */
  @PostMapping(value = SECURE_MAPPING_PREFIX, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
  public ResponseEntity<?> create(
    @Valid
    OrganizationPojo order,
    BindingResult bindingResult) throws Exception
  {
    return super.create(order, bindingResult);
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
   * @param allRequestParams the request parameters
   * @param authentication the authentication token
   * @return the results
   * @throws Exception
   */
  @GetMapping("/dt" + SECURE_MAPPING_PREFIX)
  public QueryResults<OrganizationPojo> findByQuery(
    @RequestParam
    MultiValueMap<String, String> allRequestParams,
    OAuth2AuthenticationToken authentication) throws Exception
  {
    return super.findByQuery(allRequestParams);
  }


  /**
   * @param id 
   * @return the organization with the given id
   */
  @GetMapping(value = SECURE_MAPPING_PREFIX + "/{id}")
  public ResponseEntity<OrganizationPojo> get(
    @PathVariable
    Long id)
  {
    return super.get(id);
  }

}
