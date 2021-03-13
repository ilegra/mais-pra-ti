USE Universidade
GO

CREATE TABLE departamentos
(id_depert int IDENTITY(1,1) PRIMARY KEY,
 nome varchar(45) NOT NULL,
 telefone varchar(20) NOT NULL,
 centro varchar(150) NOT NULL
)