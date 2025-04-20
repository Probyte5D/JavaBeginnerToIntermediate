
CREATE DATABASE IF NOT EXISTS scuola;
USE scuola;

CREATE TABLE `studenti` (
  `ID_studenti` int NOT NULL AUTO_INCREMENT,
  `Nome` varchar(25) NOT NULL,
  `voto` int DEFAULT '0',
  PRIMARY KEY (`ID_studenti`),
  UNIQUE KEY `Nome` (`Nome`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci