USE Universidade
GO
/*Relacionamento entre aluno e disciplina*/
CREATE TABLE aula
(id_matricula int IDENTITY(1,1) PRIMARY KEY,
 matricula_aluno int NOT NULL,
 codigo_disciplina int NOT NULL
)