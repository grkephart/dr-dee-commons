CREATE TABLE drdeesw.roles (
  role_id BIGINT      UNSIGNED NOT NULL AUTO_INCREMENT,
  name    VARCHAR(45) NOT NULL,
  PRIMARY KEY           (role_id),
  UNIQUE KEY role_id_uq (role_id),
  UNIQUE KEY name_uq    (name)
) ENGINE=InnoDB CHARSET=utf8;
