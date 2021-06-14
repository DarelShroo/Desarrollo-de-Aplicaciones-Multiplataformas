create table t_prueba (cod integer constraint pkprueba primary key, nombre varchar(30));
create table t_prueba1 (cod number (5,0) constraint pkprueba1 primary key, nombre varchar(30));

RENAME t_prueba1 TO tabla_una;

ALTER TABLE T_prueba ADD (telefono char(9));

ALTER TABLE T_prueba MODIFY (nombre varchar2(50)); /*No se puede modificar por un valor menor*/

INSERT INTO t_prueba values (1, 'pepe', '676272560');

SELECT * FROM t_prueba;

SELECT cod||nombre, telefono from t_prueba;

CREATE TABLE ingresos(cod NUMBER(5) PRIMARY KEY,
concepto VARCHAR(40) NOT NULL, importe_max NUMBER(11,2),
importe NUMBER(11,2), CONSTRAINT importe_máximo CHECK (importe < importe_max));

CREATE TYPE colec_hijos as VARRAY(10) OF VARCHAR(30);

CREATE TABLE empleado
(id number,
nombre varchar2(30),
apellido varchar2(30),
hijos colec_hijos);

INSERT INTO empleado
    VALUES(1, 'Francisco', 'Pérez', colec_hijos('luis', 'ursula'));
    
INSERT INTO empleado 
    VALUES(2, 'Esperanza', 'Jiménez', colec_hijos('josé', 'carlos', 'pedro'));
    
SELECT * FROM empleado;

SELECT e.id, e.nombre, e.apellido, e.hijos FROM empleado e;

UPDATE empleado SET nombre = 'Julia' WHERE id=2;

UPDATE empleado SET hijos=colec_hijos('peter', 'jose', 'carlos', 'ana') WHERE id=2;

CREATE TYPE tabla_hijos AS TABLE OF VARCHAR2(30);

CREATE TABLE empleado1 (id number, nombre varchar2(30), apellido varchar2(30), hijos tabla_hijos)
    NESTED TABLE hijos STORE AS t_hijos;

INSERT INTO empleado1 VALUES(1,'Pepe', 'Pérez', tabla_hijos('hijouno','hijodos'));

SELECT * FROM empleado1;

SELECT nombre, h.* FROM empleado1, TABLE (hijos) h;

SELECT nombre, h.* FROM empleado, TABLE (hijos) h;

INSERT INTO THE (SELECT hijos FROM empleado1 WHERE id=1) VALUES (('hijotres'));

CREATE OR REPLACE TYPE telefono_A AS OBJECT (tipo varchar(30), num number)

CREATE OR REPLACE TYPE listin_A AS TABLE OF telefono_A;

CREATE TABLE clientes_A (id1 number, nombre varchar2(10), telefonos1 listin_A)
    NESTED TABLE telefonos1 STORE AS tel_tab_A1;

INSERT INTO clientes_A values (2, 'Pepe', listin_a(telefono_A('fijo', 911234567),
    telefono_A('movil personal', 676272560)));

INSERT INTO clientes_A values (1, 'Paco', listin_a(telefono_A('fijo', 911234567),
    telefono_A('movil personal', 6768552560),
    telefono_A('movil empresa', 8054652560)));

SELECT * FROM clientes_A;

SELECT ID1 nombre, p.* FROM clientes_A, TABLE (clientes_A.telefonos1) p; 

SELECT ID1 nombre, p.tipo, p.num FROM clientes_A, TABLE (telefonos1) p; 

INSERT INTO THE (SELECT telefonos1 FROM clientes_A where ID1=2) values (telefono_A ('abuela', 929725210));

UPDATE TABLE (SELECT telefonos1 FROM clientes_A WHERE id1=1) ANIDADA SET num = '654654654' WHERE ANIDADA.tipo='fijo';

DELETE TABLE (SELECT telefonos1 FROM clientes_A where id1=2) WHERE tipo='fijo';