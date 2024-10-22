package org.drdeesw.commons.common.services.impl;

import org.drdeesw.commons.security.models.entities.TestUserEntity;
import org.drdeesw.commons.security.models.pojos.UserPojo;

public class TestableAbstractJpaCrudServiceImpl
    extends AbstractJpaCrudServiceImpl<UserPojo, TestUserEntity, Long>
{

  public TestableAbstractJpaCrudServiceImpl()
  {
    super(UserPojo.class, TestUserEntity.class);
  }

}