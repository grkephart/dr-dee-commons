module org.drdeesw.commons.modules.common
{
  requires java.persistence;       // for javax.persistence
  requires java.transaction;       // for javax.transaction
  requires org.apache.commons.logging;
  requires spring.context;         // for org.springframework.validation
  requires spring.core;            // for org.springframework.util
  requires spring.web;             // for org.springframework.http
  requires spring.data.jpa;
  requires org.hibernate.orm.core; // for org.hibernate.annotations
  requires modelmapper;            // for org.modelmapper
  
  exports org.drdeesw.commons.common.controllers;
  exports org.drdeesw.commons.common.models;
  exports org.drdeesw.commons.common.models.aggregates;
  exports org.drdeesw.commons.common.models.entities;
  exports org.drdeesw.commons.common.models.pojos;
  exports org.drdeesw.commons.common.queries;
  exports org.drdeesw.commons.common.queries.datatables;
  exports org.drdeesw.commons.common.repositories;
  exports org.drdeesw.commons.common.repositories.impl;
  exports org.drdeesw.commons.common.services;
  exports org.drdeesw.commons.common.services.impl;
}