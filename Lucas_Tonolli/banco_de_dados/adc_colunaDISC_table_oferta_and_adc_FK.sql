USE Universidade
GO

ALTER TABLE oferta_disc
	ADD disciplina int NOT NULL

ALTER TABLE oferta_disc
	ADD FOREIGN KEY (disciplina) REFERENCES disciplina(id_disciplina)

ALTER TABLE oferta_disc
	ADD FOREIGN KEY (prof_responsavel) REFERENCES professor(id_prof);
