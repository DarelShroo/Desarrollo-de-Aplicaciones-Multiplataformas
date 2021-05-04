CREATE TABLE EMPRESAS(
	cod_empresa int primary key,
	nombre_empresa varchar(20),
)

CREATE TABLE CONOCIMIENTOS (
	cod_conoc int not null primary key,
	cod_t�cnico int not null,
	cod_empresa int not null references EMPRESAS,
	t�tulo_conocimiento varchar(10),
	�rea_conoc varchar(10),
	grado char(5)
)

CREATE TABLE T�CNICOS (
	cod_t�cnico int not null primary key,
	nombre_t�cnico varchar(8),
	cod_categor�a int not null *,
	categoria varchar(8),
	fecha_alta date,
	fecha_baja date
)

CREATE TABLE PROYECTOS (
	cod_proyecto int not null primary key,
	cod_t�cnico int not null references T�CNICOS,
	cod_empresa int not null references EMPRESAS,
	nombre_proyecto varchar(8),
	f_inicio date check(f_inicio = getdate()),
	f_fin date,
	cod_cliente int 
)

CREATE TABLE CATEGOR�AS (
	cod_categor�a int not null primary key,
	categor�a varchar(8)
)

CREATE TABLE CLIENTES (
	cod_cliente int not null primary key,
	nombre_cliente varchar(8)
)

CREATE TABLE t�cnicoProyecto (
	cod_t�cnico int not null references T�CNICOS,
	cod_proyecto int not null references PROYECTOS,
	f_asignaci�n date,
	f_cese date
)

ALTER TABLE T�CNICOS
	ADD constraint CK_t�cnicos_fecha
	CHECK (fecha_baja > fecha_alta)

ALTER TABLE PROYECTOS
	ADD constraint CK_proyectos_fecha
	CHECK (f_fin > f_inicio)

ALTER TABLE t�cnicoProyecto
	ADD constraint CK_t�cnicosProyectos_fecha
	CHECK (f_cese > f_asignaci�n)


ALTER TABLE CONOCIMIENTOS
	ADD constraint FK_conocimientos_t�cnicos
	FOREIGN KEY (cod_t�cnico)
	REFERENCES T�CNICOS(cod_t�cnico)

