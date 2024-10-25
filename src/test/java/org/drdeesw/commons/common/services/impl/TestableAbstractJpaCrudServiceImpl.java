package org.drdeesw.commons.common.services.impl;

import org.drdeesw.commons.security.models.entities.TestUserEntity;
import org.drdeesw.commons.security.models.pojos.SystemUserPojo;

public class TestableAbstractJpaCrudServiceImpl
    extends AbstractJpaCrudServiceImpl<SystemUserPojo, TestUserEntity, Long>
{

  public TestableAbstractJpaCrudServiceImpl()
  {
    super(SystemUserPojo.class, TestUserEntity.class);
  }

}