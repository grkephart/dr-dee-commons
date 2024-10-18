/**
 * 
 */
package org.drdeesw.commons.modules.common.controllers;


import java.util.Collections;
import java.util.Optional;

import org.drdeesw.commons.modules.common.queries.JpqlQuery;
import org.drdeesw.commons.modules.common.queries.QueryResults;
import org.drdeesw.commons.modules.common.services.CrudService;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;


/**
 * 
 */
class AbstractCrudControllerTest
{
  private static final Long               ID = Long.valueOf(677);
  private TestableAbstractCrudController  objectUnderTest;
  private CrudService<GroupMemberPojo, Long> service;

  /**
   * @throws java.lang.Exception
   */
  @SuppressWarnings("unchecked")
  @BeforeEach
  void setUp() throws Exception
  {
    this.service = Mockito.mock(CrudService.class);

    this.objectUnderTest = new TestableAbstractCrudController();

    this.objectUnderTest.init(this.service);
  }


  /**
   * @throws java.lang.Exception
   */
  @AfterEach
  void tearDown() throws Exception
  {
  }


  /**
   * Test method for {@link org.drdeesw.commons.controllers.AbstractCrudController#create(org.drdeesw.commons.models.pojos.UniquePojo)}.
   * @throws Exception 
   */
  @Test
  void testCreatePWithSuccess() throws Exception
  {
    GroupMemberPojo pojo = new GroupMemberPojo();

    // Arrange

    Mockito.when(this.service.create(pojo)).thenReturn(pojo);

    // Act
    ResponseEntity<?> actual = this.objectUnderTest.create(pojo);

    // Assert

    Mockito.verify(this.service).create(pojo);

    Assert.assertEquals(HttpStatus.OK, actual.getStatusCode());
    Assert.assertEquals(pojo, actual.getBody());
  }


  /**
   * Test method for {@link org.drdeesw.commons.controllers.AbstractCrudController#create(org.drdeesw.commons.models.pojos.UniquePojo)}.
   * @throws Exception 
   */
  @Test
  void testCreatePWithException() throws Exception
  {
    GroupMemberPojo pojo = new GroupMemberPojo();
    Exception ex = new Exception();

    // Arrange

    Mockito.when(this.service.create(pojo)).thenThrow(ex);

    // Act
    ResponseEntity<?> actual = this.objectUnderTest.create(pojo);

    // Assert

    Mockito.verify(this.service).create(pojo);

    Assert.assertEquals(HttpStatus.BAD_REQUEST, actual.getStatusCode());
    Assert.assertEquals(null, actual.getBody());
  }


  /**
   * Test method for {@link org.drdeesw.commons.controllers.AbstractCrudController#create(org.drdeesw.commons.models.pojos.UniquePojo, org.springframework.validation.BindingResult)}.
   * @throws Exception 
   */
  @Test
  void testCreatePBindingResultWithSuccess() throws Exception
  {
    GroupMemberPojo pojo = new GroupMemberPojo();
    BindingResult bindingResult = new BeanPropertyBindingResult(null, null);

    // Arrange

    Mockito.when(this.service.create(pojo)).thenReturn(pojo);

    // Act
    ResponseEntity<?> actual = this.objectUnderTest.create(pojo, bindingResult);

    // Assert

    Mockito.verify(this.service).create(pojo);

    Assert.assertEquals(HttpStatus.OK, actual.getStatusCode());
    Assert.assertEquals(pojo, actual.getBody());
  }


  /**
   * Test method for {@link org.drdeesw.commons.controllers.AbstractCrudController#create(org.drdeesw.commons.models.pojos.UniquePojo, org.springframework.validation.BindingResult)}.
   * @throws Exception 
   */
  @Test
  void testCreatePBindingResultWithException() throws Exception
  {
    GroupMemberPojo pojo = new GroupMemberPojo();
    BindingResult bindingResult = new BeanPropertyBindingResult(null, null);
    Exception ex = new Exception();

    // Arrange

    Mockito.when(this.service.create(pojo)).thenThrow(ex);

    // Act
    ResponseEntity<?> actual = this.objectUnderTest.create(pojo, bindingResult);

    // Assert

    Mockito.verify(this.service).create(pojo);

    Assert.assertEquals(HttpStatus.BAD_REQUEST, actual.getStatusCode());
    Assert.assertEquals(null, actual.getBody());
  }


