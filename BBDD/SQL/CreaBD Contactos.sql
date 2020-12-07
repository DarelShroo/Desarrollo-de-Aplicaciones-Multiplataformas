CREATE DATABASE BDCONTACTOS
GO
USE BDCONTACTOS

CREATE TABLE CONTACTOS (
id_contactos integer constraint pkcontactos primary key,
nombre varchar (50), apellido varchar (50), dni char (9), telefono char (9), ecorreo varchar (50)
)

CREATE TABLE CATEGORIAS (
id_categoria integer identity (1,1) constraint pkcategorias primary key,
categoria varchar (30)
)
CREATE TABLE PROVINCIAS (
id_provincia char (4) constraint pkprovincias primary key,
provincia varchar (30)
)
ALTER TABLE CONTACTOS ADD poblacion varchar (50)

EXEC sp_rename 'CONTACTOS.ecorreo','correoe','column';

ALTER TABLE contactos ALTER COLUMN correoe varchar (60)

ALTER TABLE contactos drop column poblacion

ALTER TABLE contactos ADD categoria integer

ALTER TABLE contactos ADD provincia char (4)

ALTER TABLE contactos ADD constraint fk_contactoscategoria FOREIGN KEY (categoria) REFERENCES CATEGORIAS (id_categoria)

ALTER TABLE contactos ADD constraint fk_contactosprovincia FOREIGN KEY (provincia) REFERENCES PROVINCIAS (id_provincia)
 insert into libros default values;