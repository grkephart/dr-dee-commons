package org.drdeesw.commons.services.impl;

import org.drdeesw.commons.models.security.UserEntity;
import org.drdeesw.commons.models.security.UserPojo;

public class TestableAbstractJpaCrudServiceImpl
    extends AbstractJpaCrudServiceImpl<UserPojo, UserEntity, Long>
{

  public TestableAbstractJpaCrudServiceImpl()
  {
    super(UserPojo.class, UserEntity.class);
  }


  @Override
  protected void updateEntity(
    UserEntity entity,
    UserPojo pojo)
  {
  }

}