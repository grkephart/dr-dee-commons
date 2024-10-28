
DELIMITER //

CREATE PROCEDURE CheckAndCreateServiceProvidersTable()
BEGIN
  DECLARE table_exists INT DEFAULT 0;
  DECLARE logMessage VARCHAR(255);

  SELECT 'Executing CheckAndCreateServiceProvidersTable' AS Message;

  SET @schema_name = 'reactrax';
  SET @table_name  = 'service_providers';
  
  SELECT COUNT(*) INTO table_exists FROM INFORMATION_SCHEMA.TABLES  WHERE TABLE_SCHEMA = @schema_name AND TABLE_NAME = @table_name;

  IF table_exists = 0 THEN
      
    CREATE TABLE reactrax.service_providers (
      service_provider_id BIGINT       UNSIGNED NOT NULL AUTO_INCREMENT,
      name                VARCHAR(255) NOT NULL,
      description         VARCHAR(255) NULL,
      type_id             BIGINT       UNSIGNED,
      
      PRIMARY KEY           (service_provider_id),
      UNIQUE  KEY sp_id_uq  (service_provider_id)
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
CALL CheckAndCreateServiceProvidersTable();

-- Cleanup
DROP PROCEDURE IF EXISTS CheckAndCreateServiceProvidersTable;

-- Verify the table creation by counting rows (should return 0 if empty)
SELECT COUNT(*) FROM reactrax.service_providers;
