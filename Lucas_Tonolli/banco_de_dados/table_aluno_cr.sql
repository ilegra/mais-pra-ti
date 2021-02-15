USE Universidade
GO

CREATE TABLE alunos
(id_aluno int IDENTITY(1,1) PRIMARY KEY,
 nome_aluno varchar(30) NOT NULL,
 CPF char(11) NOT NULL,
 rua varchar(30) NOT NULL,
 bairro varchar(30) NOT NULL,
 cidade varchar(30) NOT NULL,
 CEP varchar(20) NOT NULL,
 dt_Nasc date NOT NULL,
 sexo char(1) NOT NULL CHECK(sexo IN('F','f','M','m')),
 Depart int NOT NULL,
 Curso int NOT NULL,
 Disciplinas int NOT NULL
 )