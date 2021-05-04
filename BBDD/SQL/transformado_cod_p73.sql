CREATE TABLE EMPRESAS(
	cod_empresa int primary key,
	nombre_empresa varchar(20),
)

CREATE TABLE CONOCIMIENTOS (
	cod_conoc int not null primary key,
	cod_técnico int not null,
	cod_empresa int not null references EMPRESAS,
	título_conocimiento varchar(10),
	área_conoc varchar(10),
	grado char(5)
)

CREATE TABLE TÉCNICOS (
	cod_técnico int not null primary key,
	nombre_técnico varchar(8),
	cod_categoría int not null *,
	categoria varchar(8),
	fecha_alta date,
	fecha_baja date
)

CREATE TABLE PROYECTOS (
	cod_proyecto int not null primary key,
	cod_técnico int not null references TÉCNICOS,
	cod_empresa int not null references EMPRESAS,
	nombre_proyecto varchar(8),
	f_inicio date check(f_inicio = getdate()),
	f_fin date,
	cod_cliente int 
)

CREATE TABLE CATEGORÍAS (
	cod_categoría int not null primary key,
	categoría varchar(8)
)

CREATE TABLE CLIENTES (
	cod_cliente int not null primary key,
	nombre_cliente varchar(8)
)

CREATE TABLE técnicoProyecto (
	cod_técnico int not null references TÉCNICOS,
	cod_proyecto int not null references PROYECTOS,
	f_asignación date,
	f_cese date
)

ALTER TABLE TÉCNICOS
	ADD constraint CK_técnicos_fecha
	CHECK (fecha_baja > fecha_alta)

ALTER TABLE PROYECTOS
	ADD constraint CK_proyectos_fecha
	CHECK (f_fin > f_inicio)

ALTER TABLE técnicoProyecto
	ADD constraint CK_técnicosProyectos_fecha
	CHECK (f_cese > f_asignación)


ALTER TABLE CONOCIMIENTOS
	ADD constraint FK_conocimientos_técnicos
	FOREIGN KEY (cod_técnico)
	REFERENCES TÉCNICOS(cod_técnico)

