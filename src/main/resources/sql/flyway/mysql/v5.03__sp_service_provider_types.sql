
DELIMITER //

CREATE PROCEDURE CheckAndCreateServiceProviderTypesTable()
BEGIN
  DECLARE table_exists INT DEFAULT 0;
  DECLARE logMessage VARCHAR(255);

  SELECT 'Executing CheckAndCreateServiceProviderTypesTable' AS Message;

  SET @table_name  = 'service_provider_types';
  
  SELECT COUNT(*) INTO table_exists FROM INFORMATION_SCHEMA.TABLES  WHERE TABLE_SCHEMA = DATABASE() AND TABLE_NAME = @table_name;

  IF table_exists = 0 THEN
      
    CREATE TABLE service_provider_types (
      service_provider_type_id BIGINT       UNSIGNED NOT NULL AUTO_INCREMENT,
      name VARCHAR(255)        NOT NULL,
      
      PRIMARY KEY           (service_provider_type_id),
      UNIQUE  KEY sp_id_uq  (service_provider_type_id)
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
CALL CheckAndCreateServiceProviderTypesTable();

-- Cleanup
DROP PROCEDURE IF EXISTS CheckAndCreateServiceProviderTypesTable;

-- Verify the table creation by counting rows (should return 0 if empty)
SELECT COUNT(*) FROM service_provider_types;
