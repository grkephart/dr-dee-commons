package org.drdeesw.commons.common.services.impl;

import org.drdeesw.commons.security.models.entities.UserEntity;
import org.drdeesw.commons.security.models.pojos.UserPojo;

public class TestableAbstractJpaCrudServiceImpl
    extends AbstractJpaCrudServiceImpl<UserPojo, UserEntity, Long>
{

  public TestableAbstractJpaCrudServiceImpl()
  {
    super(UserPojo.class, UserEntity.class);
  }

}