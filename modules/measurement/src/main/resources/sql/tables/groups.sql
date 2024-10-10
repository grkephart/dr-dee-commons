/*
-- Structured to work with JdbcUserDetailsManager.
--
-- select group_name from groups
-- select username from group_members gm, groups g where gm.group_id = g.id and g.group_name = ?
-- insert into groups (group_name) values (?)
-- select id from groups where group_name = ?
-- delete from groups where id = ?
-- update groups set group_name = ? where group_name = ?
-- select g.id, g.group_name, ga.authority from groups g, group_authorities ga where g.group_name = ? and g.id = ga.group_id
*/
CREATE TABLE drdeesw.groups(
  id         BIGINT        UNSIGNED NOT NULL AUTO_INCREMENT,
  group_name VARCHAR(255)  NOT NULL,
  PRIMARY KEY               (id),
  UNIQUE  KEY group_id_uq   (id),
  UNIQUE  KEY group_name_uq (group_name)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
