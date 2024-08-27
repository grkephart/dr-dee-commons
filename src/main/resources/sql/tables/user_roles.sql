CREATE TABLE drdeesw.user_roles (
  user_role_id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
  user_id      BIGINT UNSIGNED NOT NULL,
  role_id      BIGINT UNSIGNED NOT NULL,
  PRIMARY KEY                    (user_role_id),
  UNIQUE KEY user_role_id_uq     (user_role_id),
  UNIQUE KEY user_role_sk        (user_id,role_id),
  KEY        user_roles_role_fk_idx (role_id),
  CONSTRAINT user_roles_role_fk FOREIGN KEY (role_id) REFERENCES drdeesw.roles (role_id),
  CONSTRAINT user_roles_user_fk FOREIGN KEY (user_id) REFERENCES drdeesw.users (user_id)
) ENGINE=InnoDB CHARSET=utf8;
