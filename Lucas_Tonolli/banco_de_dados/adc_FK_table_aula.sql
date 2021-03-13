USE Universidade
GO

ALTER TABLE aula
	ADD FOREIGN KEY (matricula_aluno) REFERENCES alunos(id_aluno)


ALTER TABLE aula
	ADD FOREIGN KEY (codigo_disciplina) REFERENCES disciplina(id_disciplina);