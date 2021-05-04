CREATE TABLE EMPRESAS(
	id_empresa int identity(1,1) not null primary key,
	nombre_empresa varchar(20),
)

CREATE TABLE CONOCIMIENTOS (
	id_conocimiento int identity(1,1) not null primary key,
	id_t�cnico int not null,
	id_empresa int not null references EMPRESAS,
	t�tulo_conocimiento varchar(10),
	�rea_conoc varchar(10),
	grado char(5)
)

CREATE TABLE T�CNICOS (
	id_t�cnico int identity(1,1) not null primary key,
	nombre_t�cnico varchar(8),
	id_categor�a int not null,
	categoria varchar(8),
	fecha_alta date,
	fecha_baja date
)

CREATE TABLE PROYECTOS (
	id_proyecto int identity(1,1) not null primary key,
	id_t�cnico int not null references T�CNICOS,
	id_empresa int not null references EMPRESAS,
	nombre_proyecto varchar(8),
	f_inicio date check(f_inicio = getdate()),
	f_fin date,
	id_cliente int not null
)

CREATE TABLE CATEGOR�AS (
	id_categor�a int identity(1,1) not null primary key,
	categor�a varchar(8)
)

CREATE TABLE CLIENTES (
	id_cliente int identity(1,1) not null primary key,
	nombre_cliente varchar(8)
)

CREATE TABLE t�cnicoProyecto (
	id_t�cnicoProyecto int identity(1,1) not null primary key,
	id_t�cnico int not null references T�CNICOS,
	id_proyecto int not null references PROYECTOS,
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
	FOREIGN KEY (id_t�cnico)
	REFERENCES T�CNICOS(id_t�cnico)

ALTER TABLE T�CNICOS
	ADD constraint FK_t�cnicos_categor�as
	FOREIGN KEY (id_categor�a)
	REFERENCES CATEGOR�AS(id_categor�a)

ALTER TABLE PROYECTOS
	ADD constraint FK_proyectos_clientes
	FOREIGN KEY (id_cliente)
	REFERENCES CLIENTES(id_cliente)
