/*
-- Structured to work with JdbcUserDetailsManager.
--
-- insert into group_authorities (group_id, authority) values (?,?)
-- delete from group_authorities where group_id = ?
-- select g.id, g.group_name, ga.authority from groups g, group_authorities ga where g.group_name = ? and g.id = ga.group_id
-- delete from group_authorities where group_id = ? and authority = ?
*/

SET @logMessage = NULL;

DELIMITER //

CREATE PROCEDURE CheckAndCreateGroupAuthoritiesTable()
BEGIN

  SET @table_name = 'group_authorities';
  
  IF NOT EXISTS (SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES  WHERE TABLE_NAME = @table_name) THEN
      
  CREATE TABLE group_authorities(
    id            BIGINT       UNSIGNED NOT NULL AUTO_INCREMENT,
    group_id      BIGINT       UNSIGNED NOT NULL,
    authority_id  BIGINT       UNSIGNED NOT NULL,
    authority     VARCHAR(255) NOT NULL,
    PRIMARY KEY           (id),
    UNIQUE KEY ga_id_uq (id),
    CONSTRAINT ga_auth_fk  FOREIGN KEY (authority_id) REFERENCES authorities (id),
    CONSTRAINT ga_group_fk FOREIGN KEY (group_id)     REFERENCES groups      (id)
  ) ENGINE=InnoDB DEFAULT CHARSET=utf8;

  SET @logMessage = CONCAT('Table "', @table_name, '" was created.');
  ELSE
    SET @logMessage = CONCAT('Table "', @table_name, '" already exists.');
  END IF;

END //

DELIMITER ;

CALL CheckAndCreateGroupAuthoritiesTable();
SELECT @logMessage AS Message;

DROP PROCEDURE IF EXISTS CheckAndCreateGroupAuthoritiesTable;
