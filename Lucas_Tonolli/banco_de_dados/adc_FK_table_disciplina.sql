USE Universidade
GO

ALTER TABLE disciplina
	ADD FOREIGN KEY (depart_responsavel) REFERENCES departamentos(id_depart)

ALTER TABLE disciplina
	ADD FOREIGN KEY (curso_detentor) REFERENCES curso(id_curso);

