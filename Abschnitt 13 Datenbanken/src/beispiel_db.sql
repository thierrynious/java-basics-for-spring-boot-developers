-- SQL zur Erstellung der Beispiel-Tabelle(ausführbar in MySQL-Workbench)

CREATE DATABASE beispiel_db;
       USE beispiel_db;

           CREATE TABLE kunden (
               id INT AUTO_INCREMENT PRIMARY KEY,
               name VARCHAR(50),
               stadt VARCHAR(50)
           );

INSERT INTO kunden (name, stadt) VALUES ('Anna','Berlin'), ('Lars','Hamburg');