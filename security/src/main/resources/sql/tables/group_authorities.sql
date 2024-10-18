/*
-- Structured to work with JdbcUserDetailsManager.
--
-- insert into group_authorities (group_id, authority) values (?,?)
-- delete from group_authorities where group_id = ?
-- select g.id, g.group_name, ga.authority from groups g, group_authorities ga where g.group_name = ? and g.id = ga.group_id
-- delete from group_authorities where group_id = ? and authority = ?
*/
CREATE TABLE drdeesw.group_authorities(
  id            BIGINT       UNSIGNED NOT NULL AUTO_INCREMENT,
  group_id      BIGINT       UNSIGNED NOT NULL,
  authority_id  BIGINT       UNSIGNED NOT NULL,
  authority     VARCHAR(255) NOT NULL,
  PRIMARY KEY           (id),
  UNIQUE KEY ga_id_uq (id),
  CONSTRAINT ga_auth_fk  FOREIGN KEY (authority_id) REFERENCES drdeesw.authorities (id),
  CONSTRAINT ga_group_fk FOREIGN KEY (group_id)     REFERENCES drdeesw.groups      (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
