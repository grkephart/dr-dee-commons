
DELIMITER //

CREATE PROCEDURE CheckAndCreateOrgsTable()
BEGIN
  DECLARE table_exists INT DEFAULT 0;
  DECLARE logMessage VARCHAR(255);

  SELECT 'Executing CheckAndCreateOrgsTable' AS Message;

  SET @schema_name = 'reactrax';
  SET @table_name  = 'organizations';
  
  SELECT COUNT(*) INTO table_exists FROM INFORMATION_SCHEMA.TABLES  WHERE TABLE_SCHEMA = @schema_name AND TABLE_NAME = @table_name;

  IF table_exists = 0 THEN
      
    CREATE TABLE reactrax.organizations (
      organization_id  BIGINT       UNSIGNED NOT NULL AUTO_INCREMENT,
      name             VARCHAR(255) NOT NULL,
      description      VARCHAR(255) NULL,
      parent_id        BIGINT       UNSIGNED,
      status           SMALLINT     UNSIGNED,
      type_id          BIGINT       UNSIGNED,
      
      created_by_id    BIGINT       UNSIGNED NOT NULL,
      creation_date    TIMESTAMP    NOT NULL,
      last_update_date TIMESTAMP    NULL,
      last_update_id   BIGINT       UNSIGNED,
      
      PRIMARY KEY             (organization_id),
      UNIQUE  KEY user_id_uq  (organization_id)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
  
    SET logMessage = CONCAT('Table "', @table_name, '" was created.');
  ELSE
    SET logMessage = CONCAT('Table "', @table_name, '" already exists.');
  END IF;
    
  -- Output the log message
  SELECT logMessage AS Message;

END //

DELIMITER ;

-- Call the procedure
CALL CheckAndCreateOrgsTable();

-- Cleanup
DROP PROCEDURE IF EXISTS CheckAndCreateOrgsTable;

-- Verify the table creation by counting rows (should return 0 if empty)
SELECT COUNT(*) FROM reactrax.organizations;
