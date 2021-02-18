USE Universidade
GO

ALTER TABLE professor
	ADD FOREIGN KEY (Depart) REFERENCES departamentos(id_depart);