
DROP TABLE RESERVACION;
drop table TARJETA1;
DROP TABLE CLIENTE;

CREATE TABLE CLIENTE (ID_CLIENTE INTEGER PRIMARY KEY AUTO_INCREMENT,
NOMBRE VARCHAR(100), EMAIL VARCHAR(100), PATERNO VARCHAR(100));

select * from CLIENTE;

CREATE TABLE DANCE (ID_DANCE INTEGER PRIMARY KEY AUTO_INCREMENT, NOMBRE VARCHAR(120), EDAD INTEGER);

SELECT * FROM DANCE;

SELECT * FROM USUARIO;

SELECT * FROM DIRECCION;

drop table USUARIO;
DROP TABLE DIRECCION;

DELETE FROM USUARIO;
DELETE FROM DIRECCION;

CREATE TABLE DIRECCION (ID_DIRECCION INTEGER PRIMARY KEY AUTO_INCREMENT,
                        CALLE VARCHAR(120), NUMERO INTEGER, COLONIA VARCHAR(140) NOT NULL, MUNICIPIO VARCHAR(80), ESTADO VARCHAR(40) 
                         );

CREATE TABLE USUARIO (ID_USUARIO INTEGER PRIMARY KEY AUTO_INCREMENT,ID_DIRECCION INTEGER, NOMBRE VARCHAR(40), LOGIN VARCHAR(40), PASSWORD VARCHAR(40),
 FOREIGN KEY(ID_DIRECCION) REFERENCES DIRECCION(ID_DIRECCION));