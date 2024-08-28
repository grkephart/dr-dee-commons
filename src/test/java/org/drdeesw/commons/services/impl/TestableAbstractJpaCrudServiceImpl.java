package org.drdeesw.commons.services.impl;

import org.drdeesw.commons.models.TestUserEntity;
import org.drdeesw.commons.models.security.pojos.UserPojo;

public class TestableAbstractJpaCrudServiceImpl
    extends AbstractJpaCrudServiceImpl<UserPojo, TestUserEntity, Long>
{

  public TestableAbstractJpaCrudServiceImpl()
  {
    super(UserPojo.class, TestUserEntity.class);
  }

}