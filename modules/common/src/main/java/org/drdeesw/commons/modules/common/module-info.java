module org.drdeesw.commons.modules.common
{
  requires org.apache.commons.logging;
  requires spring.context;   // for org.springframework.validation
  requires spring.core;      // for org.springframework.util
  requires spring.web;       // for org.springframework.http
  requires java.persistence; // for javax.persistence
  requires org.hibernate.orm.core;   // for org.hibernate.annotations
  
  exports org.drdeesw.commons.modules.common.controllers;
  exports org.drdeesw.commons.modules.common.models;
  exports org.drdeesw.commons.modules.common.models.aggregates;
  exports org.drdeesw.commons.modules.common.models.entities;
  exports org.drdeesw.commons.modules.common.models.pojos;
  exports org.drdeesw.commons.modules.common.queries;
  exports org.drdeesw.commons.modules.common.queries.datatables;
  exports org.drdeesw.commons.modules.common.repositories;
  exports org.drdeesw.commons.modules.common.repositories.impl;
  exports org.drdeesw.commons.modules.common.services;
  exports org.drdeesw.commons.modules.common.services.impl;
}