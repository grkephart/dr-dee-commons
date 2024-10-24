/**
 * 
 */
package org.drdeesw.commons.serviceproviders.services;


import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;


/**
 * 
 */
@FeignClient(name = "oauth2Client", url = "https://oauth2provider.com")
public interface OAuth2Client
{
  @PostMapping(value = "/token", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
  Map<String, Object> refreshAccessToken(
    @RequestHeader
    HttpHeaders headers,
    @RequestBody
    MultiValueMap<String, String> params);
}
