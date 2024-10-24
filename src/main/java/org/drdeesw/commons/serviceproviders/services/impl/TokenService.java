/**
 * 
 */
package org.drdeesw.commons.serviceproviders.services.impl;


import java.time.Instant;
import java.util.Map;

import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccount;
import org.drdeesw.commons.serviceproviders.services.OAuth2Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;


/**
 * 
 */
@Service
public class TokenService
{
  @Autowired
  private OAuth2Client                  oauth2Client;

  @Autowired
  private ServiceProviderAccountServiceImpl serviceProviderAccountService;

  public void refreshToken(
    ServiceProviderAccount account)
  {
    try
    {
      MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
      
      params.add("grant_type", "refresh_token");
      params.add("refresh_token", account.getTokenHolder().getRefreshToken());
      params.add("client_id", "your-client-id");
      params.add("client_secret", "your-client-secret");

      HttpHeaders headers = new HttpHeaders();
      headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

      Map<String, Object> response = oauth2Client.refreshAccessToken(headers, params);

      if (response != null)
      {
        account.getTokenHolder().setAccessToken((String)response.get("access_token"));
        account.getTokenHolder()
            .setAccessTokenExpiry(Instant.now().plusSeconds((Integer)response.get("expires_in")));
        account.getTokenHolder().setRefreshToken((String)response.get("refresh_token"));
        account.getTokenHolder().setRefreshTokenExpiry(
          Instant.now().plusSeconds((Integer)response.get("refresh_token_expires_in")));

        serviceProviderAccountService.saveAccount(account);
      }
      else
      {
        // Handle error
      }
    }
    catch (Exception e)
    {
      // Handle exception
    }
  }
}
