CREATE TABLE EMPRESAS(
	id_empresa int identity(1,1) not null primary key,
	nombre_empresa varchar(20),
)

CREATE TABLE CONOCIMIENTOS (
	id_conocimiento int identity(1,1) not null primary key,
	id_técnico int not null,
	id_empresa int not null references EMPRESAS,
	título_conocimiento varchar(10),
	área_conoc varchar(10),
	grado char(5)
)

CREATE TABLE TÉCNICOS (
	id_técnico int identity(1,1) not null primary key,
	nombre_técnico varchar(8),
	id_categoría int not null,
	categoria varchar(8),
	fecha_alta date,
	fecha_baja date
)

CREATE TABLE PROYECTOS (
	id_proyecto int identity(1,1) not null primary key,
	id_técnico int not null references TÉCNICOS,
	id_empresa int not null references EMPRESAS,
	nombre_proyecto varchar(8),
	f_inicio date check(f_inicio = getdate()),
	f_fin date,
	id_cliente int not null
)

CREATE TABLE CATEGORÍAS (
	id_categoría int identity(1,1) not null primary key,
	categoría varchar(8)
)

CREATE TABLE CLIENTES (
	id_cliente int identity(1,1) not null primary key,
	nombre_cliente varchar(8)
)

CREATE TABLE técnicoProyecto (
	id_técnicoProyecto int identity(1,1) not null primary key,
	id_técnico int not null references TÉCNICOS,
	id_proyecto int not null references PROYECTOS,
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
	FOREIGN KEY (id_técnico)
	REFERENCES TÉCNICOS(id_técnico)

ALTER TABLE TÉCNICOS
	ADD constraint FK_técnicos_categorías
	FOREIGN KEY (id_categoría)
	REFERENCES CATEGORÍAS(id_categoría)

ALTER TABLE PROYECTOS
	ADD constraint FK_proyectos_clientes
	FOREIGN KEY (id_cliente)
	REFERENCES CLIENTES(id_cliente)
