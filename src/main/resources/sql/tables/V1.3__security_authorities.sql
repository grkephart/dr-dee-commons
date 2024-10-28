/*
-- Structured to work with JdbcUserDetailsManager.
--
-- insert into authorities (username, authority) values (?,?)
-- delete from authorities where username = ?
*/

SET @logMessage = NULL;

DELIMITER //

CREATE PROCEDURE CheckAndCreateAuthoritiesTable()
BEGIN

	SET @table_name = 'authorities';
	
	IF NOT EXISTS (SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES  WHERE TABLE_NAME = @table_name) THEN
			
	CREATE TABLE authorities(
	  id        BIGINT       UNSIGNED NOT NULL AUTO_INCREMENT,
	  authority VARCHAR(255),
	  user_id   BIGINT       UNSIGNED,
	  username  VARCHAR(255),
	  PRIMARY KEY                          (id),
	  UNIQUE  KEY auth_id_uq               (id),
	  UNIQUE  KEY auth_sk_uq               (authority,username),
	  CONSTRAINT  auth_user_fk FOREIGN KEY (user_id)  REFERENCES users (user_id)
	) ENGINE=InnoDB DEFAULT CHARSET=utf8;

	SET @logMessage = CONCAT('Table "', @table_name, '" was created.');
  ELSE
    SET @logMessage = CONCAT('Table "', @table_name, '" already exists.');
  END IF;

END //

DELIMITER ;

CALL CheckAndCreateAuthoritiesTable();
SELECT @logMessage AS Message;

DROP PROCEDURE IF EXISTS CheckAndCreateAuthoritiesTable;
