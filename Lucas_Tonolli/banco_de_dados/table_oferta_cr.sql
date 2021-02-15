USE Universidade
GO

CREATE TABLE oferta_disc
(id_oferta int IDENTITY(1,1) PRIMARY KEY,
 prof_responsavel int NOT NULL,
 Horario time NOT NULL
)