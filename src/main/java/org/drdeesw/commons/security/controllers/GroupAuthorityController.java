/**
 * 
 */
package org.drdeesw.commons.security.controllers;


import javax.annotation.PostConstruct;
import javax.validation.Valid;

import org.drdeesw.commons.common.controllers.AbstractCrudController;
import org.drdeesw.commons.common.queries.QueryResults;
import org.drdeesw.commons.security.models.pojos.GroupAuthorityPojo;
import org.drdeesw.commons.security.services.GroupAuthorityService;
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
public class GroupAuthorityController extends AbstractCrudController<GroupAuthorityPojo, Long>
{
  private static final String         MAPPING_PREFIX = "/security/groupauthorities";
  @Autowired
  private GroupAuthorityService service;

  /**
   * Creates a new groupAuthority.
   * 
   * @param groupAuthority the groupAuthority to create 
   * @param bindingResult the binding result
   */
  @PostMapping(value = MAPPING_PREFIX, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
  public ResponseEntity<?> create(
    @Valid
    GroupAuthorityPojo groupAuthority,
    BindingResult bindingResult) throws Exception
  {
    return super.create(groupAuthority, bindingResult);
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
   * Finds groupAuthorities by query.
   * 
   * @param allRequestParams the request parameters
   * @param authentication the authentication token
   * @return the results
   * @throws Exception
   */
  @GetMapping("/dt" + MAPPING_PREFIX)
  public QueryResults<GroupAuthorityPojo> findByQuery(
    @RequestParam
    MultiValueMap<String, String> allRequestParams,
    OAuth2AuthenticationToken authentication) throws Exception
  {
    return super.findByQuery(allRequestParams);
  }


  /**
   * Gets an groupAuthority by id.
   * 
   * @param id the id of the groupAuthority 
   * @return the groupAuthority with the given id
   */
  @GetMapping(value = MAPPING_PREFIX + "/{id}")
  public ResponseEntity<GroupAuthorityPojo> get(
    @PathVariable
    Long id)
  {
    return super.get(id);
  }

}
