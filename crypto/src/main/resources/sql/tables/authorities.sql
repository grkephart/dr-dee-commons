/*
-- Structured to work with JdbcUserDetailsManager.
--
-- insert into authorities (username, authority) values (?,?)
-- delete from authorities where username = ?
*/
CREATE TABLE drdeesw.authorities(
  id        BIGINT       UNSIGNED NOT NULL AUTO_INCREMENT,
  authority VARCHAR(255),
  user_id   BIGINT       UNSIGNED,
  username  VARCHAR(255),
  PRIMARY KEY                          (id),
  UNIQUE  KEY auth_id_uq               (id),
  UNIQUE  KEY auth_sk_uq               (authority,username),
  CONSTRAINT  auth_user_fk FOREIGN KEY (user_id)  REFERENCES drdeesw.users (user_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
