USE Universidade
GO

CREATE TABLE disciplina
(id_disciplina int IDENTITY(1,1) PRIMARY KEY,
 nome_disc varchar(30) NOT NULL,
 descricao varchar(150) NOT NULL,
 creditos int NOT NULL,
 depart_responsavel int NOT NULL,
 curso_detentor int NOT NULL
 )