USE Universidade
GO

CREATE TABLE professor
(id_prof int IDENTITY(1,1) PRIMARY KEY,
nome varchar(30) NOT NULL,
CPF char(11) NOT NULL,
Depart int NOT NULL
)