USE Universidade
GO

ALTER TABLE Tel_aluno
	ADD FOREIGN KEY(dono) REFERENCES alunos(id_aluno)


ALTER TABLE Tel_prof
	ADD FOREIGN KEY(dono) REFERENCES professor(id_prof)


ALTER TABLE curso
	ADD FOREIGN KEY(tipo) REFERENCES tipo_formacao(id_tipo)

ALTER TABLE curso
	ADD FOREIGN KEY(depart) REFERENCES departamentos(id_depart)

ALTER TABLE curso
	ADD FOREIGN KEY(coordenador) REFERENCES professor(id_prof)

ALTER TABLE curso
	ADD FOREIGN KEY(vice_coord) REFERENCES professor(id_prof)