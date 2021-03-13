USE Universidade
GO

ALTER TABLE alunos
 ADD FOREIGN KEY(Depart) REFERENCES departamentos(id_depart);

 ALTER TABLE alunos
 ADD FOREIGN KEY(Curso) REFERENCES curso(id_curso);