  /**
   * Test method for {@link org.drdeesw.commons.controllers.AbstractCrudController#create(org.drdeesw.commons.models.pojos.UniquePojo, org.springframework.validation.BindingResult)}.
   * @throws Exception 
   */
  @Test
  void testCreatePBindingResultWithBindingException() throws Exception
  {
    GroupMemberPojo pojo = new GroupMemberPojo();
    BindingResult bindingResult = new BeanPropertyBindingResult(null, null);

    // Arrange

    bindingResult.addError(new ObjectError("", ""));

    // Act
    ResponseEntity<?> actual = this.objectUnderTest.create(pojo, bindingResult);

    // Assert

    Mockito.verify(this.service, Mockito.never()).create(pojo);

    Assert.assertEquals(HttpStatus.BAD_REQUEST, actual.getStatusCode());
    //Assert.assertEquals(null, actual.getBody());
  }


  /**
   * Test method for {@link org.drdeesw.commons.controllers.AbstractCrudController#delete(org.drdeesw.commons.models.pojos.UniquePojo)}.
   */
  @Test
  void testDelete()
  {
    GroupMemberPojo pojo = new GroupMemberPojo();

    // Arrange

    // Act
    ResponseEntity<GroupMemberPojo> actual = this.objectUnderTest.delete(pojo);

    // Assert

    Mockito.verify(this.service).delete(pojo);

    Assert.assertEquals(HttpStatus.OK, actual.getStatusCode());
    Assert.assertEquals(pojo, actual.getBody());
  }


  /**
   * Test method for {@link org.drdeesw.commons.controllers.AbstractCrudController#findById(java.io.Serializable)}.
   */
  @Test
  void testFindByIdWithFound()
  {
    GroupMemberPojo expected = new GroupMemberPojo();

    // Arrange

    Mockito.when(this.service.findById(ID)).thenReturn(Optional.of(expected));

    // Act
    ResponseEntity<?> response = this.objectUnderTest.findById(ID);

    // Assert

    Mockito.verify(this.service).findById(ID);

    Assert.assertEquals(HttpStatus.OK, response.getStatusCode());
    GroupMemberPojo actual = (GroupMemberPojo)response.getBody();
    Assert.assertEquals(expected, actual);
  }


  /**
   * Test method for {@link org.drdeesw.commons.controllers.AbstractCrudController#findById(java.io.Serializable)}.
   */
  @Test
  void testFindByIdWithNotFound()
  {

    // Arrange

    Mockito.when(this.service.findById(ID)).thenReturn(Optional.empty());

    // Act
    ResponseEntity<?> actual = this.objectUnderTest.findById(ID);

    // Assert

    Mockito.verify(this.service).findById(ID);

    Assert.assertEquals(HttpStatus.NOT_FOUND, actual.getStatusCode());
    Object body = actual.getBody();
    Assert.assertEquals(null, body);
  }


  /**
   * Test method for {@link org.drdeesw.commons.controllers.AbstractCrudController#findByQuery(org.springframework.util.MultiValueMap)}.
   */
  @Test
  void testFindByQueryMultiValueMapOfStringStringWithSuccess()
  {
    GroupMemberPojo pojo = new GroupMemberPojo();
    QueryResults<GroupMemberPojo> expected = new QueryResults<>(Collections.singletonList(pojo));
    MultiValueMap<String, String> parameterMap = new HttpHeaders();

    // Arrange

    Mockito.when(this.service.findByQuery(parameterMap)).thenReturn(expected);

    // Act
    QueryResults<GroupMemberPojo> actual = this.objectUnderTest.findByQuery(parameterMap);

    // Assert

    Mockito.verify(this.service).findByQuery(parameterMap);

    Assert.assertEquals(pojo, actual.get(0));
  }


