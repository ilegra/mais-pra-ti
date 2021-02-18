CREATE database desafio_maisprati_ilegra_bd;

CREATE TABLE desafio_maisprati_ilegra_bd.Departamento(
	idDepartamento int NOT NULL AUTO_INCREMENT,
    	Nome varchar(255) NOT NULL,
    	Codigo varchar(20) NOT NULL,
    	Telefone int(15) NOT NULL,
    	Centro varchar(45) NOT NULL,
    	PRIMARY KEY(idDepartamento)
);
    
CREATE TABLE desafio_maisprati_ilegra_bd.TelefoneAlunos (
	idTelefoneAlunos int NOT NULL AUTO_INCREMENT,
    	idAluno int NOT NULL,
    	Numero VARCHAR(45) NOT NULL,
    	Tipo VARCHAR(45) NOT NULL,
    	PRIMARY KEY(idTelefoneAlunos)
);

CREATE TABLE desafio_maisprati_ilegra_bd.Cursos (  
	idCurso INT NOT NULL AUTO_INCREMENT,
	Nome VARCHAR(45) NOT NULL,
    	TipoCurso CHAR(1) CHECK (TipoCurso IN ('T' "Técnico", 'G' "Graduação", 'M' "Mestrado", 'D' "Doutorado")),
    	idDepartamento int,
    	Coordenador VARCHAR(45),
    	ViceCoordenador VARCHAR(45),
    	PRIMARY KEY(idCurso)
);
    
CREATE TABLE desafio_maisprati_ilegra_bd.EnderecoAluno (
	idEnderecoAluno int NOT NULL AUTO_INCREMENT,
    	Rua VARCHAR(100) NOT NULL,
    	Cidade VARCHAR(45) NOT NULL, 
    	CEP VARCHAR(9) NOT NULL,
    	PRIMARY KEY(idEnderecoAluno)
);
        
CREATE TABLE desafio_maisprati_ilegra_bd.Aluno (
	idAluno INT NOT NULL AUTO_INCREMENT,
	Nome VARCHAR(45) UNIQUE NOT NULL,
	NumeroMatricula VARCHAR(45) UNIQUE NOT NULL,
	CPF VARCHAR(45) UNIQUE NOT NULL,
	idEnderecoAluno int,
	idTelefoneAluno int,
	DataNascimento VARCHAR(45),
    	Sexo CHAR(1) CHECK (SEXO IN ('F','M')),
    	idDepartamento int,
	idCurso int,
	PRIMARY KEY(idAluno),
    	FOREIGN KEY (idEnderecoAluno) REFERENCES EnderecoAluno(idEnderecoAluno),
    	FOREIGN KEY (idTelefoneAluno) REFERENCES TelefoneAlunos(idTelefoneAlunos),
    	FOREIGN KEY (idDepartamento) REFERENCES Departamento(idDepartamento),
    	FOREIGN KEY (idCurso) REFERENCES Cursos(idCurso)
	);
  
CREATE TABLE desafio_maisprati_ilegra_bd.Professor (
	idProfessor INT NOT NULL AUTO_INCREMENT,
	Nome VARCHAR(45) NOT NULL,
	CPF VARCHAR(11),
    	idDepartamento int,
    	Telefone int,
    	PRIMARY KEY(idProfessor),
    	FOREIGN KEY (idDepartamento) REFERENCES Departamento(idDepartamento)
);
    
CREATE TABLE desafio_maisprati_ilegra_bd.Disciplina (
	idDisciplina int NOT NULL AUTO_INCREMENT,
    	Nome VARCHAR(45) NOT NULL,
    	Descrição VARCHAR(100) NOT NULL,
    	Codigo VARCHAR(45) NOT NULL,
    	NumeroCreditos int NOT NULL,
    	idDepartamento int NOT NULL,
    	PRIMARY KEY(idDisciplina),
    	FOREIGN KEY (idDepartamento) REFERENCES Departamento(idDepartamento)
);

CREATE TABLE desafio_maisprati_ilegra_bd.Oferta (
	idOferta int NOT NULL AUTO_INCREMENT,
	PRofessor VARCHAR(45) NOT NULL,
    	Horario VARCHAR(100) NOT NULL,
    	PRIMARY KEY(idOferta)   
);


    
    