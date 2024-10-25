package org.drdeesw.commons.serviceproviders.jobs;


import java.time.Instant;
import java.util.List;

import org.drdeesw.commons.security.models.User;
import org.drdeesw.commons.serviceproviders.models.ServiceProviderAccount;
import org.drdeesw.commons.serviceproviders.models.pojos.ServiceProviderAccountPojo;
import org.drdeesw.commons.serviceproviders.services.impl.ServiceProviderAccountServiceImpl;
import org.drdeesw.commons.serviceproviders.services.impl.TokenService;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;


public class TokenRefreshJob<U extends User> implements Job
{
  @Autowired
  private TokenService<U>                      tokenService;

  @Autowired
  private ServiceProviderAccountServiceImpl<U> serviceProviderAccountService;

  @Override
  public void execute(
    JobExecutionContext context) throws JobExecutionException
  {
    List<ServiceProviderAccountPojo<U>> accounts = serviceProviderAccountService.getAllAccounts();

    for (ServiceProviderAccountPojo<U> account : accounts)
    {
      if (shouldRefreshToken(account))
      {
        tokenService.refreshToken(account);
      }
    }
  }


  private boolean shouldRefreshToken(
    ServiceProviderAccount<U> account)
  {
    Instant now = Instant.now();
    Instant refreshThreshold = account.getTokenHolder().getAccessTokenExpiry().minusSeconds(900); // Refresh 15 minutes before expiry

    return now.isAfter(refreshThreshold);
  }
}