  /**
   * Test method for {@link org.drdeesw.commons.controllers.AbstractCrudController#findByQuery(org.drdeesw.commons.queries.JpqlQuery)}.
   */
  @Test
  void testFindByQueryQ()
  {
    GroupMemberPojo pojo = new GroupMemberPojo();
    JpqlQuery<GroupMemberPojo> query = new JpqlQuery<GroupMemberPojo>(GroupMemberPojo.class);
    QueryResults<GroupMemberPojo> expected = new QueryResults<>(Collections.singletonList(pojo));

    // Arrange

    Mockito.when(this.service.findByQuery(query)).thenReturn(expected);

    // Act
    QueryResults<GroupMemberPojo> actual = this.objectUnderTest.findByQuery(query);

    // Assert

    Mockito.verify(this.service).findByQuery(query);

    Assert.assertEquals(pojo, actual.get(0));
  }


  /**
   * Test method for {@link org.drdeesw.commons.controllers.AbstractCrudController#get(java.io.Serializable)}.
   */
  @Test
  void testGet()
  {
    GroupMemberPojo pojo = new GroupMemberPojo();

    // Arrange

    Mockito.when(this.service.get(ID)).thenReturn(pojo);

    // Act
    ResponseEntity<GroupMemberPojo> actual = this.objectUnderTest.get(ID);

    // Assert

    Mockito.verify(this.service).get(ID);

    Assert.assertEquals(HttpStatus.OK, actual.getStatusCode());
    Assert.assertEquals(pojo, actual.getBody());
  }


  /**
   * Test method for {@link org.drdeesw.commons.controllers.AbstractCrudController#update(org.drdeesw.commons.models.pojos.UniquePojo)}.
   */
  @Test
  void testUpdateP()
  {
    GroupMemberPojo pojo = new GroupMemberPojo();

    // Arrange

    Mockito.when(this.service.update(pojo)).thenReturn(pojo);

    // Act
    ResponseEntity<GroupMemberPojo> actual = this.objectUnderTest.update(pojo);

    // Assert

    Mockito.verify(this.service).update(pojo);

    Assert.assertEquals(HttpStatus.OK, actual.getStatusCode());
    Assert.assertEquals(pojo, actual.getBody());
  }


  /**
   * Test method for {@link org.drdeesw.commons.controllers.AbstractCrudController#update(org.drdeesw.commons.models.pojos.UniquePojo, org.springframework.validation.BindingResult)}.
   */
  @Test
  void testUpdatePBindingResultWithSuccess()
  {
    GroupMemberPojo pojo = new GroupMemberPojo();
    BindingResult bindingResult = new BeanPropertyBindingResult(null, null);

    // Arrange

    Mockito.when(this.service.update(pojo)).thenReturn(pojo);

    // Act
    ResponseEntity<?> actual = this.objectUnderTest.update(pojo, bindingResult);

    // Assert

    Mockito.verify(this.service).update(pojo);

    Assert.assertEquals(HttpStatus.OK, actual.getStatusCode());
    Assert.assertEquals(pojo, actual.getBody());
  }


  /**
   * Test method for {@link org.drdeesw.commons.controllers.AbstractCrudController#update(org.drdeesw.commons.models.pojos.UniquePojo, org.springframework.validation.BindingResult)}.
   */
  @Test
  void testUpdatePBindingResultWithBindingException()
  {
    GroupMemberPojo pojo = new GroupMemberPojo();
    BindingResult bindingResult = new BeanPropertyBindingResult(null, null);

    // Arrange

    Mockito.when(this.service.update(pojo)).thenReturn(pojo);
    bindingResult.addError(new ObjectError("", ""));

    // Act
    ResponseEntity<?> actual = this.objectUnderTest.update(pojo, bindingResult);

    // Assert

    Mockito.verify(this.service, Mockito.never()).update(pojo);

    Assert.assertEquals(HttpStatus.BAD_REQUEST, actual.getStatusCode());
    //Assert.assertEquals(pojo, actual.getBody());
  }

}
