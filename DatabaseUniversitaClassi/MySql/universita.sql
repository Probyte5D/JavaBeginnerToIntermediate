CREATE DATABASE IF NOT EXISTS universita;
USE universita;

DROP TABLE IF EXISTS esami;
DROP TABLE IF EXISTS allievi;

CREATE TABLE allievi
(
	ID_Allievo INT PRIMARY KEY AUTO_INCREMENT,
    Nome VARCHAR(25) NOT NULL,
    Corso VARCHAR(25) NOT NULL
    );

CREATE TABLE esami
(
	ID_esame INT PRIMARY KEY AUTO_INCREMENT,
    data_Esame DATE,
    voto INT DEFAULT 0,
    materia VARCHAR(25) NOT NULL,
    ID_Allievo INT,
	FOREIGN KEY (ID_Allievo) REFERENCES allievi(ID_Allievo)
    );
