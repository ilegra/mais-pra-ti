USE Universidade
GO

CREATE TABLE curso
(id_curso int IDENTITY(1,1) PRIMARY KEY,
 nome_curso varchar(30) NOT NULL,
 tipo int NOT NULL,
 depart int NOT NULL,
 coordenador int NOT NULL,
 vice_coord int NOT NULL
 )