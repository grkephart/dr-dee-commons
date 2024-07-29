package org.drdeesw.commons.services.impl;

import org.drdeesw.commons.models.SomeEntity;
import org.drdeesw.commons.models.SomePojo;

public class TestableAbstractJpaCrudServiceImpl
    extends AbstractJpaCrudServiceImpl<SomePojo, SomeEntity, Long>
{

  public TestableAbstractJpaCrudServiceImpl()
  {
    super(SomePojo.class, SomeEntity.class);
  }


  @Override
  protected void updateEntity(
    SomeEntity entity,
    SomePojo pojo)
  {
  }

}