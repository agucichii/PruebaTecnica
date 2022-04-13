create table agu_Registro (
	uuid_ VARCHAR(75) null,
	registroId LONG not null primary key,
	nombre VARCHAR(75) null,
	apellido VARCHAR(75) null,
	nacimiento DATE null,
	correo VARCHAR(75) null,
	fechacreacion DATE null
);