package org.drdeesw.commons.modules.common.services.impl;

import org.drdeesw.commons.modules.security.models.entities.TestUserEntity;
import org.drdeesw.commons.modules.security.models.pojos.UserPojo;

public class TestableAbstractJpaCrudServiceImpl
    extends AbstractJpaCrudServiceImpl<UserPojo, TestUserEntity, Long>
{

  public TestableAbstractJpaCrudServiceImpl()
  {
    super(UserPojo.class, TestUserEntity.class);
  }

}