USE Universidade
GO

CREATE TABLE Tel_aluno
( dono int NOT NULL,
  Tel_1 varchar(20) NOT NULL,
  Tel_2 varchar(20),
  Tel_3 varchar(20)
)

CREATE TABLE Tel_prof
( dono int NOT NULL,
  Tel_1 varchar(20) NOT NULL,
  Tel_2 varchar(20),
  Tel_3 varchar(20)
)

CREATE TABLE tipo_formacao
(id_tipo int IDENTITY(1,1) PRIMARY KEY,
 nome_formacao varchar(20)
)