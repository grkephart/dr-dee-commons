/**
 * 
 */
package org.drdeesw.commons.common.repositories.impl;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.drdeesw.commons.common.queries.JpqlQuery;
import org.drdeesw.commons.common.queries.QueryResults;
import org.drdeesw.commons.security.models.entities.GroupMemberEntity;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


/**
 * 
 */
class QueryRepositoryImplTest
{
  private static final Object                   NAME = "fhdrjrkj";
  private static final Long TOTAL_RECORDS = Long.valueOf(237899);
  private static final Long NO_RECORDS = Long.valueOf(0);
  private QueryRepositoryImpl<GroupMemberEntity, Long> objectUnderTest;
  private EntityManager                         em;

  /**
   * @throws java.lang.Exception
   */
  @BeforeEach
  void setUp() throws Exception
  {
    this.em = Mockito.mock(EntityManager.class);

    this.objectUnderTest = new QueryRepositoryImpl<GroupMemberEntity, Long>(this.em);
  }


  /**
   * @throws java.lang.Exception
   */
  @AfterEach
  void tearDown() throws Exception
  {
  }


  /**
   * Test method for {@link org.drdeesw.commons.repositories.impl.QueryRepositoryImpl#findByQuery(org.drdeesw.commons.queries.JpqlQuery)}.
   */
  @Test
  void testFindByQueryWithRecords()
  {
    JpqlQuery<GroupMemberEntity> query = new JpqlQuery<>(GroupMemberEntity.class)//
        .setPerformCount(true)//
        .setStart(0)//
        .setMaxResults(10)//
        .equals("name", NAME);
    Query cq = Mockito.mock(Query.class);
    Query q = Mockito.mock(Query.class);
    List<GroupMemberEntity> resultList = new ArrayList<GroupMemberEntity>();

    // Arrange
    
    Mockito.when(this.em.createQuery(query.toCountJpql())).thenReturn(cq);
    Mockito.when(this.em.createQuery(query.toJpql())).thenReturn(q);
    Mockito.when(cq.getSingleResult()).thenReturn(TOTAL_RECORDS);
    Mockito.when(q.getResultList()).thenReturn(resultList);
    Mockito.when(q.setFirstResult(Mockito.anyInt())).thenReturn(q);
    Mockito.when(q.setMaxResults(Mockito.anyInt())).thenReturn(q);

    // Act
    QueryResults<GroupMemberEntity> queryResults = this.objectUnderTest.findByQuery(query);

    // Assert
    
    Mockito.verify(this.em).createQuery(query.toCountJpql());
    Mockito.verify(this.em).createQuery(query.toJpql());
    Mockito.verify(cq).getSingleResult();
    Mockito.verify(q).getResultList();
    Mockito.verify(q).setFirstResult(Mockito.anyInt());
    Mockito.verify(q).setMaxResults(Mockito.anyInt());
    
    Assert.assertEquals(resultList, queryResults.getRecords());
    Assert.assertEquals(TOTAL_RECORDS.intValue(), queryResults.getTotalRecords());
    Assert.assertEquals(TOTAL_RECORDS.intValue(), queryResults.getRecordsTotal());
  }


  /**
   * Test method for {@link org.drdeesw.commons.repositories.impl.QueryRepositoryImpl#findByQuery(org.drdeesw.commons.queries.JpqlQuery)}.
   */
  @Test
  void testFindByQueryWithNoRecords()
  {
    JpqlQuery<GroupMemberEntity> query = new JpqlQuery<>(GroupMemberEntity.class)//
        .setPerformCount(true)//
        .setStart(0)//
        .setMaxResults(10)//
        .equals("name", NAME);
    Query cq = Mockito.mock(Query.class);
    Query q = Mockito.mock(Query.class);
    List<GroupMemberEntity> resultList = new ArrayList<GroupMemberEntity>();

    // Arrange
    
    Mockito.when(this.em.createQuery(query.toCountJpql())).thenReturn(cq);
    Mockito.when(this.em.createQuery(query.toJpql())).thenReturn(q);
    Mockito.when(cq.getSingleResult()).thenReturn(NO_RECORDS);
    Mockito.when(q.getResultList()).thenReturn(resultList);
    Mockito.when(q.setFirstResult(Mockito.anyInt())).thenReturn(q);
    Mockito.when(q.setMaxResults(Mockito.anyInt())).thenReturn(q);

    // Act
    QueryResults<GroupMemberEntity> queryResults = this.objectUnderTest.findByQuery(query);

    // Assert
    
    Mockito.verify(this.em).createQuery(query.toCountJpql());
    Mockito.verify(this.em, Mockito.never()).createQuery(query.toJpql());
    Mockito.verify(cq).getSingleResult();
    Mockito.verify(q, Mockito.never()).getResultList();
    Mockito.verify(q, Mockito.never()).setFirstResult(Mockito.anyInt());
    Mockito.verify(q, Mockito.never()).setMaxResults(Mockito.anyInt());
    
    Assert.assertEquals(resultList, queryResults.getRecords());
    Assert.assertEquals(NO_RECORDS.intValue(), queryResults.getTotalRecords());
    Assert.assertEquals(NO_RECORDS.intValue(), queryResults.getRecordsTotal());
  }

}
